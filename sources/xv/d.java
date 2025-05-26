package xv;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
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
    public final /* synthetic */ int f135994a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i13) {
        super(0, obj, e.class, "onAdClicked", "onAdClicked()V", 0);
        this.f135994a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, e.class, "onAdImpression", "onAdImpression()V", 0);
        }
    }

    public final void h() {
        switch (this.f135994a) {
            case 0:
                e eVar = (e) this.receiver;
                if (eVar.f136000f) {
                    f30 f30Var = eVar.f135998d;
                    if (f30Var == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    int i13 = eVar.f135999e;
                    int e13 = ((i) ((k) eVar.getView())).e();
                    dw.b bVar = eVar.f135996b;
                    bVar.h(i13, e13, f30Var);
                    bVar.i(eVar.f135999e, ((i) ((k) eVar.getView())).e(), f30Var);
                    k kVar = (k) eVar.getView();
                    f30 pin = eVar.f135998d;
                    if (pin == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    i iVar = (i) kVar;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    ni1.d dVar = iVar.f136008c;
                    if (dVar == null) {
                        Intrinsics.r("deepLinkHelper");
                        throw null;
                    }
                    es.h hVar = iVar.f136010e;
                    if (hVar != null) {
                        ni1.d.e(dVar, pin, hVar, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        return;
                    } else {
                        Intrinsics.r("adsCommonDisplay");
                        throw null;
                    }
                }
                return;
            default:
                e eVar2 = (e) this.receiver;
                if (eVar2.f136000f) {
                    try {
                        m mVar = eVar2.f135995a;
                        f30 f30Var2 = eVar2.f135998d;
                        if (f30Var2 == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        String uid = f30Var2.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        if (((ew.j) mVar).a(uid) != null) {
                            dw.b bVar2 = eVar2.f135996b;
                            f30 pin2 = eVar2.f135998d;
                            if (pin2 == null) {
                                Intrinsics.r("pin");
                                throw null;
                            }
                            int i14 = eVar2.f135999e;
                            int i15 = eVar2.f136001g;
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(pin2, "pin");
                            bVar2.e(null, f1.GMA_AD_STEP, pin2, 0L, i14, i15, "step_sdk_imp", null, null, (r24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : false);
                            return;
                        }
                        return;
                    } catch (Exception e14) {
                        eVar2.f135997c.q(e14, "Failed to call onAdLoadFailure: " + e14, tb0.p.ADS_GMA);
                        return;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f135994a) {
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
