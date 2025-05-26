package vv1;

import a.cb;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f126771h;

    /* renamed from: i, reason: collision with root package name */
    public final List f126772i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f126773j;

    /* renamed from: k, reason: collision with root package name */
    public final String f126774k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f126775l;

    /* renamed from: m, reason: collision with root package name */
    public final String f126776m;

    /* renamed from: n, reason: collision with root package name */
    public final List f126777n;

    public e(String titleText, List filteroptions, Function0 searchParametersProvider, String savedHairPattern, HashMap auxData, String str, List list) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(filteroptions, "filteroptions");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        Intrinsics.checkNotNullParameter(savedHairPattern, "savedHairPattern");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f126771h = titleText;
        this.f126772i = filteroptions;
        this.f126773j = searchParametersProvider;
        this.f126774k = savedHairPattern;
        this.f126775l = auxData;
        this.f126776m = str;
        this.f126777n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f126771h, eVar.f126771h) && Intrinsics.d(this.f126772i, eVar.f126772i) && Intrinsics.d(this.f126773j, eVar.f126773j) && Intrinsics.d(this.f126774k, eVar.f126774k) && Intrinsics.d(this.f126775l, eVar.f126775l) && Intrinsics.d(this.f126776m, eVar.f126776m) && Intrinsics.d(this.f126777n, eVar.f126777n);
    }

    public final int hashCode() {
        int d2 = a.c.d(this.f126775l, cb.d(this.f126774k, d7.g.b(this.f126773j, ep.b.c(this.f126772i, this.f126771h.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f126776m;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f126777n;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final List n0() {
        return this.f126772i;
    }

    public final Function0 o0() {
        return this.f126773j;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HairPatternFilterBottomSheetViewModel(titleText=");
        sb3.append(this.f126771h);
        sb3.append(", filteroptions=");
        sb3.append(this.f126772i);
        sb3.append(", searchParametersProvider=");
        sb3.append(this.f126773j);
        sb3.append(", savedHairPattern=");
        sb3.append(this.f126774k);
        sb3.append(", auxData=");
        sb3.append(this.f126775l);
        sb3.append(", feedUrl=");
        sb3.append(this.f126776m);
        sb3.append(", selectedOneBarModules=");
        return a.c.j(sb3, this.f126777n, ")");
    }
}
