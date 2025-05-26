package r0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f105586d = new k(0, m0.INACTIVE, null);

    /* renamed from: e, reason: collision with root package name */
    public static final Set f105587e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.camera.core.impl.w0 f105588f = new androidx.camera.core.impl.w0(new k(0, m0.ACTIVE, null));

    /* renamed from: a, reason: collision with root package name */
    public final int f105589a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f105590b;

    /* renamed from: c, reason: collision with root package name */
    public final c0.k f105591c;

    public k(int i13, m0 m0Var, c0.k kVar) {
        this.f105589a = i13;
        if (m0Var == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f105590b = m0Var;
        this.f105591c = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f105589a == kVar.f105589a && this.f105590b.equals(kVar.f105590b)) {
            c0.k kVar2 = kVar.f105591c;
            c0.k kVar3 = this.f105591c;
            if (kVar3 == null) {
                if (kVar2 == null) {
                    return true;
                }
            } else if (kVar3.equals(kVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f105589a ^ 1000003) * 1000003) ^ this.f105590b.hashCode()) * 1000003;
        c0.k kVar = this.f105591c;
        return hashCode ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "StreamInfo{id=" + this.f105589a + ", streamState=" + this.f105590b + ", inProgressTransformationInfo=" + this.f105591c + "}";
    }
}
