package qj0;

import com.pinterest.api.model.v7;
import df.j1;
import g70.h;
import h32.f1;
import h32.g0;
import h32.u0;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.w;
import nx.d0;
import x02.x0;
import x22.c;
import yk1.v;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final k f104011a;

    /* renamed from: b, reason: collision with root package name */
    public final q f104012b;

    /* renamed from: c, reason: collision with root package name */
    public final v f104013c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f104014d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f104015e;

    /* renamed from: f, reason: collision with root package name */
    public final h f104016f;

    public b(k toastUtils, w eventManager, q prefsManagerPersisted, v resources, d0 pinalytics, x0 boardRepository, h boardNavigator) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f104011a = toastUtils;
        this.f104012b = prefsManagerPersisted;
        this.f104013c = resources;
        this.f104014d = pinalytics;
        this.f104015e = boardRepository;
        this.f104016f = boardNavigator;
    }

    public final boolean a(String str, String boardName, boolean z13) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        if (z13) {
            return false;
        }
        q qVar = this.f104012b;
        String d2 = qVar.d("PREF_LAST_NEW_IDEAS_POST_REPIN_UPSELL_BOARD_ID", null);
        if (d2 == null) {
            d2 = "";
        }
        qVar.i("PREF_LAST_NEW_IDEAS_POST_REPIN_UPSELL_COUNT", Intrinsics.d(str, d2) ? qVar.g("PREF_LAST_NEW_IDEAS_POST_REPIN_UPSELL_COUNT", 0) + 1 : 1);
        qVar.b("PREF_LAST_NEW_IDEAS_POST_REPIN_UPSELL_BOARD_ID", str);
        v7 v7Var = (v7) this.f104015e.O(str);
        if (v7Var != null && Intrinsics.d(v7Var.w1(), Boolean.TRUE)) {
            String d13 = qVar.d("PREF_LAST_NEW_IDEAS_POST_REPIN_UPSELL_BOARD_ID", null);
            if (Intrinsics.d(str, d13 != null ? d13 : "") && qVar.g("PREF_LAST_NEW_IDEAS_POST_REPIN_UPSELL_COUNT", 0) >= 3) {
                c cVar = c.POST_REPIN_TOAST;
                this.f104014d.N(f1.VIEW, u0.BOARD_MORE_IDEAS_UPSELL_TOAST, g0.TOAST, str, false);
                yk1.a aVar = (yk1.a) this.f104013c;
                CharSequence a03 = j1.a0(aVar.f139224a.getString(m60.x0.saved_onto_board_bold, boardName));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                this.f104011a.c(new sj0.a(a03, aVar.f139224a.getString(f70.c.more_ideas_tab_upsell_toast_subtitle), new a(this, str, cVar)));
                return true;
            }
        }
        return false;
    }
}
