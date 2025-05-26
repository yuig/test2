package y52;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f137831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f137832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(x0 x0Var, int i13) {
        super(1);
        this.f137831i = i13;
        this.f137832j = x0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f137831i;
        x0 x0Var = this.f137832j;
        switch (i13) {
            case 0:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = x0Var.getF73409e1();
                return Unit.f80348a;
            case 1:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return kn1.b.e(it, true, true, hn1.q.Center, bs1.c.j2(new String[0], ((Number) x0Var.f137878n0.getValue()).intValue()), null, null, null, 1952);
            default:
                ym1.c it2 = (ym1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String string = x0Var.getString(o52.e.board_preview_copy_link_tooltip);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return ym1.c.e(it2, kotlin.collections.e0.b(new u50.f0(string)), null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }
}
