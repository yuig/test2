package rl1;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final List f108641a = kotlin.collections.f0.j(kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_red_100), Integer.valueOf(eo1.b.base_color_red_500)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_red_200), Integer.valueOf(eo1.b.base_color_red_400)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_purple_100), Integer.valueOf(eo1.b.base_color_purple_500)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_purple_200), Integer.valueOf(eo1.b.base_color_purple_400)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_blue_100), Integer.valueOf(eo1.b.base_color_blue_500)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_blue_200), Integer.valueOf(eo1.b.base_color_blue_400)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_green_100), Integer.valueOf(eo1.b.base_color_green_500)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_green_200), Integer.valueOf(eo1.b.base_color_green_400)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_orange_100), Integer.valueOf(eo1.b.base_color_orange_500)), kotlin.collections.f0.j(Integer.valueOf(eo1.b.base_color_orange_200), Integer.valueOf(eo1.b.base_color_orange_400)));

    public static final g a(TypedArray attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        int dimensionPixelOffset = attributes.getDimensionPixelOffset(l0.Avatar_size, 0);
        String string = attributes.getString(l0.Avatar_image_url);
        String str = string == null ? "" : string;
        int resourceId = attributes.getResourceId(l0.Avatar_background_color, l.f108624a);
        boolean z13 = attributes.getBoolean(l0.Avatar_apply_overlay_on_white, true);
        o oVar = new o(attributes.getBoolean(l0.Avatar_border, true), attributes.getDimensionPixelOffset(l0.Avatar_border_width, -1), attributes.getResourceId(l0.Avatar_border_color, l.f108625b));
        m0 m0Var = new m0(attributes.getBoolean(l0.Avatar_verified, false), attributes.getResourceId(l0.Avatar_verified_icon, l.f108626c), attributes.getDimensionPixelOffset(l0.Avatar_verified_icon_size, 0), attributes.getDimensionPixelOffset(l0.Avatar_verified_icon_position_offset, 0), attributes.getDimensionPixelOffset(l0.Avatar_verified_icon_padding, 0), attributes.getBoolean(l0.Avatar_verified_icon_border, true), attributes.getDimensionPixelOffset(l0.Avatar_verified_icon_border_width, -1), attributes.getResourceId(l0.Avatar_verified_icon_border_color, -1), attributes.getBoolean(l0.Avatar_verified_icon_background, true), attributes.getResourceId(l0.Avatar_verified_icon_background_color, l.f108627d), attributes.getResourceId(l0.Avatar_verified_icon_tint_color, -1));
        String string2 = attributes.getString(l0.Avatar_name);
        return new g(dimensionPixelOffset, str, resourceId, z13, oVar, m0Var, new h0(string2 != null ? string2 : "", attributes.getResourceId(l0.Avatar_name_color, l.f108628e), attributes.getDimensionPixelSize(l0.Avatar_name_text_size, -1)), (String) null, d7.b.Y(attributes, l0.Avatar_android_visibility, l.f108629f), 0, com.bumptech.glide.c.N(attributes, l0.GestaltAvatar_android_importantForAccessibility), 1664);
    }

    public static final g b(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i13, l0.Avatar);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        g a13 = a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return a13;
    }

    public static final g c(g gVar, String imageUrl, String name, boolean z13) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return g.a(gVar, 0, imageUrl, null, m0.a(gVar.f108579f, z13, 0, 0, 0, 0, 2046), g(gVar, name), null, 3997);
    }

    public static final g d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, k0.LegoAvatar_SizeXSmall);
    }

    public static final g e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, k0.LegoAvatar_SizeLarge);
    }

    public static final g f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, k0.LegoAvatar_SizeMedium);
    }

    public static final h0 g(g gVar, String name) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return h0.a(gVar.f108580g, name, 0, 0.0f, 6);
    }

    public static final g h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, k0.LegoAvatar_SizeSmall);
    }
}
