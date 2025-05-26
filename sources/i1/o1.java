package i1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f70858b;

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f70859c;

    /* renamed from: a, reason: collision with root package name */
    public final z1 f70860a;

    static {
        LinkedHashMap linkedHashMap = null;
        p1 p1Var = null;
        w1 w1Var = null;
        p0 p0Var = null;
        t1 t1Var = null;
        f70858b = new o1(new z1(p1Var, w1Var, p0Var, t1Var, false, linkedHashMap, 63));
        f70859c = new o1(new z1(p1Var, w1Var, p0Var, t1Var, true, linkedHashMap, 47));
    }

    public o1(z1 z1Var) {
        this.f70860a = z1Var;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        return (obj instanceof o1) && Intrinsics.d(((o1) obj).f70860a, this.f70860a);
    }

    public final o1 b(o1 o1Var) {
        z1 z1Var = o1Var.f70860a;
        p1 p1Var = z1Var.f70946a;
        z1 z1Var2 = this.f70860a;
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
        return new o1(new z1(p1Var2, w1Var2, p0Var2, t1Var, z1Var.f70950e || z1Var2.f70950e, kotlin.collections.z0.j(z1Var2.f70951f, z1Var.f70951f)));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (Intrinsics.d(this, f70858b)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.d(this, f70859c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb3 = new StringBuilder("ExitTransition: \nFade - ");
        z1 z1Var = this.f70860a;
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
        sb3.append(",\nKeepUntilTransitionsFinished - ");
        sb3.append(z1Var.f70950e);
        return sb3.toString();
    }

    public final int hashCode() {
        return this.f70860a.hashCode();
    }
}
