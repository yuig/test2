package j21;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.pincells.fixedsize.view.FixedSizePinOverlayView;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends FrameLayout implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f74483e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f74484a;

    /* renamed from: b, reason: collision with root package name */
    public final q21.g f74485b;

    /* renamed from: c, reason: collision with root package name */
    public final FixedSizePinOverlayView f74486c;

    /* renamed from: d, reason: collision with root package name */
    public final RoundedCornersLayout f74487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i13) {
        super(context);
        int i14 = eo1.c.space_200;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f74484a = i14;
        q21.g gVar = new q21.g(context, i13);
        this.f74485b = gVar;
        FixedSizePinOverlayView fixedSizePinOverlayView = new FixedSizePinOverlayView(context);
        this.f74486c = fixedSizePinOverlayView;
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context);
        roundedCornersLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        roundedCornersLayout.setClipChildren(false);
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(i13);
        ef0.a cornerSettings = new ef0.a(dimensionPixelSize, 6);
        Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
        roundedCornersLayout.f44944e = cornerSettings;
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f74487d = roundedCornersLayout;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        roundedCornersLayout.addView(gVar);
        roundedCornersLayout.addView(fixedSizePinOverlayView);
        setClipChildren(false);
        setClipToPadding(false);
        addView(roundedCornersLayout);
    }

    public final void a(int i13, int i14) {
        this.f74485b.V(i13, i14);
        FixedSizePinOverlayView fixedSizePinOverlayView = this.f74486c;
        fixedSizePinOverlayView.getLayoutParams().width = i13;
        fixedSizePinOverlayView.getLayoutParams().height = i14;
        fixedSizePinOverlayView.post(new vs0.b(fixedSizePinOverlayView, 20));
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.f74484a);
        getLayoutParams().width = i13;
        getLayoutParams().height = dimensionPixelSize + i14;
        RoundedCornersLayout roundedCornersLayout = this.f74487d;
        roundedCornersLayout.getLayoutParams().width = i13;
        roundedCornersLayout.getLayoutParams().height = i14;
        roundedCornersLayout.requestLayout();
        post(new vs0.b(this, 18));
    }
}
