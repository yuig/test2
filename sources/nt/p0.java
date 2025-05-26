package nt;

import com.pinterest.api.model.n90;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class p0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92128r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f92129s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f92130t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f92131u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f92132v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, s0 s0Var, List list, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f92129s = q0Var;
        this.f92130t = s0Var;
        this.f92131u = list;
        this.f92132v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p0(this.f92129s, this.f92130t, this.f92131u, this.f92132v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92128r;
        if (i13 == 0) {
            ue.c.H(obj);
            s0 s0Var = this.f92130t;
            n90 n90Var = s0Var.f92170c;
            List list = s0Var.f92169b;
            LinkedHashMap linkedHashMap = s0Var.f92168a;
            String str = s0Var.f92171d;
            this.f92128r = 1;
            if (q0.k(this.f92129s, n90Var, list, linkedHashMap, str, this.f92131u, this.f92132v, this) == aVar) {
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
