package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements l, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f63426d;

    /* renamed from: e, reason: collision with root package name */
    public final h f63427e;

    public i(String __typename, h error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f63426d = __typename;
        this.f63427e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f63427e;
    }

    @Override // z40.b
    public final String b() {
        return this.f63426d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f63426d, iVar.f63426d) && Intrinsics.d(this.f63427e, iVar.f63427e);
    }

    public final int hashCode() {
        return this.f63427e.hashCode() + (this.f63426d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3RemoveDeviceTokenMutation(__typename=" + this.f63426d + ", error=" + this.f63427e + ")";
    }
}
