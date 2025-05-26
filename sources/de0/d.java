package de0;

import android.content.Context;
import com.pinterest.api.model.ln0;
import fk2.f0;
import ja.j0;
import kg.n;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import sv.y;
import tb0.h;
import xd0.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f54556a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f54557b;

    /* renamed from: c, reason: collision with root package name */
    public final h f54558c;

    public d(d0 pinalytics, h crashReporting, f dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f54556a = dao;
        this.f54557b = pinalytics;
        this.f54558c = crashReporting;
    }

    public static f0 e(fk2.h hVar) {
        f0 m13 = hVar.q(Boolean.TRUE).m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m13, "onErrorReturnItem(...)");
        return m13;
    }

    public final double a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return n.k(context.getDatabasePath("pinterest-db").length());
        } catch (Throwable th3) {
            this.f54558c.o("IdeaPinDraftsRoom: Unable to retrieve database size", th3);
            return -1.0d;
        }
    }

    public final m b(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        f fVar = this.f54556a;
        fVar.getClass();
        ja.f0 d2 = ja.f0.d(1, "SELECT * FROM idea_pin_drafts WHERE id = ?");
        d2.c1(1, draftId);
        m k13 = j0.b(new xd0.c(fVar, d2, 0)).k(new lb0.c(14, c.f54553j));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final m c(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        f fVar = this.f54556a;
        fVar.getClass();
        fk2.h hVar = new fk2.h(new xd0.a(fVar, 0), 2);
        ja.f0 d2 = ja.f0.d(1, "SELECT id, is_broken, cover_image_path, page_count, duration, last_updated_at, exported_media, comment_reply_data, created_at FROM idea_pin_drafts WHERE user_id = ? ORDER BY last_updated_at DESC");
        d2.c1(1, userId);
        m k13 = hVar.c(j0.b(new xd0.c(fVar, d2, 3))).k(new lb0.c(11, new a(this, 1)));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final m d(ln0 data, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(data, "data");
        String q13 = data.q();
        f fVar = this.f54556a;
        fVar.getClass();
        ja.f0 d2 = ja.f0.d(1, "SELECT EXISTS(SELECT * FROM idea_pin_drafts WHERE id = ?)");
        d2.c1(1, q13);
        m mVar = new m(j0.b(new xd0.c(fVar, d2, 1)), new lb0.c(13, new y(userId, data, this, 17)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
