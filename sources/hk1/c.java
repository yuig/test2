package hk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f69342a;

    public c(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f69342a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f69342a, ((c) obj).f69342a);
    }

    public final int hashCode() {
        return this.f69342a.hashCode();
    }

    public final String j() {
        return this.f69342a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MarkPinFavorited(pinUid="), this.f69342a, ")");
    }
}
