package sp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.feature.core.view.EmptyView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import k1.v0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import ni1.d0;
import ni1.o2;
import ni1.t2;
import qa2.j0;
import so.jb;
import so.oa;
import wa2.m;
import xk2.v;
import ye2.o;

/* loaded from: classes3.dex */
public final class g extends FrameLayout implements af2.c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f114857p = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f114858a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f114859b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f114860c;

    /* renamed from: d, reason: collision with root package name */
    public final t2 f114861d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f114862e;

    /* renamed from: f, reason: collision with root package name */
    public final m f114863f;

    /* renamed from: g, reason: collision with root package name */
    public final SbaPinRep f114864g;

    /* renamed from: h, reason: collision with root package name */
    public final o2 f114865h;

    /* renamed from: i, reason: collision with root package name */
    public final v f114866i;

    /* renamed from: j, reason: collision with root package name */
    public final int f114867j;

    /* renamed from: k, reason: collision with root package name */
    public final int f114868k;

    /* renamed from: l, reason: collision with root package name */
    public final int f114869l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f114870m;

    /* renamed from: n, reason: collision with root package name */
    public final EmptyView f114871n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f114872o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, nx.d0 pinalytics, m pinFeatureConfig, ao2.j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        if (!this.f114859b) {
            this.f114859b = true;
            oa oaVar = ((jb) ((h) generatedComponent())).f113483a;
            this.f114860c = (d0) oaVar.Gb.get();
            this.f114861d = (t2) oaVar.f113950uc.get();
            this.f114862e = oaVar.v2();
        }
        m a13 = m.a(pinFeatureConfig, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -1048577, -1, 1023);
        this.f114863f = a13;
        this.f114866i = xk2.m.b(new v0(29, this, pinalytics));
        this.f114867j = getResources().getDimensionPixelOffset(r0.margin_none);
        this.f114868k = getResources().getDimensionPixelOffset(r0.margin_quarter);
        this.f114869l = getResources().getDimensionPixelOffset(r0.margin_half);
        Drawable I = com.bumptech.glide.c.I(context, eo1.d.white_check_in_red_circle);
        t2 t2Var = this.f114861d;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        j0 j0Var = this.f114862e;
        if (j0Var == null) {
            Intrinsics.r("pgcFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, a13, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f114864g = sbaPinRep;
        this.f114865h = o2Var;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(yy1.a.pin_marklet_selection_icon_size);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
        imageView.setImageDrawable(I);
        this.f114870m = imageView;
        EmptyView emptyView = new EmptyView(context);
        emptyView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f114871n = emptyView;
        sbaPinRep.addToView(this);
        addView(imageView);
        addView(emptyView);
        sbaPinRep.asView().setImportantForAccessibility(2);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f114858a == null) {
            this.f114858a = new o(this);
        }
        return this.f114858a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f114858a == null) {
            this.f114858a = new o(this);
        }
        return this.f114858a.generatedComponent();
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        String string = this.f114872o ? getResources().getString(yy1.e.accessibility_image_selected) : getResources().getString(yy1.e.accessibility_image);
        EmptyView emptyView = this.f114871n;
        emptyView.setContentDescription(string);
        emptyView.setOnClickListener(new co.a(onClickListener, this, 9));
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f114871n.setOnLongClickListener(new d(0, onLongClickListener, this));
    }
}
