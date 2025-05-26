package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n1 implements z40.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f132858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132860c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f132861d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f132862e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132863f;

    /* renamed from: g, reason: collision with root package name */
    public final m1 f132864g;

    /* renamed from: h, reason: collision with root package name */
    public final List f132865h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132866i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f132867j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132868k;

    public n1(String __typename, String id3, String entityId, Integer num, Object obj, String str, m1 m1Var, List list, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132858a = __typename;
        this.f132859b = id3;
        this.f132860c = entityId;
        this.f132861d = num;
        this.f132862e = obj;
        this.f132863f = str;
        this.f132864g = m1Var;
        this.f132865h = list;
        this.f132866i = str2;
        this.f132867j = bool;
        this.f132868k = str3;
    }

    @Override // z40.o
    public final String a() {
        return this.f132860c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.d(this.f132858a, n1Var.f132858a) && Intrinsics.d(this.f132859b, n1Var.f132859b) && Intrinsics.d(this.f132860c, n1Var.f132860c) && Intrinsics.d(this.f132861d, n1Var.f132861d) && Intrinsics.d(this.f132862e, n1Var.f132862e) && Intrinsics.d(this.f132863f, n1Var.f132863f) && Intrinsics.d(this.f132864g, n1Var.f132864g) && Intrinsics.d(this.f132865h, n1Var.f132865h) && Intrinsics.d(this.f132866i, n1Var.f132866i) && Intrinsics.d(this.f132867j, n1Var.f132867j) && Intrinsics.d(this.f132868k, n1Var.f132868k);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132860c, a.cb.d(this.f132859b, this.f132858a.hashCode() * 31, 31), 31);
        Integer num = this.f132861d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f132862e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f132863f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        m1 m1Var = this.f132864g;
        int hashCode4 = (hashCode3 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        List list = this.f132865h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f132866i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f132867j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f132868k;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f132858a);
        sb3.append(", id=");
        sb3.append(this.f132859b);
        sb3.append(", entityId=");
        sb3.append(this.f132860c);
        sb3.append(", pinCount=");
        sb3.append(this.f132861d);
        sb3.append(", privacy=");
        sb3.append(this.f132862e);
        sb3.append(", name=");
        sb3.append(this.f132863f);
        sb3.append(", owner=");
        sb3.append(this.f132864g);
        sb3.append(", pinThumbnailUrls=");
        sb3.append(this.f132865h);
        sb3.append(", imageCoverHdUrl=");
        sb3.append(this.f132866i);
        sb3.append(", hasCustomCover=");
        sb3.append(this.f132867j);
        sb3.append(", imageCoverUrl=");
        return a.a.p(sb3, this.f132868k, ")");
    }
}
