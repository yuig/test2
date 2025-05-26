package l5;

import do2.j;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class d implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ do2.i f81565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81566b;

    public /* synthetic */ d(do2.i iVar, i iVar2) {
        this.f81565a = iVar;
        this.f81566b = iVar2;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        Object collect = this.f81565a.collect(new c(0, jVar, (i) this.f81566b), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
