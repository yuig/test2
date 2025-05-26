package ir1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kp.n;
import uj2.b0;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final g f73523i = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u5.i credential = (u5.i) obj;
        Intrinsics.checkNotNullParameter(credential, "credential");
        return b0.j(new mr1.g(n.c0(credential.f120515b).f59073e));
    }
}
