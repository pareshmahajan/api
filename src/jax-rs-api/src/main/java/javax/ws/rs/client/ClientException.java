/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package javax.ws.rs.client;

/**
 * A client-side processing runtime exception.
 *
 * The exception is thrown during HTTP request invocation processing,
 * to signal a failure to process the HTTP request or response. The exception
 * message or nested {@link Throwable} cause SHOULD contain additional information
 * about the reason of the processing failure.
 * <p>
 * Note that the exception is used to indicate client-side processing errors. It is
 * not used to indicate errors received in a response from a server. For the cases
 * when a response returned by a server does not contain a
 * {@link javax.ws.rs.core.Response.Status.Family#SUCCESSFUL successful} response
 * status code a {@link javax.ws.rs.WebApplicationException} or one of it's sub-classes
 * is used, depending on the actual value of the returned response status code.
 * </p>
 *
 * @author Marek Potociar
 * @since 2.0
 */
public class ClientException extends RuntimeException {

    private static final long serialVersionUID = -4232431597816056514L;

    /**
     * Constructs a new client-side runtime exception with the specified cause
     * and a detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of {@code cause}).
     * This constructor is useful for runtime exceptions that are little more
     * than wrappers for other throwables.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method). (A {@code null} value is permitted,
     *              and indicates that the cause is nonexistent or unknown.)
     */
    public ClientException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new client-side runtime exception with the specified detail
     * message and cause.
     * <p/>
     * Note that the detail message associated with {@code cause} is <i>not</i>
     * automatically incorporated in this runtime exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method). (A {@code null} value is permitted,
     *                and indicates that the cause is nonexistent or unknown.)
     */
    public ClientException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new client-side runtime exception with the specified detail
     * message. The cause is not initialized, and may subsequently be initialized
     * by a call to {@link #initCause}.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     */
    public ClientException(final String message) {
        super(message);
    }
}
