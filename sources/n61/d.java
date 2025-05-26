package n61;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.bg0;
import com.pinterest.api.model.ef0;
import com.pinterest.api.model.eg0;
import com.pinterest.api.model.hf0;
import com.pinterest.api.model.lf0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation;
import dl1.s;
import java.util.Iterator;
import java.util.List;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import pk.a0;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class d extends t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f89331a;

    /* renamed from: b, reason: collision with root package name */
    public final hf0 f89332b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r2, com.pinterest.api.model.hf0 r3, nx.a0 r4, uk1.e r5, uj2.q r6) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "safetyAudioTreatment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "noOpPinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            uk1.d r4 = uk1.e.b(r5, r4)
            r1.<init>(r4, r6)
            r1.f89331a = r2
            r1.f89332b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n61.d.<init>(android.content.Context, com.pinterest.api.model.hf0, nx.a0, uk1.e, uj2.q):void");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        m61.a view = (m61.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((b) view).f89325k0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((b) ((m61.a) getView())).f89325k0 = null;
        super.onUnbind();
    }

    public final void p3() {
        w wVar = u.f85943a;
        NavigationImpl w13 = Navigation.w1(SearchResultsFeatureLocation.GOLD_STANDARD_AUDIO_PLAY);
        w13.y0(this.f89332b, "extra_safety_audio_treatment");
        wVar.d(w13);
    }

    public final void q3() {
        eg0 eg0Var;
        Context context = this.f89331a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        hf0 safetyAudioTreatment = this.f89332b;
        Intrinsics.checkNotNullParameter(safetyAudioTreatment, "safetyAudioTreatment");
        int parseColor = Color.parseColor(a0.q0(context) ? safetyAudioTreatment.K() : safetyAudioTreatment.L());
        GestaltText gestaltText = ((b) ((m61.a) getView())).f89327m0;
        if (gestaltText == null) {
            Intrinsics.r("actionText");
            throw null;
        }
        String text = a0.R(gestaltText);
        Intrinsics.checkNotNullParameter(text, "text");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(parseColor);
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(foregroundColorSpan, 0, text.length(), 0);
        a0.q(gestaltText, bs1.c.h2(spannableString));
        m61.a aVar = (m61.a) getView();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(safetyAudioTreatment, "safetyAudioTreatment");
        int parseColor2 = Color.parseColor(a0.q0(context) ? safetyAudioTreatment.H() : safetyAudioTreatment.I());
        View view = ((b) aVar).getView();
        if (view != null) {
            view.setBackgroundColor(parseColor2);
        }
        List M = safetyAudioTreatment.M();
        if (M != null) {
            Iterator it = M.iterator();
            while (it.hasNext()) {
                s a13 = ((ef0) it.next()).a();
                if (a13 != null && (a13 instanceof eg0)) {
                    eg0Var = (eg0) a13;
                    break;
                }
            }
        }
        bg0 bg0Var = new bg0(0);
        eg0Var = new eg0(bg0Var.f36094a, bg0Var.f36095b, bg0Var.f36096c, bg0Var.f36097d, bg0Var.f36098e, bg0Var.f36099f, bg0Var.f36100g, bg0Var.f36101h, bg0Var.f36102i, 0);
        Intrinsics.checkNotNullExpressionValue(eg0Var, "build(...)");
        String text2 = eg0Var.n();
        if (text2 != null) {
            b bVar = (b) ((m61.a) getView());
            bVar.getClass();
            Intrinsics.checkNotNullParameter(text2, "text");
            GestaltText gestaltText2 = bVar.f89327m0;
            if (gestaltText2 == null) {
                Intrinsics.r("actionText");
                throw null;
            }
            a0.p(gestaltText2, text2);
        }
        List<lf0> q13 = eg0Var.q();
        if (q13 != null) {
            for (lf0 lf0Var : q13) {
                GestaltText textView = new GestaltText(6, context, (AttributeSet) null);
                Intrinsics.f(lf0Var);
                j.C2(textView, lf0Var);
                String text3 = a0.R(textView);
                Intrinsics.checkNotNullParameter(text3, "text");
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(parseColor);
                SpannableString spannableString2 = new SpannableString(text3);
                spannableString2.setSpan(foregroundColorSpan2, 0, text3.length(), 0);
                a0.q(textView, bs1.c.h2(spannableString2));
                b bVar2 = (b) ((m61.a) getView());
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(textView, "textView");
                LinearLayout linearLayout = bVar2.f89328n0;
                if (linearLayout == null) {
                    Intrinsics.r("linearLayout");
                    throw null;
                }
                linearLayout.addView(textView);
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        m61.a view = (m61.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((b) view).f89325k0 = this;
    }
}
