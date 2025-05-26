package tq;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes3.dex */
public final class o extends yk1.c implements rs.a, h {

    /* renamed from: a, reason: collision with root package name */
    public final j80.b f118917a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0.a0 f118918b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.b0 f118919c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f118920d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f118921e;

    /* renamed from: f, reason: collision with root package name */
    public int f118922f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uk1.d presenterPinalytics, uj2.q networkStateStream, j80.b carouselUtil, lh0.a0 closeupExperiments, nx.b0 pinAuxHelper) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f118917a = carouselUtil;
        this.f118918b = closeupExperiments;
        this.f118919c = pinAuxHelper;
    }

    @Override // tq.h
    public final void R2() {
        i iVar = (i) getViewIfBound();
        if (iVar != null) {
            f30 pin = this.f118920d;
            if (pin == null) {
                Intrinsics.r("pin");
                throw null;
            }
            n nVar = (n) iVar;
            Intrinsics.checkNotNullParameter(pin, "pin");
            nVar.e().d(new ls1.q(null, pin, -1, -1, vn1.c.DEFAULT, false, nVar.getProductTagParentPinId(), true, nVar.b().f35051h, null, null, -1));
        }
    }

    @Override // rs.a
    public final void b2(int i13) {
        r3(i13);
    }

    @Override // tq.h
    public final void j3(int i13) {
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        f1 f1Var = f1.TAP;
        h32.g0 g0Var = h32.g0.PIN_CLOSEUP_PRODUCT_CAROUSEL;
        HashMap hashMap = new HashMap();
        f30 f30Var = this.f118920d;
        String str = null;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        this.f118919c.c(f30Var, hashMap);
        Unit unit = Unit.f80348a;
        nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
        f30 f30Var2 = this.f118920d;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        boolean N1 = kh2.b0.N1(f30Var2, ((b60.d) com.bumptech.glide.d.E()).f());
        f30 f30Var3 = this.f118920d;
        if (f30Var3 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if ((!j1.P1(f30Var3) || N1) && !N1) {
            f30 f30Var4 = this.f118920d;
            if (f30Var4 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            f3 z33 = f30Var4.z3();
            if (!com.bumptech.glide.d.o0(z33 != null ? z33.J() : null) && i13 == 0) {
                lh0.a0 a0Var = this.f118918b;
                a0Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) a0Var.f83294a;
                if (g1Var.o("android_visual_closeup_entry_point", "enabled", z3Var) || g1Var.l("android_visual_closeup_entry_point")) {
                    i iVar = (i) getView();
                    f30 pin = this.f118920d;
                    if (pin == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    n nVar = (n) iVar;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    nVar.e().d(new oq.c(pin));
                    return;
                }
            }
        }
        i iVar2 = (i) getView();
        ArrayList arrayList = this.f118921e;
        if (arrayList != null && i13 >= 0 && i13 < arrayList.size()) {
            str = ((m21.a) arrayList.get(i13)).d();
        }
        n nVar2 = (n) iVar2;
        nVar2.getClass();
        PinCloseupBaseModule.handleWebsiteClicked$default(nVar2, str, null, null, 6, null);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        i view = (i) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((n) view).f118912v = this;
        s3();
    }

    public final void q3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f118920d = pin;
        this.f118922f = (j1.B0(pin) || ph.a.f0(pin)) ? this.f118922f : this.f118917a.a(pin);
        this.f118921e = j1.B0(pin) ? kg.t.F(pin) : CollectionsKt.H0(kh2.g0.B(pin, this.f118918b));
        if (isBound()) {
            s3();
        }
    }

    public final void r3(int i13) {
        PinterestRecyclerView pinterestRecyclerView;
        int i14;
        b2 b2Var;
        if (i13 == this.f118922f) {
            return;
        }
        i iVar = (i) getView();
        int i15 = this.f118922f;
        n nVar = (n) iVar;
        nVar.b().e(i13);
        List list = nVar.f118911u;
        if (list != null) {
            int size = list.size();
            ArrayList arrayList = nVar.D;
            if (arrayList != null) {
                int i16 = 0;
                for (Object obj : arrayList) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    ((h21.a) obj).f66544c = i16 == i13;
                    i16 = i17;
                }
            }
            j21.f fVar = nVar.C;
            if (fVar != null && (pinterestRecyclerView = fVar.getPinterestRecyclerView()) != null) {
                RecyclerView recyclerView = pinterestRecyclerView.f52531a;
                if (recyclerView != null && (b2Var = recyclerView.f19240m) != null) {
                    b2Var.h();
                }
                if (i13 > i15) {
                    if (i13 <= size - 2) {
                        i14 = i13 + 1;
                        pinterestRecyclerView.h(i14, true);
                    }
                    i14 = i13;
                    pinterestRecyclerView.h(i14, true);
                } else {
                    if (i13 != 0) {
                        i14 = i13 - 1;
                        pinterestRecyclerView.h(i14, true);
                    }
                    i14 = i13;
                    pinterestRecyclerView.h(i14, true);
                }
            }
        }
        this.f118922f = i13;
    }

    @Override // tq.h
    public final void s2(int i13) {
        r3(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s3() {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.o.s3():void");
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        i view = (i) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((n) view).f118912v = this;
        s3();
    }
}
