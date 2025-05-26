package eu;

import android.content.res.Resources;
import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import com.pinterest.ads.feature.owc.view.collection.AdsProductsModule;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import kh2.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60135i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AdsCollectionScrollingModule f60136j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AdsCollectionScrollingModule adsCollectionScrollingModule, int i13) {
        super(0);
        this.f60135i = i13;
        this.f60136j = adsCollectionScrollingModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f60135i;
        AdsCollectionScrollingModule adsCollectionScrollingModule = this.f60136j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(adsCollectionScrollingModule.S0().g());
            case 3:
                int i14 = AdsCollectionScrollingModule.U0;
                float floatValue = ((Number) adsCollectionScrollingModule.P0.getValue()).floatValue();
                Resources resources = adsCollectionScrollingModule.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return Boolean.valueOf(floatValue + ((float) m2.O0(resources)) <= ((float) hf0.b.f69003c) * 0.75f);
            default:
                return Boolean.valueOf(adsCollectionScrollingModule.S0().g());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f60135i;
        AdsCollectionScrollingModule adsCollectionScrollingModule = this.f60136j;
        switch (i13) {
            case 0:
                return invoke();
            case 1:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                es.h f23 = adsCollectionScrollingModule.f2();
                f30 Y0 = adsCollectionScrollingModule.Y0();
                lh0.d dVar = adsCollectionScrollingModule.H0;
                if (dVar != null) {
                    ArrayList<f30> t13 = ((es.v) f23).t(Y0, dVar);
                    if (t13 != null) {
                        for (f30 f30Var : t13) {
                            arrayList2.add(f30Var);
                            es.a aVar = adsCollectionScrollingModule.K0;
                            if (aVar != null) {
                                if (((es.c) aVar).w(adsCollectionScrollingModule.Y0(), new h(adsCollectionScrollingModule, 0))) {
                                    ps.k.b(adsCollectionScrollingModule.i2(), t13, ts.a.SIZE736x, 4);
                                    kh2.d.R0(f30Var, null, 6);
                                    arrayList.add(m2.W0(f30Var, adsCollectionScrollingModule.f2(), false));
                                }
                            } else {
                                Intrinsics.r("adFormats");
                                throw null;
                            }
                        }
                    }
                    return arrayList;
                }
                Intrinsics.r("adFormatsLibraryExperiments");
                throw null;
            case 2:
                return Float.valueOf(adsCollectionScrollingModule.n1().f35422i);
            case 3:
                return invoke();
            case 4:
                return invoke();
            case 5:
                return (AdsProductsModule) adsCollectionScrollingModule.findViewById(ps.p.opaque_one_tap_product_module);
            default:
                return new cu.q(adsCollectionScrollingModule, 1);
        }
    }
}
