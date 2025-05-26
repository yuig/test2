package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final sl1.e f104256a;

    public d(sl1.e avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f104256a = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f104256a, ((d) obj).f104256a);
    }

    public final int hashCode() {
        return this.f104256a.hashCode();
    }

    public final String toString() {
        return "AvatarGroupAvatarClicked(avatar=" + this.f104256a + ")";
    }
}
