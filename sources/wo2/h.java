package wo2;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f130703b;

    public /* synthetic */ h(l lVar, int i13) {
        this.f130702a = i13;
        this.f130703b = lVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i13 = this.f130702a;
        l lVar = this.f130703b;
        switch (i13) {
            case 0:
                return (int) Math.min(((j) lVar).f130711b, Integer.MAX_VALUE);
            default:
                y yVar = (y) lVar;
                if (yVar.f130751c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(yVar.f130750b.f130711b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f130702a) {
            case 0:
                break;
            default:
                ((y) this.f130703b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i13 = this.f130702a;
        l lVar = this.f130703b;
        switch (i13) {
            case 0:
                j jVar = (j) lVar;
                if (jVar.f130711b > 0) {
                    return jVar.readByte() & 255;
                }
                return -1;
            default:
                y yVar = (y) lVar;
                if (yVar.f130751c) {
                    throw new IOException("closed");
                }
                j jVar2 = yVar.f130750b;
                if (jVar2.f130711b == 0 && yVar.f130749a.read(jVar2, 8192L) == -1) {
                    return -1;
                }
                return jVar2.readByte() & 255;
        }
    }

    public final String toString() {
        int i13 = this.f130702a;
        l lVar = this.f130703b;
        switch (i13) {
            case 0:
                return ((j) lVar) + ".inputStream()";
            default:
                return ((y) lVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i13, int i14) {
        int i15 = this.f130702a;
        l lVar = this.f130703b;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                return ((j) lVar).read(sink, i13, i14);
            default:
                Intrinsics.checkNotNullParameter(sink, "data");
                y yVar = (y) lVar;
                if (!yVar.f130751c) {
                    b.b(sink.length, i13, i14);
                    j jVar = yVar.f130750b;
                    if (jVar.f130711b == 0 && yVar.f130749a.read(jVar, 8192L) == -1) {
                        return -1;
                    }
                    return jVar.read(sink, i13, i14);
                }
                throw new IOException("closed");
        }
    }
}
