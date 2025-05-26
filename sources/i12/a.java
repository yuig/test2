package i12;

import com.pinterest.api.model.ua;
import dl1.m;
import dl1.p;
import dl1.s;
import dl1.u;
import hk2.o;
import java.util.List;
import jk2.h0;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.q;

/* loaded from: classes4.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public ua f71058a;

    @Override // dl1.y
    public final q b(m mVar) {
        q qVar;
        String str;
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        ua uaVar = this.f71058a;
        if (uaVar != null) {
            qVar = q.y(uaVar);
            str = "just(...)";
        } else {
            qVar = h0.f76488a;
            str = "empty(...)";
        }
        Intrinsics.checkNotNullExpressionValue(qVar, str);
        return qVar;
    }

    @Override // dl1.p
    public final boolean c(m mVar, s sVar) {
        u params = (u) mVar;
        ua model = (ua) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f71058a = model;
        return true;
    }

    @Override // dl1.p
    public final s e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f71058a;
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
        this.f71058a = null;
        return true;
    }

    @Override // dl1.p
    public final b0 i(List paramsList) {
        Intrinsics.checkNotNullParameter(paramsList, "paramsList");
        o h10 = b0.h(h0.f76488a);
        Intrinsics.checkNotNullExpressionValue(h10, "fromObservable(...)");
        return h10;
    }
}
