package com.pinterest.feature.sharesheet.view;

import a62.d;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import fd1.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import ye2.o;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/InviteModalAppView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InviteModalAppView extends LinearLayout implements n, c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48397f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f48398a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48399b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f48400c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f48401d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteModalAppView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target_legacy, (ViewGroup) this, true);
        }
        View findViewById = findViewById(a62.c.icon_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48400c = (ImageView) findViewById;
        this.f48401d = (GestaltIconButton) findViewById(a62.c.gestalt_icon_button);
        View findViewById2 = findViewById(a62.c.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48402e = (GestaltText) findViewById2;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById(a62.c.app_icon_layout)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, getResources().getDimensionPixelSize(r0.margin_half), getResources().getDimensionPixelSize(r0.margin_half), 0);
    }

    public final void a() {
        if (this.f48399b) {
            return;
        }
        this.f48399b = true;
        ((r) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48398a == null) {
            this.f48398a = new o(this);
        }
        return this.f48398a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48398a == null) {
            this.f48398a = new o(this);
        }
        return this.f48398a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteModalAppView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target_legacy, (ViewGroup) this, true);
        }
        View findViewById = findViewById(a62.c.icon_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48400c = (ImageView) findViewById;
        this.f48401d = (GestaltIconButton) findViewById(a62.c.gestalt_icon_button);
        View findViewById2 = findViewById(a62.c.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48402e = (GestaltText) findViewById2;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById(a62.c.app_icon_layout)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, getResources().getDimensionPixelSize(r0.margin_half), getResources().getDimensionPixelSize(r0.margin_half), 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteModalAppView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target_legacy, (ViewGroup) this, true);
        }
        View findViewById = findViewById(a62.c.icon_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48400c = (ImageView) findViewById;
        this.f48401d = (GestaltIconButton) findViewById(a62.c.gestalt_icon_button);
        View findViewById2 = findViewById(a62.c.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48402e = (GestaltText) findViewById2;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById(a62.c.app_icon_layout)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, getResources().getDimensionPixelSize(r0.margin_half), getResources().getDimensionPixelSize(r0.margin_half), 0);
    }
}
