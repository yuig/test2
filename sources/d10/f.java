package d10;

import com.apollographql.apollo3.exception.ApolloException;
import dl2.j;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends j implements l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f53606r = 1;

    /* renamed from: s, reason: collision with root package name */
    public int f53607s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f53608t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f53609u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f53610v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function2 function2, bl2.c cVar) {
        super(3, cVar);
        this.f53610v = function2;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f53606r;
        Object obj4 = this.f53610v;
        switch (i13) {
            case 0:
                f fVar = new f((pc.f) this.f53609u, (g) obj4, (bl2.c) obj3);
                fVar.f53608t = (Throwable) obj2;
                return fVar.invokeSuspend(Unit.f80348a);
            default:
                f fVar2 = new f((Function2) obj4, (bl2.c) obj3);
                fVar2.f53608t = (do2.j) obj;
                fVar2.f53609u = obj2;
                return fVar2.invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.j jVar;
        int i13 = this.f53606r;
        Object obj2 = this.f53610v;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (this.f53607s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                Throwable th3 = (Throwable) this.f53608t;
                if (!(th3 instanceof ApolloException)) {
                    throw th3;
                }
                String a13 = ((pc.f) this.f53609u).f99541a.a();
                qz.d dVar = new qz.d();
                dVar.f105387g = -1000;
                ((g) obj2).f53611a.a(dVar, a13, th3);
                throw th3;
            default:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f53607s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    do2.j jVar2 = (do2.j) this.f53608t;
                    Object obj3 = this.f53609u;
                    this.f53608t = jVar2;
                    this.f53607s = 1;
                    Object invoke = ((Function2) obj2).invoke(obj3, this);
                    if (invoke == aVar2) {
                        return aVar2;
                    }
                    jVar = jVar2;
                    obj = invoke;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ue.c.H(obj);
                        return Unit.f80348a;
                    }
                    jVar = (do2.j) this.f53608t;
                    ue.c.H(obj);
                }
                this.f53608t = null;
                this.f53607s = 2;
                if (jVar.emit(obj, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pc.f fVar, g gVar, bl2.c cVar) {
        super(3, cVar);
        this.f53609u = fVar;
        this.f53610v = gVar;
    }
}
