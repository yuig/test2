package qp;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.activity.create.view.FloatingBoardPicker;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.boardsection.pincarousel.view.BoardSectionPinCarousel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import df.j1;
import go0.s;
import h32.f1;
import ho0.m;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import ls1.n;
import pk.a0;
import uj2.q;
import yq0.t;

/* loaded from: classes3.dex */
public final class g extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f104682c;

    public /* synthetic */ g(Object obj, int i13) {
        this.f104681b = i13;
        this.f104682c = obj;
    }

    @Override // uj2.v
    public final void a() {
        switch (this.f104681b) {
            case 1:
                dispose();
                break;
            case 2:
                dispose();
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        ArrayList arrayList;
        int indexOf;
        int i13 = this.f104681b;
        Object obj2 = this.f104682c;
        Unit unit = null;
        switch (i13) {
            case 0:
                BoardFeed boardFeed = (BoardFeed) obj;
                Intrinsics.checkNotNullParameter(boardFeed, "boardFeed");
                k kVar = (k) obj2;
                int i14 = k.L0;
                kVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                int n13 = boardFeed.n();
                for (int i15 = 0; i15 < n13; i15++) {
                    v7 v7Var = (v7) boardFeed.k(i15);
                    if (v7Var != null) {
                        String uid = v7Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        if (y.d(uid) != null) {
                            arrayList2.add(v7Var);
                        }
                    }
                }
                if (!(!arrayList2.isEmpty())) {
                    FloatingBoardPicker floatingBoardPicker = kVar.f104700i0;
                    if (floatingBoardPicker != null) {
                        floatingBoardPicker.j();
                        return;
                    } else {
                        Intrinsics.r("floatingBoardPicker");
                        throw null;
                    }
                }
                FloatingBoardPicker floatingBoardPicker2 = kVar.f104700i0;
                if (floatingBoardPicker2 == null) {
                    Intrinsics.r("floatingBoardPicker");
                    throw null;
                }
                v7 board = (v7) arrayList2.get(0);
                Intrinsics.checkNotNullParameter(board, "board");
                floatingBoardPicker2.f34947f = board;
                if (board != null) {
                    View findViewById = floatingBoardPicker2.findViewById(yy1.c.saving_to);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    a0.o((GestaltText) findViewById, yy1.e.saving_to, new Object[0]);
                    View findViewById2 = floatingBoardPicker2.findViewById(yy1.c.board_name);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                    String j13 = board.j1();
                    Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                    a0.p((GestaltText) findViewById2, j13);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    floatingBoardPicker2.j();
                    return;
                }
                return;
            case 1:
                g((wy0) obj);
                return;
            case 2:
                g((wy0) obj);
                return;
            case 3:
                f((ba) obj);
                return;
            case 4:
                f((ba) obj);
                return;
            default:
                eo0.a aVar = (eo0.a) obj;
                boolean z13 = aVar.f59730b;
                f30 f30Var = aVar.f59729a;
                if (!z13) {
                    jo0.a aVar2 = (jo0.a) obj2;
                    if (aVar2.isBound() && (indexOf = (arrayList = aVar2.f77208a).indexOf(f30Var)) >= 0) {
                        arrayList.remove(f30Var);
                        ko0.a aVar3 = ((BoardSectionPinCarousel) ((io0.b) aVar2.getView())).f45383b;
                        if (aVar3 != null) {
                            aVar3.p(indexOf);
                            return;
                        } else {
                            Intrinsics.r("carouselAdapter");
                            throw null;
                        }
                    }
                    return;
                }
                jo0.a aVar4 = (jo0.a) obj2;
                ArrayList arrayList3 = aVar4.f77208a;
                if (arrayList3.contains(f30Var) || !aVar4.isBound()) {
                    return;
                }
                int size = arrayList3.size();
                arrayList3.add(f30Var);
                BoardSectionPinCarousel boardSectionPinCarousel = (BoardSectionPinCarousel) ((io0.b) aVar4.getView());
                ko0.a aVar5 = boardSectionPinCarousel.f45383b;
                if (aVar5 == null) {
                    Intrinsics.r("carouselAdapter");
                    throw null;
                }
                aVar5.j(size);
                RecyclerView recyclerView = boardSectionPinCarousel.f45382a;
                if (recyclerView != null) {
                    recyclerView.d3(size);
                    return;
                } else {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
        }
    }

    public final void e(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        pn0.b bVar = (pn0.b) this.f104682c;
        uk1.c cVar = (nn0.c) bVar.getViewIfBound();
        if (cVar != null) {
            ((t) cVar).setLoadState(yk1.i.LOADED);
        }
        bVar.E.i(throwable.getMessage());
    }

    public final void f(ba section) {
        String Y;
        Context context;
        int i13 = this.f104681b;
        int i14 = 1;
        Object obj = this.f104682c;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(section, "section");
                ((pn0.b) obj).getPinalytics().a(f1.BOARD_SECTION_CREATE, section.getUid(), false, true);
                h();
                return;
            default:
                Intrinsics.checkNotNullParameter(section, "newBoardSection");
                s sVar = (s) obj;
                sVar.V0(section);
                if (sVar.isBound()) {
                    String str = sVar.K;
                    if (str == null || str.length() == 0) {
                        fo0.c cVar = (fo0.c) sVar.getView();
                        String sectionId = section.getUid();
                        Intrinsics.checkNotNullExpressionValue(sectionId, "getUid(...)");
                        String sectionTitle = section.A();
                        Intrinsics.checkNotNullExpressionValue(sectionTitle, "getTitle(...)");
                        m mVar = (m) cVar;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
                        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
                        FragmentActivity E4 = mVar.E4();
                        if (mVar.f69738v1) {
                            String string = mVar.getResources().getString(l70.d.board_section_created);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            Y = j1.Y(string, new Object[]{sectionTitle}, null, 6);
                        } else {
                            String string2 = mVar.getResources().getString(l70.d.saved_to_board_section);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            Y = j1.Y(string2, new Object[]{sectionTitle}, null, 6);
                        }
                        if (E4 instanceof MainActivity) {
                            NavigationImpl z03 = Navigation.z0(m3.c(), sectionId);
                            z03.m0("com.pinterest.EXTRA_BOARD_ID", mVar.Q0);
                            lr.j jVar = new lr.j(z03, Y, null);
                            i92.k kVar = mVar.K1;
                            if (kVar == null) {
                                Intrinsics.r("toastUtils");
                                throw null;
                            }
                            kVar.c(jVar);
                        } else if (E4 != null && (context = mVar.getContext()) != null) {
                            Spanned text = Html.fromHtml(Y);
                            Intrinsics.checkNotNullExpressionValue(text, "fromHtml(...)");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            Toast.makeText(context, text, 0).show();
                        }
                    }
                    xj2.c F = q.M(800L, TimeUnit.MILLISECONDS, tk2.e.f118016b).A(wj2.c.a()).F(new go0.j(15, new go0.q(sVar, section, i14)), new go0.j(16, go0.g.f65862p), ck2.i.f27923c, ck2.i.f27924d);
                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                    sVar.addDisposable(F);
                    return;
                }
                return;
        }
    }

    public final void g(wy0 fetchedSender) {
        int i13 = this.f104681b;
        Object obj = this.f104682c;
        switch (i13) {
            case 1:
                h91.a aVar = ((ek0.h) obj).f59201z;
                TypeAheadItem l13 = oo1.j.l(fetchedSender);
                aVar.f68312a.put(h91.a.b(l13), l13);
                a();
                break;
            default:
                Intrinsics.checkNotNullParameter(fetchedSender, "fetchedSender");
                ((zk0.e) obj).q3(fetchedSender);
                a();
                break;
        }
    }

    public final void h() {
        pn0.b bVar = (pn0.b) this.f104682c;
        uk1.c cVar = (nn0.c) bVar.getViewIfBound();
        if (cVar != null) {
            bVar.F.f(new n(bVar.f100730y, bVar.f100731z));
            ((t) cVar).setLoadState(yk1.i.LOADED);
            qn0.d dVar = (qn0.d) cVar;
            dVar.f104451a1.m(dVar.getResources().getString(l70.d.section_added));
            za.c remove = Navigation.remove();
            remove.a(dVar.I);
            remove.a(Navigation.w1(com.pinterest.screens.y.c()));
            dVar.f104452b1.d(remove);
        }
    }

    @Override // uj2.v
    public final void onError(Throwable e13) {
        switch (this.f104681b) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                FloatingBoardPicker floatingBoardPicker = ((k) this.f104682c).f104700i0;
                if (floatingBoardPicker != null) {
                    floatingBoardPicker.j();
                    return;
                } else {
                    Intrinsics.r("floatingBoardPicker");
                    throw null;
                }
            case 1:
            default:
                return;
            case 2:
                Intrinsics.checkNotNullParameter(e13, "e");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(e13, "throwable");
                e(e13);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(e13, "e");
                return;
        }
    }
}
