package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nb implements z40.n {

    /* renamed from: a, reason: collision with root package name */
    public final String f132883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132884b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132885c;

    /* renamed from: d, reason: collision with root package name */
    public final List f132886d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f132887e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132888f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132889g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132890h;

    /* renamed from: i, reason: collision with root package name */
    public final mb f132891i;

    /* renamed from: j, reason: collision with root package name */
    public final eb f132892j;

    public nb(String __typename, String id3, String entityId, List list, Integer num, Boolean bool, String str, List list2, mb mbVar, eb ebVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132883a = __typename;
        this.f132884b = id3;
        this.f132885c = entityId;
        this.f132886d = list;
        this.f132887e = num;
        this.f132888f = bool;
        this.f132889g = str;
        this.f132890h = list2;
        this.f132891i = mbVar;
        this.f132892j = ebVar;
    }

    @Override // z40.t
    public final String a() {
        return this.f132885c;
    }

    @Override // z40.n
    public final String b() {
        return this.f132883a;
    }

    @Override // z40.n
    public final Boolean c() {
        return this.f132888f;
    }

    @Override // z40.n
    public final z40.h d() {
        return this.f132892j;
    }

    @Override // z40.n
    public final String e() {
        return this.f132889g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb)) {
            return false;
        }
        nb nbVar = (nb) obj;
        return Intrinsics.d(this.f132883a, nbVar.f132883a) && Intrinsics.d(this.f132884b, nbVar.f132884b) && Intrinsics.d(this.f132885c, nbVar.f132885c) && Intrinsics.d(this.f132886d, nbVar.f132886d) && Intrinsics.d(this.f132887e, nbVar.f132887e) && Intrinsics.d(this.f132888f, nbVar.f132888f) && Intrinsics.d(this.f132889g, nbVar.f132889g) && Intrinsics.d(this.f132890h, nbVar.f132890h) && Intrinsics.d(this.f132891i, nbVar.f132891i) && Intrinsics.d(this.f132892j, nbVar.f132892j);
    }

    @Override // z40.n
    public final List f() {
        return this.f132890h;
    }

    @Override // z40.n
    public final z40.m g() {
        return this.f132891i;
    }

    @Override // z40.n
    public final String getId() {
        return this.f132884b;
    }

    @Override // z40.n
    public final List h() {
        return this.f132886d;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132885c, a.cb.d(this.f132884b, this.f132883a.hashCode() * 31, 31), 31);
        List list = this.f132886d;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f132887e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f132888f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f132889g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.f132890h;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        mb mbVar = this.f132891i;
        int hashCode6 = (hashCode5 + (mbVar == null ? 0 : mbVar.hashCode())) * 31;
        eb ebVar = this.f132892j;
        return hashCode6 + (ebVar != null ? ebVar.hashCode() : 0);
    }

    @Override // z40.n
    public final Integer i() {
        return this.f132887e;
    }

    public final String toString() {
        return "Node(__typename=" + this.f132883a + ", id=" + this.f132884b + ", entityId=" + this.f132885c + ", emails=" + this.f132886d + ", unread=" + this.f132887e + ", isEligibleForThreads=" + this.f132888f + ", pinsubTopicId=" + this.f132889g + ", readTimesMs=" + this.f132890h + ", users=" + this.f132891i + ", lastMessage=" + this.f132892j + ")";
    }
}
