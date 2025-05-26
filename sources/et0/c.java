package et0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o82.l0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f60021i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o12.b response = (o12.b) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        List<dl1.s> list = response.f92783a;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (dl1.s sVar : list) {
            Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
            arrayList.add(new xs0.g0((f30) sVar, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL));
        }
        return new l0(arrayList, response.f92784b);
    }
}
