package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e3 implements f3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132301b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132302c;

    /* renamed from: d, reason: collision with root package name */
    public final List f132303d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f132304e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132305f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132306g;

    /* renamed from: h, reason: collision with root package name */
    public final d3 f132307h;

    /* renamed from: i, reason: collision with root package name */
    public final List f132308i;

    /* renamed from: j, reason: collision with root package name */
    public final v2 f132309j;

    public e3(String __typename, String id3, String entityId, List list, Integer num, Boolean bool, String str, d3 d3Var, List list2, v2 v2Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132300a = __typename;
        this.f132301b = id3;
        this.f132302c = entityId;
        this.f132303d = list;
        this.f132304e = num;
        this.f132305f = bool;
        this.f132306g = str;
        this.f132307h = d3Var;
        this.f132308i = list2;
        this.f132309j = v2Var;
    }

    public final String a() {
        return this.f132302c;
    }

    public final String b() {
        return this.f132301b;
    }

    public final String c() {
        return this.f132306g;
    }

    public final Integer d() {
        return this.f132304e;
    }

    public final Boolean e() {
        return this.f132305f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return Intrinsics.d(this.f132300a, e3Var.f132300a) && Intrinsics.d(this.f132301b, e3Var.f132301b) && Intrinsics.d(this.f132302c, e3Var.f132302c) && Intrinsics.d(this.f132303d, e3Var.f132303d) && Intrinsics.d(this.f132304e, e3Var.f132304e) && Intrinsics.d(this.f132305f, e3Var.f132305f) && Intrinsics.d(this.f132306g, e3Var.f132306g) && Intrinsics.d(this.f132307h, e3Var.f132307h) && Intrinsics.d(this.f132308i, e3Var.f132308i) && Intrinsics.d(this.f132309j, e3Var.f132309j);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132302c, a.cb.d(this.f132301b, this.f132300a.hashCode() * 31, 31), 31);
        List list = this.f132303d;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f132304e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f132305f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f132306g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        d3 d3Var = this.f132307h;
        int hashCode5 = (hashCode4 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        List list2 = this.f132308i;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        v2 v2Var = this.f132309j;
        return hashCode6 + (v2Var != null ? v2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ConversationNode(__typename=" + this.f132300a + ", id=" + this.f132301b + ", entityId=" + this.f132302c + ", emails=" + this.f132303d + ", unread=" + this.f132304e + ", isEligibleForThreads=" + this.f132305f + ", pinsubTopicId=" + this.f132306g + ", users=" + this.f132307h + ", readTimesMs=" + this.f132308i + ", lastMessage=" + this.f132309j + ")";
    }
}
