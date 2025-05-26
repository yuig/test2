package k6;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f78345a.mark(Integer.MAX_VALUE);
    }

    public final void c(long j13) {
        int i13 = this.f78347c;
        if (i13 > j13) {
            this.f78347c = 0;
            this.f78345a.reset();
        } else {
            j13 -= i13;
        }
        a((int) j13);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f78345a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
