package tc0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f117236a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117237b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f117238c;

    public d0(int i13, List provides, Function1 view) {
        Intrinsics.checkNotNullParameter(provides, "provides");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f117236a = i13;
        this.f117237b = provides;
        this.f117238c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f117236a == d0Var.f117236a && Intrinsics.d(this.f117237b, d0Var.f117237b) && Intrinsics.d(this.f117238c, d0Var.f117238c);
    }

    public final int hashCode() {
        return this.f117238c.hashCode() + ep.b.c(this.f117237b, Integer.hashCode(this.f117236a) * 31, 31);
    }

    public final String toString() {
        return "ItemDisplayStateOneView(title=" + this.f117236a + ", provides=" + this.f117237b + ", view=" + this.f117238c + ")";
    }

    public d0(int i13, Function1 function1) {
        this(i13, kotlin.collections.q0.f80391a, function1);
    }
}
