package o51;

import android.content.Context;
import b60.b;
import h32.f1;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import n00.c;
import qz.f0;
import so.oa;
import uk1.d;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final String f92912a;

    /* renamed from: b, reason: collision with root package name */
    public final n51.a f92913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z13, String commentId, yk1.a viewResources, b activeUserManager, uj2.q networkStateStream, g0 pageSizeProvider, d presenterPinalytics) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f92912a = commentId;
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        String k13 = a.a.k(z13 ? "aggregated_comments/" : "did_it/", commentId, "/reacted_by/");
        Context context = kb0.a.f79058b;
        n51.a aVar = new n51.a(k13, new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Ic.get()}, null, null, null, null, null, null, 0L, 2044);
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(c.USER_REACTION));
        f0Var.e("page_size", pageSizeProvider.d());
        aVar.f49121k = f0Var;
        aVar.o(0, new p51.c(viewResources, activeUserManager));
        this.f92913b = aVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f92913b);
    }

    @Override // wk1.q, yk1.b
    public final void onCreate() {
        super.onCreate();
        getPinalytics().U(new i0(getPresenterPinalytics().j(), getPresenterPinalytics().i(), null, getPresenterPinalytics().f(), null, null), f1.COMMENT_USER_REACTIONS_VIEWED, this.f92912a, null, null, false);
    }
}
