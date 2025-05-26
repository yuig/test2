package qm0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List f104263a;

    public e(List avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f104263a = avatars;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f104263a, ((e) obj).f104263a);
    }

    public final int hashCode() {
        return this.f104263a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("AvatarGroupIconClicked(avatars="), this.f104263a, ")");
    }
}
