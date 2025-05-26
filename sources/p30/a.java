package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f98727d;

    public a(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98727d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f98727d, ((a) obj).f98727d);
    }

    public final int hashCode() {
        return this.f98727d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("EmailClickResultResponseV3EmailClickMutation(__typename="), this.f98727d, ")");
    }
}
