package gu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final hu1.g f66137a;

    public d(hu1.g wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f66137a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f66137a, ((d) obj).f66137a);
    }

    public final int hashCode() {
        return this.f66137a.hashCode();
    }

    public final String toString() {
        return "WrappedUserModelLoaderEventNav(wrapped=" + this.f66137a + ")";
    }
}
