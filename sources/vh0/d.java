package vh0;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.expressSurvey.view.ExpressSurveyView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import rg0.n;
import so.oa;
import so.s8;
import tb0.p;
import uj2.q;
import uk1.e;
import vb0.j;
import yk1.l;
import yk1.m;

/* loaded from: classes5.dex */
public final class d extends l {

    /* renamed from: a, reason: collision with root package name */
    public final sh0.a f125835a;

    /* renamed from: b, reason: collision with root package name */
    public final n f125836b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f125837c;

    /* renamed from: d, reason: collision with root package name */
    public q f125838d;

    /* renamed from: e, reason: collision with root package name */
    public e f125839e;

    /* renamed from: f, reason: collision with root package name */
    public b60.b f125840f;

    /* renamed from: g, reason: collision with root package name */
    public e20.a f125841g;

    /* renamed from: h, reason: collision with root package name */
    public ExpressSurveyView f125842h;

    /* renamed from: i, reason: collision with root package name */
    public th0.d f125843i;

    public d(sh0.a survey, n experience, HashMap auxData) {
        Intrinsics.checkNotNullParameter(survey, "survey");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f125835a = survey;
        this.f125836b = experience;
        this.f125837c = auxData;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context, false);
        s8 s8Var = (s8) ((c) o.a(bs1.c.k0(context), c.class));
        q z53 = s8Var.z5();
        Intrinsics.checkNotNullParameter(z53, "<set-?>");
        this.f125838d = z53;
        oa oaVar = s8Var.f114255d;
        e eVar = (e) oaVar.f113702ga.get();
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f125839e = eVar;
        b60.b bVar = (b60.b) oaVar.f113850p0.get();
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f125840f = bVar;
        e20.a aVar = (e20.a) oaVar.N9.get();
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f125841g = aVar;
        ExpressSurveyView expressSurveyView = new ExpressSurveyView(context);
        this.f125842h = expressSurveyView;
        modalViewWrapper.x(expressSurveyView);
        modalViewWrapper.q(false);
        return modalViewWrapper;
    }

    @Override // yk1.l
    public final m createPresenter() {
        th0.d dVar = this.f125843i;
        if (dVar == null) {
            q qVar = this.f125838d;
            if (qVar == null) {
                Intrinsics.r("networkStateStream");
                throw null;
            }
            e eVar = this.f125839e;
            if (eVar == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            b60.b bVar = this.f125840f;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            wy0 f13 = ((b60.d) bVar).f();
            String uid = f13 != null ? f13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            String str = uid;
            e20.a aVar = this.f125841g;
            if (aVar == null) {
                Intrinsics.r("brandSurveyService");
                throw null;
            }
            dVar = new th0.d(this.f125835a, this.f125836b, qVar, eVar, this.f125837c, str, aVar);
            this.f125843i = dVar;
        }
        return dVar;
    }

    @Override // yk1.l
    public final m getPresenter() {
        return this.f125843i;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        if (this.f125842h == null) {
            j.f125466a.J(new IllegalAccessError("Must call createModalView() before accessing thismethod"), p.MERCHANTS_AND_CATALOGS);
        }
        ExpressSurveyView expressSurveyView = this.f125842h;
        if (expressSurveyView != null) {
            return expressSurveyView;
        }
        Intrinsics.r("surveyView");
        throw null;
    }
}
