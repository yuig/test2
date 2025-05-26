package om0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f96603c = new u0(r0.f96576k, j.f96519m);

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f96604a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f96605b;

    public u0(Function0 onCtaClick, Function1 onPreviewClick) {
        Intrinsics.checkNotNullParameter(onPreviewClick, "onPreviewClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        this.f96604a = onPreviewClick;
        this.f96605b = onCtaClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f96604a, u0Var.f96604a) && Intrinsics.d(this.f96605b, u0Var.f96605b);
    }

    public final int hashCode() {
        return this.f96605b.hashCode() + (this.f96604a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedContentGridEvents(onPreviewClick=" + this.f96604a + ", onCtaClick=" + this.f96605b + ")";
    }
}
