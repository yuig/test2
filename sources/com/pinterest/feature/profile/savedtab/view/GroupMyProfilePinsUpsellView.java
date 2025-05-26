package com.pinterest.feature.profile.savedtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c51.c;
import c51.d;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d51.h;
import dl1.s;
import f51.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg0.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/profile/savedtab/view/GroupMyProfilePinsUpsellView;", "Landroid/widget/LinearLayout;", "Lc51/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GroupMyProfilePinsUpsellView extends LinearLayout implements c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f47575j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47576a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47577b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f47578c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f47579d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f47580e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIconButton f47581f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f47582g;

    /* renamed from: h, reason: collision with root package name */
    public d f47583h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f47584i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupMyProfilePinsUpsellView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        n nVar;
        super.onAttachedToWindow();
        if (this.f47584i) {
            return;
        }
        d dVar = this.f47583h;
        if (dVar != null) {
            s item = ((h) dVar).getItem(0);
            a aVar = item instanceof a ? (a) item : null;
            if (aVar != null && (nVar = aVar.f61205a) != null) {
                nVar.g();
            }
        }
        this.f47584i = true;
    }

    public /* synthetic */ GroupMyProfilePinsUpsellView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMyProfilePinsUpsellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, nz1.d.group_my_profile_pins_upsell, this);
        View findViewById = findViewById(nz1.c.upsell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47576a = (GestaltText) findViewById;
        View findViewById2 = findViewById(nz1.c.upsell_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47577b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.upsell_dismiss_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47581f = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(nz1.c.upsell_complete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47582g = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(nz1.c.pin_iv_1);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47578c = (WebImageView) findViewById5;
        View findViewById6 = findViewById(nz1.c.pin_iv_2);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47579d = (WebImageView) findViewById6;
        View findViewById7 = findViewById(nz1.c.pin_iv_3);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47580e = (WebImageView) findViewById7;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackground(com.bumptech.glide.c.I(context, le0.c.banner_shadow));
    }
}
