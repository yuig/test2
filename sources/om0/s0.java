package om0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f96587c = new s0(a1.f96460f, r0.f96575j);

    /* renamed from: a, reason: collision with root package name */
    public final a1 f96588a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f96589b;

    public s0(a1 previewEvents, Function0 onCtaClick) {
        Intrinsics.checkNotNullParameter(previewEvents, "previewEvents");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        this.f96588a = previewEvents;
        this.f96589b = onCtaClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f96588a, s0Var.f96588a) && Intrinsics.d(this.f96589b, s0Var.f96589b);
    }

    public final int hashCode() {
        return this.f96589b.hashCode() + (this.f96588a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedContentCarouselEvents(previewEvents=" + this.f96588a + ", onCtaClick=" + this.f96589b + ")";
    }
}
