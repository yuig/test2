package qm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.v1;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f104430i = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.j b13 = ((v1) obj).w0().b();
        if (b13 == null) {
            return Boolean.FALSE;
        }
        ym2.g name = b13.getName();
        ym2.c cVar = zl2.d.f142111f;
        return Boolean.valueOf(Intrinsics.d(name, cVar.f()) && Intrinsics.d(fn2.d.c(b13), cVar));
    }
}
