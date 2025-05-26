package c92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final n f27009a;

    public i(n content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f27009a = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f27009a, ((i) obj).f27009a);
    }

    public final int hashCode() {
        return this.f27009a.hashCode();
    }

    public final String toString() {
        return "InitializeBenefitSection(content=" + this.f27009a + ")";
    }
}
