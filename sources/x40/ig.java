package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ig implements jg {

    /* renamed from: d, reason: collision with root package name */
    public final String f132576d;

    public ig(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132576d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig) && Intrinsics.d(this.f132576d, ((ig) obj).f132576d);
    }

    public final int hashCode() {
        return this.f132576d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3RelatedPinsForConversationQuery(__typename="), this.f132576d, ")");
    }
}
