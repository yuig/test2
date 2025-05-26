package ic1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f72099a;

    public y(String pronoun) {
        Intrinsics.checkNotNullParameter(pronoun, "pronoun");
        this.f72099a = pronoun;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f72099a, ((y) obj).f72099a);
    }

    public final int hashCode() {
        return this.f72099a.hashCode();
    }

    public final String toString() {
        return this.f72099a;
    }
}
