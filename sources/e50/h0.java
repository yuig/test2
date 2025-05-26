package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f57355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57356b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57357c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57358d;

    /* renamed from: e, reason: collision with root package name */
    public final List f57359e;

    /* renamed from: f, reason: collision with root package name */
    public final List f57360f;

    /* renamed from: g, reason: collision with root package name */
    public final List f57361g;

    public h0(List list, String str, Integer num, String str2, List list2, List list3, List list4) {
        this.f57355a = list;
        this.f57356b = str;
        this.f57357c = num;
        this.f57358d = str2;
        this.f57359e = list2;
        this.f57360f = list3;
        this.f57361g = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f57355a, h0Var.f57355a) && Intrinsics.d(this.f57356b, h0Var.f57356b) && Intrinsics.d(this.f57357c, h0Var.f57357c) && Intrinsics.d(this.f57358d, h0Var.f57358d) && Intrinsics.d(this.f57359e, h0Var.f57359e) && Intrinsics.d(this.f57360f, h0Var.f57360f) && Intrinsics.d(this.f57361g, h0Var.f57361g);
    }

    public final int hashCode() {
        List list = this.f57355a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f57356b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f57357c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f57358d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.f57359e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f57360f;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f57361g;
        return hashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Display(backgroundColorHex=");
        sb3.append(this.f57355a);
        sb3.append(", displayText=");
        sb3.append(this.f57356b);
        sb3.append(", icon=");
        sb3.append(this.f57357c);
        sb3.append(", iconUrl=");
        sb3.append(this.f57358d);
        sb3.append(", selectedBackgroundColorHex=");
        sb3.append(this.f57359e);
        sb3.append(", selectedTextColorHex=");
        sb3.append(this.f57360f);
        sb3.append(", textColorHex=");
        return a.c.j(sb3, this.f57361g, ")");
    }
}
