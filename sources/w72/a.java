package w72;

import ao2.j0;
import c72.b0;
import com.pinterest.api.model.fi0;
import dl2.j;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m1.v0;
import u50.r;
import v72.m;
import v72.n;
import v72.s;
import v72.w;
import ve.h;
import x02.b1;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128192r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f128193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f128194t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ fi0 f128195u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f128196v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f128197w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, fi0 fi0Var, r rVar, w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f128194t = eVar;
        this.f128195u = fi0Var;
        this.f128196v = rVar;
        this.f128197w = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f128194t, this.f128195u, this.f128196v, this.f128197w, cVar);
        aVar.f128193s = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128192r;
        Unit unit = null;
        e eVar = this.f128194t;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f128193s;
            b1 b1Var = eVar.f128211b;
            String id3 = this.f128195u.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            do2.j0 j0Var2 = new do2.j0(h.x(b1Var, id3), new v0(6, null));
            this.f128193s = j0Var;
            this.f128192r = 1;
            obj = l0.h0(j0Var2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        fi0 fi0Var = (fi0) obj;
        r rVar = this.f128196v;
        if (fi0Var != null) {
            b0 b0Var = eVar.f128210a;
            List M = fi0Var.M();
            if (M == null) {
                M = q0.f80391a;
            }
            rVar.a(new m(b0.h(b0Var, M, null, k3.o1(fi0Var), 2)));
            unit = Unit.f80348a;
        }
        if (unit == null) {
            rVar.a(new n(new IllegalStateException(a.a.j("Cannot load shuffle data for pin ", ((s) this.f128197w).f124450a))));
        }
        return Unit.f80348a;
    }
}
