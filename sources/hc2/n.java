package hc2;

import a7.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final q f68776a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68777b;

    /* renamed from: c, reason: collision with root package name */
    public final o f68778c;

    public n(q trigger, long j13, o oVar) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.f68776a = trigger;
        this.f68777b = j13;
        this.f68778c = oVar;
    }

    public final long a() {
        return this.f68777b;
    }

    public final q b() {
        return this.f68776a;
    }

    public final boolean c(i1 tracks) {
        androidx.media3.common.b e13;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        o oVar = this.f68778c;
        return oVar != null && (e13 = se.l.e(tracks)) != null && Intrinsics.d(e13.f18751a, oVar.b()) && e13.f18772v == oVar.d() && e13.f18773w == oVar.c() && e13.f18760j == oVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f68776a == nVar.f68776a && this.f68777b == nVar.f68777b && Intrinsics.d(this.f68778c, nVar.f68778c);
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f68777b, this.f68776a.hashCode() * 31, 31);
        o oVar = this.f68778c;
        return c13 + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "PrefetchInfo(trigger=" + this.f68776a + ", durationMs=" + this.f68777b + ", trackInfo=" + this.f68778c + ")";
    }
}
