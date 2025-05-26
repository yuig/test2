package ba2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f22437a;

    /* renamed from: b, reason: collision with root package name */
    public final RenderScript f22438b;

    /* renamed from: c, reason: collision with root package name */
    public final ScriptIntrinsicBlur f22439c;

    /* renamed from: d, reason: collision with root package name */
    public Allocation f22440d;

    /* renamed from: e, reason: collision with root package name */
    public int f22441e;

    /* renamed from: f, reason: collision with root package name */
    public int f22442f;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22437a = new Paint(2);
        RenderScript create = RenderScript.create(context);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.f22438b = create;
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
        this.f22439c = create2;
        this.f22441e = -1;
        this.f22442f = -1;
    }

    @Override // ba2.a
    public final Bitmap a(Bitmap bitmap, float f13, Shader.TileMode edgeTreatment) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(edgeTreatment, "edgeTreatment");
        RenderScript renderScript = this.f22438b;
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        if (bitmap.getHeight() != this.f22442f || bitmap.getWidth() != this.f22441e) {
            Allocation allocation = this.f22440d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f22440d = Allocation.createTyped(renderScript, createFromBitmap.getType());
            this.f22441e = bitmap.getWidth();
            this.f22442f = bitmap.getHeight();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f22439c;
        scriptIntrinsicBlur.setRadius(f13);
        scriptIntrinsicBlur.setInput(createFromBitmap);
        scriptIntrinsicBlur.forEach(this.f22440d);
        Allocation allocation2 = this.f22440d;
        if (allocation2 != null) {
            allocation2.copyTo(bitmap);
        }
        createFromBitmap.destroy();
        return bitmap;
    }

    @Override // ba2.a
    public final Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // ba2.a
    public final void c(Canvas canvas, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f22437a);
    }

    @Override // ba2.a
    public final void destroy() {
        this.f22439c.destroy();
        this.f22438b.destroy();
        Allocation allocation = this.f22440d;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
