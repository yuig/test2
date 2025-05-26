package ba2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    public int f22431b;

    /* renamed from: c, reason: collision with root package name */
    public int f22432c;

    /* renamed from: f, reason: collision with root package name */
    public f f22435f;

    /* renamed from: g, reason: collision with root package name */
    public Context f22436g;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f22430a = b3.b.e();

    /* renamed from: d, reason: collision with root package name */
    public float f22433d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public Shader.TileMode f22434e = Shader.TileMode.CLAMP;

    @Override // ba2.a
    public final Bitmap a(Bitmap bitmap, float f13, Shader.TileMode edgeTreatment) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(edgeTreatment, "edgeTreatment");
        if (!(!bitmap.isRecycled())) {
            throw new IllegalArgumentException("Cannot blur a recycled bitmap.".toString());
        }
        this.f22433d = f13;
        this.f22434e = edgeTreatment;
        int height = bitmap.getHeight();
        int i13 = this.f22431b;
        RenderNode renderNode = this.f22430a;
        if (height != i13 || bitmap.getWidth() != this.f22432c) {
            this.f22431b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f22432c = width;
            renderNode.setPosition(0, 0, width, this.f22431b);
        }
        beginRecording = renderNode.beginRecording();
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(...)");
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        renderNode.endRecording();
        try {
            createBlurEffect = RenderEffect.createBlurEffect(f13, f13, edgeTreatment);
            renderNode.setRenderEffect(createBlurEffect);
            return bitmap;
        } catch (IllegalArgumentException e13) {
            e13.getMessage();
            return bitmap;
        }
    }

    @Override // ba2.a
    public final Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // ba2.a
    public final void c(Canvas canvas, Bitmap bitmap) {
        Context context;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f22430a);
            return;
        }
        if (this.f22435f == null && (context = this.f22436g) != null) {
            this.f22435f = new f(context);
        }
        f fVar = this.f22435f;
        if (fVar != null) {
            fVar.a(bitmap, this.f22433d, this.f22434e);
            fVar.c(canvas, bitmap);
        }
    }

    @Override // ba2.a
    public final void destroy() {
        this.f22430a.discardDisplayList();
        f fVar = this.f22435f;
        if (fVar != null) {
            fVar.destroy();
        }
    }
}
