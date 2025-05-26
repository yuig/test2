package sz;

import com.pinterest.api.model.j1;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.n1;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.x50;
import com.pinterest.api.model.z;
import f22.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import p02.v;
import rz.d;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115646a;

    public /* synthetic */ b(int i13) {
        this.f115646a = i13;
    }

    public final List a(vd0.c cVar) {
        int i13 = 0;
        switch (this.f115646a) {
            case 7:
                vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
                ArrayList arrayList = new ArrayList();
                int d2 = o13.d();
                while (i13 < d2) {
                    Object e13 = vd0.c.f125622b.e(o13.j(i13).f125623a, wy0.class);
                    Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.User");
                    arrayList.add((wy0) e13);
                    i13++;
                }
                return arrayList;
            default:
                vd0.a o14 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
                ArrayList arrayList2 = new ArrayList();
                int d13 = o14.d();
                while (i13 < d13) {
                    Object e14 = vd0.c.f125622b.e(o14.j(i13).f125623a, v7.class);
                    Intrinsics.g(e14, "null cannot be cast to non-null type com.pinterest.api.model.Board");
                    arrayList2.add((v7) e14);
                    i13++;
                }
                return arrayList2;
        }
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        switch (this.f115646a) {
            case 0:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m13 = pinterestJsonObject.m("data");
                if (m13 != null) {
                    pinterestJsonObject = m13;
                }
                Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, z.class);
                Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.AdHandshakeLoginUrl");
                return (z) e13;
            case 1:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m14 = pinterestJsonObject.m("data");
                if (m14 != null) {
                    pinterestJsonObject = m14;
                }
                Object e14 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, j1.class);
                Intrinsics.g(e14, "null cannot be cast to non-null type com.pinterest.api.model.AdsHandshakeApiKey");
                return (j1) e14;
            case 2:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m15 = pinterestJsonObject.m("data");
                if (m15 != null) {
                    pinterestJsonObject = m15;
                }
                Object e15 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, n1.class);
                Intrinsics.g(e15, "null cannot be cast to non-null type com.pinterest.api.model.AdsHandshakeToken");
                return (n1) e15;
            case 3:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m16 = pinterestJsonObject.m("data");
                return new b20.a(m16 != null ? m16.d("nonce") : null);
            case 4:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m17 = pinterestJsonObject.m("data");
                return new b20.b(m17 != null ? m17.d("access_token") : null, m17 != null ? m17.d("old_session_id") : null);
            case 5:
                vd0.a o13 = o.o(pinterestJsonObject, "pinterestJsonObject", "data", "optJsonArray(...)");
                ArrayList arrayList = new ArrayList();
                int d2 = o13.d();
                for (int i13 = 0; i13 < d2; i13++) {
                    Object e16 = vd0.c.f125622b.e(o13.j(i13).f125623a, mj.class);
                    Intrinsics.g(e16, "null cannot be cast to non-null type com.pinterest.api.model.EnforcementAction");
                    arrayList.add((mj) e16);
                }
                String o14 = pinterestJsonObject.o("bookmark", "");
                Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
                return new p02.b(arrayList, o14);
            case 6:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m18 = pinterestJsonObject.m("data");
                Object e17 = m18 != null ? vd0.c.f125622b.e(m18.f125623a, v.class) : null;
                Intrinsics.g(e17, "null cannot be cast to non-null type com.pinterest.reportFlow.feature.rvc.model.StatementOfReasons");
                return (v) e17;
            case 7:
                return a(pinterestJsonObject);
            case 8:
                return a(pinterestJsonObject);
            case 9:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                Object e18 = vd0.c.f125622b.e(pinterestJsonObject.f125623a.v("data").i(), x50.class);
                Intrinsics.g(e18, "null cannot be cast to non-null type com.pinterest.api.model.PinTranslations");
                return (x50) e18;
            default:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                vd0.c m19 = pinterestJsonObject.m("data");
                return new e(m19 != null ? m19.d("oauth_token_secret") : null, m19 != null ? m19.d("login_url") : null);
        }
    }
}
