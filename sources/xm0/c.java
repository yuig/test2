package xm0;

import d70.f;
import d70.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.f0;
import u50.g0;
import u50.i0;
import u50.j0;
import u50.k0;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f135354a = new d(g0.b(new String[0], g.pin_organize_header), g0.b(new String[0], x0.select_or_reorder), g0.b(new String[0], g.select_pins_select_all));

    public static final i0 a(int i13) {
        if (i13 > 0) {
            int i14 = f.pins_selection_quantity;
            List formatArgs = e0.b(String.valueOf(i13));
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            return new j0(i14, i13, formatArgs);
        }
        int i15 = x0.select_or_reorder;
        String[] formatArgs2 = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs2.length);
        for (String str : formatArgs2) {
            arrayList.add(new f0(str));
        }
        return new k0(i15, arrayList);
    }
}
