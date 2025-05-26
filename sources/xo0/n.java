package xo0;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class n extends LinearLayout implements uo0.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f135604g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f135605a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f135606b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltAvatar f135607c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f135608d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f135609e;

    /* renamed from: f, reason: collision with root package name */
    public wo0.g f135610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f135605a = frameLayout;
        WebImageView webImageView = new WebImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, webImageView.getResources().getDimensionPixelSize(b80.a.article_header_height));
        Resources resources = webImageView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        com.bumptech.glide.c.a1(layoutParams, 0, 0, 0, a0.K(20, resources));
        webImageView.setLayoutParams(layoutParams);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f135606b = webImageView;
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388691);
        Resources resources2 = gestaltAvatar.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        int L = a0.L(resources2, 16.0f);
        com.bumptech.glide.c.a1(layoutParams2, L, 0, L, 0);
        gestaltAvatar.setLayoutParams(layoutParams2);
        gestaltAvatar.M2(new yb0.b(this, 28));
        this.f135607c = gestaltAvatar;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        Resources resources3 = gestaltText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        int L2 = a0.L(resources3, 16.0f);
        com.bumptech.glide.c.a1(layoutParams3, L2, 0, L2, 0);
        gestaltText.setLayoutParams(layoutParams3);
        gestaltText.i(c.f135578m);
        this.f135608d = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        Resources resources4 = gestaltText2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        int L3 = a0.L(resources4, 16.0f);
        Resources resources5 = gestaltText2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        com.bumptech.glide.c.a1(layoutParams4, L3, 0, L3, a0.L(resources5, 8.0f));
        gestaltText2.setLayoutParams(layoutParams4);
        gestaltText2.i(c.f135577l);
        this.f135609e = gestaltText2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        frameLayout.addView(webImageView);
        frameLayout.addView(gestaltAvatar);
        addView(frameLayout);
        addView(gestaltText);
        addView(gestaltText2);
    }
}
