package c0;

import a.jg;
import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import v.z1;

/* loaded from: classes2.dex */
public final class r0 implements androidx.camera.core.impl.l1, a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24317a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f24318b;

    /* renamed from: c, reason: collision with root package name */
    public int f24319c;

    /* renamed from: d, reason: collision with root package name */
    public final a.z0 f24320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24321e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.camera.core.impl.l1 f24322f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.camera.core.impl.k1 f24323g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f24324h;

    /* renamed from: i, reason: collision with root package name */
    public final LongSparseArray f24325i;

    /* renamed from: j, reason: collision with root package name */
    public final LongSparseArray f24326j;

    /* renamed from: k, reason: collision with root package name */
    public int f24327k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f24328l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f24329m;

    public r0(int i13, int i14, int i15, int i16) {
        z1 z1Var = new z1(ImageReader.newInstance(i13, i14, i15, i16));
        this.f24317a = new Object();
        this.f24318b = new q0(this, 0);
        this.f24319c = 0;
        this.f24320d = new a.z0(this, 1);
        this.f24321e = false;
        this.f24325i = new LongSparseArray();
        this.f24326j = new LongSparseArray();
        this.f24329m = new ArrayList();
        this.f24322f = z1Var;
        this.f24327k = 0;
        this.f24328l = new ArrayList(s());
    }

    @Override // androidx.camera.core.impl.l1
    public final n0 F() {
        synchronized (this.f24317a) {
            try {
                if (this.f24328l.isEmpty()) {
                    return null;
                }
                if (this.f24327k >= this.f24328l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f24328l;
                int i13 = this.f24327k;
                this.f24327k = i13 + 1;
                n0 n0Var = (n0) arrayList.get(i13);
                this.f24329m.add(n0Var);
                return n0Var;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // c0.a0
    public final void a(n0 n0Var) {
        synchronized (this.f24317a) {
            b(n0Var);
        }
    }

    public final void b(n0 n0Var) {
        synchronized (this.f24317a) {
            try {
                int indexOf = this.f24328l.indexOf(n0Var);
                if (indexOf >= 0) {
                    this.f24328l.remove(indexOf);
                    int i13 = this.f24327k;
                    if (indexOf <= i13) {
                        this.f24327k = i13 - 1;
                    }
                }
                this.f24329m.remove(n0Var);
                if (this.f24319c > 0) {
                    d(this.f24322f);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(d1 d1Var) {
        androidx.camera.core.impl.k1 k1Var;
        Executor executor;
        synchronized (this.f24317a) {
            try {
                if (this.f24328l.size() < s()) {
                    d1Var.a(this);
                    this.f24328l.add(d1Var);
                    k1Var = this.f24323g;
                    executor = this.f24324h;
                } else {
                    kh2.m0.p("TAG", "Maximum image number reached.");
                    d1Var.close();
                    k1Var = null;
                    executor = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (k1Var != null) {
            if (executor != null) {
                executor.execute(new jg(13, this, k1Var));
            } else {
                k1Var.b(this);
            }
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final void close() {
        synchronized (this.f24317a) {
            try {
                if (this.f24321e) {
                    return;
                }
                Iterator it = new ArrayList(this.f24328l).iterator();
                while (it.hasNext()) {
                    ((n0) it.next()).close();
                }
                this.f24328l.clear();
                this.f24322f.close();
                this.f24321e = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(androidx.camera.core.impl.l1 l1Var) {
        n0 n0Var;
        synchronized (this.f24317a) {
            try {
                if (this.f24321e) {
                    return;
                }
                int size = this.f24326j.size() + this.f24328l.size();
                if (size >= l1Var.s()) {
                    kh2.m0.p("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        n0Var = l1Var.F();
                        if (n0Var != null) {
                            this.f24319c--;
                            size++;
                            this.f24326j.put(n0Var.H1().h(), n0Var);
                            e();
                        }
                    } catch (IllegalStateException e13) {
                        if (kh2.m0.G0(3, "MetadataImageReader")) {
                            Log.d("MetadataImageReader", "Failed to acquire next image.", e13);
                        }
                        n0Var = null;
                    }
                    if (n0Var == null || this.f24319c <= 0) {
                        break;
                    }
                } while (size < l1Var.s());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e() {
        synchronized (this.f24317a) {
            try {
                for (int size = this.f24325i.size() - 1; size >= 0; size--) {
                    j0 j0Var = (j0) this.f24325i.valueAt(size);
                    long h10 = j0Var.h();
                    n0 n0Var = (n0) this.f24326j.get(h10);
                    if (n0Var != null) {
                        this.f24326j.remove(h10);
                        this.f24325i.removeAt(size);
                        c(new d1(n0Var, null, j0Var));
                    }
                }
                f();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f() {
        synchronized (this.f24317a) {
            try {
                if (this.f24326j.size() != 0 && this.f24325i.size() != 0) {
                    long keyAt = this.f24326j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f24325i.keyAt(0);
                    com.bumptech.glide.d.h(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f24326j.size() - 1; size >= 0; size--) {
                            if (this.f24326j.keyAt(size) < keyAt2) {
                                ((n0) this.f24326j.valueAt(size)).close();
                                this.f24326j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f24325i.size() - 1; size2 >= 0; size2--) {
                            if (this.f24325i.keyAt(size2) < keyAt) {
                                this.f24325i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int i() {
        int i13;
        synchronized (this.f24317a) {
            i13 = this.f24322f.i();
        }
        return i13;
    }

    @Override // androidx.camera.core.impl.l1
    public final int j() {
        int j13;
        synchronized (this.f24317a) {
            j13 = this.f24322f.j();
        }
        return j13;
    }

    @Override // androidx.camera.core.impl.l1
    public final n0 l() {
        synchronized (this.f24317a) {
            try {
                if (this.f24328l.isEmpty()) {
                    return null;
                }
                if (this.f24327k >= this.f24328l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < this.f24328l.size() - 1; i13++) {
                    if (!this.f24329m.contains(this.f24328l.get(i13))) {
                        arrayList.add((n0) this.f24328l.get(i13));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n0) it.next()).close();
                }
                int size = this.f24328l.size();
                ArrayList arrayList2 = this.f24328l;
                this.f24327k = size;
                n0 n0Var = (n0) arrayList2.get(size - 1);
                this.f24329m.add(n0Var);
                return n0Var;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int m() {
        int m13;
        synchronized (this.f24317a) {
            m13 = this.f24322f.m();
        }
        return m13;
    }

    @Override // androidx.camera.core.impl.l1
    public final void o() {
        synchronized (this.f24317a) {
            this.f24322f.o();
            this.f24323g = null;
            this.f24324h = null;
            this.f24319c = 0;
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int s() {
        int s13;
        synchronized (this.f24317a) {
            s13 = this.f24322f.s();
        }
        return s13;
    }

    @Override // androidx.camera.core.impl.l1
    public final void v(androidx.camera.core.impl.k1 k1Var, Executor executor) {
        synchronized (this.f24317a) {
            k1Var.getClass();
            this.f24323g = k1Var;
            executor.getClass();
            this.f24324h = executor;
            this.f24322f.v(this.f24320d, executor);
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final Surface z() {
        Surface z13;
        synchronized (this.f24317a) {
            z13 = this.f24322f.z();
        }
        return z13;
    }
}
