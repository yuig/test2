package yd1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kc1.w;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import vn1.g;

/* loaded from: classes5.dex */
public final class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final g f138792a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f138793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138794c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138795d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltAvatar f138796e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f138797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, g titleTextVariant) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(titleTextVariant, "titleTextVariant");
        this.f138792a = titleTextVariant;
        this.f138793b = null;
        this.f138794c = 2;
        this.f138795d = false;
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        gestaltAvatar.H2(b.f138787j);
        this.f138796e = gestaltAvatar;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new w(this, 20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        gestaltText.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = gestaltText.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart(gestaltText.getResources().getDimensionPixelOffset(r0.margin));
        gestaltText.setLayoutParams(marginLayoutParams);
        this.f138797f = gestaltText;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        setOrientation(0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(17);
        setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        addView(gestaltAvatar);
        addView(gestaltText);
    }
}
