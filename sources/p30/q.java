package p30;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f98751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98752b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98753c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f98754d;

    public q(String __typename, String entityId, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f98751a = __typename;
        this.f98752b = entityId;
        this.f98753c = str;
        this.f98754d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f98751a, qVar.f98751a) && Intrinsics.d(this.f98752b, qVar.f98752b) && Intrinsics.d(this.f98753c, qVar.f98753c) && Intrinsics.d(this.f98754d, qVar.f98754d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f98752b, this.f98751a.hashCode() * 31, 31);
        String str = this.f98753c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f98754d;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f98751a);
        sb3.append(", entityId=");
        sb3.append(this.f98752b);
        sb3.append(", type=");
        sb3.append(this.f98753c);
        sb3.append(", isAccepted=");
        return a.c.h(sb3, this.f98754d, ")");
    }
}
