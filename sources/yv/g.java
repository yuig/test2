package yv;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesView;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import gs0.k;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.f0;
import nx.c0;
import nx.v;
import so.oa;
import ua2.w0;
import xv.j;

/* loaded from: classes3.dex */
public abstract class g extends j implements h, y92.g, v {

    /* renamed from: c, reason: collision with root package name */
    public lh0.h f140179c;

    /* renamed from: d, reason: collision with root package name */
    public ni1.d f140180d;

    /* renamed from: e, reason: collision with root package name */
    public pb0.a f140181e;

    /* renamed from: f, reason: collision with root package name */
    public es.h f140182f;

    /* renamed from: g, reason: collision with root package name */
    public long f140183g;

    /* renamed from: h, reason: collision with root package name */
    public f f140184h;

    /* renamed from: i, reason: collision with root package name */
    public NativeAdView f140185i;

    /* renamed from: j, reason: collision with root package name */
    public MediaView f140186j;

    /* renamed from: k, reason: collision with root package name */
    public ConstraintLayout f140187k;

    /* renamed from: l, reason: collision with root package name */
    public AdChoicesView f140188l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltText f140189m;

    /* renamed from: n, reason: collision with root package name */
    public GestaltText f140190n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltText f140191o;

    /* renamed from: p, reason: collision with root package name */
    public GestaltText f140192p;

    /* renamed from: q, reason: collision with root package name */
    public WebImageView f140193q;

    /* renamed from: r, reason: collision with root package name */
    public float f140194r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f140194r = 1.0f;
    }

    public final int C() {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        int i13 = (rect.right + rect.left) / 2;
        float f13 = hf0.b.f69002b;
        int i14 = hf0.b.f69004d;
        int i15 = (int) (f13 / i14);
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 < i15) {
                return i16;
            }
            i15 += i15;
        }
        return -1;
    }

    public final GestaltText D() {
        GestaltText gestaltText = this.f140191o;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("promoterGestaltText");
        throw null;
    }

    public final boolean L() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final int T(String str, int i13, int i14, vn1.g gVar, vn1.e eVar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return com.bumptech.glide.d.z(str, str.length(), new tn1.c(context, new tn1.b(tn1.c.f118612d.b(), e0.b(eVar), gVar, 2)), i14, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.END, i14, i13).getHeight();
    }

    public abstract void X();

    public final void Y() {
        f j13 = j();
        if (j13.f140175h) {
            f30 pin = j13.f140173f;
            if (pin == null) {
                Intrinsics.r("pin");
                throw null;
            }
            dw.b bVar = j13.f140170c;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            u0 u0Var = u0.OVERFLOW_BUTTON;
            g0 g0Var = g0.FLOWED_PIN;
            String uid = pin.getUid();
            HashMap o13 = ep.b.o("is_third_party_ad", "true");
            String e13 = ((es.c) bVar.f56407h).e(pin);
            if (e13 != null) {
                o13.put("ad_unit_ids", e13);
            }
            Unit unit = Unit.f80348a;
            bVar.f56400a.f0(u0Var, g0Var, uid, o13, false);
        }
        Context context = kb0.a.f79058b;
        k w23 = ((oa) ((w0) j1.b0(w0.class, f0.W()))).w2();
        f30 f30Var = j().f140173f;
        if (f30Var != null) {
            k.a(w23, f30Var, jo1.a.HOMEFEED, false, false, null, null, false, null, null, false, null, null, false, null, null, null, true, false, false, false, null, null, false, 8323064).showFeedBack();
        } else {
            Intrinsics.r("pin");
            throw null;
        }
    }

    public final void e(f presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(presenter, "<set-?>");
        this.f140184h = presenter;
        X();
    }

    public final AdChoicesView g() {
        AdChoicesView adChoicesView = this.f140188l;
        if (adChoicesView != null) {
            return adChoicesView;
        }
        Intrinsics.r("adChoicesView");
        throw null;
    }

    public final WebImageView i() {
        WebImageView webImageView = this.f140193q;
        if (webImageView != null) {
            return webImageView;
        }
        Intrinsics.r("adIcon");
        throw null;
    }

    public final f j() {
        f fVar = this.f140184h;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("adsGmaNativeAdPresenter");
        throw null;
    }

    public final GestaltText k() {
        GestaltText gestaltText = this.f140192p;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("attributionGestaltText");
        throw null;
    }

    public final String l() {
        lh0.h hVar = this.f140179c;
        if (hVar == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) hVar.f83376a;
        if (g1Var.o("ads_sponsored_label_cleanup", "enabled", z3Var) || g1Var.l("ads_sponsored_label_cleanup")) {
            String string = getResources().getString(wy1.f.sponsored);
            Intrinsics.f(string);
            return string;
        }
        String string2 = getResources().getString(wy1.f.promoted);
        Intrinsics.f(string2);
        return string2;
    }

    public final ConstraintLayout m() {
        ConstraintLayout constraintLayout = this.f140187k;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("callToActionContainer");
        throw null;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        f j13 = j();
        c0 c0Var = j13.f140177j;
        c0 c13 = c0Var != null ? j13.f140170c.c(c0Var) : null;
        j13.f140177j = null;
        return c13;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        f j13 = j();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        f30 f30Var = j13.f140173f;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        c0 d2 = j13.f140170c.d(f30Var, measuredWidth, measuredHeight, j13.f140174g, j13.f140176i);
        j13.f140177j = d2;
        return d2;
    }

    public final GestaltText n() {
        GestaltText gestaltText = this.f140189m;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("callToActionGestaltText");
        throw null;
    }

    public final pb0.a o() {
        pb0.a aVar = this.f140181e;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("clock");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r15, int r16) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.g.onMeasure(int, int):void");
    }

    public final GestaltText q() {
        GestaltText gestaltText = this.f140190n;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("headlineGestaltText");
        throw null;
    }

    public void q3() {
    }

    public abstract int s();

    public final MediaView t() {
        MediaView mediaView = this.f140186j;
        if (mediaView != null) {
            return mediaView;
        }
        Intrinsics.r("mediaView");
        throw null;
    }

    public abstract int x();

    public final NativeAdView z() {
        NativeAdView nativeAdView = this.f140185i;
        if (nativeAdView != null) {
            return nativeAdView;
        }
        Intrinsics.r("nativeAdView");
        throw null;
    }
}
