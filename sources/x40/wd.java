package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wd implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ud f133626a;

    public wd(ud udVar) {
        this.f133626a = udVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd) && Intrinsics.d(this.f133626a, ((wd) obj).f133626a);
    }

    public final int hashCode() {
        ud udVar = this.f133626a;
        if (udVar == null) {
            return 0;
        }
        return udVar.hashCode();
    }

    public final String toString() {
        return "Data(v3HideConversationMutation=" + this.f133626a + ")";
    }
}
