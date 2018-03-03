package com.guozhengzheng.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author guozheng.gz
 */
public interface InputStreamSource {

    /**
     * Return an {@link InputStream}.
     * <p>It is expected that each call creates a <i>fresh</i> stream.
     * <p>This requirement is particularly important when you consider an API such
     * as JavaMail, which needs to be able to read the stream multiple times when
     * creating mail attachments. For such a use case, it is <i>required</i>
     * that each {@code getInputStream()} call returns a fresh stream.
     * @return the input stream for the underlying resource (must not be {@code null})
     * @throws IOException if the stream could not be opened
     */
    InputStream getInputStream() throws IOException;

}
