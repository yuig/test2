package g7;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import d7.n0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class z implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f63855a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.c f63856b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63857c;

    /* renamed from: d, reason: collision with root package name */
    public long f63858d;

    public z(f fVar, h7.c cVar) {
        fVar.getClass();
        this.f63855a = fVar;
        cVar.getClass();
        this.f63856b = cVar;
    }

    @Override // g7.f
    public final void close() {
        h7.c cVar = this.f63856b;
        try {
            this.f63855a.close();
            if (this.f63857c) {
                this.f63857c = false;
                if (cVar.f67856d == null) {
                    return;
                }
                try {
                    cVar.a();
                } catch (IOException e13) {
                    throw new CacheDataSink$CacheDataSinkException(e13);
                }
            }
        } catch (Throwable th3) {
            if (this.f63857c) {
                this.f63857c = false;
                if (cVar.f67856d != null) {
                    try {
                        cVar.a();
                    } catch (IOException e14) {
                        throw new CacheDataSink$CacheDataSinkException(e14);
                    }
                }
            }
            throw th3;
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        long d2 = this.f63855a.d(iVar);
        this.f63858d = d2;
        if (d2 == 0) {
            return 0L;
        }
        if (iVar.f63792g == -1 && d2 != -1) {
            iVar = iVar.e(0L, d2);
        }
        this.f63857c = true;
        h7.c cVar = this.f63856b;
        cVar.getClass();
        iVar.f63793h.getClass();
        if (iVar.f63792g == -1 && iVar.c(2)) {
            cVar.f67856d = null;
        } else {
            cVar.f67856d = iVar;
            cVar.f67857e = iVar.c(4) ? cVar.f67854b : Long.MAX_VALUE;
            cVar.f67861i = 0L;
            try {
                cVar.b(iVar);
            } catch (IOException e13) {
                throw new CacheDataSink$CacheDataSinkException(e13);
            }
        }
        return this.f63858d;
    }

    @Override // g7.f
    public final Map e() {
        return this.f63855a.e();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        this.f63855a.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        return this.f63855a.r();
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (this.f63858d == 0) {
            return -1;
        }
        int read = this.f63855a.read(bArr, i13, i14);
        if (read > 0) {
            h7.c cVar = this.f63856b;
            i iVar = cVar.f67856d;
            if (iVar != null) {
                int i15 = 0;
                while (i15 < read) {
                    try {
                        if (cVar.f67860h == cVar.f67857e) {
                            cVar.a();
                            cVar.b(iVar);
                        }
                        int min = (int) Math.min(read - i15, cVar.f67857e - cVar.f67860h);
                        OutputStream outputStream = cVar.f67859g;
                        int i16 = n0.f53866a;
                        outputStream.write(bArr, i13 + i15, min);
                        i15 += min;
                        long j13 = min;
                        cVar.f67860h += j13;
                        cVar.f67861i += j13;
                    } catch (IOException e13) {
                        throw new CacheDataSink$CacheDataSinkException(e13);
                    }
                }
            }
            long j14 = this.f63858d;
            if (j14 != -1) {
                this.f63858d = j14 - read;
            }
        }
        return read;
    }
}
