package h7;

import androidx.media3.datasource.cache.Cache$CacheException;
import d7.n0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f67853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67855c;

    /* renamed from: d, reason: collision with root package name */
    public g7.i f67856d;

    /* renamed from: e, reason: collision with root package name */
    public long f67857e;

    /* renamed from: f, reason: collision with root package name */
    public File f67858f;

    /* renamed from: g, reason: collision with root package name */
    public OutputStream f67859g;

    /* renamed from: h, reason: collision with root package name */
    public long f67860h;

    /* renamed from: i, reason: collision with root package name */
    public long f67861i;

    /* renamed from: j, reason: collision with root package name */
    public u f67862j;

    public c(a aVar, long j13, int i13) {
        bf.b.s("fragmentSize must be positive or C.LENGTH_UNSET.", j13 > 0 || j13 == -1);
        if (j13 != -1 && j13 < 2097152) {
            d7.u.g("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f67853a = aVar;
        this.f67854b = j13 == -1 ? Long.MAX_VALUE : j13;
        this.f67855c = i13;
    }

    public final void a() {
        OutputStream outputStream = this.f67859g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            n0.g(this.f67859g);
            this.f67859g = null;
            File file = this.f67858f;
            this.f67858f = null;
            long j13 = this.f67860h;
            w wVar = (w) this.f67853a;
            synchronized (wVar) {
                if (file.exists()) {
                    if (j13 == 0) {
                        file.delete();
                        return;
                    }
                    x b13 = x.b(file, j13, -9223372036854775807L, wVar.f67938c);
                    b13.getClass();
                    n l13 = wVar.f67938c.l(b13.f67892a);
                    l13.getClass();
                    bf.b.t(l13.c(b13.f67893b, b13.f67894c));
                    long a13 = r.a(l13.f67914e);
                    if (a13 != -1) {
                        bf.b.t(b13.f67893b + b13.f67894c <= a13);
                    }
                    if (wVar.f67939d != null) {
                        try {
                            wVar.f67939d.d(file.getName(), b13.f67894c, b13.f67897f);
                        } catch (IOException e13) {
                            throw new Cache$CacheException(e13);
                        }
                    }
                    wVar.b(b13);
                    try {
                        wVar.f67938c.E();
                        wVar.notifyAll();
                    } catch (IOException e14) {
                        throw new Cache$CacheException(e14);
                    }
                }
            }
        } catch (Throwable th3) {
            n0.g(this.f67859g);
            this.f67859g = null;
            File file2 = this.f67858f;
            this.f67858f = null;
            file2.delete();
            throw th3;
        }
    }

    public final void b(g7.i iVar) {
        File c13;
        long j13 = iVar.f63792g;
        long min = j13 == -1 ? -1L : Math.min(j13 - this.f67861i, this.f67857e);
        a aVar = this.f67853a;
        String str = iVar.f63793h;
        int i13 = n0.f53866a;
        long j14 = iVar.f63791f + this.f67861i;
        w wVar = (w) aVar;
        synchronized (wVar) {
            try {
                wVar.d();
                n l13 = wVar.f67938c.l(str);
                l13.getClass();
                bf.b.t(l13.c(j14, min));
                if (!wVar.f67936a.exists()) {
                    w.e(wVar.f67936a);
                    wVar.r();
                }
                t tVar = (t) wVar.f67937b;
                if (min != -1) {
                    tVar.a(wVar, min);
                } else {
                    tVar.getClass();
                }
                File file = new File(wVar.f67936a, Integer.toString(wVar.f67941f.nextInt(10)));
                if (!file.exists()) {
                    w.e(file);
                }
                c13 = x.c(file, l13.f67910a, j14, System.currentTimeMillis());
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f67858f = c13;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f67858f);
        if (this.f67855c > 0) {
            u uVar = this.f67862j;
            if (uVar == null) {
                this.f67862j = new u(fileOutputStream, this.f67855c);
            } else {
                uVar.a(fileOutputStream);
            }
            this.f67859g = this.f67862j;
        } else {
            this.f67859g = fileOutputStream;
        }
        this.f67860h = 0L;
    }
}
