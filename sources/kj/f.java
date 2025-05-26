package kj;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.pinterest.ui.recyclerview.FastScrollerView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import l11.j;
import l81.o;
import yq0.z;

/* loaded from: classes3.dex */
public final class f extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79830b;

    public f(Object obj, int i13) {
        this.f79829a = i13;
        this.f79830b = obj;
    }

    @Override // kj.b
    public final void b(View bottomSheet, float f13) {
        int i13 = this.f79829a;
        Object obj = this.f79830b;
        switch (i13) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (f13 <= 0.0f) {
                    View view = ((j) obj).V0;
                    if (view != null) {
                        view.setAlpha(1 + f13);
                        return;
                    } else {
                        Intrinsics.r("backgroundOverlay");
                        throw null;
                    }
                }
                View view2 = ((j) obj).V0;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                    return;
                } else {
                    Intrinsics.r("backgroundOverlay");
                    throw null;
                }
            case 4:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                o oVar = (o) obj;
                if (oVar.f82200t) {
                    return;
                }
                if (f13 <= 0.0f) {
                    BottomSheetBehavior bottomSheetBehavior = oVar.f27255n;
                    Integer valueOf = bottomSheetBehavior != null ? Integer.valueOf(bottomSheetBehavior.L) : null;
                    if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 4)) {
                        BottomSheetBehavior bottomSheetBehavior2 = oVar.f27255n;
                        if (bottomSheetBehavior2 != null) {
                            bottomSheetBehavior2.W(oVar.f27259r);
                        }
                        BottomSheetBehavior bottomSheetBehavior3 = oVar.f27255n;
                        if (bottomSheetBehavior3 != null) {
                            bottomSheetBehavior3.T(false);
                        }
                        oVar.f82199s = false;
                        oVar.k(f1.BOTTOM_SHEET_SNAP_MINIMIZED, "user_dragged");
                    }
                }
                ca2.b bVar = oVar.f27252k;
                if (bVar != null) {
                    bVar.s1(f13, oVar.f82199s);
                }
                if (f13 >= 1.0f) {
                    BottomSheetBehavior bottomSheetBehavior4 = oVar.f27255n;
                    if (bottomSheetBehavior4 != null) {
                        bottomSheetBehavior4.T(true);
                    }
                    oVar.f82199s = true;
                    oVar.a();
                    oVar.k(f1.BOTTOM_SHEET_SNAP_FULLY_OPEN, "user_dragged");
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                ca2.e eVar = (ca2.e) obj;
                ca2.b bVar2 = eVar.f27252k;
                if (bVar2 != null) {
                    bVar2.s1(f13, false);
                }
                if (f13 >= 1.0f) {
                    eVar.a();
                    eVar.k(f1.BOTTOM_SHEET_SNAP_FULLY_OPEN, "user_dragged");
                }
                if (f13 > 0.0f || eVar.f27256o || !eVar.f27257p) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior5 = eVar.f27255n;
                Integer valueOf2 = bottomSheetBehavior5 != null ? Integer.valueOf(bottomSheetBehavior5.L) : null;
                if ((valueOf2 != null && valueOf2.intValue() == 1) || (valueOf2 != null && valueOf2.intValue() == 4)) {
                    ca2.e.i(eVar, "user_dragged", 0.0f, null, 6);
                    return;
                }
                return;
        }
    }

    @Override // kj.b
    public final void c(View bottomSheet, int i13) {
        ca2.b bVar;
        int i14 = this.f79829a;
        Object obj = this.f79830b;
        switch (i14) {
            case 0:
                if (i13 == 5) {
                    ((h) obj).cancel();
                    return;
                }
                return;
            case 1:
                if (i13 == 5) {
                    int i15 = i.f79846q;
                    ((i) obj).N6(false, false);
                    return;
                }
                return;
            case 2:
                int i16 = BottomSheetDragHandleView.f32328j;
                ((BottomSheetDragHandleView) obj).g2(i13);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                HashMap hashMap = new HashMap();
                j jVar = (j) obj;
                String str = jVar.T0;
                if (str != null) {
                    hashMap.put("save_session_id", str);
                }
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            return;
                        }
                        jVar.P7();
                        jVar.s7().h0(f1.SWIPE_DOWN, u0.BOARD_PICKER, g0.MODAL_ADD_PIN, null, hashMap, null, null, false);
                        return;
                    }
                    FastScrollerView fastScrollerView = jVar.W0;
                    if (fastScrollerView == null) {
                        Intrinsics.r("fastScrollerView");
                        throw null;
                    }
                    k3.R1(fastScrollerView, false);
                    fastScrollerView.c(null);
                    jVar.f7().d(new my.a());
                    return;
                }
                jVar.s7().h0(f1.SWIPE_UP, u0.BOARD_PICKER, g0.MODAL_ADD_PIN, null, hashMap, null, null, false);
                jVar.b8(new l11.i(jVar, 0));
                z zVar = (z) jVar.f139732f0;
                if (zVar == null || zVar.f139759e.a() <= 8 || jVar.Z0 == null) {
                    FastScrollerView fastScrollerView2 = jVar.W0;
                    if (fastScrollerView2 == null) {
                        Intrinsics.r("fastScrollerView");
                        throw null;
                    }
                    k3.R1(fastScrollerView2, false);
                    fastScrollerView2.c(null);
                    return;
                }
                FastScrollerView fastScrollerView3 = jVar.W0;
                if (fastScrollerView3 == null) {
                    Intrinsics.r("fastScrollerView");
                    throw null;
                }
                k3.R1(fastScrollerView3, true);
                fastScrollerView3.f52639g = jVar.Z0;
                return;
            case 4:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                o oVar = (o) obj;
                if (oVar.f82200t || (bVar = oVar.f27252k) == null) {
                    return;
                }
                bVar.o2(i13);
                return;
            default:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                ca2.b bVar2 = ((ca2.e) obj).f27252k;
                if (bVar2 != null) {
                    bVar2.o2(i13);
                    return;
                }
                return;
        }
    }
}
