package com.pinterest.feature.profile.header;

import a41.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeCarousel;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import eo1.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import m60.w0;
import om1.t;
import org.jetbrains.annotations.NotNull;
import oz1.d;
import qb0.a;
import qb0.f;
import rm1.q;
import u50.r;
import uq.w;
import xk2.v;
import y31.c;
import y31.e;
import y31.g;
import y31.h;
import y31.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/profile/header/UserProfileHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "l3/c", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UserProfileHeader extends w {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f47517s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f47518d;

    /* renamed from: e, reason: collision with root package name */
    public final View f47519e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltAvatar f47520f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f47521g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f47522h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f47523i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltPreviewTextView f47524j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f47525k;

    /* renamed from: l, reason: collision with root package name */
    public final InspirationalBadgeCarousel f47526l;

    /* renamed from: m, reason: collision with root package name */
    public final v f47527m;

    /* renamed from: n, reason: collision with root package name */
    public j f47528n;

    /* renamed from: o, reason: collision with root package name */
    public yk1.v f47529o;

    /* renamed from: p, reason: collision with root package name */
    public f f47530p;

    /* renamed from: q, reason: collision with root package name */
    public r f47531q;

    /* renamed from: r, reason: collision with root package name */
    public m f47532r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserProfileHeader(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(SpannableStringBuilder spannableStringBuilder, e eVar, StringBuilder sb3) {
        Integer num = eVar.f136784a;
        if (num != null) {
            int intValue = num.intValue();
            yk1.v resources = this.f47529o;
            if (resources == null) {
                Intrinsics.r("viewResources");
                throw null;
            }
            a formatter = new a();
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            String D = a.a.D(qb0.j.b(intValue), " ", ((yk1.a) resources).f139224a.getQuantityString(w0.plural_followers_only_lowercase, intValue, new Object[0]));
            sb3.append(qb0.j.a(D));
            sb3.append(" ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) D);
            spannableStringBuilder.setSpan(new h(this, 0), length, D.length() + length, 33);
        }
    }

    public final void T(SpannableStringBuilder spannableStringBuilder, e eVar, StringBuilder sb3) {
        Integer num = eVar.f136785b;
        if (num != null) {
            int intValue = num.intValue();
            String quantityString = getResources().getQuantityString(d.plural_following_only_lowercase, intValue);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            if (this.f47530p == null) {
                Intrinsics.r("formatter");
                throw null;
            }
            String str = qb0.j.b(intValue) + " " + quantityString;
            spannableStringBuilder.append((CharSequence) str);
            sb3.append(" ");
            sb3.append(qb0.j.a(str));
            Object hVar = new h(this, 1);
            int length = spannableStringBuilder.length() - str.length();
            if (length < 0) {
                length = 0;
            }
            spannableStringBuilder.setSpan(hVar, length, spannableStringBuilder.length(), 33);
        }
    }

    public final void X(SpannableStringBuilder spannableStringBuilder, c cVar) {
        q qVar;
        int i13 = g.f136795a[cVar.f136777a.ordinal()];
        if (i13 == 1) {
            qVar = q.INSTAGRAM;
        } else if (i13 == 2) {
            qVar = q.GLOBE;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = q.GLOBE_CHECKED;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable f03 = bs1.c.f0(this, qVar.drawableRes(context), Integer.valueOf(b.color_icon_default), null, 4);
        f03.setBounds(0, 0, getContext().getResources().getDimensionPixelSize(t.icon_size_md), getContext().getResources().getDimensionPixelSize(t.icon_size_md));
        spannableStringBuilder.setSpan(new ImageSpan(f03, 2), bs1.c.l1(this) ? spannableStringBuilder.length() - 1 : 0, bs1.c.l1(this) ? spannableStringBuilder.length() : 1, 33);
    }

    public final k Z() {
        return (k) this.f47527m.getValue();
    }

    public final void a0(SpannableStringBuilder spannableStringBuilder, e eVar, StringBuilder sb3) {
        String quantityString;
        Integer num = eVar.f136786c;
        if (num != null) {
            int intValue = num.intValue();
            if (!bs1.c.l1(this) && spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(" · ");
            }
            if (intValue > 10000000) {
                quantityString = getResources().getString(oz1.e.monthly_views_max);
            } else {
                Resources resources = getResources();
                int i13 = d.monthly_views;
                if (this.f47530p == null) {
                    Intrinsics.r("formatter");
                    throw null;
                }
                quantityString = resources.getQuantityString(i13, intValue, qb0.j.b(intValue));
            }
            Intrinsics.f(quantityString);
            spannableStringBuilder.append((CharSequence) quantityString);
            if (bs1.c.l1(this)) {
                spannableStringBuilder.append(" · ");
            }
            sb3.append(" ");
            sb3.append(qb0.j.a(quantityString));
        }
    }

    public final void d0(m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47532r = listener;
    }

    public final void setEventIntake(r rVar) {
        this.f47531q = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 21, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47527m = xk2.m.b(new b01.c(10, context, this));
        View.inflate(context, nz1.d.view_user_profile_header, this);
        View findViewById = findViewById(nz1.c.cover_media_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47518d = (ViewGroup) findViewById;
        View findViewById2 = findViewById(nz1.c.cover_media_overlay_gradient);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47519e = findViewById2;
        View findViewById3 = findViewById(nz1.c.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47520f = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(nz1.c.full_name);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47521g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(nz1.c.description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47522h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(nz1.c.user_profile_statistics);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47523i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(nz1.c.user_profile_about);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47524j = (GestaltPreviewTextView) findViewById7;
        View findViewById8 = findViewById(nz1.c.user_profile_links);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f47525k = (GestaltText) findViewById8;
        View findViewById9 = findViewById(nz1.c.inspirational_badges);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        InspirationalBadgeCarousel inspirationalBadgeCarousel = (InspirationalBadgeCarousel) findViewById9;
        this.f47526l = inspirationalBadgeCarousel;
        com.pinterest.feature.home.view.c listener = new com.pinterest.feature.home.view.c(this, 27);
        inspirationalBadgeCarousel.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        inspirationalBadgeCarousel.f48532b = listener;
        setId(nz1.c.user_profile_header);
    }
}
