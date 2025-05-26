package jg1;

import et1.h0;
import et1.j0;
import et1.u0;
import et1.v0;
import ht1.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f76078i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f76079j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wk2.a f76080k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j0 f76081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0 f76082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ et1.d f76083n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ lt1.g f76084o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f76085p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, b0 b0Var, id1.a aVar, j0 j0Var, f0 f0Var, et1.d dVar, lt1.g gVar, c cVar) {
        super(1);
        this.f76078i = a0Var;
        this.f76079j = b0Var;
        this.f76080k = aVar;
        this.f76081l = j0Var;
        this.f76082m = f0Var;
        this.f76083n = dVar;
        this.f76084o = gVar;
        this.f76085p = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        et1.c subProducerComponent = (et1.c) obj;
        Intrinsics.checkNotNullParameter(subProducerComponent, "subProducerComponent");
        a0 a0Var = this.f76078i;
        gi2.b bVar = a0Var.f75908e;
        b0 b0Var = this.f76079j;
        long j13 = b0Var.f75916c;
        bVar.getClass();
        t0 t0Var = new t0(j13, b0Var.f75917d);
        a0Var.f75909f.getClass();
        lt1.e eVar = new lt1.e(b0Var.f75915b);
        h0 simpleProducerFactory = a0Var.f75906c.f60083a;
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
        et1.j mediaExtractor = b0Var.f75914a;
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        wk2.a mutableComponentProvider = this.f76080k;
        Intrinsics.checkNotNullParameter(mutableComponentProvider, "mutableComponentProvider");
        lt1.c cVar = new lt1.c(mediaExtractor, simpleProducerFactory, mutableComponentProvider);
        lt1.d a13 = cVar.a(this.f76081l, b0Var.f75919f);
        v0 v0Var = (v0) subProducerComponent;
        v0Var.a(cVar, "Demuxer");
        v0Var.a(t0Var, "Trim to start/end time");
        v0Var.a(eVar, "Start time setter");
        f0 f0Var = this.f76082m;
        boolean z13 = f0Var.f80424a;
        et1.d dVar = this.f76083n;
        if (z13) {
            f0Var.f80424a = false;
            ((u0) dVar).a(this.f76084o.f84829h, a13.f84812h);
        }
        u0 u0Var = (u0) dVar;
        u0Var.a(cVar.f84804i, this.f76085p.f75927h);
        u0Var.a(t0Var, a13.f84811g);
        u0Var.a(eVar, t0Var);
        return eVar;
    }
}
