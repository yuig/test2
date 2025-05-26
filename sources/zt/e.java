package zt;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import androidx.media3.ui.k;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.ads.feature.owc.view.showcase.subpage.AdsShowcaseSubpageItemView;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import vq0.h;
import xt.f;
import yk1.j;
import yk1.m;
import yk1.n;

/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142762a;

    /* renamed from: b, reason: collision with root package name */
    public final f f142763b;

    public e(f showcaseManager, int i13) {
        this.f142762a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
            this.f142763b = showcaseManager;
        } else {
            Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
            this.f142763b = showcaseManager;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        a aVar;
        switch (this.f142762a) {
            case 0:
                AdsShowcaseSubpageItemView view = (AdsShowcaseSubpageItemView) nVar;
                pt.a showcasePagePin = (pt.a) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(showcasePagePin, "model");
                AdsShowcaseSubpageItemView adsShowcaseSubpageItemView = view instanceof View ? view : null;
                if (adsShowcaseSubpageItemView != null) {
                    j.a().getClass();
                    m b13 = j.b(adsShowcaseSubpageItemView);
                    if (!(b13 instanceof a)) {
                        b13 = null;
                    }
                    aVar = (a) b13;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(showcasePagePin, "showcasePagePin");
                    showcasePagePin.getClass();
                    view.f35406g = aVar;
                    Intrinsics.checkNotNullParameter(showcasePagePin, "showcasePagePin");
                    f showcaseManager = aVar.f142755a;
                    Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
                    f30 f30Var = showcasePagePin.f101326a;
                    view.f35400a = f30Var;
                    view.f35405f = i13;
                    view.f35401b = showcaseManager;
                    MaterialCardView materialCardView = view.f35403d;
                    materialCardView.clearAnimation();
                    Animation animation = materialCardView.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                    }
                    materialCardView.setLayoutAnimationListener(null);
                    String y03 = bs1.c.y0(f30Var);
                    WebImageView webImageView = view.f35404e;
                    webImageView.loadUrl(y03);
                    webImageView.setOnClickListener(new k(view, i13, 1));
                    boolean z13 = showcasePagePin.f101327b;
                    MaterialCardView materialCardView2 = view.f35402c;
                    if (!z13) {
                        materialCardView2.setAlpha(0.5f);
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(materialCardView, PropertyValuesHolder.ofFloat("scaleX", 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f));
                        ofPropertyValuesHolder.setDuration(100L);
                        ofPropertyValuesHolder.start();
                        Resources resources = view.getContext().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        materialCardView2.X(a0.K(0, resources));
                        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(materialCardView2, "strokeColor", 0);
                        ofArgb.setDuration(100L);
                        ofArgb.start();
                        break;
                    } else {
                        materialCardView2.setAlpha(1.0f);
                        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(materialCardView, PropertyValuesHolder.ofFloat("scaleX", 0.92499995f), PropertyValuesHolder.ofFloat("scaleY", 0.95f));
                        ofPropertyValuesHolder2.setDuration(100L);
                        ofPropertyValuesHolder2.start();
                        Resources resources2 = view.getContext().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        materialCardView2.X(a0.K(2, resources2));
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ObjectAnimator ofArgb2 = ObjectAnimator.ofArgb(materialCardView2, "strokeColor", a0.q0(context) ? -1 : -16777216);
                        ofArgb2.setDuration(100L);
                        ofArgb2.start();
                        break;
                    }
                }
                break;
            default:
                zu.f view2 = (zu.f) nVar;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(pin, "model");
                zu.f fVar = view2 instanceof View ? view2 : null;
                if (fVar != null) {
                    j.a().getClass();
                    ?? b14 = j.b(fVar);
                    r4 = b14 instanceof au.b ? b14 : null;
                }
                if (r4 != null) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    r4.f20467b = pin;
                    if (pin != null) {
                        view2.getClass();
                        Intrinsics.checkNotNullParameter(pin, "pin");
                        f showcaseManager2 = r4.f20466a;
                        Intrinsics.checkNotNullParameter(showcaseManager2, "showcaseManager");
                        view2.f142798b = pin;
                        view2.f142799c = showcaseManager2;
                        WebImageView webImageView2 = view2.f142804h;
                        float dimension = webImageView2.getResources().getDimension(eo1.c.lego_corner_radius_medium);
                        webImageView2.g2(dimension, 0.0f, dimension, 0.0f);
                        webImageView2.loadUrl(bs1.c.y0(pin));
                        webImageView2.setClipToOutline(true);
                        GestaltText gestaltText = view2.f142805i;
                        gestaltText.setMinWidth(0);
                        gestaltText.setMaxWidth((int) gestaltText.getResources().getDimension(ps.n.ads_subpin_title_width_beta_max));
                        gestaltText.i(new hs.a(16, pin, gestaltText));
                        view2.f142806j = r4;
                        break;
                    }
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f142762a;
        f fVar = this.f142763b;
        switch (i13) {
            case 0:
                return new a(fVar);
            default:
                return new au.b(fVar);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f142762a) {
            case 0:
                pt.a model = (pt.a) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                f30 model2 = (f30) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }
}
