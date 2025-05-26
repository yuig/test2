package wt1;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e0 implements wk1.e {

    /* renamed from: e, reason: collision with root package name */
    public boolean f131107e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f131108f;

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f131103a = null;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f131104b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final f0 f131105c = new f0(this);

    /* renamed from: d, reason: collision with root package name */
    public final uk2.f f131106d = cb.r("create(...)");

    /* renamed from: g, reason: collision with root package name */
    public final uk2.f f131109g = cb.r("create(...)");

    @Override // vq0.f
    public void J1() {
        if (this.f131107e) {
            this.f131107e = false;
            this.f131106d.c(new sq0.t(0, this.f131104b.size()));
            this.f131109g.c(new v());
        }
    }

    @Override // sq0.e0
    public final uj2.q K1() {
        return this.f131106d;
    }

    @Override // yq0.a0
    public final yk1.m S(int i13) {
        return this.f131105c.S(i13);
    }

    @Override // vq0.f
    public Set X1() {
        return this.f131105c.f131112c;
    }

    @Override // sq0.e0
    public final int a() {
        return d().size();
    }

    @Override // vq0.f
    public final void clear() {
        ArrayList arrayList = this.f131104b;
        int size = arrayList.size();
        arrayList.clear();
        if (!this.f131107e || size <= 0) {
            return;
        }
        this.f131106d.c(new sq0.t(0, size));
        this.f131109g.c(new u(null, 0, size));
    }

    @Override // vq0.e, qr0.d
    public final List d() {
        return this.f131107e ? CollectionsKt.F0(this.f131104b) : q0.f80391a;
    }

    public final void g(int i13, Object obj) {
        this.f131104b.add(i13, obj);
        if (this.f131107e) {
            this.f131106d.c(new sq0.r(i13, 1));
            this.f131109g.c(new m(null, kotlin.collections.e0.b(obj), i13));
        }
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        if (r(i13)) {
            return this.f131104b.get(i13);
        }
        return null;
    }

    @Override // vq0.f
    public void i2() {
        s sVar = new s();
        uk2.f fVar = this.f131109g;
        fVar.c(sVar);
        fVar.c(new p(d()));
        fVar.c(new y(null, d()));
    }

    @Override // vq0.f
    public final void j1() {
        n();
    }

    @Override // vq0.e
    public final void j2(Object obj) {
        this.f131104b.add(obj);
        if (this.f131107e) {
            this.f131106d.c(new sq0.r(d().size() - 1, 1));
            this.f131109g.c(new m(null, kotlin.collections.e0.b(obj), d().size() - 1));
        }
    }

    public final void k(List itemsToSet) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        ArrayList arrayList = this.f131104b;
        int size = arrayList.size();
        int size2 = itemsToSet.size();
        Function2 function2 = this.f131103a;
        androidx.recyclerview.widget.w wVar = function2 != null ? (androidx.recyclerview.widget.w) function2.invoke(arrayList, itemsToSet) : null;
        arrayList.clear();
        arrayList.addAll(itemsToSet);
        if (this.f131107e) {
            uk2.f fVar = this.f131109g;
            uk2.f fVar2 = this.f131106d;
            if (wVar != null) {
                fVar.c(new y(wVar, itemsToSet));
                fVar2.c(new sq0.q(wVar));
                return;
            }
            int i13 = size - size2;
            if (i13 > 0) {
                fVar2.c(new sq0.t(size2, Math.abs(i13)));
                if (size2 > 0) {
                    fVar2.c(new sq0.p(0, size2));
                }
            } else if (i13 < 0) {
                fVar2.c(new sq0.r(size, Math.abs(i13)));
                if (size > 0) {
                    fVar2.c(new sq0.p(0, size));
                }
            } else if (i13 == 0 && size > 0) {
                fVar2.c(new sq0.p(0, size));
            }
            fVar.c(new v());
            fVar.c(new y(null, itemsToSet));
        }
    }

    @Override // wt1.d0
    public final uj2.q m() {
        return this.f131109g;
    }

    public void n() {
        if (this.f131107e) {
            return;
        }
        this.f131107e = true;
        this.f131106d.c(new sq0.r(0, a()));
        k kVar = new k();
        uk2.f fVar = this.f131109g;
        fVar.c(kVar);
        fVar.c(new p(d()));
        fVar.c(new y(null, d()));
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        r(i13);
        ArrayList arrayList = this.f131104b;
        arrayList.add(i14, arrayList.remove(i13));
        if (this.f131107e) {
            this.f131106d.c(new sq0.s(i13, i14));
            this.f131109g.c(new r(null, arrayList.get(i14), i13, i14));
        }
    }

    @Override // vq0.f
    public void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f131105c.o(i13, viewBinderInstance);
    }

    @Override // yq0.a0
    public final void p(int i13, yk1.n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f131105c.p(i13, view);
    }

    public final boolean r(int i13) {
        boolean z13 = i13 >= 0 && i13 < a();
        if (!z13) {
            vb0.j.f125466a.G(a.a.d("Invalid pos ", i13), new Object[0]);
        }
        return z13;
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        r(i13);
        this.f131104b.remove(i13);
        if (this.f131107e) {
            this.f131106d.c(new sq0.t(i13, 1));
            this.f131109g.c(new u(null, i13, i13 + 1));
        }
    }

    @Override // wk1.e
    public final boolean s() {
        return this.f131108f;
    }

    @Override // wk1.e
    public final void t() {
        if (this.f131108f) {
            this.f131108f = false;
            this.f131106d.c(new sq0.r(0, a()));
            this.f131109g.c(new z());
        }
    }

    @Override // vq0.f
    public boolean t0() {
        return (this.f131107e || this.f131108f) ? false : true;
    }

    @Override // vq0.e
    public final void u1(int i13, Object obj) {
        r(i13);
        this.f131104b.set(i13, obj);
        if (this.f131107e) {
            this.f131106d.c(new sq0.p(i13, 1));
            this.f131109g.c(new b0(null, i13, obj));
        }
    }

    @Override // wk1.e
    public final void y() {
        if (this.f131108f) {
            return;
        }
        this.f131106d.c(new sq0.t(0, a()));
        this.f131109g.c(new j());
        this.f131108f = true;
    }
}
