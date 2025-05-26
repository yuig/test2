package yc;

import do2.s0;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class j implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ do2.i f138635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f138636b;

    public j(s0 s0Var, long j13) {
        this.f138635a = s0Var;
        this.f138636b = j13;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f138635a.collect(new i(jVar, this.f138636b), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
