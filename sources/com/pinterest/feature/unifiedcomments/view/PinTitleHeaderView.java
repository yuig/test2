package com.pinterest.feature.unifiedcomments.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j4;
import ob2.c;
import ob2.d;
import ob2.f;
import oh1.u;
import org.jetbrains.annotations.NotNull;
import pe.i;
import rh1.b2;
import rh1.d1;
import rh1.j;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/PinTitleHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinTitleHeaderView extends d1 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f48957l = 0;

    /* renamed from: d, reason: collision with root package name */
    public j4 f48958d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f48959e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f48960f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltDivider f48961g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIconButton f48962h;

    /* renamed from: i, reason: collision with root package name */
    public final v f48963i;

    /* renamed from: j, reason: collision with root package name */
    public final v f48964j;

    /* renamed from: k, reason: collision with root package name */
    public final v f48965k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinTitleHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        v b13 = m.b(new b2(this, 0));
        this.f48963i = b13;
        v b14 = m.b(new b2(this, 1));
        this.f48964j = b14;
        v b15 = m.b(new b2(this, 2));
        this.f48965k = b15;
        View.inflate(getContext(), d.pin_title_header, this);
        View findViewById = findViewById(c.pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        if (((Boolean) b13.getValue()).booleanValue() || ((Boolean) b14.getValue()).booleanValue() || ((Boolean) b15.getValue()).booleanValue()) {
            Intrinsics.f(webImageView);
            ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = webImageView.getResources().getDimensionPixelSize(eo1.c.space_600);
            webImageView.setLayoutParams(marginLayoutParams);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48959e = webImageView;
        View findViewById2 = findViewById(c.pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48960f = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.divider);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48961g = (GestaltDivider) findViewById3;
        View findViewById4 = findViewById(c.pin_title_header_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48962h = (GestaltIconButton) findViewById4;
    }

    public final void L(f30 pin) {
        String string;
        Intrinsics.checkNotNullParameter(pin, "pin");
        String B0 = bs1.c.B0(pin);
        Intrinsics.f(B0);
        this.f48959e.loadUrl(B0);
        String z63 = pin.z6();
        if (z63 == null || z63.length() == 0) {
            String r43 = pin.r4();
            if (r43 == null || r43.length() == 0) {
                wy0 n13 = b40.n(pin);
                String Z2 = n13 != null ? n13.Z2() : null;
                if (Z2 == null || Z2.length() == 0) {
                    String E = b40.E(pin);
                    if (E == null || E.length() == 0) {
                        string = getResources().getString(f.community_feed_placeholder);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = getResources().getString(f.content_description_pin_by_user, b40.E(pin));
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                } else {
                    Resources resources = getResources();
                    int i13 = f.content_description_pin_by_user;
                    Object[] objArr = new Object[1];
                    wy0 n14 = b40.n(pin);
                    objArr[0] = n14 != null ? n14.Z2() : null;
                    string = resources.getString(i13, objArr);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
            } else {
                string = pin.r4();
                Intrinsics.f(string);
            }
        } else {
            string = pin.z6();
            Intrinsics.f(string);
        }
        this.f48960f.i(new u(7, string, this));
    }

    public final void T() {
        g3.y(this.f48962h, j.f108188z);
    }

    public final void X() {
        i.g(this.f48961g, j.A);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinTitleHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        v b13 = m.b(new b2(this, 0));
        this.f48963i = b13;
        v b14 = m.b(new b2(this, 1));
        this.f48964j = b14;
        v b15 = m.b(new b2(this, 2));
        this.f48965k = b15;
        View.inflate(getContext(), d.pin_title_header, this);
        View findViewById = findViewById(c.pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        if (((Boolean) b13.getValue()).booleanValue() || ((Boolean) b14.getValue()).booleanValue() || ((Boolean) b15.getValue()).booleanValue()) {
            Intrinsics.f(webImageView);
            ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = webImageView.getResources().getDimensionPixelSize(eo1.c.space_600);
                webImageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48959e = webImageView;
        View findViewById2 = findViewById(c.pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48960f = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.divider);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48961g = (GestaltDivider) findViewById3;
        View findViewById4 = findViewById(c.pin_title_header_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48962h = (GestaltIconButton) findViewById4;
    }
}
