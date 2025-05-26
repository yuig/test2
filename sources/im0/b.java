package im0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import on1.k;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f72600j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f72601k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72602i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f72602i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72602i) {
            case 0:
                k it = (k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return k.e(it, on1.b.e(it.f96740a, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f(it2, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
