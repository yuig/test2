package kx1;

import ay1.a0;
import ay1.n;
import by1.i;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.xr;
import cy1.e;
import dl2.j;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.internal.j0;
import u50.r;

/* loaded from: classes4.dex */
public final class b extends j implements l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f81101r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f81102s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f81103t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f81104u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f81105v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f81106w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j0 j0Var, j0 j0Var2, bl2.c cVar) {
        super(3, cVar);
        this.f81105v = j0Var;
        this.f81106w = j0Var2;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f81101r;
        Object obj4 = this.f81106w;
        Object obj5 = this.f81105v;
        switch (i13) {
            case 0:
                b bVar = new b((j0) obj5, (j0) obj4, (bl2.c) obj3);
                bVar.f81103t = (xr) obj;
                bVar.f81104u = (xr) obj2;
                return bVar.invokeSuspend(Unit.f80348a);
            default:
                return new b((r) this.f81103t, (do2.j) this.f81104u, (f30) obj5, (i) obj4, (bl2.c) obj3).invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f81101r;
        Object obj2 = this.f81106w;
        Object obj3 = this.f81105v;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (this.f81102s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                xr xrVar = (xr) this.f81103t;
                xr xrVar2 = (xr) this.f81104u;
                ((j0) obj3).f80434a = xrVar;
                ((j0) obj2).f80434a = xrVar2;
                return Unit.f80348a;
            default:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f81102s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    ((r) this.f81103t).a(new n(a0.f20658a));
                    do2.j jVar = (do2.j) this.f81104u;
                    e eVar = new e((f30) obj3, ((i) obj2).f24159g);
                    this.f81102s = 1;
                    if (jVar.emit(eVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, do2.j jVar, f30 f30Var, i iVar, bl2.c cVar) {
        super(3, cVar);
        this.f81103t = rVar;
        this.f81104u = jVar;
        this.f81105v = f30Var;
        this.f81106w = iVar;
    }
}
