package kc1;

import android.os.Bundle;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79134r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f79135s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f79135s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a0 a0Var = new a0(this.f79135s, cVar);
        a0Var.f79134r = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((n) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = (n) this.f79134r;
        if (Intrinsics.d(nVar.f79168c, Boolean.TRUE)) {
            Set b13 = nVar.f79166a.b();
            int i13 = d0.L0;
            d0 d0Var = this.f79135s;
            d0Var.getClass();
            Bundle result = e0.t.j(new Pair("pronouns", b13.toArray(new String[0])));
            Intrinsics.checkNotNullParameter(result, "result");
            d0Var.P6(String.valueOf(973459), result);
            d0Var.D5();
        }
        return Unit.f80348a;
    }
}
