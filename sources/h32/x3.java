package h32;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x3 {

    /* renamed from: r, reason: collision with root package name */
    public static final c50.w2 f67396r = new c50.w2(20);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f67397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67398b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f67399c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67400d;

    /* renamed from: e, reason: collision with root package name */
    public final String f67401e;

    /* renamed from: f, reason: collision with root package name */
    public final String f67402f;

    /* renamed from: g, reason: collision with root package name */
    public final List f67403g;

    /* renamed from: h, reason: collision with root package name */
    public final String f67404h;

    /* renamed from: i, reason: collision with root package name */
    public final String f67405i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67406j;

    /* renamed from: k, reason: collision with root package name */
    public final String f67407k;

    /* renamed from: l, reason: collision with root package name */
    public final String f67408l;

    /* renamed from: m, reason: collision with root package name */
    public final String f67409m;

    /* renamed from: n, reason: collision with root package name */
    public final String f67410n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f67411o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f67412p;

    /* renamed from: q, reason: collision with root package name */
    public final String f67413q;

    public x3(Integer num, String str, Long l13, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num2, Boolean bool, String str12) {
        this.f67397a = num;
        this.f67398b = str;
        this.f67399c = l13;
        this.f67400d = str2;
        this.f67401e = str3;
        this.f67402f = str4;
        this.f67403g = list;
        this.f67404h = str5;
        this.f67405i = str6;
        this.f67406j = str7;
        this.f67407k = str8;
        this.f67408l = str9;
        this.f67409m = str10;
        this.f67410n = str11;
        this.f67411o = num2;
        this.f67412p = bool;
        this.f67413q = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return Intrinsics.d(this.f67397a, x3Var.f67397a) && Intrinsics.d(this.f67398b, x3Var.f67398b) && Intrinsics.d(this.f67399c, x3Var.f67399c) && Intrinsics.d(null, null) && Intrinsics.d(this.f67400d, x3Var.f67400d) && Intrinsics.d(this.f67401e, x3Var.f67401e) && Intrinsics.d(this.f67402f, x3Var.f67402f) && Intrinsics.d(this.f67403g, x3Var.f67403g) && Intrinsics.d(this.f67404h, x3Var.f67404h) && Intrinsics.d(this.f67405i, x3Var.f67405i) && Intrinsics.d(this.f67406j, x3Var.f67406j) && Intrinsics.d(this.f67407k, x3Var.f67407k) && Intrinsics.d(this.f67408l, x3Var.f67408l) && Intrinsics.d(this.f67409m, x3Var.f67409m) && Intrinsics.d(this.f67410n, x3Var.f67410n) && Intrinsics.d(this.f67411o, x3Var.f67411o) && Intrinsics.d(this.f67412p, x3Var.f67412p) && Intrinsics.d(this.f67413q, x3Var.f67413q);
    }

    public final int hashCode() {
        Integer num = this.f67397a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f67398b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l13 = this.f67399c;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 961;
        String str2 = this.f67400d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67401e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f67402f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f67403g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f67404h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f67405i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f67406j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f67407k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f67408l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f67409m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f67410n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.f67411o;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f67412p;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.f67413q;
        return hashCode16 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ViewData(stub=");
        sb3.append(this.f67397a);
        sb3.append(", interestName=");
        sb3.append(this.f67398b);
        sb3.append(", viewObjectId=");
        sb3.append(this.f67399c);
        sb3.append(", objectData=null, searchQuery=");
        sb3.append(this.f67400d);
        sb3.append(", analyticsSelectedApplication=");
        sb3.append(this.f67401e);
        sb3.append(", viewObjectIdStr=");
        sb3.append(this.f67402f);
        sb3.append(", closeupRichTypes=");
        sb3.append(this.f67403g);
        sb3.append(", interestId=");
        sb3.append(this.f67404h);
        sb3.append(", interestLanguage=");
        sb3.append(this.f67405i);
        sb3.append(", feedInsertionId=");
        sb3.append(this.f67406j);
        sb3.append(", country=");
        sb3.append(this.f67407k);
        sb3.append(", timezone=");
        sb3.append(this.f67408l);
        sb3.append(", taxonomyIds=");
        sb3.append(this.f67409m);
        sb3.append(", taxonomyTitle=");
        sb3.append(this.f67410n);
        sb3.append(", taxonomyDrillLevel=");
        sb3.append(this.f67411o);
        sb3.append(", isCurrentUser=");
        sb3.append(this.f67412p);
        sb3.append(", parentPairId=");
        return a.a.p(sb3, this.f67413q, ")");
    }
}
