package nk1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f91140a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f91141b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f91142c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function2, ok1.b] */
    public k(pk1.e actionInitiated, int i13) {
        ?? actionFailure = ok1.b.f95453i;
        actionInitiated = (i13 & 2) != 0 ? actionFailure : actionInitiated;
        ok1.a actionNotAllowed = ok1.a.f95450j;
        Intrinsics.checkNotNullParameter(actionFailure, "actionFailure");
        Intrinsics.checkNotNullParameter(actionInitiated, "actionInitiated");
        Intrinsics.checkNotNullParameter(actionNotAllowed, "actionNotAllowed");
        this.f91140a = actionFailure;
        this.f91141b = actionInitiated;
        this.f91142c = actionNotAllowed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f91140a, kVar.f91140a) && Intrinsics.d(this.f91141b, kVar.f91141b) && Intrinsics.d(this.f91142c, kVar.f91142c);
    }

    public final int hashCode() {
        return this.f91142c.hashCode() + ((this.f91141b.hashCode() + (this.f91140a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UserFollowActionListener(actionFailure=" + this.f91140a + ", actionInitiated=" + this.f91141b + ", actionNotAllowed=" + this.f91142c + ")";
    }
}
