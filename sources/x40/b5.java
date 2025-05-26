package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b5 implements z40.n {

    /* renamed from: a, reason: collision with root package name */
    public final String f132005a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132006b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132007c;

    /* renamed from: d, reason: collision with root package name */
    public final List f132008d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f132009e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132010f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132011g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132012h;

    /* renamed from: i, reason: collision with root package name */
    public final a5 f132013i;

    /* renamed from: j, reason: collision with root package name */
    public final s4 f132014j;

    public b5(String __typename, String id3, String entityId, List list, Integer num, Boolean bool, String str, List list2, a5 a5Var, s4 s4Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132005a = __typename;
        this.f132006b = id3;
        this.f132007c = entityId;
        this.f132008d = list;
        this.f132009e = num;
        this.f132010f = bool;
        this.f132011g = str;
        this.f132012h = list2;
        this.f132013i = a5Var;
        this.f132014j = s4Var;
    }

    @Override // z40.t
    public final String a() {
        return this.f132007c;
    }

    @Override // z40.n
    public final String b() {
        return this.f132005a;
    }

    @Override // z40.n
    public final Boolean c() {
        return this.f132010f;
    }

    @Override // z40.n
    public final z40.h d() {
        return this.f132014j;
    }

    @Override // z40.n
    public final String e() {
        return this.f132011g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return Intrinsics.d(this.f132005a, b5Var.f132005a) && Intrinsics.d(this.f132006b, b5Var.f132006b) && Intrinsics.d(this.f132007c, b5Var.f132007c) && Intrinsics.d(this.f132008d, b5Var.f132008d) && Intrinsics.d(this.f132009e, b5Var.f132009e) && Intrinsics.d(this.f132010f, b5Var.f132010f) && Intrinsics.d(this.f132011g, b5Var.f132011g) && Intrinsics.d(this.f132012h, b5Var.f132012h) && Intrinsics.d(this.f132013i, b5Var.f132013i) && Intrinsics.d(this.f132014j, b5Var.f132014j);
    }

    @Override // z40.n
    public final List f() {
        return this.f132012h;
    }

    @Override // z40.n
    public final z40.m g() {
        return this.f132013i;
    }

    @Override // z40.n
    public final String getId() {
        return this.f132006b;
    }

    @Override // z40.n
    public final List h() {
        return this.f132008d;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132007c, a.cb.d(this.f132006b, this.f132005a.hashCode() * 31, 31), 31);
        List list = this.f132008d;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f132009e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f132010f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f132011g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.f132012h;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        a5 a5Var = this.f132013i;
        int hashCode6 = (hashCode5 + (a5Var == null ? 0 : a5Var.hashCode())) * 31;
        s4 s4Var = this.f132014j;
        return hashCode6 + (s4Var != null ? s4Var.hashCode() : 0);
    }

    @Override // z40.n
    public final Integer i() {
        return this.f132009e;
    }

    public final String toString() {
        return "Data(__typename=" + this.f132005a + ", id=" + this.f132006b + ", entityId=" + this.f132007c + ", emails=" + this.f132008d + ", unread=" + this.f132009e + ", isEligibleForThreads=" + this.f132010f + ", pinsubTopicId=" + this.f132011g + ", readTimesMs=" + this.f132012h + ", users=" + this.f132013i + ", lastMessage=" + this.f132014j + ")";
    }
}
