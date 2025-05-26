package vc;

import do2.b2;
import kotlin.Unit;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class k implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ do2.i f125537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f125538b;

    public /* synthetic */ k(b2 b2Var, j0 j0Var) {
        this.f125537a = b2Var;
        this.f125538b = j0Var;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f125537a.collect(new j(jVar, this.f125538b, 1), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
