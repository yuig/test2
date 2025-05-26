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
import eo1.a;
import fd1.p;
import fd1.q;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import os.g;
import pk.a0;
import ye2.o;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/SharesheetModalAppView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SharesheetModalAppView extends LinearLayout implements n, c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48414f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f48415a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48416b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f48417c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f48418d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target_legacy, (ViewGroup) this, true);
        }
        View findViewById = findViewById(a62.c.icon_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48417c = (ImageView) findViewById;
        this.f48418d = (GestaltIconButton) findViewById(a62.c.gestalt_icon_button);
        View findViewById2 = findViewById(a62.c.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48419e = (GestaltText) findViewById2;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById(a62.c.app_icon_layout)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, getResources().getDimensionPixelSize(r0.margin_half), getResources().getDimensionPixelSize(r0.margin_half), 0);
    }

    public final void a(g contact, g91.d listener) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean T1 = b.T1(context);
        int i13 = 1;
        GestaltIconButton gestaltIconButton = this.f48418d;
        ImageView imageView = this.f48417c;
        if (!T1 || gestaltIconButton == null || contact.f97487d == null) {
            bs1.c.U1(imageView);
            imageView.setImageDrawable(contact.f97484a);
            imageView.setBackgroundColor(b.y0(this, a.sema_color_background_transparent));
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.d0(gestaltIconButton);
            }
        } else {
            g3.y(gestaltIconButton, new q(contact, i13));
            bs1.c.X0(imageView);
        }
        String text = contact.f97485b;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        a0.p(this.f48419e, text);
        setOnClickListener(new p(listener, contact, 1));
    }

    public final void b() {
        if (this.f48416b) {
            return;
        }
        this.f48416b = true;
        ((fd1.r0) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48415a == null) {
            this.f48415a = new o(this);
        }
        return this.f48415a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48415a == null) {
            this.f48415a = new o(this);
        }
        return this.f48415a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        b();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target_legacy, (ViewGroup) this, true);
        }
        View findViewById = findViewById(a62.c.icon_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48417c = (ImageView) findViewById;
        this.f48418d = (GestaltIconButton) findViewById(a62.c.gestalt_icon_button);
        View findViewById2 = findViewById(a62.c.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48419e = (GestaltText) findViewById2;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById(a62.c.app_icon_layout)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, getResources().getDimensionPixelSize(r0.margin_half), getResources().getDimensionPixelSize(r0.margin_half), 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        b();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (b.T1(context2)) {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(d.view_lego_sharesheet_app_target_legacy, (ViewGroup) this, true);
        }
        View findViewById = findViewById(a62.c.icon_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48417c = (ImageView) findViewById;
        this.f48418d = (GestaltIconButton) findViewById(a62.c.gestalt_icon_button);
        View findViewById2 = findViewById(a62.c.text_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48419e = (GestaltText) findViewById2;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById(a62.c.app_icon_layout)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, 0, getResources().getDimensionPixelSize(r0.margin_half), getResources().getDimensionPixelSize(r0.margin_half), 0);
    }
}
