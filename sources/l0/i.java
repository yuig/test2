package l0;

import a.a4;
import a.ig;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import c0.f1;
import c0.i1;
import c0.p1;
import c0.z;
import com.google.common.util.concurrent.c0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.m0;

/* loaded from: classes2.dex */
public final class i implements u, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final l f81221a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f81222b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.g f81223c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f81224d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f81225e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f81226f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f81227g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f81228h;

    /* renamed from: i, reason: collision with root package name */
    public int f81229i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f81230j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f81231k;

    public i(z zVar) {
        Map emptyMap = Collections.emptyMap();
        int i13 = 0;
        this.f81225e = new AtomicBoolean(false);
        this.f81226f = new float[16];
        this.f81227g = new float[16];
        this.f81228h = new LinkedHashMap();
        this.f81229i = 0;
        this.f81230j = false;
        this.f81231k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f81222b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f81224d = handler;
        this.f81223c = new f0.g(handler);
        this.f81221a = new l();
        try {
            try {
                com.bumptech.glide.d.L(new d(this, zVar, emptyMap, i13)).get();
            } catch (InterruptedException | ExecutionException e13) {
                e = e13;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e14) {
            a();
            throw e14;
        }
    }

    @Override // l0.u
    public final void a() {
        if (this.f81225e.getAndSet(true)) {
            return;
        }
        f(new ig(this, 21), new v.h(3));
    }

    @Override // l0.u
    public final void b(f1 f1Var) {
        if (this.f81225e.get()) {
            f1Var.close();
            return;
        }
        e eVar = new e(0, this, f1Var);
        Objects.requireNonNull(f1Var);
        f(eVar, new f(0, f1Var));
    }

    @Override // l0.u
    public final c0 c(int i13, int i14) {
        return g0.m.f(com.bumptech.glide.d.L(new h(this, i13, i14)));
    }

    @Override // l0.u
    public final void d(p1 p1Var) {
        if (this.f81225e.get()) {
            p1Var.d();
        } else {
            f(new e(1, this, p1Var), new i1(p1Var, 1));
        }
    }

    public final void e() {
        if (this.f81230j && this.f81229i == 0) {
            LinkedHashMap linkedHashMap = this.f81228h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f1) it.next()).close();
            }
            Iterator it2 = this.f81231k.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).f81193c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            l lVar = this.f81221a;
            if (lVar.f81237a.getAndSet(false)) {
                n0.j.c(lVar.f81239c);
                lVar.h();
            }
            this.f81222b.quit();
        }
    }

    public final void f(Runnable runnable, Runnable runnable2) {
        try {
            this.f81223c.execute(new a4(this, runnable2, runnable, 7));
        } catch (RejectedExecutionException e13) {
            m0.Y0("DefaultSurfaceProcessor", "Unable to executor runnable", e13);
            runnable2.run();
        }
    }

    public final void g(Exception exc) {
        ArrayList arrayList = this.f81231k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f81193c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap h(Size size, float[] fArr, int i13) {
        float[] fArr2 = (float[]) fArr.clone();
        gh0.b.m0(fArr2, i13);
        gh0.b.n0(fArr2);
        Size g13 = e0.u.g(i13, size);
        l lVar = this.f81221a;
        lVar.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g13.getHeight() * g13.getWidth() * 4);
        com.bumptech.glide.d.g("ByteBuffer capacity is not equal to width * height * 4.", allocateDirect.capacity() == (g13.getHeight() * g13.getWidth()) * 4);
        com.bumptech.glide.d.g("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = n0.j.f88752a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        n0.j.b("glGenTextures");
        int i14 = iArr2[0];
        GLES20.glActiveTexture(33985);
        n0.j.b("glActiveTexture");
        GLES20.glBindTexture(3553, i14);
        n0.j.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g13.getWidth(), g13.getHeight(), 0, 6407, 5121, null);
        n0.j.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        n0.j.b("glGenFramebuffers");
        int i15 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i15);
        n0.j.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        n0.j.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        n0.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, lVar.f81249m);
        n0.j.b("glBindTexture");
        lVar.f81245i = null;
        GLES20.glViewport(0, 0, g13.getWidth(), g13.getHeight());
        GLES20.glScissor(0, 0, g13.getWidth(), g13.getHeight());
        n0.h hVar = lVar.f81247k;
        hVar.getClass();
        if (hVar instanceof n0.i) {
            GLES20.glUniformMatrix4fv(((n0.i) hVar).f88750f, 1, false, fArr2, 0);
            n0.j.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        n0.j.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g13.getWidth(), g13.getHeight(), 6408, 5121, allocateDirect);
        n0.j.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i14}, 0);
        n0.j.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i15}, 0);
        n0.j.b("glDeleteFramebuffers");
        int i16 = lVar.f81249m;
        GLES20.glActiveTexture(33984);
        n0.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, i16);
        n0.j.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g13.getWidth(), g13.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.e(createBitmap, allocateDirect, g13.getWidth() * 4);
        return createBitmap;
    }

    public final void i(xk2.w wVar) {
        ArrayList arrayList = this.f81231k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (wVar == null) {
            g(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i13 = -1;
                int i14 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    int i15 = aVar.f81192b;
                    if (i13 != i15 || bitmap == null) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = h((Size) wVar.f135235b, (float[]) wVar.f135236c, i15);
                        i14 = -1;
                        i13 = i15;
                    }
                    int i16 = aVar.f81191a;
                    if (i14 != i16) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i16, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        i14 = i16;
                    }
                    Surface surface = (Surface) wVar.f135234a;
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.f(bArr, surface);
                    aVar.f81193c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e13) {
            g(e13);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f81225e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f81226f;
        surfaceTexture.getTransformMatrix(fArr);
        xk2.w wVar = null;
        while (true) {
            xk2.w wVar2 = wVar;
            for (Map.Entry entry : this.f81228h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                t tVar = (t) ((f1) entry.getKey());
                float[] fArr2 = tVar.f81286e;
                float[] fArr3 = this.f81227g;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i13 = tVar.f81284c;
                if (i13 == 34) {
                    try {
                        this.f81221a.j(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException e13) {
                        m0.t("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e13);
                    }
                } else {
                    boolean z13 = true;
                    com.bumptech.glide.d.v("Unsupported format: " + i13, i13 == 256);
                    if (wVar2 != null) {
                        z13 = false;
                    }
                    com.bumptech.glide.d.v("Only one JPEG output is supported.", z13);
                    wVar = new xk2.w(surface, tVar.f81285d, (float[]) fArr3.clone());
                }
            }
            try {
                i(wVar2);
                return;
            } catch (RuntimeException e14) {
                g(e14);
                return;
            }
        }
    }
}
