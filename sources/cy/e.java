package cy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f53396a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f53397b;

    static {
        h[] values = h.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (h hVar : values) {
            arrayList.add(hVar.getExt());
        }
        HashSet D0 = CollectionsKt.D0(arrayList);
        f53396a = D0;
        ArrayList arrayList2 = new ArrayList(g0.q(D0, 10));
        Iterator it = D0.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((String) it.next()).length()));
        }
        Integer num = (Integer) CollectionsKt.e0(arrayList2);
        f53397b = num != null ? num.intValue() : 0;
    }

    public static final HashSet a() {
        return f53396a;
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = (str.length() - f53397b) - 1;
        if (length < 0) {
            length = 0;
        }
        String substring = str.substring(length);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return (String) CollectionsKt.d0(StringsKt.V(substring, new char[]{'.'}));
    }

    public static final String c(HttpUrl httpUrl) {
        String obj;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        String str = (String) CollectionsKt.d0(httpUrl.f95636f);
        if (str == null || (obj = StringsKt.j0(str).toString()) == null) {
            return null;
        }
        int length = (obj.length() - f53397b) - 1;
        if (length < 0) {
            length = 0;
        }
        String substring = obj.substring(length);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return (String) CollectionsKt.d0(StringsKt.V(substring, new char[]{'.'}));
    }

    public static final long d(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Iterator it = map.entrySet().iterator();
        long j13 = 0;
        while (it.hasNext()) {
            j13 += ((String) r2.getKey()).length();
            while (((Iterable) ((Map.Entry) it.next()).getValue()).iterator().hasNext()) {
                j13 += ((String) r2.next()).length();
            }
        }
        return j13;
    }
}
