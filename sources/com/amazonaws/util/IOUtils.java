package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public enum IOUtils {
    ;

    private static final int BUFFER_SIZE = 4096;
    private static final Log logger = LogFactory.a(IOUtils.class);

    public static void closeQuietly(Closeable closeable, Log log) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e13) {
                if (logger.b()) {
                    logger.a("Ignore failure in closing the Closeable", e13);
                }
            }
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[BUFFER_SIZE];
        long j13 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= -1) {
                return j13;
            }
            outputStream.write(bArr, 0, read);
            j13 += read;
        }
    }

    public static void release(Closeable closeable, Log log) {
        closeQuietly(closeable, log);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th3) {
            byteArrayOutputStream.close();
            throw th3;
        }
    }

    public static String toString(InputStream inputStream) {
        return new String(toByteArray(inputStream), StringUtils.f29048a);
    }
}
