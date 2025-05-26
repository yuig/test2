package pa0;

import ab1.o;
import hk2.z;
import jk2.e0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import x02.a2;
import x02.x2;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class f extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99383a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f99384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f99384b = new e(this);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        switch (this.f99383a) {
            case 0:
                a view = (a) nVar;
                Intrinsics.checkNotNullParameter(view, "view");
                super.r3((r) view);
                e listener = (e) this.f99384b;
                Intrinsics.checkNotNullParameter(listener, "listener");
                ((c) view).f99379u0 = listener;
                break;
            default:
                p3((com.pinterest.feature.settings.passcode.f) nVar);
                break;
        }
    }

    public final void p3(com.pinterest.feature.settings.passcode.f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        e0 e0Var = new e0(((x2) this.f99384b).d0().Q("me"));
        o oVar = new o(10, new ob1.c(view, 0));
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        z zVar = new z(e0Var, oVar, a2Var, a2Var, cVar);
        hk2.b bVar = new hk2.b(new o(11, new ob1.c(view, 1)), new o(12, new ob1.c(view, 2)), cVar);
        zVar.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, x2 userRepository, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f99384b = userRepository;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        switch (this.f99383a) {
            case 0:
                a view = (a) rVar;
                Intrinsics.checkNotNullParameter(view, "view");
                super.r3((r) view);
                e listener = (e) this.f99384b;
                Intrinsics.checkNotNullParameter(listener, "listener");
                ((c) view).f99379u0 = listener;
                break;
            default:
                p3((com.pinterest.feature.settings.passcode.f) rVar);
                break;
        }
    }
}
