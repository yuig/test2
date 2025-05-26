package u12;

import com.pinterest.api.model.zs;
import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import fk2.h;
import hk2.v;
import j12.i;
import java.util.LinkedHashMap;
import kk2.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.l;
import x02.u1;

/* loaded from: classes2.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f120008a;

    public d(e interestService) {
        Intrinsics.checkNotNullParameter(interestService, "interestService");
        this.f120008a = interestService;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        h hVar = new h(new i(12), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
        return hVar;
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f120008a.f(params.a(), n00.b.a(n00.c.NUX_INTEREST_FEED_DEFAULT));
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        l<zs> lVar;
        u params = (u) mVar;
        zs zsVar = (zs) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (zsVar != null) {
            if (params instanceof u1) {
                u1 u1Var = (u1) params;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = u1Var.f131501f;
                if (str != null && str.length() != 0) {
                    linkedHashMap.put("recommendation_source", u1Var.f131501f);
                }
                String str2 = u1Var.f131502g;
                if (str2 != null && str2.length() != 0) {
                    linkedHashMap.put("referrer", str2);
                }
                String str3 = u1Var.f131503h;
                if (str3 != null && str3.length() != 0) {
                    linkedHashMap.put("fields", str3);
                }
                boolean z13 = u1Var.f131500e;
                e eVar = this.f120008a;
                if (z13) {
                    String uid = zsVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    lVar = eVar.c(uid, linkedHashMap);
                } else {
                    if (z13) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String uid2 = zsVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    uj2.b e13 = eVar.e(uid2, linkedHashMap);
                    v d2 = l.d(jk.v.i(zsVar, false));
                    Intrinsics.checkNotNullExpressionValue(d2, "just(...)");
                    e13.getClass();
                    hk2.f fVar = new hk2.f(0, d2, e13);
                    Intrinsics.checkNotNullExpressionValue(fVar, "andThen(...)");
                    lVar = fVar;
                }
            } else {
                hk2.c cVar = new hk2.c(new i(9), 1);
                Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
                lVar = cVar;
            }
            if (lVar != null) {
                return lVar;
            }
        }
        hk2.c cVar2 = new hk2.c(new i(10), 1);
        Intrinsics.checkNotNullExpressionValue(cVar2, "error(...)");
        return cVar2;
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        k kVar = new k(new i(11), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }
}
