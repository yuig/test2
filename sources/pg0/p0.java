package pg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final dl1.s f100084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100085b;

    public p0(dl1.s unfollowedModel, String str) {
        Intrinsics.checkNotNullParameter(unfollowedModel, "unfollowedModel");
        this.f100084a = unfollowedModel;
        this.f100085b = str;
    }

    public abstract wa2.p a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.events.UnfollowEvent");
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f100084a, p0Var.f100084a) && Intrinsics.d(this.f100085b, p0Var.f100085b);
    }

    public final int hashCode() {
        int hashCode = this.f100084a.hashCode() * 31;
        String str = this.f100085b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
