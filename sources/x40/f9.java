package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f9 implements z40.n {

    /* renamed from: a, reason: collision with root package name */
    public final String f132397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132398b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132399c;

    /* renamed from: d, reason: collision with root package name */
    public final List f132400d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f132401e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132402f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132403g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132404h;

    /* renamed from: i, reason: collision with root package name */
    public final e9 f132405i;

    /* renamed from: j, reason: collision with root package name */
    public final w8 f132406j;

    public f9(String __typename, String id3, String entityId, List list, Integer num, Boolean bool, String str, List list2, e9 e9Var, w8 w8Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132397a = __typename;
        this.f132398b = id3;
        this.f132399c = entityId;
        this.f132400d = list;
        this.f132401e = num;
        this.f132402f = bool;
        this.f132403g = str;
        this.f132404h = list2;
        this.f132405i = e9Var;
        this.f132406j = w8Var;
    }

    @Override // z40.t
    public final String a() {
        return this.f132399c;
    }

    @Override // z40.n
    public final String b() {
        return this.f132397a;
    }

    @Override // z40.n
    public final Boolean c() {
        return this.f132402f;
    }

    @Override // z40.n
    public final z40.h d() {
        return this.f132406j;
    }

    @Override // z40.n
    public final String e() {
        return this.f132403g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return Intrinsics.d(this.f132397a, f9Var.f132397a) && Intrinsics.d(this.f132398b, f9Var.f132398b) && Intrinsics.d(this.f132399c, f9Var.f132399c) && Intrinsics.d(this.f132400d, f9Var.f132400d) && Intrinsics.d(this.f132401e, f9Var.f132401e) && Intrinsics.d(this.f132402f, f9Var.f132402f) && Intrinsics.d(this.f132403g, f9Var.f132403g) && Intrinsics.d(this.f132404h, f9Var.f132404h) && Intrinsics.d(this.f132405i, f9Var.f132405i) && Intrinsics.d(this.f132406j, f9Var.f132406j);
    }

    @Override // z40.n
    public final List f() {
        return this.f132404h;
    }

    @Override // z40.n
    public final z40.m g() {
        return this.f132405i;
    }

    @Override // z40.n
    public final String getId() {
        return this.f132398b;
    }

    @Override // z40.n
    public final List h() {
        return this.f132400d;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132399c, a.cb.d(this.f132398b, this.f132397a.hashCode() * 31, 31), 31);
        List list = this.f132400d;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f132401e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f132402f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f132403g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.f132404h;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        e9 e9Var = this.f132405i;
        int hashCode6 = (hashCode5 + (e9Var == null ? 0 : e9Var.hashCode())) * 31;
        w8 w8Var = this.f132406j;
        return hashCode6 + (w8Var != null ? w8Var.hashCode() : 0);
    }

    @Override // z40.n
    public final Integer i() {
        return this.f132401e;
    }

    public final String toString() {
        return "Data(__typename=" + this.f132397a + ", id=" + this.f132398b + ", entityId=" + this.f132399c + ", emails=" + this.f132400d + ", unread=" + this.f132401e + ", isEligibleForThreads=" + this.f132402f + ", pinsubTopicId=" + this.f132403g + ", readTimesMs=" + this.f132404h + ", users=" + this.f132405i + ", lastMessage=" + this.f132406j + ")";
    }
}
