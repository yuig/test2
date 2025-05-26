package hb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f68579a;

    /* renamed from: b, reason: collision with root package name */
    public final float f68580b;

    /* renamed from: c, reason: collision with root package name */
    public final float f68581c;

    /* renamed from: d, reason: collision with root package name */
    public final List f68582d;

    /* renamed from: e, reason: collision with root package name */
    public final e f68583e;

    /* renamed from: f, reason: collision with root package name */
    public final float f68584f;

    /* renamed from: g, reason: collision with root package name */
    public final float f68585g;

    /* renamed from: h, reason: collision with root package name */
    public final float f68586h;

    /* renamed from: i, reason: collision with root package name */
    public final float f68587i;

    /* renamed from: j, reason: collision with root package name */
    public final float f68588j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f68589k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f68590l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f68591m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, float f13, float f14, float f15, ArrayList colorList, e circleShadeOrientation) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(circleShadeOrientation, "circleShadeOrientation");
        this.f68579a = f13;
        this.f68580b = f14;
        this.f68581c = f15;
        this.f68583e = circleShadeOrientation;
        this.f68584f = f13 - f15;
        this.f68585g = f14 - f15;
        this.f68586h = f13 + f15;
        this.f68587i = f14 + f15;
        this.f68588j = f15 * 2;
        this.f68589k = new RectF();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f68590l = paint;
        ArrayList arrayList = new ArrayList();
        Iterator it = colorList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Paint paint2 = new Paint(1);
            paint2.setColor(Color.parseColor(str));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
            arrayList.add(paint2);
        }
        this.f68591m = arrayList;
        if (arrayList.size() < 2) {
            vb0.j.f125466a.G("Please make sure you have more than 1 paint in the paintList before using this view!", new Object[0]);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(this.f68579a, this.f68580b, this.f68581c, this.f68590l);
        int i13 = k.f68578a[this.f68583e.ordinal()];
        RectF rectF = this.f68589k;
        ArrayList arrayList = this.f68591m;
        float f13 = this.f68584f;
        float f14 = this.f68585g;
        float f15 = this.f68588j;
        if (i13 == 1) {
            float size = f15 / arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Paint paint = (Paint) it.next();
                float f16 = f13 + size;
                rectF.set(f13, f14, f16, this.f68587i);
                canvas.drawRect(rectF, paint);
                f13 = f16;
            }
            return;
        }
        if (i13 != 2) {
            return;
        }
        float size2 = f15 / arrayList.size();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Paint paint2 = (Paint) it2.next();
            float f17 = f14 + size2;
            rectF.set(f13, f14, this.f68586h, f17);
            canvas.drawRect(rectF, paint2);
            f14 = f17;
        }
    }
}
