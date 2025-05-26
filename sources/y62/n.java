package y62;

import android.graphics.RectF;
import ao2.j0;
import do2.r2;
import do2.t2;
import do2.y1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import v.d3;

/* loaded from: classes4.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f137951r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RectF f137952s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d3 f137953t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RectF rectF, d3 d3Var, bl2.c cVar) {
        super(2, cVar);
        this.f137952s = rectF;
        this.f137953t = d3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f137952s, this.f137953t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        t2 t2Var;
        Object value;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f137951r;
        d3 d3Var = this.f137953t;
        if (i13 == 0) {
            ue.c.H(obj);
            RectF rectF = this.f137952s;
            if (rectF.isEmpty()) {
                d3.a(d3Var, null);
                return Unit.f80348a;
            }
            String str = ((g) ((r2) d3Var.f123430f).getValue()).f137938e;
            y1 y1Var = (y1) d3Var.f123429e;
            do {
                t2Var = (t2) y1Var;
                value = t2Var.getValue();
            } while (!t2Var.h(value, g.a((g) value, null, null, f.LOADING, null, 11)));
            t72.l lVar = (t72.l) d3Var.f123427c;
            this.f137951r = 1;
            obj = lVar.a(str, rectF, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        n72.k kVar = (n72.k) obj;
        if (kVar instanceof n72.j) {
            q72.g gVar = (q72.g) CollectionsKt.firstOrNull((List) ((n72.j) kVar).f89728a);
            d3.a(d3Var, gVar != null ? gVar.f102842d : null);
        } else if (kVar instanceof n72.i) {
            d3.a(d3Var, null);
        }
        return Unit.f80348a;
    }
}
