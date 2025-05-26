package n10;

import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f88916a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f88917b;

    static {
        new LinkedHashMap();
        f88916a = new LinkedHashMap();
        f88917b = new LinkedHashMap();
    }

    public static final z2 a(z2 z2Var, boolean z13) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        y2 c03 = z2Var.c0();
        Integer num = c03.f43895r;
        v32.c cVar = v32.c.LIKE;
        int i13 = 0;
        boolean z14 = num != null && num.intValue() == cVar.getValue();
        if (z14 && !z13) {
            i13 = -1;
        }
        if (!z14 && z13) {
            i13++;
        }
        c03.f43895r = Integer.valueOf(z13 ? cVar.getValue() : v32.c.NONE.getValue());
        boolean[] zArr = c03.f43903z;
        if (zArr.length > 17) {
            zArr[17] = true;
        }
        Map map = c03.f43896s;
        LinkedHashMap r13 = map != null ? z0.r(map) : new LinkedHashMap();
        r13.put(String.valueOf(cVar.getValue()), Integer.valueOf(c(z2Var) + i13));
        c03.f43896s = r13;
        boolean[] zArr2 = c03.f43903z;
        if (zArr2.length > 18) {
            zArr2[18] = true;
        }
        z2 a13 = c03.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final z2 b(z2 z2Var, boolean z13) {
        int i13;
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        y2 c03 = z2Var.c0();
        Boolean bool = c03.f43890m;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            i13 = (!booleanValue || z13) ? 0 : -1;
            if (!booleanValue && z13) {
                i13++;
            }
        } else {
            i13 = 0;
        }
        c03.f43890m = Boolean.valueOf(z13);
        boolean[] zArr = c03.f43903z;
        if (zArr.length > 12) {
            zArr[12] = true;
        }
        Integer num = c03.f43885h;
        if (num == null) {
            num = 0;
        }
        c03.f43885h = Integer.valueOf(num.intValue() + i13);
        boolean[] zArr2 = c03.f43903z;
        if (zArr2.length > 7) {
            zArr2[7] = true;
        }
        z2 a13 = c03.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final int c(z2 z2Var) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        Map W = z2Var.W();
        Double d2 = y.d(String.valueOf(W != null ? W.get(String.valueOf(v32.c.LIKE.getValue())) : null));
        if (d2 != null) {
            return ml2.c.b(d2.doubleValue());
        }
        return 0;
    }

    public static final boolean d(z2 z2Var) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        return z2Var.V().intValue() == v32.c.LIKE.ordinal();
    }

    public static final String e(z2 z2Var) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        return (String) f88916a.get(z2Var.getId());
    }

    public static final void f(z2 z2Var, String str) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        LinkedHashMap linkedHashMap = f88917b;
        String id3 = z2Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        linkedHashMap.put(id3, str);
    }

    public static final void g(z2 z2Var, String str) {
        Intrinsics.checkNotNullParameter(z2Var, "<this>");
        LinkedHashMap linkedHashMap = f88916a;
        String id3 = z2Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        linkedHashMap.put(id3, str);
    }
}
