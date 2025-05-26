package o1;

import do2.f2;
import do2.g2;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f92764a = g2.b(0, 16, co2.a.DROP_OLDEST, 1);

    public final Object a(j jVar, bl2.c cVar) {
        Object emit = this.f92764a.emit(jVar, cVar);
        return emit == cl2.a.COROUTINE_SUSPENDED ? emit : Unit.f80348a;
    }

    public final void b(j jVar) {
        this.f92764a.b(jVar);
    }
}
