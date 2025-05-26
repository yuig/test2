package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57276b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f57277c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f57278d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57279e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f57280f;

    /* renamed from: g, reason: collision with root package name */
    public final List f57281g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f57282h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57283i;

    /* renamed from: j, reason: collision with root package name */
    public final String f57284j;

    /* renamed from: k, reason: collision with root package name */
    public final String f57285k;

    /* renamed from: l, reason: collision with root package name */
    public final String f57286l;

    public c0(String str, String str2, Boolean bool, Boolean bool2, String str3, Double d2, List list, Object obj, String str4, String str5, String str6, String str7) {
        this.f57275a = str;
        this.f57276b = str2;
        this.f57277c = bool;
        this.f57278d = bool2;
        this.f57279e = str3;
        this.f57280f = d2;
        this.f57281g = list;
        this.f57282h = obj;
        this.f57283i = str4;
        this.f57284j = str5;
        this.f57285k = str6;
        this.f57286l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f57275a, c0Var.f57275a) && Intrinsics.d(this.f57276b, c0Var.f57276b) && Intrinsics.d(this.f57277c, c0Var.f57277c) && Intrinsics.d(this.f57278d, c0Var.f57278d) && Intrinsics.d(this.f57279e, c0Var.f57279e) && Intrinsics.d(this.f57280f, c0Var.f57280f) && Intrinsics.d(this.f57281g, c0Var.f57281g) && Intrinsics.d(this.f57282h, c0Var.f57282h) && Intrinsics.d(this.f57283i, c0Var.f57283i) && Intrinsics.d(this.f57284j, c0Var.f57284j) && Intrinsics.d(this.f57285k, c0Var.f57285k) && Intrinsics.d(this.f57286l, c0Var.f57286l);
    }

    public final int hashCode() {
        String str = this.f57275a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57276b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f57277c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f57278d;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f57279e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.f57280f;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list = this.f57281g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.f57282h;
        int hashCode8 = (hashCode7 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.f57283i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57284j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57285k;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57286l;
        return hashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AppliedFilterOption(id=");
        sb3.append(this.f57275a);
        sb3.append(", imageUrl=");
        sb3.append(this.f57276b);
        sb3.append(", isSelected=");
        sb3.append(this.f57277c);
        sb3.append(", isVerified=");
        sb3.append(this.f57278d);
        sb3.append(", label=");
        sb3.append(this.f57279e);
        sb3.append(", numericValue=");
        sb3.append(this.f57280f);
        sb3.append(", rules=");
        sb3.append(this.f57281g);
        sb3.append(", searchType=");
        sb3.append(this.f57282h);
        sb3.append(", stringValue=");
        sb3.append(this.f57283i);
        sb3.append(", trackingParams=");
        sb3.append(this.f57284j);
        sb3.append(", type=");
        sb3.append(this.f57285k);
        sb3.append(", unit=");
        return a.a.p(sb3, this.f57286l, ")");
    }
}
