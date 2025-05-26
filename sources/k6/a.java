package k6;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f78341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f78342b;

    public a(f fVar) {
        this.f78342b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j13, byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        if (j13 < 0) {
            return -1;
        }
        try {
            long j14 = this.f78341a;
            f fVar = this.f78342b;
            if (j14 != j13) {
                if (j14 >= 0 && j13 >= j14 + fVar.f78345a.available()) {
                    return -1;
                }
                fVar.c(j13);
                this.f78341a = j13;
            }
            if (i14 > fVar.f78345a.available()) {
                i14 = fVar.f78345a.available();
            }
            int read = fVar.read(bArr, i13, i14);
            if (read >= 0) {
                this.f78341a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f78341a = -1L;
        return -1;
    }
}
