package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements a0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133714d;

    /* renamed from: e, reason: collision with root package name */
    public final x f133715e;

    public y(String __typename, x error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133714d = __typename;
        this.f133715e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133715e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133714d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f133714d, yVar.f133714d) && Intrinsics.d(this.f133715e, yVar.f133715e);
    }

    public final int hashCode() {
        return this.f133715e.hashCode() + (this.f133714d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AddConversationPinSeenMutation(__typename=" + this.f133714d + ", error=" + this.f133715e + ")";
    }
}
