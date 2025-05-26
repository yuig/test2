package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* renamed from: a, reason: collision with root package name */
    public final v f64139a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64140b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64141c;

    public x(int i13, v vVar, boolean z13, boolean z14) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, s.f64096b);
            throw null;
        }
        this.f64139a = vVar;
        this.f64140b = (i13 & 2) == 0 ? false : z13;
        if ((i13 & 4) == 0) {
            this.f64141c = vVar.f64125a;
        } else {
            this.f64141c = z14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f64139a, xVar.f64139a) && this.f64140b == xVar.f64140b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64140b) + (Boolean.hashCode(this.f64139a.f64125a) * 31);
    }

    public final String toString() {
        return "BooleanValueConfig(bool=" + this.f64139a + ", unique=" + this.f64140b + ")";
    }

    public x(v bool, boolean z13) {
        Intrinsics.checkNotNullParameter(bool, "bool");
        this.f64139a = bool;
        this.f64140b = z13;
        this.f64141c = bool.f64125a;
    }
}
