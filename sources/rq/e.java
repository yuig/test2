package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.divider.GestaltDivider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, int i13) {
        super(0, obj, f.class, "getDivider", "getDivider()Lcom/pinterest/gestalt/divider/GestaltDivider;", 0);
        this.f109146a = i13;
        switch (i13) {
            case 1:
                super(0, obj, j1.class, "getDivider", "getDivider()Lcom/pinterest/gestalt/divider/GestaltDivider;", 0);
                break;
            case 2:
                super(0, obj, j1.class, "getDivider", "getDivider()Lcom/pinterest/gestalt/divider/GestaltDivider;", 0);
                break;
            case 3:
                super(0, obj, j2.class, "logModuleExpand", "logModuleExpand()V", 0);
                break;
            case 4:
                super(0, obj, j2.class, "logModuleCollapse", "logModuleCollapse()V", 0);
                break;
            case 5:
                super(0, obj, x2.class, "logModuleCollapse", "logModuleCollapse()V", 0);
                break;
            case 6:
                super(0, obj, x2.class, "logModuleExpand", "logModuleExpand()V", 0);
                break;
            case 7:
                super(0, obj, t3.class, "logModuleExpand", "logModuleExpand()V", 0);
                break;
            case 8:
                super(0, obj, t3.class, "logModuleCollapse", "logModuleCollapse()V", 0);
                break;
            default:
                break;
        }
    }

    public final GestaltDivider h() {
        switch (this.f109146a) {
            case 0:
                f fVar = (f) this.receiver;
                fVar.getClass();
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltDivider gestaltDivider = new GestaltDivider(6, context, (AttributeSet) null);
                int dimensionPixelOffset = gestaltDivider.getResources().getDimensionPixelOffset(eo1.c.space_300);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, dimensionPixelOffset, 0, 0);
                gestaltDivider.setLayoutParams(layoutParams);
                break;
        }
        return j1.b((j1) this.receiver);
    }

    public final void i() {
        int i13;
        h32.u0 u0Var = null;
        switch (this.f109146a) {
            case 3:
                j2 j2Var = (j2) this.receiver;
                int i14 = j2.f109287n;
                nx.d0 viewPinalytics = j2Var.getViewPinalytics();
                if (viewPinalytics != null) {
                    viewPinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.RICH_RECIPE_EXPAND_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_CLOSEUP_RECIPE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
            case 4:
                j2 j2Var2 = (j2) this.receiver;
                int i15 = j2.f109287n;
                nx.d0 viewPinalytics2 = j2Var2.getViewPinalytics();
                if (viewPinalytics2 != null) {
                    viewPinalytics2.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.RICH_RECIPE_COLLAPSE_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_CLOSEUP_RECIPE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
            case 5:
                x2 x2Var = (x2) this.receiver;
                h32.g0 g0Var = x2Var.f109649e;
                i13 = g0Var != null ? t2.f109553a[g0Var.ordinal()] : -1;
                if (i13 == 1) {
                    u0Var = h32.u0.SKIN_TONE_FILTER_COLLAPSE_BUTTON;
                } else if (i13 == 2) {
                    u0Var = h32.u0.HAIR_PATTERN_FILTER_COLLAPSE_BUTTON;
                }
                h32.u0 u0Var2 = u0Var;
                nx.d0 viewPinalytics3 = x2Var.getViewPinalytics();
                if (viewPinalytics3 != null) {
                    viewPinalytics3.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0Var2, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
            case 6:
                x2 x2Var2 = (x2) this.receiver;
                h32.g0 g0Var2 = x2Var2.f109649e;
                i13 = g0Var2 != null ? t2.f109553a[g0Var2.ordinal()] : -1;
                if (i13 == 1) {
                    u0Var = h32.u0.SKIN_TONE_FILTER_EXPAND_BUTTON;
                } else if (i13 == 2) {
                    u0Var = h32.u0.HAIR_PATTERN_FILTER_EXPAND_BUTTON;
                }
                h32.u0 u0Var3 = u0Var;
                nx.d0 viewPinalytics4 = x2Var2.getViewPinalytics();
                if (viewPinalytics4 != null) {
                    viewPinalytics4.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0Var3, (r18 & 4) != 0 ? null : g0Var2, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
            case 7:
                t3 t3Var = (t3) this.receiver;
                int i16 = t3.f109554g;
                nx.d0 viewPinalytics5 = t3Var.getViewPinalytics();
                if (viewPinalytics5 != null) {
                    viewPinalytics5.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CLOSEUP_DETAILS_LIST_EXPAND_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_CLOSEUP_DETAILS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
            default:
                t3 t3Var2 = (t3) this.receiver;
                int i17 = t3.f109554g;
                nx.d0 viewPinalytics6 = t3Var2.getViewPinalytics();
                if (viewPinalytics6 != null) {
                    viewPinalytics6.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CLOSEUP_DETAILS_LIST_COLLAPSE_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_CLOSEUP_DETAILS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f109146a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                i();
                break;
            case 4:
                i();
                break;
            case 5:
                i();
                break;
            case 6:
                i();
                break;
            case 7:
                i();
                break;
            default:
                i();
                break;
        }
        return Unit.f80348a;
    }
}
