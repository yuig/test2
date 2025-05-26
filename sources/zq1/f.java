package zq1;

import com.pinterest.api.model.wy0;
import h32.f1;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142666i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f142667j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, int i13) {
        super(1);
        this.f142666i = i13;
        this.f142667j = jVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f142666i;
        j jVar = this.f142667j;
        switch (i13) {
            case 5:
                jVar.r3(null);
                break;
            case 6:
            case 7:
            default:
                Intrinsics.f(th3);
                jVar.t3(th3, null);
                break;
            case 8:
                jVar.s3(((yq1.k) ((b) jVar.getView())).e8());
                nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                nx.d0.B(d0Var, f1.MAGIC_LINK_LOGIN_FAILURE, null, null, null, 30);
                Intrinsics.f(th3);
                jVar.t3(th3, null);
                break;
            case 9:
                Intrinsics.f(th3);
                jVar.t3(th3, null);
                break;
        }
    }

    public final void e(qr1.c cVar) {
        int i13 = this.f142666i;
        j jVar = this.f142667j;
        switch (i13) {
            case 1:
                Intrinsics.f(cVar);
                j.p3(jVar, cVar);
                break;
            default:
                nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                nx.d0.B(d0Var, f1.MAGIC_LINK_LOGIN_SUCCESS, null, null, null, 30);
                Intrinsics.f(cVar);
                j.p3(jVar, cVar);
                break;
        }
    }

    public final void f(xj2.c cVar) {
        String str;
        int i13 = this.f142666i;
        j jVar = this.f142667j;
        switch (i13) {
            case 0:
                ((yq1.k) ((b) jVar.getView())).j8(true);
                if (((lb2.n) jVar.f142688d).l()) {
                    nx.d0 pinalytics = jVar.getPinalytics();
                    f1 f1Var = f1.USER_SWITCH_ATTEMPT;
                    wy0 f13 = ((b60.d) jVar.f142696l).f();
                    if (f13 == null || (str = f13.getUid()) == null) {
                        str = "";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("group_id", a60.a.b());
                    hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
                    pinalytics.g(f1Var, str, hashMap, false);
                    break;
                }
                break;
            case 3:
                ((yq1.k) ((b) jVar.getView())).j8(true);
                break;
            case 6:
                ((yq1.k) ((b) jVar.getView())).j8(true);
                break;
            default:
                ((yq1.k) ((b) jVar.getView())).j8(true);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142666i;
        j jVar = this.f142667j;
        switch (i13) {
            case 0:
                f((xj2.c) obj);
                break;
            case 1:
                e((qr1.c) obj);
                break;
            case 2:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) it.f80346a;
                break;
            case 3:
                f((xj2.c) obj);
                break;
            case 4:
                jVar.r3((qr1.g0) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                f((xj2.c) obj);
                break;
            case 7:
                e((qr1.c) obj);
                break;
            case 8:
                b((Throwable) obj);
                break;
            case 9:
                b((Throwable) obj);
                break;
            case 10:
                f((xj2.c) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
