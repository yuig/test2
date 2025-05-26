package lb2;

import com.pinterest.api.model.wy0;
import com.pinterest.identity.core.error.UnauthException;
import h32.f1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f82817i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qr1.u f82818j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f82819k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, qr1.u uVar, ArrayList arrayList) {
        super(1);
        this.f82817i = xVar;
        this.f82818j = uVar;
        this.f82819k = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 wy0Var = (wy0) obj;
        List list = this.f82819k;
        Unit unit = null;
        wy0 wy0Var2 = list.isEmpty() ? wy0Var : null;
        qr1.u uVar = this.f82818j;
        x xVar = this.f82817i;
        if (wy0Var2 != null) {
            String uid = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            xVar.getClass();
            Pair pair = new Pair("app", hf0.b.a().name());
            Pair pair2 = new Pair("reason", uVar.f105037d);
            ((m60.d) xVar.f82829h).b();
            HashMap f13 = z0.f(pair, pair2, new Pair("app_version", String.valueOf(13198010)));
            String str = (String) uVar.f105038e;
            if (str != null && str.length() > 0) {
                f13.put("source", str);
            }
            Map unmodifiableMap = Collections.unmodifiableMap(z0.f(new Pair("aux_data", new nm.p().a().k(z0.f(new Pair("tags", f13))))));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
            xVar.f82823b.k("logout", unmodifiableMap);
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", uid);
            String logoutReason = uVar.f105037d;
            Intrinsics.checkNotNullExpressionValue(logoutReason, "logoutReason");
            hashMap.put("reason", logoutReason);
            String str2 = (String) uVar.f105038e;
            if (str2 != null && str2.length() != 0) {
                hashMap.put("source", str2);
            }
            xVar.f82824c.g(f1.USER_LOGOUT_SUCCESS, null, hashMap, false);
            xVar.f82825d.c();
            or1.e eVar = or1.e.SUCCESS;
            Intrinsics.checkNotNullExpressionValue(logoutReason, "logoutReason");
            xVar.f82831j.k(eVar, logoutReason, null);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            or1.i iVar = xVar.f82831j;
            or1.e eVar2 = or1.e.FAILURE;
            String logoutReason2 = uVar.f105037d;
            Intrinsics.checkNotNullExpressionValue(logoutReason2, "logoutReason");
            iVar.k(eVar2, logoutReason2, new UnauthException.LogoutCompositeError(list));
        }
        return Unit.f80348a;
    }
}
