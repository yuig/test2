package an0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Size;
import ao2.v0;
import com.pinterest.shuffles.scene.composer.c1;
import com.pinterest.shuffles.scene.composer.z0;
import java.util.ArrayList;
import java.util.Arrays;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pd.r;
import r72.i2;
import r72.l2;
import r72.u1;
import r72.y1;
import wd.z;

/* loaded from: classes5.dex */
public final class k implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15676a;

    /* renamed from: b, reason: collision with root package name */
    public final g f15677b;

    public k(Context context, g boardPreviewConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(boardPreviewConfig, "boardPreviewConfig");
        this.f15676a = context;
        this.f15677b = boardPreviewConfig;
    }

    public static final Bitmap a(k kVar, int i13, Size size, Integer num) {
        kVar.getClass();
        int width = size.getWidth();
        int height = size.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        createBitmap.eraseColor(i13);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "apply(...)");
        if (num == null) {
            return createBitmap;
        }
        int intValue = num.intValue();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), config);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap2);
        Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        float f13 = intValue;
        canvas.drawRoundRect(new RectF(rect), f13, f13, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, rect, rect, paint);
        return createBitmap2;
    }

    public static final Bitmap b(k kVar, String str, i iVar) {
        int intValue;
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wd.g());
        Integer num = iVar.f15668c;
        if (num != null && (intValue = num.intValue()) > 0) {
            arrayList.add(new z(intValue));
        }
        com.bumptech.glide.l c13 = com.bumptech.glide.b.f(kVar.f15676a).c();
        c13.getClass();
        com.bumptech.glide.l K = ((com.bumptech.glide.l) c13.s(wd.o.f129193i, Boolean.FALSE)).K(str);
        Size size = iVar.f15666a;
        com.bumptech.glide.l lVar = (com.bumptech.glide.l) ((com.bumptech.glide.l) K.m(size.getWidth(), size.getHeight())).h(r.f99745b);
        nd.p[] pVarArr = (nd.p[]) arrayList.toArray(new nd.p[0]);
        Object obj = ((com.bumptech.glide.l) lVar.z((nd.p[]) Arrays.copyOf(pVarArr, pVarArr.length))).L(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Bitmap) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.pinterest.shuffles.scene.composer.z0
    public final Object p(y1 y1Var, Function0 function0, c1 c1Var, Function0 onProcessingComplete, bl2.c cVar) {
        c1 c1Var2;
        i A1 = k3.A1(y1Var, this.f15677b);
        i2 i2Var = A1.f15670e;
        i2 i2Var2 = i2Var == null ? i2.CENTER : i2Var;
        Typeface font = A1.f15669d;
        if (font == null) {
            font = Typeface.DEFAULT;
        }
        l2 textData = l2.a(y1Var.f106726f, null, null, null, 0.0f, null, i2Var2, false, 95);
        i2 i2Var3 = i2.LEFT;
        double d2 = y1Var.f106723c;
        if (i2Var == i2Var3) {
            q qVar = new q();
            int intValue = ((Number) function0.invoke()).intValue();
            float f13 = (float) d2;
            Intrinsics.f(font);
            Intrinsics.checkNotNullParameter(textData, "textData");
            Intrinsics.checkNotNullParameter(font, "font");
            Intrinsics.checkNotNullParameter(onProcessingComplete, "onProcessingComplete");
            qVar.f15688q = textData;
            qVar.f15690s = intValue;
            qVar.f52012n = false;
            qVar.f52011m = true;
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(Color.parseColor(textData.f106541b));
            textPaint.setTextSize(textData.f106543d);
            textPaint.setTypeface(font);
            textPaint.setAntiAlias(true);
            textPaint.setSubpixelText(true);
            textPaint.setDither(true);
            textPaint.setStyle(Paint.Style.FILL);
            int i13 = p.f15684a[textData.f106545f.ordinal()];
            textPaint.setTextAlign(i13 != 1 ? i13 != 2 ? Paint.Align.CENTER : Paint.Align.RIGHT : Paint.Align.LEFT);
            qVar.f15689r = textPaint;
            qVar.g(1.0f);
            float f14 = qVar.f15686o;
            float f15 = qVar.f15687p;
            qVar.f15691t = f15;
            ql2.g gVar = q.f15685y;
            float max = Math.max(f14 / 2048.0f, f15 / 2048.0f);
            if (max > 1.0f) {
                qVar.i(qVar.f15686o / max, qVar.f15687p / max);
            } else {
                qVar.i(qVar.f15686o, qVar.f15687p);
            }
            qVar.d(qVar.f15687p * f13);
            qVar.f52012n = true;
            onProcessingComplete.invoke();
            c1Var2 = qVar;
        } else {
            c1 c1Var3 = c1Var == null ? new c1() : c1Var;
            Intrinsics.f(font);
            c1Var3.j(((Number) function0.invoke()).intValue(), textData, (float) d2, font, onProcessingComplete);
            c1Var2 = c1Var3;
        }
        c1Var2.d(c1Var2.a() * ((float) d2));
        return c1Var2;
    }

    @Override // com.pinterest.shuffles.scene.composer.z0
    public final Object t(u1 u1Var, Function0 function0, com.pinterest.shuffles.scene.composer.h hVar, Function0 function02, bl2.c cVar) {
        ko2.f fVar = v0.f20219a;
        return kotlin.jvm.internal.j.M(cVar, ko2.e.f80326c, new j(u1Var, this, hVar, function0, function02, null));
    }
}
