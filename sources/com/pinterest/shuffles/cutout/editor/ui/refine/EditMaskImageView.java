package com.pinterest.shuffles.cutout.editor.ui.refine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ao2.f0;
import ao2.h1;
import ao2.u0;
import ao2.v0;
import bs1.c;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import kh2.b0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql2.g;
import r0.p0;
import r72.g2;
import r72.i1;
import v62.b;
import w62.a;
import x62.d;
import x62.e;
import x62.f;
import x62.h;
import x62.i;
import x62.j;
import x62.k;
import xk2.q;
import xk2.r;
import xk2.s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/pinterest/shuffles/cutout/editor/ui/refine/EditMaskImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "x62/e", "x62/g", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EditMaskImageView extends AppCompatImageView {

    /* renamed from: q */
    public static final g f51946q = new g(1.0f, 10.0f);

    /* renamed from: a */
    public float f51947a;

    /* renamed from: b */
    public boolean f51948b;

    /* renamed from: c */
    public int f51949c;

    /* renamed from: d */
    public e f51950d;

    /* renamed from: e */
    public boolean f51951e;

    /* renamed from: f */
    public i1 f51952f;

    /* renamed from: g */
    public float f51953g;

    /* renamed from: h */
    public k f51954h;

    /* renamed from: i */
    public y62.e f51955i;

    /* renamed from: j */
    public final LinkedList f51956j;

    /* renamed from: k */
    public final LinkedList f51957k;

    /* renamed from: l */
    public ByteBuffer f51958l;

    /* renamed from: m */
    public final Executor f51959m;

    /* renamed from: n */
    public b f51960n;

    /* renamed from: o */
    public final a f51961o;

    /* renamed from: p */
    public final ScaleGestureDetector f51962p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMaskImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Executor o13;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51949c = -65281;
        this.f51950d = new vt1.a();
        this.f51953g = 1.0f;
        this.f51956j = new LinkedList();
        this.f51957k = new LinkedList();
        f0 m13 = v0.f20219a.m(1, null);
        h1 h1Var = m13 instanceof h1 ? (h1) m13 : null;
        this.f51959m = (h1Var == null || (o13 = h1Var.o()) == null) ? new u0(m13) : o13;
        this.f51961o = new a(context, new i(this));
        this.f51962p = new ScaleGestureDetector(context, new o62.i(this));
    }

    public static void k2(EditMaskImageView editMaskImageView, f fVar) {
        ByteBuffer byteBuffer;
        j jVar = j.f133979i;
        k kVar = editMaskImageView.f51954h;
        if (kVar == null || (byteBuffer = editMaskImageView.f51958l) == null) {
            return;
        }
        editMaskImageView.f51959m.execute(new p0(editMaskImageView, byteBuffer, kVar, fVar, jVar, 6));
    }

    public final void f2(x62.g gVar, Function1 function1) {
        Bitmap bitmap;
        ByteBuffer byteBuffer;
        Object m13;
        k kVar = this.f51954h;
        if (kVar == null || (bitmap = kVar.f133985e) == null || (byteBuffer = this.f51958l) == null) {
            return;
        }
        int i13 = 0;
        try {
            q qVar = s.f135225b;
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(gVar.f133969a));
            try {
                byte[] I1 = c.I1(gZIPInputStream);
                int length = I1.length - byteBuffer.limit();
                int c13 = length > 0 ? ml2.c.c(length / 2.0f) : 0;
                byteBuffer.clear();
                byteBuffer.put(I1, c13, byteBuffer.limit());
                dl2.b.J(gZIPInputStream, null);
                byteBuffer.rewind();
                bitmap.copyPixelsFromBuffer(byteBuffer);
                m13 = Unit.f80348a;
            } finally {
            }
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (!(m13 instanceof r)) {
            if (this.f51960n != null) {
                g2(new h(this, i13));
            }
            post(new d(function1, gVar, i13));
            post(new x62.b(this, 1));
        }
    }

    public final void g2(Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        k kVar = this.f51954h;
        Bitmap bitmap = kVar != null ? kVar.f133985e : null;
        if (bitmap == null) {
            onComplete.invoke(null);
        } else {
            this.f51959m.execute(new x62.c(bitmap, this, onComplete, 0));
        }
    }

    public final float i2() {
        float f13 = this.f51947a;
        float[] fArr = new float[9];
        getImageMatrix().getValues(fArr);
        return f13 / fArr[0];
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable dr2) {
        Intrinsics.checkNotNullParameter(dr2, "dr");
        if (Intrinsics.d(dr2, this.f51954h) || Intrinsics.d(dr2, this.f51955i)) {
            invalidate();
        } else {
            super.invalidateDrawable(dr2);
        }
    }

    public final void l2(b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f51960n = params;
        y62.e eVar = this.f51955i;
        r2(eVar != null ? eVar.f137919a : null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y62.e eVar = this.f51955i;
        if (eVar != null) {
            eVar.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y62.e eVar = this.f51955i;
        if (eVar != null) {
            eVar.stop();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        y62.e eVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (Intrinsics.d(this.f51961o.f128130b, Boolean.TRUE) || (eVar = this.f51955i) == null) {
            k kVar = this.f51954h;
            if (kVar != null) {
                Matrix imageMatrix = getImageMatrix();
                Intrinsics.checkNotNullExpressionValue(imageMatrix, "getImageMatrix(...)");
                save = canvas.save();
                canvas.concat(imageMatrix);
                try {
                    kVar.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        save = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            Matrix imageMatrix2 = getImageMatrix();
            Intrinsics.checkNotNullExpressionValue(imageMatrix2, "getImageMatrix(...)");
            save = canvas.save();
            canvas.concat(imageMatrix2);
            eVar.draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th3) {
            throw th3;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0 != 3) goto L89;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r2(i1 i1Var) {
        b bVar;
        if (i1Var == null || Intrinsics.d(this.f51961o.f128130b, Boolean.TRUE) || (bVar = this.f51960n) == null) {
            return;
        }
        y62.e eVar = this.f51955i;
        if (eVar != null) {
            eVar.stop();
        }
        y62.e eVar2 = new y62.e(i1Var, q0.f80391a);
        eVar2.d(bVar);
        eVar2.c(this.f51949c);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            eVar2.setBounds(drawable.getBounds());
        }
        eVar2.setCallback(this);
        eVar2.start();
        this.f51955i = eVar2;
        invalidate();
    }

    public final void s2(i1 i1Var) {
        Bitmap X;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            r72.a aVar = i1Var.f106499b;
            if (aVar != null) {
                X = b0.Y(intrinsicWidth, intrinsicHeight, aVar);
            } else {
                String mask = i1Var.f106498a;
                if (mask == null) {
                    int i13 = g2.f106487b;
                    mask = "M0 0H0Z";
                }
                Intrinsics.checkNotNullParameter(mask, "mask");
                X = b0.X(intrinsicWidth, intrinsicHeight, b0.T1(intrinsicWidth, intrinsicHeight, mask));
            }
            k kVar = new k(X);
            kVar.f133981a = i2();
            kVar.f133982b = this.f51948b;
            kVar.f133983c.setColor(this.f51949c);
            kVar.invalidateSelf();
            this.f51954h = kVar;
            this.f51958l = ByteBuffer.allocateDirect(X.getByteCount());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        super.setImageDrawable(drawable);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f51953g = 1.0f;
        i1 i1Var = this.f51952f;
        if (i1Var != null) {
            s2(i1Var);
            this.f51959m.execute(new x62.b(this, 0));
            k kVar = this.f51954h;
            if (kVar == null || kVar.f133985e == null) {
                return;
            }
            k2(this, f.DRAW);
        }
    }
}
