package pm0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f100683r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f100684s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f100685t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f100686u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f100687v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z13, o oVar, String str, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f100684s = z13;
        this.f100685t = oVar;
        this.f100686u = str;
        this.f100687v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f100684s, this.f100685t, this.f100686u, this.f100687v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.c x13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f100683r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            boolean z13 = this.f100684s;
            String modelId = this.f100686u;
            o oVar = this.f100685t;
            if (z13) {
                x0 x0Var = oVar.f100688a;
                Intrinsics.checkNotNullParameter(x0Var, "<this>");
                Intrinsics.checkNotNullParameter(modelId, "modelId");
                x13 = kotlin.jvm.internal.j.a(x0Var.R(modelId));
            } else {
                x13 = ve.h.x(oVar.f100688a, modelId);
            }
            u50.r rVar = this.f100687v;
            do2.j0 j0Var = new do2.j0(x13, new vs.w(3, rVar, null));
            da0.b bVar = new da0.b(rVar, i14);
            this.f100683r = 1;
            if (j0Var.collect(bVar, this) == aVar) {
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
