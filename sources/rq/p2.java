package rq;

import android.content.Context;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dw0;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p2 extends j implements i01.w, nx.v {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f109460t = 0;

    /* renamed from: c, reason: collision with root package name */
    public b60.b f109461c;

    /* renamed from: d, reason: collision with root package name */
    public lh0.a0 f109462d;

    /* renamed from: e, reason: collision with root package name */
    public hs.d f109463e;

    /* renamed from: f, reason: collision with root package name */
    public i01.v f109464f;

    /* renamed from: g, reason: collision with root package name */
    public h32.c0 f109465g;

    /* renamed from: h, reason: collision with root package name */
    public rp0.d f109466h;

    /* renamed from: i, reason: collision with root package name */
    public ConstraintLayout f109467i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltText f109468j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltIcon f109469k;

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f109470l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltSpinner f109471m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f109472n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f109473o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f109474p;

    /* renamed from: q, reason: collision with root package name */
    public final int[][] f109475q;

    /* renamed from: r, reason: collision with root package name */
    public final int[][] f109476r;

    /* renamed from: s, reason: collision with root package name */
    public final int f109477s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(Context context) {
        super(context, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109472n = xk2.m.b(new m2(this, 0));
        this.f109473o = xk2.m.b(new m2(this, 1));
        this.f109474p = xk2.m.b(new m2(this, 2));
        int i13 = eo1.b.base_color_blue_400;
        int[] iArr = {i13, eo1.b.base_color_blue_100, i13};
        int i14 = eo1.b.base_color_blue_500;
        int i15 = eo1.b.base_color_blue_200;
        int[] iArr2 = {i14, i15, i15};
        int i16 = eo1.b.color_blue_skycicle_500;
        int[] iArr3 = {i16, eo1.b.color_blue_skycicle_100, i16};
        int i17 = eo1.b.color_blue_skycicle_800;
        int i18 = eo1.b.color_blue_skycicle_300;
        this.f109475q = new int[][]{iArr, iArr2, iArr3, new int[]{i17, i18, i18}};
        int i19 = eo1.b.base_color_purple_500;
        int i23 = eo1.b.base_color_purple_100;
        int[] iArr4 = {i19, i23, i19};
        int[] iArr5 = {eo1.b.base_color_purple_400, i23, i23};
        int i24 = eo1.b.color_purple_mysticool_700;
        int i25 = eo1.b.color_purple_mysticool_200;
        int i26 = eo1.b.color_purple_mysticool_600;
        this.f109476r = new int[][]{iArr4, iArr5, new int[]{i24, i25, i24}, new int[]{i26, i25, i26}};
        this.f109477s = (pk.a0.q0(context) && dl2.b.T1(context)) ? eo1.b.base_color_grayscale_200 : dl2.b.T1(context) ? eo1.b.base_color_grayscale_300 : pk.a0.q0(context) ? eo1.b.color_gray_roboflow_300 : eo1.b.base_color_grayscale_300;
    }

    public final SpannableStringBuilder b(String str, int i13, String str2, boolean z13) {
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        String unicodeWrap = bidiFormatter.unicodeWrap(str);
        String unicodeWrap2 = bidiFormatter.unicodeWrap(str2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(n80.a.community_insight_module_text_indent);
        if (z13) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a.a.D(unicodeWrap2, "  ", unicodeWrap));
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(dimensionPixelSize, 0), 0, 1, 33);
            Context context = getContext();
            Object obj = d5.a.f53679a;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(i13)), 0, unicodeWrap2.length(), 33);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            spannableStringBuilder.setSpan(new te0.c(context2), 0, unicodeWrap2.length(), 33);
            return spannableStringBuilder;
        }
        Intrinsics.f(unicodeWrap);
        Intrinsics.f(unicodeWrap2);
        float f13 = hf0.b.f69002b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        gestaltText.i(new l2(unicodeWrap2, 2));
        gestaltText.measure(0, 0);
        int measuredWidth = gestaltText.getMeasuredWidth();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText2.i(new l2(unicodeWrap, 3));
        gestaltText2.measure(0, 0);
        if (gestaltText2.getMeasuredWidth() >= f13 || r3 + measuredWidth <= f13) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a.a.D(unicodeWrap, "  ", unicodeWrap2));
            Context context5 = getContext();
            Object obj2 = d5.a.f53679a;
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(context5.getColor(i13)), spannableStringBuilder2.length() - unicodeWrap2.length(), spannableStringBuilder2.length(), 33);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            spannableStringBuilder2.setSpan(new te0.c(context6), spannableStringBuilder2.length() - unicodeWrap2.length(), spannableStringBuilder2.length(), 33);
            return spannableStringBuilder2;
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(a.a.D(unicodeWrap, "\n", unicodeWrap2));
        Context context7 = getContext();
        Object obj3 = d5.a.f53679a;
        spannableStringBuilder3.setSpan(new ForegroundColorSpan(context7.getColor(i13)), spannableStringBuilder3.length() - unicodeWrap2.length(), spannableStringBuilder3.length(), 33);
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        spannableStringBuilder3.setSpan(new te0.c(context8), spannableStringBuilder3.length() - unicodeWrap2.length(), spannableStringBuilder3.length(), 33);
        return spannableStringBuilder3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (df.j1.U0(r1.c4()) != false) goto L10;
     */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void createView() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = n80.d.pin_closeup_new_comments_module
            android.view.View.inflate(r0, r1, r4)
            int r0 = n80.c.new_comments_module_container
            android.view.View r0 = r4.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            if (r0 == 0) goto L75
            a.l2 r1 = new a.l2
            r2 = 28
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
            com.pinterest.api.model.r40 r1 = r4.getPinMetadata()
            if (r1 != 0) goto L45
            com.pinterest.api.model.f30 r1 = r4.getPin()
            kotlin.jvm.internal.Intrinsics.f(r1)
            java.lang.String r1 = r1.z6()
            boolean r1 = df.j1.U0(r1)
            if (r1 != 0) goto L45
            com.pinterest.api.model.f30 r1 = r4.getPin()
            kotlin.jvm.internal.Intrinsics.f(r1)
            java.lang.String r1 = r1.c4()
            boolean r1 = df.j1.U0(r1)
            if (r1 == 0) goto L75
        L45:
            xk2.v r1 = r4.f109472n
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L67
            boolean r1 = r4.g()
            if (r1 != 0) goto L67
            xk2.v r1 = r4.f109474p
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L75
        L67:
            android.content.res.Resources r1 = r0.getResources()
            int r2 = eo1.c.space_100
            int r1 = r1.getDimensionPixelSize(r2)
            r2 = 0
            r0.setPaddingRelative(r2, r1, r2, r2)
        L75:
            int r0 = n80.c.preview_container
            android.view.View r0 = r4.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r4.f109467i = r0
            int r0 = n80.c.loading_view
            android.view.View r0 = r4.findViewById(r0)
            com.pinterest.gestalt.spinner.GestaltSpinner r0 = (com.pinterest.gestalt.spinner.GestaltSpinner) r0
            r1 = 0
            if (r0 == 0) goto L90
            rq.f2 r2 = rq.f2.f109187o
            kh2.s0.w(r0, r2)
            goto L91
        L90:
            r0 = r1
        L91:
            r4.f109471m = r0
            int r0 = n80.c.insight_icon
            android.view.View r0 = r4.findViewById(r0)
            com.pinterest.gestalt.iconcomponent.GestaltIcon r0 = (com.pinterest.gestalt.iconcomponent.GestaltIcon) r0
            r4.f109469k = r0
            int r0 = n80.c.insight_icon_container
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.f109470l = r0
            int r0 = n80.c.community_insight_text
            android.view.View r0 = r4.findViewById(r0)
            com.pinterest.gestalt.text.GestaltText r0 = (com.pinterest.gestalt.text.GestaltText) r0
            if (r0 == 0) goto Lc4
            android.content.Context r2 = r0.getContext()
            java.lang.Object r3 = d5.a.f53679a
            int r3 = r4.f109477s
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            r0.setEllipsize(r1)
            r1 = r0
        Lc4:
            r4.f109468j = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.p2.createView():void");
    }

    public final boolean g() {
        return ((Boolean) this.f109473o.getValue()).booleanValue();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_COMMENTS;
    }

    public final void i(f30 pin, rp0.d dVar) {
        String str;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (dVar == null) {
            GestaltSpinner gestaltSpinner = this.f109471m;
            if (gestaltSpinner != null) {
                kh2.s0.w(gestaltSpinner, f2.f109188p);
                return;
            }
            return;
        }
        dw0 A6 = pin.A6();
        if (df.j1.U0(A6 != null ? A6.f() : null)) {
            dw0 A62 = pin.A6();
            if (df.j1.U0(A62 != null ? A62.e() : null) && (((Boolean) this.f109472n.getValue()).booleanValue() || g() || ((Boolean) this.f109474p.getValue()).booleanValue())) {
                return;
            }
        }
        this.f109466h = dVar;
        int i13 = 1;
        bs1.c.R1(this.f109467i, true);
        String string = b40.f0(pin) == 1 ? getResources().getString(n80.f.redesigned_comment_view_button_title) : getResources().getString(n80.f.redesigned_comments_view_button_title);
        Intrinsics.f(string);
        String r13 = dVar.r();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        int i14 = 0;
        gestaltText.i(new l2(string, i14));
        gestaltText.measure(0, 0);
        float dimensionPixelSize = ((hf0.b.f69002b - getResources().getDimensionPixelSize(eo1.c.space_800)) * 2) - gestaltText.getMeasuredWidth();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText2.i(new l2(r13, i13));
        gestaltText2.measure(0, 0);
        if (gestaltText2.getMeasuredWidth() > dimensionPixelSize) {
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            j0Var.f80434a = r13;
            while (((CharSequence) j0Var.f80434a).length() > 0) {
                j0Var.f80434a = kotlin.text.e0.z(1, (String) j0Var.f80434a);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText3 = new GestaltText(6, context3, (AttributeSet) null);
                gestaltText3.i(new androidx.compose.foundation.lazy.layout.z0(5, j0Var));
                gestaltText3.measure(0, 0);
                if (gestaltText3.getMeasuredWidth() <= dimensionPixelSize) {
                    str = (String) j0Var.f80434a;
                    break;
                }
            }
        }
        str = r13;
        if (Intrinsics.d(str, r13)) {
            GestaltText gestaltText4 = this.f109468j;
            if (gestaltText4 != null) {
                gestaltText4.i(new n2(this, r13, string, i14));
            }
        } else {
            GestaltText gestaltText5 = this.f109468j;
            if (gestaltText5 != null) {
                gestaltText5.i(new n2(this, str, string, i13));
            }
        }
        FrameLayout frameLayout = this.f109470l;
        if (frameLayout != null) {
            bs1.c.R1(frameLayout, false);
        }
        GestaltIcon gestaltIcon = this.f109469k;
        if (gestaltIcon != null) {
            bs1.c.R1(gestaltIcon, false);
        }
        GestaltSpinner gestaltSpinner2 = this.f109471m;
        if (gestaltSpinner2 != null) {
            kh2.s0.w(gestaltSpinner2, f2.f109189q);
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        h32.c0 c0Var;
        h32.c0 source = this.f109465g;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            c0Var = new h32.c0(source.f66887a, source.f66888b, jq.b.c(TimeUnit.MILLISECONDS), source.f66890d, source.f66891e, source.f66892f, source.f66893g, source.f66894h, source.f66895i, source.f66896j);
        } else {
            c0Var = null;
        }
        this.f109465g = null;
        return c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    @Override // nx.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object markImpressionStart() {
        /*
            r20 = this;
            r0 = r20
            h32.c0 r1 = r0.f109465g
            if (r1 == 0) goto L8
            goto Lc7
        L8:
            rp0.d r1 = r0.f109466h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            boolean r1 = r1.x()
            if (r1 != r3) goto L15
            r2 = r3
        L15:
            rp0.d r1 = r0.f109466h
            r4 = 0
            if (r1 == 0) goto L1f
            java.lang.String r1 = r1.k()
            goto L20
        L1f:
            r1 = r4
        L20:
            java.lang.String r5 = "aggregatedcomment"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r1, r5)
            java.lang.String r7 = "didIt"
            java.lang.String r8 = "aggregatedComment"
            if (r6 == 0) goto L2f
            r19 = r8
            goto L3e
        L2f:
            java.lang.String r6 = "userdiditdata"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            if (r1 == 0) goto L3a
            r19 = r7
            goto L3e
        L3a:
            java.lang.String r1 = ""
            r19 = r1
        L3e:
            rp0.d r1 = r0.f109466h
            java.lang.String r6 = "pin"
            if (r1 == 0) goto L66
            boolean r1 = r1.x()
            if (r1 != r3) goto L66
            rp0.d r1 = r0.f109466h
            if (r1 == 0) goto L62
            kotlin.Pair r1 = r1.t()
            if (r1 == 0) goto L62
            java.lang.Object r9 = r1.f80347b
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r9, r5)
            if (r5 == 0) goto L5d
            r7 = r8
        L5d:
            java.lang.Object r1 = r1.f80346a
            r18 = r7
            goto L74
        L62:
            r1 = r4
            r18 = r1
            goto L74
        L66:
            com.pinterest.api.model.f30 r1 = r20.getPin()
            if (r1 == 0) goto L71
            java.lang.String r1 = r1.getUid()
            goto L72
        L71:
            r1 = r4
        L72:
            r18 = r6
        L74:
            com.pinterest.api.model.f30 r5 = r20.getPin()
            if (r5 == 0) goto L7f
            java.lang.String r5 = r5.w6()
            goto L80
        L7f:
            r5 = r4
        L80:
            if (r5 == 0) goto L87
            java.lang.String r3 = "story"
        L84:
            r16 = r3
            goto L98
        L87:
            com.pinterest.api.model.f30 r5 = r20.getPin()
            if (r5 == 0) goto L96
            boolean r5 = com.pinterest.api.model.b40.X0(r5)
            if (r5 != r3) goto L96
            java.lang.String r3 = "video"
            goto L84
        L96:
            r16 = r6
        L98:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Long r11 = jq.b.c(r3)
            short r2 = (short) r2
            java.lang.Short r13 = java.lang.Short.valueOf(r2)
            rp0.d r2 = r0.f109466h
            if (r2 == 0) goto Lad
            java.lang.String r2 = r2.v()
            r10 = r2
            goto Lae
        Lad:
            r10 = r4
        Lae:
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17
            com.pinterest.api.model.f30 r1 = r20.getPin()
            if (r1 == 0) goto Lbc
            java.lang.String r4 = r1.getUid()
        Lbc:
            r14 = r4
            h32.c0 r1 = new h32.c0
            r15 = 0
            r9 = r1
            r12 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.f109465g = r1
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.p2.markImpressionStart():java.lang.Object");
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        f30 pin = getPin();
        if (pin == null) {
            return false;
        }
        b60.b bVar = this.f109461c;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        lh0.a0 a0Var = this.f109462d;
        if (a0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        hs.d dVar = this.f109463e;
        if (dVar != null) {
            return kh2.g0.q0(pin, bVar, a0Var, dVar);
        }
        Intrinsics.r("moduleViewabilityHelper");
        throw null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        if (!getIsFullPinLoaded()) {
            f30 pin = getPin();
            if (Intrinsics.d(null, pin != null ? pin.A6() : null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateView() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.p2.updateView():void");
    }
}
