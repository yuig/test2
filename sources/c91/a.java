package c91;

import android.content.Context;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.x0;
import nx.d0;
import so.oa;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final hp1.a f26973a = new hp1.a();

    public static final boolean a(List onDemandModuleList) {
        Intrinsics.checkNotNullParameter(onDemandModuleList, "onDemandModuleList");
        Iterator it = onDemandModuleList.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            ((hp1.a) it.next()).getClass();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(bool, bool)) {
                z13 = true;
            }
        }
        return z13;
    }

    public static final void b(Resources resources, d0 pinalytics, String str, int i13) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        boolean z13 = i13 == 5;
        String string = i13 != 2 ? i13 != 5 ? (i13 == 6 || i13 == 7) ? resources.getString(x0.vto_failed) : "" : resources.getString(x0.vto_ready) : resources.getString(x0.vto_in_progress);
        Intrinsics.f(string);
        if (!z.j(string)) {
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new lr.c(string, z13, pinalytics, str));
        }
    }
}
