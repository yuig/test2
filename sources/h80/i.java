package h80;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.i10;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f68091r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f68092s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f68092s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f68092s, cVar);
        iVar.f68091r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        FrameLayout frameLayout2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f68091r;
        boolean U0 = j1.U0(bVar.f68080a);
        l lVar = this.f68092s;
        String str = bVar.f68080a;
        if (!U0 || Intrinsics.d(str, "https://i.pinimg.com/736x/6f/79/06/6f7906b97dd3089fdc485c8f3a3c6751.jpg") || Intrinsics.d(str, lVar.f68104i0)) {
            int i13 = l.f68097m0;
            View view = lVar.getView();
            if (view != null && (frameLayout = (FrameLayout) view.findViewById(g80.b.survey_container)) != null) {
                frameLayout.removeAllViews();
            }
        } else {
            lVar.f68104i0 = str;
            lVar.f68106k0.putAll(bVar.f68083d);
            View view2 = lVar.getView();
            if (view2 != null && (frameLayout2 = (FrameLayout) view2.findViewById(g80.b.survey_container)) != null) {
                frameLayout2.removeAllViews();
                Context requireContext = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                h01.e eVar = new h01.e(requireContext, lVar.s7(), new h(lVar, 0));
                eVar.L(new h01.c(412, 412, 412, "Do do you like this image?", null, 33));
                frameLayout2.addView(eVar);
            }
        }
        int i14 = l.f68097m0;
        View view3 = lVar.getView();
        if (view3 != null && (linearLayout = (LinearLayout) view3.findViewById(g80.b.more_generation_container)) != null) {
            linearLayout.removeAllViews();
            for (i10 i10Var : bVar.f68082c) {
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bs1.c.W(linearLayout2, g80.a.style_picker_size), -1);
                layoutParams.setMargins(bs1.c.W(linearLayout2, eo1.c.space_200), bs1.c.W(linearLayout2, eo1.c.space_400), bs1.c.W(linearLayout2, eo1.c.space_200), bs1.c.W(linearLayout2, eo1.c.space_400));
                linearLayout2.setLayoutParams(layoutParams);
                WebImageView webImageView = new WebImageView(linearLayout2.getContext());
                webImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, bs1.c.W(webImageView, g80.a.style_picker_size)));
                float W = bs1.c.W(webImageView, eo1.c.space_400);
                webImageView.g2(W, W, W, W);
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webImageView.loadUrl(i10Var.e());
                linearLayout2.addView(webImageView);
                Context context = linearLayout2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                gestaltText.i(new mz.c(i10Var, 15));
                linearLayout2.addView(gestaltText, new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.setOnClickListener(new co.a(25, lVar, i10Var));
                linearLayout.addView(linearLayout2);
            }
        }
        WebImageView webImageView2 = lVar.f68100e0;
        if (webImageView2 == null) {
            Intrinsics.r("imageView");
            throw null;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        webImageView2.setScaleType(scaleType);
        WebImageView webImageView3 = lVar.f68100e0;
        if (webImageView3 == null) {
            Intrinsics.r("imageView");
            throw null;
        }
        Navigation navigation = lVar.I;
        webImageView3.loadUrl(navigation != null ? navigation.v0("com.pinterest.EXTRA_URL") : null);
        WebImageView webImageView4 = lVar.f68100e0;
        if (webImageView4 == null) {
            Intrinsics.r("imageView");
            throw null;
        }
        float X = bs1.c.X(lVar, eo1.c.space_800);
        webImageView4.g2(X, X, X, X);
        if (bVar.f68081b) {
            com.bumptech.glide.l d2 = com.bumptech.glide.b.f(lVar.requireContext()).d();
            com.bumptech.glide.l K = d2.K(new Integer(g80.d.visualization_animation));
            Context context2 = d2.A;
            com.bumptech.glide.l lVar2 = (com.bumptech.glide.l) ((com.bumptech.glide.l) ((com.bumptech.glide.l) K.v(context2.getTheme())).t(ge.a.c(context2))).h(pd.r.f99744a);
            ImageView imageView = lVar.f68102g0;
            if (imageView == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            lVar2.G(imageView);
            ImageView imageView2 = lVar.f68102g0;
            if (imageView2 == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            bs1.c.U1(imageView2);
            View view4 = lVar.f68103h0;
            if (view4 == null) {
                Intrinsics.r("background");
                throw null;
            }
            bs1.c.U1(view4);
        } else {
            com.bumptech.glide.o f13 = com.bumptech.glide.b.f(lVar.requireContext());
            ImageView imageView3 = lVar.f68102g0;
            if (imageView3 == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            f13.getClass();
            f13.e(new com.bumptech.glide.m(imageView3));
            ImageView imageView4 = lVar.f68102g0;
            if (imageView4 == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            bs1.c.X0(imageView4);
            View view5 = lVar.f68103h0;
            if (view5 == null) {
                Intrinsics.r("background");
                throw null;
            }
            bs1.c.X0(view5);
        }
        if (j1.U0(str)) {
            WebImageView webImageView5 = lVar.f68100e0;
            if (webImageView5 == null) {
                Intrinsics.r("imageView");
                throw null;
            }
            bs1.c.b1(webImageView5);
            WebImageView webImageView6 = lVar.f68101f0;
            if (webImageView6 == null) {
                Intrinsics.r("genImageView");
                throw null;
            }
            webImageView6.setAlpha(0.1f);
            webImageView6.loadUrl(str);
            WebImageView webImageView7 = lVar.f68100e0;
            if (webImageView7 == null) {
                Intrinsics.r("imageView");
                throw null;
            }
            float W2 = bs1.c.W(webImageView6, eo1.c.space_800);
            webImageView7.g2(W2, W2, W2, W2);
            webImageView6.setScaleType(scaleType);
            bs1.c.U1(webImageView6);
            webImageView6.Y(new eu.l(webImageView6, 1));
        } else {
            WebImageView webImageView8 = lVar.f68101f0;
            if (webImageView8 == null) {
                Intrinsics.r("genImageView");
                throw null;
            }
            bs1.c.X0(webImageView8);
            WebImageView webImageView9 = lVar.f68100e0;
            if (webImageView9 == null) {
                Intrinsics.r("imageView");
                throw null;
            }
            bs1.c.U1(webImageView9);
        }
        return Unit.f80348a;
    }
}
