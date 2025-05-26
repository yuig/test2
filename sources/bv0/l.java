package bv0;

import android.content.Context;
import com.pinterest.api.model.wy0;
import cv0.z;
import dl1.t;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import uj2.q;
import x02.x0;
import x02.z0;

/* loaded from: classes5.dex */
public final class l extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final Context f23941k;

    /* renamed from: l, reason: collision with root package name */
    public final String f23942l;

    /* renamed from: m, reason: collision with root package name */
    public final uk1.d f23943m;

    /* renamed from: n, reason: collision with root package name */
    public final yk1.a f23944n;

    /* renamed from: o, reason: collision with root package name */
    public final t f23945o;

    /* renamed from: p, reason: collision with root package name */
    public final ag1.h f23946p;

    /* renamed from: q, reason: collision with root package name */
    public final x0 f23947q;

    /* renamed from: r, reason: collision with root package name */
    public final z0 f23948r;

    /* renamed from: s, reason: collision with root package name */
    public final av0.f f23949s;

    /* renamed from: t, reason: collision with root package name */
    public final s1 f23950t;

    /* renamed from: u, reason: collision with root package name */
    public final av0.h f23951u;

    /* renamed from: v, reason: collision with root package name */
    public final av0.e f23952v;

    /* renamed from: w, reason: collision with root package name */
    public final av0.i f23953w;

    /* renamed from: x, reason: collision with root package name */
    public final b60.b f23954x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f23955y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String draftId, du0.b presenterPinalytics, yk1.a viewResources, t storyPinLocalDataRepository, ag1.h sessionDataManager, x0 boardRepository, z0 boardSectionRepository, av0.f navigationListener, s1 experiments, av0.h saveListener, av0.e linkValidationListener, av0.i ideaPinScheduleDateUpdateListener, b60.b activeUserManager) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(sessionDataManager, "sessionDataManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(navigationListener, "navigationListener");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(saveListener, "saveListener");
        Intrinsics.checkNotNullParameter(linkValidationListener, "linkValidationListener");
        Intrinsics.checkNotNullParameter(ideaPinScheduleDateUpdateListener, "ideaPinScheduleDateUpdateListener");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f23941k = context;
        this.f23942l = draftId;
        this.f23943m = presenterPinalytics;
        this.f23944n = viewResources;
        this.f23945o = storyPinLocalDataRepository;
        this.f23946p = sessionDataManager;
        this.f23947q = boardRepository;
        this.f23948r = boardSectionRepository;
        this.f23949s = navigationListener;
        this.f23950t = experiments;
        this.f23951u = saveListener;
        this.f23952v = linkValidationListener;
        this.f23953w = ideaPinScheduleDateUpdateListener;
        this.f23954x = activeUserManager;
        wy0 f13 = ((b60.d) activeUserManager).f();
        this.f23955y = f13 != null ? Intrinsics.d(f13.G3(), Boolean.TRUE) : false;
        o(7, new pk0.b(12));
        o(9, new pk0.b(11));
        o(10, new pk0.b(18));
        o(0, new pk0.b(15));
        o(1, new gv0.a(context));
        o(5, new pk0.b(14));
        o(6, new pk0.b(13));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object obj = CollectionsKt.F0(this.f135191h).get(i13);
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f53309a;
        }
        return -1;
    }

    @Override // xk1.c
    public final q k() {
        q t13 = ((dl1.l) this.f23945o).S(this.f23942l).t(new wr0.l(27, new au0.f(this, 11)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }
}
