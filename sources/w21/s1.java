package w21;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f127807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127808b;

    /* renamed from: c, reason: collision with root package name */
    public final String f127809c;

    public s1(String experienceId, String errorMsg, String experienceNotExistentErrorMsg) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(experienceNotExistentErrorMsg, "experienceNotExistentErrorMsg");
        this.f127807a = experienceId;
        this.f127808b = errorMsg;
        this.f127809c = experienceNotExistentErrorMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.d(this.f127807a, s1Var.f127807a) && Intrinsics.d(this.f127808b, s1Var.f127808b) && Intrinsics.d(this.f127809c, s1Var.f127809c);
    }

    public final int hashCode() {
        return this.f127809c.hashCode() + cb.d(this.f127808b, this.f127807a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RemoteFetch(experienceId=");
        sb3.append(this.f127807a);
        sb3.append(", errorMsg=");
        sb3.append(this.f127808b);
        sb3.append(", experienceNotExistentErrorMsg=");
        return a.a.p(sb3, this.f127809c, ")");
    }
}
