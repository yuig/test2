package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f57378a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57379b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57380c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57381d;

    /* renamed from: e, reason: collision with root package name */
    public final List f57382e;

    /* renamed from: f, reason: collision with root package name */
    public final List f57383f;

    /* renamed from: g, reason: collision with root package name */
    public final List f57384g;

    public k0(List list, String str, Integer num, String str2, List list2, List list3, List list4) {
        this.f57378a = list;
        this.f57379b = str;
        this.f57380c = num;
        this.f57381d = str2;
        this.f57382e = list2;
        this.f57383f = list3;
        this.f57384g = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f57378a, k0Var.f57378a) && Intrinsics.d(this.f57379b, k0Var.f57379b) && Intrinsics.d(this.f57380c, k0Var.f57380c) && Intrinsics.d(this.f57381d, k0Var.f57381d) && Intrinsics.d(this.f57382e, k0Var.f57382e) && Intrinsics.d(this.f57383f, k0Var.f57383f) && Intrinsics.d(this.f57384g, k0Var.f57384g);
    }

    public final int hashCode() {
        List list = this.f57378a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f57379b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f57380c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57381d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.f57382e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f57383f;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f57384g;
        return hashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Display(backgroundColorHex=");
        sb3.append(this.f57378a);
        sb3.append(", displayText=");
        sb3.append(this.f57379b);
        sb3.append(", icon=");
        sb3.append(this.f57380c);
        sb3.append(", iconUrl=");
        sb3.append(this.f57381d);
        sb3.append(", selectedBackgroundColorHex=");
        sb3.append(this.f57382e);
        sb3.append(", selectedTextColorHex=");
        sb3.append(this.f57383f);
        sb3.append(", textColorHex=");
        return a.c.j(sb3, this.f57384g, ")");
    }
}
