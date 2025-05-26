package y1;

import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t3.f3;
import t3.k1;

/* loaded from: classes2.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136543r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136544s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f3 f136545t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f136546u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f136547v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f136548w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f3 f3Var, Function1 function1, g gVar, b0 b0Var, bl2.c cVar) {
        super(2, cVar);
        this.f136545t = f3Var;
        this.f136546u = function1;
        this.f136547v = gVar;
        this.f136548w = b0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f136545t, this.f136546u, this.f136547v, this.f136548w, cVar);
        eVar.f136544s = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136543r;
        g gVar = this.f136547v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                ao2.j0 j0Var = (ao2.j0) this.f136544s;
                d0 d0Var = e0.f136549a;
                f3 f3Var = this.f136545t;
                k1 k1Var = (k1) f3Var;
                View view = k1Var.f116050a;
                d0Var.getClass();
                x xVar = new x(view);
                g0 g0Var = new g0(k1Var.f116050a, new d(this.f136548w), xVar);
                if (x1.e.f131562a) {
                    kotlin.jvm.internal.j.z(j0Var, null, null, new c(gVar, xVar, null), 3);
                }
                Function1 function1 = this.f136546u;
                if (function1 != null) {
                    function1.invoke(g0Var);
                }
                gVar.f136557c = g0Var;
                this.f136543r = 1;
                if (((k1) f3Var).c(g0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            gVar.f136557c = null;
            throw th3;
        }
    }
}
