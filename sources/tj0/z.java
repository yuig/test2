package tj0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import df.j1;
import kh2.k3;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;
import qa2.h0;
import qa2.j0;
import so.ba;
import so.jb;
import so.oa;
import so.s8;
import z32.d2;
import z32.f2;

/* loaded from: classes5.dex */
public final class z extends ConstraintLayout implements nx.v, d0, af2.c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f117908n = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f117909a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117910b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f117911c;

    /* renamed from: d, reason: collision with root package name */
    public wa2.m f117912d;

    /* renamed from: e, reason: collision with root package name */
    public final lh0.t f117913e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f117914f;

    /* renamed from: g, reason: collision with root package name */
    public final t2 f117915g;

    /* renamed from: h, reason: collision with root package name */
    public final ni1.d0 f117916h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIconButton f117917i;

    /* renamed from: j, reason: collision with root package name */
    public Enum f117918j;

    /* renamed from: k, reason: collision with root package name */
    public final int f117919k;

    /* renamed from: l, reason: collision with root package name */
    public final SbaPinRep f117920l;

    /* renamed from: m, reason: collision with root package name */
    public final o2 f117921m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, nx.d0 pinalytics, wa2.m pinFeatureConfig, ao2.j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        if (!this.f117910b) {
            this.f117910b = true;
            jb jbVar = (jb) ((a0) generatedComponent());
            this.f117913e = s8.e(jbVar.f113485c);
            oa oaVar = jbVar.f113483a;
            this.f117914f = oaVar.v2();
            this.f117915g = (t2) oaVar.f113950uc.get();
            this.f117916h = (ni1.d0) oaVar.Gb.get();
        }
        this.f117911c = pinalytics;
        this.f117912d = pinFeatureConfig;
        d2 d2Var = f2.Companion;
        Enum r102 = rm1.q.ANGLED_PIN;
        this.f117918j = r102;
        this.f117919k = getResources().getDimensionPixelOffset(eo1.c.space_200);
        wa2.m mVar = this.f117912d;
        j0 j0Var = this.f117914f;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        t2 t2Var = this.f117915g;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, mVar, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f117920l = sbaPinRep;
        this.f117921m = o2Var;
        lh0.t tVar = this.f117913e;
        if (tVar == null) {
            Intrinsics.r("experiment");
            throw null;
        }
        boolean a13 = tVar.a();
        this.f117918j = a13 ? rm1.n.ANGLED_PIN : r102;
        GestaltIconButton t13 = new GestaltIconButton(6, context, (AttributeSet) null).t(new gd0.c(23, this, a13 ? om1.e.SM : om1.e.MD));
        this.f117917i = t13;
        sbaPinRep.addToView(this);
        addView(t13);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f117909a == null) {
            this.f117909a = new ye2.o(this);
        }
        return this.f117909a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f117909a == null) {
            this.f117909a = new ye2.o(this);
        }
        return this.f117909a.generatedComponent();
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f117920l;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f117920l.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f117920l.markImpressionStart();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        super.onLayout(z13, i13, i14, i15, i16);
        yi1.q imageEdges = this.f117920l.getImageEdges();
        int i18 = imageEdges.f139142d;
        if (i18 <= 0 || (i17 = imageEdges.f139141c) <= 0) {
            return;
        }
        GestaltIconButton gestaltIconButton = this.f117917i;
        int measuredHeight = i18 - gestaltIconButton.getMeasuredHeight();
        int i19 = this.f117919k;
        gestaltIconButton.setY(measuredHeight - i19);
        Context context = gestaltIconButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (j1.Y0(context)) {
            gestaltIconButton.setX(imageEdges.f139139a + i19);
        } else {
            gestaltIconButton.setX((i17 - gestaltIconButton.getMeasuredWidth()) - i19);
        }
    }

    @Override // tj0.f0
    public final void setIsPinSaved(boolean z13) {
        this.f117917i.t(new r1.f(z13, this, 11));
    }

    @Override // tj0.f0
    public final void setOneTapButtonClickLister(e0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.bumptech.glide.c.m(this.f117917i, new hh0.a(listener, 18));
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        ni1.d0 d0Var = this.f117916h;
        if (d0Var == null) {
            Intrinsics.r("vmStateConverterFactory");
            throw null;
        }
        this.f117920l.bindDisplayState(this.f117921m.b(((ba) d0Var).a(this.f117912d, new mq.w(this, 3), new a8.v(this, 27)).a(i13, pin), false));
    }

    @Override // tj0.d0
    public final void updateFeatureConfig(wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f117912d = pinFeatureConfig;
    }

    @Override // tj0.f0
    public final void updateOneTapButtonVisibility(boolean z13) {
        k3.R1(this.f117917i, z13);
    }

    @Override // tj0.f0
    public final void updateQuickSaveIcon(f2 iconType) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        rm1.q x13 = dn.c.x(iconType);
        if (x13 != null) {
            this.f117918j = x13;
            this.f117917i.t(new rq.o2(x13, 3));
        }
    }
}
