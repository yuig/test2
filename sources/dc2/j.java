package dc2;

import androidx.media3.exoplayer.ExoPlayer;
import hc2.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ExoPlayer f54416a;

    /* renamed from: b, reason: collision with root package name */
    public final q f54417b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f54418c;

    /* renamed from: d, reason: collision with root package name */
    public oc2.i f54419d;

    public j(ExoPlayer player, q qVar, Long l13, oc2.i iVar) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f54416a = player;
        this.f54417b = qVar;
        this.f54418c = l13;
        this.f54419d = iVar;
    }

    public final void a(oc2.i iVar) {
        this.f54419d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f54416a, jVar.f54416a) && this.f54417b == jVar.f54417b && Intrinsics.d(this.f54418c, jVar.f54418c) && Intrinsics.d(this.f54419d, jVar.f54419d);
    }

    public final int hashCode() {
        int hashCode = this.f54416a.hashCode() * 31;
        q qVar = this.f54417b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Long l13 = this.f54418c;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        oc2.i iVar = this.f54419d;
        return hashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorrowOrCreateResult(player=" + this.f54416a + ", prefetchTrigger=" + this.f54417b + ", prefetchDurationMs=" + this.f54418c + ", previouslyBoundView=" + this.f54419d + ")";
    }
}
