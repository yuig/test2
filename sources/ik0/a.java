package ik0;

import androidx.appcompat.widget.c2;
import ap.o;
import gi.m;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import uk1.d;
import x02.x0;
import yk1.b;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f72398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72399b;

    /* renamed from: c, reason: collision with root package name */
    public final w f72400c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f72401d;

    /* renamed from: e, reason: collision with root package name */
    public final c2 f72402e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f72403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String boardId, String str, d presenterPinalytics, w eventManager, o uploadContactsUtil, x0 boardRepository, m boardInviteUtils, v viewResources, c2 sharesheetUtils) {
        super(0);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f72398a = boardId;
        this.f72399b = str;
        this.f72400c = eventManager;
        this.f72401d = boardRepository;
        this.f72402e = sharesheetUtils;
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f72403f = d0Var;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        jk0.a view = (jk0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((jk0.d) view).f76381f = this;
    }
}
