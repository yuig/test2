package a81;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveFrameLayout;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveImageView;
import com.pinterest.feature.search.visual.collage.view.DotsIndicatorView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.e5;
import e81.n;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.p;
import z71.h;
import z71.i;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1510i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f1511j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i13) {
        super(1);
        this.f1510i = i13;
        this.f1511j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z71.e localPage;
        int i13 = this.f1510i;
        g gVar = this.f1511j;
        switch (i13) {
            case 0:
                z71.c cVar = (z71.c) obj;
                if (gVar.f1517e == null) {
                    List overlayItems = cVar.getLocalPage().getOverlayItems();
                    if (overlayItems != null) {
                        overlayItems.isEmpty();
                    }
                    z71.e localPage2 = cVar.getLocalPage();
                    i backgroundImage = localPage2.getBackgroundImage();
                    z71.g backgroundItem = backgroundImage instanceof z71.g ? (z71.g) backgroundImage : null;
                    if (backgroundItem != null) {
                        e81.d dVar = (e81.d) ((t71.f) gVar.getView());
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(backgroundItem, "backgroundItem");
                        CollageInteractiveImageView collageInteractiveImageView = dVar.f57766m0;
                        if (collageInteractiveImageView == null) {
                            Intrinsics.r("interactiveImageView");
                            throw null;
                        }
                        collageInteractiveImageView.E2(backgroundItem);
                        bs1.c.U1(collageInteractiveImageView);
                    }
                    for (i iVar : localPage2.getOverlayItems()) {
                        if (iVar instanceof h) {
                            h cutoutItem = (h) iVar;
                            e81.d dVar2 = (e81.d) ((t71.f) gVar.getView());
                            dVar2.getClass();
                            Intrinsics.checkNotNullParameter(cutoutItem, "cutoutItem");
                            Context requireContext = dVar2.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            n nVar = new n(requireContext, cutoutItem, dVar2.d8().width(), dVar2.d8().height(), null, null, dVar2, dVar2, dVar2, dVar2);
                            CollageInteractiveFrameLayout collageInteractiveFrameLayout = dVar2.f57765l0;
                            if (collageInteractiveFrameLayout == null) {
                                Intrinsics.r("contentContainer");
                                throw null;
                            }
                            collageInteractiveFrameLayout.addView(nVar);
                        }
                    }
                }
                gVar.f1517e = cVar;
                if (cVar != null && (localPage = cVar.getLocalPage()) != null) {
                    t71.f fVar = (t71.f) gVar.getView();
                    int size = localPage.getOverlayItems().size();
                    DotsIndicatorView dotsIndicatorView = ((e81.d) fVar).f57768o0;
                    if (dotsIndicatorView == null) {
                        Intrinsics.r("dotsIndicatorView");
                        throw null;
                    }
                    dotsIndicatorView.a(size);
                }
                return Unit.f80348a;
            case 1:
                gVar.f1516d.q((Throwable) obj, gVar.getClass().getSimpleName().concat(": failed to fetch CollageLocalCanvas"), p.COLLAGES);
                return Unit.f80348a;
            default:
                PinnableImage pinnableImage = (PinnableImage) obj;
                Intrinsics.f(pinnableImage);
                gVar.getClass();
                ScreenLocation screenLocation = (ScreenLocation) e5.f50736a.getValue();
                cr1.c cVar2 = gVar.f1514b;
                String str = cVar2.f53098a;
                if (str.length() == 0) {
                    str = cb.g("toString(...)");
                    cVar2.f53098a = str;
                }
                NavigationImpl L = Navigation.L(screenLocation, str, ml1.b.MODAL_TRANSITION.getValue());
                L.a(f0.d(pinnableImage));
                ((nl1.d) ((t71.f) gVar.getView())).M1(L);
                gVar.f1518f = true;
                return Unit.f80348a;
        }
    }
}
