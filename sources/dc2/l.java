package dc2;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ExoPlayer f54422a;

    /* renamed from: b, reason: collision with root package name */
    public final oc2.i f54423b;

    public l(ExoPlayer player, oc2.i currentlyBoundView) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(currentlyBoundView, "currentlyBoundView");
        this.f54422a = player;
        this.f54423b = currentlyBoundView;
    }

    public final oc2.i a() {
        return this.f54423b;
    }

    public final ExoPlayer b() {
        return this.f54422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f54422a, lVar.f54422a) && Intrinsics.d(this.f54423b, lVar.f54423b);
    }

    public final int hashCode() {
        return this.f54423b.hashCode() + (this.f54422a.hashCode() * 31);
    }

    public final String toString() {
        return "ReturnReusedPlayerResult(player=" + this.f54422a + ", currentlyBoundView=" + this.f54423b + ")";
    }
}
