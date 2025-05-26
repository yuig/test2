package com.pinterest.feature.search.typeahead.view;

import af2.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b31.f;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import h32.g0;
import h32.n2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k71.m;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import ku1.l;
import lh0.g1;
import lh0.j3;
import lh0.z3;
import n42.d;
import nx.u0;
import nx.v;
import o71.c0;
import org.jetbrains.annotations.NotNull;
import pe.i;
import pk.a0;
import q71.m0;
import q71.n0;
import q71.o0;
import q71.p0;
import q71.q;
import q71.r0;
import q71.s0;
import qy.b;
import rq.t4;
import so.jb;
import so.s8;
import x61.e;
import ye2.o;
import z32.n1;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadTextCell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lk71/m;", "Lqy/b;", "Lnx/v;", "Lnx/u0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "q71/m0", "oe/f", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadTextCell extends ConstraintLayout implements m, b, v, c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f47887r = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f47888a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47889b;

    /* renamed from: c, reason: collision with root package name */
    public final j3 f47890c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f47891d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f47892e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f47893f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f47894g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f47895h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f47896i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f47897j;

    /* renamed from: k, reason: collision with root package name */
    public final l f47898k;

    /* renamed from: l, reason: collision with root package name */
    public ForegroundColorSpan f47899l;

    /* renamed from: m, reason: collision with root package name */
    public c0 f47900m;

    /* renamed from: n, reason: collision with root package name */
    public List f47901n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f47902o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f47903p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f47904q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTextCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 1;
        if (!this.f47889b) {
            this.f47889b = true;
            s8 s8Var = ((jb) ((s0) generatedComponent())).f113485c;
            this.f47890c = s8Var.y6();
            this.f47898k = (l) s8Var.f114476s.get();
        }
        this.f47891d = xk2.m.b(new p0(this, 6));
        final int i15 = 0;
        xk2.v b13 = xk2.m.b(new p0(this, 0));
        this.f47892e = b13;
        this.f47893f = xk2.m.b(new p0(this, 1));
        this.f47894g = xk2.m.b(new p0(this, 5));
        this.f47895h = xk2.m.b(new p0(this, 2));
        this.f47896i = xk2.m.b(new p0(this, 4));
        this.f47897j = xk2.m.b(new p0(this, 3));
        Context context2 = getContext();
        int i16 = eo1.b.color_gray_500;
        Object obj = a.f53679a;
        this.f47899l = new ForegroundColorSpan(context2.getColor(i16));
        new StyleSpan(1);
        this.f47901n = q0.f80391a;
        View.inflate(getContext(), d.list_search_typeahead_text_item, this);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setBackground(getContext().getDrawable(k42.c.rounded_corners_pressed_state));
        setOnClickListener(new e(this, 12));
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltIconButton) value).u(new gm1.a(this) { // from class: q71.l0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchTypeaheadTextCell f102725b;

            {
                this.f102725b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                o71.c0 c0Var;
                br.d dVar;
                int i17 = i15;
                SearchTypeaheadTextCell this$0 = this.f102725b;
                switch (i17) {
                    case 0:
                        int i18 = SearchTypeaheadTextCell.f47887r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (c0Var = this$0.f47900m) != null && (dVar = c0Var.f93240e) != null) {
                            String str = dVar.f23704b;
                            String query = str != null ? StringsKt.i0(str).toString() : null;
                            if (query == null) {
                                query = "";
                            }
                            l71.p pVar = c0Var.f93236a;
                            pVar.getClass();
                            Intrinsics.checkNotNullParameter(query, "query");
                            uk2.f fVar = pVar.f81956a.f81966w;
                            if (fVar != null) {
                                fVar.c(query);
                                break;
                            }
                        }
                        break;
                    default:
                        int i19 = SearchTypeaheadTextCell.f47887r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            o71.c0 c0Var2 = this$0.f47900m;
                            if (c0Var2 != null) {
                                c0Var2.r3();
                            }
                            this$0.T().announceForAccessibility(this$0.getResources().getString(n42.e.recent_search_cleared));
                            break;
                        }
                        break;
                }
            }
        });
        T().u(new gm1.a(this) { // from class: q71.l0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SearchTypeaheadTextCell f102725b;

            {
                this.f102725b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                o71.c0 c0Var;
                br.d dVar;
                int i17 = i14;
                SearchTypeaheadTextCell this$0 = this.f102725b;
                switch (i17) {
                    case 0:
                        int i18 = SearchTypeaheadTextCell.f47887r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (c0Var = this$0.f47900m) != null && (dVar = c0Var.f93240e) != null) {
                            String str = dVar.f23704b;
                            String query = str != null ? StringsKt.i0(str).toString() : null;
                            if (query == null) {
                                query = "";
                            }
                            l71.p pVar = c0Var.f93236a;
                            pVar.getClass();
                            Intrinsics.checkNotNullParameter(query, "query");
                            uk2.f fVar = pVar.f81956a.f81966w;
                            if (fVar != null) {
                                fVar.c(query);
                                break;
                            }
                        }
                        break;
                    default:
                        int i19 = SearchTypeaheadTextCell.f47887r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            o71.c0 c0Var2 = this$0.f47900m;
                            if (c0Var2 != null) {
                                c0Var2.r3();
                            }
                            this$0.T().announceForAccessibility(this$0.getResources().getString(n42.e.recent_search_cleared));
                            break;
                        }
                        break;
                }
            }
        });
        this.f47904q = true;
    }

    @Override // k71.m
    public final void J5(String str, boolean z13) {
        T().t(new t4(z13, str, 27));
    }

    public final String L() {
        return a0.R(d0()) + "-" + d0().hashCode();
    }

    @Override // k71.m
    public final void M5(String url, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(url, "url");
        l lVar = this.f47898k;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l.b(lVar, context, url, false, false, null, hashMap, 92);
    }

    @Override // k71.m
    public final void O4(int i13) {
        xk2.v vVar = this.f47895h;
        Object value = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Object value2 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        String R = a0.R((GestaltText) value2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(bs1.c.B(this, i13));
        SpannableString spannableString = new SpannableString(R);
        spannableString.setSpan(foregroundColorSpan, 0, R.length(), 0);
        a0.q((GestaltText) value, bs1.c.h2(spannableString));
    }

    @Override // k71.m
    public final void Q5(List searchDelight) {
        Intrinsics.checkNotNullParameter(searchDelight, "searchDelight");
        this.f47901n = searchDelight;
    }

    public final GestaltIconButton T() {
        Object value = this.f47893f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltIconButton) value;
    }

    public final j3 X() {
        j3 j3Var = this.f47890c;
        if (j3Var != null) {
            return j3Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final WebImageView Z() {
        Object value = this.f47896i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WebImageView) value;
    }

    public final GestaltIcon a0() {
        Object value = this.f47894g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltIcon) value;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47888a == null) {
            this.f47888a = new o(this);
        }
        return this.f47888a;
    }

    public final GestaltText d0() {
        Object value = this.f47891d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    @Override // k71.m
    public final void f3(String title, String str, n1 n1Var) {
        String string;
        Intrinsics.checkNotNullParameter(title, "title");
        if (str == null || !(!z.j(str))) {
            int i13 = n1Var == null ? -1 : o0.f102732a[n1Var.ordinal()];
            string = (i13 == 1 || i13 == 2) ? getResources().getString(n42.e.content_description_shopping_typeahead, title) : getResources().getString(n42.e.content_description_search_typeahead, title);
        } else {
            string = a.a.D(str, ", ", title);
        }
        setContentDescription(string);
    }

    @Override // k71.m
    public final void f6() {
        Object value = this.f47892e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltIconButton) value).t(new i31.a(false, 24));
    }

    public final void g0(m0 m0Var) {
        ViewGroup.LayoutParams layoutParams = Z().getLayoutParams();
        int i13 = o0.f102733b[m0Var.ordinal()];
        if (i13 == 1) {
            layoutParams.width = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_size_sm);
            layoutParams.height = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_size_sm);
        } else if (i13 == 2) {
            layoutParams.width = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_size_md);
            layoutParams.height = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_size_md);
        } else if (i13 == 3) {
            layoutParams.width = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_size_lg);
            layoutParams.height = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_size_lg);
        } else if (i13 == 4) {
            layoutParams.width = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_width_three_fourth);
            layoutParams.height = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_height_three_fourth);
        }
        Z().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47888a == null) {
            this.f47888a = new o(this);
        }
        return this.f47888a.generatedComponent();
    }

    @Override // k71.m
    public final void i0(int i13) {
        GestaltText d03 = d0();
        String R = a0.R(d0());
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(bs1.c.B(this, i13));
        SpannableString spannableString = new SpannableString(R);
        spannableString.setSpan(foregroundColorSpan, 0, R.length(), 0);
        a0.q(d03, bs1.c.h2(spannableString));
    }

    @Override // k71.m
    public final void j2(int i13) {
        j3 X = X();
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        Intrinsics.checkNotNullParameter("enabled_icon", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (!((g1) X.f83398a).o("android_search_autocomplete_header_icon_exp", "enabled_icon", activate)) {
            dl2.b.z(a0(), q.f102748t);
        } else if (i13 != 0) {
            dl2.b.z(a0(), new q71.q0(this, i13, 1));
        } else {
            a0().g2(q.f102746r);
        }
    }

    public final void k0() {
        ViewGroup.LayoutParams layoutParams = d0().getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(getResources().getDimensionPixelSize(eo1.c.space_300));
        d0().setLayoutParams(marginLayoutParams);
    }

    @Override // k71.m
    public final void k4(String searchTerm, String enteredQuery, n1 n1Var, boolean z13) {
        Intrinsics.checkNotNullParameter(searchTerm, "title");
        Intrinsics.checkNotNullParameter(enteredQuery, "enteredQuery");
        int i13 = 0;
        this.f47902o = false;
        d0().i(q.f102750v);
        if (enteredQuery.length() == 0) {
            d0().i(new f(searchTerm, 26));
            Z().setVisibility(0);
        } else {
            Z().setVisibility(8);
            boolean z14 = false;
            for (com.pinterest.feature.search.a aVar : this.f47901n) {
                if (!z14) {
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
                    List list = (List) aVar.f47615a.f80994a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (StringsKt.E(searchTerm, (String) it.next(), true)) {
                                d0().i(new rx0.f(aVar, searchTerm, this, 14));
                                z14 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (!z14) {
                SpannableString spannableString = new SpannableString(searchTerm);
                String lowerCase = searchTerm.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = enteredQuery.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                int length = z.p(lowerCase, lowerCase2, false) ? enteredQuery.length() : 0;
                j3 X = X();
                z3 z3Var = z3.ACTIVATE_EXPERIMENT;
                if (X.b("enabled_grey_black_combo", z3Var)) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ph.a.n(spannableString, context, searchTerm, enteredQuery, n0.f102729e);
                } else if (X().b("enabled_bold_only", z3Var)) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ph.a.n(spannableString, context2, searchTerm, enteredQuery, n0.f102728d);
                } else if (X().b("enabled_blue", z3Var)) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    ph.a.n(spannableString, context3, searchTerm, enteredQuery, n0.f102727c);
                } else {
                    spannableString.setSpan(this.f47899l, 0, length, 0);
                }
                pp2.a.k(d0(), new r0(spannableString, i13));
            }
        }
        int i14 = n1Var == null ? -1 : o0.f102732a[n1Var.ordinal()];
        rm1.q qVar = i14 != 1 ? i14 != 2 ? null : rm1.q.SHOPPING_BAG : rm1.q.TAG;
        if (qVar != null) {
            d0().i(new fm0.b(qVar, z13, 1));
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        n2 n2Var;
        String str;
        String str2;
        br.c cVar;
        String t13;
        c0 c0Var = this.f47900m;
        if (c0Var == null) {
            return null;
        }
        n2 source = c0Var.f93241f;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            n2Var = new n2(source.f67157a, source.f67158b, source.f67159c, source.f67160d, jq.b.c(TimeUnit.MILLISECONDS), source.f67162f, source.f67163g, source.f67164h, source.f67165i, source.f67166j);
        } else {
            n2Var = null;
        }
        c0Var.f93241f = null;
        if (n2Var == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        br.d dVar = c0Var.f93240e;
        if (dVar != null && (cVar = dVar.f23707e) != null && (t13 = i.t(cVar)) != null) {
        }
        br.d dVar2 = c0Var.f93240e;
        if (dVar2 != null && (str2 = dVar2.f23704b) != null) {
        }
        br.d dVar3 = c0Var.f93240e;
        if (dVar3 != null && (str = dVar3.f23703a) != null) {
        }
        String R0 = dl2.b.R0(c0Var.f93248m);
        if (R0 != null) {
        }
        hashMap.put("result_index", String.valueOf(c0Var.f93243h));
        return new u0(n2Var, hashMap, g0.TYPEAHEAD_SUGGESTIONS);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        c0 c0Var = this.f47900m;
        if (c0Var == null) {
            return null;
        }
        if (c0Var.f93241f == null) {
            br.d dVar = c0Var.f93240e;
            c0Var.f93241f = new n2(dVar != null ? dVar.f23704b : null, null, null, jq.b.c(TimeUnit.MILLISECONDS), null, null, Short.valueOf((short) c0Var.f93243h), null, null, null);
        }
        n2 n2Var = c0Var.f93241f;
        if (n2Var != null) {
            return new u0(n2Var, null, null);
        }
        return null;
    }

    public final void o0(int i13) {
        Z().U1(i13);
        Z().setColorFilter(new PorterDuffColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_100), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // k71.m
    public final void o1(String str) {
        Z().setVisibility((str == null || z.j(str)) ? 8 : 0);
        j3 X = X();
        z3 activate = z3.ACTIVATE_EXPERIMENT;
        if (X.a("enabled_query_join", activate) || X().a("enabled_query_join_with_fallback", activate) || X().a("enabled_sm", activate)) {
            this.f47903p = true;
            g0(m0.SM);
            o0(n42.a.search_typeahead_medium_image_corner_radius);
            r0();
            k0();
        } else {
            boolean a13 = X().a("enabled_md", activate);
            q qVar = q.f102751w;
            if (a13) {
                this.f47903p = true;
                g0(m0.MD);
                o0(n42.a.search_typeahead_medium_image_corner_radius);
                d0().i(qVar);
                r0();
                k0();
            } else if (X().a("enabled_lg", activate)) {
                this.f47903p = true;
                g0(m0.LG);
                o0(n42.a.search_typeahead_large_image_corner_radius);
                d0().i(qVar);
                r0();
                k0();
            } else if (X().a("enabled_three_fourth", activate)) {
                this.f47903p = true;
                g0(m0.THREE_FOURTH);
                o0(n42.a.search_typeahead_medium_image_corner_radius);
                d0().i(qVar);
                r0();
                k0();
            } else {
                j3 X2 = X();
                Intrinsics.checkNotNullParameter("enabled_active_user", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (((g1) X2.f83398a).k("mobile_search_autocomplete_empty_state", "enabled_active_user", activate)) {
                    this.f47903p = true;
                    g0(m0.MD);
                    o0(n42.a.search_typeahead_prototype_image_corner_radius);
                    r0();
                    d0().i(q.f102749u);
                } else {
                    X().a("control", activate);
                }
            }
        }
        if (!this.f47903p || (str != null && !z.j(str))) {
            Z().loadUrl(str);
            return;
        }
        Z().setImageResource(n42.b.recent_history_placeholder);
        if (X().a("enabled_three_fourth", z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            ViewGroup.LayoutParams layoutParams = Z().getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_width_three_fourth);
            layoutParams.height = getResources().getDimensionPixelSize(n42.a.search_typeahead_image_height_three_fourth);
        } else {
            Z().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        Z().setVisibility(0);
        a0().g2(q.f102745q);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f47902o) {
            return;
        }
        this.f47902o = true;
        new ly.i(L()).i();
    }

    public final void r0() {
        xk2.v vVar = this.f47897j;
        Object value = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) value).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_100);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.topMargin = dimensionPixelSize2;
        marginLayoutParams.bottomMargin = dimensionPixelSize2;
        Object value2 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((FrameLayout) value2).setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = T().getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginEnd(getResources().getDimensionPixelSize(eo1.c.space_400));
        T().setLayoutParams(marginLayoutParams2);
    }

    @Override // k71.m
    public final void u(String str) {
        Object value = this.f47895h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltText) value).i(new f(str, 25));
    }

    @Override // k71.m
    public final void v0(int i13) {
        this.f47899l = new ForegroundColorSpan(bs1.c.B(this, i13));
    }

    @Override // k71.m
    public final void w5() {
        d0().i(new i31.a(false, 25));
    }

    @Override // k71.m
    public final void z5(c0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47900m = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTextCell(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadTextCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
