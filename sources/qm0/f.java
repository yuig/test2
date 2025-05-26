package qm0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List f104270a;

    public f(List avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f104270a = avatars;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f104270a, ((f) obj).f104270a);
    }

    public final int hashCode() {
        return this.f104270a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("AvatarGroupOverflowClicked(avatars="), this.f104270a, ")");
    }
}
