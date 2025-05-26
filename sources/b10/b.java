package b10;

import com.pinterest.api.model.b30;
import com.pinterest.api.model.k60;
import com.pinterest.api.model.s10;
import com.pinterest.api.model.v10;
import kotlin.jvm.internal.Intrinsics;
import x40.mi;
import x40.ni;
import x40.oi;

/* loaded from: classes.dex */
public final class b implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final uf0.b f20846a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.b f20847b;

    public b(a10.b contactPhoneCountryAdapter, a10.b profilePlaceAdapter) {
        Intrinsics.checkNotNullParameter(contactPhoneCountryAdapter, "contactPhoneCountryAdapter");
        Intrinsics.checkNotNullParameter(profilePlaceAdapter, "profilePlaceAdapter");
        this.f20846a = contactPhoneCountryAdapter;
        this.f20847b = profilePlaceAdapter;
    }

    public static void c(Object obj, a aVar) {
        if (obj != null) {
            aVar.invoke();
        }
    }

    @Override // uf0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oi i(v10 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        Boolean H = plankModel.H();
        String id3 = plankModel.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return new oi("BizPartner", o13, H, id3, plankModel.B(), plankModel.E(), plankModel.C(), (mi) this.f20846a.k(plankModel), plankModel.G(), (ni) this.f20847b.k(plankModel), null);
    }

    @Override // uf0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v10 B(oi apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        s10 s10Var = new s10(0);
        c(apolloModel.f133001b, new a(s10Var, apolloModel, 0));
        c(apolloModel.f133002c, new a(s10Var, apolloModel, 1));
        c(apolloModel.f133003d, new a(s10Var, apolloModel, 2));
        c(apolloModel.f133004e, new a(s10Var, apolloModel, 3));
        c(apolloModel.f133005f, new a(s10Var, apolloModel, 4));
        c(apolloModel.f133006g, new a(s10Var, apolloModel, 5));
        b30 b30Var = (b30) this.f20846a.O(apolloModel);
        if (b30Var != null) {
            s10Var.f(b30Var);
        }
        c(apolloModel.f133008i, new a(s10Var, apolloModel, 6));
        k60 k60Var = (k60) this.f20847b.O(apolloModel);
        if (k60Var != null) {
            s10Var.g(k60Var);
        }
        v10 a13 = s10Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
