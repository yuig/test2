package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57301b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f57302c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f57303d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57304e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f57305f;

    /* renamed from: g, reason: collision with root package name */
    public final List f57306g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f57307h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57308i;

    /* renamed from: j, reason: collision with root package name */
    public final String f57309j;

    /* renamed from: k, reason: collision with root package name */
    public final String f57310k;

    /* renamed from: l, reason: collision with root package name */
    public final String f57311l;

    public d0(String str, String str2, Boolean bool, Boolean bool2, String str3, Double d2, List list, Object obj, String str4, String str5, String str6, String str7) {
        this.f57300a = str;
        this.f57301b = str2;
        this.f57302c = bool;
        this.f57303d = bool2;
        this.f57304e = str3;
        this.f57305f = d2;
        this.f57306g = list;
        this.f57307h = obj;
        this.f57308i = str4;
        this.f57309j = str5;
        this.f57310k = str6;
        this.f57311l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f57300a, d0Var.f57300a) && Intrinsics.d(this.f57301b, d0Var.f57301b) && Intrinsics.d(this.f57302c, d0Var.f57302c) && Intrinsics.d(this.f57303d, d0Var.f57303d) && Intrinsics.d(this.f57304e, d0Var.f57304e) && Intrinsics.d(this.f57305f, d0Var.f57305f) && Intrinsics.d(this.f57306g, d0Var.f57306g) && Intrinsics.d(this.f57307h, d0Var.f57307h) && Intrinsics.d(this.f57308i, d0Var.f57308i) && Intrinsics.d(this.f57309j, d0Var.f57309j) && Intrinsics.d(this.f57310k, d0Var.f57310k) && Intrinsics.d(this.f57311l, d0Var.f57311l);
    }

    public final int hashCode() {
        String str = this.f57300a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57301b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f57302c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f57303d;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f57304e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.f57305f;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list = this.f57306g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.f57307h;
        int hashCode8 = (hashCode7 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.f57308i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57309j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57310k;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57311l;
        return hashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterOption(id=");
        sb3.append(this.f57300a);
        sb3.append(", imageUrl=");
        sb3.append(this.f57301b);
        sb3.append(", isSelected=");
        sb3.append(this.f57302c);
        sb3.append(", isVerified=");
        sb3.append(this.f57303d);
        sb3.append(", label=");
        sb3.append(this.f57304e);
        sb3.append(", numericValue=");
        sb3.append(this.f57305f);
        sb3.append(", rules=");
        sb3.append(this.f57306g);
        sb3.append(", searchType=");
        sb3.append(this.f57307h);
        sb3.append(", stringValue=");
        sb3.append(this.f57308i);
        sb3.append(", trackingParams=");
        sb3.append(this.f57309j);
        sb3.append(", type=");
        sb3.append(this.f57310k);
        sb3.append(", unit=");
        return a.a.p(sb3, this.f57311l, ")");
    }
}
