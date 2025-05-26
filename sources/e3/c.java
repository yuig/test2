package e3;

import b3.w;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f57001j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f57002k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57003i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f57003i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f57003i;
        switch (i13) {
            case 0:
                d3.h hVar = (d3.h) obj;
                switch (i13) {
                    case 0:
                        break;
                    default:
                        d3.h.a0(hVar, w.f21389m, 0L, 0.0f, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                        break;
                }
                break;
            default:
                d3.h hVar2 = (d3.h) obj;
                switch (i13) {
                    case 0:
                        break;
                    default:
                        d3.h.a0(hVar2, w.f21389m, 0L, 0.0f, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
