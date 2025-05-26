package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.y2;
import androidx.camera.core.impl.z2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class s1 {

    /* renamed from: d, reason: collision with root package name */
    public z2 f24337d;

    /* renamed from: e, reason: collision with root package name */
    public final z2 f24338e;

    /* renamed from: f, reason: collision with root package name */
    public z2 f24339f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.camera.core.impl.k f24340g;

    /* renamed from: h, reason: collision with root package name */
    public z2 f24341h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f24342i;

    /* renamed from: k, reason: collision with root package name */
    public androidx.camera.core.impl.j0 f24344k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.camera.core.impl.j0 f24345l;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f24334a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Object f24335b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public q1 f24336c = q1.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    public Matrix f24343j = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    public o2 f24346m = o2.a();

    /* renamed from: n, reason: collision with root package name */
    public o2 f24347n = o2.a();

    public s1(z2 z2Var) {
        this.f24338e = z2Var;
        this.f24339f = z2Var;
    }

    public final void A(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f24346m = (o2) list.get(0);
        if (list.size() > 1) {
            this.f24347n = (o2) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (androidx.camera.core.impl.z0 z0Var : ((o2) it.next()).b()) {
                if (z0Var.f17014j == null) {
                    z0Var.f17014j = getClass();
                }
            }
        }
    }

    public final void a(androidx.camera.core.impl.j0 j0Var, androidx.camera.core.impl.j0 j0Var2, z2 z2Var, z2 z2Var2) {
        synchronized (this.f24335b) {
            this.f24344k = j0Var;
            this.f24345l = j0Var2;
            this.f24334a.add(j0Var);
            if (j0Var2 != null) {
                this.f24334a.add(j0Var2);
            }
        }
        this.f24337d = z2Var;
        this.f24341h = z2Var2;
        this.f24339f = m(j0Var.g(), this.f24337d, this.f24341h);
        q();
    }

    public final int b() {
        return ((Integer) ((androidx.camera.core.impl.j1) this.f24339f).j(androidx.camera.core.impl.j1.f16882en, -1)).intValue();
    }

    public final androidx.camera.core.impl.j0 c() {
        androidx.camera.core.impl.j0 j0Var;
        synchronized (this.f24335b) {
            j0Var = this.f24344k;
        }
        return j0Var;
    }

    public final androidx.camera.core.impl.g0 d() {
        synchronized (this.f24335b) {
            try {
                androidx.camera.core.impl.j0 j0Var = this.f24344k;
                if (j0Var == null) {
                    return androidx.camera.core.impl.g0.f16842a;
                }
                return j0Var.d();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String e() {
        androidx.camera.core.impl.j0 c13 = c();
        com.bumptech.glide.d.s(c13, "No camera attached to use case: " + this);
        return c13.g().c();
    }

    public abstract z2 f(boolean z13, c3 c3Var);

    public final String g() {
        String str = (String) this.f24339f.j(h0.k.f66415uo, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(androidx.camera.core.impl.j0 j0Var, boolean z13) {
        int o13 = j0Var.g().o(((androidx.camera.core.impl.j1) this.f24339f).n());
        return (j0Var.m() || !z13) ? o13 : e0.u.h(-o13);
    }

    public final androidx.camera.core.impl.j0 i() {
        androidx.camera.core.impl.j0 j0Var;
        synchronized (this.f24335b) {
            j0Var = this.f24345l;
        }
        return j0Var;
    }

    public abstract HashSet j();

    public abstract u.a k(androidx.camera.core.impl.v0 v0Var);

    public final boolean l(androidx.camera.core.impl.j0 j0Var) {
        int intValue = ((Integer) ((androidx.camera.core.impl.j1) this.f24339f).j(androidx.camera.core.impl.j1.f16883fn, -1)).intValue();
        if (intValue == -1 || intValue == 0) {
            return false;
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return j0Var.g().d() == 0;
        }
        throw new AssertionError(a.a.d("Unknown mirrorMode: ", intValue));
    }

    public final z2 m(androidx.camera.core.impl.h0 h0Var, z2 z2Var, z2 z2Var2) {
        androidx.camera.core.impl.q1 c13;
        if (z2Var2 != null) {
            c13 = androidx.camera.core.impl.q1.k(z2Var2);
            c13.f16980a.remove(h0.k.f66415uo);
        } else {
            c13 = androidx.camera.core.impl.q1.c();
        }
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.j1.f16880cn;
        z2 z2Var3 = this.f24338e;
        boolean d2 = z2Var3.d(cVar);
        TreeMap treeMap = c13.f16980a;
        if (d2 || z2Var3.d(androidx.camera.core.impl.j1.f16884gn)) {
            androidx.camera.core.impl.c cVar2 = androidx.camera.core.impl.j1.f16888ln;
            if (treeMap.containsKey(cVar2)) {
                treeMap.remove(cVar2);
            }
        }
        androidx.camera.core.impl.c cVar3 = androidx.camera.core.impl.j1.f16888ln;
        if (z2Var3.d(cVar3)) {
            androidx.camera.core.impl.c cVar4 = androidx.camera.core.impl.j1.f16886jn;
            if (treeMap.containsKey(cVar4) && ((o0.b) z2Var3.f(cVar3)).f92747b != null) {
                treeMap.remove(cVar4);
            }
        }
        Iterator it = z2Var3.a().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.v0.z(c13, c13, z2Var3, (androidx.camera.core.impl.c) it.next());
        }
        if (z2Var != null) {
            for (androidx.camera.core.impl.c cVar5 : z2Var.a()) {
                if (!cVar5.f16809a.equals(h0.k.f66415uo.f16809a)) {
                    androidx.camera.core.impl.v0.z(c13, c13, z2Var, cVar5);
                }
            }
        }
        if (treeMap.containsKey(androidx.camera.core.impl.j1.f16884gn)) {
            androidx.camera.core.impl.c cVar6 = androidx.camera.core.impl.j1.f16880cn;
            if (treeMap.containsKey(cVar6)) {
                treeMap.remove(cVar6);
            }
        }
        androidx.camera.core.impl.c cVar7 = androidx.camera.core.impl.j1.f16888ln;
        if (treeMap.containsKey(cVar7) && ((o0.b) c13.f(cVar7)).f92748c != 0) {
            c13.s(z2.f17022tn, Boolean.TRUE);
        }
        return s(h0Var, k(c13));
    }

    public final void n() {
        this.f24336c = q1.ACTIVE;
        p();
    }

    public final void o() {
        Iterator it = this.f24334a.iterator();
        while (it.hasNext()) {
            ((r1) it.next()).h(this);
        }
    }

    public final void p() {
        int ordinal = this.f24336c.ordinal();
        HashSet hashSet = this.f24334a;
        if (ordinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).b(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((r1) it2.next()).o(this);
            }
        }
    }

    public void q() {
    }

    public void r() {
    }

    public abstract z2 s(androidx.camera.core.impl.h0 h0Var, y2 y2Var);

    public void t() {
    }

    public void u() {
    }

    public abstract androidx.camera.core.impl.k v(androidx.camera.core.impl.v0 v0Var);

    public abstract androidx.camera.core.impl.k w(androidx.camera.core.impl.k kVar, androidx.camera.core.impl.k kVar2);

    public void x() {
    }

    public void y(Rect rect) {
        this.f24342i = rect;
    }

    public final void z(androidx.camera.core.impl.j0 j0Var) {
        x();
        synchronized (this.f24335b) {
            try {
                androidx.camera.core.impl.j0 j0Var2 = this.f24344k;
                if (j0Var == j0Var2) {
                    this.f24334a.remove(j0Var2);
                    this.f24344k = null;
                }
                androidx.camera.core.impl.j0 j0Var3 = this.f24345l;
                if (j0Var == j0Var3) {
                    this.f24334a.remove(j0Var3);
                    this.f24345l = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f24340g = null;
        this.f24342i = null;
        this.f24339f = this.f24338e;
        this.f24337d = null;
        this.f24341h = null;
    }
}
