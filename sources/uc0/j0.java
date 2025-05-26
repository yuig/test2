package uc0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121798a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121799b;

    /* renamed from: c, reason: collision with root package name */
    public final do2.t2 f121800c;

    /* renamed from: d, reason: collision with root package name */
    public final do2.a2 f121801d;

    public j0(int i13, List feedBackTypeOptions) {
        Intrinsics.checkNotNullParameter(feedBackTypeOptions, "feedBackTypeOptions");
        this.f121798a = i13;
        this.f121799b = feedBackTypeOptions;
        String str = (String) CollectionsKt.firstOrNull(feedBackTypeOptions);
        do2.t2 a13 = do2.u2.a(str == null ? "" : str);
        this.f121800c = a13;
        this.f121801d = new do2.a2(a13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f121798a == j0Var.f121798a && Intrinsics.d(this.f121799b, j0Var.f121799b);
    }

    public final int hashCode() {
        return this.f121799b.hashCode() + (Integer.hashCode(this.f121798a) * 31);
    }

    public final String toString() {
        return "FeedBackTypeDisplayState(title=" + this.f121798a + ", feedBackTypeOptions=" + this.f121799b + ")";
    }
}
