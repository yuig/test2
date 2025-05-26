package n02;

import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.d0;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f88826r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f88827s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f88826r = oVar;
        this.f88827s = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f88826r, this.f88827s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        u0 u0Var;
        w0 h03;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d0 pinalytics = this.f88826r.getPinalytics();
        f1 f1Var = f1.PIN_LINK_REPORT;
        g0 g0Var = g0.MODAL_REPORT_MENU;
        String str = this.f88827s;
        int hashCode = str.hashCode();
        if (hashCode == -1034625007) {
            if (str.equals("nudity")) {
                u0Var = u0.NUDITY;
            }
            u0Var = u0.OTHER;
        } else if (hashCode != 3536713) {
            if (hashCode == 440530674 && str.equals("broken-link")) {
                u0Var = u0.BROKEN;
            }
            u0Var = u0.OTHER;
        } else {
            if (str.equals("spam")) {
                u0Var = u0.SPAM;
            }
            u0Var = u0.OTHER;
        }
        h03 = pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        return h03;
    }
}
