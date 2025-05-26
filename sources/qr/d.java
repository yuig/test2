package qr;

import android.net.Uri;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.v7;
import df.j1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uj2.d0;
import xk2.v;
import zp.j0;

/* loaded from: classes3.dex */
public class d implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f104895a;

    /* renamed from: b, reason: collision with root package name */
    public final List f104896b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104897c;

    /* renamed from: d, reason: collision with root package name */
    public final gw f104898d;

    /* renamed from: e, reason: collision with root package name */
    public final h f104899e;

    /* renamed from: f, reason: collision with root package name */
    public final g70.h f104900f;

    /* renamed from: g, reason: collision with root package name */
    public final v f104901g;

    /* renamed from: h, reason: collision with root package name */
    public final v f104902h;

    /* renamed from: i, reason: collision with root package name */
    public final v f104903i;

    public d(Uri uri, List segments, String str, gw modelHelper, h webhookDeepLinkUtil, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(webhookDeepLinkUtil, "webhookDeepLinkUtil");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f104895a = uri;
        this.f104896b = segments;
        this.f104897c = str;
        this.f104898d = modelHelper;
        this.f104899e = webhookDeepLinkUtil;
        this.f104900f = boardNavigator;
        this.f104901g = xk2.m.b(c.f104894i);
        this.f104902h = xk2.m.b(new b(this, 1));
        this.f104903i = xk2.m.b(new b(this, 0));
    }

    @Override // uj2.d0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSuccess(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Uri uri = this.f104895a;
        if (uri.getBooleanQueryParameter("accept_invite", false)) {
            h12.a aVar = (h12.a) this.f104902h.getValue();
            String uid = board.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            fk2.c l13 = aVar.b(uid).h(wj2.c.a()).l(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
            nl.b.r(l13, new j0(11, board, this), null, 2);
        }
        String boardId = board.getUid();
        Intrinsics.checkNotNullExpressionValue(boardId, "getUid(...)");
        h hVar = this.f104899e;
        boolean f13 = hVar.f104943d.f();
        boolean T0 = j1.T0(uri);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        sr.d dVar = hVar.f104944e;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        dVar.a(boardId, f13, T0, false, false);
        hVar.a(false);
        hVar.q();
    }

    @Override // uj2.d0
    public final void b(xj2.c d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
    }

    @Override // uj2.d0
    public final void onError(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean c13 = qb0.d.f103396a.c();
        h hVar = this.f104899e;
        if (!c13) {
            hVar.q();
            return;
        }
        boolean i13 = ((b60.d) ((b60.b) this.f104903i.getValue())).i();
        hVar.j(this.f104895a, this.f104896b, this.f104897c, i13, "");
    }
}
