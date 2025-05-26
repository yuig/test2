package w21;

import com.pinterest.api.model.i50;
import i2.v3;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y1 f127789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127790t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127791u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127792v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v3 f127793w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(y1 y1Var, i2.q1 q1Var, i2.q1 q1Var2, i2.q1 q1Var3, v3 v3Var, bl2.c cVar) {
        super(2, cVar);
        this.f127789s = y1Var;
        this.f127790t = q1Var;
        this.f127791u = q1Var2;
        this.f127792v = q1Var3;
        this.f127793w = v3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r0(this.f127789s, this.f127790t, this.f127791u, this.f127792v, this.f127793w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127788r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127788r = 1;
            if (lb.l0.S(400L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                TreeMap treeMap = e1.f127681a;
                this.f127791u.setValue(null);
                this.f127792v.setValue(Boolean.FALSE);
                l82.c e13 = this.f127789s.f127879g.e();
                v3 v3Var = this.f127793w;
                e13.a(new t(((m) v3Var.getValue()).f127741b, (i50) ((m) v3Var.getValue()).f127743d.get(0)));
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        TreeMap treeMap2 = e1.f127681a;
        i2.q1 q1Var = this.f127790t;
        q1Var.setValue(z1.a((z1) q1Var.getValue(), e.Final, null, 2));
        this.f127788r = 2;
        if (lb.l0.S(400L, this) == aVar) {
            return aVar;
        }
        TreeMap treeMap3 = e1.f127681a;
        this.f127791u.setValue(null);
        this.f127792v.setValue(Boolean.FALSE);
        l82.c e132 = this.f127789s.f127879g.e();
        v3 v3Var2 = this.f127793w;
        e132.a(new t(((m) v3Var2.getValue()).f127741b, (i50) ((m) v3Var2.getValue()).f127743d.get(0)));
        return Unit.f80348a;
    }
}
