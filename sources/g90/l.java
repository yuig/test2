package g90;

import android.content.res.Resources;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f64533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f64534s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f64534s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l lVar = new l(this.f64534s, cVar);
        lVar.f64533r = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f64533r;
        n nVar = this.f64534s;
        if (!Intrinsics.d(aVar2, nVar.f64550s0)) {
            nVar.f64549r0 = aVar2.f64505c;
            CutoutCarouselView cutoutCarouselView = nVar.f64545n0;
            if (cutoutCarouselView == null) {
                Intrinsics.r("cutoutCarousel");
                throw null;
            }
            List list = aVar2.f64504b;
            cutoutCarouselView.p3(list);
            int i13 = aVar2.f64503a;
            cutoutCarouselView.G2(i13);
            ViewPager viewPager = nVar.f64546o0;
            if (viewPager == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            xk2.v vVar = nVar.f64547p0;
            Object value = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((r) value).H(nVar.e8(), com.bumptech.glide.d.Z(nVar, "EXTRA_COLLAGES_ROOT_PIN_ID", ""), nVar.f8(), com.bumptech.glide.d.G(nVar, "EXTRA_COLLAGE_PIN_SINGLE_DEST", false), aVar2.f64504b);
            viewPager.B(i13, false);
            ArrayList arrayList = viewPager.O;
            if (arrayList != null) {
                arrayList.clear();
            }
            CutoutCarouselView cutoutCarouselView2 = nVar.f64545n0;
            if (cutoutCarouselView2 == null) {
                Intrinsics.r("cutoutCarousel");
                throw null;
            }
            Object value2 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            r rVar = (r) value2;
            Resources resources = viewPager.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            viewPager.b(new q(cutoutCarouselView2, rVar, aVar2.f64503a, resources, nVar.f8() ? new i1.j(nVar, 14) : null, nVar.f8() ? new j(nVar, 1) : null));
            if (nVar.f8() && !Intrinsics.d(list, nVar.f64550s0.f64504b)) {
                int size = list.size();
                nx.k kVar = nVar.f64540i0;
                if (kVar == null) {
                    Intrinsics.r("collageAdsLogger");
                    throw null;
                }
                String Z = com.bumptech.glide.d.Z(nVar, "EXTRA_COLLAGES_ROOT_PIN_ID", "");
                if (nVar.f64539h0 == null) {
                    Intrinsics.r("clock");
                    throw null;
                }
                nx.k.c(kVar, Z, true, Integer.valueOf(size), System.currentTimeMillis() - nVar.f64542k0, false, true, 16);
            }
            if (nVar.f8() && aVar2.f64506d) {
                nx.k kVar2 = nVar.f64540i0;
                if (kVar2 == null) {
                    Intrinsics.r("collageAdsLogger");
                    throw null;
                }
                String Z2 = com.bumptech.glide.d.Z(nVar, "EXTRA_COLLAGES_ROOT_PIN_ID", "");
                if (nVar.f64539h0 == null) {
                    Intrinsics.r("clock");
                    throw null;
                }
                nx.k.c(kVar2, Z2, false, null, System.currentTimeMillis() - nVar.f64542k0, false, true, 16);
            }
            nVar.f64550s0 = aVar2;
        }
        return Unit.f80348a;
    }
}
