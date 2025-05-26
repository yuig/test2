package h01;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.v2;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import nx.d0;
import pk.a0;
import uq.w;
import yk1.n;

/* loaded from: classes5.dex */
public final class e extends w implements n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f66430j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f66431d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66432e;

    /* renamed from: f, reason: collision with root package name */
    public final b f66433f;

    /* renamed from: g, reason: collision with root package name */
    public m60.w f66434g;

    /* renamed from: h, reason: collision with root package name */
    public b60.b f66435h;

    /* renamed from: i, reason: collision with root package name */
    public o f66436i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, d0 pinalytics, String insightId, b listener) {
        super(context, 16);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f66431d = pinalytics;
        this.f66432e = insightId;
        this.f66433f = listener;
        View.inflate(context, ky1.c.view_pear_style_summary_survey, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        ((GestaltButton) findViewById(ky1.b.retake_button)).e(new np0.h(this, 26));
    }

    public final void L(final c surveyState) {
        Intrinsics.checkNotNullParameter(surveyState, "surveyState");
        f1 f1Var = f1.VIEW;
        c0.d.u2(this.f66431d, f1Var, g0.PEAR_SURVEY, null, null, 12);
        c0.d.u2(this.f66431d, f1Var, null, u0.PEAR_RETAKE_QUIZ_BUTTON, null, 10);
        String str = surveyState.f66424e;
        if (str != null) {
            View findViewById = findViewById(ky1.b.survey_prompt);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            a0.p((GestaltText) findViewById, str);
        }
        final int i13 = 0;
        ((GestaltIconButton) findViewById(ky1.b.survey_positive_button)).u(new gm1.a(this) { // from class: h01.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f66418b;

            {
                this.f66418b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                c surveyState2 = surveyState;
                e this$0 = this.f66418b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66421b, surveyState2.f66425f, u0.PEAR_SURVEY_HAPPY);
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66422c, surveyState2.f66425f, u0.PEAR_SURVEY_NEUTRAL);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66423d, surveyState2.f66425f, u0.PEAR_SURVEY_SAD);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        ((GestaltIconButton) findViewById(ky1.b.survey_neutral_button)).u(new gm1.a(this) { // from class: h01.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f66418b;

            {
                this.f66418b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                c surveyState2 = surveyState;
                e this$0 = this.f66418b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66421b, surveyState2.f66425f, u0.PEAR_SURVEY_HAPPY);
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66422c, surveyState2.f66425f, u0.PEAR_SURVEY_NEUTRAL);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66423d, surveyState2.f66425f, u0.PEAR_SURVEY_SAD);
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        ((GestaltIconButton) findViewById(ky1.b.survey_negative_button)).u(new gm1.a(this) { // from class: h01.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f66418b;

            {
                this.f66418b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                c surveyState2 = surveyState;
                e this$0 = this.f66418b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66421b, surveyState2.f66425f, u0.PEAR_SURVEY_HAPPY);
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66422c, surveyState2.f66425f, u0.PEAR_SURVEY_NEUTRAL);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(surveyState2, "$surveyState");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.T(surveyState2.f66423d, surveyState2.f66425f, u0.PEAR_SURVEY_SAD);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void T(int i13, Map map, u0 u0Var) {
        c0.d.u2(this.f66431d, null, g0.PEAR_SURVEY, u0Var, null, 9);
        o oVar = this.f66436i;
        if (oVar == null) {
            Intrinsics.r("preferencesManager");
            throw null;
        }
        StringBuilder sb3 = new StringBuilder("SHARED_PREF_KEY_PEAR_SURVEY_");
        String str = this.f66432e;
        sb3.append(str);
        ((lb0.b) oVar).o(sb3.toString(), true);
        this.f66433f.T5();
        ((GestaltText) findViewById(ky1.b.survey_prompt)).i(d.f66426j);
        Iterator it = f0.j(Integer.valueOf(ky1.b.survey_positive_button), Integer.valueOf(ky1.b.survey_positive_text), Integer.valueOf(ky1.b.survey_neutral_button), Integer.valueOf(ky1.b.survey_neutral_text), Integer.valueOf(ky1.b.survey_negative_button), Integer.valueOf(ky1.b.survey_negative_text)).iterator();
        while (it.hasNext()) {
            bs1.c.X0(findViewById(((Number) it.next()).intValue()));
        }
        if (i13 <= 0) {
            return;
        }
        b60.b bVar = this.f66435h;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar).f();
        String id3 = f13 != null ? f13.getId() : null;
        String z43 = f13 != null ? f13.z4() : null;
        StringBuilder sb4 = new StringBuilder("https://anket.pinterest.com/survey/");
        sb4.append(i13);
        sb4.append("?authId=");
        sb4.append(id3);
        sb4.append("&username=");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) v2.f51462a.getValue(), a.a.l(a.a.p(sb4, z43, "&app_type=3"), str.length() > 0 ? "&insight_id=".concat(str) : "", "&", CollectionsKt.Z(map.entrySet(), "&", null, null, 0, null, d.f66427k, 30)));
        z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
        m60.w wVar = this.f66434g;
        if (wVar != null) {
            wVar.d(z03);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    public /* synthetic */ e(Context context, d0 d0Var, h80.h hVar) {
        this(context, d0Var, "", hVar);
    }
}
