package jm1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f77031j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f77032k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f77033l = new e(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f77034i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f77034i;
        switch (i13) {
            case 0:
                b checkAndApplyDiff = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f77026g);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.f77020a.getVisibility());
                }
            case 1:
                b checkAndApplyDiff2 = (b) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff2.f77026g);
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff2.f77020a.getVisibility());
                }
            default:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return b.e(it, fm1.c.GONE, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }
}
