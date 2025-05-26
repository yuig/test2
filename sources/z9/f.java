package z9;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f141178a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f141179b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f141180c = null;

    public f(int i13) {
        this.f141178a = i13;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f141178a == fVar.f141178a && Intrinsics.d(this.f141179b, fVar.f141179b)) {
            if (Intrinsics.d(this.f141180c, fVar.f141180c)) {
                return true;
            }
            Bundle bundle = this.f141180c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.f141180c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = fVar.f141180c;
                    if (!Intrinsics.d(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f141178a) * 31;
        g0 g0Var = this.f141179b;
        int hashCode2 = hashCode + (g0Var != null ? g0Var.hashCode() : 0);
        Bundle bundle = this.f141180c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i13 = hashCode2 * 31;
                Bundle bundle2 = this.f141180c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i13 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f.class.getSimpleName());
        sb3.append("(0x");
        sb3.append(Integer.toHexString(this.f141178a));
        sb3.append(")");
        if (this.f141179b != null) {
            sb3.append(" navOptions=");
            sb3.append(this.f141179b);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
