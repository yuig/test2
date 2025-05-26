package c4;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f25684a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        f fVar = f.f25633a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return fVar.a(canvas, path);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        f fVar = f.f25633a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return fVar.e(canvas, rectF);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op3) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipPath(path, op3);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op3) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op3);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.a(canvas);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawARGB(i13, i14, i15, i16);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f13, float f14, float f15, float f16, float f17, float f18, boolean z13, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawArc(f13, f14, f15, f16, f17, f18, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i13, int i14, float f13, float f14, int i15, int i16, boolean z13, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i13, i14, f13, f14, i15, i16, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i13, int i14, float[] fArr, int i15, int[] iArr, int i16, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i13, i14, fArr, i15, iArr, i16, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawCircle(f13, f14, f15, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawColor(i13);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f13, float f14, RectF rectF2, float f15, float f16, Paint paint) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.e(canvas, rectF, f13, f14, rectF2, f15, f16, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i13, float[] fArr, int i14, int i15, Font font, Paint paint) {
        i iVar = i.f25636a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            iVar.a(canvas, iArr, i13, fArr, i14, i15, font, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawLine(f13, f14, f15, f16, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawLines(fArr, i13, i14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        i iVar = i.f25636a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            iVar.b(canvas, ninePatch, rect, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPoint(f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i13, i14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i13, int i14, float[] fArr, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i13, i14, fArr, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i13, int i14, int i15) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawRGB(i13, i14, i15);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.g(canvas, renderNode);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawText(cArr, i13, i14, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i13, int i14, Path path, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i13, i14, path, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        e eVar = e.f25632a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            eVar.b(canvas, cArr, i13, i14, i15, i16, f13, f14, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i13, float[] fArr, int i14, float[] fArr2, int i15, int[] iArr, int i16, short[] sArr, int i17, int i18, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i13, fArr, i14, fArr2, i15, iArr, i16, sArr, i17, i18, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.i(canvas);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f25684a;
        if (canvas == null) {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.restore();
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.restoreToCount(i13);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.rotate(f13);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.save();
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i13);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i13, int i14) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i13, i14);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f13, float f14) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.scale(f13, f14);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.setDensity(i13);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f13, float f14) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.skew(f13, f14);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f13, float f14) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.translate(f13, f14);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        f fVar = f.f25633a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return fVar.d(canvas, rect);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op3) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(rect, op3);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j13) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.c(canvas, j13);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawOval(f13, f14, f15, f16, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        i iVar = i.f25636a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            iVar.c(canvas, ninePatch, rectF, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f13, float f14, float f15, float f16, float f17, float f18, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawRoundRect(f13, f14, f15, f16, f17, f18, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawText(str, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        h hVar = h.f25635a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return hVar.c(canvas, rectF);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i13);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f13, float f14, float f15, float f16) {
        f fVar = f.f25633a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return fVar.b(canvas, f13, f14, f15, f16);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f13, float f14, boolean z13, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawArc(rectF, f13, f14, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i13, int i14, int i15, int i16, int i17, int i18, boolean z13, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i13, i14, i15, i16, i17, i18, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13, PorterDuff.Mode mode) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawColor(i13, mode);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawRect(f13, f14, f15, f16, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawText(str, i13, i14, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f13, float f14, float f15, float f16, Paint paint, int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayer(f13, f14, f15, f16, paint, i13);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13, int i14) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f13, f14, f15, f16, i13, i14);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i13, int i14, int i15, int i16) {
        f fVar = f.f25633a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return fVar.c(canvas, i13, i14, i15, i16);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13, BlendMode blendMode) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.b(canvas, i13, blendMode);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawText(charSequence, i13, i14, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        h hVar = h.f25635a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return hVar.b(canvas, path);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayer(f13, f14, f15, f16, paint);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f13, f14, f15, f16, i13);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f13, float f14, float f15, float f16, Region.Op op3) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(f13, f14, f15, f16, op3);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f13, float f14, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f13, f14, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j13, BlendMode blendMode) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.d(canvas, j13, blendMode);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        e eVar = e.f25632a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            eVar.a(canvas, charSequence, i13, i14, i15, i16, f13, f14, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f13, float f14, float f15, float f16, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.quickReject(f13, f14, f15, f16, edgeType);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f13, float f14, float f15, float f16) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(f13, f14, f15, f16);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f13, float f14, float f15, float f16) {
        h hVar = h.f25635a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return hVar.a(canvas, f13, f14, f15, f16);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            return canvas.clipRect(i13, i14, i15, i16);
        }
        Intrinsics.r("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        g gVar = g.f25634a;
        Canvas canvas = this.f25684a;
        if (canvas != null) {
            gVar.h(canvas, measuredText, i13, i14, i15, i16, f13, f14, z13, paint);
        } else {
            Intrinsics.r("nativeCanvas");
            throw null;
        }
    }
}
