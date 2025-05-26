package jk0;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.c2;
import ap.o;
import com.pinterest.component.modal.BaseModalViewWrapper;
import gi.m;
import jc0.n;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import x02.x0;
import yk1.l;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f76363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76364b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f76365c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f76366d;

    /* renamed from: e, reason: collision with root package name */
    public final w f76367e;

    /* renamed from: f, reason: collision with root package name */
    public final o f76368f;

    /* renamed from: g, reason: collision with root package name */
    public final v f76369g;

    /* renamed from: h, reason: collision with root package name */
    public final m f76370h;

    /* renamed from: i, reason: collision with root package name */
    public final hk0.m f76371i;

    /* renamed from: j, reason: collision with root package name */
    public final uk1.e f76372j;

    /* renamed from: k, reason: collision with root package name */
    public final c2 f76373k;

    /* renamed from: l, reason: collision with root package name */
    public d f76374l;

    public b(String boardId, String str, d0 pinalytics, x0 boardRepository, w eventManager, o uploadContactsUtil, yk1.a viewResources, m boardInviteUtils, hk0.m sourceModelType, uk1.e presenterPinalyticsFactory, c2 sharesheetUtils) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(sourceModelType, "sourceModelType");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f76363a = boardId;
        this.f76364b = str;
        this.f76365c = pinalytics;
        this.f76366d = boardRepository;
        this.f76367e = eventManager;
        this.f76368f = uploadContactsUtil;
        this.f76369g = viewResources;
        this.f76370h = boardInviteUtils;
        this.f76371i = sourceModelType;
        this.f76372j = presenterPinalyticsFactory;
        this.f76373k = sharesheetUtils;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = new d(context, this.f76365c, this.f76371i);
        this.f76374l = dVar;
        n nVar = new n(context);
        nVar.x(dVar);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        uk1.d f13;
        f13 = ((uk1.a) this.f76372j).f(this.f76365c, "");
        return new ik0.a(this.f76363a, this.f76364b, f13, this.f76367e, this.f76368f, this.f76366d, this.f76370h, this.f76369g, this.f76373k);
    }

    @Override // yk1.l
    public final yk1.n getView() {
        d dVar = this.f76374l;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("boardActionsView");
        throw null;
    }
}
