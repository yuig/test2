package dc2;

import e82.o;
import jk2.a1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f54414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54415b;

    public i(b60.a activeUidProvider) {
        Intrinsics.checkNotNullParameter(activeUidProvider, "activeUidProvider");
        String a13 = vb0.b.f125448a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstallId(...)");
        this.f54415b = a13;
        b60.d dVar = (b60.d) activeUidProvider;
        this.f54414a = dVar.g();
        uk2.f fVar = dVar.f22014d;
        fVar.getClass();
        a1 a1Var = new a1(fVar);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        a1Var.F(new o(11, new e82.l(this, 8)), new o(12, h.f54413i), ck2.i.f27923c, ck2.i.f27924d);
    }
}
