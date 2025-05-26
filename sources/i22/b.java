package i22;

import com.pinterest.api.model.ln0;
import dl1.m;
import dl1.p;
import dl1.s;
import dl1.u;
import fk2.h;
import gw1.i;
import ja.f0;
import ja.j0;
import java.util.List;
import jk2.h0;
import kk2.g;
import kotlin.jvm.internal.Intrinsics;
import lb0.o;
import lb0.r;
import tk2.e;
import uj2.b0;
import uj2.q;
import x02.e0;
import xd0.f;

/* loaded from: classes2.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f71441a;

    /* renamed from: b, reason: collision with root package name */
    public final de0.d f71442b;

    /* renamed from: c, reason: collision with root package name */
    public final r f71443c;

    /* renamed from: d, reason: collision with root package name */
    public ln0 f71444d;

    public b(o userPreferences, b60.b activeUserManager, de0.d draftDataProvider, r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f71441a = activeUserManager;
        this.f71442b = draftDataProvider;
        this.f71443c = prefsManagerUser;
    }

    @Override // dl1.y
    public final q b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        String draftId = params.a();
        de0.d dVar = this.f71442b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        f fVar = dVar.f54556a;
        fVar.getClass();
        f0 d2 = f0.d(1, "SELECT EXISTS(SELECT * FROM idea_pin_drafts WHERE id = ?)");
        d2.c1(1, draftId);
        q u13 = new g(new kk2.m(j0.b(new xd0.c(fVar, d2, 1)), new b22.f(8, new i(19, this, params)), 0), new e0(22, new s12.a(this, 3)), 3).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // dl1.p
    public final boolean c(m mVar, s sVar) {
        u params = (u) mVar;
        ln0 model = (ln0) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f71444d = model;
        String uid = com.bumptech.glide.d.Q(this.f71441a).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        Object d2 = this.f71442b.d(model, uid).r(e.f118017c).d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        return ((Boolean) d2).booleanValue();
    }

    @Override // dl1.p
    public final s e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        ln0 ln0Var = this.f71444d;
        if (Intrinsics.d(ln0Var != null ? ln0Var.q() : null, params.a())) {
            return this.f71444d;
        }
        return null;
    }

    @Override // dl1.p
    public final boolean f(List params, List models) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(models, "models");
        return false;
    }

    @Override // dl1.p
    public final boolean g(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        ln0 ln0Var = this.f71444d;
        if (ln0Var != null && Intrinsics.d(ln0Var.q(), params.a())) {
            this.f71444d = null;
        }
        String draftId = params.a();
        de0.d dVar = this.f71442b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        f fVar = dVar.f54556a;
        fVar.getClass();
        Object d2 = de0.d.e(new h(new f0.e(5, fVar, draftId), 2)).r(e.f118017c).d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        return ((Boolean) d2).booleanValue();
    }

    @Override // dl1.p
    public final b0 i(List paramsList) {
        Intrinsics.checkNotNullParameter(paramsList, "paramsList");
        hk2.o h10 = b0.h(h0.f76488a);
        Intrinsics.checkNotNullExpressionValue(h10, "fromObservable(...)");
        return h10;
    }
}
