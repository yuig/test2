package fv;

import ao2.j0;
import cc2.h;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import pb0.g;

/* loaded from: classes3.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62991r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f62992s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f30 f62993t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f62994u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f62995v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, f30 f30Var, long j13, h hVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62992s = cVar;
        this.f62993t = f30Var;
        this.f62994u = j13;
        this.f62995v = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f62992s, this.f62993t, this.f62994u, this.f62995v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62991r;
        f30 f30Var = this.f62993t;
        c cVar = this.f62992s;
        if (i13 == 0) {
            ue.c.H(obj);
            e a13 = cVar.a(f30Var);
            if (a13 != null) {
                ((g) cVar.f63002c).getClass();
                a13.f63010b = System.currentTimeMillis();
                Unit unit = Unit.f80348a;
            } else {
                a13 = null;
            }
            cVar.d(f30Var, a13);
            this.f62991r = 1;
            if (l0.S(this.f62994u, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        do {
            c cVar2 = this.f62992s;
            f30 f30Var2 = this.f62993t;
            e a14 = cVar2.a(f30Var2);
            cVar2.b(f30Var2, a14 != null ? a14.f63011c : 0L, 5000L);
            cVar.c(f30Var, this.f62995v, true);
            e a15 = cVar.a(f30Var);
            if (a15 != null) {
                a15.f63011c = 0L;
                ((g) cVar.f63002c).getClass();
                a15.f63010b = System.currentTimeMillis();
                Unit unit2 = Unit.f80348a;
            } else {
                a15 = null;
            }
            cVar.d(f30Var, a15);
            this.f62991r = 2;
        } while (l0.S(5000L, this) != aVar);
        return aVar;
    }
}
