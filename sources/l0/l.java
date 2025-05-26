package l0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import c0.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.m0;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public Thread f81239c;

    /* renamed from: g, reason: collision with root package name */
    public EGLConfig f81243g;

    /* renamed from: i, reason: collision with root package name */
    public Surface f81245i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f81237a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f81238b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public EGLDisplay f81240d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f81241e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    public int[] f81242f = n0.j.f88752a;

    /* renamed from: h, reason: collision with root package name */
    public EGLSurface f81244h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j, reason: collision with root package name */
    public Map f81246j = Collections.emptyMap();

    /* renamed from: k, reason: collision with root package name */
    public n0.h f81247k = null;

    /* renamed from: l, reason: collision with root package name */
    public n0.g f81248l = n0.g.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    public int f81249m = -1;

    public final void a(z zVar, n0.a aVar) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f81240d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f81240d, iArr, 0, iArr, 1)) {
            this.f81240d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            aVar.f88726b = str;
        }
        int i13 = zVar.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f81240d, new int[]{12324, i13, 12323, i13, 12322, i13, 12321, zVar.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, zVar.a() ? 64 : 4, 12610, zVar.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr2 = new int[3];
        iArr2[0] = 12440;
        iArr2[1] = zVar.a() ? 3 : 2;
        iArr2[2] = 12344;
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f81240d, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr2, 0);
        n0.j.a("eglCreateContext");
        this.f81243g = eGLConfig;
        this.f81241e = eglCreateContext;
        int[] iArr3 = new int[1];
        EGL14.eglQueryContext(this.f81240d, eglCreateContext, 12440, iArr3, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr3[0]);
    }

    public final n0.d b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f81240d;
            EGLConfig eGLConfig = this.f81243g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface i13 = n0.j.i(eGLDisplay, eGLConfig, surface, this.f81242f);
            EGLDisplay eGLDisplay2 = this.f81240d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, i13, 12375, iArr, 0);
            int i14 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, i13, 12374, iArr2, 0);
            Size size = new Size(i14, iArr2[0]);
            return new n0.d(i13, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e13) {
            m0.Y0("OpenGlRenderer", "Failed to create EGL surface: " + e13.getMessage(), e13);
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f81240d;
        EGLConfig eGLConfig = this.f81243g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = n0.j.f88752a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        n0.j.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f81244h = eglCreatePbufferSurface;
    }

    public final p5.b d(z zVar) {
        n0.j.d(this.f81237a, false);
        try {
            a(zVar, null);
            c();
            f(this.f81244h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f81240d, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new p5.b(glGetString, eglQueryString);
        } catch (IllegalStateException e13) {
            m0.Y0("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e13.getMessage(), e13);
            return new p5.b("", "");
        } finally {
            h();
        }
    }

    public n0.b e(z zVar, Map map) {
        AtomicBoolean atomicBoolean = this.f81237a;
        n0.j.d(atomicBoolean, false);
        n0.a aVar = new n0.a();
        aVar.f88725a = "0.0";
        aVar.f88726b = "0.0";
        aVar.f88727c = "";
        aVar.f88728d = "";
        try {
            if (zVar.a()) {
                p5.b d2 = d(zVar);
                String str = (String) d2.f98855a;
                str.getClass();
                String str2 = (String) d2.f98856b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    m0.X0("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    zVar = z.f24401d;
                }
                this.f81242f = n0.j.f(str2, zVar);
                aVar.f88727c = str;
                aVar.f88728d = str2;
            }
            a(zVar, aVar);
            c();
            f(this.f81244h);
            String j13 = n0.j.j();
            if (j13 == null) {
                throw new NullPointerException("Null glVersion");
            }
            aVar.f88725a = j13;
            this.f81246j = n0.j.g(zVar, map);
            int h10 = n0.j.h();
            this.f81249m = h10;
            k(h10);
            this.f81239c = Thread.currentThread();
            atomicBoolean.set(true);
            String str3 = aVar.f88725a == null ? " glVersion" : "";
            if (aVar.f88726b == null) {
                str3 = str3.concat(" eglVersion");
            }
            if (aVar.f88727c == null) {
                str3 = a.a.C(str3, " glExtensions");
            }
            if (aVar.f88728d == null) {
                str3 = a.a.C(str3, " eglExtensions");
            }
            if (str3.isEmpty()) {
                return new n0.b(aVar.f88725a, aVar.f88726b, aVar.f88727c, aVar.f88728d);
            }
            throw new IllegalStateException("Missing required properties:".concat(str3));
        } catch (IllegalArgumentException e13) {
            e = e13;
            h();
            throw e;
        } catch (IllegalStateException e14) {
            e = e14;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.f81240d.getClass();
        this.f81241e.getClass();
        if (!EGL14.eglMakeCurrent(this.f81240d, eGLSurface, eGLSurface, this.f81241e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void g(Surface surface) {
        n0.j.d(this.f81237a, true);
        n0.j.c(this.f81239c);
        HashMap hashMap = this.f81238b;
        if (hashMap.containsKey(surface)) {
            return;
        }
        hashMap.put(surface, n0.j.f88761j);
    }

    public final void h() {
        Iterator it = this.f81246j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((n0.h) it.next()).f88745a);
        }
        this.f81246j = Collections.emptyMap();
        this.f81247k = null;
        if (!Objects.equals(this.f81240d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f81240d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = this.f81238b;
            for (n0.d dVar : hashMap.values()) {
                if (!Objects.equals(dVar.f88741a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f81240d, dVar.f88741a)) {
                    try {
                        n0.j.a("eglDestroySurface");
                    } catch (IllegalStateException e13) {
                        m0.t("GLUtils", e13.toString(), e13);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals(this.f81244h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f81240d, this.f81244h);
                this.f81244h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f81241e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f81240d, this.f81241e);
                this.f81241e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f81240d);
            this.f81240d = EGL14.EGL_NO_DISPLAY;
        }
        this.f81243g = null;
        this.f81249m = -1;
        this.f81248l = n0.g.UNKNOWN;
        this.f81245i = null;
        this.f81239c = null;
    }

    public final void i(Surface surface, boolean z13) {
        if (this.f81245i == surface) {
            this.f81245i = null;
            f(this.f81244h);
        }
        HashMap hashMap = this.f81238b;
        n0.d dVar = z13 ? (n0.d) hashMap.remove(surface) : (n0.d) hashMap.put(surface, n0.j.f88761j);
        if (dVar == null || dVar == n0.j.f88761j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f81240d, dVar.f88741a);
        } catch (RuntimeException e13) {
            m0.Y0("OpenGlRenderer", "Failed to destroy EGL surface: " + e13.getMessage(), e13);
        }
    }

    public final void j(long j13, float[] fArr, Surface surface) {
        n0.j.d(this.f81237a, true);
        n0.j.c(this.f81239c);
        HashMap hashMap = this.f81238b;
        com.bumptech.glide.d.v("The surface is not registered.", hashMap.containsKey(surface));
        n0.d dVar = (n0.d) hashMap.get(surface);
        Objects.requireNonNull(dVar);
        if (dVar == n0.j.f88761j) {
            dVar = b(surface);
            if (dVar == null) {
                return;
            } else {
                hashMap.put(surface, dVar);
            }
        }
        Surface surface2 = this.f81245i;
        EGLSurface eGLSurface = dVar.f88741a;
        if (surface != surface2) {
            f(eGLSurface);
            this.f81245i = surface;
            int i13 = dVar.f88742b;
            int i14 = dVar.f88743c;
            GLES20.glViewport(0, 0, i13, i14);
            GLES20.glScissor(0, 0, i13, i14);
        }
        n0.h hVar = this.f81247k;
        hVar.getClass();
        if (hVar instanceof n0.i) {
            GLES20.glUniformMatrix4fv(((n0.i) hVar).f88750f, 1, false, fArr, 0);
            n0.j.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        n0.j.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f81240d, eGLSurface, j13);
        if (EGL14.eglSwapBuffers(this.f81240d, eGLSurface)) {
            return;
        }
        m0.X0("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void k(int i13) {
        n0.h hVar = (n0.h) this.f81246j.get(this.f81248l);
        if (hVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f81248l);
        }
        if (this.f81247k != hVar) {
            this.f81247k = hVar;
            hVar.b();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f81248l + ": " + this.f81247k);
        }
        GLES20.glActiveTexture(33984);
        n0.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, i13);
        n0.j.b("glBindTexture");
    }
}
