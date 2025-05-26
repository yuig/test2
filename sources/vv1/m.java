package vv1;

import com.pinterest.api.model.g00;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f126785h;

    /* renamed from: i, reason: collision with root package name */
    public final g00 f126786i;

    /* renamed from: j, reason: collision with root package name */
    public final List f126787j;

    /* renamed from: k, reason: collision with root package name */
    public final ov1.a f126788k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f126789l;

    /* renamed from: m, reason: collision with root package name */
    public final ov1.e f126790m;

    /* renamed from: n, reason: collision with root package name */
    public final String f126791n;

    public m(String titleText, g00 structuredGuide, List onebarmodules, ov1.a oneBarInternalListener, Function0 searchParametersProvider, ov1.e oneBarContainerSelectionMode, String str) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(structuredGuide, "structuredGuide");
        Intrinsics.checkNotNullParameter(onebarmodules, "onebarmodules");
        Intrinsics.checkNotNullParameter(oneBarInternalListener, "oneBarInternalListener");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        Intrinsics.checkNotNullParameter(oneBarContainerSelectionMode, "oneBarContainerSelectionMode");
        this.f126785h = titleText;
        this.f126786i = structuredGuide;
        this.f126787j = onebarmodules;
        this.f126788k = oneBarInternalListener;
        this.f126789l = searchParametersProvider;
        this.f126790m = oneBarContainerSelectionMode;
        this.f126791n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f126785h, mVar.f126785h) && Intrinsics.d(this.f126786i, mVar.f126786i) && Intrinsics.d(this.f126787j, mVar.f126787j) && Intrinsics.d(this.f126788k, mVar.f126788k) && Intrinsics.d(this.f126789l, mVar.f126789l) && this.f126790m == mVar.f126790m && Intrinsics.d(this.f126791n, mVar.f126791n);
    }

    public final int hashCode() {
        int hashCode = (this.f126790m.hashCode() + d7.g.b(this.f126789l, (this.f126788k.hashCode() + ep.b.c(this.f126787j, (this.f126786i.hashCode() + (this.f126785h.hashCode() * 31)) * 31, 31)) * 31, 31)) * 31;
        String str = this.f126791n;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StructuredGuideBottomSheetViewModel(titleText=");
        sb3.append(this.f126785h);
        sb3.append(", structuredGuide=");
        sb3.append(this.f126786i);
        sb3.append(", onebarmodules=");
        sb3.append(this.f126787j);
        sb3.append(", oneBarInternalListener=");
        sb3.append(this.f126788k);
        sb3.append(", searchParametersProvider=");
        sb3.append(this.f126789l);
        sb3.append(", oneBarContainerSelectionMode=");
        sb3.append(this.f126790m);
        sb3.append(", singleSelectionModuleUid=");
        return a.a.p(sb3, this.f126791n, ")");
    }
}
