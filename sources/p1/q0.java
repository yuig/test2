package p1;

import s3.d2;

/* loaded from: classes2.dex */
public final class q0 extends u2.p implements d2 {

    /* renamed from: n, reason: collision with root package name */
    public float f98573n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98574o;

    @Override // s3.d2
    public final Object J(n4.b bVar, Object obj) {
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        if (b1Var == null) {
            b1Var = new b1();
        }
        b1Var.f98486a = this.f98573n;
        b1Var.f98487b = this.f98574o;
        return b1Var;
    }
}
