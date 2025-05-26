package i01;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70648b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70649c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70652f;

    /* renamed from: g, reason: collision with root package name */
    public final String f70653g;

    /* renamed from: h, reason: collision with root package name */
    public final String f70654h;

    /* renamed from: i, reason: collision with root package name */
    public final String f70655i;

    public b1(String tabId, String str, int i13, String tabName, int i14, int i15, String queryPinId, String str2, String str3) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(queryPinId, "queryPinId");
        this.f70647a = tabId;
        this.f70648b = str;
        this.f70649c = i13;
        this.f70650d = tabName;
        this.f70651e = i14;
        this.f70652f = i15;
        this.f70653g = queryPinId;
        this.f70654h = str2;
        this.f70655i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f70647a, b1Var.f70647a) && Intrinsics.d(this.f70648b, b1Var.f70648b) && this.f70649c == b1Var.f70649c && Intrinsics.d(this.f70650d, b1Var.f70650d) && this.f70651e == b1Var.f70651e && this.f70652f == b1Var.f70652f && Intrinsics.d(this.f70653g, b1Var.f70653g) && Intrinsics.d(this.f70654h, b1Var.f70654h) && Intrinsics.d(this.f70655i, b1Var.f70655i);
    }

    public final int hashCode() {
        int hashCode = this.f70647a.hashCode() * 31;
        String str = this.f70648b;
        int d2 = cb.d(this.f70653g, ep.b.b(this.f70652f, ep.b.b(this.f70651e, cb.d(this.f70650d, ep.b.b(this.f70649c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.f70654h;
        int hashCode2 = (d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70655i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelatedPinsFilterTabLoggingSpec(tabId=");
        sb3.append(this.f70647a);
        sb3.append(", tabOptionId=");
        sb3.append(this.f70648b);
        sb3.append(", tabType=");
        sb3.append(this.f70649c);
        sb3.append(", tabName=");
        sb3.append(this.f70650d);
        sb3.append(", indexInObjects=");
        sb3.append(this.f70651e);
        sb3.append(", totalObjectCount=");
        sb3.append(this.f70652f);
        sb3.append(", queryPinId=");
        sb3.append(this.f70653g);
        sb3.append(", storyId=");
        sb3.append(this.f70654h);
        sb3.append(", selectedFilterOptionName=");
        return a.a.p(sb3, this.f70655i, ")");
    }
}
