package cm1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28004i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yl1.e f28005j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(yl1.e eVar, int i13) {
        super(1);
        this.f28004i = i13;
        this.f28005j = eVar;
    }

    public final d b(d buttonGroup) {
        switch (this.f28004i) {
            case 0:
                Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
                return d.e(buttonGroup, yl1.b.f(buttonGroup.f28012a, null, false, null, null, null, null, null, null, 0, this.f28005j, 511), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
                return d.e(buttonGroup, null, yl1.b.f(buttonGroup.f28013b, null, false, null, null, null, null, null, null, 0, this.f28005j, 511), null, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f28004i) {
        }
        return b((d) obj);
    }
}
