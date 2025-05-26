package im2;

import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f72687a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f72688b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f72689c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f72690d;

    public b0(j0 globalLevel, j0 j0Var) {
        kotlin.collections.r0 userDefinedLevelForSpecificAnnotation = z0.d();
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f72687a = globalLevel;
        this.f72688b = j0Var;
        this.f72689c = userDefinedLevelForSpecificAnnotation;
        xk2.m.b(new tu1.u(this, 21));
        j0 j0Var2 = j0.IGNORE;
        this.f72690d = globalLevel == j0Var2 && j0Var == j0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f72687a == b0Var.f72687a && this.f72688b == b0Var.f72688b && Intrinsics.d(this.f72689c, b0Var.f72689c);
    }

    public final int hashCode() {
        int hashCode = this.f72687a.hashCode() * 31;
        j0 j0Var = this.f72688b;
        return this.f72689c.hashCode() + ((hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f72687a + ", migrationLevel=" + this.f72688b + ", userDefinedLevelForSpecificAnnotation=" + this.f72689c + ')';
    }
}
