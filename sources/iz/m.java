package iz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/m;", "Lhz/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m extends z {
    public static final /* synthetic */ int F0 = 0;
    public GestaltButtonToggle A0;
    public List B0;
    public GestaltText C0;
    public GestaltText D0;
    public GestaltText E0;

    /* renamed from: v0, reason: collision with root package name */
    public final List f73861v0 = f0.j(u0.ANKET_FIRST_SCALE_ANSWER, u0.ANKET_SECOND_SCALE_ANSWER, u0.ANKET_THIRD_SCALE_ANSWER, u0.ANKET_FOURTH_SCALE_ANSWER, u0.ANKET_FIFTH_SCALE_ANSWER);

    /* renamed from: w0, reason: collision with root package name */
    public Integer f73862w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltButtonToggle f73863x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltButtonToggle f73864y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltButtonToggle f73865z0;

    public m() {
        this.E = cz.l.view_survey_scale_question;
    }

    @Override // hz.d
    public final void g8(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        List a13;
        Intrinsics.checkNotNullParameter(question, "question");
        GestaltText gestaltText = this.C0;
        if (gestaltText == null) {
            Intrinsics.r("tvQuestion");
            throw null;
        }
        gestaltText.i(new hs.a(21, question, this));
        List a14 = question.a();
        if (a14 != null) {
            List list2 = this.B0;
            if (list2 == null) {
                Intrinsics.r("answerOptions");
                throw null;
            }
            int i13 = 0;
            for (Object obj : list2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                GestaltButtonToggle gestaltButtonToggle = (GestaltButtonToggle) obj;
                gs0 gs0Var = (gs0) a14.get(i13);
                ViewGroup.LayoutParams layoutParams = gestaltButtonToggle.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                com.bumptech.glide.c.b1(layoutParams2, i13 != 0 ? getResources().getDimensionPixelSize(d8() ? eo1.c.space_400 : eo1.c.space_600) : layoutParams2.getMarginStart(), i13 == 0 ? getResources().getDimensionPixelSize(d8() ? eo1.c.space_400 : eo1.c.space_600) : ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0, 0, 12);
                gestaltButtonToggle.setLayoutParams(layoutParams2);
                gestaltButtonToggle.s(new wt.c(gs0Var, 27));
                gestaltButtonToggle.t(new l(this, i13, gs0Var, gestaltButtonToggle, 0));
                if (i13 == 0) {
                    GestaltText gestaltText2 = this.E0;
                    if (gestaltText2 == null) {
                        Intrinsics.r("tvNotRelevant");
                        throw null;
                    }
                    j8(gestaltText2, gs0Var.c());
                } else if (i13 == 4) {
                    GestaltText gestaltText3 = this.D0;
                    if (gestaltText3 == null) {
                        Intrinsics.r("tvRelevant");
                        throw null;
                    }
                    j8(gestaltText3, gs0Var.c());
                } else {
                    continue;
                }
                i13 = i14;
            }
        }
        if (bVar == null || (a13 = question.a()) == null) {
            return;
        }
        Iterator it = a13.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            gs0 gs0Var2 = (gs0) it.next();
            List b13 = bVar.b();
            if (Intrinsics.d(b13 != null ? (Integer) CollectionsKt.firstOrNull(b13) : null, gs0Var2.d())) {
                break;
            } else {
                i15++;
            }
        }
        List list3 = this.B0;
        if (list3 == null) {
            Intrinsics.r("answerOptions");
            throw null;
        }
        GestaltButtonToggle gestaltButtonToggle2 = (GestaltButtonToggle) CollectionsKt.U(i15, list3);
        if (gestaltButtonToggle2 != null) {
            gestaltButtonToggle2.s(a.f73820o);
        }
        this.f73862w0 = Integer.valueOf(i15);
        Unit unit = Unit.f80348a;
    }

    public final void j8(GestaltText gestaltText, String str) {
        if (str == null) {
            str = "";
        }
        pk.a0.p(gestaltText, str);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        com.bumptech.glide.c.b1(layoutParams2, 0, 0, 0, getResources().getDimensionPixelSize(d8() ? eo1.c.space_0 : eo1.c.space_600), 7);
        gestaltText.setLayoutParams(layoutParams2);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(cz.k.tv_question);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.C0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(cz.k.tv_relevant);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.D0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(cz.k.tv_not_relevant);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.E0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(cz.k.fl_answer_option_one_background);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f73863x0 = (GestaltButtonToggle) findViewById4;
        View findViewById5 = onCreateView.findViewById(cz.k.fl_answer_option_two_background);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f73864y0 = (GestaltButtonToggle) findViewById5;
        View findViewById6 = onCreateView.findViewById(cz.k.fl_answer_option_three_background);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.A0 = (GestaltButtonToggle) findViewById6;
        View findViewById7 = onCreateView.findViewById(cz.k.fl_answer_option_four_background);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f73865z0 = (GestaltButtonToggle) findViewById7;
        View findViewById8 = onCreateView.findViewById(cz.k.fl_answer_option_five_background);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltButtonToggle gestaltButtonToggle = (GestaltButtonToggle) findViewById8;
        GestaltButtonToggle[] gestaltButtonToggleArr = new GestaltButtonToggle[5];
        GestaltButtonToggle gestaltButtonToggle2 = this.f73863x0;
        if (gestaltButtonToggle2 == null) {
            Intrinsics.r("tvAnswerOptionOne");
            throw null;
        }
        gestaltButtonToggleArr[0] = gestaltButtonToggle2;
        GestaltButtonToggle gestaltButtonToggle3 = this.f73864y0;
        if (gestaltButtonToggle3 == null) {
            Intrinsics.r("tvAnswerOptionTwo");
            throw null;
        }
        gestaltButtonToggleArr[1] = gestaltButtonToggle3;
        GestaltButtonToggle gestaltButtonToggle4 = this.A0;
        if (gestaltButtonToggle4 == null) {
            Intrinsics.r("tvAnswerOptionThree");
            throw null;
        }
        gestaltButtonToggleArr[2] = gestaltButtonToggle4;
        GestaltButtonToggle gestaltButtonToggle5 = this.f73865z0;
        if (gestaltButtonToggle5 == null) {
            Intrinsics.r("tvAnswerOptionFour");
            throw null;
        }
        gestaltButtonToggleArr[3] = gestaltButtonToggle5;
        if (gestaltButtonToggle == null) {
            Intrinsics.r("tvAnswerOptionFive");
            throw null;
        }
        gestaltButtonToggleArr[4] = gestaltButtonToggle;
        this.B0 = f0.j(gestaltButtonToggleArr);
        return onCreateView;
    }
}
