package xs;

import com.pinterest.api.model.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.c1;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final k80.a f135697a;

    public a0(k80.a jsonLogger) {
        Intrinsics.checkNotNullParameter(jsonLogger, "jsonLogger");
        this.f135697a = jsonLogger;
    }

    public static c a(zy.a aVar) {
        return new c(new zy.e0(aVar));
    }

    public static c b(i0 context, String id3, HashMap auxData, b1 b1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        f1 f1Var = f1.PIN_CARTING_SHEET_LOAD;
        Boolean bool = Boolean.FALSE;
        return a(new zy.a(context, f1Var, id3, auxData, new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b1Var != null ? z.b(b1Var, id3, null) : null), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
    }
}
