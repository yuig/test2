package oc1;

import androidx.recyclerview.widget.b2;
import dl1.s;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sq0.c0;
import tk2.e;
import va1.m1;
import wk1.i;
import wk1.q;
import x02.x2;
import x10.d;
import yk2.g;

/* loaded from: classes5.dex */
public final class c extends q {

    /* renamed from: a, reason: collision with root package name */
    public final d f94056a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f94057b;

    /* renamed from: c, reason: collision with root package name */
    public final ic1.b f94058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d pinalytics, uj2.q networkStateStream, x2 userRepository, d settingsApi, b60.b activeUserManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f94056a = settingsApi;
        this.f94057b = activeUserManager;
        this.f94058c = new ic1.b(userRepository);
    }

    public static void t3(c cVar, nc1.b bVar, boolean z13, String str, boolean z14, int i13) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        cVar.getClass();
        g builder = new g();
        builder.put(bVar.j(), String.valueOf(z13));
        if (str != null) {
        }
        builder.put("user_confirm_skip_passcode", String.valueOf(z14));
        Unit unit = Unit.f80348a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        xj2.c o13 = cVar.f94056a.a(builder.c()).r(e.f118017c).l(wj2.c.a()).o(new ec1.a(9, new a(bVar, z13, cVar)), new ec1.a(10, new a(cVar, bVar, z13, 2)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        cVar.addDisposable(o13);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f94058c);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((pc1.d) ((mc1.a) getView())).C0 = null;
        super.onUnbind();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(mc1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        pc1.d dVar = (pc1.d) view;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.C0 = this;
    }

    public final void v3(m1 m1Var, boolean z13) {
        Object obj;
        Iterator it = CollectionsKt.F0(this.f94058c.f135191h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d((s) obj, m1Var)) {
                    break;
                }
            }
        }
        s sVar = (s) obj;
        if (sVar != null) {
            ((m1) sVar).f125210e = z13;
        }
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }
}
