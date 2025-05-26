package qp;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fm1.c f104693j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, fm1.c cVar) {
        super(1);
        this.f104692i = i13;
        this.f104693j = cVar;
    }

    public final cm1.d b(cm1.d buttonGroup) {
        switch (this.f104692i) {
            case 2:
                Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
                return cm1.d.e(buttonGroup, yl1.b.f(buttonGroup.f28012a, null, false, this.f104693j, null, null, null, null, null, 0, null, 1019), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
                return cm1.d.e(buttonGroup, null, yl1.b.f(buttonGroup.f28013b, null, false, this.f104693j, null, null, null, null, null, 0, null, 1019), null, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f104692i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, this.f104693j, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f104692i) {
            case 0:
                em1.d displayState = (em1.d) obj;
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                em1.b bVar = displayState.f59598a;
                fm1.c visibility = this.f104693j;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                break;
        }
        return e((rn1.a) obj);
    }
}
