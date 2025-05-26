package eb1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f58217j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f58218k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58219i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f58219i = i13;
    }

    public final jm1.b b(jm1.b it) {
        switch (this.f58219i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return jm1.b.e(it, fm1.c.GONE, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return jm1.b.e(it, fm1.c.VISIBLE, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58219i) {
        }
        return b((jm1.b) obj);
    }
}
