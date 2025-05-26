package zq;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import vb0.j;

/* loaded from: classes3.dex */
public final class e extends hb0.d {

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f142637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f142638e;

    public e(f fVar) {
        this.f142638e = fVar;
    }

    @Override // hb0.c
    public final void c() {
        int i13;
        f fVar = this.f142638e;
        ArrayList arrayList = fVar.f142647i;
        if (arrayList.size() != 4) {
            j.f125466a.G("You must have 4 bitmaps before you start combining them for Pincodes!", new Object[0]);
        }
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            i13 = fVar.f142649k;
            if (i14 >= size) {
                break;
            }
            Bitmap bitmap = (Bitmap) arrayList.get(i14);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(width >= height ? Bitmap.createBitmap(bitmap, (width / 2) - (height / 2), 0, height, height) : Bitmap.createBitmap(bitmap, 0, (height / 2) - (width / 2), width, width), i13, i13, false);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            arrayList.set(i14, createScaledBitmap);
            i14++;
        }
        int i15 = fVar.f142641c;
        int i16 = (i13 * 2) + i15;
        Bitmap createBitmap = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(255, 255, 255, 255);
        Paint paint = new Paint();
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            int i18 = i13 + i15;
            canvas.drawBitmap((Bitmap) arrayList.get(i17), (i17 % 2) * i18, (i17 / 2) * i18, paint);
        }
        this.f142637d = createBitmap;
    }

    @Override // hb0.d
    public final void e() {
        Bitmap bitmap = this.f142637d;
        if (bitmap != null) {
            this.f142638e.s3(bitmap);
        }
    }
}
