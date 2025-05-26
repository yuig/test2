package lb2;

import a.k1;
import a.z0;
import com.pinterest.api.model.wy0;
import com.pinterest.error.AuthFailureError;
import h32.f1;
import java.util.HashMap;
import jk2.d1;
import jk2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import rq.y;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82763i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f82764j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(n nVar, int i13) {
        super(1);
        this.f82763i = i13;
        this.f82764j = nVar;
    }

    public final void b(wy0 it) {
        int i13 = this.f82763i;
        n nVar = this.f82764j;
        switch (i13) {
            case 0:
                d0 d0Var = nVar.f82785c;
                f1 f1Var = f1.USER_SWITCH_SUCCESS;
                String uid = it.getUid();
                HashMap hashMap = new HashMap();
                hashMap.put("group_id", a60.a.b());
                hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
                d0Var.g(f1Var, uid, hashMap, false);
                if (nVar.m()) {
                    or1.c cVar = or1.c.ADD_ACCOUNT;
                    or1.e eVar = or1.e.SUCCESS;
                    or1.b.Companion.getClass();
                    nVar.h(cVar, eVar, or1.a.a(it), null);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                mo1.d.a(nVar.f82784b, true, null, null, null, 14);
                break;
        }
    }

    public final void e(Throwable th3) {
        int i13 = this.f82763i;
        n nVar = this.f82764j;
        switch (i13) {
            case 1:
                if (nVar.l()) {
                    nVar.h(or1.c.ADD_ACCOUNT, or1.e.FAILURE, or1.b.PERSONAL, th3);
                    break;
                }
                break;
            default:
                mo1.d.a(nVar.f82784b, true, null, null, null, 14);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 f13;
        String userUid;
        int i13 = this.f82763i;
        n nVar = this.f82764j;
        switch (i13) {
            case 0:
                b((wy0) obj);
                return Unit.f80348a;
            case 1:
                e((Throwable) obj);
                return Unit.f80348a;
            case 2:
                b((wy0) obj);
                return Unit.f80348a;
            case 3:
                wy0 loggedOutUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(loggedOutUser, "loggedOutUser");
                nVar.getClass();
                int i14 = 15;
                d1 d1Var = new d1(new j1(new ik2.b(1, new hk2.k(new hk2.h(new hk2.f(1, new kk2.c(new k1(loggedOutUser, 27), 0), new b22.f(14, i.f82765j)), new z0(new y(i14, loggedOutUser), 0), 1), new b22.f(i14, i.f82766k), 0), new z0(i.f82767l, 1)), new z0(i.f82768m, 2), 0));
                Intrinsics.checkNotNullExpressionValue(d1Var, "ignoreElements(...)");
                hk2.f fVar = new hk2.f(2, new kk2.c(new f(nVar, 0), 0), new b22.f(29, new y(16, loggedOutUser)));
                Intrinsics.checkNotNullExpressionValue(fVar, "flatMapMaybe(...)");
                return new hk2.f(0, fVar, d1Var);
            case 4:
                mr1.h userAccount = (mr1.h) obj;
                Intrinsics.checkNotNullParameter(userAccount, "userAccount");
                return nVar.k(userAccount).t();
            case 5:
                e((Throwable) obj);
                return Unit.f80348a;
            case 6:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof AuthFailureError) && (f13 = ((b60.d) nVar.f82791i).f()) != null && (userUid = f13.getUid()) != null) {
                    Intrinsics.checkNotNullParameter(userUid, "userUid");
                    a60.a.a(null).edit().remove(userUid).commit();
                }
                return Boolean.TRUE;
            default:
                c60.a accessToken = (c60.a) obj;
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                return nVar.i(accessToken);
        }
    }
}
