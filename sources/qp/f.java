package qp;

import android.content.Context;
import com.pinterest.navigation.Navigation;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import com.pinterest.ui.grid.PinterestGridView;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import qa2.p1;
import u50.i0;
import u50.k0;

/* loaded from: classes3.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f104680j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, int i13) {
        super(1);
        this.f104679i = i13;
        this.f104680j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f104679i;
        k kVar = this.f104680j;
        switch (i13) {
            case 0:
                PinterestGridView pinterestGridView = kVar.f104695d0;
                if (pinterestGridView != null) {
                    p1 p1Var = pinterestGridView.S;
                    p1 p1Var2 = p1.LOADING;
                    if (p1Var != p1Var2) {
                        pinterestGridView.s1(p1Var2);
                    }
                }
                return Unit.f80348a;
            case 1:
                PinnableImageFeed pinnableImageFeed = (PinnableImageFeed) obj;
                PinterestGridView pinterestGridView2 = kVar.f104695d0;
                if (pinterestGridView2 != null) {
                    pinterestGridView2.G0(pinnableImageFeed);
                    if (pinnableImageFeed != null && pinnableImageFeed.x()) {
                        String str = pinnableImageFeed.f105383c;
                        Intrinsics.checkNotNullExpressionValue(str, "getBookmark(...)");
                        if (str.length() > 0) {
                            kVar.J0.a();
                        }
                    }
                    pinterestGridView2.s1(p1.LOADED);
                }
                return Unit.f80348a;
            case 2:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                String message = throwable.getMessage();
                PinterestGridView pinterestGridView3 = kVar.f104695d0;
                if (pinterestGridView3 != null) {
                    if (!qb0.d.f103396a.c()) {
                        pinterestGridView3.s1(p1.ERROR);
                        return Unit.f80348a;
                    }
                    pinterestGridView3.s1(p1.ERROR);
                    if (message == null) {
                        message = kVar.getString(x0.login_generic_fail);
                        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                    }
                    pinterestGridView3.n1(message);
                }
                kVar.d8();
                return Unit.f80348a;
            case 3:
                rn1.a displayState = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f108849g;
                int i14 = x0.loading_pins_webpage;
                String k03 = j1.k0(kVar.f104704m0);
                Intrinsics.checkNotNullExpressionValue(k03, "getDomainName(...)");
                k0 text = bs1.c.j2(new String[]{k03}, i14);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            case 4:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                lu1.b bVar = kVar.f104714w0;
                if (bVar == null) {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ((lu1.c) bVar).r(requireContext, navigation);
                return Unit.f80348a;
            default:
                em1.c cVar = (em1.c) obj;
                if (cVar != null) {
                    kVar.K0.h3(cVar);
                }
                return Unit.f80348a;
        }
    }
}
