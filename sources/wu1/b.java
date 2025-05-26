package wu1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;

/* loaded from: classes2.dex */
public final class b implements EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final List f131150a;

    public b(ArrayList factories) {
        Intrinsics.checkNotNullParameter(factories, "factories");
        this.f131150a = factories;
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener a(Call call) {
        List list;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            list = this.f131150a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventListener.Factory) it.next()).a(call));
        }
        return new a(arrayList);
    }
}
