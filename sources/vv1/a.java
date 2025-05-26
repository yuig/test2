package vv1;

import a.cb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f126756h;

    /* renamed from: i, reason: collision with root package name */
    public final String f126757i;

    /* renamed from: j, reason: collision with root package name */
    public final String f126758j;

    /* renamed from: k, reason: collision with root package name */
    public final List f126759k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f126760l;

    /* renamed from: m, reason: collision with root package name */
    public final String f126761m;

    /* renamed from: n, reason: collision with root package name */
    public final String f126762n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f126763o;

    /* renamed from: p, reason: collision with root package name */
    public final List f126764p;

    public a(String titleText, String str, String educationActionString, ArrayList filteroptions, yj1.d searchParametersProvider, String str2, String str3, HashMap bodyTypeAuxData, List list) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(educationActionString, "educationActionString");
        Intrinsics.checkNotNullParameter(filteroptions, "filteroptions");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        Intrinsics.checkNotNullParameter(bodyTypeAuxData, "bodyTypeAuxData");
        this.f126756h = titleText;
        this.f126757i = str;
        this.f126758j = educationActionString;
        this.f126759k = filteroptions;
        this.f126760l = searchParametersProvider;
        this.f126761m = str2;
        this.f126762n = str3;
        this.f126763o = bodyTypeAuxData;
        this.f126764p = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f126756h, aVar.f126756h) && Intrinsics.d(this.f126757i, aVar.f126757i) && Intrinsics.d(this.f126758j, aVar.f126758j) && Intrinsics.d(this.f126759k, aVar.f126759k) && Intrinsics.d(this.f126760l, aVar.f126760l) && Intrinsics.d(this.f126761m, aVar.f126761m) && Intrinsics.d(this.f126762n, aVar.f126762n) && Intrinsics.d(this.f126763o, aVar.f126763o) && Intrinsics.d(this.f126764p, aVar.f126764p);
    }

    public final int hashCode() {
        int hashCode = this.f126756h.hashCode() * 31;
        String str = this.f126757i;
        int b13 = d7.g.b(this.f126760l, ep.b.c(this.f126759k, cb.d(this.f126758j, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.f126761m;
        int hashCode2 = (b13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126762n;
        int d2 = a.c.d(this.f126763o, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        List list = this.f126764p;
        return d2 + (list != null ? list.hashCode() : 0);
    }

    public final List n0() {
        return this.f126759k;
    }

    public final Function0 o0() {
        return this.f126760l;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyTypeFilterBottomSheetViewModel(titleText=");
        sb3.append(this.f126756h);
        sb3.append(", subtitle=");
        sb3.append(this.f126757i);
        sb3.append(", educationActionString=");
        sb3.append(this.f126758j);
        sb3.append(", filteroptions=");
        sb3.append(this.f126759k);
        sb3.append(", searchParametersProvider=");
        sb3.append(this.f126760l);
        sb3.append(", selectedBodyTypeFilter=");
        sb3.append(this.f126761m);
        sb3.append(", feedUrl=");
        sb3.append(this.f126762n);
        sb3.append(", bodyTypeAuxData=");
        sb3.append(this.f126763o);
        sb3.append(", selectedOneBarModules=");
        return a.c.j(sb3, this.f126764p, ")");
    }
}
