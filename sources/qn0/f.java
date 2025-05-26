package qn0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.boardsection.create.selectpins.view.CreateBoardSectionSelectPinsGridCell;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import lp.l;
import pk.a0;
import xo.j;
import yk1.n;
import zp.y0;

/* loaded from: classes5.dex */
public final class f extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final nn0.b f104463a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104464b;

    public f(nn0.b bVar, boolean z13) {
        this.f104463a = bVar;
        this.f104464b = z13;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        CreateBoardSectionSelectPinsGridCell createBoardSectionSelectPinsGridCell = (CreateBoardSectionSelectPinsGridCell) nVar;
        f30 pin = (f30) obj;
        String S = b40.S(pin);
        if (!j1.d1(S)) {
            S = j1.d1(pin.c4()) ? pin.c4() : null;
        }
        String B0 = bs1.c.B0(pin);
        String str = B0 != null ? B0 : "";
        int C0 = bs1.c.C0(pin);
        int A0 = bs1.c.A0(pin);
        createBoardSectionSelectPinsGridCell.f45362b.V1(str, true, null, 0, 0, createBoardSectionSelectPinsGridCell.f45368h, null, null);
        createBoardSectionSelectPinsGridCell.f45369i = C0;
        createBoardSectionSelectPinsGridCell.f45370j = A0;
        if (S == null) {
            S = "";
        }
        if (a0.x0(S)) {
            createBoardSectionSelectPinsGridCell.f45363c.i(new j(28));
        } else {
            createBoardSectionSelectPinsGridCell.f45363c.i(new l(S, 4));
            createBoardSectionSelectPinsGridCell.f45362b.setContentDescription(S);
        }
        pn0.b bVar = (pn0.b) this.f104463a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        createBoardSectionSelectPinsGridCell.f45365e = bVar.H.contains(pin.getUid());
        createBoardSectionSelectPinsGridCell.b();
        if (this.f104464b) {
            createBoardSectionSelectPinsGridCell.setOnClickListener(new y0(this, pin, createBoardSectionSelectPinsGridCell, 6));
        } else {
            createBoardSectionSelectPinsGridCell.setClickable(false);
        }
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ String g(int i13, Object obj) {
        return null;
    }
}
