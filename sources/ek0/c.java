package ek0;

import android.content.Context;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lb;
import com.pinterest.feature.board.create.view.BoardCreateBoardRepTile;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import fk0.k;
import h32.f1;
import i11.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;

/* loaded from: classes5.dex */
public final class c extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f59166d;

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f59164b = i13;
        this.f59165c = obj;
        this.f59166d = obj2;
    }

    @Override // uj2.v
    public final void a() {
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f59164b;
        Object obj2 = this.f59166d;
        Object obj3 = this.f59165c;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                ((h) obj2).f59183h = f30Var;
                String imageUrl = bs1.c.B0(f30Var);
                if (a0.x0(imageUrl)) {
                    return;
                }
                k kVar = (k) ((com.pinterest.feature.board.create.c) obj3);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                BoardCreateBoardRepTile boardCreateBoardRepTile = kVar.f62294j0;
                if (boardCreateBoardRepTile != null) {
                    boardCreateBoardRepTile.L(imageUrl);
                    return;
                } else {
                    Intrinsics.r("boardRep");
                    throw null;
                }
            case 1:
                List pendingBulkActions = (List) obj;
                Intrinsics.checkNotNullParameter(pendingBulkActions, "pendingBulkActions");
                List list = pendingBulkActions;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lb) it.next()).g());
                }
                kn0.d dVar = (kn0.d) obj3;
                if (arrayList.contains(Integer.valueOf(dVar.f80227b.getEventType().getValue()))) {
                    return;
                }
                kn0.b bVar = (kn0.b) obj2;
                w wVar = bVar.f80220d;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar.d(new m92.b());
                i92.k kVar2 = bVar.f80221e;
                if (kVar2 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                Context context = bVar.f80219c;
                if (context == null) {
                    Intrinsics.r("applicationContext");
                    throw null;
                }
                kVar2.m(dVar.f80228c.a(context).toString());
                w wVar2 = bVar.f80220d;
                if (wVar2 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar2.d(new kn0.c(dVar.f80227b, dVar.f80226a, dVar.f80229d, dVar.f80230e));
                dispose();
                return;
            case 2:
                e((BoardFeed) obj);
                return;
            default:
                e((BoardFeed) obj);
                return;
        }
    }

    public final void e(BoardFeed feed) {
        int i13 = this.f59164b;
        Object obj = this.f59166d;
        Object obj2 = this.f59165c;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(feed, "feed");
                int n13 = feed.n();
                if (n13 > 5 && n13 <= feed.f35557i.size()) {
                    while (n13 > 5) {
                        feed.f35557i.remove(5);
                        feed.f35559k.remove(5);
                        n13--;
                    }
                    feed.D();
                }
                m mVar = (m) obj2;
                mVar.getClass();
                mVar.u3(m.F3(feed));
                String str = (String) obj;
                mVar.Q = feed.n();
                ((l11.j) ((f11.d) mVar.getView())).W8();
                if (mVar.Q != 0) {
                    f1 f1Var = f1.VIEW;
                    f30 f30Var = mVar.K;
                    mVar.N.n(f1Var, -1, feed, null, str, f30Var != null ? f30Var.z4() : null);
                }
                mVar.R = feed;
                if (mVar.isBound()) {
                    ((l11.j) ((f11.d) mVar.getView())).E8(0, false);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(feed, "boardFeed");
                c71.a0 a0Var = (c71.a0) obj2;
                if (a0Var.isBound()) {
                    if (!feed.x()) {
                        a0Var.v3();
                        a0Var.u3(feed.q());
                        ((com.pinterest.feature.search.results.view.g0) ((h61.d) a0Var.getView())).a(true);
                        break;
                    } else {
                        String query = (String) obj;
                        com.pinterest.feature.search.results.view.g0 g0Var = (com.pinterest.feature.search.results.view.g0) ((h61.d) a0Var.getView());
                        g0Var.a(false);
                        SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) g0Var.f47791e;
                        searchGridMultiSectionFragment.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        searchGridMultiSectionFragment.F8(query);
                        break;
                    }
                }
                break;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable e13) {
        int i13 = this.f59164b;
        Object obj = this.f59165c;
        switch (i13) {
            case 0:
                break;
            case 1:
                Intrinsics.checkNotNullParameter(e13, "e");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(e13, "throwable");
                String message = e13.getMessage();
                if (message != null) {
                    ((l11.j) ((f11.d) ((m) obj).getView())).w3(message);
                }
                f11.d dVar = (f11.d) ((m) obj).getView();
                e13.getMessage();
                ((l11.j) dVar).X8();
                break;
            default:
                Intrinsics.checkNotNullParameter(e13, "e");
                c71.a0 a0Var = (c71.a0) obj;
                if (a0Var.isBound()) {
                    h61.d dVar2 = (h61.d) a0Var.getView();
                    yk1.i iVar = yk1.i.LOADED;
                    dVar2.getClass();
                    break;
                }
                break;
        }
    }

    public c(h hVar, com.pinterest.feature.board.create.c cVar) {
        this.f59164b = 0;
        this.f59166d = hVar;
        this.f59165c = cVar;
    }
}
