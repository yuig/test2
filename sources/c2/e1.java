package c2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class e1 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2.t f24661b;

    public /* synthetic */ e1(s2.t tVar, int i13) {
        this.f24660a = i13;
        this.f24661b = tVar;
    }

    public final Object a(o1.j jVar) {
        int i13 = this.f24660a;
        s2.t tVar = this.f24661b;
        switch (i13) {
            case 0:
                if (jVar instanceof o1.h) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.i) {
                    tVar.remove(((o1.i) jVar).f92763a);
                } else if (jVar instanceof o1.d) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.e) {
                    tVar.remove(((o1.e) jVar).f92756a);
                } else if (jVar instanceof o1.n) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.o) {
                    tVar.remove(((o1.o) jVar).f92767a);
                } else if (jVar instanceof o1.m) {
                    tVar.remove(((o1.m) jVar).f92765a);
                }
                break;
            case 1:
                if (jVar instanceof o1.n) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.o) {
                    tVar.remove(((o1.o) jVar).f92767a);
                } else if (jVar instanceof o1.m) {
                    tVar.remove(((o1.m) jVar).f92765a);
                } else if (jVar instanceof o1.b) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.c) {
                    tVar.remove(((o1.c) jVar).f92755a);
                } else if (jVar instanceof o1.a) {
                    tVar.remove(((o1.a) jVar).f92754a);
                }
                break;
            default:
                if (jVar instanceof o1.n) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.o) {
                    tVar.remove(((o1.o) jVar).f92767a);
                } else if (jVar instanceof o1.m) {
                    tVar.remove(((o1.m) jVar).f92765a);
                } else if (jVar instanceof o1.b) {
                    tVar.add(jVar);
                } else if (jVar instanceof o1.c) {
                    tVar.remove(((o1.c) jVar).f92755a);
                } else if (jVar instanceof o1.a) {
                    tVar.remove(((o1.a) jVar).f92754a);
                }
                break;
        }
        return Unit.f80348a;
    }

    @Override // do2.j
    public final /* bridge */ /* synthetic */ Object emit(Object obj, bl2.c cVar) {
        switch (this.f24660a) {
        }
        return a((o1.j) obj);
    }
}
