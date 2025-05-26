package h81;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class d extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f68143a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68144b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68145c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68146d;

    /* renamed from: e, reason: collision with root package name */
    public final double f68147e;

    /* renamed from: f, reason: collision with root package name */
    public final double f68148f;

    /* renamed from: g, reason: collision with root package name */
    public final float f68149g;

    /* renamed from: h, reason: collision with root package name */
    public final float f68150h;

    /* renamed from: i, reason: collision with root package name */
    public final float f68151i;

    /* renamed from: j, reason: collision with root package name */
    public final float f68152j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, double d2, double d13, double d14, double d15, float f13, float f14, int i13, boolean z13, boolean z14, String str, int i14) {
        super(context);
        boolean z15 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z14;
        String str2 = (i14 & 1024) != 0 ? null : str;
        this.f68143a = i13;
        this.f68144b = z13;
        this.f68145c = z15;
        this.f68146d = str2;
        double d16 = 2;
        double d17 = f13;
        double d18 = i13 / 2;
        this.f68147e = (((d14 / d16) + d2) * d17) - d18;
        double d19 = f14;
        this.f68148f = (((d15 / d16) + d13) * d19) - d18;
        this.f68149g = (float) (d2 * d17);
        this.f68150h = (float) (d13 * d19);
        this.f68151i = (float) ((d2 + d14) * d17);
        this.f68152j = (float) ((d13 + d15) * d19);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        double d2 = this.f68147e;
        float f13 = (float) d2;
        double d13 = this.f68148f;
        float f14 = (float) d13;
        int i13 = this.f68143a;
        float f15 = i13;
        RectF rectF = new RectF(f13, f14, f13 + f15, f15 + f14);
        if (this.f68145c) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = ml2.c.c(rectF.left);
            layoutParams.topMargin = ml2.c.c(rectF.top);
            layoutParams.width = ml2.c.c(rectF.width());
            layoutParams.height = ml2.c.c(rectF.height());
            setLayoutParams(layoutParams);
        } else {
            float f16 = (float) d2;
            float f17 = (float) d13;
            float f18 = i13;
            RectF rectF2 = new RectF(f16, f17, f16 + f18, f18 + f17);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = ml2.c.c(rectF2.left);
            layoutParams2.topMargin = ml2.c.c(rectF2.top);
            layoutParams2.width = ml2.c.c(rectF2.width());
            layoutParams2.height = ml2.c.c(rectF2.height());
            setLayoutParams(layoutParams2);
        }
        Context context = getContext();
        int i14 = eo1.d.circle_white;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i14));
        setElevation(getResources().getDimension(vc2.a.flashlight_dot_elevation));
        setTranslationZ(getResources().getDimension(vc2.a.flashlight_dot_elevation));
        setOutlineProvider(new nj.c(this, 4));
    }
}
