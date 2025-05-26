package eo0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f59729a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59730b;

    public a(f30 f30Var, boolean z13) {
        this.f59729a = f30Var;
        this.f59730b = z13;
    }

    public final boolean equals(Object obj) {
        f30 f30Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f59730b == aVar.f59730b) {
            Set set = b40.f35967a;
            f30 f30Var2 = this.f59729a;
            if (f30Var2 != null && (f30Var = aVar.f59729a) != null) {
                Intrinsics.checkNotNullExpressionValue(f30Var2.getUid(), "getUid(...)");
                if ((!z.j(r3)) && Intrinsics.d(f30Var2.getUid(), f30Var.getUid())) {
                    return true;
                }
                String F3 = f30Var2.F3();
                if (F3 != null && !z.j(F3) && Intrinsics.d(f30Var2.F3(), f30Var.F3())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f59729a.hashCode() * 31) + (this.f59730b ? 1 : 0);
    }
}
