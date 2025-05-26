package n10;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.zy0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f88919a = f0.j("1080x", "200x");

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f88920b;

    static {
        new LinkedHashMap();
        new LinkedHashMap();
        f88920b = new LinkedHashMap();
    }

    public static final az0 a(az0 az0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        v32.c reaction = z13 ? v32.c.LIKE : v32.c.NONE;
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        zy0 V = az0Var.V();
        Integer num = V.f44524p;
        if (num == null) {
            num = Integer.valueOf(v32.c.NONE.getValue());
        }
        int intValue = num.intValue();
        Map map = V.f44525q;
        LinkedHashMap r13 = map != null ? z0.r(map) : new LinkedHashMap();
        V.f44524p = Integer.valueOf(reaction.getValue());
        boolean[] zArr = V.f44532x;
        if (zArr.length > 15) {
            zArr[15] = true;
        }
        v32.c cVar = v32.c.NONE;
        if (intValue != cVar.getValue()) {
            r13.put(String.valueOf(intValue), Integer.valueOf(Math.max(d(az0Var, intValue) - 1, 0)));
        }
        if (reaction != cVar) {
            r13.put(String.valueOf(reaction.getValue()), Integer.valueOf(d(az0Var, reaction.getValue()) + 1));
        }
        V.f44525q = r13;
        boolean[] zArr2 = V.f44532x;
        if (zArr2.length > 16) {
            zArr2[16] = true;
        }
        az0 a13 = V.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final az0 b(az0 az0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        zy0 V = az0Var.V();
        Boolean bool = V.f44520l;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        int i13 = (!booleanValue || z13) ? 0 : -1;
        if (!booleanValue && z13) {
            i13++;
        }
        V.f44520l = Boolean.valueOf(z13);
        boolean[] zArr = V.f44532x;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
        Integer num = V.f44516h;
        if (num == null) {
            num = 0;
        }
        V.f44516h = Integer.valueOf(num.intValue() + i13);
        boolean[] zArr2 = V.f44532x;
        if (zArr2.length > 7) {
            zArr2[7] = true;
        }
        az0 a13 = V.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final String c(az0 az0Var, String resolution) {
        Map map;
        sr srVar;
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        List M = az0Var.M();
        String j13 = (M == null || (map = (Map) CollectionsKt.firstOrNull(M)) == null || (srVar = (sr) map.get(resolution)) == null) ? null : srVar.j();
        return j13 == null ? "" : j13;
    }

    public static final int d(az0 az0Var, int i13) {
        Intrinsics.checkNotNullParameter(az0Var, "<this>");
        Map Q = az0Var.Q();
        Double d2 = y.d(String.valueOf(Q != null ? Q.get(String.valueOf(i13)) : null));
        if (d2 != null) {
            return ml2.c.b(d2.doubleValue());
        }
        return 0;
    }
}
