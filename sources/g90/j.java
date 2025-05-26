package g90;

import android.view.View;
import androidx.recyclerview.widget.l2;
import com.pinterest.collage.cutoutcloseup.layoutmanager.CollagesCarouselLayoutManager;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f64530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, int i13) {
        super(1);
        this.f64529i = i13;
        this.f64530j = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f64529i;
        n nVar = this.f64530j;
        switch (i13) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                int i14 = n.f64537w0;
                nVar.getClass();
                float f13 = ql2.s.f(100 - (Math.abs(floatValue) * 40), 60.0f, 100.0f) / 100.0f;
                CutoutCarouselView cutoutCarouselView = nVar.f64545n0;
                if (cutoutCarouselView == null) {
                    Intrinsics.r("cutoutCarousel");
                    throw null;
                }
                l2 l2Var = cutoutCarouselView.f19242n;
                CollagesCarouselLayoutManager collagesCarouselLayoutManager = l2Var instanceof CollagesCarouselLayoutManager ? (CollagesCarouselLayoutManager) l2Var : null;
                if (collagesCarouselLayoutManager != null) {
                    collagesCarouselLayoutManager.T = f13;
                    if (cutoutCarouselView == null) {
                        Intrinsics.r("cutoutCarousel");
                        throw null;
                    }
                    int childCount = cutoutCarouselView.getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        CutoutCarouselView cutoutCarouselView2 = nVar.f64545n0;
                        if (cutoutCarouselView2 == null) {
                            Intrinsics.r("cutoutCarousel");
                            throw null;
                        }
                        View childAt = cutoutCarouselView2.getChildAt(i15);
                        k90.e eVar = childAt instanceof k90.e ? (k90.e) childAt : null;
                        if (eVar != null) {
                            eVar.setScaleX(eVar.f78748j * f13);
                            eVar.setScaleY(eVar.f78748j * f13);
                        }
                    }
                }
                return Unit.f80348a;
            default:
                c cVar = new c((String) obj);
                int i16 = n.f64537w0;
                kh2.j.x2((c0) nVar.f64548q0.getValue(), cVar);
                return Unit.f80348a;
        }
    }
}
