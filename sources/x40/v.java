package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f133521a;

    public v(u uVar) {
        this.f133521a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f133521a, ((v) obj).f133521a);
    }

    public final int hashCode() {
        u uVar = this.f133521a;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AddConversationMessageMutation=" + this.f133521a + ")";
    }
}
