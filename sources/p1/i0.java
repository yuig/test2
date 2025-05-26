package p1;

import s3.d2;

/* loaded from: classes2.dex */
public final class i0 extends u2.p implements d2 {

    /* renamed from: n, reason: collision with root package name */
    public u2.c f98526n;

    @Override // s3.d2
    public final Object J(n4.b bVar, Object obj) {
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        if (b1Var == null) {
            b1Var = new b1();
        }
        b1Var.f98488c = new c0(this.f98526n);
        return b1Var;
    }
}
