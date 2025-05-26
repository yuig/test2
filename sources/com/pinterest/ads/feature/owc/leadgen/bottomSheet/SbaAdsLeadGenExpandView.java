package com.pinterest.ads.feature.owc.leadgen.bottomSheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.z;
import b7.c;
import bf.b;
import c0.d;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.n;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import ln1.e;
import m60.u;
import m60.w;
import nt.d0;
import nt.d1;
import nt.f1;
import nt.f2;
import nt.h1;
import nt.i1;
import nt.k2;
import nt.l2;
import nt.n1;
import nt.o1;
import nt.s2;
import nt.y;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;
import r1.f;
import u50.r;
import zq.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/pinterest/ads/feature/owc/leadgen/bottomSheet/SbaAdsLeadGenExpandView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nt/f2", "zq/a", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SbaAdsLeadGenExpandView extends FrameLayout implements View.OnClickListener {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f35271w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ScrollView f35272a;

    /* renamed from: b, reason: collision with root package name */
    public final View f35273b;

    /* renamed from: c, reason: collision with root package name */
    public final View f35274c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f35275d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f35276e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f35277f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayoutCompat f35278g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltSpinner f35279h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltButton f35280i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIconButton f35281j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f35282k;

    /* renamed from: l, reason: collision with root package name */
    public String f35283l;

    /* renamed from: m, reason: collision with root package name */
    public List f35284m;

    /* renamed from: n, reason: collision with root package name */
    public r f35285n;

    /* renamed from: o, reason: collision with root package name */
    public final w f35286o;

    /* renamed from: p, reason: collision with root package name */
    public final o1 f35287p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f35288q;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f35289r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35290s;

    /* renamed from: t, reason: collision with root package name */
    public GestaltCheckBox f35291t;

    /* renamed from: u, reason: collision with root package name */
    public final a f35292u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f35293v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SbaAdsLeadGenExpandView(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(h1 h1Var) {
        if (h1Var != null) {
            boolean z13 = h1Var instanceof f1;
            n1 n1Var = h1Var.f92049a;
            if (z13 && !Intrinsics.d(n1Var, i1.f92066l)) {
                s2 s2Var = new s2((f1) h1Var, this, null);
                z r13 = c.r(this);
                if (r13 != null) {
                    j.z(b.S(r13), null, null, new l2(s2Var, null), 3);
                }
            }
            this.f35293v.put(n1Var, h1Var);
        }
    }

    public final void b(f2 f2Var) {
        if (f2Var != null) {
            this.f35280i.d(new f(f2Var.isEnabled(), f2Var.getColorPalette(), 6));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        if (!Intrinsics.d(view, this.f35280i)) {
            if (Intrinsics.d(view, this.f35281j)) {
                r rVar = this.f35285n;
                if (rVar != null) {
                    rVar.a(new y(System.currentTimeMillis() * 1000000));
                    return;
                } else {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f35293v.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((h1) entry.getValue()).a());
        }
        this.f35277f.i(d1.f92011s);
        s0.w(this.f35279h, new k2(e.LOADING, 0 == true ? 1 : 0));
        b(f2.DisabledState);
        r rVar2 = this.f35285n;
        if (rVar2 == null) {
            Intrinsics.r("eventIntake");
            throw null;
        }
        GestaltCheckBox gestaltCheckBox = this.f35291t;
        rVar2.a(new d0(gestaltCheckBox != null ? d.a2(gestaltCheckBox) : false, linkedHashMap));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaAdsLeadGenExpandView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f35286o = wVar;
        this.f35287p = new o1();
        this.f35288q = new Object();
        this.f35292u = new a(19);
        this.f35293v = new LinkedHashMap();
        e eVar = e.NONE;
        View inflate = View.inflate(context, q.ads_signup_page, this);
        View findViewById = inflate.findViewById(p.signup_scroll);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35272a = (ScrollView) findViewById;
        View findViewById2 = inflate.findViewById(p.header_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35273b = findViewById2;
        View findViewById3 = inflate.findViewById(p.footer_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35274c = findViewById3;
        View findViewById4 = inflate.findViewById(p.signup_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f35275d = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(p.signup_description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f35276e = (GestaltText) findViewById5;
        View findViewById6 = inflate.findViewById(p.signup_error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f35277f = (GestaltText) findViewById6;
        View findViewById7 = inflate.findViewById(p.signup_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f35278g = (LinearLayoutCompat) findViewById7;
        View findViewById8 = inflate.findViewById(p.signup_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f35279h = (GestaltSpinner) findViewById8;
        View findViewById9 = inflate.findViewById(p.signup_submit);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f35280i = (GestaltButton) findViewById9;
        View findViewById10 = inflate.findViewById(p.signup_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f35281j = (GestaltIconButton) findViewById10;
        View findViewById11 = inflate.findViewById(p.signup_promoted_by);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f35282k = (GestaltText) findViewById11;
    }
}
