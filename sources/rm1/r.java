package rm1;

import android.content.res.TypedArray;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f108717a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f108718b;

    static {
        q[] values = q.values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (q qVar : values) {
            linkedHashMap.put(qVar.name(), qVar);
        }
        f108717a = linkedHashMap;
        n[] values2 = n.values();
        int a14 = y0.a(values2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a14 >= 16 ? a14 : 16);
        for (n nVar : values2) {
            linkedHashMap2.put(nVar.name(), nVar);
        }
        f108718b = linkedHashMap2;
    }

    public static final q a(TypedArray typedArray, int i13, q defaultIconStandard) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultIconStandard, "defaultIconStandard");
        q d2 = d(typedArray.getString(i13));
        return d2 == null ? defaultIconStandard : d2;
    }

    public static final q b(TypedArray typedArray, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        return d(typedArray.getString(i13));
    }

    public static final n c(String str) {
        String str2;
        LinkedHashMap linkedHashMap = f108718b;
        if (str != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            str2 = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(str2, "toUpperCase(...)");
        } else {
            str2 = null;
        }
        return (n) linkedHashMap.get(str2);
    }

    public static final q d(String str) {
        String str2;
        LinkedHashMap linkedHashMap = f108717a;
        if (str != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            str2 = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(str2, "toUpperCase(...)");
        } else {
            str2 = null;
        }
        return (q) linkedHashMap.get(str2);
    }
}
