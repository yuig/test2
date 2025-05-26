package nd;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.google.crypto.tink.shaded.protobuf.u;
import il.b3;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class g implements wd.i {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f90414a;

    public /* synthetic */ g(InputStream inputStream) {
        this.f90414a = inputStream;
    }

    @Override // wd.i
    public int a() {
        return (e() << 8) | e();
    }

    public b3 b() {
        InputStream inputStream = this.f90414a;
        try {
            return b3.F(inputStream, u.a());
        } finally {
            inputStream.close();
        }
    }

    @Override // wd.i
    public int d(int i13, byte[] bArr) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13 && (i15 = this.f90414a.read(bArr, i14, i13 - i14)) != -1) {
            i14 += i15;
        }
        if (i14 == 0 && i15 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i14;
    }

    @Override // wd.i
    public short e() {
        int read = this.f90414a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // wd.i
    public long skip(long j13) {
        if (j13 < 0) {
            return 0L;
        }
        long j14 = j13;
        while (j14 > 0) {
            InputStream inputStream = this.f90414a;
            long skip = inputStream.skip(j14);
            if (skip > 0) {
                j14 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j14--;
            }
        }
        return j13 - j14;
    }
}
