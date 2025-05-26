package v30;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f123938a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123939b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123940c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f123941d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f123942e;

    public m(String __typename, String id3, String entityId, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f123938a = __typename;
        this.f123939b = id3;
        this.f123940c = entityId;
        this.f123941d = bool;
        this.f123942e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f123938a, mVar.f123938a) && Intrinsics.d(this.f123939b, mVar.f123939b) && Intrinsics.d(this.f123940c, mVar.f123940c) && Intrinsics.d(this.f123941d, mVar.f123941d) && Intrinsics.d(this.f123942e, mVar.f123942e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f123940c, cb.d(this.f123939b, this.f123938a.hashCode() * 31, 31), 31);
        Boolean bool = this.f123941d;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f123942e;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f123938a);
        sb3.append(", id=");
        sb3.append(this.f123939b);
        sb3.append(", entityId=");
        sb3.append(this.f123940c);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f123941d);
        sb3.append(", followerCount=");
        return a.c.i(sb3, this.f123942e, ")");
    }
}
