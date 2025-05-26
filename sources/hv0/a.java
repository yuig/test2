package hv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f70443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70444b;

    public a(b editablePinUpdateType, String uid) {
        Intrinsics.checkNotNullParameter(editablePinUpdateType, "editablePinUpdateType");
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f70443a = editablePinUpdateType;
        this.f70444b = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f70443a == aVar.f70443a && Intrinsics.d(this.f70444b, aVar.f70444b);
    }

    public final int hashCode() {
        return this.f70444b.hashCode() + (this.f70443a.hashCode() * 31);
    }

    public final String toString() {
        return "EditablePinUpdateEvent(editablePinUpdateType=" + this.f70443a + ", uid=" + this.f70444b + ")";
    }
}
