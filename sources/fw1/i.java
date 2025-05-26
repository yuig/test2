package fw1;

import android.content.Context;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.d4;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import nx.d0;
import rq.n3;
import so.oa;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class i extends ModalViewWrapper implements c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f63057p = 0;

    /* renamed from: k, reason: collision with root package name */
    public final String f63058k;

    /* renamed from: l, reason: collision with root package name */
    public final String f63059l;

    /* renamed from: m, reason: collision with root package name */
    public d f63060m;

    /* renamed from: n, reason: collision with root package name */
    public final i92.k f63061n;

    /* renamed from: o, reason: collision with root package name */
    public final d4 f63062o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String featureName, String helpLink) {
        super(context, false);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(helpLink, "helpLink");
        this.f63058k = featureName;
        this.f63059l = helpLink;
        v b13 = m.b(h.f63056i);
        Context context2 = kb0.a.f79058b;
        this.f63061n = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        s(com.pinterest.partnerAnalytics.e.feedback_view);
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById(com.pinterest.partnerAnalytics.d.messageTextField);
        GestaltText gestaltText = (GestaltText) findViewById(com.pinterest.partnerAnalytics.d.bottomMessageText1);
        GestaltText gestaltText2 = (GestaltText) findViewById(com.pinterest.partnerAnalytics.d.bottomMessageText2);
        GestaltButton gestaltButton = (GestaltButton) findViewById(com.pinterest.partnerAnalytics.d.submitButton);
        Intrinsics.f(gestaltText);
        Intrinsics.f(gestaltText2);
        Intrinsics.f(gestaltButton);
        Intrinsics.f(gestaltTextField);
        gestaltButton.d(g.f63052j).e(new la1.k(28, gestaltTextField, this));
        gestaltTextField.Z(new gh1.e(gestaltButton, 22));
        gestaltText.j(new n3(16)).i(new q0.d(context, 21));
        String string = context.getResources().getString(com.pinterest.partnerAnalytics.g.analytics_feedback_message2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltText2.j(new n3(17)).i(new xm1.k(29, string, this));
        uk2.f fVar = (uk2.f) b13.getValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fVar.getClass();
        fVar.l(500L, timeUnit, tk2.e.f118016b).A(wj2.c.a());
        this.f63062o = d4.ANALYTICS_OVERVIEW;
    }

    public final void C(e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = f.f63051a[state.ordinal()];
        i92.k kVar = this.f63061n;
        if (i13 == 1) {
            kVar.k(com.pinterest.partnerAnalytics.g.analytics_feedback_submit_feedback_success);
            a.c.y(u.f85943a);
        } else {
            if (i13 != 2) {
                return;
            }
            kVar.h(com.pinterest.partnerAnalytics.g.analytics_feedback_submit_feedback_error);
        }
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF91831t0() {
        return this.f63062o;
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
