package hz;

import android.widget.HorizontalScrollView;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r02.r;

/* loaded from: classes3.dex */
public final class l extends xa.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70634b;

    public l(Object obj, int i13) {
        this.f70633a = i13;
        this.f70634b = obj;
    }

    @Override // xa.k, xa.i
    public final void A5(int i13) {
        int i14 = this.f70633a;
        Object obj = this.f70634b;
        switch (i14) {
            case 1:
                hq0.e eVar = ((iq0.e) obj).f73399v0;
                if (eVar != null) {
                    GestaltTabLayout gestaltTabLayout = ((iq0.e) ((eq0.f) eVar.getView())).f73395r0;
                    if (gestaltTabLayout == null) {
                        Intrinsics.r("tabLayout");
                        throw null;
                    }
                    ek.e n13 = gestaltTabLayout.n(i13);
                    if (n13 != null) {
                        n13.b();
                    }
                    eVar.p3(i13);
                    return;
                }
                return;
            case 2:
                CarouselIndexView carouselIndexView = ((tu0.h) obj).f119337u0;
                if (carouselIndexView != null) {
                    carouselIndexView.e(i13);
                    return;
                } else {
                    Intrinsics.r("carouselIndexView");
                    throw null;
                }
            case 3:
                yx0.h hVar = ((zx0.f) obj).f143022y0;
                if (hVar != null) {
                    hVar.r3(i13);
                    return;
                }
                return;
            case 4:
                s61.e eVar2 = (s61.e) obj;
                CarouselIndexView carouselIndexView2 = eVar2.f111237v0;
                if (carouselIndexView2 == null) {
                    Intrinsics.r("carouselIndexView");
                    throw null;
                }
                carouselIndexView2.e(i13);
                if (i13 != ((s61.b) eVar2.a8()).f77529f.size() - 1) {
                    GestaltIconButton gestaltIconButton = eVar2.f111240y0;
                    if (gestaltIconButton != null) {
                        gestaltIconButton.t(s61.d.f111231l);
                        return;
                    } else {
                        Intrinsics.r("fab");
                        throw null;
                    }
                }
                eVar2.j8().a(0L, "MICROTREATMENT_COMPLETED");
                GestaltIconButton gestaltIconButton2 = eVar2.f111240y0;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.t(s61.d.f111230k);
                    return;
                } else {
                    Intrinsics.r("fab");
                    throw null;
                }
            case 5:
                hf1.c cVar = ((if1.d) obj).f72236q0;
                if (cVar != null) {
                    cVar.q3(i13);
                    return;
                }
                return;
            case 6:
                ((r) obj).Y7(i13);
                return;
            default:
                return;
        }
    }

    @Override // xa.k, xa.i
    public final void i(int i13, float f13, int i14) {
        int i15 = this.f70633a;
        Object obj = this.f70634b;
        switch (i15) {
            case 0:
                ((Function0) obj).invoke();
                return;
            case 4:
                s61.e eVar = (s61.e) obj;
                int i16 = s61.e.C0;
                float width = (((LockableViewPager) eVar.b8().f21278a).getWidth() * i13) + i14;
                if (eVar.f111239x0 == null) {
                    Intrinsics.r("background");
                    throw null;
                }
                int width2 = (int) (((r5.getWidth() - ((LockableViewPager) eVar.b8().f21278a).getWidth()) / ((((s61.b) eVar.a8()).f77529f.size() - 1) * ((LockableViewPager) eVar.b8().f21278a).getWidth())) * width);
                HorizontalScrollView horizontalScrollView = eVar.f111238w0;
                if (horizontalScrollView != null) {
                    horizontalScrollView.scrollTo(width2, 0);
                    return;
                } else {
                    Intrinsics.r("scrollView");
                    throw null;
                }
            default:
                return;
        }
    }
}
