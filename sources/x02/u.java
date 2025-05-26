package x02;

import com.pinterest.api.model.e30;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i3;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends dl1.l {

    /* renamed from: v, reason: collision with root package name */
    public final se2.a f131494v;

    /* renamed from: w, reason: collision with root package name */
    public final lb0.r f131495w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy, se2.a lazyPinRepository, lb0.r prefsManagerUser) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(lazyPinRepository, "lazyPinRepository");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f131494v = lazyPinRepository;
        this.f131495w = prefsManagerUser;
    }

    public static uj2.q a0(int i13, u uVar, String parentId, String text, String str, List textTags, boolean z13) {
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        uVar.getClass();
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        uVar.e0();
        return uVar.k(new f(parentId, text, str, null, textTags, z13));
    }

    public final jk2.a0 b0(String aggregatedPinDataId, String pinId, String str, String str2, String str3, List textTags, boolean z13) {
        Intrinsics.checkNotNullParameter(aggregatedPinDataId, "aggregatedPinDataId");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        e0();
        j0(1, pinId);
        jk2.a0 q13 = k(new g(aggregatedPinDataId, pinId, str, textTags, z13, str2 != null ? new d(str2, w22.c.STICKER.getValue()) : null, str3)).q(new yx1.l(25, new r(this, pinId)));
        Intrinsics.checkNotNullExpressionValue(q13, "doOnError(...)");
        return q13;
    }

    public final jk2.a0 c0(String parentId, String text, String str, String str2, List textTags, boolean z13) {
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textTags, "textTags");
        e0();
        if (str != null) {
            j0(1, str);
        }
        jk2.a0 q13 = k(new e(parentId, text, textTags, str, str2, z13)).q(new yx1.l(24, new r(str, this)));
        Intrinsics.checkNotNullExpressionValue(q13, "doOnError(...)");
        return q13;
    }

    public final hk2.u d0(z2 model, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        l lVar = new l(id3, str, z13);
        y2 c03 = model.c0();
        c03.f43886i = Boolean.TRUE;
        boolean[] zArr = c03.f43903z;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
        Unit unit = Unit.f80348a;
        uj2.l G = G(lVar, c03.a());
        G.getClass();
        hk2.u uVar = new hk2.u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final void e0() {
        lb0.r rVar = this.f131495w;
        rVar.h("PREF_COMMENT_ACTION_TAKEN_COUNT", rVar.g("PREF_COMMENT_ACTION_TAKEN_COUNT", 0) + 1);
    }

    public final hk2.k f0(z2 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        e0();
        Boolean Q = model.Q();
        Intrinsics.checkNotNullExpressionValue(Q, "getMarkedHelpfulByMe(...)");
        int i13 = 0;
        int i14 = 1;
        W(Q.booleanValue() ? n10.a.b(n10.a.a(model, true), false) : n10.a.a(model, true));
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        m mVar = new m(id3, str);
        Boolean Q2 = model.Q();
        Intrinsics.checkNotNullExpressionValue(Q2, "getMarkedHelpfulByMe(...)");
        uj2.l G = G(mVar, Q2.booleanValue() ? n10.a.b(n10.a.a(model, true), false) : n10.a.a(model, true));
        yx1.l lVar = new yx1.l(26, new s(this, model, i13));
        G.getClass();
        a2 a2Var = ck2.i.f27924d;
        hk2.k kVar = new hk2.k(new hk2.z(G, a2Var, a2Var, lVar, ck2.i.f27923c), new jr1.a(17, new t(model, this, str, i13)), i14);
        Intrinsics.checkNotNullExpressionValue(kVar, "flatMap(...)");
        return kVar;
    }

    public final hk2.u g0(z2 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        int i13 = 1;
        W(n10.a.d(model) ? n10.a.a(n10.a.b(model, true), false) : n10.a.b(model, true));
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new n(id3, str), n10.a.d(model) ? n10.a.a(n10.a.b(model, true), false) : n10.a.b(model, true));
        yx1.l lVar = new yx1.l(29, new s(this, model, i13));
        G.getClass();
        a2 a2Var = ck2.i.f27924d;
        hk2.u uVar = new hk2.u(new hk2.k(new hk2.z(G, a2Var, a2Var, lVar, ck2.i.f27923c), new jr1.a(18, new t(model, this, str, i13)), i13));
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final hk2.z h0(z2 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        W(n10.a.a(model, false));
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new o(id3, str), n10.a.a(model, false));
        yx1.l lVar = new yx1.l(27, new s(this, model, 2));
        G.getClass();
        a2 a2Var = ck2.i.f27924d;
        hk2.z zVar = new hk2.z(G, a2Var, a2Var, lVar, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(zVar, "doOnError(...)");
        return zVar;
    }

    public final hk2.u i0(z2 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        W(n10.a.b(model, false));
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.l G = G(new p(id3, str), n10.a.b(model, false));
        yx1.l lVar = new yx1.l(28, new s(this, model, 3));
        G.getClass();
        a2 a2Var = ck2.i.f27924d;
        hk2.u uVar = new hk2.u(new hk2.z(G, a2Var, a2Var, lVar, ck2.i.f27923c));
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final void j0(int i13, String str) {
        i3 i3Var;
        bf2.b bVar = (bf2.b) this.f131494v;
        f30 f30Var = (f30) ((i2) bVar.get()).O(str);
        if (f30Var != null) {
            f3 z33 = f30Var.z3();
            int max = Math.max((z33 != null ? z33.F() : 0).intValue() + i13, 0);
            f3 z34 = f30Var.z3();
            if (z34 != null) {
                i3Var = z34.P();
            } else {
                i3Var = new i3(0);
                i3Var.f38611a = UUID.randomUUID().toString();
                boolean[] zArr = i3Var.f38629s;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            }
            i3Var.f38616f = Integer.valueOf(max);
            boolean[] zArr2 = i3Var.f38629s;
            if (zArr2.length > 5) {
                zArr2[5] = true;
            }
            f3 a13 = i3Var.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            e30 R6 = f30Var.R6();
            R6.h(a13);
            ((i2) bVar.get()).W(R6.a());
        }
    }
}
