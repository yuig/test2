package c0;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class b0 implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f24201b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f24200a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f24202c = new HashSet();

    public b0(n0 n0Var) {
        this.f24201b = n0Var;
    }

    @Override // c0.n0
    public j0 H1() {
        return this.f24201b.H1();
    }

    @Override // c0.n0
    public final int S0() {
        return this.f24201b.S0();
    }

    @Override // c0.n0
    public final m0[] W0() {
        return this.f24201b.W0();
    }

    public final void a(a0 a0Var) {
        synchronized (this.f24200a) {
            this.f24202c.add(a0Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f24201b.close();
        synchronized (this.f24200a) {
            hashSet = new HashSet(this.f24202c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a(this);
        }
    }

    @Override // c0.n0
    public final Image getImage() {
        return this.f24201b.getImage();
    }

    @Override // c0.n0
    public int i() {
        return this.f24201b.i();
    }

    @Override // c0.n0
    public int j() {
        return this.f24201b.j();
    }
}
