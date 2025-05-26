package b3;

import k1.s2;

/* loaded from: classes.dex */
public final class y0 extends u2.p implements s3.c0 {
    public long A;
    public long B;
    public int C;
    public s2 D;

    /* renamed from: n, reason: collision with root package name */
    public float f21399n;

    /* renamed from: o, reason: collision with root package name */
    public float f21400o;

    /* renamed from: p, reason: collision with root package name */
    public float f21401p;

    /* renamed from: q, reason: collision with root package name */
    public float f21402q;

    /* renamed from: r, reason: collision with root package name */
    public float f21403r;

    /* renamed from: s, reason: collision with root package name */
    public float f21404s;

    /* renamed from: t, reason: collision with root package name */
    public float f21405t;

    /* renamed from: u, reason: collision with root package name */
    public float f21406u;

    /* renamed from: v, reason: collision with root package name */
    public float f21407v;

    /* renamed from: w, reason: collision with root package name */
    public float f21408w;

    /* renamed from: x, reason: collision with root package name */
    public long f21409x;

    /* renamed from: y, reason: collision with root package name */
    public x0 f21410y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21411z;

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // s3.c0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        q3.c1 Q = o0Var.Q(j13);
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new i2.i(4, Q, this));
        return s03;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb3.append(this.f21399n);
        sb3.append(", scaleY=");
        sb3.append(this.f21400o);
        sb3.append(", alpha = ");
        sb3.append(this.f21401p);
        sb3.append(", translationX=");
        sb3.append(this.f21402q);
        sb3.append(", translationY=");
        sb3.append(this.f21403r);
        sb3.append(", shadowElevation=");
        sb3.append(this.f21404s);
        sb3.append(", rotationX=");
        sb3.append(this.f21405t);
        sb3.append(", rotationY=");
        sb3.append(this.f21406u);
        sb3.append(", rotationZ=");
        sb3.append(this.f21407v);
        sb3.append(", cameraDistance=");
        sb3.append(this.f21408w);
        sb3.append(", transformOrigin=");
        sb3.append((Object) b1.d(this.f21409x));
        sb3.append(", shape=");
        sb3.append(this.f21410y);
        sb3.append(", clip=");
        sb3.append(this.f21411z);
        sb3.append(", renderEffect=null, ambientShadowColor=");
        jq.b.t(this.A, sb3, ", spotShadowColor=");
        jq.b.t(this.B, sb3, ", compositingStrategy=");
        sb3.append((Object) ("CompositingStrategy(value=" + this.C + ')'));
        sb3.append(')');
        return sb3.toString();
    }
}
