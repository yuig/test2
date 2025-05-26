package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class t extends r {
    public static String b(String str) {
        int i13;
        String y13;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        List O = StringsKt.O(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : O) {
            if (!z.j((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                if (!CharsKt.c(str2.charAt(i13))) {
                    break;
                }
                i13++;
            }
            if (i13 == -1) {
                i13 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i13));
        }
        Integer num = (Integer) CollectionsKt.g0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        O.size();
        s sVar = s.f80506i;
        int i14 = kotlin.collections.f0.i(O);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : O) {
            int i15 = i13 + 1;
            String str3 = null;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            String str4 = (String) obj2;
            if (((i13 != 0 && i13 != i14) || !z.j(str4)) && ((y13 = e0.y(intValue, str4)) == null || (str3 = (String) sVar.invoke(y13)) == null)) {
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i13 = i15;
        }
        StringBuilder sb3 = new StringBuilder(length2);
        CollectionsKt___CollectionsKt.H(arrayList3, sb3, "\n", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : null);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (!(!z.j("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List O = StringsKt.O(str);
        int length = str.length();
        O.size();
        s sVar = s.f80506i;
        int i13 = kotlin.collections.f0.i(O);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : O) {
            int i15 = i14 + 1;
            String str2 = null;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            String str3 = (String) obj;
            if ((i14 != 0 && i14 != i13) || !z.j(str3)) {
                int length2 = str3.length();
                int i16 = 0;
                while (true) {
                    if (i16 >= length2) {
                        i16 = -1;
                        break;
                    }
                    if (!CharsKt.c(str3.charAt(i16))) {
                        break;
                    }
                    i16++;
                }
                if (i16 != -1 && z.o(str3, i16, "|", false)) {
                    str2 = str3.substring("|".length() + i16);
                    Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                }
                if (str2 == null || (str2 = (String) sVar.invoke(str2)) == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i14 = i15;
        }
        StringBuilder sb3 = new StringBuilder(length);
        CollectionsKt___CollectionsKt.H(arrayList, sb3, "\n", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : null);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
