package pm0;

import androidx.appcompat.widget.c2;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final x92.b f100697a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f100698b;

    /* renamed from: c, reason: collision with root package name */
    public final ap.o f100699c;

    /* renamed from: d, reason: collision with root package name */
    public final c2 f100700d;

    /* renamed from: e, reason: collision with root package name */
    public final gi.m f100701e;

    /* renamed from: f, reason: collision with root package name */
    public final nx.f0 f100702f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f100703g;

    public u(x92.b collaboratorRemoteDataSource, x0 boardRepository, ap.o uploadContactsUtil, c2 sharesheetUtils, gi.m boardInviteUtils, nx.f0 pinalyticsFactory, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(collaboratorRemoteDataSource, "collaboratorRemoteDataSource");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f100697a = collaboratorRemoteDataSource;
        this.f100698b = boardRepository;
        this.f100699c = uploadContactsUtil;
        this.f100700d = sharesheetUtils;
        this.f100701e = boardInviteUtils;
        this.f100702f = pinalyticsFactory;
        this.f100703g = eventManager;
    }
}
