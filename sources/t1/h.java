package t1;

import ao2.j0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m1.o;
import m1.x1;
import q3.x;
import xk2.q;
import xk2.s;

/* loaded from: classes2.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f115748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f115749s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f115750t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f115751u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, x xVar, Function0 function0, bl2.c cVar) {
        super(2, cVar);
        this.f115749s = kVar;
        this.f115750t = xVar;
        this.f115751u = function0;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f115749s, this.f115750t, this.f115751u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f115748r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f115749s;
            f fVar = kVar.f115761n;
            g gVar = new g(kVar, this.f115750t, this.f115751u);
            this.f115748r = 1;
            o oVar = (o) fVar;
            oVar.getClass();
            a3.d dVar = (a3.d) gVar.invoke();
            if (dVar == null || oVar.O0(oVar.f85486v, dVar)) {
                obj2 = Unit.f80348a;
            } else {
                ao2.o oVar2 = new ao2.o(1, cl2.h.b(this));
                oVar2.v();
                m1.i iVar = new m1.i(gVar, oVar2);
                m1.b bVar = oVar.f85482r;
                bVar.getClass();
                a3.d dVar2 = (a3.d) gVar.invoke();
                if (dVar2 == null) {
                    q qVar = s.f135225b;
                    oVar2.resumeWith(Unit.f80348a);
                } else {
                    oVar2.e(new x1(i14, bVar, iVar));
                    k2.e eVar = bVar.f85290a;
                    int i15 = new IntRange(0, eVar.f78184c - 1, 1).f80454b;
                    if (i15 >= 0) {
                        while (true) {
                            a3.d dVar3 = (a3.d) ((m1.i) eVar.f78182a[i15]).f85370a.invoke();
                            if (dVar3 != null) {
                                a3.d e13 = dVar2.e(dVar3);
                                if (Intrinsics.d(e13, dVar2)) {
                                    eVar.a(i15 + 1, iVar);
                                    break;
                                }
                                if (!Intrinsics.d(e13, dVar3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i16 = eVar.f78184c - 1;
                                    if (i16 <= i15) {
                                        while (true) {
                                            ((m1.i) eVar.f78182a[i15]).f85371b.cancel(cancellationException);
                                            if (i16 == i15) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                }
                            }
                            if (i15 == 0) {
                                break;
                            }
                            i15--;
                        }
                    }
                    eVar.a(0, iVar);
                    if (!oVar.f85487w) {
                        oVar.P0();
                    }
                }
                obj2 = oVar2.u();
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                if (obj2 == aVar2) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (obj2 != aVar2) {
                    obj2 = Unit.f80348a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
