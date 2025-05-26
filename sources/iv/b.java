package iv;

import a8.v;
import android.content.Context;
import bc2.m;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.feature.pincarouselads.view.a0;
import com.pinterest.feature.pincarouselads.view.l;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73723i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CloseupCarouselView f73724j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CloseupCarouselView closeupCarouselView, int i13) {
        super(0);
        this.f73723i = i13;
        this.f73724j = closeupCarouselView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        int i14 = this.f73723i;
        CloseupCarouselView closeupCarouselView = this.f73724j;
        switch (i14) {
            case 0:
                if (closeupCarouselView.H) {
                    hs.d dVar = closeupCarouselView.C;
                    if (dVar == null) {
                        Intrinsics.r("moduleViewabilityHelper");
                        throw null;
                    }
                    if (!dVar.a()) {
                        i13 = bs1.c.W(closeupCarouselView, eo1.c.space_400);
                        closeupCarouselView.f35421h = i13;
                        Context context = closeupCarouselView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return new l(context, closeupCarouselView.f35421h, closeupCarouselView.f35420g, null, 56);
                    }
                }
                i13 = 0;
                closeupCarouselView.f35421h = i13;
                Context context2 = closeupCarouselView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new l(context2, closeupCarouselView.f35421h, closeupCarouselView.f35420g, null, 56);
            case 1:
                v vVar = new v(closeupCarouselView, 19);
                Context context3 = closeupCarouselView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                a0 a0Var = new a0(context3, closeupCarouselView.f35421h, closeupCarouselView.f35419f, m.PIN_CLOSEUP, closeupCarouselView.f35428o, vVar, null, 448);
                closeupCarouselView.M.add(new WeakReference(a0Var));
                return a0Var;
            default:
                Context context4 = closeupCarouselView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int i15 = CloseupCarouselView.O;
                return new d91.e(context4, closeupCarouselView.getPinalytics());
        }
    }
}
