package an0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f15665a;

    public h(b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f15665a = activeUserManager;
    }

    public final boolean a(v7 v7Var) {
        boolean z13;
        if (v7Var == null) {
            return false;
        }
        wy0 f13 = ((b60.d) this.f15665a).f();
        List I0 = v7Var.I0();
        if (I0 != null) {
            List list = I0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Boolean J3 = ((wy0) it.next()).J3();
                    Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
                    if (J3.booleanValue()) {
                        z13 = false;
                        break;
                    }
                }
            }
        }
        z13 = true;
        if (!w.i0(v7Var)) {
            return false;
        }
        Integer l13 = v7Var.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        if (l13.intValue() < 5) {
            return false;
        }
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        if (!z.i(v7Var.o1(), "public", true) || !z13) {
            return false;
        }
        if (f13 != null && Intrinsics.d(f13.J3(), Boolean.TRUE)) {
            return false;
        }
        wy0 k13 = v7Var.k1();
        return k13 == null || !Intrinsics.d(k13.J3(), Boolean.TRUE);
    }
}
