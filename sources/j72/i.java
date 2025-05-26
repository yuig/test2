package j72;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.b1;
import r72.u1;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f74874r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f74875s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f74876t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f74877u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar, u1 u1Var, bl2.c cVar) {
        super(2, cVar);
        this.f74876t = sVar;
        this.f74877u = u1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f74876t, this.f74877u, cVar);
        iVar.f74875s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.j jVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74874r;
        s sVar = this.f74876t;
        if (i13 == 0) {
            ue.c.H(obj);
            jVar = (do2.j) this.f74875s;
            this.f74875s = jVar;
            this.f74874r = 1;
            obj = kotlin.jvm.internal.j.M(this, sVar.f74910c.f89707c, new h(sVar, this.f74877u, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            jVar = (do2.j) this.f74875s;
            ue.c.H(obj);
        }
        b1 b1Var = (b1) obj;
        sVar.f74911d.b("Generated image id: " + b1Var.f106442a, n72.l.VERBOSE);
        this.f74875s = null;
        this.f74874r = 2;
        if (jVar.emit(b1Var, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
