package com.modiface.mfemakeupkit;

import android.opengl.EGLContext;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfemakeupkit.data.MFEFacePoints;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    private static final String f34407j = "Surface";

    /* renamed from: k, reason: collision with root package name */
    private static final String f34408k = "MFEMakeupSurface";

    /* renamed from: l, reason: collision with root package name */
    private static AtomicLong f34409l = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final com.modiface.mfemakeupkit.mfea.a f34410a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f34411b;

    /* renamed from: c, reason: collision with root package name */
    private Object f34412c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicInteger f34413d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicInteger f34414e;

    /* renamed from: f, reason: collision with root package name */
    private com.modiface.mfecommon.utils.g f34415f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<e> f34416g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<m0> f34417h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f34418i;

    public interface e {
        MFEDebugInfo getDebugInfoToPopulateOn();

        void onRenderDone(MFEDebugInfo mFEDebugInfo);
    }

    public c() {
        this(false);
    }

    public void finalize() {
        f();
        super.finalize();
    }

    public void h() {
        this.f34415f.c(new l0(this), true);
    }

    public c(boolean z13) {
        this.f34410a = new com.modiface.mfemakeupkit.mfea.a();
        this.f34411b = new AtomicBoolean(false);
        this.f34412c = null;
        this.f34413d = new AtomicInteger(0);
        this.f34414e = new AtomicInteger(0);
        this.f34416g = new WeakReference<>(null);
        this.f34417h = new WeakReference<>(null);
        this.f34418i = false;
        this.f34415f = new com.modiface.mfecommon.utils.n(c(), z13);
    }

    private static String c() {
        return "MFESurfGL" + f34409l.getAndIncrement();
    }

    public void b() {
        a((Object) null, 0, 0);
    }

    public void d() {
        this.f34415f.c(new j0(this));
    }

    public void e() {
        this.f34415f.b((EGLContext) null);
        ArrayList<Throwable> arrayList = new ArrayList<>();
        boolean a13 = this.f34415f.a(this.f34412c, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        a(a13, arrayList);
    }

    public void f() {
        this.f34415f.e(new i0(this));
        this.f34415f.a();
    }

    public void g() {
        m0 m0Var = this.f34417h.get();
        if (m0Var != null) {
            m0Var.requestToRender(this);
        }
    }

    public void a(m0 m0Var) {
        this.f34417h = new WeakReference<>(m0Var);
    }

    public long a(MFEGLFramebuffer mFEGLFramebuffer, MFEGLFramebuffer mFEGLFramebuffer2, MFEFacePoints mFEFacePoints) {
        return a(mFEGLFramebuffer, mFEGLFramebuffer2, null, mFEFacePoints, true, 0L);
    }

    public long a(MFEGLFramebuffer mFEGLFramebuffer, MFEGLFramebuffer mFEGLFramebuffer2, Long l13, MFEFacePoints mFEFacePoints, boolean z13, long j13) {
        AtomicLong atomicLong = new AtomicLong(0L);
        this.f34415f.e(new k0(this, mFEGLFramebuffer, mFEGLFramebuffer2, j13, mFEFacePoints, l13, z13, atomicLong));
        return atomicLong.get();
    }

    public void a(boolean z13) {
        this.f34411b.set(z13);
        g();
    }

    public void a(e eVar) {
        this.f34416g = new WeakReference<>(eVar);
    }

    public void a(Object obj, int i13, int i14) {
        m0 m0Var = this.f34417h.get();
        ArrayList<Throwable> arrayList = new ArrayList<>();
        boolean a13 = this.f34415f.a(obj, arrayList);
        if (!arrayList.isEmpty()) {
            a(a13, arrayList);
        }
        this.f34412c = obj;
        this.f34413d.set(i13);
        this.f34414e.set(i14);
        if (m0Var != null) {
            m0Var.requestToRender(this);
        }
    }

    public void a() {
        a((MFEGLFramebuffer) null, (MFEGLFramebuffer) null, (MFEFacePoints) null);
    }

    public float[] a(int i13, int i14, int i15, int i16) {
        return new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    }

    public float[] a(int i13, int i14, int i15, int i16, MFEFacePoints mFEFacePoints) {
        return new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public void a(boolean z13, ArrayList<Throwable> arrayList) {
        m0 m0Var = this.f34417h.get();
        if (m0Var != null) {
            m0Var.onMFEMakeupSurfaceSetSurfaceError(this, arrayList);
        }
    }

    public void a(Throwable th3) {
        m0 m0Var = this.f34417h.get();
        if (m0Var != null) {
            m0Var.onMFEMakeupSurfaceRenderFrameError(this, th3);
        }
    }
}
