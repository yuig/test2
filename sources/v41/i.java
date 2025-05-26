package v41;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f124125a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124126b;

    /* renamed from: c, reason: collision with root package name */
    public final List f124127c;

    /* renamed from: d, reason: collision with root package name */
    public final String f124128d;

    public i(List filters, boolean z13, String userId, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f124125a = userId;
        this.f124126b = z13;
        this.f124127c = filters;
        this.f124128d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f124125a, iVar.f124125a) && this.f124126b == iVar.f124126b && Intrinsics.d(this.f124127c, iVar.f124127c) && Intrinsics.d(this.f124128d, iVar.f124128d);
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f124127c, ep.b.e(this.f124126b, this.f124125a.hashCode() * 31, 31), 31);
        String str = this.f124128d;
        return c13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfilePinsRequestArgs(userId=");
        sb3.append(this.f124125a);
        sb3.append(", isMe=");
        sb3.append(this.f124126b);
        sb3.append(", filters=");
        sb3.append(this.f124127c);
        sb3.append(", structuredFeedRequestParams=");
        return a.a.p(sb3, this.f124128d, ")");
    }
}
