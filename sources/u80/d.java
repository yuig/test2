package u80;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import xk2.w;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f120919a;

    /* renamed from: b, reason: collision with root package name */
    public final Pair f120920b;

    /* renamed from: c, reason: collision with root package name */
    public final w f120921c;

    public d(c one, Pair two, w three) {
        Intrinsics.checkNotNullParameter(one, "one");
        Intrinsics.checkNotNullParameter(two, "two");
        Intrinsics.checkNotNullParameter(three, "three");
        this.f120919a = one;
        this.f120920b = two;
        this.f120921c = three;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f120919a, dVar.f120919a) && Intrinsics.d(this.f120920b, dVar.f120920b) && Intrinsics.d(this.f120921c, dVar.f120921c);
    }

    public final int hashCode() {
        return this.f120921c.hashCode() + ((this.f120920b.hashCode() + (this.f120919a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardTransformations(one=" + this.f120919a + ", two=" + this.f120920b + ", three=" + this.f120921c + ")";
    }
}
