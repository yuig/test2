package com.pinterest.feature.conversation.view;

import a.m2;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.view.RoundedCornersImageView;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.imageview.ProportionalImageView;
import eo1.c;
import ey.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import x10.b;
import xc0.e;
import xc0.f;
import xo.s;
import zp.y0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationDidItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationDidItemView extends s {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f45528o = 0;

    /* renamed from: d, reason: collision with root package name */
    public ProportionalImageView f45529d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f45530e;

    /* renamed from: f, reason: collision with root package name */
    public RoundedCornersImageView f45531f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltAvatar f45532g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f45533h;

    /* renamed from: i, reason: collision with root package name */
    public String f45534i;

    /* renamed from: j, reason: collision with root package name */
    public String f45535j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f45536k;

    /* renamed from: l, reason: collision with root package name */
    public b f45537l;

    /* renamed from: m, reason: collision with root package name */
    public k3 f45538m;

    /* renamed from: n, reason: collision with root package name */
    public b60.b f45539n;

    public ConversationDidItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 6);
        i();
    }

    public final void i() {
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(8, resources);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        int K2 = a0.K(8, resources2);
        setPaddingRelative(K2, K, K2, K);
        Resources resources3 = getResources();
        View.inflate(getContext(), f.list_cell_conversation_did, this);
        View findViewById = findViewById(e.done_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById;
        Intrinsics.checkNotNullParameter(proportionalImageView, "<set-?>");
        this.f45529d = proportionalImageView;
        View findViewById2 = findViewById(e.details);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f45530e = gestaltText;
        View findViewById3 = findViewById(e.pin_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) findViewById3;
        Intrinsics.checkNotNullParameter(roundedCornersImageView, "<set-?>");
        this.f45531f = roundedCornersImageView;
        View findViewById4 = findViewById(e.pinner_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<set-?>");
        this.f45532g = gestaltAvatar;
        View findViewById5 = findViewById(e.pinner_action);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById5;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f45533h = gestaltText2;
        RoundedCornersImageView roundedCornersImageView2 = this.f45531f;
        if (roundedCornersImageView2 == null) {
            Intrinsics.r("pinImageView");
            throw null;
        }
        float dimensionPixelOffset = resources3.getDimensionPixelOffset(c.lego_corner_radius_small);
        roundedCornersImageView2.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        ProportionalImageView proportionalImageView2 = this.f45529d;
        if (proportionalImageView2 == null) {
            Intrinsics.r("doneImageView");
            throw null;
        }
        float dimensionPixelOffset2 = resources3.getDimensionPixelOffset(ga2.b.lego_button_large_side_padding);
        proportionalImageView2.g2(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f45535j;
        String str2 = this.f45534i;
        if (str == null || str2 == null || this.f45536k) {
            return;
        }
        setOnClickListener(new y0(this, str2, str, 8));
        setOnTouchListener(new m2(this, 9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setOnClickListener(null);
        setOnTouchListener(null);
        super.onDetachedFromWindow();
    }

    public ConversationDidItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 6);
        i();
    }
}
