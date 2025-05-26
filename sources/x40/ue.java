package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ue implements we, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133473d;

    /* renamed from: e, reason: collision with root package name */
    public final te f133474e;

    public ue(String __typename, te error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133473d = __typename;
        this.f133474e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133474e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133473d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return Intrinsics.d(this.f133473d, ueVar.f133473d) && Intrinsics.d(this.f133474e, ueVar.f133474e);
    }

    public final int hashCode() {
        return this.f133474e.hashCode() + (this.f133473d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3LogPushNotificationMutation(__typename=" + this.f133473d + ", error=" + this.f133474e + ")";
    }
}
