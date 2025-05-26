package hj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.bumptech.glide.d;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.d0;
import fj.e;
import fj.j;
import fj.k;
import fj.l;
import fj.m;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final BadgeState$State f69268a;

    /* renamed from: b, reason: collision with root package name */
    public final BadgeState$State f69269b;

    /* renamed from: c, reason: collision with root package name */
    public final float f69270c;

    /* renamed from: d, reason: collision with root package name */
    public final float f69271d;

    /* renamed from: e, reason: collision with root package name */
    public final float f69272e;

    /* renamed from: f, reason: collision with root package name */
    public final float f69273f;

    /* renamed from: g, reason: collision with root package name */
    public final float f69274g;

    /* renamed from: h, reason: collision with root package name */
    public final float f69275h;

    /* renamed from: i, reason: collision with root package name */
    public final int f69276i;

    /* renamed from: j, reason: collision with root package name */
    public final int f69277j;

    /* renamed from: k, reason: collision with root package name */
    public final int f69278k;

    public b(Context context, BadgeState$State badgeState$State) {
        AttributeSet attributeSet;
        int i13;
        int next;
        int i14 = a.f69254o;
        int i15 = a.f69253n;
        this.f69269b = new BadgeState$State();
        int i16 = badgeState$State.f32202a;
        if (i16 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i16);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSet = Xml.asAttributeSet(xml);
                i13 = attributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e13) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i16));
                notFoundException.initCause(e13);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i13 = 0;
        }
        TypedArray f13 = d0.f(context, attributeSet, m.Badge, i14, i13 == 0 ? i15 : i13, new int[0]);
        Resources resources = context.getResources();
        this.f69270c = f13.getDimensionPixelSize(m.Badge_badgeRadius, -1);
        this.f69276i = context.getResources().getDimensionPixelSize(e.mtrl_badge_horizontal_edge_offset);
        this.f69277j = context.getResources().getDimensionPixelSize(e.mtrl_badge_text_horizontal_edge_offset);
        this.f69271d = f13.getDimensionPixelSize(m.Badge_badgeWithTextRadius, -1);
        this.f69272e = f13.getDimension(m.Badge_badgeWidth, resources.getDimension(e.m3_badge_size));
        this.f69274g = f13.getDimension(m.Badge_badgeWithTextWidth, resources.getDimension(e.m3_badge_with_text_size));
        this.f69273f = f13.getDimension(m.Badge_badgeHeight, resources.getDimension(e.m3_badge_size));
        this.f69275h = f13.getDimension(m.Badge_badgeWithTextHeight, resources.getDimension(e.m3_badge_with_text_size));
        this.f69278k = f13.getInt(m.Badge_offsetAlignmentMode, 1);
        BadgeState$State badgeState$State2 = this.f69269b;
        int i17 = badgeState$State.f32210i;
        badgeState$State2.f32210i = i17 == -2 ? 255 : i17;
        int i18 = badgeState$State.f32212k;
        if (i18 != -2) {
            badgeState$State2.f32212k = i18;
        } else if (f13.hasValue(m.Badge_number)) {
            this.f69269b.f32212k = f13.getInt(m.Badge_number, 0);
        } else {
            this.f69269b.f32212k = -1;
        }
        String str = badgeState$State.f32211j;
        if (str != null) {
            this.f69269b.f32211j = str;
        } else if (f13.hasValue(m.Badge_badgeText)) {
            this.f69269b.f32211j = f13.getString(m.Badge_badgeText);
        }
        BadgeState$State badgeState$State3 = this.f69269b;
        badgeState$State3.f32216o = badgeState$State.f32216o;
        CharSequence charSequence = badgeState$State.f32217p;
        badgeState$State3.f32217p = charSequence == null ? context.getString(k.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State4 = this.f69269b;
        int i19 = badgeState$State.f32218q;
        badgeState$State4.f32218q = i19 == 0 ? j.mtrl_badge_content_description : i19;
        int i23 = badgeState$State.f32219r;
        badgeState$State4.f32219r = i23 == 0 ? k.mtrl_exceed_max_badge_number_content_description : i23;
        Boolean bool = badgeState$State.f32221t;
        badgeState$State4.f32221t = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State5 = this.f69269b;
        int i24 = badgeState$State.f32213l;
        badgeState$State5.f32213l = i24 == -2 ? f13.getInt(m.Badge_maxCharacterCount, -2) : i24;
        BadgeState$State badgeState$State6 = this.f69269b;
        int i25 = badgeState$State.f32214m;
        badgeState$State6.f32214m = i25 == -2 ? f13.getInt(m.Badge_maxNumber, -2) : i25;
        BadgeState$State badgeState$State7 = this.f69269b;
        Integer num = badgeState$State.f32206e;
        badgeState$State7.f32206e = Integer.valueOf(num == null ? f13.getResourceId(m.Badge_badgeShapeAppearance, l.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State8 = this.f69269b;
        Integer num2 = badgeState$State.f32207f;
        badgeState$State8.f32207f = Integer.valueOf(num2 == null ? f13.getResourceId(m.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        BadgeState$State badgeState$State9 = this.f69269b;
        Integer num3 = badgeState$State.f32208g;
        badgeState$State9.f32208g = Integer.valueOf(num3 == null ? f13.getResourceId(m.Badge_badgeWithTextShapeAppearance, l.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State10 = this.f69269b;
        Integer num4 = badgeState$State.f32209h;
        badgeState$State10.f32209h = Integer.valueOf(num4 == null ? f13.getResourceId(m.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        BadgeState$State badgeState$State11 = this.f69269b;
        Integer num5 = badgeState$State.f32203b;
        badgeState$State11.f32203b = Integer.valueOf(num5 == null ? d.H(context, f13, m.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State12 = this.f69269b;
        Integer num6 = badgeState$State.f32205d;
        badgeState$State12.f32205d = Integer.valueOf(num6 == null ? f13.getResourceId(m.Badge_badgeTextAppearance, l.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.f32204c;
        if (num7 != null) {
            this.f69269b.f32204c = num7;
        } else if (f13.hasValue(m.Badge_badgeTextColor)) {
            this.f69269b.f32204c = Integer.valueOf(d.H(context, f13, m.Badge_badgeTextColor).getDefaultColor());
        } else {
            int intValue = this.f69269b.f32205d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, m.TextAppearance);
            obtainStyledAttributes.getDimension(m.TextAppearance_android_textSize, 0.0f);
            ColorStateList H = d.H(context, obtainStyledAttributes, m.TextAppearance_android_textColor);
            d.H(context, obtainStyledAttributes, m.TextAppearance_android_textColorHint);
            d.H(context, obtainStyledAttributes, m.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(m.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(m.TextAppearance_android_typeface, 1);
            int i26 = m.TextAppearance_fontFamily;
            i26 = obtainStyledAttributes.hasValue(i26) ? i26 : m.TextAppearance_android_fontFamily;
            obtainStyledAttributes.getResourceId(i26, 0);
            obtainStyledAttributes.getString(i26);
            obtainStyledAttributes.getBoolean(m.TextAppearance_textAllCaps, false);
            d.H(context, obtainStyledAttributes, m.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(m.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(m.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(m.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, m.MaterialTextAppearance);
            obtainStyledAttributes2.hasValue(m.MaterialTextAppearance_android_letterSpacing);
            obtainStyledAttributes2.getFloat(m.MaterialTextAppearance_android_letterSpacing, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f69269b.f32204c = Integer.valueOf(H.getDefaultColor());
        }
        BadgeState$State badgeState$State13 = this.f69269b;
        Integer num8 = badgeState$State.f32220s;
        badgeState$State13.f32220s = Integer.valueOf(num8 == null ? f13.getInt(m.Badge_badgeGravity, 8388661) : num8.intValue());
        BadgeState$State badgeState$State14 = this.f69269b;
        Integer num9 = badgeState$State.f32222u;
        badgeState$State14.f32222u = Integer.valueOf(num9 == null ? f13.getDimensionPixelSize(m.Badge_badgeWidePadding, resources.getDimensionPixelSize(e.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State15 = this.f69269b;
        Integer num10 = badgeState$State.f32223v;
        badgeState$State15.f32223v = Integer.valueOf(num10 == null ? f13.getDimensionPixelSize(m.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(e.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State16 = this.f69269b;
        Integer num11 = badgeState$State.f32224w;
        badgeState$State16.f32224w = Integer.valueOf(num11 == null ? f13.getDimensionPixelOffset(m.Badge_horizontalOffset, 0) : num11.intValue());
        BadgeState$State badgeState$State17 = this.f69269b;
        Integer num12 = badgeState$State.f32225x;
        badgeState$State17.f32225x = Integer.valueOf(num12 == null ? f13.getDimensionPixelOffset(m.Badge_verticalOffset, 0) : num12.intValue());
        BadgeState$State badgeState$State18 = this.f69269b;
        Integer num13 = badgeState$State.f32226y;
        badgeState$State18.f32226y = Integer.valueOf(num13 == null ? f13.getDimensionPixelOffset(m.Badge_horizontalOffsetWithText, badgeState$State18.f32224w.intValue()) : num13.intValue());
        BadgeState$State badgeState$State19 = this.f69269b;
        Integer num14 = badgeState$State.f32227z;
        badgeState$State19.f32227z = Integer.valueOf(num14 == null ? f13.getDimensionPixelOffset(m.Badge_verticalOffsetWithText, badgeState$State19.f32225x.intValue()) : num14.intValue());
        BadgeState$State badgeState$State20 = this.f69269b;
        Integer num15 = badgeState$State.C;
        badgeState$State20.C = Integer.valueOf(num15 == null ? f13.getDimensionPixelOffset(m.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        BadgeState$State badgeState$State21 = this.f69269b;
        Integer num16 = badgeState$State.A;
        badgeState$State21.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State22 = this.f69269b;
        Integer num17 = badgeState$State.B;
        badgeState$State22.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State23 = this.f69269b;
        Boolean bool2 = badgeState$State.D;
        badgeState$State23.D = Boolean.valueOf(bool2 == null ? f13.getBoolean(m.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        f13.recycle();
        Locale locale = badgeState$State.f32215n;
        if (locale == null) {
            this.f69269b.f32215n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f69269b.f32215n = locale;
        }
        this.f69268a = badgeState$State;
    }
}
