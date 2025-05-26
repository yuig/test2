package k22;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f78217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78218b;

    public i(ArrayList users, String str) {
        Intrinsics.checkNotNullParameter(users, "users");
        this.f78217a = users;
        this.f78218b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f78217a, iVar.f78217a) && Intrinsics.d(this.f78218b, iVar.f78218b);
    }

    public final int hashCode() {
        int hashCode = this.f78217a.hashCode() * 31;
        String str = this.f78218b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UserListWithBookmark(users=" + this.f78217a + ", bookmark=" + this.f78218b + ")";
    }
}
