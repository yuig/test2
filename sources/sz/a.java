package sz;

import com.pinterest.api.model.b1;
import com.pinterest.api.model.cn;
import com.pinterest.api.model.p2;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.xb;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rz.d;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115645a;

    public /* synthetic */ a(int i13) {
        this.f115645a = i13;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        switch (this.f115645a) {
            case 0:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m13 = pinterestJsonObject.m("data");
                if (m13 != null) {
                    pinterestJsonObject = m13;
                }
                Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, b1.class);
                Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.AdsCartingData");
                return (b1) e13;
            case 1:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m14 = pinterestJsonObject.m("data");
                if (m14 != null) {
                    pinterestJsonObject = m14;
                }
                Object e14 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, p2.class);
                Intrinsics.g(e14, "null cannot be cast to non-null type com.pinterest.api.model.AdvertiserPins");
                return (p2) e14;
            case 2:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m15 = pinterestJsonObject.m("data");
                if (m15 != null) {
                    pinterestJsonObject = m15;
                }
                Object e15 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, xb.class);
                Intrinsics.g(e15, "null cannot be cast to non-null type com.pinterest.api.model.BusinessPins");
                return (xb) e15;
            case 3:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m16 = pinterestJsonObject.m("data");
                if (m16 != null) {
                    pinterestJsonObject = m16;
                }
                Object e16 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, vz0.class);
                Intrinsics.g(e16, "null cannot be cast to non-null type com.pinterest.api.model.VerifiedMerchant");
                return (vz0) e16;
            default:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                ArrayList arrayList = new ArrayList();
                vd0.c m17 = pinterestJsonObject.m("data");
                if (m17 != null) {
                    vd0.a i13 = m17.k("generations").i(0);
                    if (i13 != null) {
                        int d2 = i13.d();
                        for (int i14 = 0; i14 < d2; i14++) {
                            Object e17 = vd0.c.f125622b.e(i13.j(i14).f125623a, cn.class);
                            Intrinsics.g(e17, "null cannot be cast to non-null type com.pinterest.api.model.GeneratedImage");
                            arrayList.add((cn) e17);
                        }
                    }
                }
                return arrayList;
        }
    }
}
