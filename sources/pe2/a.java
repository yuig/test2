package pe2;

import oe2.r;
import oe2.u;
import oe2.v;
import oe2.y;

/* loaded from: classes4.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final r f99997a;

    public a(r rVar) {
        this.f99997a = rVar;
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        if (vVar.g() != u.NULL) {
            return this.f99997a.a(vVar);
        }
        vVar.B1();
        return null;
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        if (obj == null) {
            yVar.g();
        } else {
            this.f99997a.d(yVar, obj);
        }
    }

    public final String toString() {
        return this.f99997a + ".nullSafe()";
    }
}
