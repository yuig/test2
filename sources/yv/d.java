package yv;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ew.j;
import ew.m;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final /* synthetic */ class d extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i13) {
        super(0, obj, f.class, "onAdClicked", "onAdClicked()V", 0);
        this.f140164a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, f.class, "onAdImpression", "onAdImpression()V", 0);
        }
    }

    public final void h() {
        switch (this.f140164a) {
            case 0:
                f fVar = (f) this.receiver;
                if (fVar.f140175h) {
                    f30 f30Var = fVar.f140173f;
                    if (f30Var == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    int i13 = fVar.f140174g;
                    int C = ((g) ((h) fVar.getView())).C();
                    dw.b bVar = fVar.f140170c;
                    bVar.h(i13, C, f30Var);
                    bVar.i(fVar.f140174g, ((g) ((h) fVar.getView())).C(), f30Var);
                    h hVar = (h) fVar.getView();
                    f30 pin = fVar.f140173f;
                    if (pin == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    g gVar = (g) hVar;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    ni1.d dVar = gVar.f140180d;
                    if (dVar == null) {
                        Intrinsics.r("deepLinkHelper");
                        throw null;
                    }
                    es.h hVar2 = gVar.f140182f;
                    if (hVar2 != null) {
                        ni1.d.e(dVar, pin, hVar2, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        return;
                    } else {
                        Intrinsics.r("adsCommonDisplay");
                        throw null;
                    }
                }
                return;
            default:
                f fVar2 = (f) this.receiver;
                if (fVar2.f140175h) {
                    try {
                        m mVar = fVar2.f140168a;
                        f30 f30Var2 = fVar2.f140173f;
                        if (f30Var2 == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        String uid = f30Var2.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        bj.f b13 = ((j) mVar).b(uid);
                        if (b13 != null) {
                            dw.b bVar2 = fVar2.f140170c;
                            f30 pin2 = fVar2.f140173f;
                            if (pin2 == null) {
                                Intrinsics.r("pin");
                                throw null;
                            }
                            int i14 = fVar2.f140174g;
                            int i15 = fVar2.f140176i;
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(pin2, "pin");
                            bVar2.e(null, f1.GMA_AD_STEP, pin2, 0L, i14, i15, "step_sdk_imp", b13, null, (r24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : false);
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        fVar2.f140171d.q(e13, "Failed to call onAdLoadFailure: " + e13, tb0.p.ADS_GMA);
                        return;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f140164a) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
