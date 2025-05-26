package androidx.camera.core.impl;

import android.util.Size;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f16901a;

    /* renamed from: b, reason: collision with root package name */
    public final s2 f16902b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16903c;

    public l(t2 t2Var, s2 s2Var, long j13) {
        if (t2Var == null) {
            throw new NullPointerException("Null configType");
        }
        this.f16901a = t2Var;
        if (s2Var == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f16902b = s2Var;
        this.f16903c = j13;
    }

    public static l a(t2 t2Var, s2 s2Var) {
        return new l(t2Var, s2Var, 0L);
    }

    public static t2 b(int i13) {
        return i13 == 35 ? t2.YUV : i13 == 256 ? t2.JPEG : i13 == 4101 ? t2.JPEG_R : i13 == 32 ? t2.RAW : t2.PRIV;
    }

    public static l c(int i13, int i14, Size size, m mVar) {
        t2 b13 = b(i14);
        s2 s2Var = s2.NOT_SUPPORT;
        int a13 = k0.c.a(size);
        if (i13 == 1) {
            if (a13 <= k0.c.a((Size) mVar.f16908b.get(Integer.valueOf(i14)))) {
                s2Var = s2.s720p;
            } else {
                if (a13 <= k0.c.a((Size) mVar.f16910d.get(Integer.valueOf(i14)))) {
                    s2Var = s2.s1440p;
                }
            }
        } else if (a13 <= k0.c.a(mVar.f16907a)) {
            s2Var = s2.VGA;
        } else if (a13 <= k0.c.a(mVar.f16909c)) {
            s2Var = s2.PREVIEW;
        } else if (a13 <= k0.c.a(mVar.f16911e)) {
            s2Var = s2.RECORD;
        } else {
            if (a13 <= k0.c.a((Size) mVar.f16912f.get(Integer.valueOf(i14)))) {
                s2Var = s2.MAXIMUM;
            } else {
                Size size2 = (Size) mVar.f16913g.get(Integer.valueOf(i14));
                if (size2 != null) {
                    if (a13 <= size2.getHeight() * size2.getWidth()) {
                        s2Var = s2.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return a(b13, s2Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f16901a.equals(lVar.f16901a) && this.f16902b.equals(lVar.f16902b) && this.f16903c == lVar.f16903c;
    }

    public final int hashCode() {
        int hashCode = (((this.f16901a.hashCode() ^ 1000003) * 1000003) ^ this.f16902b.hashCode()) * 1000003;
        long j13 = this.f16903c;
        return hashCode ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurfaceConfig{configType=");
        sb3.append(this.f16901a);
        sb3.append(", configSize=");
        sb3.append(this.f16902b);
        sb3.append(", streamUseCase=");
        return a.a.o(sb3, this.f16903c, "}");
    }
}
