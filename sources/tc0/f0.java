package tc0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f117248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117249b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f117250c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f117251d;

    /* renamed from: e, reason: collision with root package name */
    public final List f117252e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f117253f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f117254g;

    public f0(Integer num, Integer num2, Integer num3, List provides, Function1 function1, Function1 function12, int i13) {
        num = (i13 & 1) != 0 ? null : num;
        num2 = (i13 & 4) != 0 ? null : num2;
        num3 = (i13 & 8) != 0 ? null : num3;
        provides = (i13 & 16) != 0 ? kotlin.collections.q0.f80391a : provides;
        Intrinsics.checkNotNullParameter(provides, "provides");
        this.f117248a = num;
        this.f117249b = null;
        this.f117250c = num2;
        this.f117251d = num3;
        this.f117252e = provides;
        this.f117253f = function1;
        this.f117254g = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f117248a, f0Var.f117248a) && Intrinsics.d(this.f117249b, f0Var.f117249b) && Intrinsics.d(this.f117250c, f0Var.f117250c) && Intrinsics.d(this.f117251d, f0Var.f117251d) && Intrinsics.d(this.f117252e, f0Var.f117252e) && Intrinsics.d(this.f117253f, f0Var.f117253f) && Intrinsics.d(this.f117254g, f0Var.f117254g);
    }

    public final int hashCode() {
        Integer num = this.f117248a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f117249b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f117250c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f117251d;
        int c13 = ep.b.c(this.f117252e, (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        Function1 function1 = this.f117253f;
        int hashCode4 = (c13 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f117254g;
        return hashCode4 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        return "ItemDisplayStateTwoViews(title=" + this.f117248a + ", titleString=" + this.f117249b + ", leftSubtitle=" + this.f117250c + ", rightSubtitle=" + this.f117251d + ", provides=" + this.f117252e + ", leftView=" + this.f117253f + ", rightView=" + this.f117254g + ")";
    }
}
