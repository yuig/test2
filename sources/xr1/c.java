package xr1;

import ao2.e2;
import ao2.j0;
import ao2.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl2.j;
import fd.t;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import ko2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb2.n;
import u50.r;
import uj2.q;
import vs.w;
import wr1.n0;
import wr1.o0;
import wr1.p0;
import wr1.q0;
import wr1.r0;
import wr1.s0;
import zy.e0;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135685r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f135686s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f135687t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f135688u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f135689v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s0 s0Var, d dVar, j0 j0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f135686s = s0Var;
        this.f135687t = dVar;
        this.f135688u = j0Var;
        this.f135689v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f135686s, this.f135687t, this.f135688u, this.f135689v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135685r;
        if (i13 == 0) {
            ue.c.H(obj);
            s0 s0Var = this.f135686s;
            boolean z13 = s0Var instanceof o0;
            bl2.c cVar = null;
            int i14 = 4;
            j0 j0Var = this.f135688u;
            r rVar = this.f135689v;
            d dVar = this.f135687t;
            if (z13) {
                o0 o0Var = (o0) s0Var;
                if (!o0Var.f130986c) {
                    dVar.f135694e.e(j0Var, new e0(new zy.a(com.bumptech.glide.d.z0(o0Var.f130985b, a.f135679l), f1.UNAUTH_ACCOUNT_RECOVERY_FIND_USER_BY_EMAIL_REQUEST, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)), rVar);
                }
                q u13 = dVar.f135690a.A(o0Var.f130984a, "lookup").u();
                Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
                do2.j0 j0Var2 = new do2.j0(kotlin.jvm.internal.j.a(u13), new t(s0Var, rVar, cVar, i14));
                k1.j0 j0Var3 = new k1.j0(this.f135687t, this.f135686s, this.f135688u, this.f135689v, 4);
                this.f135685r = 1;
                if (j0Var2.collect(j0Var3, this) == aVar) {
                    return aVar;
                }
            } else if (s0Var instanceof n0) {
                f fVar = v0.f20219a;
                e2 e2Var = ho2.q.f69782a;
                b bVar = new b(dVar, s0Var, rVar, null);
                this.f135685r = 2;
                if (kotlin.jvm.internal.j.M(this, e2Var, bVar) == aVar) {
                    return aVar;
                }
            } else if (s0Var instanceof p0) {
                if (((n) dVar.f135693d).l()) {
                    p0 p0Var = (p0) s0Var;
                    i0 i0Var = p0Var.f130991e;
                    String str = p0Var.f130989c;
                    f1 f1Var = f1.USER_SWITCH_ATTEMPT;
                    HashMap hashMap = new HashMap();
                    hashMap.put("group_id", a60.a.b());
                    hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
                    dVar.f135694e.e(j0Var, new e0(new zy.a(i0Var, f1Var, str, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM)), rVar);
                }
                p0 p0Var2 = (p0) s0Var;
                q u14 = dVar.f135691b.c(dVar.f135692c.a(p0Var2.f130987a, p0Var2.f130988b), p0Var2.f130990d).u();
                Intrinsics.checkNotNullExpressionValue(u14, "toObservable(...)");
                do2.j0 j0Var4 = new do2.j0(kotlin.jvm.internal.j.a(u14), new w(5, rVar, cVar));
                da0.b bVar2 = new da0.b(rVar, i14);
                this.f135685r = 3;
                if (j0Var4.collect(bVar2, this) == aVar) {
                    return aVar;
                }
            } else if (!(s0Var instanceof r0)) {
                boolean z14 = s0Var instanceof q0;
            }
        } else {
            if (i13 != 1 && i13 != 2 && i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
