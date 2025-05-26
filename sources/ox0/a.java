package ox0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f97980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f97981b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97982c;

    public a(b action, String str, String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f97980a = action;
        this.f97981b = str;
        this.f97982c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f97980a == aVar.f97980a && Intrinsics.d(this.f97981b, aVar.f97981b) && Intrinsics.d(this.f97982c, aVar.f97982c);
    }

    public final int hashCode() {
        int hashCode = this.f97980a.hashCode() * 31;
        String str = this.f97981b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97982c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NewsHubFeedItemEllipsisMenuAction(action=");
        sb3.append(this.f97980a);
        sb3.append(", objectName=");
        sb3.append(this.f97981b);
        sb3.append(", objectId=");
        return a.a.p(sb3, this.f97982c, ")");
    }
}
