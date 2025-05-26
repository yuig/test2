package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zh implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final yh f133830a;

    public zh(yh yhVar) {
        this.f133830a = yhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh) && Intrinsics.d(this.f133830a, ((zh) obj).f133830a);
    }

    public final int hashCode() {
        yh yhVar = this.f133830a;
        if (yhVar == null) {
            return 0;
        }
        return yhVar.hashCode();
    }

    public final String toString() {
        return "Data(v3RemoveBoardCollaboratorsMutationv2=" + this.f133830a + ")";
    }
}
