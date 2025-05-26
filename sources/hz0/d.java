package hz0;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.api.model.cc0;
import com.pinterest.api.model.ia0;
import com.pinterest.api.model.ma0;
import com.pinterest.feature.pear.quiz.view.QuizChoiceButton;
import com.pinterest.feature.pear.quiz.view.QuizGradingAnswerView;
import com.pinterest.feature.pear.quiz.view.QuizImageSetView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import fz0.u;
import iy1.e;
import java.util.List;
import kh2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import np0.h;
import pk.a0;

/* loaded from: classes5.dex */
public final class d extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f70642a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f70643b = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.view_quiz_question, this);
    }

    public void L(fz0.b displayState, u viewModel) {
        String str;
        List g13;
        ma0 ma0Var;
        String e13;
        List g14;
        ma0 ma0Var2;
        String e14;
        List f13;
        String str2;
        List f14;
        List f15;
        List g15;
        List g16;
        List q13;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ia0 ia0Var = displayState.f63115a;
        int i13 = displayState.f63116b;
        cc0 cc0Var = (ia0Var == null || (q13 = ia0Var.q()) == null) ? null : (cc0) q13.get(i13);
        GestaltText gestaltText = (GestaltText) findViewById(iy1.d.quiz_question_title);
        QuizImageSetView quizImageSetView = (QuizImageSetView) findViewById(iy1.d.quiz_question_image);
        Intrinsics.f(gestaltText);
        if (cc0Var == null || (str = cc0Var.j()) == null) {
            str = "";
        }
        a0.p(gestaltText, str);
        List h10 = cc0Var != null ? cc0Var.h() : null;
        int i14 = 3;
        if (h10 == null || h10.isEmpty()) {
            bs1.c.X0(quizImageSetView);
            p pVar = new p();
            pVar.j(this);
            pVar.l(iy1.d.quiz_question_title, 4, iy1.d.quiz_answer_container, 3);
            pVar.b(this);
        } else {
            List h13 = cc0Var != null ? cc0Var.h() : null;
            if (h13 == null) {
                h13 = q0.f80391a;
            }
            quizImageSetView.L(h13);
        }
        Integer i15 = cc0Var != null ? cc0Var.i() : null;
        if (i15 != null && i15.intValue() == 1) {
            bs1.c.U1(findViewById(iy1.d.quiz_choice_answer));
            bs1.c.X0(findViewById(iy1.d.quiz_grading_answer));
            List j13 = f0.j(Integer.valueOf(iy1.d.quiz_answer_1), Integer.valueOf(iy1.d.quiz_answer_2), Integer.valueOf(iy1.d.quiz_answer_3), Integer.valueOf(iy1.d.quiz_answer_4));
            int i16 = 0;
            int size = (cc0Var == null || (g16 = cc0Var.g()) == null) ? 0 : g16.size();
            int i17 = 0;
            while (i17 < size) {
                QuizChoiceButton quizChoiceButton = (QuizChoiceButton) findViewById(((Number) j13.get(i17)).intValue());
                ma0 ma0Var3 = (cc0Var == null || (g15 = cc0Var.g()) == null) ? null : (ma0) g15.get(i17);
                quizChoiceButton.getClass();
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                if (displayState.f63117c == i17) {
                    quizChoiceButton.setBackgroundResource(iy1.c.quiz_choice_button_selected);
                }
                int size2 = (ma0Var3 == null || (f15 = ma0Var3.f()) == null) ? 0 : f15.size();
                if (size2 >= i14) {
                    QuizImageSetView quizImageSetView2 = (QuizImageSetView) quizChoiceButton.findViewById(iy1.d.quiz_choice_image_set);
                    if (ma0Var3 != null && (f14 = ma0Var3.f()) != null) {
                        quizImageSetView2.L(f14);
                    }
                    bs1.c.U1(quizImageSetView2);
                } else if (size2 >= 1) {
                    WebImageView webImageView = (WebImageView) quizChoiceButton.findViewById(iy1.d.quiz_choice_image);
                    webImageView.loadUrl((ma0Var3 == null || (f13 = ma0Var3.f()) == null) ? null : (String) CollectionsKt.firstOrNull(f13));
                    bs1.c.U1(webImageView);
                }
                GestaltText gestaltText2 = (GestaltText) quizChoiceButton.findViewById(iy1.d.quiz_choice_text);
                Intrinsics.f(gestaltText2);
                if (ma0Var3 == null || (str2 = ma0Var3.e()) == null) {
                    str2 = "";
                }
                a0.p(gestaltText2, str2);
                quizChoiceButton.setOnClickListener(new a(viewModel, i17, i16));
                bs1.c.U1(quizChoiceButton);
                i17++;
                i14 = 3;
            }
        } else if (i15 != null && i15.intValue() == 2) {
            bs1.c.X0(findViewById(iy1.d.quiz_choice_answer));
            QuizGradingAnswerView quizGradingAnswerView = (QuizGradingAnswerView) findViewById(iy1.d.quiz_grading_answer);
            quizGradingAnswerView.getClass();
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            GestaltText gestaltText3 = (GestaltText) quizGradingAnswerView.findViewById(iy1.d.pear_quiz_strongly_agree);
            Intrinsics.f(gestaltText3);
            j1.p1(gestaltText3, iy1.a.quiz_agree_color);
            if (cc0Var != null && (g14 = cc0Var.g()) != null && (ma0Var2 = (ma0) CollectionsKt.d0(g14)) != null && (e14 = ma0Var2.e()) != null) {
                a0.p(gestaltText3, e14);
            }
            GestaltText gestaltText4 = (GestaltText) quizGradingAnswerView.findViewById(iy1.d.pear_quiz_strongly_disagree);
            Intrinsics.f(gestaltText4);
            j1.p1(gestaltText4, iy1.a.quiz_disagree_color);
            if (cc0Var != null && (g13 = cc0Var.g()) != null && (ma0Var = (ma0) CollectionsKt.firstOrNull(g13)) != null && (e13 = ma0Var.e()) != null) {
                a0.p(gestaltText4, e13);
            }
            int i18 = iy1.d.pear_quiz_grade1;
            int i19 = iy1.a.quiz_disagree_inner_color;
            int i23 = iy1.a.quiz_disagree_color;
            int i24 = displayState.f63117c;
            quizGradingAnswerView.L(viewModel, i24, i18, i19, i23, 0);
            quizGradingAnswerView.L(viewModel, i24, iy1.d.pear_quiz_grade2, iy1.a.quiz_disagree_inner_color, iy1.a.quiz_disagree_color, 1);
            quizGradingAnswerView.L(viewModel, i24, iy1.d.pear_quiz_grade3, iy1.a.quiz_neutral_inner_color, iy1.a.quiz_neutral_color, 2);
            quizGradingAnswerView.L(viewModel, i24, iy1.d.pear_quiz_grade4, iy1.a.quiz_agree_inner_color, iy1.a.quiz_agree_color, 3);
            quizGradingAnswerView.L(viewModel, i24, iy1.d.pear_quiz_grade5, iy1.a.quiz_agree_inner_color, iy1.a.quiz_agree_color, 4);
            bs1.c.U1(quizGradingAnswerView);
        }
        GestaltButton gestaltButton = (GestaltButton) findViewById(iy1.d.previous_quiz);
        if (i13 <= 0) {
            bs1.c.X0(gestaltButton);
        } else {
            bs1.c.U1(gestaltButton);
            gestaltButton.e(new h(viewModel, 24));
        }
    }
}
