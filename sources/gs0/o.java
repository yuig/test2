package gs0;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.view.TitleListCell;
import df.j1;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.u0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.g1;
import lh0.l1;
import lh0.s2;
import lh0.z3;
import lq0.f1;
import m60.r0;
import m60.x0;
import nx.f0;
import nx.j0;
import pk.a0;
import so.h5;
import xo.s;

/* loaded from: classes5.dex */
public final class o extends s implements cs0.g, yk1.d, nx.a {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f66055y = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jo1.a f66056d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f66057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66058f;

    /* renamed from: g, reason: collision with root package name */
    public final ls0.f f66059g;

    /* renamed from: h, reason: collision with root package name */
    public final a4 f66060h;

    /* renamed from: i, reason: collision with root package name */
    public final d4 f66061i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f66062j;

    /* renamed from: k, reason: collision with root package name */
    public final String f66063k;

    /* renamed from: l, reason: collision with root package name */
    public c f66064l;

    /* renamed from: m, reason: collision with root package name */
    public ls0.d f66065m;

    /* renamed from: n, reason: collision with root package name */
    public l1 f66066n;

    /* renamed from: o, reason: collision with root package name */
    public f0 f66067o;

    /* renamed from: p, reason: collision with root package name */
    public b60.b f66068p;

    /* renamed from: q, reason: collision with root package name */
    public h5 f66069q;

    /* renamed from: r, reason: collision with root package name */
    public s2 f66070r;

    /* renamed from: s, reason: collision with root package name */
    public ed1.f0 f66071s;

    /* renamed from: t, reason: collision with root package name */
    public cs0.f f66072t;

    /* renamed from: u, reason: collision with root package name */
    public final RelativeLayout f66073u;

    /* renamed from: v, reason: collision with root package name */
    public SpannableStringBuilder f66074v;

    /* renamed from: w, reason: collision with root package name */
    public final j0 f66075w;

    /* renamed from: x, reason: collision with root package name */
    public final List f66076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0123, code lost:
    
        if (r9 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0112, code lost:
    
        if (r14.l("android_news_hub_detail_hide_pin") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x011a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d("notifications", r15) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(android.content.Context r47, jo1.a r48, boolean r49, boolean r50, java.lang.String r51, java.util.List r52, boolean r53, boolean r54, ls0.f r55, boolean r56, boolean r57, h32.a4 r58, h32.d4 r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66, java.lang.String r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 2944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.o.<init>(android.content.Context, jo1.a, boolean, boolean, java.lang.String, java.util.List, boolean, boolean, ls0.f, boolean, boolean, h32.a4, h32.d4, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean):void");
    }

    public static void i(o oVar, boolean z13, boolean z14, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        oVar.getClass();
        if (oVar.L(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            return;
        }
        int dimensionPixelOffset = oVar.getResources().getDimensionPixelOffset(r0.margin);
        oVar.addView(oVar.C().c(z13 ? dimensionPixelOffset : 0, z14 ? dimensionPixelOffset : 0));
    }

    public static /* synthetic */ RelativeLayout s(o oVar, int i13, String str, rm1.q qVar, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            qVar = null;
        }
        return oVar.o(i13, str, qVar);
    }

    public final c C() {
        c cVar = this.f66064l;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("viewCreator");
        throw null;
    }

    public final boolean D() {
        boolean z13;
        jo1.a aVar = jo1.a.HOMEFEED;
        jo1.a aVar2 = this.f66056d;
        return (aVar2 == aVar || aVar2 == jo1.a.NEWS_HUB || ((aVar2 == jo1.a.RELATED_PINS && (this.f66057e ^ true)) || aVar2 == jo1.a.SHOPPING_SURFACE || aVar2 == jo1.a.OTHER || aVar2 == jo1.a.SEARCH || aVar2 == jo1.a.PROMOTED_SPOTLIGHT || aVar2 == jo1.a.VISUAL_SEARCH || aVar2 == jo1.a.BOARD || ((!(z13 = this.f66059g.f84647v) && aVar2 == jo1.a.QUIZ_PIN_RESULT_CLOSEUP) || (!z13 && aVar2 == jo1.a.SHOWCASE_PIN_CLOSEUP)))) && this.f66062j;
    }

    public final boolean L(z3 activate) {
        Intrinsics.checkNotNullParameter(activate, "shouldActivate");
        jo1.a aVar = jo1.a.HOMEFEED;
        jo1.a aVar2 = this.f66056d;
        if ((aVar2 != aVar && aVar2 != jo1.a.SEARCH && aVar2 != jo1.a.RELATED_PINS && aVar2 != jo1.a.BOARD && aVar2 != jo1.a.MORE_IDEAS) || this.f66057e) {
            return false;
        }
        l1 m13 = m();
        Intrinsics.checkNotNullParameter(activate, "activate");
        g1 g1Var = (g1) m13.f83416a;
        return g1Var.o("android_grid_overflow_menu_visual_update", "enabled", activate) || g1Var.l("android_grid_overflow_menu_visual_update");
    }

    public final boolean T() {
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        return L(z3Var) && (m().b("enabled_4", z3Var) || m().b("enabled_5", z3Var));
    }

    public final boolean X() {
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        return L(z3Var) && (m().b("enabled", z3Var) || m().b("enabled_2", z3Var) || m().b("enabled_4", z3Var));
    }

    public final boolean Z() {
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        return L(z3Var) && (m().b("enabled", z3Var) || m().b("enabled_3", z3Var) || m().b("enabled_4", z3Var));
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(this.f66061i, this.f66060h, null, null, null, null);
    }

    public final void j(boolean z13) {
        Resources resources = getResources();
        getContext().getTheme();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(vp1.c.grid_actions_gen_ai_topic_opt_out_standalone));
        if (!z13) {
            x();
            SpannableStringBuilder spannableStringBuilder2 = this.f66074v;
            if (spannableStringBuilder2 != null) {
                String Y = j1.Y(resources.getString(vp1.c.grid_actions_gen_ai_topic_opt_out_append), new Object[]{spannableStringBuilder2}, null, 6);
                String spannableStringBuilder3 = spannableStringBuilder2.toString();
                Intrinsics.checkNotNullExpressionValue(spannableStringBuilder3, "toString(...)");
                int L = StringsKt.L(Y, spannableStringBuilder3, 0, false, 6);
                SpannableStringBuilder replace = new SpannableStringBuilder(Y).replace(L, spannableStringBuilder2.length() + L, (CharSequence) spannableStringBuilder2);
                Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
                if (replace != null) {
                    spannableStringBuilder = replace;
                }
            }
        }
        this.f66074v = spannableStringBuilder;
        l();
    }

    public final void k(es0.a aVar) {
        cs0.e eVar;
        switch (n.f66053a[aVar.ordinal()]) {
            case 15:
                eVar = new cs0.e(x0.hide_pin_option_wrong_hair_pattern, l32.f.NOT_RELEVANT_TO_HAIR_PATTERN, u0.PIN_FEEDBACK_REASON_WRONG_HAIR_PATTER);
                break;
            case 16:
                eVar = new cs0.e(x0.hide_pin_option_wrong_skin_tone, l32.f.NOT_RELEVANT_TO_SKIN_TONE, u0.PIN_FEEDBACK_REASON_WRONG_SKIN_TONE);
                break;
            case 17:
                eVar = new cs0.e(x0.hide_pin_option_wrong_body_type, l32.f.NOT_RELEVANT_TO_BODY_TYPE, u0.PIN_FEEDBACK_REASON_WRONG_BODY_TYPE);
                break;
            default:
                eVar = null;
                break;
        }
        if (eVar != null) {
            RelativeLayout o13 = o(eVar.f53126a, bs1.c.f2(this, x0.hide_pin_description_inclusive_filter), t(rm1.q.HAND));
            o13.setOnClickListener(new xa0.m(20, this, eVar));
            addView(o13);
        }
    }

    public final void l() {
        SpannableStringBuilder spannedText = this.f66074v;
        if (spannedText != null) {
            boolean L = L(z3.DO_NOT_ACTIVATE_EXPERIMENT);
            ls0.f fVar = this.f66059g;
            if (!L) {
                if (this.f66057e && fVar.G && !fVar.f84647v) {
                    l1 m13 = m();
                    z3 z3Var = lh0.a4.f83298b;
                    g1 g1Var = (g1) m13.f83416a;
                    if (g1Var.o("android_overflow_genai_modified", "enabled", z3Var) || g1Var.l("android_overflow_genai_modified")) {
                        spannedText.append((CharSequence) ("\n" + bs1.c.f2(this, kw0.b.grid_actions_gen_ai_disclaimer)));
                    }
                }
                TitleListCell titleListCell = new TitleListCell(getContext(), null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                Resources resources = titleListCell.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int L2 = a0.L(resources, 16.0f);
                layoutParams.setMarginStart(L2);
                layoutParams.setMarginEnd(L2);
                layoutParams.topMargin = bs1.c.W(titleListCell, eo1.c.space_400);
                titleListCell.setLayoutParams(layoutParams);
                titleListCell.f52240a.i(new cp.i(spannedText, 11));
                addView(titleListCell);
                return;
            }
            c C = C();
            boolean z13 = fVar.f84647v && !fVar.E;
            Intrinsics.checkNotNullParameter(spannedText, "spannedText");
            Context context = C.f66027a;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setId(bz1.b.reason_text);
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            Resources resources2 = linearLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            int L3 = a0.L(resources2, 8.0f);
            layoutParams2.topMargin = L3;
            layoutParams2.bottomMargin = L3;
            layoutParams2.setMarginStart(linearLayout.getContext().getResources().getDimensionPixelSize(r0.margin));
            Resources resources3 = linearLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            layoutParams2.setMarginEnd(a0.L(resources3, 16.0f));
            linearLayout.setLayoutParams(layoutParams2);
            if (z13) {
                GestaltText i13 = new GestaltText(6, context, (AttributeSet) null).i(b.f66024j);
                i13.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                linearLayout.addView(i13);
            }
            GestaltText i14 = new GestaltText(6, context, (AttributeSet) null).i(new f1(spannedText, 9));
            i14.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            dl2.b.y2(i14);
            linearLayout.addView(i14);
            addView(linearLayout, 0);
        }
    }

    public final l1 m() {
        l1 l1Var = this.f66066n;
        if (l1Var != null) {
            return l1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final GestaltText n(int i13) {
        c C = C();
        String titleText = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(titleText, "getString(...)");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        GestaltText gestaltText = new GestaltText(6, C.f66027a, (AttributeSet) null);
        gestaltText.i(new kl0.c(titleText, 23));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        Resources resources = gestaltText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int L = a0.L(resources, 8.0f);
        layoutParams.topMargin = L;
        layoutParams.bottomMargin = L;
        layoutParams.setMarginStart(gestaltText.getContext().getResources().getDimensionPixelSize(r0.margin));
        Resources resources2 = gestaltText.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        layoutParams.setMarginEnd(a0.L(resources2, 16.0f));
        gestaltText.setLayoutParams(layoutParams);
        dl2.b.y2(gestaltText);
        return gestaltText;
    }

    public final RelativeLayout o(int i13, String str, rm1.q qVar) {
        c C = C();
        CharSequence text = getResources().getText(i13);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return C.a(text, str, qVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ed1.f0 f0Var = this.f66071s;
        if (f0Var != null) {
            f0Var.unbind();
        }
        super.onDetachedFromWindow();
    }

    public final RelativeLayout q(String str, rm1.q qVar) {
        return c.b(C(), str, null, qVar, 2);
    }

    public final rm1.q t(rm1.q qVar) {
        if (L(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            return qVar;
        }
        return null;
    }

    public final void x() {
        ls0.d dVar = this.f66065m;
        if (dVar == null) {
            Intrinsics.r("gridActionUtils");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), getContext().getTheme());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f66074v = dVar.d(this.f66059g, aVar, context, eo1.b.color_themed_text_default);
    }
}
