package jm1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f77027j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f77028k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f77029l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f77030i = i13;
    }

    public final b b(b it) {
        switch (this.f77030i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, fm1.c.INVISIBLE, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, fm1.c.VISIBLE, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77030i) {
            case 0:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((b) obj);
    }
}
