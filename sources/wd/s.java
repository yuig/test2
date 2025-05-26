package wd;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class s implements nd.f {
    @Override // nd.f
    public final int a(InputStream inputStream, qd.i iVar) {
        int f13 = new k6.g(inputStream).f(1, "Orientation");
        if (f13 == 0) {
            return -1;
        }
        return f13;
    }

    @Override // nd.f
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // nd.f
    public final int c(ByteBuffer byteBuffer, qd.i iVar) {
        AtomicReference atomicReference = he.c.f68939a;
        return a(new he.a(byteBuffer), iVar);
    }

    @Override // nd.f
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
