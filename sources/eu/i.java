package eu;

import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AdsCollectionScrollingModule f60138j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ps.k f60139k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(AdsCollectionScrollingModule adsCollectionScrollingModule, ps.k kVar, int i13) {
        super(0);
        this.f60137i = i13;
        this.f60138j = adsCollectionScrollingModule;
        this.f60139k = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f60137i) {
            case 0:
                m139invoke();
                break;
            default:
                m139invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m139invoke() {
        int i13 = this.f60137i;
        ps.k kVar = this.f60139k;
        AdsCollectionScrollingModule adsCollectionScrollingModule = this.f60138j;
        switch (i13) {
            case 0:
                CloseupCarouselView n13 = adsCollectionScrollingModule.n1();
                List images = (List) adsCollectionScrollingModule.g2().get(kVar.f101240c);
                Intrinsics.checkNotNullParameter(images, "images");
                hv.e eVar = n13.F;
                if (eVar != null) {
                    eVar.F3(images);
                    Unit unit = Unit.f80348a;
                }
                adsCollectionScrollingModule.r2(kVar);
                break;
            default:
                CloseupCarouselView n14 = adsCollectionScrollingModule.n1();
                List images2 = (List) adsCollectionScrollingModule.g2().get(kVar.f101240c);
                Intrinsics.checkNotNullParameter(images2, "images");
                hv.e eVar2 = n14.F;
                if (eVar2 != null) {
                    eVar2.F3(images2);
                    Unit unit2 = Unit.f80348a;
                    break;
                }
                break;
        }
    }
}
