package qn1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.tag.GestaltTag;
import im1.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.n;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104465i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTag f104466j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltTag gestaltTag, int i13) {
        super(1);
        this.f104465i = i13;
        this.f104466j = gestaltTag;
    }

    public final void b(i0 text) {
        int i13 = this.f104465i;
        GestaltTag gestaltTag = this.f104466j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(text, "text");
                Context context = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltTag.setText(text.a(context));
                gestaltTag.setGravity(16);
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "contentDescription");
                Context context2 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gestaltTag.setContentDescription(text.a(context2));
                break;
        }
    }

    public final void e(boolean z13) {
        int i13 = this.f104465i;
        GestaltTag gestaltTag = this.f104466j;
        switch (i13) {
            case 3:
                c cVar = GestaltTag.f49633c;
                if (z13) {
                    gestaltTag.getClass();
                    gestaltTag.l(new rm1.e(n.CANCEL, GestaltIcon.f49404f), gestaltTag.i().f104469c.getIconColor$tag_release(), true);
                    break;
                } else {
                    GestaltTag.k(gestaltTag, gestaltTag.getCompoundDrawablesRelative()[0], null, 2);
                    break;
                }
            default:
                int backgroundColor$tag_release = z13 ? eo1.a.comp_tag_selected_background_color : gestaltTag.i().f104469c.getBackgroundColor$tag_release();
                c cVar2 = GestaltTag.f49633c;
                gestaltTag.getBackground().setTint(dl2.b.y0(gestaltTag, backgroundColor$tag_release));
                if (z13) {
                    gestaltTag.setTextColor(dl2.b.y0(gestaltTag, eo1.a.comp_tag_text_color_selected));
                    Drawable[] compoundDrawablesRelative = gestaltTag.getCompoundDrawablesRelative();
                    Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
                    for (Drawable drawable : compoundDrawablesRelative) {
                        if (drawable != null) {
                            drawable.setTint(dl2.b.y0(gestaltTag, eo1.a.comp_tag_icon_color_selected));
                        }
                    }
                } else {
                    gestaltTag.setTextColor(dl2.b.y0(gestaltTag, gestaltTag.i().f104469c.getTextColor$tag_release()));
                    Drawable[] compoundDrawablesRelative2 = gestaltTag.getCompoundDrawablesRelative();
                    Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative2, "getCompoundDrawablesRelative(...)");
                    for (Drawable drawable2 : compoundDrawablesRelative2) {
                        if (drawable2 != null) {
                            drawable2.setTint(dl2.b.y0(gestaltTag, gestaltTag.i().f104469c.getIconColor$tag_release()));
                        }
                    }
                }
                if (((Boolean) gestaltTag.f49637b.getValue()).booleanValue()) {
                    if (!z13 || gestaltTag.i().f104469c != d.DEFAULT) {
                        gestaltTag.setCompoundDrawablesRelativeWithIntrinsicBounds(gestaltTag.getCompoundDrawablesRelative()[0], (Drawable) null, gestaltTag.getCompoundDrawablesRelative()[2], (Drawable) null);
                        break;
                    } else {
                        gestaltTag.l(new rm1.e(n.CHECK, GestaltIcon.f49404f), eo1.a.comp_tag_icon_color_selected, false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        int i13 = this.f104465i;
        GestaltTag gestaltTag = this.f104466j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                c cVar = GestaltTag.f49633c;
                gestaltTag.getClass();
                String string = $receiver.getString(j.GestaltTag_android_text);
                f0 x13 = string != null ? ep.b.x(string, "string", string) : ep.b.x("", "string", "");
                String string2 = $receiver.getString(j.GestaltTag_android_contentDescription);
                f0 x14 = string2 != null ? ep.b.x(string2, "string", string2) : ep.b.x("", "string", "");
                int i14 = $receiver.getInt(j.GestaltTag_gestalt_tagVariant, -1);
                d dVar = i14 >= 0 ? d.values()[i14] : GestaltTag.f49634d;
                int i15 = $receiver.getInt(j.GestaltTag_gestalt_tagSize, -1);
                return new b(x13, x14, dVar, i15 >= 0 ? c.values()[i15] : GestaltTag.f49633c, d7.b.Y($receiver, j.GestaltTag_android_visibility, GestaltTag.f49635e), $receiver.getBoolean(j.GestaltTag_gestalt_tagSelected, false), $receiver.getBoolean(j.GestaltTag_gestalt_tagDismissible, true), gestaltTag.getId());
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                c cVar2 = GestaltTag.f49633c;
                gestaltTag.getClass();
                gestaltTag.f49636a.F(m.f72668n, new a(gestaltTag, 11));
                return Unit.f80348a;
            case 2:
                rm1.g gVar = (rm1.g) obj;
                if (gVar != null) {
                    gestaltTag.l(gVar, gestaltTag.i().f104469c.getIconColor$tag_release(), false);
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    GestaltTag.k(gestaltTag, null, gestaltTag.getCompoundDrawablesRelative()[2], 1);
                }
                return Unit.f80348a;
            case 3:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 4:
                d variant = (d) obj;
                Intrinsics.checkNotNullParameter(variant, "variant");
                gestaltTag.setTextColor(dl2.b.y0(gestaltTag, variant.getTextColor$tag_release()));
                gestaltTag.getBackground().setTint(dl2.b.y0(gestaltTag, variant.getBackgroundColor$tag_release()));
                if (variant == d.DISABLED) {
                    gestaltTag.setClickable(false);
                    gestaltTag.setEnabled(false);
                    GestaltTag.k(gestaltTag, null, null, 3);
                } else {
                    gestaltTag.setClickable(true);
                    gestaltTag.setEnabled(true);
                }
                return Unit.f80348a;
            case 5:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 6:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 6:
                        gestaltTag.setId(intValue);
                        break;
                    default:
                        gestaltTag.setVisibility(intValue);
                        break;
                }
                return Unit.f80348a;
            case 7:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 6:
                        gestaltTag.setId(intValue2);
                        break;
                    default:
                        gestaltTag.setVisibility(intValue2);
                        break;
                }
                return Unit.f80348a;
            case 8:
                b((i0) obj);
                return Unit.f80348a;
            case 9:
                b((i0) obj);
                return Unit.f80348a;
            case 10:
                c size = (c) obj;
                Intrinsics.checkNotNullParameter(size, "size");
                Context context = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltTag.setMinimumHeight(dl2.b.F0(context, size.getMinHeight()));
                gestaltTag.setBackground(gestaltTag.getResources().getDrawable(gestaltTag.i().f104470d.getRoundBackground(), gestaltTag.getContext().getTheme()));
                Context context2 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int F0 = dl2.b.F0(context2, size.getPaddingStart());
                Context context3 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int F02 = dl2.b.F0(context3, size.getPaddingTop());
                Context context4 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int F03 = dl2.b.F0(context4, size.getPaddingEnd());
                Context context5 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                gestaltTag.setPaddingRelative(F0, F02, F03, dl2.b.F0(context5, size.getPaddingBottom()));
                gestaltTag.setTextAppearance(i.GestaltTag);
                Context context6 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                gestaltTag.setTextSize(0, dl2.b.D0(context6, size.getTextSize()));
                Context context7 = gestaltTag.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                gestaltTag.setLineSpacing(0.0f, dl2.b.K0(context7, size.getTextSpacingMultiplier()));
                return Unit.f80348a;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new f(gestaltTag.getId());
        }
    }
}
