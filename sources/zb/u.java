package zb;

import java.util.Collections;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Object f141549i;

    public u(androidx.appcompat.app.d dVar, Object obj) {
        super(Collections.emptyList());
        l(dVar);
        this.f141549i = obj;
    }

    @Override // zb.e
    public final float c() {
        return 1.0f;
    }

    @Override // zb.e
    public final Object g() {
        androidx.appcompat.app.d dVar = this.f141498e;
        float f13 = this.f141497d;
        Object obj = this.f141549i;
        return dVar.B(0.0f, 0.0f, obj, obj, f13, f13, f13);
    }

    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        return g();
    }

    @Override // zb.e
    public final void j() {
        if (this.f141498e != null) {
            super.j();
        }
    }

    @Override // zb.e
    public final void k(float f13) {
        this.f141497d = f13;
    }
}
