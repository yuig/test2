package tb1;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.f4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f117135j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f117136k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f117137l = new g(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117138i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f117138i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f117138i) {
            case 0:
                Navigation it = (Navigation) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it, Navigation.w1(f4.b())));
            case 1:
                vy0 it2 = (vy0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.v0(Boolean.FALSE);
                wy0 a13 = it2.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                on1.b it3 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return on1.b.e(it3, true, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }
}
