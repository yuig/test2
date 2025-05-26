package n0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import c0.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh2.m0;
import l0.m;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a */
    public static final int[] f88752a = {12344};

    /* renamed from: b */
    public static final int[] f88753b = {12445, 13632, 12344};

    /* renamed from: c */
    public static final String f88754c;

    /* renamed from: d */
    public static final String f88755d;

    /* renamed from: e */
    public static final e f88756e;

    /* renamed from: f */
    public static final e f88757f;

    /* renamed from: g */
    public static final e f88758g;

    /* renamed from: h */
    public static final FloatBuffer f88759h;

    /* renamed from: i */
    public static final FloatBuffer f88760i;

    /* renamed from: j */
    public static final d f88761j;

    static {
        Locale locale = Locale.US;
        f88754c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f88755d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f88756e = new e(0);
        f88757f = new e(1);
        f88758g = new e(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f88759h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        f88760i = asFloatBuffer2;
        f88761j = new d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder D = ep.b.D(str, ": EGL error: 0x");
        D.append(Integer.toHexString(eglGetError));
        throw new IllegalStateException(D.toString());
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder D = ep.b.D(str, ": GL error 0x");
        D.append(Integer.toHexString(glGetError));
        throw new IllegalStateException(D.toString());
    }

    public static void c(Thread thread) {
        com.bumptech.glide.d.v("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z13) {
        com.bumptech.glide.d.v(z13 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z13 == atomicBoolean.get());
    }

    public static void e(int i13, String str) {
        if (i13 < 0) {
            throw new IllegalStateException(a.a.k("Unable to locate '", str, "' in program"));
        }
    }

    public static int[] f(String str, z zVar) {
        int[] iArr = f88752a;
        if (zVar.f24407a != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f88753b;
        }
        m0.X0("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static HashMap g(z zVar, Map map) {
        Object iVar;
        g gVar;
        HashMap hashMap = new HashMap();
        g[] values = g.values();
        int length = values.length;
        for (int i13 = 0; i13 < length; i13++) {
            g gVar2 = values[i13];
            m mVar = (m) map.get(gVar2);
            if (mVar != null) {
                iVar = new i(zVar, mVar);
            } else if (gVar2 == g.YUV || gVar2 == (gVar = g.DEFAULT)) {
                iVar = new i(zVar, gVar2);
            } else {
                com.bumptech.glide.d.v("Unhandled input format: " + gVar2, gVar2 == g.UNKNOWN);
                if (zVar.a()) {
                    iVar = new f("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    m mVar2 = (m) map.get(gVar);
                    iVar = mVar2 != null ? new i(zVar, mVar2) : new i(zVar, gVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + gVar2 + " created: " + iVar);
            hashMap.put(gVar2, iVar);
        }
        return hashMap;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i13 = iArr[0];
        GLES20.glBindTexture(36197, i13);
        b("glBindTexture " + i13);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i13;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return a.a.D(group, ".", group2);
    }

    public static int k(int i13, String str) {
        int glCreateShader = GLES20.glCreateShader(i13);
        b("glCreateShader type=" + i13);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        m0.X0("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder s13 = a.a.s("Could not compile shader type ", i13, ":");
        s13.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(s13.toString());
    }
}
