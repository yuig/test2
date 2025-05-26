package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionException;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public abstract class AbstractCompressionCodec implements CompressionCodec {

    public interface StreamWrapper {
        OutputStream wrap(OutputStream outputStream);
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public final byte[] compress(byte[] bArr) {
        Assert.notNull(bArr, "payload cannot be null.");
        try {
            return doCompress(bArr);
        } catch (IOException e13) {
            throw new CompressionException("Unable to compress payload.", e13);
        }
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public final byte[] decompress(byte[] bArr) {
        Assert.notNull(bArr, "compressed bytes cannot be null.");
        try {
            return doDecompress(bArr);
        } catch (IOException e13) {
            throw new CompressionException("Unable to decompress bytes.", e13);
        }
    }

    public abstract byte[] doCompress(byte[] bArr);

    public abstract byte[] doDecompress(byte[] bArr);

    public byte[] readAndClose(InputStream inputStream) {
        byte[] bArr = new byte[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(BitmapUtils.BITMAP_TO_JPEG_SIZE);
        try {
            int read = inputStream.read(bArr);
            while (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            Objects.nullSafeClose(inputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            Objects.nullSafeClose(inputStream);
            throw th3;
        }
    }

    public byte[] writeAndClose(byte[] bArr, StreamWrapper streamWrapper) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(BitmapUtils.BITMAP_TO_JPEG_SIZE);
        OutputStream wrap = streamWrapper.wrap(byteArrayOutputStream);
        try {
            wrap.write(bArr);
            wrap.flush();
            Objects.nullSafeClose(wrap);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            Objects.nullSafeClose(wrap);
            throw th3;
        }
    }
}
