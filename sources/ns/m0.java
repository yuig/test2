package ns;

import c61.m1;
import com.pinterest.api.model.vh;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z0;
import lh0.z3;
import o82.m3;

/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91940b;

    public /* synthetic */ m0(Object obj, int i13) {
        this.f91939a = i13;
        this.f91940b = obj;
    }

    @Override // o82.m3
    public final int a(int i13, l82.i0 i0Var) {
        int i14 = this.f91939a;
        Object obj = this.f91940b;
        switch (i14) {
            case 0:
                p0 this$0 = (p0) obj;
                v item = (v) i0Var;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "item");
                vh c13 = item.c();
                if (!c13.g0()) {
                    return c13.f42868z == z32.m0.STRUCTURED_FEED_GRID_SECTION ? a61.c.VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW.getType() : a61.c.VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW.getType();
                }
                if (i13 == 0) {
                    kh2.j.x2(this$0, e.f91908a);
                }
                return a61.c.VIEW_TYPE_IMMERSIVE_HEADER.getType();
            case 1:
                m7.c dynamicStoryRecyclerViewTypeCalculator = (m7.c) obj;
                h90.n0 item2 = (h90.n0) i0Var;
                Intrinsics.checkNotNullParameter(dynamicStoryRecyclerViewTypeCalculator, "$dynamicStoryRecyclerViewTypeCalculator");
                Intrinsics.checkNotNullParameter(item2, "item");
                if (item2 instanceof h90.l0) {
                    return pk.a0.j0(((h90.l0) item2).f68270a);
                }
                if (item2 instanceof h90.m0) {
                    return dynamicStoryRecyclerViewTypeCalculator.c(((h90.m0) item2).f68274a);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                cj0.e0 this$02 = (cj0.e0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter((cj0.i) i0Var, "<anonymous parameter 1>");
                lh0.r rVar = this$02.f27806d;
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                rVar.getClass();
                z3 z3Var = a4.f83297a;
                z0 z0Var = rVar.f83466a;
                g1 g1Var = (g1) z0Var;
                if (!g1Var.o("android_curation_automagical_board_quick_save", "enabled", z3Var) && !g1Var.l("android_curation_automagical_board_quick_save")) {
                    g1 g1Var2 = (g1) z0Var;
                    if (!g1Var2.o("android_curation_automagical_board_shopping_metadata_quick_save", "enabled", z3Var) && !g1Var2.l("android_curation_automagical_board_shopping_metadata_quick_save")) {
                        return 1000;
                    }
                }
                return 1001;
            default:
                m1 this$03 = (m1) obj;
                c61.j0 item3 = (c61.j0) i0Var;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(item3, "item");
                vh c14 = item3.c();
                if (c61.n0.f26628a.contains(c14.f42868z)) {
                    return this$03.f26615d.c(c14);
                }
                if (!c14.d0() && !c14.n0()) {
                    if (!c14.g0()) {
                        return c14.i0() ? a61.c.VIEW_TYPE_STORY_PINS_UPSELL.getType() : c14.h0() ? a61.c.VIEW_TYPE_UNIFIED_COMPONENT_BUNDLED.getType() : a61.c.VIEW_TYPE_IDEAS_BUBBLES.getType();
                    }
                    if (i13 == 0) {
                        kh2.j.x2(this$03, c61.s.f26639a);
                    }
                    return a61.c.VIEW_TYPE_IMMERSIVE_HEADER.getType();
                }
                return a61.c.VIEW_TYPE_SHOPPING_SPOTLIGHT.getType();
        }
    }
}
