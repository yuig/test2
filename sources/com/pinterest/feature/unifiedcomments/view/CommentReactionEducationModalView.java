package com.pinterest.feature.unifiedcomments.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import jc0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oh1.o;
import org.jetbrains.annotations.NotNull;
import rh1.j;
import rh1.t;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/CommentReactionEducationModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oh1/o", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentReactionEducationModalView extends ConstraintLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public o f48928a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionEducationModalView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_reaction_education_modal_view, this);
        setPaddingRelative(0, 0, 0, c.W(this, eo1.c.lego_spacing_vertical_xlarge));
        View findViewById = findViewById(fb0.c.close_button);
        ((GestaltIconButton) findViewById).v(new t(this, 2));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = findViewById(fb0.c.complete_button);
        ((GestaltButton) findViewById2).d(j.f108174l).g(new t(this, 3));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
    }

    public static void L(CommentReactionEducationModalView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o oVar = this$0.f48928a;
        if (oVar != null) {
            oVar.f94551c.i("PREF_COMMENT_REACTION_EDUCATION_IS_ACCEPTED", true);
            oVar.f94550b.d(new s());
            oVar.f94549a.invoke();
        }
    }

    public static void T(CommentReactionEducationModalView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o oVar = this$0.f48928a;
        if (oVar != null) {
            oVar.f94551c.i("PREF_COMMENT_REACTION_EDUCATION_IS_ACCEPTED", true);
            oVar.f94550b.d(new s());
            oVar.f94549a.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionEducationModalView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_reaction_education_modal_view, this);
        setPaddingRelative(0, 0, 0, c.W(this, eo1.c.lego_spacing_vertical_xlarge));
        View findViewById = findViewById(fb0.c.close_button);
        ((GestaltIconButton) findViewById).v(new t(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = findViewById(fb0.c.complete_button);
        ((GestaltButton) findViewById2).d(j.f108174l).g(new t(this, 1));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
    }
}
