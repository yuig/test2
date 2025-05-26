package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class x4 {

    @NotNull
    public static final w4 Companion = new w4();

    /* renamed from: d, reason: collision with root package name */
    public static final no2.b[] f64144d = {null, f72.t0.Companion.serializer(), null};

    /* renamed from: a, reason: collision with root package name */
    public final String f64145a;

    /* renamed from: b, reason: collision with root package name */
    public final f72.t0 f64146b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f64147c;

    public x4(int i13, String str, f72.t0 t0Var, b2 b2Var) {
        if ((i13 & 1) == 0) {
            this.f64145a = null;
        } else {
            this.f64145a = str;
        }
        if ((i13 & 2) == 0) {
            this.f64146b = null;
        } else {
            this.f64146b = t0Var;
        }
        if ((i13 & 4) == 0) {
            this.f64147c = null;
        } else {
            this.f64147c = b2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return Intrinsics.d(this.f64145a, x4Var.f64145a) && this.f64146b == x4Var.f64146b && Intrinsics.d(this.f64147c, x4Var.f64147c);
    }

    public final int hashCode() {
        String str = this.f64145a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        f72.t0 t0Var = this.f64146b;
        int hashCode2 = (hashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        b2 b2Var = this.f64147c;
        return hashCode2 + (b2Var != null ? b2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ShuffleEffectDataEntity(backgroundColor=" + this.f64145a + ", shuffleOverlayEffect=" + this.f64146b + ", keyframeAnimation=" + this.f64147c + ")";
    }

    public x4(String str, f72.t0 t0Var) {
        this.f64145a = str;
        this.f64146b = t0Var;
        this.f64147c = null;
    }
}
