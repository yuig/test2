package h;

import a8.q;
import android.content.Intent;
import androidx.activity.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends a {
    @Override // h.a
    public final Intent a(o context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // h.a
    public final q b(o context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new q(z0.d());
        }
        for (String str : input) {
            if (d5.a.a(context, str) != 0) {
                return null;
            }
        }
        int a13 = y0.a(input.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new q(linkedHashMap);
    }

    @Override // h.a
    public final Object c(Intent intent, int i13) {
        if (i13 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return z0.d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i14 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i14 == 0));
            }
            return z0.m(CollectionsKt.N0(c0.A(stringArrayExtra), arrayList));
        }
        return z0.d();
    }
}
