package a91;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.x4;
import f42.i;
import f42.o;
import h32.f1;
import h32.u0;
import i92.k;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import nx.d0;
import uj2.q;
import xo.l;
import yk1.p;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1567a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d presenterPinalytics, q networkStateStream, String str) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f1567a = str;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        d91.e view = (d91.e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().d(view.f54071o, view.f54072p, null, view.f54073q, this.f1567a);
    }

    public final void p3() {
        NavigationImpl w13 = Navigation.w1((ScreenLocation) x4.f51569a.getValue());
        w13.z(i.CLOSEUP.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE");
        w13.m0("com.pinterest.EXTRA_PIN_ID", this.f1567a);
        u.f85943a.d(w13);
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(d91.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        view.f54065i = this;
        Intrinsics.checkNotNullParameter("https://i.pinimg.com/originals/fe/f4/80/fef4803cc8a67b290ccaf45a429a8b54.png", "imageUrl");
        view.f54067k.j("https://i.pinimg.com/originals/fe/f4/80/fef4803cc8a67b290ccaf45a429a8b54.png", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r3(x20.a tryOnService) {
        Intrinsics.checkNotNullParameter(tryOnService, "tryOnService");
        if (isBound()) {
            if (!this.f1568b) {
                d91.e eVar = (d91.e) getView();
                bs1.c.R1(eVar.f54068l, false);
                bs1.c.R1(eVar.f54069m, true);
                return;
            }
            d91.e eVar2 = (d91.e) getView();
            Context context = eVar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            k toastUtils = eVar2.f54064h;
            if (toastUtils == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            Constructor<?> constructor = Class.forName("com.pinterest.modiface.MFEMakeupView").getConstructor(Context.class, Context.class, d0.class, k.class);
            Intrinsics.checkNotNullExpressionValue(constructor, "getConstructor(...)");
            Object newInstance = constructor.newInstance(context, context.createPackageContext(context.getPackageName(), 0), eVar2.f54059c, toastUtils);
            Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.TryOnContract.TryOnView");
            x81.k kVar = (x81.k) newInstance;
            eVar2.f54066j = kVar;
            eVar2.addView((View) kVar, -1, -1);
            x81.k kVar2 = eVar2.f54066j;
            if (kVar2 != null) {
                kVar2.resumeCamera();
            }
            if (eVar2.getContext() != null) {
                LinearLayout linearLayout = eVar2.f54070n;
                if (!Intrinsics.d(linearLayout != null ? linearLayout.getParent() : null, eVar2)) {
                    LinearLayout linearLayout2 = new LinearLayout(eVar2.getContext());
                    linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    linearLayout2.setOrientation(0);
                    linearLayout2.setWeightSum(2.0f);
                    eVar2.f54070n = linearLayout2;
                    AppCompatImageView appCompatImageView = new AppCompatImageView(eVar2.getContext(), null);
                    appCompatImageView.setImageResource(vc2.b.ic_expand_circle_nonpds);
                    LinearLayout linearLayout3 = eVar2.f54070n;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(appCompatImageView);
                    }
                    ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.weight = 1.0f;
                    }
                    appCompatImageView.setOnClickListener(new d91.b(eVar2, 2));
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(eVar2.getContext(), null);
                    Drawable f03 = bs1.c.f0(appCompatImageView2, sm1.b.ic_x_circle_gestalt, null, null, 6);
                    int W = bs1.c.W(appCompatImageView2, vc2.a.inline_makeup_cancel_size);
                    f03.setBounds(0, 0, W, W);
                    appCompatImageView2.setImageDrawable(f03);
                    LinearLayout linearLayout4 = eVar2.f54070n;
                    if (linearLayout4 != null) {
                        linearLayout4.addView(appCompatImageView2);
                    }
                    ViewGroup.LayoutParams layoutParams3 = appCompatImageView2.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.weight = 1.0f;
                        layoutParams4.leftMargin = appCompatImageView2.getResources().getDimensionPixelSize(vc2.a.try_on_controls_button_margin);
                    }
                    appCompatImageView2.setOnClickListener(new d91.b(eVar2, 3));
                    eVar2.addView(eVar2.f54070n);
                    LinearLayout linearLayout5 = eVar2.f54070n;
                    Object layoutParams5 = linearLayout5 != null ? linearLayout5.getLayoutParams() : null;
                    FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                    if (layoutParams6 != null) {
                        layoutParams6.width = -2;
                        layoutParams6.height = -2;
                        layoutParams6.bottomMargin = eVar2.getResources().getDimensionPixelSize(eo1.c.space_400);
                        layoutParams6.rightMargin = eVar2.getResources().getDimensionPixelSize(eo1.c.space_400);
                        layoutParams6.gravity = 8388693;
                    }
                }
            }
            addDisposable(new js0.c(tryOnService).b(new b91.a(this.f1567a, null, i.CLOSEUP.getValue(), null, Boolean.FALSE, o.FILTERS_UNSET.getValue(), null, null, null)).execute((ak2.e) new xo.a(this, 15), (ak2.e) new l(25)));
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_INLINE_CAMERA, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
