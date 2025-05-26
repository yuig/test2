package z31;

import ao2.j0;
import com.pinterest.api.model.wy0;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import l82.h;
import m60.w;
import so.y1;
import u50.r;
import y31.h0;
import yq.n;

/* loaded from: classes5.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final w f140801a;

    /* renamed from: b, reason: collision with root package name */
    public final yq.e f140802b;

    public e(w eventManager, yq.e pincodeCreateModalFactory) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pincodeCreateModalFactory, "pincodeCreateModalFactory");
        this.f140801a = eventManager;
        this.f140802b = pincodeCreateModalFactory;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        h0 request = (h0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        String uid = request.f136799a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        n nVar = n.USER;
        wy0 wy0Var = request.f136799a;
        this.f140801a.d(new v(((y1) this.f140802b).a(uid, nVar, wy0Var.n3(), dl2.b.j1(wy0Var)), false, 0L, 30));
    }
}
