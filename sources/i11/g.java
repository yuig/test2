package i11;

import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.z2;
import lh0.z3;
import m60.x0;
import uj2.a0;
import yk1.v;

/* loaded from: classes5.dex */
public final class g extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f70972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f70973c;

    public /* synthetic */ g(m mVar, int i13) {
        this.f70972b = i13;
        this.f70973c = mVar;
    }

    @Override // uj2.v
    public final void a() {
    }

    @Override // uj2.v
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.f70972b) {
            case 0:
                e((BoardFeed) obj);
                break;
            default:
                e((BoardFeed) obj);
                break;
        }
    }

    public final void e(BoardFeed feed) {
        dl1.s C;
        int intValue;
        int i13 = this.f70972b;
        m mVar = this.f70973c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(feed, "feed");
                m.D3(mVar);
                if (mVar.f71005i.a("enabled_first_in_top_choices", z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                    feed.h(mVar.I);
                }
                Iterator it = mVar.X.iterator();
                while (it.hasNext()) {
                    v7 v7Var = (v7) it.next();
                    if (!feed.y(v7Var)) {
                        if (!feed.v()) {
                            feed.B();
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(v7Var);
                        arrayList.addAll(feed.f35557i);
                        feed.H(arrayList);
                    }
                }
                if (mVar.isBound()) {
                    ((l11.j) ((f11.d) mVar.getView())).E8(0, false);
                }
                int min = Math.min(feed.n(), 4);
                for (int i14 = 0; i14 < min; i14++) {
                    v7 v7Var2 = (v7) feed.k(i14);
                    if (v7Var2 != null) {
                        mVar.S.set(i14, v7Var2);
                        mVar.u1(i14, v7Var2);
                    }
                }
                if (min < 4) {
                    ArrayList arrayList2 = mVar.S;
                    arrayList2.subList(min, arrayList2.size()).clear();
                    if (min >= 0) {
                        ArrayList arrayList3 = mVar.f126435b;
                        if (4 <= arrayList3.size()) {
                            arrayList3.subList(min, 4).clear();
                            Object adapter = mVar.getAdapter();
                            if (adapter != null) {
                                ((b2) adapter).o(min, 4);
                            }
                        }
                    }
                }
                if (min > 0) {
                    a0 a0Var = tk2.e.f118017c;
                    xj2.c F = mVar.f70998e0.A(a0Var).H(a0Var).F(new a11.f(25, new d(mVar, 7)), new a11.f(26, a.f70959n), ck2.i.f27923c, ck2.i.f27924d);
                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                    mVar.addDisposable(F);
                }
                dl1.s sVar = (dl1.s) mVar.getItem(min);
                if (sVar != null) {
                    mVar.u1(min, sVar);
                }
                mVar.U = true;
                if (mVar.T) {
                    ((l11.j) ((f11.d) mVar.getView())).W8();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(feed, "feed");
                mVar.f70994c0 = feed;
                ArrayList boardList = m.F3(feed);
                Intrinsics.checkNotNullParameter(boardList, "boardList");
                z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                z2 z2Var = mVar.f71005i;
                boolean a13 = z2Var.a("enabled_first_in_your_boards", z3Var);
                v7 v7Var3 = mVar.I;
                if (a13 || z2Var.a("employees", z3Var)) {
                    boardList.add(0, v7Var3);
                } else if (z2Var.a("enabled_last_in_your_boards", z3Var)) {
                    boardList.add(v7Var3);
                } else {
                    boolean a14 = z2Var.a("enabled_alphabetically_as_profile", z3Var);
                    v vVar = mVar.f71003h;
                    if (a14) {
                        m.J3(boardList, v7Var3, ((yk1.a) vVar).f139224a.getString(x0.profile));
                    } else if (z2Var.a("enabled_alphabetically_as_add_to_profile", z3Var)) {
                        m.J3(boardList, v7Var3, ((yk1.a) vVar).f139224a.getString(e02.e.add_to_profile));
                    }
                }
                mVar.P = boardList.size();
                if (mVar.X3()) {
                    mVar.u3(boardList);
                } else {
                    mVar.w3(boardList);
                    m.D3(mVar);
                    Iterator it2 = mVar.X.iterator();
                    while (it2.hasNext()) {
                        v7 v7Var4 = (v7) it2.next();
                        if (!feed.y(v7Var4)) {
                            mVar.f126435b.add(0, v7Var4);
                            Object adapter2 = mVar.getAdapter();
                            if (adapter2 != null) {
                                ((b2) adapter2).j(0);
                            }
                        }
                        mVar.P++;
                    }
                }
                if (mVar.f70991a0 && mVar.f71017r) {
                    List boards = mVar.d();
                    Intrinsics.checkNotNullParameter(boards, "boards");
                    Intrinsics.checkNotNullParameter(boards, "boards");
                    dl1.s sVar2 = (dl1.s) CollectionsKt.firstOrNull(boards);
                    String uid = sVar2 != null ? sVar2.getUid() : null;
                    String str = mVar.f71020u;
                    List b13 = (Intrinsics.d(uid, str) || (C = pe.i.C(str, boards)) == null) ? null : e0.b(C);
                    if (b13 != null) {
                        List boards2 = mVar.d();
                        Intrinsics.checkNotNullParameter(boards2, "boards");
                        dl1.s C2 = pe.i.C(str, boards2);
                        Integer valueOf = C2 != null ? Integer.valueOf(boards2.indexOf(C2)) : null;
                        if (valueOf != null && (intValue = valueOf.intValue()) > 0) {
                            mVar.removeItem(intValue);
                        }
                        mVar.w3(b13);
                    }
                }
                if (mVar.isBound()) {
                    ((l11.j) ((f11.d) mVar.getView())).setLoadState(yk1.i.LOADED);
                    ((l11.j) ((f11.d) mVar.getView())).E8(0, false);
                }
                mVar.T = true;
                if (mVar.U) {
                    ((l11.j) ((f11.d) mVar.getView())).W8();
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable throwable) {
        int i13 = this.f70972b;
        m mVar = this.f70973c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                String message = throwable.getMessage();
                if (message != null) {
                    ((l11.j) ((f11.d) mVar.getView())).w3(message);
                }
                f11.d dVar = (f11.d) mVar.getView();
                throwable.getMessage();
                ((l11.j) dVar).X8();
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (mVar.isBound()) {
                    ((l11.j) ((f11.d) mVar.getView())).g0(f02.g.board_picker_loading_error);
                    f11.d dVar2 = (f11.d) mVar.getView();
                    throwable.getMessage();
                    ((l11.j) dVar2).X8();
                    ((l11.j) ((f11.d) mVar.getView())).setLoadState(yk1.i.LOADED);
                    break;
                }
                break;
        }
    }
}
