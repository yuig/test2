package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sh implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final jg f133277a;

    public sh(jg jgVar) {
        this.f133277a = jgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh) && Intrinsics.d(this.f133277a, ((sh) obj).f133277a);
    }

    public final int hashCode() {
        jg jgVar = this.f133277a;
        if (jgVar == null) {
            return 0;
        }
        return jgVar.hashCode();
    }

    public final String toString() {
        return "Data(v3RelatedPinsForConversationQuery=" + this.f133277a + ")";
    }
}
