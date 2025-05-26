package a6;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class w implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ do2.i f886a;

    public /* synthetic */ w(do2.i iVar) {
        this.f886a = iVar;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f886a.collect(new v(jVar, 1), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
