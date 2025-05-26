package vv1;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f126765h;

    /* renamed from: i, reason: collision with root package name */
    public final List f126766i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f126767j;

    /* renamed from: k, reason: collision with root package name */
    public final String f126768k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f126769l;

    /* renamed from: m, reason: collision with root package name */
    public final String f126770m;

    public c(String titleText, List filteroptions, Function0 searchParametersProvider, String str, HashMap auxData, String str2) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(filteroptions, "filteroptions");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f126765h = titleText;
        this.f126766i = filteroptions;
        this.f126767j = searchParametersProvider;
        this.f126768k = str;
        this.f126769l = auxData;
        this.f126770m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f126765h, cVar.f126765h) && Intrinsics.d(this.f126766i, cVar.f126766i) && Intrinsics.d(this.f126767j, cVar.f126767j) && Intrinsics.d(this.f126768k, cVar.f126768k) && Intrinsics.d(this.f126769l, cVar.f126769l) && Intrinsics.d(this.f126770m, cVar.f126770m);
    }

    public final int hashCode() {
        int b13 = d7.g.b(this.f126767j, ep.b.c(this.f126766i, this.f126765h.hashCode() * 31, 31), 31);
        String str = this.f126768k;
        int d2 = a.c.d(this.f126769l, (b13 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f126770m;
        return d2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColorPaletteFilterBottomSheetViewModel(titleText=");
        sb3.append(this.f126765h);
        sb3.append(", filteroptions=");
        sb3.append(this.f126766i);
        sb3.append(", searchParametersProvider=");
        sb3.append(this.f126767j);
        sb3.append(", filterSelectedApiTerm=");
        sb3.append(this.f126768k);
        sb3.append(", auxData=");
        sb3.append(this.f126769l);
        sb3.append(", feedUrl=");
        return a.a.p(sb3, this.f126770m, ")");
    }
}
