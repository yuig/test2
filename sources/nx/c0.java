package nx;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f92383a;

    /* renamed from: b, reason: collision with root package name */
    public final c f92384b;

    public c0(z1 impression, c attributionData) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        Intrinsics.checkNotNullParameter(attributionData, "attributionData");
        this.f92383a = impression;
        this.f92384b = attributionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f92383a, c0Var.f92383a) && Intrinsics.d(this.f92384b, c0Var.f92384b);
    }

    public final int hashCode() {
        return this.f92384b.hashCode() + (this.f92383a.hashCode() * 31);
    }

    public final String toString() {
        return "PinImpressionContextWrapper(impression=" + this.f92383a + ", attributionData=" + this.f92384b + ")";
    }

    public /* synthetic */ c0(z1 z1Var) {
        this(z1Var, new c(null, null, null, null, 15));
    }
}
