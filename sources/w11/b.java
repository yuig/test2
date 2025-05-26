package w11;

import kotlin.jvm.internal.Intrinsics;
import m60.w;
import sq0.c0;
import uk1.d;
import v11.c;
import v11.e;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class b extends q implements v11.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f127601a;

    /* renamed from: b, reason: collision with root package name */
    public final a f127602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String boardId, w eventManager, d presenterPinalytics, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f127601a = eventManager;
        this.f127602b = new a(boardId, this, getNetworkStateStream(), presenterPinalytics);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f127602b);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        x11.c cVar = (x11.c) view;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        cVar.B0 = this;
    }

    public final void u3() {
        this.f127601a.f(new e());
        if (isBound()) {
            ((x11.c) ((c) getView())).P7();
        }
    }
}
