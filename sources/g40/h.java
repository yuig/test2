package g40;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes5.dex */
public final class h implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f63498a;

    public h(g gVar) {
        this.f63498a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f63498a, ((h) obj).f63498a);
    }

    public final int hashCode() {
        g gVar = this.f63498a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public final String toString() {
        return "Data(v3RemoveFatigueForInterestAfterFeedbackMutation=" + this.f63498a + ")";
    }
}
