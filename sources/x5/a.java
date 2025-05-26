package x5;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.j1;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import t3.y3;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f133834a = c.pooling_container_listener_holder_tag;

    /* renamed from: b, reason: collision with root package name */
    public static final int f133835b = c.is_pooling_container_tag;

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator it = j1.c0(view).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = b((View) it.next()).f133836a;
            for (int i13 = f0.i(arrayList); -1 < i13; i13--) {
                ((y3) arrayList.get(i13)).f116282a.g();
            }
        }
    }

    public static final b b(View view) {
        int i13 = f133834a;
        b bVar = (b) view.getTag(i13);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i13, bVar2);
        return bVar2;
    }
}
