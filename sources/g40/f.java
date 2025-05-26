package g40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: d, reason: collision with root package name */
    public final String f63497d;

    public f(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63497d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f63497d, ((f) obj).f63497d);
    }

    public final int hashCode() {
        return this.f63497d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3RemoveFatigueForInterestAfterFeedbackMutation(__typename="), this.f63497d, ")");
    }
}
