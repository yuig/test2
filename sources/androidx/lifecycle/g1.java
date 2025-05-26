package androidx.lifecycle;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk.f f18625a = new bk.f();

    /* renamed from: b, reason: collision with root package name */
    public static final bk.f f18626b = new bk.f();

    /* renamed from: c, reason: collision with root package name */
    public static final bk.f f18627c = new bk.f();

    public static final c1 a(u6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        ma.i iVar = (ma.i) eVar.a(f18625a);
        if (iVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        u1 u1Var = (u1) eVar.a(f18626b);
        if (u1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) eVar.a(f18627c);
        String key = (String) eVar.a(w6.c.f128111a);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        ma.f b13 = iVar.getSavedStateRegistry().b();
        h1 h1Var = b13 instanceof h1 ? (h1) b13 : null;
        if (h1Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        i1 c13 = c(u1Var);
        c1 c1Var = (c1) c13.f18648b.get(key);
        if (c1Var != null) {
            return c1Var;
        }
        Class[] clsArr = c1.f18600f;
        Intrinsics.checkNotNullParameter(key, "key");
        h1Var.b();
        Bundle bundle2 = h1Var.f18643c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(key) : null;
        Bundle bundle4 = h1Var.f18643c;
        if (bundle4 != null) {
            bundle4.remove(key);
        }
        Bundle bundle5 = h1Var.f18643c;
        if (bundle5 != null && bundle5.isEmpty()) {
            h1Var.f18643c = null;
        }
        c1 u13 = v5.x.u(bundle3, bundle);
        c13.f18648b.put(key, u13);
        return u13;
    }

    public static final void b(ma.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        r rVar = ((b0) iVar.getLifecycle()).f18588d;
        if (rVar != r.INITIALIZED && rVar != r.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iVar.getSavedStateRegistry().b() == null) {
            h1 h1Var = new h1(iVar.getSavedStateRegistry(), (u1) iVar);
            iVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", h1Var);
            iVar.getLifecycle().a(new d1(h1Var));
        }
    }

    public static final i1 c(u1 owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        f1 factory = new f1();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        t1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        u6.c defaultCreationExtras = owner instanceof k ? ((k) owner).getDefaultViewModelCreationExtras() : u6.a.f120754b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(i1.class, "modelClass");
        return (i1) bVar.F("androidx.lifecycle.internal.SavedStateHandlesVM", lb.l0.w0(i1.class));
    }
}
