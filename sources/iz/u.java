package iz;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/u;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class u extends hz.d {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    public final List f73874s0 = f0.j(u0.ANKET_FIRST_VERTICAL_SCALE_ANSWER, u0.ANKET_SECOND_VERTICAL_SCALE_ANSWER, u0.ANKET_THIRD_VERTICAL_SCALE_ANSWER, u0.ANKET_FOURTH_VERTICAL_SCALE_ANSWER, u0.ANKET_FIFTH_VERTICAL_SCALE_ANSWER);

    /* renamed from: t0, reason: collision with root package name */
    public Integer f73875t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltText f73876u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltText f73877v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltText f73878w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltText f73879x0;

    /* renamed from: y0, reason: collision with root package name */
    public List f73880y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltText f73881z0;

    public u() {
        this.E = cz.l.view_survey_vertical_scale_question;
    }

    public static void i8(GestaltText gestaltText) {
        ViewParent parent = gestaltText.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        Context context = gestaltText.getContext();
        int i13 = nz.b.lego_answer_button_with_border_selected;
        Object obj = d5.a.f53679a;
        ((FrameLayout) parent).setBackground(context.getDrawable(i13));
        gestaltText.i(a.f73822q);
    }

    public static void j8(GestaltText gestaltText) {
        ViewParent parent = gestaltText.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        Context context = gestaltText.getContext();
        int i13 = nz.b.lego_answer_button_with_border;
        Object obj = d5.a.f53679a;
        ((FrameLayout) parent).setBackground(context.getDrawable(i13));
        gestaltText.i(a.f73823r);
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        Intrinsics.checkNotNullParameter(question, "question");
        GestaltText gestaltText = this.f73881z0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        String c13 = question.c();
        if (c13 == null) {
            c13 = "";
        }
        pk.a0.p(gestaltText, c13);
        List a13 = question.a();
        int i13 = 0;
        if (a13 != null) {
            List list2 = this.f73880y0;
            if (list2 == null) {
                Intrinsics.r("answerOptions");
                throw null;
            }
            int i14 = 0;
            for (Object obj : list2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    f0.p();
                    throw null;
                }
                GestaltText gestaltText2 = (GestaltText) obj;
                gs0 gs0Var = (gs0) a13.get(i14);
                pk.a0.p(gestaltText2, String.valueOf(gs0Var.c()));
                gestaltText2.j(new l(this, i14, gs0Var, gestaltText2, 1));
                i14 = i15;
            }
        }
        List a14 = question.a();
        if (bVar == null || a14 == null) {
            return;
        }
        Iterator it = a14.iterator();
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            gs0 gs0Var2 = (gs0) it.next();
            List b13 = bVar.b();
            if (Intrinsics.d(b13 != null ? (Integer) CollectionsKt.firstOrNull(b13) : null, gs0Var2.d())) {
                break;
            } else {
                i13++;
            }
        }
        List list3 = this.f73880y0;
        if (list3 == null) {
            Intrinsics.r("answerOptions");
            throw null;
        }
        GestaltText gestaltText3 = (GestaltText) CollectionsKt.U(i13, list3);
        if (gestaltText3 != null) {
            i8(gestaltText3);
        }
        this.f73875t0 = Integer.valueOf(i13);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73881z0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(cz.k.tv_answer_option_one);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73876u0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(cz.k.tv_answer_option_two);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f73877v0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(cz.k.tv_answer_option_four);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f73878w0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(cz.k.tv_answer_option_five);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f73879x0 = (GestaltText) findViewById5;
        View findViewById6 = onCreateView.findViewById(cz.k.tv_answer_option_three);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById6;
        GestaltText[] gestaltTextArr = new GestaltText[5];
        GestaltText gestaltText2 = this.f73876u0;
        if (gestaltText2 == null) {
            Intrinsics.r("tvAnswerOptionOne");
            throw null;
        }
        gestaltTextArr[0] = gestaltText2;
        GestaltText gestaltText3 = this.f73877v0;
        if (gestaltText3 == null) {
            Intrinsics.r("tvAnswerOptionTwo");
            throw null;
        }
        gestaltTextArr[1] = gestaltText3;
        if (gestaltText == null) {
            Intrinsics.r("tvAnswerOptionThree");
            throw null;
        }
        gestaltTextArr[2] = gestaltText;
        GestaltText gestaltText4 = this.f73878w0;
        if (gestaltText4 == null) {
            Intrinsics.r("tvAnswerOptionFour");
            throw null;
        }
        gestaltTextArr[3] = gestaltText4;
        GestaltText gestaltText5 = this.f73879x0;
        if (gestaltText5 == null) {
            Intrinsics.r("tvAnswerOptionFive");
            throw null;
        }
        gestaltTextArr[4] = gestaltText5;
        this.f73880y0 = f0.j(gestaltTextArr);
        return onCreateView;
    }
}
