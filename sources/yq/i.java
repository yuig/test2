package yq;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import lb0.q;
import m60.r0;
import m60.u;
import net.quikkly.android.ui.RenderTagView;
import nx.d0;
import nx.j0;
import pk.a0;
import so.gb;
import so.jb;
import so.oa;
import so.s8;
import so.w8;
import x02.x2;
import ye2.o;

/* loaded from: classes3.dex */
public final class i extends LinearLayout implements m, af2.c {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f139646x = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f139647a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139649c;

    /* renamed from: d, reason: collision with root package name */
    public final n f139650d;

    /* renamed from: e, reason: collision with root package name */
    public final String f139651e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f139652f;

    /* renamed from: g, reason: collision with root package name */
    public final RenderTagView f139653g;

    /* renamed from: h, reason: collision with root package name */
    public final PinterestLoadingLayout f139654h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f139655i;

    /* renamed from: j, reason: collision with root package name */
    public final zq.f f139656j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f139657k;

    /* renamed from: l, reason: collision with root package name */
    public final s f139658l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltButton f139659m;

    /* renamed from: n, reason: collision with root package name */
    public l f139660n;

    /* renamed from: o, reason: collision with root package name */
    public final String[] f139661o;

    /* renamed from: p, reason: collision with root package name */
    public final zp.j f139662p;

    /* renamed from: q, reason: collision with root package name */
    public final e12.d f139663q;

    /* renamed from: r, reason: collision with root package name */
    public final b60.b f139664r;

    /* renamed from: s, reason: collision with root package name */
    public final i92.k f139665s;

    /* renamed from: t, reason: collision with root package name */
    public final ll.j f139666t;

    /* renamed from: u, reason: collision with root package name */
    public final gb f139667u;

    /* renamed from: v, reason: collision with root package name */
    public final q f139668v;

    /* renamed from: w, reason: collision with root package name */
    public final d4 f139669w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, String id3, n pincodeType, String str2, j0 pinalytics) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(pincodeType, "pincodeType");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f139648b) {
            this.f139648b = true;
            jb jbVar = (jb) ((j) generatedComponent());
            s8 s8Var = jbVar.f113485c;
            this.f139662p = (zp.j) s8Var.U2.get();
            oa oaVar = jbVar.f113483a;
            this.f139663q = (e12.d) oaVar.V3.get();
            this.f139664r = (b60.b) oaVar.f113850p0.get();
            this.f139665s = (i92.k) oaVar.f113921t1.get();
            this.f139666t = s8Var.g6();
            this.f139667u = (gb) jbVar.f113495m.get();
            this.f139668v = (q) oaVar.O0.get();
        }
        this.f139649c = id3;
        this.f139650d = pincodeType;
        this.f139651e = str2;
        this.f139652f = pinalytics;
        this.f139658l = b.f139628k;
        bp.j jVar = new bp.j(4, this, context);
        b();
        String m13 = ll.j.m(context, fz1.a.lens_pincode_data_color_blue);
        Intrinsics.checkNotNullExpressionValue(m13, "getColorHtmlHex(...)");
        b();
        String m14 = ll.j.m(context, fz1.a.lens_pincode_data_color_red);
        Intrinsics.checkNotNullExpressionValue(m14, "getColorHtmlHex(...)");
        b();
        String m15 = ll.j.m(context, fz1.a.lens_pincode_data_color_green);
        Intrinsics.checkNotNullExpressionValue(m15, "getColorHtmlHex(...)");
        b();
        String m16 = ll.j.m(context, fz1.a.lens_pincode_data_color_yellow);
        Intrinsics.checkNotNullExpressionValue(m16, "getColorHtmlHex(...)");
        this.f139661o = new String[]{m13, m14, m15, m16};
        n.e eVar = new n.e(this, 5);
        View.inflate(context, fz1.e.view_pincode_create, this);
        View findViewById = findViewById(fz1.d.pincode_cta_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f139655i = gestaltText;
        this.f139657k = ((GestaltButton) findViewById(fz1.d.create_pincode_gestalt_button)).d(g.f139640j).e(jVar);
        this.f139659m = ((GestaltButton) findViewById(fz1.d.pincode_change_image_gestalt_button)).d(g.f139641k).e(jVar);
        View findViewById2 = findViewById(fz1.d.loading_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        getViewTreeObserver().addOnGlobalLayoutListener(eVar);
        gb gbVar = this.f139667u;
        if (gbVar == null) {
            Intrinsics.r("pincodePresenterFactory");
            throw null;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_quarter);
        w8 w8Var = gbVar.f113436a;
        uk1.e eVar2 = (uk1.e) w8Var.f114689b.f113702ga.get();
        oa oaVar2 = w8Var.f114689b;
        this.f139656j = new zq.f(id3, pincodeType, dimensionPixelSize, eVar2, (uj2.q) oaVar2.f113947u9.get(), (e12.d) oaVar2.V3.get(), (x2) oaVar2.f113800m3.get(), w8Var.f114690c.g6());
        View findViewById3 = findViewById(fz1.d.render_tag_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f139653g = (RenderTagView) findViewById3;
        View findViewById4 = findViewById(fz1.d.loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f139654h = (PinterestLoadingLayout) findViewById4;
        View findViewById5 = findViewById(fz1.d.name_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById5;
        if (str == null || str.length() == 0) {
            gestaltText2.i(g.f139642l);
        } else {
            a0.p(gestaltText2, str);
        }
        this.f139658l = new db.m(this, 25);
        h[] hVarArr = {new h("%1$s", fz1.c.ic_pincode_logo_nonpds), new h("%2$s", fz1.c.ic_pincode_search_nonpds), new h("%3$s", fz1.c.ic_pincode_camera_nonpds)};
        String R = a0.R(gestaltText);
        SpannableString spannableString = new SpannableString(R);
        for (int i13 = 0; i13 < 3; i13++) {
            h hVar = hVarArr[i13];
            ImageSpan imageSpan = new ImageSpan(gestaltText.getContext(), hVar.f139645b, 0);
            String str3 = hVar.f139644a;
            int L = StringsKt.L(R, str3, 0, false, 6);
            try {
                spannableString.setSpan(imageSpan, L, str3.length() + L, 33);
            } catch (Exception e13) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("Couldn't find the right text to replace", e13);
            }
        }
        a0.q(gestaltText, bs1.c.h2(spannableString));
        this.f139669w = d4.PINCODE;
    }

    public final void a(Bitmap bitmap, boolean z13) {
        if (!z13) {
            c0.d.z2(bitmap);
            return;
        }
        HashMap hashMap = rw0.f.f110112b;
        rw0.f fVar = rw0.e.f110110a;
        Context context = getContext();
        String str = this.f139649c + "pincode";
        fVar.getClass();
        Uri a13 = rw0.f.a(context, bitmap, str);
        if (a13 != null) {
            i92.k kVar = this.f139665s;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar.c(new up.c(getContext(), a13.toString()));
        } else {
            i92.k kVar2 = this.f139665s;
            if (kVar2 == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar2.h(f80.b.pin_more_save_fail);
        }
        bitmap.recycle();
        u.f85943a.d(new jc0.s(true));
    }

    public final ll.j b() {
        ll.j jVar = this.f139666t;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("pincodesUtil");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f139647a == null) {
            this.f139647a = new o(this);
        }
        return this.f139647a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f139647a == null) {
            this.f139647a = new o(this);
        }
        return this.f139647a.generatedComponent();
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getJ0() {
        return this.f139669w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yk1.j.a().d(this, this.f139656j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        l lVar = this.f139660n;
        if (lVar != null) {
            zq.f fVar = (zq.f) lVar;
            fVar.f142646h = null;
            fVar.getClass();
        }
        yk1.j.a().e(this);
        super.onDetachedFromWindow();
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
