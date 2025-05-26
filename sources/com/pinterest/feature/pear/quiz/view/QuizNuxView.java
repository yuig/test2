package com.pinterest.feature.pear.quiz.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import dl2.b;
import i32.h0;
import i32.j0;
import iy1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import rq.o2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pear/quiz/view/QuizNuxView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class QuizNuxView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46861a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizNuxView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_pear_quiz_nux, this);
        setOrientation(1);
        setGravity(1);
    }

    public static void a(GestaltIcon gestaltIcon, Integer num) {
        if (num == null) {
            c.X0(gestaltIcon);
            return;
        }
        h0 h0Var = j0.Companion;
        int intValue = num.intValue();
        h0Var.getClass();
        j0 a13 = h0.a(intValue);
        int i13 = a13 == null ? -1 : hz0.c.f70641a[a13.ordinal()];
        q qVar = i13 != 1 ? i13 != 2 ? null : q.HEART : q.GIFT;
        if (qVar == null) {
            c.X0(gestaltIcon);
        } else {
            c.U1(gestaltIcon);
            b.z(gestaltIcon, new o2(qVar, 12));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizNuxView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_pear_quiz_nux, this);
        setOrientation(1);
        setGravity(1);
    }
}
