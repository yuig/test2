package pn0;

import androidx.recyclerview.widget.q0;
import ar0.v;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import dl1.s;
import i92.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;
import qn0.d;
import rr0.g;
import rr0.h;
import sq0.e0;
import uk2.f;
import x02.x0;
import x02.z0;
import y92.e;
import yk1.i;
import yk1.m;
import ym0.c;
import yq0.t;

/* loaded from: classes5.dex */
public final class b extends g implements nn0.b, nn0.a, e {
    public final String A;
    public f B;
    public final z0 C;
    public final x0 D;
    public final k E;
    public final w F;
    public final v G;
    public final LinkedHashSet H;
    public final yk1.v I;

    /* renamed from: J, reason: collision with root package name */
    public final ym0.b f100728J;
    public c K;
    public v7 L;
    public boolean M;

    /* renamed from: x, reason: collision with root package name */
    public final com.pinterest.feature.boardsection.a f100729x;

    /* renamed from: y, reason: collision with root package name */
    public final String f100730y;

    /* renamed from: z, reason: collision with root package name */
    public final String f100731z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.pinterest.feature.boardsection.a boardSectionActionMode, String boardId, String str, String str2, f pinSelectionPublishSubject, z0 boardSectionRepository, x0 boardRepository, h parameters, k toastUtils, w eventManager, v recyclerViewHeaderCountProvider) {
        super(parameters);
        Intrinsics.checkNotNullParameter(boardSectionActionMode, "boardSectionActionMode");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinSelectionPublishSubject, "pinSelectionPublishSubject");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(recyclerViewHeaderCountProvider, "recyclerViewHeaderCountProvider");
        this.f100729x = boardSectionActionMode;
        this.f100730y = boardId;
        this.f100731z = str;
        this.A = str2;
        this.B = pinSelectionPublishSubject;
        this.C = boardSectionRepository;
        this.D = boardRepository;
        this.E = toastUtils;
        this.F = eventManager;
        this.G = recyclerViewHeaderCountProvider;
        this.H = new LinkedHashSet();
        new LinkedHashSet();
        yk1.v vVar = parameters.f109922k;
        Intrinsics.checkNotNullExpressionValue(vVar, "getViewResources(...)");
        this.I = vVar;
        this.f100728J = new ym0.b();
        this.f126436a.j(66, new qn0.f(this, (boardSectionActionMode == com.pinterest.feature.boardsection.a.REORDER_BOARD_PINS || boardSectionActionMode == com.pinterest.feature.boardsection.a.REORDER_BOARD_SECTION_PINS) ? false : true));
        this.f126436a.j(76, new pk0.b(2));
    }

    @Override // y92.e
    public final void D1(int i13) {
    }

    @Override // rr0.g
    public final void R3(List items) {
        nn0.c cVar;
        d dVar;
        com.pinterest.feature.boardsection.a aVar;
        nn0.c cVar2;
        Intrinsics.checkNotNullParameter(items, "items");
        Iterator it = items.iterator();
        while (it.hasNext()) {
            if (!(((s) it.next()) instanceof f30)) {
                it.remove();
            }
        }
        List list = items;
        if (qb0.b.o(list)) {
            v7 v7Var = this.L;
            if ((v7Var != null ? v7Var.q1() : 0).intValue() >= 2 && (cVar2 = (nn0.c) getViewIfBound()) != null) {
                d dVar2 = (d) cVar2;
                dVar2.G8(a0.K(84, dVar2.getResources()) + dVar2.getResources().getDimensionPixelSize(eo1.c.toolbar_height));
            }
        }
        if (items.size() >= 2 && (cVar = (nn0.c) getViewIfBound()) != null && ((aVar = (dVar = (d) cVar).R0) == com.pinterest.feature.boardsection.a.REORDER_BOARD_PINS || aVar == com.pinterest.feature.boardsection.a.REORDER_BOARD_SECTION_PINS)) {
            new q0(dVar.Q0).i(dVar.g8());
        }
        ArrayList arrayList = new ArrayList(list);
        items.clear();
        if (!arrayList.isEmpty()) {
            items.add(new eo0.b());
        }
        items.addAll(arrayList);
        S3(items);
    }

    @Override // vq0.g, yq0.a0
    public final m S(int i13) {
        return null;
    }

    @Override // rr0.g, vq0.g
    /* renamed from: V3, reason: merged with bridge method [inline-methods] */
    public final void r3(nn0.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        d dVar = (d) view;
        dVar.P0 = this;
        dVar.Q0.f20370b = this;
        uk1.c cVar = (nn0.c) getViewIfBound();
        if (cVar != null) {
            ((t) cVar).setLoadState(i.LOADING);
        }
        xj2.c F = this.D.Q(this.f100730y).F(new xl0.a(23, new a(this, 1)), new xl0.a(24, new a(this, 2)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void W3() {
        uk1.c cVar = (nn0.c) getViewIfBound();
        if (cVar != null) {
            ((t) cVar).setLoadState(i.LOADING);
        }
        ArrayList arrayList = new ArrayList(this.H);
        String str = this.A;
        if (str == null) {
            str = "";
        }
        this.C.a0(this.f100730y, str, arrayList).d(new qp.g(this, 3));
    }

    public final void X3(f subject) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        this.B = subject;
    }

    @Override // y92.e
    public final void c0(int i13, int i14) {
        v vVar = this.G;
        int D2 = i13 - vVar.D2();
        int D22 = i14 - vVar.D2();
        if (D2 == D22) {
            return;
        }
        n3(D2, D22);
    }

    @Override // rr0.g, nr0.g
    public final boolean e(int i13) {
        return i13 >= 0 && i13 < a() && getItemViewType(i13) != 76;
    }

    @Override // rr0.g, nr0.g
    public final boolean f(int i13) {
        return i13 == 76;
    }

    @Override // rr0.g, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (item == null) {
            return -2;
        }
        if (item instanceof f30) {
            return 66;
        }
        if (item instanceof eo0.b) {
            return 76;
        }
        return D3().getItemViewType(i13);
    }

    @Override // rr0.g, nr0.g
    public final boolean h(int i13) {
        return i13 >= 0 && i13 < a() && getItemViewType(i13) != 76;
    }

    @Override // y92.e
    public final void o3(int i13, int i14) {
        c cVar;
        v vVar = this.G;
        int D2 = i13 - vVar.D2();
        int D22 = i14 - vVar.D2();
        if (D2 == D22) {
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(this.f109906r);
        this.f100728J.getClass();
        ym0.a a13 = ym0.b.a(D22, unmodifiableList);
        s item = getItem(D22);
        if (a13 == null || item == null || !(item instanceof f30) || (cVar = this.K) == null) {
            return;
        }
        cVar.a(a13).i(new fp.a(9, this, a13), new xl0.a(22, new a(this, 0)));
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }

    @Override // rr0.g, vq0.g
    public final boolean t3() {
        return this.L != null && super.t3();
    }

    @Override // rr0.g
    public final void v3(List itemsToAppend) {
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        Iterator it = itemsToAppend.iterator();
        while (it.hasNext()) {
            if (!(((s) it.next()) instanceof f30)) {
                it.remove();
            }
        }
        super.v3(itemsToAppend);
    }

    @Override // rr0.g
    public final Map z3() {
        HashMap hashMap = new HashMap();
        com.pinterest.feature.boardsection.a aVar = com.pinterest.feature.boardsection.a.BOARD_SECTION_ORGANIZE_PINS;
        com.pinterest.feature.boardsection.a aVar2 = this.f100729x;
        if (aVar2 == aVar || aVar2 == com.pinterest.feature.boardsection.a.REORDER_BOARD_SECTION_PINS) {
            hashMap.put("CONTENT_SOURCE_TYPE", nn0.d.BOARD_SECTION);
            String str = this.f100731z;
            if (str != null) {
                hashMap.put("BOARD_SECTION_ID", str);
            }
        } else {
            hashMap.put("CONTENT_SOURCE_TYPE", nn0.d.BOARD);
            hashMap.put("BOARD_ID", this.f100730y);
        }
        return hashMap;
    }
}
