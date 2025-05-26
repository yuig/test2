package com.pinterest.feature.unifiedcomments.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import db0.c;
import jc0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oh1.p;
import om1.l;
import org.jetbrains.annotations.NotNull;
import rh1.v;
import rh1.w;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/CommentReactionListModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rh1/w", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentReactionListModalView extends ConstraintLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public w f48929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionListModalView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), db0.d.comment_reaction_list_modal_view, this);
        ((GestaltIconButton) findViewById(c.close_button)).u(new v(this, 1));
    }

    public static void L(CommentReactionListModalView this$0, gm1.c it) {
        w wVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof l) || (wVar = this$0.f48929a) == null) {
            return;
        }
        p pVar = (p) wVar;
        pVar.f94558g.d(new s());
        pVar.f94557f.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionListModalView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), db0.d.comment_reaction_list_modal_view, this);
        ((GestaltIconButton) findViewById(c.close_button)).u(new v(this, 0));
    }
}
