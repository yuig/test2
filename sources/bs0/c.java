package bs0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import fk2.m;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import n60.o;
import vb0.j;
import yk1.v;

/* loaded from: classes5.dex */
public final class c implements vk1.a {

    /* renamed from: a, reason: collision with root package name */
    public final jo1.a f23850a;

    /* renamed from: b, reason: collision with root package name */
    public final j22.b f23851b;

    /* renamed from: c, reason: collision with root package name */
    public final v f23852c;

    /* renamed from: d, reason: collision with root package name */
    public final x10.b f23853d;

    /* renamed from: e, reason: collision with root package name */
    public final w f23854e;

    public c(jo1.a baseFragmentType, j22.b searchService, v viewResources, x10.b pinApiService, w eventManager) {
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f23850a = baseFragmentType;
        this.f23851b = searchService;
        this.f23852c = viewResources;
        this.f23853d = pinApiService;
        this.f23854e = eventManager;
    }

    @Override // vk1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uj2.b a(a params) {
        uj2.b m13;
        Intrinsics.checkNotNullParameter(params, "params");
        f30 f30Var = params.f23845a;
        oc0 d63 = f30Var.d6();
        String j13 = d63 != null ? d63.j() : null;
        if (j13 == null) {
            j13 = "";
        }
        int R = b40.R(j13);
        boolean y13 = o.y(f30Var, "getIsThirdPartyAd(...)");
        x10.b bVar = this.f23853d;
        String str = params.f23847c;
        if (y13) {
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            return bVar.b(uid, l32.c.BLOCK_SINGLE_PFY_PIN.value(), str);
        }
        if (b40.c0(f30Var)) {
            String uid2 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            return bVar.f(uid2, l32.c.BLOCK_SINGLE_PFY_PIN.value(), str);
        }
        if (b40.b0(f30Var)) {
            String uid3 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            int value = l32.c.BLOCK_SINGLE_PFY_PIN.value();
            String z13 = dn.c.z(f30Var);
            oc0 d64 = f30Var.d6();
            return this.f23853d.k(uid3, value, z13, R, str, null, d64 != null ? k3.U1(d64) : null);
        }
        String str2 = params.f23846b;
        if (str2 == null) {
            str2 = ((yk1.a) this.f23852c).f139224a.getString(x0.my_search);
        }
        int[] iArr = b.f23849a;
        jo1.a aVar = this.f23850a;
        int i13 = iArr[aVar.ordinal()];
        j22.b bVar2 = this.f23851b;
        switch (i13) {
            case 1:
                String uid4 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                m13 = bVar2.m(uid4, str2, str);
                break;
            case 2:
                if (!Intrinsics.d(params.f23848d, "search")) {
                    String uid5 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                    m13 = bVar.l(uid5, str);
                    break;
                } else {
                    String uid6 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                    m13 = bVar2.m(uid6, str2, str);
                    break;
                }
            case 3:
            case 4:
            case 5:
            case 6:
                String uid7 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid7, "getUid(...)");
                m13 = bVar.j(uid7);
                break;
            case 7:
                String uid8 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid8, "getUid(...)");
                m13 = this.f23853d.k(uid8, l32.c.BLOCK_SINGLE_PFY_PIN.value(), null, bi0.c.NOTIFICATION_NEWS_HUB.getValue(), str, null, null).e(new fp.a(13, this, f30Var));
                break;
            default:
                j.f125466a.G(a.a.j("This line should never be reached, ", "BaseFragmentType: " + aVar + ", Pin uid: " + f30Var.getUid()), new Object[0]);
                m13 = m.f62459a;
                break;
        }
        Intrinsics.f(m13);
        return m13;
    }
}
