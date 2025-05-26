package xi0;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import h32.r;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import mp.m;
import nx.v;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public final class a extends f implements vi0.a, v, af2.c {

    /* renamed from: m, reason: collision with root package name */
    public o f134996m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f134997n;

    /* renamed from: o, reason: collision with root package name */
    public final l f134998o;

    /* renamed from: p, reason: collision with root package name */
    public final ProportionalImageView f134999p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f134997n) {
            this.f134997n = true;
            this.f134998o = (l) ((jb) ((b) generatedComponent())).f113485c.f114476s.get();
        }
        ProportionalImageView proportionalImageView = new ProportionalImageView(context);
        proportionalImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        proportionalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        proportionalImageView.setColorFilter(dl2.b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_300));
        proportionalImageView.f52564p = new yv1.g(1);
        this.f134999p = proportionalImageView;
    }

    @Override // xi0.f
    public final l D() {
        l lVar = this.f134998o;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.r("uriNavigator");
        throw null;
    }

    public final void X(float f13) {
        ProportionalImageView proportionalImageView = this.f134999p;
        Intrinsics.g(proportionalImageView, "null cannot be cast to non-null type com.pinterest.ui.imageview.ProportionalImageView");
        proportionalImageView.f52576J = f13;
    }

    public final void Y(vn1.g variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f135012i.i(new m(variant, 2));
    }

    @Override // vi0.b
    public final void c(String str) {
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f134996m == null) {
            this.f134996m = new o(this);
        }
        return this.f134996m;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f134996m == null) {
            this.f134996m = new o(this);
        }
        return this.f134996m.generatedComponent();
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
        return this.f134999p;
    }
}
