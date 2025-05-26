package nk1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f91162a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f91163b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f91164c;

    public p() {
        ok1.b actionInitiated = ok1.b.f95453i;
        ok1.a actionNotAllowed = ok1.a.f95450j;
        Intrinsics.checkNotNullParameter(actionInitiated, "actionFailure");
        Intrinsics.checkNotNullParameter(actionInitiated, "actionInitiated");
        Intrinsics.checkNotNullParameter(actionNotAllowed, "actionNotAllowed");
        this.f91162a = actionInitiated;
        this.f91163b = actionInitiated;
        this.f91164c = actionNotAllowed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f91162a, pVar.f91162a) && Intrinsics.d(this.f91163b, pVar.f91163b) && Intrinsics.d(this.f91164c, pVar.f91164c);
    }

    public final int hashCode() {
        return this.f91164c.hashCode() + ((this.f91163b.hashCode() + (this.f91162a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UserRepFollowActionListener(actionFailure=" + this.f91162a + ", actionInitiated=" + this.f91163b + ", actionNotAllowed=" + this.f91164c + ")";
    }
}
