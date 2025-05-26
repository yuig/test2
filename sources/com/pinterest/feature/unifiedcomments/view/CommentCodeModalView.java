package com.pinterest.feature.unifiedcomments.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.feature.unifiedcomments.view.CommentCodeModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import i01.r0;
import jc0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import oh1.a;
import oh1.l;
import oh1.n;
import org.jetbrains.annotations.NotNull;
import rh1.j;
import rq.c2;
import tk2.e;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/CommentCodeModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oh1/n", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentCodeModalView extends ConstraintLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public n f48919a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCodeModalView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_code_model_view, this);
        setPaddingRelative(0, 0, 0, c.W(this, eo1.c.lego_spacing_vertical_xlarge));
        View findViewById = findViewById(fb0.c.background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((ImageView) findViewById).setClipToOutline(true);
        View findViewById2 = findViewById(fb0.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(fb0.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(fb0.c.item_title_1);
        GestaltText gestaltText = (GestaltText) findViewById4;
        gestaltText.i(new c2(gestaltText, 17));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        View findViewById5 = findViewById(fb0.c.item_title_2);
        GestaltText gestaltText2 = (GestaltText) findViewById5;
        gestaltText2.i(new c2(gestaltText2, 18));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = findViewById(fb0.c.item_title_3);
        GestaltText gestaltText3 = (GestaltText) findViewById6;
        gestaltText3.i(new c2(gestaltText3, 19));
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        View findViewById7 = findViewById(fb0.c.close_button);
        final int i13 = 4;
        ((GestaltIconButton) findViewById7).v(new View.OnClickListener(this) { // from class: rh1.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentCodeModalView f108264b;

            {
                this.f108264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                CommentCodeModalView commentCodeModalView = this.f108264b;
                switch (i14) {
                    case 0:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 1:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 2:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 3:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 4:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    default:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        View findViewById8 = findViewById(fb0.c.complete_button);
        final int i14 = 5;
        ((GestaltButton) findViewById8).d(j.f108173k).g(new View.OnClickListener(this) { // from class: rh1.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentCodeModalView f108264b;

            {
                this.f108264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                CommentCodeModalView commentCodeModalView = this.f108264b;
                switch (i142) {
                    case 0:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 1:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 2:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 3:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 4:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    default:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
    }

    public static void L(CommentCodeModalView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f48919a;
        if (nVar != null) {
            nVar.f94545a.c("COMMENT_CODE_IS_ACCEPTED", 1).l(e.f118017c).h(wj2.c.a()).i(new r0(12), new a(2, l.f94511k));
            nVar.f94548d.i("PREF_COMMENT_CODE_MODAL_IS_ACCEPTED", true);
            d0.v(nVar.getPinalytics(), f1.COMMENT_CODE_ACCEPTED, null, false, 12);
            nVar.f94547c.d(new s());
            nVar.f94546b.invoke();
        }
    }

    public static void T(CommentCodeModalView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        n nVar = this$0.f48919a;
        if (nVar != null) {
            d0.v(nVar.getPinalytics(), f1.COMMENT_CODE_DISMISSED, null, false, 12);
            nVar.f94547c.d(new s());
            nVar.f94546b.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCodeModalView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_code_model_view, this);
        final int i13 = 0;
        setPaddingRelative(0, 0, 0, c.W(this, eo1.c.lego_spacing_vertical_xlarge));
        View findViewById = findViewById(fb0.c.background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        final int i14 = 1;
        ((ImageView) findViewById).setClipToOutline(true);
        View findViewById2 = findViewById(fb0.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(fb0.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(fb0.c.item_title_1);
        GestaltText gestaltText = (GestaltText) findViewById4;
        gestaltText.i(new c2(gestaltText, 17));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        View findViewById5 = findViewById(fb0.c.item_title_2);
        GestaltText gestaltText2 = (GestaltText) findViewById5;
        gestaltText2.i(new c2(gestaltText2, 18));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = findViewById(fb0.c.item_title_3);
        GestaltText gestaltText3 = (GestaltText) findViewById6;
        gestaltText3.i(new c2(gestaltText3, 19));
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        View findViewById7 = findViewById(fb0.c.close_button);
        ((GestaltIconButton) findViewById7).v(new View.OnClickListener(this) { // from class: rh1.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentCodeModalView f108264b;

            {
                this.f108264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i13;
                CommentCodeModalView commentCodeModalView = this.f108264b;
                switch (i142) {
                    case 0:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 1:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 2:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 3:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 4:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    default:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        View findViewById8 = findViewById(fb0.c.complete_button);
        ((GestaltButton) findViewById8).d(j.f108173k).g(new View.OnClickListener(this) { // from class: rh1.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentCodeModalView f108264b;

            {
                this.f108264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                CommentCodeModalView commentCodeModalView = this.f108264b;
                switch (i142) {
                    case 0:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 1:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 2:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 3:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 4:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    default:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCodeModalView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_code_model_view, this);
        setPaddingRelative(0, 0, 0, c.W(this, eo1.c.lego_spacing_vertical_xlarge));
        View findViewById = findViewById(fb0.c.background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((ImageView) findViewById).setClipToOutline(true);
        View findViewById2 = findViewById(fb0.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(fb0.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(fb0.c.item_title_1);
        GestaltText gestaltText = (GestaltText) findViewById4;
        gestaltText.i(new c2(gestaltText, 17));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        View findViewById5 = findViewById(fb0.c.item_title_2);
        GestaltText gestaltText2 = (GestaltText) findViewById5;
        gestaltText2.i(new c2(gestaltText2, 18));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = findViewById(fb0.c.item_title_3);
        GestaltText gestaltText3 = (GestaltText) findViewById6;
        gestaltText3.i(new c2(gestaltText3, 19));
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        View findViewById7 = findViewById(fb0.c.close_button);
        final int i14 = 2;
        ((GestaltIconButton) findViewById7).v(new View.OnClickListener(this) { // from class: rh1.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentCodeModalView f108264b;

            {
                this.f108264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                CommentCodeModalView commentCodeModalView = this.f108264b;
                switch (i142) {
                    case 0:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 1:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 2:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 3:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 4:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    default:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        View findViewById8 = findViewById(fb0.c.complete_button);
        final int i15 = 3;
        ((GestaltButton) findViewById8).d(j.f108173k).g(new View.OnClickListener(this) { // from class: rh1.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentCodeModalView f108264b;

            {
                this.f108264b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                CommentCodeModalView commentCodeModalView = this.f108264b;
                switch (i142) {
                    case 0:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 1:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 2:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    case 3:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                    case 4:
                        CommentCodeModalView.T(commentCodeModalView);
                        break;
                    default:
                        CommentCodeModalView.L(commentCodeModalView);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
    }
}
