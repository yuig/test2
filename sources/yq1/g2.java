package yq1;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.identity.password.StrongPasswordTextField;
import java.util.HashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f139854r;

    /* renamed from: s, reason: collision with root package name */
    public int f139855s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h2 f139856t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ vr1.b f139857u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, vr1.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f139856t = h2Var;
        this.f139857u = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g2(this.f139856t, this.f139857u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long a13;
        Object q13;
        v.f1 f1Var;
        qz.d M;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f139855s;
        vr1.b bVar = this.f139857u;
        h2 h2Var = this.f139856t;
        if (i13 == 0) {
            ue.c.H(obj);
            zn2.h.f142318a.getClass();
            zn2.f.f142316a.getClass();
            a13 = zn2.f.a();
            cr1.a aVar2 = h2Var.D0;
            if (aVar2 == null) {
                Intrinsics.r("accountService");
                throw null;
            }
            String str = bVar.f126457a;
            this.f139854r = a13;
            this.f139855s = 1;
            q13 = aVar2.q(str, this);
            if (q13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = this.f139854r;
            ue.c.H(obj);
            a13 = j13;
            q13 = obj;
        }
        zn2.i iVar = new zn2.i((NetworkResponse) q13, zn2.g.a(a13), null);
        NetworkResponse networkResponse = (NetworkResponse) iVar.f142319a;
        boolean z13 = networkResponse instanceof xz.b;
        long j14 = iVar.f142320b;
        if (z13) {
            int i14 = h2.E0;
            nx.d0 s73 = h2Var.s7();
            h32.f1 f1Var2 = h32.f1.REMOTE_PASSWORD_VALIDATION_SUCCESS;
            HashMap hashMap = new HashMap();
            hashMap.put("score", String.valueOf(bVar.f126459c.f109934a));
            hashMap.put("score_source", bVar.f126459c.f109935b);
            hashMap.put("time_in_ms", String.valueOf(zn2.b.e(j14)));
            Unit unit = Unit.f80348a;
            s73.g(f1Var2, null, hashMap, false);
            ar1.a aVar3 = h2Var.f139907m0;
            if (aVar3 != null) {
                aVar3.I0(bVar.f126457a, ar1.d.PASSWORD_STEP);
            }
        } else if (networkResponse instanceof xz.a) {
            Throwable th3 = ((xz.a) networkResponse).f136204a;
            int i15 = h2.E0;
            h2Var.getClass();
            boolean z14 = th3 instanceof NetworkResponseError;
            NetworkResponseError networkResponseError = z14 ? (NetworkResponseError) th3 : null;
            v.f1 f1Var3 = networkResponseError != null ? networkResponseError.f45043a : null;
            qz.d M2 = f1Var3 != null ? k3.M(f1Var3) : null;
            nx.d0 s74 = h2Var.s7();
            h32.f1 f1Var4 = h32.f1.REMOTE_PASSWORD_VALIDATION_FAILURE;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("score", String.valueOf(bVar.f126459c.f109934a));
            hashMap2.put("score_source", bVar.f126459c.f109935b);
            hashMap2.put("time_in_ms", String.valueOf(zn2.b.e(j14)));
            hashMap2.put("status_code", String.valueOf(f1Var3 != null ? f1Var3.f123449b : -1));
            hashMap2.put("api_error_code", String.valueOf(M2 != null ? M2.f105387g : -1));
            Unit unit2 = Unit.f80348a;
            s74.g(f1Var4, null, hashMap2, false);
            NetworkResponseError networkResponseError2 = z14 ? (NetworkResponseError) th3 : null;
            String e13 = (networkResponseError2 == null || (f1Var = networkResponseError2.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.e();
            if (e13 == null) {
                e13 = h2Var.getString(m60.x0.generic_error);
                Intrinsics.checkNotNullExpressionValue(e13, "getString(...)");
            }
            StrongPasswordTextField strongPasswordTextField = h2Var.f139914t0;
            if (strongPasswordTextField == null) {
                Intrinsics.r("strongPasswordField");
                throw null;
            }
            strongPasswordTextField.j(e13);
        }
        return Unit.f80348a;
    }
}
