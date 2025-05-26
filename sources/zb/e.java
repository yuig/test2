package zb;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final b f141496c;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.app.d f141498e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f141494a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f141495b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f141497d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f141499f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f141500g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f141501h = -1.0f;

    public e(List list) {
        b dVar;
        if (list.isEmpty()) {
            dVar = new eb.d();
        } else {
            dVar = list.size() == 1 ? new d(list) : new c(list);
        }
        this.f141496c = dVar;
    }

    public final void a(a aVar) {
        this.f141494a.add(aVar);
    }

    public final kc.a b() {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        return this.f141496c.b();
    }

    public float c() {
        if (this.f141501h == -1.0f) {
            this.f141501h = this.f141496c.e();
        }
        return this.f141501h;
    }

    public final float d() {
        kc.a b13 = b();
        if (b13 == null || b13.c()) {
            return 0.0f;
        }
        return b13.f79106d.getInterpolation(e());
    }

    public final float e() {
        if (this.f141495b) {
            return 0.0f;
        }
        kc.a b13 = b();
        if (b13.c()) {
            return 0.0f;
        }
        return (this.f141497d - b13.b()) / (b13.a() - b13.b());
    }

    public final float f() {
        return this.f141497d;
    }

    public Object g() {
        Interpolator interpolator;
        float e13 = e();
        if (this.f141498e == null && this.f141496c.a(e13)) {
            return this.f141499f;
        }
        kc.a b13 = b();
        Interpolator interpolator2 = b13.f79107e;
        Object h10 = (interpolator2 == null || (interpolator = b13.f79108f) == null) ? h(b13, d()) : i(b13, e13, interpolator2.getInterpolation(e13), interpolator.getInterpolation(e13));
        this.f141499f = h10;
        return h10;
    }

    public abstract Object h(kc.a aVar, float f13);

    public Object i(kc.a aVar, float f13, float f14, float f15) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void j() {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f141494a;
            if (i13 >= arrayList.size()) {
                com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
                return;
            } else {
                ((a) arrayList.get(i13)).a();
                i13++;
            }
        }
    }

    public void k(float f13) {
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        b bVar = this.f141496c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f141500g == -1.0f) {
            this.f141500g = bVar.d();
        }
        float f14 = this.f141500g;
        if (f13 < f14) {
            if (f14 == -1.0f) {
                this.f141500g = bVar.d();
            }
            f13 = this.f141500g;
        } else if (f13 > c()) {
            f13 = c();
        }
        if (f13 == this.f141497d) {
            return;
        }
        this.f141497d = f13;
        if (bVar.c(f13)) {
            j();
        }
    }

    public final void l(androidx.appcompat.app.d dVar) {
        androidx.appcompat.app.d dVar2 = this.f141498e;
        if (dVar2 != null) {
            dVar2.f15967c = null;
        }
        this.f141498e = dVar;
        if (dVar != null) {
            dVar.f15967c = this;
        }
    }
}
