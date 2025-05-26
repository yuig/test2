package g51;

import a41.u;
import h32.u0;
import i01.r0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import sq0.c0;
import w01.e0;
import wk1.q;

/* loaded from: classes5.dex */
public final class e extends q implements d51.f {

    /* renamed from: a, reason: collision with root package name */
    public final e12.d f63598a;

    /* renamed from: b, reason: collision with root package name */
    public final w f63599b;

    /* renamed from: c, reason: collision with root package name */
    public final d51.n f63600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e12.d boardService, uk1.d presenterPinalytics, uj2.q networkStateStream, k22.m userService, w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f63598a = boardService;
        this.f63599b = eventManager;
        this.f63600c = new d51.n(userService, new e0(this, 22));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f63600c);
    }

    public final void i() {
        getPinalytics().X(u0.CLOSE_BUTTON);
        ((nl1.d) ((d51.g) getView())).D5();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(d51.g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        j51.e eVar = (j51.e) view;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.C0 = this;
    }

    public final void u3() {
        getPinalytics().X(u0.BOARD_RESTORE_BUTTON);
        addDisposable(this.f63598a.s(this.f63600c.f53706m).l(tk2.e.f118017c).i(new r0(4), new u(27, d.f63584j)));
        ((nl1.d) ((d51.g) getView())).D5();
        this.f63599b.f(new pg0.b());
    }
}
