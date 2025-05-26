package com.pinterest.feature.home.tuner.sba;

import af2.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import dl2.b;
import eo1.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kh2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lq0.f1;
import lq0.g1;
import org.jetbrains.annotations.NotNull;
import pe.i;
import so.jb;
import u50.r;
import xk2.w;
import xs0.j;
import xs0.k;
import ye2.o;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/home/tuner/sba/SbaHfBoardToggleSettingCellView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SbaHfBoardToggleSettingCellView extends LinearLayout implements d, c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f45813k = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45814a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45815b;

    /* renamed from: c, reason: collision with root package name */
    public pb0.d f45816c;

    /* renamed from: d, reason: collision with root package name */
    public r f45817d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f45818e;

    /* renamed from: f, reason: collision with root package name */
    public final View f45819f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltSwitch f45820g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f45821h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltAvatarGroup f45822i;

    /* renamed from: j, reason: collision with root package name */
    public final ProportionalImageView f45823j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaHfBoardToggleSettingCellView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int F0 = b.F0(context2, a.hft_board_vertical_spacing);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        layoutParams.topMargin = F0;
        layoutParams.bottomMargin = F0;
        setLayoutParams(layoutParams);
        Context context3 = getContext();
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context3.getColor(i13));
        View.inflate(getContext(), xp1.b.homefeed_tab_settings_board_list_cell, this);
        View findViewById = findViewById(xp1.a.board_toggle_item);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45820g = (GestaltSwitch) findViewById;
        View findViewById2 = findViewById(xp1.a.board_collaborators_avatar_group);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45822i = (GestaltAvatarGroup) findViewById2;
        View findViewById3 = findViewById(xp1.a.new_board_name_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45818e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(xp1.a.new_board_secret_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45819f = findViewById4;
        View findViewById5 = findViewById(xp1.a.new_board_pin_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45821h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(xp1.a.new_board_thumbnail_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45823j = (ProportionalImageView) findViewById6;
    }

    public final void a(xs0.a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float D0 = b.D0(context, a.hft_board_image_corner_radius);
        ProportionalImageView proportionalImageView = this.f45823j;
        proportionalImageView.g2(D0, D0, D0, D0);
        String str = displayState.f135767b;
        Context context2 = getContext();
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f45823j.V1(str, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(context2.getColor(i13)), (r18 & 64) != 0 ? null : null, null);
        CharSequence charSequence = null;
        String str2 = displayState.f135767b;
        if (str2 == null || !(!z.j(str2))) {
            proportionalImageView.setImageDrawable(null);
            proportionalImageView.setBackgroundColor(getContext().getColor(eo1.b.color_gray_500));
        } else {
            proportionalImageView.loadUrl(str2);
        }
        this.f45818e.i(new g1(18, displayState, this));
        Resources resources = getResources();
        int i14 = xp1.c.plural_homefeed_pin_count;
        int i15 = displayState.f135773h;
        String quantityString = resources.getQuantityString(i14, i15, Integer.valueOf(i15));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        int i16 = displayState.f135775j;
        String quantityString2 = i16 > 0 ? getResources().getQuantityString(xp1.c.plural_homefeed_section_count, i16, Integer.valueOf(i16)) : "";
        Intrinsics.f(quantityString2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        spannableStringBuilder.append((CharSequence) quantityString2);
        int i17 = 0;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getColor(eo1.b.color_themed_text_default)), 0, spannableStringBuilder.length(), 33);
        Date date = displayState.f135776k;
        if (date != null) {
            pb0.d dVar = this.f45816c;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            CharSequence b13 = dVar.b(date, pb0.b.STYLE_COMPACT, false);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ("  " + ((Object) b13)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getColor(eo1.b.color_gray_500)), length, spannableStringBuilder.length(), 33);
        }
        if (date != null) {
            pb0.d dVar2 = this.f45816c;
            if (dVar2 == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            charSequence = dVar2.b(date, pb0.b.STYLE_NORMAL, false);
        }
        this.f45821h.i(new j(spannableStringBuilder, quantityString + " " + quantityString2 + " " + ((Object) charSequence), i17));
        List<wy0> list = displayState.f135774i;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (wy0 wy0Var : list) {
                String m33 = wy0Var.m3();
                if (m33 != null) {
                    arrayList.add(new w(m33, wy0Var.getUid(), wy0Var.q2()));
                }
            }
            this.f45822i.a(new k(displayState.f135778m, 0, arrayList));
        }
        this.f45819f.setVisibility(Intrinsics.d(displayState.f135769d, Boolean.TRUE) ? 0 : 8);
        if (displayState.f135777l) {
            setOnClickListener(new lj0.a(this, 26));
        }
        i.i(this.f45820g.i(new f1(displayState, 13)), new g1(19, new xs0.i(0, displayState, this), this));
    }

    public final void b() {
        if (this.f45815b) {
            return;
        }
        this.f45815b = true;
        n.K(this, ((jb) ((xs0.n) generatedComponent())).f113483a.j2());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45814a == null) {
            this.f45814a = new o(this);
        }
        return this.f45814a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45814a == null) {
            this.f45814a = new o(this);
        }
        return this.f45814a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaHfBoardToggleSettingCellView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int F0 = b.F0(context2, a.hft_board_vertical_spacing);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        layoutParams.topMargin = F0;
        layoutParams.bottomMargin = F0;
        setLayoutParams(layoutParams);
        Context context3 = getContext();
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context3.getColor(i13));
        View.inflate(getContext(), xp1.b.homefeed_tab_settings_board_list_cell, this);
        View findViewById = findViewById(xp1.a.board_toggle_item);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45820g = (GestaltSwitch) findViewById;
        View findViewById2 = findViewById(xp1.a.board_collaborators_avatar_group);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45822i = (GestaltAvatarGroup) findViewById2;
        View findViewById3 = findViewById(xp1.a.new_board_name_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45818e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(xp1.a.new_board_secret_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45819f = findViewById4;
        View findViewById5 = findViewById(xp1.a.new_board_pin_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45821h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(xp1.a.new_board_thumbnail_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45823j = (ProportionalImageView) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaHfBoardToggleSettingCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int F0 = b.F0(context2, a.hft_board_vertical_spacing);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        layoutParams.topMargin = F0;
        layoutParams.bottomMargin = F0;
        setLayoutParams(layoutParams);
        Context context3 = getContext();
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context3.getColor(i14));
        View.inflate(getContext(), xp1.b.homefeed_tab_settings_board_list_cell, this);
        View findViewById = findViewById(xp1.a.board_toggle_item);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45820g = (GestaltSwitch) findViewById;
        View findViewById2 = findViewById(xp1.a.board_collaborators_avatar_group);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45822i = (GestaltAvatarGroup) findViewById2;
        View findViewById3 = findViewById(xp1.a.new_board_name_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45818e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(xp1.a.new_board_secret_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45819f = findViewById4;
        View findViewById5 = findViewById(xp1.a.new_board_pin_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45821h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(xp1.a.new_board_thumbnail_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45823j = (ProportionalImageView) findViewById6;
    }
}
