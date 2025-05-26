package k7;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final g f78463a;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f78467e;

    /* renamed from: f, reason: collision with root package name */
    public final f[] f78468f;

    /* renamed from: g, reason: collision with root package name */
    public int f78469g;

    /* renamed from: h, reason: collision with root package name */
    public int f78470h;

    /* renamed from: i, reason: collision with root package name */
    public e f78471i;

    /* renamed from: j, reason: collision with root package name */
    public DecoderException f78472j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f78473k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f78474l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f78464b = new Object();

    /* renamed from: m, reason: collision with root package name */
    public long f78475m = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f78465c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f78466d = new ArrayDeque();

    public h(e[] eVarArr, f[] fVarArr) {
        this.f78467e = eVarArr;
        this.f78469g = eVarArr.length;
        for (int i13 = 0; i13 < this.f78469g; i13++) {
            this.f78467e[i13] = g();
        }
        this.f78468f = fVarArr;
        this.f78470h = fVarArr.length;
        for (int i14 = 0; i14 < this.f78470h; i14++) {
            this.f78468f[i14] = h();
        }
        g gVar = new g(this);
        this.f78463a = gVar;
        gVar.start();
    }

    @Override // k7.d
    public final void a() {
        synchronized (this.f78464b) {
            this.f78474l = true;
            this.f78464b.notify();
        }
        try {
            this.f78463a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // k7.d
    public final void d(long j13) {
        boolean z13;
        synchronized (this.f78464b) {
            try {
                if (this.f78469g != this.f78467e.length && !this.f78473k) {
                    z13 = false;
                    bf.b.t(z13);
                    this.f78475m = j13;
                }
                z13 = true;
                bf.b.t(z13);
                this.f78475m = j13;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // k7.d
    public final Object f() {
        e eVar;
        synchronized (this.f78464b) {
            try {
                DecoderException decoderException = this.f78472j;
                if (decoderException != null) {
                    throw decoderException;
                }
                bf.b.t(this.f78471i == null);
                int i13 = this.f78469g;
                if (i13 == 0) {
                    eVar = null;
                } else {
                    e[] eVarArr = this.f78467e;
                    int i14 = i13 - 1;
                    this.f78469g = i14;
                    eVar = eVarArr[i14];
                }
                this.f78471i = eVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eVar;
    }

    @Override // k7.d
    public final void flush() {
        synchronized (this.f78464b) {
            try {
                this.f78473k = true;
                e eVar = this.f78471i;
                if (eVar != null) {
                    eVar.n();
                    int i13 = this.f78469g;
                    this.f78469g = i13 + 1;
                    this.f78467e[i13] = eVar;
                    this.f78471i = null;
                }
                while (!this.f78465c.isEmpty()) {
                    e eVar2 = (e) this.f78465c.removeFirst();
                    eVar2.n();
                    int i14 = this.f78469g;
                    this.f78469g = i14 + 1;
                    this.f78467e[i14] = eVar2;
                }
                while (!this.f78466d.isEmpty()) {
                    ((f) this.f78466d.removeFirst()).o();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract e g();

    public abstract f h();

    public abstract DecoderException i(Throwable th3);

    public abstract DecoderException j(e eVar, f fVar, boolean z13);

    public final boolean k() {
        boolean z13;
        DecoderException i13;
        synchronized (this.f78464b) {
            while (!this.f78474l && (this.f78465c.isEmpty() || this.f78470h <= 0)) {
                try {
                    this.f78464b.wait();
                } finally {
                }
            }
            if (this.f78474l) {
                return false;
            }
            e eVar = (e) this.f78465c.removeFirst();
            f[] fVarArr = this.f78468f;
            int i14 = this.f78470h - 1;
            this.f78470h = i14;
            f fVar = fVarArr[i14];
            boolean z14 = this.f78473k;
            this.f78473k = false;
            if (eVar.i(4)) {
                fVar.e(4);
            } else {
                fVar.f78460c = eVar.f78456g;
                if (eVar.i(134217728)) {
                    fVar.e(134217728);
                }
                long j13 = eVar.f78456g;
                synchronized (this.f78464b) {
                    long j14 = this.f78475m;
                    if (j14 != -9223372036854775807L && j13 < j14) {
                        z13 = false;
                    }
                    z13 = true;
                }
                if (!z13) {
                    fVar.f78461d = true;
                }
                try {
                    i13 = j(eVar, fVar, z14);
                } catch (OutOfMemoryError e13) {
                    i13 = i(e13);
                } catch (RuntimeException e14) {
                    i13 = i(e14);
                }
                if (i13 != null) {
                    synchronized (this.f78464b) {
                        this.f78472j = i13;
                    }
                    return false;
                }
            }
            synchronized (this.f78464b) {
                try {
                    if (this.f78473k) {
                        fVar.o();
                    } else if (fVar.f78461d) {
                        fVar.o();
                    } else {
                        this.f78466d.addLast(fVar);
                    }
                    eVar.n();
                    int i15 = this.f78469g;
                    this.f78469g = i15 + 1;
                    this.f78467e[i15] = eVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // k7.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final f c() {
        synchronized (this.f78464b) {
            try {
                DecoderException decoderException = this.f78472j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f78466d.isEmpty()) {
                    return null;
                }
                return (f) this.f78466d.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // k7.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(e eVar) {
        synchronized (this.f78464b) {
            try {
                DecoderException decoderException = this.f78472j;
                if (decoderException != null) {
                    throw decoderException;
                }
                bf.b.i(eVar == this.f78471i);
                this.f78465c.addLast(eVar);
                if (!this.f78465c.isEmpty() && this.f78470h > 0) {
                    this.f78464b.notify();
                }
                this.f78471i = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void n(f fVar) {
        synchronized (this.f78464b) {
            fVar.n();
            int i13 = this.f78470h;
            this.f78470h = i13 + 1;
            this.f78468f[i13] = fVar;
            if (!this.f78465c.isEmpty() && this.f78470h > 0) {
                this.f78464b.notify();
            }
        }
    }
}
