package u11;

import cm1.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f119993j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f119994k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f119995l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f119996i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f119996i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, i.a(), null, null, null, 0, null, 1007);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, i.b(), null, null, null, 0, null, 1007);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119996i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                return b((yl1.b) obj);
            default:
                d state = (d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return d.e(state, yl1.b.f(state.f28012a, null, false, null, null, null, null, null, null, 0, null, 1021), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }
}
