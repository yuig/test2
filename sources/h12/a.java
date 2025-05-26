package h12;

import com.bumptech.glide.d;
import fk2.l;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import uj2.b0;
import x40.g;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f66466a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f66467b;

    /* renamed from: c, reason: collision with root package name */
    public final x92.b f66468c;

    public a(c boardInviteService, g0 pageSizeProvider, x92.b boardCollaboratorRemoteDataSource) {
        Intrinsics.checkNotNullParameter(boardInviteService, "boardInviteService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(boardCollaboratorRemoteDataSource, "boardCollaboratorRemoteDataSource");
        this.f66466a = boardInviteService;
        this.f66467b = pageSizeProvider;
        this.f66468c = boardCollaboratorRemoteDataSource;
    }

    public final b0 a() {
        return this.f66466a.b(n00.b.a(n00.c.BOARD_INVITE_NOTIFICATION), n00.b.a(n00.c.BOARD_INVITE_NOTIFICATION_EXTRA), this.f66467b.b());
    }

    public final l b(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        x92.b bVar = this.f66468c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        l h10 = d.u0(((oc.c) bVar.f134367d).a(new g(boardId))).i().h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }
}
