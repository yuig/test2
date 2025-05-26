package androidx.camera.core.impl;

import a.o3;
import java.util.Set;

/* loaded from: classes2.dex */
public interface d2 extends v0 {
    @Override // androidx.camera.core.impl.v0
    default Set a() {
        return getConfig().a();
    }

    @Override // androidx.camera.core.impl.v0
    default boolean d(c cVar) {
        return getConfig().d(cVar);
    }

    @Override // androidx.camera.core.impl.v0
    default Object e(c cVar, u0 u0Var) {
        return getConfig().e(cVar, u0Var);
    }

    @Override // androidx.camera.core.impl.v0
    default Object f(c cVar) {
        return getConfig().f(cVar);
    }

    @Override // androidx.camera.core.impl.v0
    default Set g(c cVar) {
        return getConfig().g(cVar);
    }

    v0 getConfig();

    @Override // androidx.camera.core.impl.v0
    default void h(o3 o3Var) {
        getConfig().h(o3Var);
    }

    @Override // androidx.camera.core.impl.v0
    default u0 i(c cVar) {
        return getConfig().i(cVar);
    }

    @Override // androidx.camera.core.impl.v0
    default Object j(c cVar, Object obj) {
        return getConfig().j(cVar, obj);
    }
}
