package vv1;

import a.cb;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f126778h;

    /* renamed from: i, reason: collision with root package name */
    public final List f126779i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f126780j;

    /* renamed from: k, reason: collision with root package name */
    public final String f126781k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f126782l;

    /* renamed from: m, reason: collision with root package name */
    public final String f126783m;

    /* renamed from: n, reason: collision with root package name */
    public final List f126784n;

    public j(String titleText, List filteroptions, Function0 searchParametersProvider, String savedSkinToneFilter, HashMap auxData, String str, List list) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(filteroptions, "filteroptions");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        Intrinsics.checkNotNullParameter(savedSkinToneFilter, "savedSkinToneFilter");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f126778h = titleText;
        this.f126779i = filteroptions;
        this.f126780j = searchParametersProvider;
        this.f126781k = savedSkinToneFilter;
        this.f126782l = auxData;
        this.f126783m = str;
        this.f126784n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f126778h, jVar.f126778h) && Intrinsics.d(this.f126779i, jVar.f126779i) && Intrinsics.d(this.f126780j, jVar.f126780j) && Intrinsics.d(this.f126781k, jVar.f126781k) && Intrinsics.d(this.f126782l, jVar.f126782l) && Intrinsics.d(this.f126783m, jVar.f126783m) && Intrinsics.d(this.f126784n, jVar.f126784n);
    }

    public final int hashCode() {
        int d2 = a.c.d(this.f126782l, cb.d(this.f126781k, d7.g.b(this.f126780j, ep.b.c(this.f126779i, this.f126778h.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f126783m;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f126784n;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final List n0() {
        return this.f126779i;
    }

    public final Function0 o0() {
        return this.f126780j;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SkinToneFilterBottomSheetViewModel(titleText=");
        sb3.append(this.f126778h);
        sb3.append(", filteroptions=");
        sb3.append(this.f126779i);
        sb3.append(", searchParametersProvider=");
        sb3.append(this.f126780j);
        sb3.append(", savedSkinToneFilter=");
        sb3.append(this.f126781k);
        sb3.append(", auxData=");
        sb3.append(this.f126782l);
        sb3.append(", feedUrl=");
        sb3.append(this.f126783m);
        sb3.append(", selectedOneBarModules=");
        return a.c.j(sb3, this.f126784n, ")");
    }
}
