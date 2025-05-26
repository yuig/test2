package tc0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f117241a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.q f117242b;

    /* renamed from: c, reason: collision with root package name */
    public final List f117243c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f117244d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f117245e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f117246f;

    public e0(String str, u2.q modifier, List provides, Function1 inverse, Function1 backgroundAlwaysLight, Function1 view, int i13) {
        str = (i13 & 1) != 0 ? null : str;
        modifier = (i13 & 2) != 0 ? u2.n.f120041b : modifier;
        provides = (i13 & 4) != 0 ? kotlin.collections.q0.f80391a : provides;
        inverse = (i13 & 8) != 0 ? d.f117230o : inverse;
        backgroundAlwaysLight = (i13 & 16) != 0 ? d.f117231p : backgroundAlwaysLight;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(provides, "provides");
        Intrinsics.checkNotNullParameter(inverse, "inverse");
        Intrinsics.checkNotNullParameter(backgroundAlwaysLight, "backgroundAlwaysLight");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f117241a = str;
        this.f117242b = modifier;
        this.f117243c = provides;
        this.f117244d = inverse;
        this.f117245e = backgroundAlwaysLight;
        this.f117246f = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f117241a, e0Var.f117241a) && Intrinsics.d(this.f117242b, e0Var.f117242b) && Intrinsics.d(this.f117243c, e0Var.f117243c) && Intrinsics.d(this.f117244d, e0Var.f117244d) && Intrinsics.d(this.f117245e, e0Var.f117245e) && Intrinsics.d(this.f117246f, e0Var.f117246f);
    }

    public final int hashCode() {
        String str = this.f117241a;
        return this.f117246f.hashCode() + d7.g.c(this.f117245e, d7.g.c(this.f117244d, ep.b.c(this.f117243c, (this.f117242b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ItemDisplayStateOneViewWithStrings(title=" + this.f117241a + ", modifier=" + this.f117242b + ", provides=" + this.f117243c + ", inverse=" + this.f117244d + ", backgroundAlwaysLight=" + this.f117245e + ", view=" + this.f117246f + ")";
    }
}
