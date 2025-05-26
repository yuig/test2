package qg1;

import android.content.Context;
import com.pinterest.api.model.qk0;
import com.pinterest.api.model.rk0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer[] f103827a = {Integer.valueOf(pq1.f.idea_pin_diy_difficulty_easy), Integer.valueOf(pq1.f.idea_pin_diy_difficulty_medium), Integer.valueOf(pq1.f.idea_pin_diy_difficulty_hard)};

    public static final String a(int i13, Context context, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(context, "context");
        if (i13 == rk0.COOK_TIME.getCategory()) {
            return b(Integer.parseInt(value), context, true);
        }
        if (i13 != rk0.DIFFICULTY.getCategory()) {
            return value;
        }
        Integer intOrNull = StringsKt.toIntOrNull(value);
        int intValue = (intOrNull != null ? intOrNull.intValue() : 0) - 1;
        String string = (intValue < 0 || intValue >= 3) ? "" : context.getString(f103827a[intValue].intValue());
        Intrinsics.f(string);
        return string;
    }

    public static final String b(int i13, Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = i13 / 60;
        int i15 = i13 % 60;
        ArrayList arrayList = new ArrayList();
        if (i14 > 0) {
            arrayList.add(context.getString(z13 ? pq1.f.compact_hour_with_space : pq1.f.compact_hour_without_space, String.valueOf(i14)));
        }
        if (i15 > 0) {
            arrayList.add(context.getString(z13 ? pq1.f.compact_minute_with_space : pq1.f.compact_minute_without_space, String.valueOf(i15)));
        }
        return CollectionsKt.Z(arrayList, " ", null, null, 0, null, null, 62);
    }

    public static final boolean c(qk0 qk0Var) {
        List c13;
        List d2;
        return (qk0Var == null || (((c13 = qk0Var.c()) == null || c13.isEmpty()) && ((d2 = qk0Var.d()) == null || d2.isEmpty()))) ? false : true;
    }
}
