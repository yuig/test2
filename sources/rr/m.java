package rr;

import android.net.Uri;
import com.pinterest.api.model.gw;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final x02.x0 f109778g;

    /* renamed from: h, reason: collision with root package name */
    public final gw f109779h;

    /* renamed from: i, reason: collision with root package name */
    public final qq2.c f109780i;

    /* renamed from: j, reason: collision with root package name */
    public final h12.a f109781j;

    /* renamed from: k, reason: collision with root package name */
    public final g70.h f109782k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f109783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qr.h webhookDeeplinkUtil, x02.x0 boardRepository, gw modelHelper, qq2.c boardHelper, h12.a boardInviteApi, g70.h boardNavigator) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(boardHelper, "boardHelper");
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f109778g = boardRepository;
        this.f109779h = modelHelper;
        this.f109780i = boardHelper;
        this.f109781j = boardInviteApi;
        this.f109782k = boardNavigator;
    }

    @Override // rr.d0
    public final String a() {
        return this.f109783l ? "amp_board" : "board";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        boolean z13 = false;
        if (Intrinsics.d(pathSegments.get(0), "follow")) {
            pathSegments.remove(0);
            z13 = true;
        }
        qr.h hVar = this.f109723a;
        hVar.a(z13);
        List<String> pathSegments2 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        List<String> pathSegments3 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments3, "getPathSegments(...)");
        this.f109780i.o(uri, pathSegments2, this.f109778g, new qr.d(uri, pathSegments3, this.f109726d, this.f109779h, this.f109723a, this.f109782k));
        if (hVar.f104943d.e()) {
            return;
        }
        this.f109781j.a().r(tk2.e.f118017c).o(new ir.h(19, k.f109756l), new ir.h(20, k.f109757m));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (df.j1.f1(uri) && !CollectionsKt.L(ie0.a.f72199d, uri.getHost())) {
            return false;
        }
        if (uri.getPathSegments().size() == 3 && n60.o.x(uri, 0, "amp") && !ie0.a.a().contains(uri.getPathSegments().get(1))) {
            this.f109783l = true;
            return true;
        }
        if (uri.getPathSegments().size() == 3 && !ie0.a.a().contains(uri.getPathSegments().get(0)) && n60.o.x(uri, 2, "follow")) {
            return true;
        }
        if (uri.getPathSegments().size() == 2 && !ie0.a.a().contains(uri.getPathSegments().get(0))) {
            String str = uri.getPathSegments().get(1);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            String pathSegment = str;
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            if (!ie0.a.f72197b.contains(pathSegment)) {
                return true;
            }
        }
        return df.j1.X0(uri) && Intrinsics.d(uri.getHost(), "board") && uri.getPathSegments().size() > 0;
    }
}
