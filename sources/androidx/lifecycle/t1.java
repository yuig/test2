package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18690a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f18690a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((l1) it.next()).f();
        }
        linkedHashMap.clear();
    }

    public final void b(String key, l1 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        l1 l1Var = (l1) this.f18690a.put(key, viewModel);
        if (l1Var != null) {
            l1Var.f();
        }
    }
}
