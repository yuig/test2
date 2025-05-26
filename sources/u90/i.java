package u90;

import ao2.j0;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import v90.a1;
import v90.k;
import v90.q0;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f121197r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f121198s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f121199t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a1 f121200u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f121201v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, a1 a1Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f121199t = jVar;
        this.f121200u = a1Var;
        this.f121201v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f121199t, this.f121200u, this.f121201v, cVar);
        iVar.f121198s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121197r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f121198s;
            MaskModel maskModel = ((q0) this.f121200u).f124955a;
            this.f121198s = j0Var;
            this.f121197r = 1;
            obj = j.j(this.f121199t, maskModel, this);
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
        r rVar = this.f121201v;
        if (cutoutModel != null) {
            rVar.a(new v90.i(cutoutModel));
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
