package pn2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b1 f100772i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f100773j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(List list, in2.n nVar, u0 u0Var, b1 b1Var, boolean z13) {
        super(1);
        this.f100772i = b1Var;
        this.f100773j = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qn2.i kotlinTypeRefiner = (qn2.i) obj;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        am2.j descriptor = this.f100772i.b();
        if (descriptor == null) {
            return null;
        }
        ((qn2.h) kotlinTypeRefiner).getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }
}
