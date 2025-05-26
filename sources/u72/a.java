package u72;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import hd2.b;
import hd2.c;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import wd.d;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f120904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f120905c;

    /* renamed from: d, reason: collision with root package name */
    public final int f120906d;

    /* renamed from: e, reason: collision with root package name */
    public final float f120907e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120908f;

    public a(String imageUrl, int i13) {
        int argb = Color.argb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 0, 0, 0);
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f120904b = imageUrl;
        this.f120905c = i13;
        this.f120906d = argb;
        this.f120907e = 4.0f;
        this.f120908f = a.class.getName() + "-" + imageUrl + "-" + i13 + "-" + argb + "-4.0";
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        byte[] bytes = this.f120908f.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }

    @Override // wd.d
    public final Bitmap c(qd.d pool, Bitmap toTransform, int i13, int i14) {
        Iterator it;
        int i15;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        float f13 = 2;
        float max = Math.max(toTransform.getWidth(), toTransform.getHeight()) * 0.035f * f13;
        int i16 = (int) (max * f13);
        Paint paint = new Paint();
        paint.setColor(this.f120905c);
        paint.setStyle(Paint.Style.STROKE);
        int i17 = 1;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(max);
        paint.setShadowLayer(this.f120907e, 0.0f, 0.0f, this.f120906d);
        Bitmap g13 = pool.g(toTransform.getWidth() + i16, toTransform.getHeight() + i16, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(g13, "get(...)");
        Canvas canvas = new Canvas(g13);
        int i18 = (int) max;
        int i19 = 0;
        canvas.drawBitmap(toTransform, new Rect(0, 0, toTransform.getWidth(), toTransform.getHeight()), new Rect(i18, i18, toTransform.getWidth() + i18, toTransform.getHeight() + i18), (Paint) null);
        ArrayList j13 = new g01.a(g13, new c(0.0f, 14)).j();
        int i23 = 10;
        ArrayList arrayList = new ArrayList(g0.q(j13, 10));
        Iterator it2 = j13.iterator();
        while (it2.hasNext()) {
            List list = ((b) it2.next()).f68914a;
            ArrayList arrayList2 = new ArrayList(g0.q(list, i23));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new PointF((Point) it3.next()));
            }
            Path path = new Path();
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i24 = i19;
                while (i24 < size) {
                    if (i24 == 0) {
                        PointF pointF = (PointF) arrayList2.get(i19);
                        path.moveTo(pointF.x, pointF.y);
                    } else if (i24 == arrayList2.size() - i17) {
                        PointF pointF2 = (PointF) arrayList2.get(i24);
                        path.lineTo(pointF2.x, pointF2.y);
                    } else {
                        PointF pointF3 = (PointF) arrayList2.get(i24 - 1);
                        PointF pointF4 = (PointF) arrayList2.get(i24);
                        PointF pointF5 = (PointF) arrayList2.get(i24 + 1);
                        float f14 = pointF4.x;
                        it = it2;
                        float f15 = pointF5.x;
                        i15 = size;
                        float f16 = ((f15 - pointF3.x) * 1.0f) / f13;
                        float f17 = pointF4.y;
                        float f18 = pointF5.y;
                        float f19 = ((f18 - pointF3.y) * 1.0f) / f13;
                        path.cubicTo(f16 + f14, f19 + f17, f14 - f16, f17 - f19, f15, f18);
                        i24++;
                        it2 = it;
                        size = i15;
                        i17 = 1;
                        i19 = 0;
                    }
                    it = it2;
                    i15 = size;
                    i24++;
                    it2 = it;
                    size = i15;
                    i17 = 1;
                    i19 = 0;
                }
            }
            Iterator it4 = it2;
            arrayList.add(path);
            it2 = it4;
            i17 = 1;
            i23 = 10;
            i19 = 0;
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            canvas.drawPath((Path) it5.next(), paint);
        }
        paint.clearShadowLayer();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            canvas.drawPath((Path) it6.next(), paint);
        }
        canvas.drawBitmap(toTransform, max, max, (Paint) null);
        return g13;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.shuffles.image.BorderTransformation");
        return Intrinsics.d(this.f120904b, ((a) obj).f120904b);
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f120904b.hashCode();
    }
}
