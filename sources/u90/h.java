package u90;

import ao2.j0;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import v90.a1;
import v90.k;
import v90.r0;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f121192r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f121193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f121194t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a1 f121195u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f121196v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, a1 a1Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f121194t = jVar;
        this.f121195u = a1Var;
        this.f121196v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f121194t, this.f121195u, this.f121196v, cVar);
        hVar.f121193s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121192r;
        a1 a1Var = this.f121195u;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f121193s;
            MaskModel maskModel = ((r0) a1Var).f124958b;
            this.f121193s = j0Var;
            this.f121192r = 1;
            obj = j.j(this.f121194t, maskModel, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        CutoutModel cutoutModel = (CutoutModel) obj;
        r rVar = this.f121196v;
        if (cutoutModel != null) {
            rVar.a(new v90.j(cutoutModel, ((r0) a1Var).f124957a));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            rVar.a(k.f124923a);
        }
        return Unit.f80348a;
    }
}
