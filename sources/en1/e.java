package en1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f59664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59665b;

    public e(ArrayList avatarGroupInfo, int i13) {
        Intrinsics.checkNotNullParameter(avatarGroupInfo, "avatarGroupInfo");
        this.f59664a = avatarGroupInfo;
        this.f59665b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f59664a, eVar.f59664a) && this.f59665b == eVar.f59665b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59665b) + (this.f59664a.hashCode() * 31);
    }

    public final String toString() {
        return "AvatarGroup(avatarGroupInfo=" + this.f59664a + ", totalGroupCount=" + this.f59665b + ")";
    }
}
