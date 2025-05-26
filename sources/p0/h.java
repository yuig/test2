package p0;

import androidx.camera.core.impl.t;
import androidx.camera.core.impl.u2;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.z;

/* loaded from: classes2.dex */
public final class h implements z {

    /* renamed from: a, reason: collision with root package name */
    public final z f98340a;

    /* renamed from: b, reason: collision with root package name */
    public final u2 f98341b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98342c;

    public h(z zVar, u2 u2Var, long j13) {
        this.f98340a = zVar;
        this.f98341b = u2Var;
        this.f98342c = j13;
    }

    @Override // androidx.camera.core.impl.z
    public final t C() {
        z zVar = this.f98340a;
        return zVar != null ? zVar.C() : t.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    public final u2 f() {
        return this.f98341b;
    }

    @Override // androidx.camera.core.impl.z
    public final long h() {
        z zVar = this.f98340a;
        if (zVar != null) {
            return zVar.h();
        }
        long j13 = this.f98342c;
        if (j13 != -1) {
            return j13;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.z
    public final y p() {
        z zVar = this.f98340a;
        return zVar != null ? zVar.p() : y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    public final v t() {
        z zVar = this.f98340a;
        return zVar != null ? zVar.t() : v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    public final x y() {
        z zVar = this.f98340a;
        return zVar != null ? zVar.y() : x.UNKNOWN;
    }
}
