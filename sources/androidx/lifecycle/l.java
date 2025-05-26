package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements ma.e {
    public final void a(ma.i owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!(owner instanceof u1)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
        t1 viewModelStore = ((u1) owner).getViewModelStore();
        ma.g savedStateRegistry = owner.getSavedStateRegistry();
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.f18690a;
        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            Intrinsics.checkNotNullParameter(key, "key");
            l1 l1Var = (l1) linkedHashMap.get(key);
            Intrinsics.f(l1Var);
            jk.r.e(l1Var, savedStateRegistry, owner.getLifecycle());
        }
        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
            savedStateRegistry.d();
        }
    }
}
