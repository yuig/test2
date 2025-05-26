package fu;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.wy0;
import h32.c1;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes3.dex */
public final class e extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f62946a;

    public e(h hVar) {
        this.f62946a = hVar;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.N != 0) {
            h hVar = this.f62946a;
            int i16 = hVar.d8().n1().f35424k;
            dt.a aVar = hVar.C0;
            if (aVar != null) {
                tt.b bVar = (tt.b) aVar;
                if (i16 < bVar.q3().size() && i16 != (i15 = bVar.f105125o)) {
                    bVar.f105124n = true;
                    m21.a aVar2 = (m21.a) bVar.q3().get(i16);
                    String d2 = aVar2.d();
                    bVar.f105125o = i16;
                    String str = bVar.f119047x;
                    if (str != null) {
                        bVar.f105114d.b(i16, str);
                        bVar.f105112b.d(new l21.a(str));
                    }
                    at.b bVar2 = (at.b) bVar.getView();
                    boolean v13 = ((es.c) bVar.f105119i).v(bVar.t3());
                    String title = aVar2.getTitle();
                    wy0 a63 = bVar.t3().a6();
                    bVar2.a4(title, a63 != null ? a63.Z2() : null, null, v13, b40.w0(bVar.t3()));
                    if (!Intrinsics.d(bVar.f105126p, d2)) {
                        bVar.f105126p = d2;
                    }
                    d0 pinalytics = bVar.getPinalytics();
                    f1 f1Var = f1.SWIPE;
                    String str2 = bVar.f119047x;
                    c1 r33 = bVar.r3(i15);
                    HashMap p33 = bVar.p3();
                    p33.put("image_count", String.valueOf(bVar.q3().size()));
                    Unit unit = Unit.f80348a;
                    pinalytics.u(f1Var, str2, r33, p33, false);
                    d0.v(pinalytics, f1.VIEW_WEBSITE_ONE_PIXEL, bVar.f119047x, false, 12);
                }
            }
            AdsCarouselIndexModule adsCarouselIndexModule = hVar.f53228h0;
            if (adsCarouselIndexModule != null) {
                adsCarouselIndexModule.a(i16);
            } else {
                Intrinsics.r("carouselIndexModule");
                throw null;
            }
        }
    }
}
