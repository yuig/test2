package v30;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f123923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123925c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f123926d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f123927e;

    public e(String __typename, String id3, String entityId, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f123923a = __typename;
        this.f123924b = id3;
        this.f123925c = entityId;
        this.f123926d = bool;
        this.f123927e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f123923a, eVar.f123923a) && Intrinsics.d(this.f123924b, eVar.f123924b) && Intrinsics.d(this.f123925c, eVar.f123925c) && Intrinsics.d(this.f123926d, eVar.f123926d) && Intrinsics.d(this.f123927e, eVar.f123927e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f123925c, cb.d(this.f123924b, this.f123923a.hashCode() * 31, 31), 31);
        Boolean bool = this.f123926d;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f123927e;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f123923a);
        sb3.append(", id=");
        sb3.append(this.f123924b);
        sb3.append(", entityId=");
        sb3.append(this.f123925c);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f123926d);
        sb3.append(", followerCount=");
        return a.c.i(sb3, this.f123927e, ")");
    }
}
