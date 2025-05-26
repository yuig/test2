package by1;

import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import u50.r;
import x02.i2;

/* loaded from: classes4.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24139r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f24140s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f24141t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f24142u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, String str, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f24140s = iVar;
        this.f24141t = str;
        this.f24142u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f24140s, this.f24141t, this.f24142u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24139r;
        r rVar = this.f24142u;
        int i14 = 2;
        i iVar = this.f24140s;
        if (i13 == 0) {
            ue.c.H(obj);
            i2 i2Var = iVar.f24156d;
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            i2 W2 = c0.d.W2(i2Var, n00.c.PIN_STATS_DETAILS_FIELDS);
            String str = this.f24141t;
            if (str == null) {
                f30 f30Var = iVar.f24160h;
                str = f30Var != null ? f30Var.i6() : null;
                if (str == null) {
                    str = "";
                }
            }
            fd.r rVar2 = new fd.r(kotlin.jvm.internal.j.a(W2.Q(str)), iVar, rVar, i14);
            this.f24139r = 1;
            obj = l0.h0(rVar2, this);
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
            ue.c.H(obj);
        }
        do2.i iVar2 = (do2.i) obj;
        if (iVar2 != null) {
            c cVar = new c(iVar, rVar);
            this.f24139r = 2;
            if (iVar2.collect(cVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
