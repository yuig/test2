package gh1;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import ky.g;
import ky.h;
import ll.j;
import m60.w;
import m60.x0;
import net.quikkly.android.ui.CameraPreview;
import nx.d0;
import nx.v;
import so.jb;
import we1.a2;
import we1.n1;
import xk2.m;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public abstract class b extends ConstraintLayout implements eh1.a, n, v, h, af2.c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f64999r = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f65000a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65001b;

    /* renamed from: c, reason: collision with root package name */
    public final w f65002c;

    /* renamed from: d, reason: collision with root package name */
    public final l f65003d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f65004e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f65005f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f65006g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f65007h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f65008i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f65009j;

    /* renamed from: k, reason: collision with root package name */
    public final j f65010k;

    /* renamed from: l, reason: collision with root package name */
    public List f65011l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f65012m;

    /* renamed from: n, reason: collision with root package name */
    public fh1.a f65013n;

    /* renamed from: o, reason: collision with root package name */
    public String f65014o;

    /* renamed from: p, reason: collision with root package name */
    public String f65015p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f65016q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f65001b) {
            this.f65001b = true;
            jb jbVar = (jb) ((c) generatedComponent());
            this.f65002c = (w) jbVar.f113483a.f113885r0.get();
            this.f65003d = (l) jbVar.f113485c.f114476s.get();
        }
        xk2.v b13 = m.b(new a(this, 0));
        this.f65004e = b13;
        xk2.v b14 = m.b(new a(this, 1));
        this.f65005f = b14;
        xk2.v b15 = m.b(new a(this, 2));
        this.f65006g = b15;
        xk2.v b16 = m.b(new a(this, 3));
        this.f65007h = b16;
        xk2.v b17 = m.b(new a(this, 4));
        this.f65008i = b17;
        this.f65009j = m.b(new a(this, 5));
        int i14 = 16;
        this.f65010k = new j(i14, 0);
        this.f65016q = new ArrayList();
        View.inflate(getContext(), i13, this);
        Object value = b15.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Object value2 = b16.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Object value3 = b17.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        WebImageView[] webImageViewArr = {(WebImageView) value, (WebImageView) value2, (WebImageView) value3};
        String string = getResources().getString(x0.app_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Object value4 = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((GestaltText) value4).i(new ic1.c(22, this, string));
        Object value5 = b14.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((GestaltText) value5).i(new n1(this, i14));
        int i15 = 0;
        int i16 = 0;
        while (i15 < 3) {
            WebImageView webImageView = webImageViewArr[i15];
            int i17 = i16 + 1;
            if (i16 != 0) {
                bs1.c.R1(webImageView, false);
            }
            float dimensionPixelOffset = webImageView.getResources().getDimensionPixelOffset(eo1.c.lego_image_corner_radius);
            webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            i15++;
            i16 = i17;
        }
        setOnClickListener(new a2(this, 17));
    }

    public final void L(int i13) {
        ArrayList arrayList = this.f65016q;
        if (arrayList.size() < 2) {
            this.f65012m = false;
            return;
        }
        this.f65012m = true;
        int size = (i13 + 1) % arrayList.size();
        WebImageView webImageView = (WebImageView) arrayList.get(i13);
        WebImageView webImageView2 = (WebImageView) arrayList.get(size);
        PathInterpolator pathInterpolator = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        webImageView.setAlpha(1.0f);
        webImageView.setVisibility(0);
        webImageView.animate().alpha(0.0f).setStartDelay(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS).setInterpolator(pathInterpolator).setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY).withEndAction(new v.j(webImageView, this, size, 14));
        webImageView2.setAlpha(0.0f);
        webImageView2.setVisibility(0);
        webImageView2.animate().alpha(1.0f).setStartDelay(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS).setInterpolator(pathInterpolator).setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY);
    }

    @Override // eh1.a
    public void X0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f65000a == null) {
            this.f65000a = new o(this);
        }
        return this.f65000a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f65000a == null) {
            this.f65000a = new o(this);
        }
        return this.f65000a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String str = this.f65014o;
        if (str == null) {
            return null;
        }
        return j.x(this.f65010k, str, 0, 0, this.f65015p, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f65010k.y(null);
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }
}
