package lg;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements ng.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83200a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f83201b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f83202c;

    /* renamed from: d, reason: collision with root package name */
    public final wk2.a f83203d;

    /* renamed from: e, reason: collision with root package name */
    public final wk2.a f83204e;

    /* renamed from: f, reason: collision with root package name */
    public final wk2.a f83205f;

    public /* synthetic */ l(wk2.a aVar, wk2.a aVar2, ng.b bVar, wk2.a aVar3, wk2.a aVar4, int i13) {
        this.f83200a = i13;
        this.f83201b = aVar;
        this.f83202c = aVar2;
        this.f83203d = bVar;
        this.f83204e = aVar3;
        this.f83205f = aVar4;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f83200a;
        wk2.a aVar = this.f83205f;
        wk2.a aVar2 = this.f83204e;
        wk2.a aVar3 = this.f83203d;
        wk2.a aVar4 = this.f83202c;
        wk2.a aVar5 = this.f83201b;
        switch (i13) {
            case 0:
                tg.a aVar6 = (tg.a) aVar5.get();
                tg.a aVar7 = (tg.a) aVar4.get();
                pg.b bVar = (pg.b) aVar3.get();
                return new k(aVar6, aVar7, bVar, (qg.h) aVar.get());
            case 1:
                return new pg.a((Executor) aVar5.get(), (mg.e) aVar4.get(), (qg.i) aVar3.get(), (rg.d) aVar2.get(), (sg.b) aVar.get());
            default:
                return new rg.g((tg.a) aVar4.get(), (rg.b) aVar3.get(), (rg.j) aVar2.get());
        }
    }
}
