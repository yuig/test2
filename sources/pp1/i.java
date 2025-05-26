package pp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c92.n f100927a;

    public i(c92.n content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f100927a = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f100927a, ((i) obj).f100927a);
    }

    public final int hashCode() {
        return this.f100927a.hashCode();
    }

    public final String toString() {
        return "InitializeBenefitSection(content=" + this.f100927a + ")";
    }
}
