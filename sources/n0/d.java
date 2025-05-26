package n0;

import android.opengl.EGLSurface;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final EGLSurface f88741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88743c;

    public d(EGLSurface eGLSurface, int i13, int i14) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f88741a = eGLSurface;
        this.f88742b = i13;
        this.f88743c = i14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f88741a.equals(dVar.f88741a) && this.f88742b == dVar.f88742b && this.f88743c == dVar.f88743c;
    }

    public final int hashCode() {
        return ((((this.f88741a.hashCode() ^ 1000003) * 1000003) ^ this.f88742b) * 1000003) ^ this.f88743c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OutputSurface{eglSurface=");
        sb3.append(this.f88741a);
        sb3.append(", width=");
        sb3.append(this.f88742b);
        sb3.append(", height=");
        return a.a.n(sb3, this.f88743c, "}");
    }
}
