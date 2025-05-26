package bj1;

import kotlin.jvm.internal.Intrinsics;
import rl1.q;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final q f22968a;

    public d(q avatarDS) {
        Intrinsics.checkNotNullParameter(avatarDS, "avatarDS");
        this.f22968a = avatarDS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f22968a, ((d) obj).f22968a);
    }

    public final int hashCode() {
        return this.f22968a.hashCode();
    }

    public final String toString() {
        return "BoardPinAttributionDrawableDisplayState(avatarDS=" + this.f22968a + ")";
    }
}
