package pw1;

import com.pinterest.api.model.bg;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.o4;
import com.pinterest.api.model.vh;
import java.util.Date;
import java.util.Locale;
import kh2.g3;
import kh2.j;
import kh2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.b0;
import yx1.t;
import zx.l;
import zx.n;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101528i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f101529j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(1);
        this.f101528i = i13;
        this.f101529j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Number number;
        String str;
        yx1.s sVar = yx1.s.f140408b;
        int i13 = this.f101528i;
        int i14 = 1;
        h hVar = this.f101529j;
        switch (i13) {
            case 0:
                f30 pin = (f30) obj;
                Intrinsics.f(pin);
                ph.a.x0(pin);
                hVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                cy1.c pinType = hVar.f101539u;
                Intrinsics.checkNotNullParameter(pinType, "pinType");
                if (pinType == cy1.c.IDEA || pinType == cy1.c.VIDEO) {
                    bg b03 = g3.b0(pin);
                    if (b03 != null) {
                        ww1.c metricType = hVar.f97963d;
                        Intrinsics.checkNotNullParameter(b03, "<this>");
                        Intrinsics.checkNotNullParameter(metricType, "metricType");
                        switch (kw1.a.f81037a[metricType.ordinal()]) {
                            case 1:
                                number = b03.v();
                                Intrinsics.checkNotNullExpressionValue(number, "getImpression(...)");
                                break;
                            case 2:
                                number = b03.z();
                                Intrinsics.checkNotNullExpressionValue(number, "getPinClick(...)");
                                break;
                            case 3:
                                number = b03.B();
                                Intrinsics.checkNotNullExpressionValue(number, "getSave(...)");
                                break;
                            case 4:
                                number = b03.A();
                                Intrinsics.checkNotNullExpressionValue(number, "getProfileVisit(...)");
                                break;
                            case 5:
                                number = b03.D();
                                Intrinsics.checkNotNullExpressionValue(number, "getUserFollow(...)");
                                break;
                            case 6:
                                number = b03.y();
                                Intrinsics.checkNotNullExpressionValue(number, "getOutboundClick(...)");
                                break;
                            case 7:
                                number = b03.I();
                                Intrinsics.checkNotNullExpressionValue(number, "getVideoViews(...)");
                                break;
                            case 8:
                                number = b03.E();
                                Intrinsics.checkNotNullExpressionValue(number, "getVideo10sView(...)");
                                break;
                            case 9:
                                number = b03.G();
                                Intrinsics.checkNotNullExpressionValue(number, "getVideoP95Views(...)");
                                break;
                            case 10:
                                number = b03.F();
                                Intrinsics.checkNotNullExpressionValue(number, "getVideoAverageTime(...)");
                                break;
                            case 11:
                                number = b03.H();
                                Intrinsics.checkNotNullExpressionValue(number, "getVideoTotalTime(...)");
                                break;
                            default:
                                number = 0;
                                break;
                        }
                    } else {
                        number = null;
                    }
                    if (number != null) {
                        String G = m0.x(hVar.f97963d.getMetricFormatType()).G(number.floatValue());
                        ww1.c cVar = hVar.f97963d;
                        if (cVar == ww1.c.VIDEO_V50_WATCH_TIME || cVar == ww1.c.VIDEO_AVG_WATCH_TIME) {
                            str = "";
                        } else {
                            str = ((yk1.a) hVar.f97960a).f139224a.getString(com.pinterest.partnerAnalytics.g.total_label).toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                        }
                        uw1.b bVar = (uw1.b) hVar.getView();
                        ww1.c cVar2 = hVar.f97963d;
                        Intrinsics.f(G);
                        ((ow1.g) bVar).m8(new mw1.g(cVar2, G, str));
                    } else {
                        ((ow1.g) ((uw1.b) hVar.getView())).m8(mw1.f.f88433a);
                    }
                }
                String pinId = hVar.f101538t;
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                l c13 = hVar.f97962c.c().c();
                Date date = new Date(c13.f142973a.f142971c);
                n t23 = j.t2(c13, false);
                String format = h.f101533x.format(date);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                rx.c params = new rx.c(pinId, format, t23.f142984b, !hVar.f97963d.isAVideoMetric() ? hVar.f97963d.name() : null, hVar.f97964e.f88442a, t23.f142989g, t23.f142991i, t23.f142990h, hVar.f97963d.isAVideoMetric() ? hVar.f97963d.name() : null);
                px.c cVar3 = (px.c) hVar.f101534p;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                hVar.addDisposable(pk2.f.k(((b0) new qx.a(cVar3.f101547b, 2).b(params).buildRequest()).r(tk2.e.f118017c), "observeOn(...)").o(new ru1.d(4, new f(hVar, i14)), new ru1.d(5, g.f101531k)));
                break;
            case 1:
                o4 o4Var = (o4) obj;
                Intrinsics.f(o4Var);
                tw1.a aVar = new tw1.a(o4Var, hVar.f97963d, 1);
                Intrinsics.checkNotNullParameter(aVar, "<set-?>");
                hVar.f97966g = aVar;
                hVar.v3(o4Var);
                break;
            case 2:
                switch (i13) {
                    case 2:
                        ((uw1.b) hVar.getView()).o3(sVar);
                        break;
                    default:
                        ((uw1.b) hVar.getView()).o3(sVar);
                        break;
                }
                break;
            case 3:
                vh dynamicStory = (vh) obj;
                Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
                if (dynamicStory.f42865w.isEmpty()) {
                    ((uw1.b) hVar.getView()).o3(t.f140409b);
                } else {
                    hVar.f101541w = dynamicStory;
                    hVar.G3(dynamicStory);
                }
                break;
            default:
                switch (i13) {
                    case 2:
                        ((uw1.b) hVar.getView()).o3(sVar);
                        break;
                    default:
                        ((uw1.b) hVar.getView()).o3(sVar);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
