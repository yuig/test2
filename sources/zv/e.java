package zv;

import ads_mobile_sdk.vh1;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesView;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import es.h;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.jb;
import so.oa;
import u50.f0;
import wi.p;

/* loaded from: classes3.dex */
public final class e extends yv.g {

    /* renamed from: s, reason: collision with root package name */
    public boolean f142837s;

    @Override // yv.g
    public final void X() {
        vh1 vh1Var;
        removeAllViews();
        o();
        this.f140183g = System.currentTimeMillis();
        View findViewById = View.inflate(getContext(), wv.c.gma_native_ad_app_install_image_item_gestalt, this).findViewById(wv.b.native_ad_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        NativeAdView nativeAdView = (NativeAdView) findViewById;
        Intrinsics.checkNotNullParameter(nativeAdView, "<set-?>");
        this.f140185i = nativeAdView;
        View findViewById2 = z().findViewById(wv.b.ad_headline);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f140190n = gestaltText;
        View findViewById3 = z().findViewById(wv.b.ad_promoter);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f140191o = gestaltText2;
        View findViewById4 = z().findViewById(wv.b.cta);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById4;
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.f140187k = constraintLayout;
        View findViewById5 = z().findViewById(wv.b.cta_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText3 = (GestaltText) findViewById5;
        Intrinsics.checkNotNullParameter(gestaltText3, "<set-?>");
        this.f140189m = gestaltText3;
        int i13 = 0;
        m().setOnClickListener(new a(this, i13));
        View findViewById6 = z().findViewById(wv.b.ad_media);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        MediaView mediaView = (MediaView) findViewById6;
        Intrinsics.checkNotNullParameter(mediaView, "<set-?>");
        this.f140186j = mediaView;
        View findViewById7 = z().findViewById(wv.b.ad_promoted_label);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        GestaltText gestaltText4 = (GestaltText) findViewById7;
        Intrinsics.checkNotNullParameter(gestaltText4, "<set-?>");
        this.f140192p = gestaltText4;
        View findViewById8 = z().findViewById(wv.b.ad_choice);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        AdChoicesView adChoicesView = (AdChoicesView) findViewById8;
        Intrinsics.checkNotNullParameter(adChoicesView, "<set-?>");
        this.f140188l = adChoicesView;
        View findViewById9 = z().findViewById(wv.b.ad_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById9;
        Intrinsics.checkNotNullParameter(webImageView, "<set-?>");
        this.f140193q = webImageView;
        WebImageView i14 = i();
        float dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        i14.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        q().i(new b(this, i13));
        GestaltText D = D();
        String string = j().v3();
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q(D, new f0(string));
        n().i(new b(this, 1));
        GestaltText k13 = k();
        String string2 = l();
        Intrinsics.checkNotNullParameter(string2, "string");
        a0.q(k13, new f0(string2));
        if (L()) {
            n().i(c.f142832j);
            q().i(c.f142833k);
            D().i(c.f142834l);
        }
        MediaView t13 = t();
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        t13.f32094a = scaleType;
        if (scaleType != null) {
            synchronized (t13) {
                vh1Var = t13.f32096c;
            }
            if (vh1Var != null) {
                vh1Var.a(scaleType);
            }
        }
        t13.setOnHierarchyChangeListener(new d(0));
    }

    @Override // yv.h
    public final void a3(float f13) {
        this.f140194r = f13;
    }

    @Override // xv.j
    public final void b() {
        if (this.f142837s) {
            return;
        }
        this.f142837s = true;
        jb jbVar = (jb) ((f) generatedComponent());
        this.f140179c = jbVar.a();
        this.f140180d = (ni1.d) jbVar.f113485c.f114551x.get();
        oa oaVar = jbVar.f113483a;
        this.f140181e = (pb0.a) oaVar.f113834o1.get();
        this.f140182f = (h) oaVar.f113735i7.get();
    }

    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // yv.g
    public final int s() {
        return 3;
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return j().s3();
    }

    @Override // yv.g
    public final int x() {
        return 33;
    }

    @Override // yv.h
    public final void x0(bj.f nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        z().f32084a.a(q(), "3001");
        z().f32084a.a(D(), "3005");
        z().f32084a.a(n(), "3002");
        GestaltText q13 = q();
        String string = nativeAd.getHeadline();
        if (string == null) {
            string = "";
        }
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q(q13, new f0(string));
        GestaltText D = D();
        String string2 = nativeAd.getAdvertiser();
        if (string2 == null) {
            string2 = "";
        }
        Intrinsics.checkNotNullParameter(string2, "string");
        a0.q(D, new f0(string2));
        GestaltText n13 = n();
        String callToAction = nativeAd.getCallToAction();
        String string3 = callToAction != null ? callToAction : "";
        Intrinsics.checkNotNullParameter(string3, "string");
        a0.q(n13, new f0(string3));
        m().setOnClickListener(new a(this, 1));
        z().f32084a.a(i(), "3003");
        WebImageView i13 = i();
        p icon = nativeAd.getIcon();
        i13.loadUrl(String.valueOf(icon != null ? icon.f129978b : null));
        t().a(nativeAd.getMediaContent());
        String p33 = j().p3();
        if (p33 == null || p33.length() == 0) {
            z().f32084a.a(g(), "3011");
        } else {
            g().setOnClickListener(new a(this, 2));
        }
        z().a(nativeAd, t());
        yv.f j13 = j();
        o();
        j13.w3(System.currentTimeMillis() - this.f140183g);
    }
}
