package yv;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.r;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import wi.j;

/* loaded from: classes3.dex */
public final /* synthetic */ class a extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i13) {
        super(1, obj, f.class, "onAdLoaded", "onAdLoaded(Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;)V", 0);
        this.f140163a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, f.class, "onAdPaid", "onAdPaid(Lcom/google/android/libraries/ads/mobile/sdk/common/AdValue;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f140163a) {
            case 0:
                bj.f p03 = (bj.f) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                f fVar = (f) this.receiver;
                fVar.getClass();
                f.D3(fVar, p03);
                return Unit.f80348a;
            default:
                j p04 = (j) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                f fVar2 = (f) this.receiver;
                if (fVar2.f140175h) {
                    try {
                        dw.b bVar = fVar2.f140170c;
                        f30 f30Var = fVar2.f140173f;
                        if (f30Var == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        f30 f30Var2 = fVar2.f140173f;
                        if (f30Var2 == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        com.pinterest.api.model.g t33 = f30Var2.t3();
                        if (t33 != null) {
                            r n03 = t33.n0();
                            if (n03 != null) {
                                str = u2.p(n03);
                                if (str == null) {
                                }
                                bVar.g(p04.f129952b, uid, str, p04.f129951a.ordinal());
                            }
                        }
                        str = "";
                        bVar.g(p04.f129952b, uid, str, p04.f129951a.ordinal());
                    } catch (Exception e13) {
                        fVar2.f140171d.q(e13, "Failed to call onAdPaid: " + e13, tb0.p.ADS_GMA);
                    }
                }
                return Unit.f80348a;
        }
    }
}
