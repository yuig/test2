package com.pinterest.feature.unifiedcomments.upsell;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.feature.unifiedcomments.upsell.CommentNudgeUpsellModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import gm1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/upsell/CommentNudgeUpsellModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentNudgeUpsellModalView extends ConstraintLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f48907a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentNudgeUpsellModalView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_nudge_upsell_modal_view, this);
        int W = c.W(this, eo1.c.lego_spacing_vertical_xlarge);
        final int i13 = 0;
        setPaddingRelative(0, W, 0, W);
        View findViewById = findViewById(fb0.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(fb0.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(fb0.c.pin_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ((GestaltButton) findViewById(fb0.c.dismiss_button)).e(new a(this) { // from class: ph1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentNudgeUpsellModalView f100162b;

            {
                this.f100162b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                CommentNudgeUpsellModalView this$0 = this.f100162b;
                switch (i14) {
                    case 0:
                        int i15 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 1:
                        int i16 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 2:
                        int i17 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    default:
                        int i18 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                }
            }
        });
        final int i14 = 1;
        ((GestaltButton) findViewById(fb0.c.complete_button)).e(new a(this) { // from class: ph1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentNudgeUpsellModalView f100162b;

            {
                this.f100162b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                CommentNudgeUpsellModalView this$0 = this.f100162b;
                switch (i142) {
                    case 0:
                        int i15 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 1:
                        int i16 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 2:
                        int i17 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    default:
                        int i18 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentNudgeUpsellModalView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), fb0.d.comment_nudge_upsell_modal_view, this);
        int W = c.W(this, eo1.c.lego_spacing_vertical_xlarge);
        setPaddingRelative(0, W, 0, W);
        View findViewById = findViewById(fb0.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(fb0.c.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(fb0.c.pin_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        final int i14 = 2;
        ((GestaltButton) findViewById(fb0.c.dismiss_button)).e(new a(this) { // from class: ph1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentNudgeUpsellModalView f100162b;

            {
                this.f100162b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                CommentNudgeUpsellModalView this$0 = this.f100162b;
                switch (i142) {
                    case 0:
                        int i15 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 1:
                        int i16 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 2:
                        int i17 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    default:
                        int i18 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                }
            }
        });
        final int i15 = 3;
        ((GestaltButton) findViewById(fb0.c.complete_button)).e(new a(this) { // from class: ph1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentNudgeUpsellModalView f100162b;

            {
                this.f100162b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                CommentNudgeUpsellModalView this$0 = this.f100162b;
                switch (i142) {
                    case 0:
                        int i152 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 1:
                        int i16 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    case 2:
                        int i17 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                    default:
                        int i18 = CommentNudgeUpsellModalView.f48907a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        break;
                }
            }
        });
    }
}
