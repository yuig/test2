package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class e4 extends u4 {

    @NotNull
    public static final d4 Companion = new d4();

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f63972g = {0.5f, 1.0f};

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f63973h = {0.5f, 0.5f};

    /* renamed from: b, reason: collision with root package name */
    public final g1 f63974b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f63975c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f63976d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f63977e;

    /* renamed from: f, reason: collision with root package name */
    public final x f63978f;

    public e4(int i13, g1 g1Var, g1 g1Var2, o0 o0Var, o0 o0Var2, x xVar) {
        if ((i13 & 1) == 0) {
            this.f63974b = null;
        } else {
            this.f63974b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f63975c = null;
        } else {
            this.f63975c = g1Var2;
        }
        if ((i13 & 4) == 0) {
            this.f63976d = null;
        } else {
            this.f63976d = o0Var;
        }
        if ((i13 & 8) == 0) {
            this.f63977e = null;
        } else {
            this.f63977e = o0Var2;
        }
        if ((i13 & 16) == 0) {
            this.f63978f = null;
        } else {
            this.f63978f = xVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return Intrinsics.d(this.f63974b, e4Var.f63974b) && Intrinsics.d(this.f63975c, e4Var.f63975c) && Intrinsics.d(this.f63976d, e4Var.f63976d) && Intrinsics.d(this.f63977e, e4Var.f63977e) && Intrinsics.d(this.f63978f, e4Var.f63978f);
    }

    public final int hashCode() {
        g1 g1Var = this.f63974b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        g1 g1Var2 = this.f63975c;
        int hashCode2 = (hashCode + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        o0 o0Var = this.f63976d;
        int hashCode3 = (hashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        o0 o0Var2 = this.f63977e;
        int hashCode4 = (hashCode3 + (o0Var2 == null ? 0 : o0Var2.hashCode())) * 31;
        x xVar = this.f63978f;
        return hashCode4 + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "SlotMachine(timeSpeed=" + this.f63974b + ", scale=" + this.f63975c + ", direction=" + this.f63976d + ", spacing=" + this.f63977e + ", mirror=" + this.f63978f + ")";
    }
}
