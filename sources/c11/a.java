package c11;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.api.model.ay;
import com.pinterest.ui.view.NoticeView;
import com.pinterest.ui.view.NoticesView;
import java.util.HashMap;
import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;
import rq.j2;
import rq.k0;
import rq.m4;
import rq.s;
import rq.s0;
import rq.t;
import rq.t3;
import rq.u;
import rq.w1;
import u01.f;
import u01.g;
import u01.i;
import u01.l;
import u01.m;
import u01.o;
import u01.q;
import vq0.h;
import y92.j;
import y92.k;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24488a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f24489b;

    public a(d0 pinalytics, int i13) {
        this.f24488a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
            default:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f24489b = pinalytics;
                break;
        }
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        String string;
        int i14 = this.f24488a;
        d0 pinalytics = this.f24489b;
        switch (i14) {
            case 0:
                m4 view = (m4) nVar;
                u01.e model = (u01.e) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.bindData(model.f119886d, model.f119884b, model.f119885c, pinalytics);
                break;
            case 1:
                k0 view2 = (k0) nVar;
                f model2 = (f) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                view2.bindData(model2.f119890d, model2.f119888b, model2.f119889c, pinalytics);
                break;
            case 2:
                s0 view3 = (s0) nVar;
                g model3 = (g) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                view3.updatePinalytics(pinalytics);
                view3.updatePin(model3.f119892b);
                break;
            case 3:
                s view4 = (s) nVar;
                i model4 = (i) obj;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                view4.bindData(model4.f119900d, model4.f119898b, model4.f119899c, pinalytics);
                break;
            case 4:
                PinCloseupFavoriteModule view5 = (PinCloseupFavoriteModule) nVar;
                l model5 = (l) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                view5.bindData(model5.f119912d, model5.f119910b, model5.f119911c, pinalytics);
                break;
            case 5:
                t view6 = (t) nVar;
                i model6 = (i) obj;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                view6.bindData(model6.f119900d, model6.f119898b, model6.f119899c, pinalytics);
                break;
            case 6:
                w1 view7 = (w1) nVar;
                m model7 = (m) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(model7, "model");
                view7.bindData(model7.f119916d, model7.f119914b, model7.f119915c, pinalytics);
                break;
            case 7:
                j2 view8 = (j2) nVar;
                o model8 = (o) obj;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(model8, "model");
                view8.bindData(model8.f119924d, model8.f119922b, model8.f119923c, pinalytics);
                break;
            case 8:
                t3 view9 = (t3) nVar;
                q model9 = (q) obj;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(model9, "model");
                view9.bindData(model9.f119932d, model9.f119930b, model9.f119931c, pinalytics);
                break;
            case 9:
                u view10 = (u) nVar;
                i model10 = (i) obj;
                Intrinsics.checkNotNullParameter(view10, "view");
                Intrinsics.checkNotNullParameter(model10, "model");
                view10.bindData(model10.f119900d, model10.f119898b, model10.f119899c, pinalytics);
                break;
            case 10:
                j view11 = (j) nVar;
                k61.a model11 = (k61.a) obj;
                Intrinsics.checkNotNullParameter(view11, "view");
                Intrinsics.checkNotNullParameter(model11, "model");
                String str = model11.f78395b;
                HashMap hashMap = model11.f78397d;
                if (str == null || z.j(str)) {
                    com.pinterest.feature.search.results.view.i iVar = (com.pinterest.feature.search.results.view.i) view11;
                    iVar.getClass();
                    b71.d searchTypo = model11.f78394a;
                    Intrinsics.checkNotNullParameter(searchTypo, "searchTypo");
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    String str2 = searchTypo.f22093b;
                    Intrinsics.checkNotNullExpressionValue(str2, "getCorrectedQuery(...)");
                    String str3 = searchTypo.f22094c;
                    Intrinsics.checkNotNullExpressionValue(str3, "getOriginalQuery(...)");
                    if (searchTypo.f22092a) {
                        string = iVar.getResources().getString(k42.f.search_nag_query_autocorrect, str2, str3);
                        Intrinsics.f(string);
                    } else {
                        string = iVar.getResources().getString(k42.f.search_nag_incorrect, str2);
                        Intrinsics.f(string);
                    }
                    iVar.i(pinalytics, string, hashMap);
                } else {
                    ((com.pinterest.feature.search.results.view.i) view11).i(pinalytics, model11.f78395b, hashMap);
                }
                view11.setOnClickListener(model11.f78396c);
                break;
            default:
                k view12 = (k) nVar;
                k61.j model12 = (k61.j) obj;
                Intrinsics.checkNotNullParameter(view12, "view");
                Intrinsics.checkNotNullParameter(model12, "model");
                List<ay> notices = model12.f78416a.k();
                if (notices != null) {
                    NoticesView noticesView = (NoticesView) view12;
                    noticesView.getClass();
                    Intrinsics.checkNotNullParameter(notices, "notices");
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    noticesView.removeAllViews();
                    for (ay ayVar : notices) {
                        Context context = noticesView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        NoticeView noticeView = new NoticeView(context, null, 0, false, 14);
                        if (!m2.w1(ayVar)) {
                            int dimensionPixelSize = noticeView.getResources().getDimensionPixelSize(eo1.c.margin_one_and_a_half);
                            noticeView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                        }
                        noticesView.addView(noticeView);
                        noticeView.i(ayVar, pinalytics, model12.f78417b);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        if (m2.w1(ayVar)) {
                            int dimensionPixelSize2 = noticeView.getResources().getDimensionPixelSize(eo1.c.space_200);
                            int dimensionPixelSize3 = noticeView.getResources().getDimensionPixelSize(eo1.c.space_400);
                            com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
                        } else {
                            int dimensionPixelSize4 = noticeView.getResources().getDimensionPixelSize(eo1.c.space_0);
                            com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
                        }
                        noticeView.setLayoutParams(layoutParams);
                    }
                    break;
                }
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f24488a) {
            case 0:
                u01.e model = (u01.e) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 1:
                f model2 = (f) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
            case 2:
                g model3 = (g) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                break;
            case 3:
                h((i) obj);
                break;
            case 4:
                l model4 = (l) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 5:
                h((i) obj);
                break;
            case 6:
                m model5 = (m) obj;
                Intrinsics.checkNotNullParameter(model5, "model");
                break;
            case 7:
                o model6 = (o) obj;
                Intrinsics.checkNotNullParameter(model6, "model");
                break;
            case 8:
                q model7 = (q) obj;
                Intrinsics.checkNotNullParameter(model7, "model");
                break;
            case 9:
                h((i) obj);
                break;
            case 10:
                k61.a model8 = (k61.a) obj;
                Intrinsics.checkNotNullParameter(model8, "model");
                break;
            default:
                k61.j model9 = (k61.j) obj;
                Intrinsics.checkNotNullParameter(model9, "model");
                break;
        }
        return null;
    }

    public final void h(i model) {
        switch (this.f24488a) {
            case 3:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 4:
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
    }

    public a(d0 d0Var, int i13, int i14) {
        this.f24488a = i13;
        this.f24489b = d0Var;
    }
}
