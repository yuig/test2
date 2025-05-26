package a41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.f1;
import h32.u0;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Object obj, int i13) {
        super(0, obj, d0.class, "handleCreateAction", "handleCreateAction()V", 0);
        this.f700a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, d0.class, "onVoiceSearchInitiated", "onVoiceSearchInitiated()V", 0);
        }
    }

    public final void h() {
        switch (this.f700a) {
            case 0:
                d0 d0Var = (d0) this.receiver;
                d0Var.getPinalytics().F(h32.g0.NAVIGATION, u0.CREATE_BUTTON);
                if (d0Var.isBound()) {
                    x xVar = new x(d0Var, 4);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.addAll(h1.c(k41.b.Pin, k41.b.Collage));
                    linkedHashSet.add(k41.b.Board);
                    f9.f config = new f9.f(xVar, linkedHashSet);
                    r rVar = (r) ((p0) d0Var.getView());
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(config, "config");
                    rVar.f7().d(new jc0.v(new zp.b0(rVar.s7(), config, ou1.b.PROFILE_PLUS_BUTTON.getValue()), false, 0L, 30));
                    break;
                }
                break;
            default:
                d0 d0Var2 = (d0) this.receiver;
                d0Var2.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                p0 p0Var = (p0) d0Var2.getViewIfBound();
                if (p0Var != null) {
                    NavigationImpl w13 = Navigation.w1(i3.b());
                    w13.y0("VALUE_SEARCH_LIBRARY", "com.pinterest.EXTRA_SEARCH_MODE");
                    w13.Y1("com.pinterest.EXTRA_START_VOICE_SEARCH", true);
                    Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                    ((r) p0Var).M1(w13);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f700a) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
