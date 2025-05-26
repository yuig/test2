package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.LegoPinGridCell;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public class b0 extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f121421h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f121422i;

    /* renamed from: j, reason: collision with root package name */
    public final vn1.c f121423j;

    /* renamed from: k, reason: collision with root package name */
    public int f121424k;

    /* renamed from: l, reason: collision with root package name */
    public final rm1.c f121425l;

    /* renamed from: m, reason: collision with root package name */
    public final int f121426m;

    /* renamed from: n, reason: collision with root package name */
    public final int f121427n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f121428o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f121429p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f121430q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f121431r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f121432s;

    /* renamed from: t, reason: collision with root package name */
    public rm1.q f121433t;

    /* renamed from: u, reason: collision with root package name */
    public String f121434u;

    /* renamed from: v, reason: collision with root package name */
    public int f121435v;

    /* renamed from: w, reason: collision with root package name */
    public int f121436w;

    /* renamed from: x, reason: collision with root package name */
    public int f121437x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(LegoPinGridCell legoGridCell, int i13, a0 alignment, vn1.c defaultTextColor, int i14, rm1.c defaultIconColor, int i15, int i16, boolean z13, boolean z14, Integer num, int i17) {
        super(legoGridCell, b1.FIXED);
        alignment = (i17 & 4) != 0 ? a0.START : alignment;
        defaultTextColor = (i17 & 8) != 0 ? vn1.c.DEFAULT : defaultTextColor;
        i14 = (i17 & 16) != 0 ? wy1.a.grid_pin_indicator : i14;
        defaultIconColor = (i17 & 32) != 0 ? rm1.c.DEFAULT : defaultIconColor;
        i15 = (i17 & 64) != 0 ? eo1.c.lego_grid_cell_indicator_padding : i15;
        i16 = (i17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? eo1.c.lego_grid_cell_indicator_padding : i16;
        z13 = (i17 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z13;
        z14 = (i17 & 1024) != 0 ? false : z14;
        num = (i17 & 2048) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(defaultTextColor, "defaultTextColor");
        Intrinsics.checkNotNullParameter(defaultIconColor, "defaultIconColor");
        this.f121421h = i13;
        this.f121422i = alignment;
        this.f121423j = defaultTextColor;
        this.f121424k = i14;
        this.f121425l = defaultIconColor;
        this.f121426m = i15;
        this.f121427n = i16;
        this.f121428o = false;
        this.f121429p = z13;
        this.f121430q = z14;
        this.f121431r = num;
        this.f121432s = xk2.m.b(new et1.r0(17, legoGridCell, this));
        this.f121434u = "";
    }

    public static void F(b0 b0Var, rm1.c iconColor) {
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        va2.j E = b0Var.E();
        E.getClass();
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        E.f125394y = iconColor;
        E.f125395z = null;
    }

    @Override // ua2.h0
    public boolean C(int i13, int i14) {
        return false;
    }

    public final va2.j E() {
        return (va2.j) this.f121432s.getValue();
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return E();
    }

    @Override // ua2.f1
    public void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i18 = this.f121421h;
        int i19 = i14 + i18 + this.f121437x;
        boolean z13 = this.f121494c;
        a0 a0Var = this.f121422i;
        if (!(z13 && a0Var == a0.START) && (z13 || a0Var != a0.END)) {
            i17 = this.f121435v + i13 + i18;
        } else {
            i17 = i15 - ((t() + i18) + this.f121435v);
        }
        E().Q = this.f121428o;
        va2.j E = E();
        int t13 = t() + i17;
        int w13 = w() + i19;
        E.setBounds(i17, i19, t13, w13);
        Rect rect = E.A;
        rect.left = i17;
        rect.top = i19;
        rect.right = t13;
        rect.bottom = w13;
        va2.j E2 = E();
        int x13 = x() + i17;
        int w14 = w() + i19;
        E2.setBounds(i17, i19, x13, w14);
        Rect rect2 = E2.B;
        rect2.left = i17;
        rect2.top = i19;
        rect2.right = x13;
        rect2.bottom = w14;
        if (!E().f128846i) {
            E().draw(canvas);
        }
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int dimensionPixelSize;
        String str;
        E().j(this.f121433t);
        va2.j E = E();
        String str2 = this.f121434u;
        E.getClass();
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        E.O = str2;
        E().R = null;
        E().N = this.f121436w;
        E().P = i13 - (this.f121421h * 2);
        va2.j E2 = E();
        String str3 = E2.O;
        float f13 = E2.P;
        tn1.c cVar = E2.f125388s;
        String a13 = wa2.l.a(str3, cVar, f13);
        String str4 = E2.R;
        if (str4 != null) {
            if (!Intrinsics.d(a13, E2.O)) {
                String a14 = wa2.l.a(str4, cVar, E2.P);
                Intrinsics.checkNotNullExpressionValue(a14, "ellipsize(...)");
                E2.O = a14;
            }
            Unit unit = Unit.f80348a;
        }
        Rect rect = new Rect();
        String str5 = E2.O;
        cVar.getTextBounds(str5, 0, str5.length(), rect);
        int i15 = E2.f125390u * 2;
        boolean z13 = E2.f125386q;
        Context context = E2.f125381l;
        if (!z13 || E2.K == null) {
            dimensionPixelSize = ((z13 && E2.K == null) ? context.getResources().getDimensionPixelSize(wy1.b.d2s_indicator_text_right_padding) : E2.f125391v) * 2;
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(wy1.b.d2s_indicator_icon_left_padding) + context.getResources().getDimensionPixelSize(wy1.b.d2s_indicator_text_right_padding);
        }
        E2.e(Math.max(rect.height(), E2.N) + i15);
        E2.I = E2.N + dimensionPixelSize;
        int max = Math.max(rect.width(), E2.N) + dimensionPixelSize;
        if (E2.K != null && (str = E2.O) != null && !kotlin.text.z.j(str)) {
            if (E2.N == 0) {
                E2.N = E2.f128842e - i15;
            }
            int i16 = E2.N + E2.f125392w;
            max += i16;
            E2.M = i16 / 2.0f;
        } else if (E2.K == null) {
            E2.N = 0;
            E2.M = 0.0f;
        }
        if (E2.T) {
            max += E2.N;
        }
        E2.f(max);
        if (!dl2.b.T1(context)) {
            E2.f125393x = (E2.f128842e + 1) / 2;
        }
        if (z13) {
            E2.f125393x = context.getResources().getDimensionPixelSize(wy1.b.d2s_corner_radius);
        }
        if (E2.f125385p) {
            E2.f125393x = E2.f125387r != null ? context.getResources().getDimensionPixelSize(r9.intValue()) : E2.f125393x;
        }
        return new z0(E().f128841d, E().f128842e);
    }
}
