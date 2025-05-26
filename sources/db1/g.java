package db1;

import com.pinterest.api.model.jz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final g f54295i = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jz it = (jz) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z13 = false;
        if (it.c() != null && ((it.e() != null || ((it.e() == null && it.h() == jz.c.NOTIFICATION_SETTING_STYLE_TWO_LEVEL_SECTION) || (it.e() == null && it.h() == jz.c.NOTIFICATION_SETTING_STYLE_TOGGLE_GROUP))) && it.h() != null && c0.y(new jz.c[]{jz.c.NOTIFICATION_SETTING_STYLE_RADIO_GROUP, jz.c.NOTIFICATION_SETTING_STYLE_TOGGLE_GROUP, jz.c.NOTIFICATION_SETTING_STYLE_TWO_LEVEL_SECTION, jz.c.NOTIFICATION_SETTING_STYLE_BUTTON}, it.h()) && it.g() != null)) {
            Intrinsics.checkNotNullExpressionValue(it.g(), "getOptions(...)");
            if (!r0.isEmpty()) {
                List g13 = it.g();
                Intrinsics.checkNotNullExpressionValue(g13, "getOptions(...)");
                List<jz.b> list = g13;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (jz.b bVar : list) {
                    arrayList.add(Boolean.valueOf((bVar.a() == null || bVar.b() == null || bVar.c() == null) ? false : true));
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Boolean.valueOf(((Boolean) next).booleanValue() && ((Boolean) it2.next()).booleanValue());
                }
                if (((Boolean) next).booleanValue()) {
                    z13 = true;
                }
            }
        }
        return Boolean.valueOf(z13);
    }
}
