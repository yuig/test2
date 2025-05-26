package xi0;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import h32.r;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import nx.v;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public final class c extends f implements vi0.a, v, af2.c {

    /* renamed from: m, reason: collision with root package name */
    public o f135000m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f135001n;

    /* renamed from: o, reason: collision with root package name */
    public final l f135002o;

    /* renamed from: p, reason: collision with root package name */
    public final ProportionalImageView f135003p;

    /* renamed from: q, reason: collision with root package name */
    public final ProportionalImageView f135004q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearLayout f135005r;

    /* renamed from: s, reason: collision with root package name */
    public float f135006s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f135001n) {
            this.f135001n = true;
            this.f135002o = (l) ((jb) ((d) generatedComponent())).f113485c.f114476s.get();
        }
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        proportionalImageView.setScaleType(scaleType);
        proportionalImageView.setColorFilter(dl2.b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_300));
        proportionalImageView.f52564p = new yv1.g(1);
        this.f135003p = proportionalImageView;
        ProportionalImageView proportionalImageView2 = new ProportionalImageView(context);
        proportionalImageView2.setScaleType(scaleType);
        proportionalImageView2.setColorFilter(dl2.b.y0(proportionalImageView2, eo1.a.color_background_dark_opacity_300));
        proportionalImageView2.f52564p = new yv1.g(1);
        bs1.c.X0(proportionalImageView2);
        this.f135004q = proportionalImageView2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        linearLayout.setLayoutParams(layoutParams);
        this.f135005r = linearLayout;
        this.f135006s = 1.0f;
    }

    @Override // xi0.f
    public final l D() {
        l lVar = this.f135002o;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("uriNavigator");
        throw null;
    }

    @Override // xi0.f
    public final void L() {
        LinearLayout linearLayout = this.f135005r;
        addView(linearLayout);
        linearLayout.removeAllViewsInLayout();
        linearLayout.addView(this.f135003p, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        linearLayout.addView(this.f135004q, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        addView(this.f135012i);
        addView(this.f135013j);
        addView(this.f135014k);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
            int marginStart = marginLayoutParams.getMarginStart();
            int i13 = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = i13;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
    }

    @Override // vi0.b
    public final void c(String str) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f135000m == null) {
            this.f135000m = new o(this);
        }
        return this.f135000m;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f135000m == null) {
            this.f135000m = new o(this);
        }
        return this.f135000m.generatedComponent();
    }

    @Override // xi0.f, vi0.b
    public final void j1(vi0.c viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        super.j1(viewModel);
        List list = viewModel.f125871i;
        int size = list.size();
        ProportionalImageView proportionalImageView = this.f135003p;
        ProportionalImageView proportionalImageView2 = this.f135004q;
        if (size > 1) {
            if (!(proportionalImageView instanceof ProportionalImageView)) {
                proportionalImageView = null;
            }
            if (proportionalImageView != null) {
                proportionalImageView.f52576J = this.f135006s * 2;
            }
            bs1.c.U1(proportionalImageView2);
            proportionalImageView2.loadUrl((String) CollectionsKt.U(1, list));
            return;
        }
        if (!(proportionalImageView instanceof ProportionalImageView)) {
            proportionalImageView = null;
        }
        if (proportionalImageView != null) {
            proportionalImageView.f52576J = this.f135006s;
        }
        bs1.c.X0(proportionalImageView2);
        proportionalImageView2.clear();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        wi0.b bVar = this.f135011h;
        Object r33 = bVar != null ? bVar.r3() : null;
        if (r33 instanceof r) {
            return (r) r33;
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        wi0.b bVar = this.f135011h;
        Object s33 = bVar != null ? bVar.s3() : null;
        if (s33 instanceof r) {
            return (r) s33;
        }
        return null;
    }

    @Override // xi0.f
    public final WebImageView x() {
        return this.f135003p;
    }
}
