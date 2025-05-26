package jg1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.pinterest.api.model.fr;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final Size f75967a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f75968b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f75969c;

    /* renamed from: d, reason: collision with root package name */
    public final List f75970d;

    /* renamed from: e, reason: collision with root package name */
    public final Pair f75971e;

    /* renamed from: f, reason: collision with root package name */
    public final float f75972f;

    /* renamed from: g, reason: collision with root package name */
    public final float f75973g;

    /* renamed from: h, reason: collision with root package name */
    public EGLDisplay f75974h;

    /* renamed from: i, reason: collision with root package name */
    public EGLContext f75975i;

    /* renamed from: j, reason: collision with root package name */
    public EGLSurface f75976j;

    /* renamed from: k, reason: collision with root package name */
    public Surface f75977k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f75978l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f75979m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f75980n;

    /* renamed from: o, reason: collision with root package name */
    public final int f75981o;

    /* renamed from: p, reason: collision with root package name */
    public kg1.c f75982p;

    /* renamed from: q, reason: collision with root package name */
    public final kg1.b f75983q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f75984r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f75985s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f75986t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f75987u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f75988v;

    /* renamed from: w, reason: collision with root package name */
    public final int f75989w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f75990x;

    /* renamed from: y, reason: collision with root package name */
    public int f75991y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f75992z;

    public e(Size outputResolution, Size inputResolution, String str, float[] exportMatrix, List bitmapConfigs, Pair pair) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        Intrinsics.checkNotNullParameter(inputResolution, "inputResolution");
        Intrinsics.checkNotNullParameter(exportMatrix, "exportMatrix");
        Intrinsics.checkNotNullParameter(bitmapConfigs, "bitmapConfigs");
        this.f75967a = outputResolution;
        this.f75968b = inputResolution;
        this.f75969c = exportMatrix;
        this.f75970d = bitmapConfigs;
        this.f75971e = pair;
        float width = outputResolution.getWidth() / outputResolution.getHeight();
        this.f75972f = width;
        int i13 = 2;
        float f13 = 2;
        this.f75973g = f13 * width;
        this.f75974h = EGL14.EGL_NO_DISPLAY;
        this.f75975i = EGL14.EGL_NO_CONTEXT;
        this.f75976j = EGL14.EGL_NO_SURFACE;
        this.f75978l = new Object();
        this.f75984r = new float[16];
        float[] fArr = new float[16];
        this.f75985s = fArr;
        float[] fArr2 = new float[16];
        this.f75986t = fArr2;
        float[] fArr3 = new float[16];
        this.f75987u = fArr3;
        this.f75988v = new float[16];
        this.f75990x = new ArrayList();
        int parseColor = Color.parseColor(str == null ? "#000000" : str);
        float f14 = 255;
        this.f75992z = new float[]{Color.red(parseColor) / f14, Color.green(parseColor) / f14, Color.blue(parseColor) / f14, Color.alpha(parseColor) / f14};
        int[] iArr = new int[2];
        GLES20.glGenTextures(2, iArr, 0);
        int i14 = iArr[0];
        this.f75981o = i14;
        this.f75989w = iArr[1];
        kg1.c cVar = new kg1.c(i14, null, false);
        this.f75982p = cVar;
        cVar.f79404a = this;
        this.f75977k = new Surface(cVar.f79405b);
        kg1.b bVar = new kg1.b(36197, null, width, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
        this.f75983q = bVar;
        bVar.f();
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.orthoM(fArr3, 0, -width, width, -1.0f, 1.0f, 5.0f, 7.0f);
        Matrix.setIdentityM(fArr, 0);
        Iterator it = bitmapConfigs.iterator();
        while (it.hasNext()) {
            fr frVar = (fr) it.next();
            float[] fArr4 = new float[16];
            float[] fArr5 = new float[16];
            List list = frVar.f37755a;
            dw0.a aVar = (dw0.a) CollectionsKt.firstOrNull(list);
            float width2 = (aVar == null || (bitmap2 = aVar.f56409a) == null) ? 0.0f : bitmap2.getWidth();
            dw0.a aVar2 = (dw0.a) CollectionsKt.firstOrNull(list);
            float height = (aVar2 == null || (bitmap = aVar2.f56409a) == null) ? 0.0f : bitmap.getHeight();
            float[] fArr6 = new float[9];
            frVar.f37756b.getValues(fArr6);
            Matrix.setIdentityM(fArr4, 0);
            Matrix.multiplyMM(fArr4, 0, this.f75986t, 0, fArr4, 0);
            Matrix.multiplyMM(fArr4, 0, this.f75987u, 0, fArr4, 0);
            Matrix.scaleM(fArr4, 0, 1.0f, -1.0f, 1.0f);
            Matrix.setIdentityM(fArr5, 0);
            float f15 = frVar.f37757c;
            float f16 = frVar.f37758d;
            Matrix.translateM(fArr4, 0, ((((f15 - width2) * (-1.0f)) / f13) * this.f75973g) / f15, ((((f16 - height) * (-1.0f)) / f13) * f13) / f16, 0.0f);
            Float H = kotlin.collections.c0.H(i13, fArr6);
            float floatValue = H != null ? H.floatValue() : 0.0f;
            Float H2 = kotlin.collections.c0.H(5, fArr6);
            Matrix.translateM(fArr4, 0, (floatValue * this.f75973g) / f15, ((H2 != null ? H2.floatValue() : 0.0f) * f13) / f16, 0.0f);
            float f17 = width2 / f13;
            float f18 = ((height / f13) * f13) / f16;
            float f19 = f13;
            Matrix.translateM(fArr4, 0, ((this.f75973g * f17) / f15) * (-1.0f), f18 * (-1.0f), 0.0f);
            float f23 = fArr6[0];
            float f24 = fArr6[1];
            float f25 = (f24 * f24) + (f23 * f23);
            float f26 = width2;
            float sqrt = (float) Math.sqrt(f25);
            float f27 = fArr6[4];
            float f28 = fArr6[3];
            Matrix.scaleM(fArr4, 0, sqrt, (float) Math.sqrt((f28 * f28) + (f27 * f27)), 1.0f);
            Matrix.rotateM(fArr4, 0, d(fArr6), 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr4, 0, (f17 * this.f75973g) / f15, f18, 0.0f);
            Matrix.scaleM(fArr4, 0, f26 / f15, height / f16, 1.0f);
            kg1.b bVar2 = new kg1.b(3553, list, fArr4, fArr5, this.f75972f, new Pair(Float.valueOf(f15), Float.valueOf(f16)), d(fArr6));
            bVar2.f();
            this.f75990x.add(bVar2);
            f13 = f19;
            i13 = 2;
        }
    }

    public static float d(float[] fArr) {
        if (fArr.length != 9) {
            return 0.0f;
        }
        return (-1) * ((float) Math.atan2(fArr[1], fArr[0])) * 57.29578f;
    }

    public final void a() {
        kg1.c cVar;
        synchronized (this.f75978l) {
            while (!this.f75979m && !this.f75980n) {
                try {
                    Object obj = this.f75978l;
                    Intrinsics.g(obj, "null cannot be cast to non-null type java.lang.Object");
                    obj.wait(10000L);
                    if (!this.f75979m && !this.f75980n) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e13) {
                    throw new RuntimeException(e13);
                }
            }
            this.f75979m = false;
            Unit unit = Unit.f80348a;
        }
        if (this.f75980n || (cVar = this.f75982p) == null) {
            return;
        }
        cVar.f79405b.updateTexImage();
        cVar.f79405b.getTransformMatrix(this.f75988v);
    }

    public final void b() {
        synchronized (this.f75978l) {
            this.f75980n = true;
            Object obj = this.f75978l;
            Intrinsics.g(obj, "null cannot be cast to non-null type java.lang.Object");
            obj.notifyAll();
            Unit unit = Unit.f80348a;
        }
    }

    public final void c(long j13) {
        float sqrt;
        float sqrt2;
        synchronized (this.f75978l) {
            try {
                if (this.f75980n) {
                    return;
                }
                int i13 = 0;
                GLES20.glViewport(0, 0, this.f75967a.getWidth(), this.f75967a.getHeight());
                float[] fArr = this.f75992z;
                GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
                GLES20.glClear(16384);
                Matrix.multiplyMM(this.f75984r, 0, this.f75986t, 0, this.f75985s, 0);
                float[] fArr2 = this.f75984r;
                Matrix.multiplyMM(fArr2, 0, this.f75987u, 0, fArr2, 0);
                Pair pair = this.f75971e;
                if (pair != null) {
                    Matrix.scaleM(this.f75984r, 0, ((Number) pair.f80346a).floatValue(), ((Number) pair.f80347b).floatValue(), 1.0f);
                }
                Float H = kotlin.collections.c0.H(2, this.f75969c);
                float floatValue = H != null ? H.floatValue() : 0.0f;
                float f13 = -1;
                Float H2 = kotlin.collections.c0.H(5, this.f75969c);
                Matrix.translateM(this.f75984r, 0, (floatValue * this.f75973g) / this.f75967a.getWidth(), ((f13 * (H2 != null ? H2.floatValue() : 0.0f)) * 2) / this.f75967a.getHeight(), 0.0f);
                Matrix.rotateM(this.f75984r, 0, -d(this.f75969c), 0.0f, 0.0f, 1.0f);
                float[] fArr3 = this.f75984r;
                float[] fArr4 = this.f75969c;
                if (fArr4.length != 9) {
                    sqrt = 1.0f;
                } else {
                    float f14 = fArr4[0];
                    float f15 = fArr4[1];
                    sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                }
                float[] fArr5 = this.f75969c;
                if (fArr5.length != 9) {
                    sqrt2 = 1.0f;
                } else {
                    float f16 = fArr5[4];
                    float f17 = fArr5[3];
                    sqrt2 = (float) Math.sqrt((f17 * f17) + (f16 * f16));
                }
                Matrix.scaleM(fArr3, 0, sqrt, sqrt2, 1.0f);
                float[] fArr6 = {1.0f, 1.0f};
                float width = this.f75968b.getWidth() / this.f75968b.getHeight();
                float width2 = this.f75967a.getWidth();
                float f18 = width2 / width;
                float height = this.f75967a.getHeight();
                if (f18 < height) {
                    fArr6[1] = f18 / height;
                } else {
                    fArr6[0] = (height * width) / width2;
                }
                Matrix.scaleM(this.f75984r, 0, fArr6[0], fArr6[1], 1.0f);
                if (Math.abs(this.f75991y) % RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP == 90) {
                    Matrix.scaleM(this.f75984r, 0, this.f75967a.getWidth() / this.f75967a.getHeight(), this.f75967a.getHeight() / this.f75967a.getWidth(), 1.0f);
                }
                Matrix.rotateM(this.f75984r, 0, -this.f75991y, 0.0f, 0.0f, 1.0f);
                kg1.b bVar = this.f75983q;
                if (bVar != null) {
                    bVar.a(this.f75981o, this.f75984r, this.f75988v, null, 1.0f);
                }
                Iterator it = this.f75990x.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    ((kg1.b) next).c(this.f75989w, j13, (fr) CollectionsKt.U(i13, this.f75970d));
                    i13 = i14;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e() {
        EGLDisplay eGLDisplay = this.f75974h;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, this.f75976j);
            EGL14.eglDestroyContext(this.f75974h, this.f75975i);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f75974h);
        }
        Surface surface = this.f75977k;
        if (surface != null) {
            surface.release();
        }
        kg1.c cVar = this.f75982p;
        if (cVar != null) {
            cVar.f79405b.release();
        }
        this.f75974h = EGL14.EGL_NO_DISPLAY;
        this.f75975i = EGL14.EGL_NO_CONTEXT;
        this.f75976j = EGL14.EGL_NO_SURFACE;
        this.f75977k = null;
        this.f75982p = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture st2) {
        Intrinsics.checkNotNullParameter(st2, "st");
        synchronized (this.f75978l) {
            if (this.f75980n) {
                return;
            }
            if (this.f75979m) {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
            this.f75979m = true;
            Object obj = this.f75978l;
            Intrinsics.g(obj, "null cannot be cast to non-null type java.lang.Object");
            obj.notifyAll();
            Unit unit = Unit.f80348a;
        }
    }
}
