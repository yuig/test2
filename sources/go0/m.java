package go0;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.hb;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.create.view.CreateBoardCell;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jk2.d0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;
import u50.j0;
import x02.i2;
import x02.x0;
import yk1.v;

/* loaded from: classes5.dex */
public final class m extends a {
    public final String A;
    public final hk0.m B;
    public final boolean C;

    /* renamed from: i, reason: collision with root package name */
    public final String f65873i;

    /* renamed from: j, reason: collision with root package name */
    public final String f65874j;

    /* renamed from: k, reason: collision with root package name */
    public final x0 f65875k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f65876l;

    /* renamed from: m, reason: collision with root package name */
    public final w f65877m;

    /* renamed from: n, reason: collision with root package name */
    public final i92.k f65878n;

    /* renamed from: o, reason: collision with root package name */
    public final v f65879o;

    /* renamed from: p, reason: collision with root package name */
    public final tb0.h f65880p;

    /* renamed from: q, reason: collision with root package name */
    public final kn0.b f65881q;

    /* renamed from: r, reason: collision with root package name */
    public final xj2.b f65882r;

    /* renamed from: s, reason: collision with root package name */
    public v7 f65883s;

    /* renamed from: t, reason: collision with root package name */
    public v7 f65884t;

    /* renamed from: u, reason: collision with root package name */
    public final String f65885u;

    /* renamed from: v, reason: collision with root package name */
    public final String f65886v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f65887w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f65888x;

    /* renamed from: y, reason: collision with root package name */
    public final List f65889y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f65890z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(java.lang.String r23, wk1.c r24, go0.e r25, boolean r26, java.lang.String r27, x02.x0 r28, x02.i2 r29, m60.g0 r30, x12.a r31, m60.w r32, i92.k r33, yk1.v r34, tb0.h r35, b60.b r36, nr0.m r37, x02.y r38, lh0.z2 r39, kn0.b r40) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.m.<init>(java.lang.String, wk1.c, go0.e, boolean, java.lang.String, x02.x0, x02.i2, m60.g0, x12.a, m60.w, i92.k, yk1.v, tb0.h, b60.b, nr0.m, x02.y, lh0.z2, kn0.b):void");
    }

    public static /* synthetic */ void B3(m mVar, String str, String str2, String str3, hb hbVar, int i13) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        mVar.z3(hbVar, str, str2, str3);
    }

    public final void U0() {
        HashMap hashMap = new HashMap(1);
        String str = this.f65874j;
        hashMap.put("source", str == null ? ou1.b.MOVE_PINS.getValue() : str);
        getPinalytics().h(g0.MODAL_ADD_PIN, u0.CREATE_BOARD_BUTTON, hashMap);
        NavigationImpl w13 = Navigation.w1(m3.g());
        w13.d("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", this.f65887w);
        if (str == null) {
            str = ou1.b.MOVE_PINS.getValue();
        }
        w13.m0("com.pinterest.EXTRA_SOURCE", str);
        this.f65877m.d(w13);
    }

    @Override // fo0.a
    public final void V0(ba boardSection) {
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        ho0.d dVar = (ho0.d) ((fo0.b) getView());
        int i13 = 0;
        ig1.b.L0(dVar.getContext(), dVar.getView(), false, true);
        getPinalytics().X(u0.BOARD_SECTION_DONE_BUTTON);
        String uid = boardSection.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        ((ho0.d) ((fo0.b) getView())).setLoadState(yk1.i.LOADING);
        boolean z13 = this.f65888x;
        String str = this.f65873i;
        if (!z13) {
            c0.d.n(this.f65876l, this.f65887w, null, str == null ? "" : str, uid, false).j(new l(i13, this, uid));
            return;
        }
        v7 v7Var = this.f65884t;
        if (v7Var == null) {
            return;
        }
        this.f65875k.e0(v7Var, this.f65886v, str == null ? "" : str, uid, this.f65889y).i(new xo.c((Object) this, (Object) v7Var, uid, 10), new tn0.a(26, new k(this, 4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    @Override // fo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.m.W0(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // wk1.q, yk1.b
    public final void onDestroy() {
        this.f65882r.dispose();
        super.onDestroy();
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        super.onUnbind();
    }

    public final v7 v3(String str) {
        Object obj;
        if (Intrinsics.d(str, this.f65873i)) {
            return w3();
        }
        Iterator it = this.f65824h.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            dl1.s sVar = (dl1.s) obj;
            if ((sVar instanceof v7) && Intrinsics.d(((v7) sVar).getUid(), str)) {
                break;
            }
        }
        dl1.s sVar2 = (dl1.s) obj;
        if (sVar2 instanceof v7) {
            return (v7) sVar2;
        }
        return null;
    }

    public final v7 w3() {
        List F0;
        v7 v7Var = this.f65883s;
        if (v7Var != null) {
            return v7Var;
        }
        h hVar = this.f65822f;
        dl1.s sVar = (hVar == null || (F0 = CollectionsKt.F0(hVar.f135191h)) == null) ? null : (dl1.s) CollectionsKt.U(0, F0);
        if (sVar instanceof v7) {
            return (v7) sVar;
        }
        return null;
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(fo0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        hk0.m mVar = hk0.m.PROFILE;
        int i13 = 0;
        hk0.m mVar2 = this.B;
        if ((mVar2 == mVar || mVar2 == hk0.m.BOARD) && this.C) {
            ho0.k kVar = (ho0.k) view;
            Context requireContext = kVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            CreateBoardCell createBoardCell = new CreateBoardCell(requireContext);
            createBoardCell.setOnClickListener(new ho0.i(kVar, i13));
            kVar.U0 = createBoardCell;
            FrameLayout frameLayout = kVar.V0;
            if (frameLayout == null && (frameLayout = kVar.X0) == null) {
                Intrinsics.r("rootContainer");
                throw null;
            }
            frameLayout.addView(createBoardCell);
            Context requireContext2 = kVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            if (!a0.q0(requireContext2)) {
                kVar.g9();
            }
            String boardCreateCellTitle = ((yk1.a) this.f65879o).f139224a.getString(e02.e.board_picker_create_header_title);
            if (mVar2 == mVar) {
                String string = kVar.getResources().getString(e02.e.board_create_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                CreateBoardCell createBoardCell2 = kVar.U0;
                if (createBoardCell2 != null) {
                    createBoardCell2.e(string);
                }
            } else {
                Intrinsics.checkNotNullParameter(boardCreateCellTitle, "boardCreateCellTitle");
                CreateBoardCell createBoardCell3 = kVar.U0;
                if (createBoardCell3 != null) {
                    createBoardCell3.e(boardCreateCellTitle);
                }
            }
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ho0.k) view).f69705g1 = this;
        boolean z13 = this.f65888x;
        x0 x0Var = this.f65875k;
        if (z13) {
            ((ho0.d) ((fo0.b) getView())).setLoadState(yk1.i.LOADING);
            String str = this.f65885u;
            if (str != null) {
                uj2.q Q = x0Var.Q(str);
                hk2.b bVar = new hk2.b(new tn0.a(29, new k(this, i13)), new j(0, new k(this, 1)), ck2.i.f27923c);
                try {
                    Q.d(new d0(bVar, 0L));
                    Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                    addDisposable(bVar);
                } catch (NullPointerException e13) {
                    throw e13;
                } catch (Throwable th3) {
                    throw n60.o.g(th3, "subscribeActual failed", th3);
                }
            }
        }
        String str2 = this.f65873i;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        this.f65882r.a(x0Var.Q(str2).s().o(new tn0.a(27, new k(this, 2)), new tn0.a(28, g.f65857k)));
    }

    public final void z3(hb hbVar, String str, String str2, String str3) {
        int i13 = f02.f.bulk_move_pins_success;
        ArrayList arrayList = this.f65887w;
        int size = arrayList.size();
        String[] formatArgs = {String.valueOf(arrayList.size())};
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f65881q.a(new kn0.d(str, hbVar, new j0(i13, size, c0.b0(formatArgs)), str2, str3));
        this.f65877m.f(new ls1.n(this.f65885u, this.f65886v));
    }
}
