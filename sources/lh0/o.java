package lh0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class o extends o5.g {
    public final ArrayList k(z3 activate, String experimentName, int... defaultValues) {
        int i13 = 0;
        Intrinsics.checkNotNullParameter(activate, "activate");
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(defaultValues, "defaultValues");
        String groupName = ((g1) ((z0) this.f92902b)).g(experimentName, activate);
        if (groupName == null) {
            Intrinsics.checkNotNullParameter(defaultValues, "<this>");
            int length = defaultValues.length;
            Integer[] numArr = new Integer[length];
            int length2 = defaultValues.length;
            while (i13 < length2) {
                numArr[i13] = Integer.valueOf(defaultValues[i13]);
                i13++;
            }
            return kotlin.collections.f0.d(Arrays.copyOf(numArr, length));
        }
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        List V = StringsKt.V(groupName, new char[]{'_'});
        ArrayList arrayList = null;
        if (V.size() > 1) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = V.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                } catch (NumberFormatException unused) {
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.checkNotNullParameter(defaultValues, "<this>");
        int length3 = defaultValues.length;
        Integer[] numArr2 = new Integer[length3];
        int length4 = defaultValues.length;
        while (i13 < length4) {
            numArr2[i13] = Integer.valueOf(defaultValues[i13]);
            i13++;
        }
        return kotlin.collections.f0.d(Arrays.copyOf(numArr2, length3));
    }
}
