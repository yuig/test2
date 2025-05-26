package com.pinterest.feature.ideaPinCreation.drafts.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq1.d;
import aq1.f;
import bs1.c;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nu0.b;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/drafts/view/IdeaPinDraftPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinDraftPreview extends ConstraintLayout implements n {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f46466h = 0;

    /* renamed from: a, reason: collision with root package name */
    public Function0 f46467a;

    /* renamed from: b, reason: collision with root package name */
    public final RoundedCornersLayout f46468b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f46469c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f46470d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f46471e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f46472f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIconButton f46473g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinDraftPreview(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46467a = b.f92317i;
        View inflate = View.inflate(getContext(), f.view_idea_pin_draft_preview, this);
        Intrinsics.f(inflate);
        int W = c.W(inflate, eo1.c.space_100);
        inflate.setPadding(W, W, W, W);
        View findViewById = inflate.findViewById(d.draft_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46468b = (RoundedCornersLayout) findViewById;
        View findViewById2 = inflate.findViewById(d.error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46469c = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(d.draft_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46470d = (WebImageView) findViewById3;
        View findViewById4 = inflate.findViewById(d.top_left_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46471e = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(d.description_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f46472f = (GestaltText) findViewById5;
        View findViewById6 = inflate.findViewById(d.delete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46473g = (GestaltIconButton) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinDraftPreview(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46467a = b.f92317i;
        View inflate = View.inflate(getContext(), f.view_idea_pin_draft_preview, this);
        Intrinsics.f(inflate);
        int W = c.W(inflate, eo1.c.space_100);
        inflate.setPadding(W, W, W, W);
        View findViewById = inflate.findViewById(d.draft_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46468b = (RoundedCornersLayout) findViewById;
        View findViewById2 = inflate.findViewById(d.error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46469c = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(d.draft_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46470d = (WebImageView) findViewById3;
        View findViewById4 = inflate.findViewById(d.top_left_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46471e = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(d.description_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f46472f = (GestaltText) findViewById5;
        View findViewById6 = inflate.findViewById(d.delete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46473g = (GestaltIconButton) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinDraftPreview(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46467a = b.f92317i;
        View inflate = View.inflate(getContext(), f.view_idea_pin_draft_preview, this);
        Intrinsics.f(inflate);
        int W = c.W(inflate, eo1.c.space_100);
        inflate.setPadding(W, W, W, W);
        View findViewById = inflate.findViewById(d.draft_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46468b = (RoundedCornersLayout) findViewById;
        View findViewById2 = inflate.findViewById(d.error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46469c = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(d.draft_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46470d = (WebImageView) findViewById3;
        View findViewById4 = inflate.findViewById(d.top_left_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46471e = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(d.description_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f46472f = (GestaltText) findViewById5;
        View findViewById6 = inflate.findViewById(d.delete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f46473g = (GestaltIconButton) findViewById6;
    }
}
