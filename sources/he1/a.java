package he1;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import yk1.d;

/* loaded from: classes5.dex */
public interface a extends d {
    static void X3(a aVar, String navigationContext, ze1.d dVar, int i13) {
        Unit unit;
        if ((i13 & 2) != 0) {
            dVar = null;
        }
        je1.a aVar2 = (je1.a) aVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(navigationContext, "navigationContext");
        if (dVar != null) {
            HashMap f13 = z0.f(new Pair("brand_image_url", dVar.f141810a), new Pair("brand_name", dVar.f141811b), new Pair("brand_verification", String.valueOf(dVar.f141812c)), new Pair("brand_user_id", dVar.f141813d), new Pair("module_source", dVar.f141815f), new Pair("shop_source", dVar.f141817h));
            l lVar = aVar2.f75854l;
            if (lVar == null) {
                Intrinsics.r("uriNavigator");
                throw null;
            }
            Context context = aVar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            l.b(lVar, context, navigationContext, true, false, null, f13, 64);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            l lVar2 = aVar2.f75854l;
            if (lVar2 == null) {
                Intrinsics.r("uriNavigator");
                throw null;
            }
            Context context2 = aVar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            l.b(lVar2, context2, navigationContext, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
        }
    }
}
