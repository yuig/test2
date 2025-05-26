package i1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f70854b = new n1(new z1(null, null, null, null, false, null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final z1 f70855a;

    public n1(z1 z1Var) {
        this.f70855a = z1Var;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        return (obj instanceof n1) && Intrinsics.d(((n1) obj).f70855a, this.f70855a);
    }

    public final n1 b(n1 n1Var) {
        z1 z1Var = n1Var.f70855a;
        p1 p1Var = z1Var.f70946a;
        z1 z1Var2 = this.f70855a;
        if (p1Var == null) {
            p1Var = z1Var2.f70946a;
        }
        p1 p1Var2 = p1Var;
        w1 w1Var = z1Var.f70947b;
        if (w1Var == null) {
            w1Var = z1Var2.f70947b;
        }
        w1 w1Var2 = w1Var;
        p0 p0Var = z1Var.f70948c;
        if (p0Var == null) {
            p0Var = z1Var2.f70948c;
        }
        p0 p0Var2 = p0Var;
        t1 t1Var = z1Var.f70949d;
        if (t1Var == null) {
            t1Var = z1Var2.f70949d;
        }
        return new n1(new z1(p1Var2, w1Var2, p0Var2, t1Var, false, kotlin.collections.z0.j(z1Var2.f70951f, z1Var.f70951f), 16));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (Intrinsics.d(this, f70854b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb3 = new StringBuilder("EnterTransition: \nFade - ");
        z1 z1Var = this.f70855a;
        p1 p1Var = z1Var.f70946a;
        sb3.append(p1Var != null ? p1Var.toString() : null);
        sb3.append(",\nSlide - ");
        w1 w1Var = z1Var.f70947b;
        sb3.append(w1Var != null ? w1Var.toString() : null);
        sb3.append(",\nShrink - ");
        p0 p0Var = z1Var.f70948c;
        sb3.append(p0Var != null ? p0Var.toString() : null);
        sb3.append(",\nScale - ");
        t1 t1Var = z1Var.f70949d;
        sb3.append(t1Var != null ? t1Var.toString() : null);
        return sb3.toString();
    }

    public final int hashCode() {
        return this.f70855a.hashCode();
    }
}
