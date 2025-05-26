package l82;

import c50.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final y f82242a;

    public n(y engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.f82242a = engine;
    }

    public static void b(n nVar, g sep) {
        String a13 = sep.a();
        nVar.getClass();
        Intrinsics.checkNotNullParameter(sep, "sep");
        nVar.a(sep, new w2(22), a13);
    }

    public final void a(g sep, f converter, String str) {
        Intrinsics.checkNotNullParameter(sep, "sep");
        Intrinsics.checkNotNullParameter(converter, "converter");
        kotlin.jvm.internal.j.z(this.f82242a.f82283a, null, null, new m(this, converter, sep, str, null), 3);
    }
}
