package k92;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: g, reason: collision with root package name */
    public final c f78869g;

    public b(c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f78869g = config;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        do1.e eVar;
        Intrinsics.checkNotNullParameter(container, "container");
        c cVar = this.f78869g;
        if (cVar.f78873d) {
            String str = cVar.f78871b;
            if (str == null) {
                throw new IllegalArgumentException("User image URL is required");
            }
            String str2 = cVar.f78874e;
            if (str2 == null) {
                str2 = "";
            }
            eVar = new do1.e(str, str2);
        } else {
            eVar = null;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        i0 i0Var = cVar.f78872c;
        return new GestaltToast(context, new do1.d(cVar.f78870a, eVar, i0Var != null ? new do1.b(i0Var, new c72.o(this, 9)) : null, cVar.f78875f, 0, 0, 0, null, cVar.f78876g, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
    }
}
