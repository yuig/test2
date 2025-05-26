package com.pinterest.feature.pear.quiz.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import fz0.u;
import hz0.a;
import iy1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pear/quiz/view/QuizGradingAnswerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class QuizGradingAnswerView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46860a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizGradingAnswerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_quiz_grading_answer, this);
    }

    public final void L(u uVar, int i13, int i14, int i15, int i16, int i17) {
        View findViewById = findViewById(i14);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i18 = 1;
        gradientDrawable.setShape(1);
        Context context = findViewById.getContext();
        if (i13 == i17) {
            i15 = i16;
        }
        gradientDrawable.setColor(ColorStateList.valueOf(context.getColor(i15)));
        gradientDrawable.setStroke(4, findViewById.getContext().getColor(i16));
        findViewById.setBackground(gradientDrawable);
        findViewById.setOnClickListener(new a(uVar, i17, i18));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizGradingAnswerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_quiz_grading_answer, this);
    }
}
