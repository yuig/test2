package com.pinterest.feature.engagementtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.a;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ng0.b;
import om1.m;
import org.jetbrains.annotations.NotNull;
import rn1.f;
import rn1.h;
import rp0.d;
import up0.l;
import uq.w;
import uq.x;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/engagementtab/FloatingCommentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "wr0/a0", "engagementTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FloatingCommentView extends w {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f45688q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatar f45689d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f45690e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f45691f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f45692g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIconButton f45693h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f45694i;

    /* renamed from: j, reason: collision with root package name */
    public final WebImageView f45695j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltIconButton f45696k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltIconButton f45697l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f45698m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f45699n;

    /* renamed from: o, reason: collision with root package name */
    public final x f45700o;

    /* renamed from: p, reason: collision with root package name */
    public l f45701p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingCommentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 9);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f45700o = new x(context2);
        View.inflate(getContext(), b.view_floating_comment, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_200);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setBackgroundColor(dl2.b.y0(this, a.sema_color_background_default));
        View findViewById = findViewById(ng0.a.floating_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45689d = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(ng0.a.floating_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45690e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(ng0.a.floating_comment_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45691f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(ng0.a.floating_timestamp);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45692g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(ng0.a.floating_highlighted);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        View findViewById6 = findViewById(ng0.a.floating_overflow_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45693h = (GestaltIconButton) findViewById6;
        View findViewById7 = findViewById(ng0.a.floating_unread_red_dot);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45694i = (ImageView) findViewById7;
        View findViewById8 = findViewById(ng0.a.floating_comment_image);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45695j = (WebImageView) findViewById8;
        View findViewById9 = findViewById(ng0.a.floating_comment_like);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45696k = (GestaltIconButton) findViewById9;
        View findViewById10 = findViewById(ng0.a.floating_comment_unlike);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f45697l = (GestaltIconButton) findViewById10;
        View findViewById11 = findViewById(ng0.a.floating_comment_like_count);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f45698m = (GestaltText) findViewById11;
        View findViewById12 = findViewById(ng0.a.floating_comment_reply);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f45699n = (GestaltText) findViewById12;
        View findViewById13 = findViewById(ng0.a.floating_button_mark_helpful);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        View findViewById14 = findViewById(ng0.a.floating_button_unmark_helpful);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
    }

    public final void L(gm1.c cVar, b0.c cVar2) {
        Function2 function2 = (Function2) cVar2.f20712a;
        d dVar = (d) cVar2.f20716e;
        int j13 = cVar.j();
        if (j13 == ng0.a.floating_user_name) {
            Function1 function1 = (Function1) cVar2.f20715d;
            wy0 w13 = dVar.w();
            if (w13 != null) {
                String f39332b = w13.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                function1.invoke(f39332b);
                return;
            }
            return;
        }
        if (j13 == ng0.a.floating_comment_like_count) {
            if (cVar instanceof f) {
                function2.invoke(dVar, this.f45696k.getVisibility() == 0 ? rh1.x.Like : rh1.x.Unlike);
            }
            if (cVar instanceof h) {
                function2.invoke(dVar, rh1.x.ViewLikes);
                return;
            }
            return;
        }
        if (j13 == ng0.a.floating_comment_reply) {
            function2.invoke(dVar, rh1.x.Reply);
            return;
        }
        if (j13 == ng0.a.floating_comment_like) {
            if (cVar instanceof om1.l) {
                function2.invoke(dVar, rh1.x.Like);
            }
            if (cVar instanceof m) {
                function2.invoke(dVar, rh1.x.ViewLikes);
                return;
            }
            return;
        }
        if (j13 == ng0.a.floating_comment_unlike) {
            if (cVar instanceof om1.l) {
                function2.invoke(dVar, rh1.x.Unlike);
            }
            if (cVar instanceof m) {
                function2.invoke(dVar, rh1.x.ViewLikes);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingCommentView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 9, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f45700o = new x(context2);
        View.inflate(getContext(), b.view_floating_comment, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_200);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setBackgroundColor(dl2.b.y0(this, a.sema_color_background_default));
        View findViewById = findViewById(ng0.a.floating_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45689d = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(ng0.a.floating_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45690e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(ng0.a.floating_comment_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45691f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(ng0.a.floating_timestamp);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45692g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(ng0.a.floating_highlighted);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        View findViewById6 = findViewById(ng0.a.floating_overflow_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45693h = (GestaltIconButton) findViewById6;
        View findViewById7 = findViewById(ng0.a.floating_unread_red_dot);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45694i = (ImageView) findViewById7;
        View findViewById8 = findViewById(ng0.a.floating_comment_image);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45695j = (WebImageView) findViewById8;
        View findViewById9 = findViewById(ng0.a.floating_comment_like);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45696k = (GestaltIconButton) findViewById9;
        View findViewById10 = findViewById(ng0.a.floating_comment_unlike);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f45697l = (GestaltIconButton) findViewById10;
        View findViewById11 = findViewById(ng0.a.floating_comment_like_count);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f45698m = (GestaltText) findViewById11;
        View findViewById12 = findViewById(ng0.a.floating_comment_reply);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f45699n = (GestaltText) findViewById12;
        View findViewById13 = findViewById(ng0.a.floating_button_mark_helpful);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        View findViewById14 = findViewById(ng0.a.floating_button_unmark_helpful);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
    }
}
