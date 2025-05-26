package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57287a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57288b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f57289c;

    /* renamed from: d, reason: collision with root package name */
    public final List f57290d;

    /* renamed from: e, reason: collision with root package name */
    public final List f57291e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f57292f;

    /* renamed from: g, reason: collision with root package name */
    public final o0 f57293g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f57294h;

    public c1(String str, List list, b0 b0Var, List list2, List list3, m0 pageInfo, o0 o0Var, b1 b1Var) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f57287a = str;
        this.f57288b = list;
        this.f57289c = b0Var;
        this.f57290d = list2;
        this.f57291e = list3;
        this.f57292f = pageInfo;
        this.f57293g = o0Var;
        this.f57294h = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.f57287a, c1Var.f57287a) && Intrinsics.d(this.f57288b, c1Var.f57288b) && Intrinsics.d(this.f57289c, c1Var.f57289c) && Intrinsics.d(this.f57290d, c1Var.f57290d) && Intrinsics.d(this.f57291e, c1Var.f57291e) && Intrinsics.d(this.f57292f, c1Var.f57292f) && Intrinsics.d(this.f57293g, c1Var.f57293g) && Intrinsics.d(this.f57294h, c1Var.f57294h);
    }

    public final int hashCode() {
        String str = this.f57287a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f57288b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        b0 b0Var = this.f57289c;
        int hashCode3 = (hashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        List list2 = this.f57290d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f57291e;
        int hashCode5 = (this.f57292f.hashCode() + ((hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31)) * 31;
        o0 o0Var = this.f57293g;
        int hashCode6 = (hashCode5 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        b1 b1Var = this.f57294h;
        return hashCode6 + (b1Var != null ? b1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Connection(clientTrackingParams=" + this.f57287a + ", edges=" + this.f57288b + ", modeIcon=" + this.f57289c + ", oneBarModules=" + this.f57290d + ", oneBarFilters=" + this.f57291e + ", pageInfo=" + this.f57292f + ", searchfeedTabs=" + this.f57293g + ", sensitivity=" + this.f57294h + ")";
    }
}
