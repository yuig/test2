package om0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final a1 f96460f = new a1(null, null, null, null, 31);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f96461a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f96462b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f96463c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f96464d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f96465e;

    public a1(qm0.i0 i0Var, qm0.n0 n0Var, qm0.i0 i0Var2, qm0.n0 n0Var2, int i13) {
        Function0 onSavesPreviewClick = i0Var;
        onSavesPreviewClick = (i13 & 1) != 0 ? r0.f96577l : onSavesPreviewClick;
        Function1 onSectionPreviewClick = n0Var;
        onSectionPreviewClick = (i13 & 2) != 0 ? j.f96521o : onSectionPreviewClick;
        Function0 onSectionPreviewOverlayClick = i0Var2;
        onSectionPreviewOverlayClick = (i13 & 4) != 0 ? r0.f96578m : onSectionPreviewOverlayClick;
        Function1 onPinPreviewClick = n0Var2;
        onPinPreviewClick = (i13 & 8) != 0 ? j.f96522p : onPinPreviewClick;
        r0 onCtaClick = r0.f96579n;
        Intrinsics.checkNotNullParameter(onSavesPreviewClick, "onSavesPreviewClick");
        Intrinsics.checkNotNullParameter(onSectionPreviewClick, "onSectionPreviewClick");
        Intrinsics.checkNotNullParameter(onSectionPreviewOverlayClick, "onSectionPreviewOverlayClick");
        Intrinsics.checkNotNullParameter(onPinPreviewClick, "onPinPreviewClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        this.f96461a = onSavesPreviewClick;
        this.f96462b = onSectionPreviewClick;
        this.f96463c = onSectionPreviewOverlayClick;
        this.f96464d = onPinPreviewClick;
        this.f96465e = onCtaClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f96461a, a1Var.f96461a) && Intrinsics.d(this.f96462b, a1Var.f96462b) && Intrinsics.d(this.f96463c, a1Var.f96463c) && Intrinsics.d(this.f96464d, a1Var.f96464d) && Intrinsics.d(this.f96465e, a1Var.f96465e);
    }

    public final int hashCode() {
        return this.f96465e.hashCode() + d7.g.c(this.f96464d, d7.g.b(this.f96463c, d7.g.c(this.f96462b, this.f96461a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SavedContentPreviewEvents(onSavesPreviewClick=");
        sb3.append(this.f96461a);
        sb3.append(", onSectionPreviewClick=");
        sb3.append(this.f96462b);
        sb3.append(", onSectionPreviewOverlayClick=");
        sb3.append(this.f96463c);
        sb3.append(", onPinPreviewClick=");
        sb3.append(this.f96464d);
        sb3.append(", onCtaClick=");
        return pk2.f.i(sb3, this.f96465e, ")");
    }
}
