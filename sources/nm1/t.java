package nm1;

import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f91491a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f91492b;

    /* renamed from: c, reason: collision with root package name */
    public final List f91493c;

    /* renamed from: d, reason: collision with root package name */
    public final List f91494d;

    public t(GestaltAvatar avatar, GestaltText userName, ArrayList endActionElements, ArrayList endActionConstraints) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(endActionElements, "endActionElements");
        Intrinsics.checkNotNullParameter(endActionConstraints, "endActionConstraints");
        this.f91491a = avatar;
        this.f91492b = userName;
        this.f91493c = endActionElements;
        this.f91494d = endActionConstraints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f91491a, tVar.f91491a) && Intrinsics.d(this.f91492b, tVar.f91492b) && Intrinsics.d(this.f91493c, tVar.f91493c) && Intrinsics.d(this.f91494d, tVar.f91494d);
    }

    public final int hashCode() {
        return this.f91494d.hashCode() + ep.b.c(this.f91493c, (this.f91492b.hashCode() + (this.f91491a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "UserAndActions(avatar=" + this.f91491a + ", userName=" + this.f91492b + ", endActionElements=" + this.f91493c + ", endActionConstraints=" + this.f91494d + ")";
    }
}
