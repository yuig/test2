package kc1;

import android.content.res.Resources;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.shared.view.SettingsPageItemView;
import com.pinterest.feature.settings.shared.view.SettingsTextItemView;
import h32.f1;
import java.util.HashMap;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.t0;
import u50.k0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79181i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f79182j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i13) {
        super(1);
        this.f79181i = i13;
        this.f79182j = obj;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f79181i;
        Object obj = this.f79182j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((ic1.w) obj).f72094a;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                yd1.c cVar = (yd1.c) obj;
                return rn1.a.y(it, null, null, null, kotlin.collections.e0.b(vn1.e.BOLD), cVar.f138792a, cVar.f138794c, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096967);
        }
    }

    public final yl1.b e(yl1.b buttonState) {
        int i13 = this.f79181i;
        Object obj = this.f79182j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                return yl1.b.f(buttonState, null, ((n) obj).f79166a.a(), null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(buttonState, "it");
                return yl1.b.f(buttonState, bs1.c.h2(((yc1.a) obj).f138699c), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    public final void f(em1.c checkEvent) {
        int i13 = this.f79181i;
        Object obj = this.f79182j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(checkEvent, "checkEvent");
                ce1.c cVar = (ce1.c) obj;
                zd1.g gVar = cVar.f27612d;
                if (gVar == null) {
                    Intrinsics.r("multiSelectFilterData");
                    throw null;
                }
                gVar.f141719j = c0.d.b2(checkEvent);
                boolean z13 = cVar.f27615g;
                if (z13) {
                    be1.a aVar = cVar.f27613e;
                    if (aVar == null) {
                        Intrinsics.r("multiSelectFilterUpdateListener");
                        throw null;
                    }
                    aVar.Z2(gVar, cVar.f27614f);
                } else if (!z13) {
                    be1.a aVar2 = cVar.f27613e;
                    if (aVar2 == null) {
                        Intrinsics.r("multiSelectFilterUpdateListener");
                        throw null;
                    }
                    aVar2.z(gVar, cVar.f27614f);
                }
                boolean b23 = c0.d.b2(checkEvent);
                Resources resources = cVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                cVar.setContentDescription(zd1.f.P1(b23, resources, ce1.c.a(gVar)));
                return;
            case 22:
                Intrinsics.checkNotNullParameter(checkEvent, "it");
                ((fe1.c) obj).onCheckedChanged(null, c0.d.b2(checkEvent));
                return;
            default:
                Intrinsics.checkNotNullParameter(checkEvent, "it");
                ((fe1.k) obj).onCheckedChanged(null, c0.d.b2(checkEvent));
                return;
        }
    }

    public final void h(String url) {
        Function1 function1;
        int i13 = this.f79181i;
        Object obj = this.f79182j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(url, "url");
                SettingsPageItemView settingsPageItemView = (SettingsPageItemView) obj;
                if (settingsPageItemView.f48354i != null && (function1 = settingsPageItemView.f48347b) != null) {
                    function1.invoke(url);
                    break;
                }
                break;
            case 11:
                Intrinsics.checkNotNullParameter(url, "url");
                Function1 function12 = ((SettingsTextItemView) obj).f48359a;
                if (function12 != null) {
                    function12.invoke(url);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(url, "it");
                pe1.d dVar = (pe1.d) obj;
                t0.b(dVar.t7(), dVar.generateLoggingContext(), f1.TAP, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                dVar.O5(url, new HashMap());
                break;
        }
    }

    public final void i(Throwable th3) {
        int i13 = this.f79181i;
        Object obj = this.f79182j;
        switch (i13) {
            case 7:
                rc1.a aVar = (rc1.a) obj;
                Intrinsics.f(th3);
                aVar.getClass();
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                v.f1 f1Var = networkResponseError != null ? networkResponseError.f45043a : null;
                if (f1Var != null && f1Var.f123449b == aVar.f107494c) {
                    qz.d M = k3.M(f1Var);
                    Integer valueOf = M != null ? Integer.valueOf(M.f105387g) : null;
                    if (CollectionsKt.L(f0.j(2901, 2904), valueOf)) {
                        String message = M != null ? M.f105384d : null;
                        if (message != null && valueOf != null) {
                            qc1.a aVar2 = (qc1.a) aVar.getView();
                            int intValue = valueOf.intValue();
                            sc1.b bVar = (sc1.b) aVar2;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(message, "message");
                            nx.d0.B(bVar.s7(), f1.DATA_REQUEST_FAILURE, null, null, null, 30);
                            bVar.f7().d(new yb0.f(new k0(intValue == 2904 ? i52.c.settings_privacy_data_request_data_email_not_verified_title : i52.c.settings_privacy_data_request_data_limit_reached_title), new u50.f0(message), new k0(x0.okay), (k0) null, new org.chromium.net.y(), 8));
                            break;
                        }
                    }
                }
                ((sc1.b) ((qc1.a) aVar.getView())).b8(false);
                break;
            default:
                ((tb0.h) ((p70.e) obj).f99072b).q(th3, "Load Data error", tb0.p.ONE_TAP_ADS);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0421  */
    /* JADX WARN: Type inference failed for: r1v55, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kc1.w.invoke(java.lang.Object):java.lang.Object");
    }
}
