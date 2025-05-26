package in2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: b, reason: collision with root package name */
    public final on2.l f72871b;

    public j(on2.u storageManager, Function0 getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        d6.e eVar = new d6.e(5, getScope);
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f72871b = new on2.l(qVar, eVar);
    }

    @Override // in2.a
    public final n i() {
        return (n) this.f72871b.invoke();
    }
}
