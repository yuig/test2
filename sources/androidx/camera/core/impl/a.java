package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l f16791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16792b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f16793c;

    /* renamed from: d, reason: collision with root package name */
    public final c0.z f16794d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16795e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f16796f;

    /* renamed from: g, reason: collision with root package name */
    public final Range f16797g;

    public a(l lVar, int i13, Size size, c0.z zVar, List list, v0 v0Var, Range range) {
        if (lVar == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f16791a = lVar;
        this.f16792b = i13;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f16793c = size;
        if (zVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f16794d = zVar;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f16795e = list;
        this.f16796f = v0Var;
        this.f16797g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16791a.equals(aVar.f16791a) && this.f16792b == aVar.f16792b && this.f16793c.equals(aVar.f16793c) && this.f16794d.equals(aVar.f16794d) && this.f16795e.equals(aVar.f16795e)) {
            v0 v0Var = aVar.f16796f;
            v0 v0Var2 = this.f16796f;
            if (v0Var2 != null ? v0Var2.equals(v0Var) : v0Var == null) {
                Range range = aVar.f16797g;
                Range range2 = this.f16797g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f16791a.hashCode() ^ 1000003) * 1000003) ^ this.f16792b) * 1000003) ^ this.f16793c.hashCode()) * 1000003) ^ this.f16794d.hashCode()) * 1000003) ^ this.f16795e.hashCode()) * 1000003;
        v0 v0Var = this.f16796f;
        int hashCode2 = (hashCode ^ (v0Var == null ? 0 : v0Var.hashCode())) * 1000003;
        Range range = this.f16797g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f16791a + ", imageFormat=" + this.f16792b + ", size=" + this.f16793c + ", dynamicRange=" + this.f16794d + ", captureTypes=" + this.f16795e + ", implementationOptions=" + this.f16796f + ", targetFrameRate=" + this.f16797g + "}";
    }
}
