package mc2;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import e0.t;
import et1.r0;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import oe2.x;
import wo2.m;
import wo2.v;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f86944a;

    /* renamed from: b, reason: collision with root package name */
    public Object f86945b;

    public /* synthetic */ k(Object obj, v vVar) {
        this.f86944a = obj;
        this.f86945b = vVar;
    }

    public static k b(String... strArr) {
        try {
            m[] mVarArr = new m[strArr.length];
            wo2.j jVar = new wo2.j();
            for (int i13 = 0; i13 < strArr.length; i13++) {
                x.z(jVar, strArr[i13]);
                jVar.readByte();
                mVarArr[i13] = jVar.a1(jVar.f130711b);
            }
            String[] strArr2 = (String[]) strArr.clone();
            int i14 = v.f130737d;
            return new k(strArr2, ln2.k.j(mVarArr));
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public final void a(g01.a surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        t.n(new r0(22, surface, this), "eglMakeCurrent");
    }

    public final void c(ri2.e eVar, String str) {
        String str2;
        if (eVar == null || (str2 = eVar.f108404b) == null || str2.isEmpty() || str == null) {
            return;
        }
        ((qi2.b) this.f86944a).b(eVar, str);
    }

    public final void d() {
        t.n(new nd2.a(this, 2), "eglDestroyContext");
    }

    public k(Thread targetThread) {
        Intrinsics.checkNotNullParameter(targetThread, "targetThread");
        this.f86944a = targetThread;
        this.f86945b = new HashMap();
    }

    public k(int i13) {
        xd2.a config = new xd2.a();
        Intrinsics.checkNotNullParameter(config, "config");
        this.f86944a = config;
        EGLContext eglCreateContext = EGL14.eglCreateContext(xd2.b.f134641a, xd2.b.a(config), EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (!Intrinsics.d(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            Intrinsics.f(eglCreateContext);
            this.f86945b = eglCreateContext;
            return;
        }
        throw new IllegalStateException("eglCreateContext failed".toString());
    }

    public k() {
        this.f86944a = new qi2.b();
    }
}
