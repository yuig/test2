package j30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f74548a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f74549b;

    public e(String __typename, Integer num) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74548a = __typename;
        this.f74549b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f74548a, eVar.f74548a) && Intrinsics.d(this.f74549b, eVar.f74549b);
    }

    public final int hashCode() {
        int hashCode = this.f74548a.hashCode() * 31;
        Integer num = this.f74549b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Data(__typename=" + this.f74548a + ", conversationBadgeCount=" + this.f74549b + ")";
    }
}
