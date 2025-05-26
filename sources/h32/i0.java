package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: g */
    public static final vb0.i f67080g = new vb0.i(3);

    /* renamed from: a */
    public final d4 f67081a;

    /* renamed from: b */
    public final a4 f67082b;

    /* renamed from: c */
    public final x3 f67083c;

    /* renamed from: d */
    public final g0 f67084d;

    /* renamed from: e */
    public final d0 f67085e;

    /* renamed from: f */
    public final u0 f67086f;

    public i0(d4 d4Var, a4 a4Var, x3 x3Var, g0 g0Var, d0 d0Var, u0 u0Var) {
        this.f67081a = d4Var;
        this.f67082b = a4Var;
        this.f67083c = x3Var;
        this.f67084d = g0Var;
        this.f67085e = d0Var;
        this.f67086f = u0Var;
    }

    public static i0 a(i0 i0Var, d4 d4Var, a4 a4Var, g0 g0Var, u0 u0Var, int i13) {
        if ((i13 & 1) != 0) {
            d4Var = i0Var.f67081a;
        }
        d4 d4Var2 = d4Var;
        if ((i13 & 2) != 0) {
            a4Var = i0Var.f67082b;
        }
        a4 a4Var2 = a4Var;
        x3 x3Var = i0Var.f67083c;
        if ((i13 & 8) != 0) {
            g0Var = i0Var.f67084d;
        }
        g0 g0Var2 = g0Var;
        d0 d0Var = i0Var.f67085e;
        if ((i13 & 32) != 0) {
            u0Var = i0Var.f67086f;
        }
        i0Var.getClass();
        i0Var.getClass();
        return new i0(d4Var2, a4Var2, x3Var, g0Var2, d0Var, u0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f67081a == i0Var.f67081a && this.f67082b == i0Var.f67082b && Intrinsics.d(this.f67083c, i0Var.f67083c) && this.f67084d == i0Var.f67084d && Intrinsics.d(this.f67085e, i0Var.f67085e) && this.f67086f == i0Var.f67086f && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        d4 d4Var = this.f67081a;
        int hashCode = (d4Var == null ? 0 : d4Var.hashCode()) * 31;
        a4 a4Var = this.f67082b;
        int hashCode2 = (hashCode + (a4Var == null ? 0 : a4Var.hashCode())) * 31;
        x3 x3Var = this.f67083c;
        int hashCode3 = (hashCode2 + (x3Var == null ? 0 : x3Var.hashCode())) * 31;
        g0 g0Var = this.f67084d;
        int hashCode4 = (hashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        d0 d0Var = this.f67085e;
        int hashCode5 = (hashCode4 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        u0 u0Var = this.f67086f;
        return (hashCode5 + (u0Var != null ? u0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "Context(viewType=" + this.f67081a + ", viewParameter=" + this.f67082b + ", viewData=" + this.f67083c + ", component=" + this.f67084d + ", componentData=" + this.f67085e + ", element=" + this.f67086f + ", elementData=null)";
    }
}
