package yf1;

import a42.r;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.storypin.creation.feedback.view.IdeaPinFeedbackSatisfactionView;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import tq.f0;
import zp.y0;

/* loaded from: classes5.dex */
public final class d extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f138967c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f138968a;

    /* renamed from: b, reason: collision with root package name */
    public final IdeaPinFeedbackSatisfactionView[] f138969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, r rVar, a goToNextStep) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(goToNextStep, "goToNextStep");
        this.f138968a = goToNextStep;
        View.inflate(context, dq1.d.view_idea_pin_creation_feedback_step1_modal, this);
        View findViewById = findViewById(dq1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(dq1.c.rating_not_great);
        IdeaPinFeedbackSatisfactionView ideaPinFeedbackSatisfactionView = (IdeaPinFeedbackSatisfactionView) findViewById2;
        Intrinsics.f(ideaPinFeedbackSatisfactionView);
        L(ideaPinFeedbackSatisfactionView, r.UNSATISFIED);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = findViewById(dq1.c.rating_okay);
        IdeaPinFeedbackSatisfactionView ideaPinFeedbackSatisfactionView2 = (IdeaPinFeedbackSatisfactionView) findViewById3;
        Intrinsics.f(ideaPinFeedbackSatisfactionView2);
        L(ideaPinFeedbackSatisfactionView2, r.NEUTRAL);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        View findViewById4 = findViewById(dq1.c.rating_great);
        IdeaPinFeedbackSatisfactionView ideaPinFeedbackSatisfactionView3 = (IdeaPinFeedbackSatisfactionView) findViewById4;
        Intrinsics.f(ideaPinFeedbackSatisfactionView3);
        L(ideaPinFeedbackSatisfactionView3, r.SATISFIED);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        View findViewById5 = findViewById(dq1.c.helper_text);
        GestaltText gestaltText = (GestaltText) findViewById5;
        gestaltText.i(new f0(j1.c0(bs1.c.b2(dq1.f.pin_feedback_help)), gestaltText, 3));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f138969b = new IdeaPinFeedbackSatisfactionView[]{ideaPinFeedbackSatisfactionView, ideaPinFeedbackSatisfactionView2, ideaPinFeedbackSatisfactionView3};
        T(rVar);
    }

    public final void L(IdeaPinFeedbackSatisfactionView ideaPinFeedbackSatisfactionView, r rVar) {
        int i13;
        int i14;
        int i15 = c.f138966a[rVar.ordinal()];
        if (i15 == 1) {
            i13 = dq1.b.ic_face_sad_states_nonpds;
            i14 = dq1.f.story_pin_feedback_satisfaction_not_great;
        } else if (i15 == 2) {
            i13 = dq1.b.ic_face_neutral_states_nonpds;
            i14 = dq1.f.story_pin_feedback_satisfaction_okay;
        } else {
            if (i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = dq1.b.ic_face_happy_states_nonpds;
            i14 = dq1.f.idea_pin_feedback_satisfaction_great;
        }
        ideaPinFeedbackSatisfactionView.setTag(dq1.c.feedback_satisfaction, Integer.valueOf(rVar.getValue()));
        a0.p(ideaPinFeedbackSatisfactionView.f48574b, bs1.c.f2(ideaPinFeedbackSatisfactionView, i14));
        ideaPinFeedbackSatisfactionView.f48573a.setImageResource(i13);
        ideaPinFeedbackSatisfactionView.setOnClickListener(new y0(this, rVar, ideaPinFeedbackSatisfactionView, 23));
    }

    public final void T(r rVar) {
        if (rVar == null) {
            return;
        }
        boolean z13 = false;
        for (IdeaPinFeedbackSatisfactionView ideaPinFeedbackSatisfactionView : this.f138969b) {
            Object tag = ideaPinFeedbackSatisfactionView.getTag(dq1.c.feedback_satisfaction);
            int value = rVar.getValue();
            boolean z14 = tag instanceof Integer;
            int i13 = 15;
            GestaltText gestaltText = ideaPinFeedbackSatisfactionView.f48574b;
            ImageView imageView = ideaPinFeedbackSatisfactionView.f48573a;
            if (z14 && value == ((Number) tag).intValue()) {
                imageView.setSelected(true);
                gestaltText.i(new fd1.h(true, i13));
            } else {
                imageView.setSelected(false);
                gestaltText.i(new fd1.h(z13, i13));
            }
        }
    }
}
