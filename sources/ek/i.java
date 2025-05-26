package ek;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.feature.scheduledpins.view.ScheduledPinDateTabView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import ex1.n;
import h32.f1;
import ht0.m;
import java.util.Date;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import r02.r;
import s81.p;

/* loaded from: classes3.dex */
public class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59147a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f59148b;

    public /* synthetic */ i(Object obj, int i13) {
        this.f59147a = i13;
        this.f59148b = obj;
    }

    public static void d(e eVar, boolean z13) {
        View view = eVar.f59129f;
        ScheduledPinDateTabView scheduledPinDateTabView = view instanceof ScheduledPinDateTabView ? (ScheduledPinDateTabView) view : null;
        if (scheduledPinDateTabView != null) {
            GestaltText gestaltText = scheduledPinDateTabView.f47602c;
            GestaltText gestaltText2 = scheduledPinDateTabView.f47601b;
            View view2 = scheduledPinDateTabView.f47600a;
            if (z13) {
                bs1.c.U1(view2);
                gestaltText2.i(z51.a.f140857k);
                gestaltText.i(z51.a.f140858l);
            } else {
                bs1.c.b1(view2);
                gestaltText2.i(z51.a.f140859m);
                gestaltText.i(z51.a.f140860n);
            }
        }
    }

    @Override // ek.c
    public void a(e tab) {
        switch (this.f59147a) {
            case 0:
            case 1:
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                d(tab, false);
                break;
            case 3:
            case 4:
                break;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
        }
    }

    @Override // ek.c
    public void b(e tab) {
        switch (this.f59147a) {
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
        }
    }

    @Override // ek.c
    public void c(e tab) {
        z51.f fVar;
        int u33;
        da2.h hVar;
        int i13 = this.f59147a;
        Object obj = this.f59148b;
        switch (i13) {
            case 0:
                ((ViewPager) obj).A(tab.f59128e);
                return;
            case 1:
                if (tab != null) {
                    int i14 = tab.f59128e;
                    us0.d dVar = ((m) obj).f70129y0;
                    if (dVar != null) {
                        dVar.r3(i14, f1.TAP);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                d(tab, true);
                z51.e eVar = (z51.e) obj;
                if (!eVar.W0 || (fVar = eVar.X0) == null) {
                    return;
                }
                y51.c cVar = (y51.c) fVar;
                Date date = (Date) CollectionsKt.U(tab.f59128e, cVar.f137772b);
                if (date != null && (u33 = cVar.u3(date)) >= 0) {
                    z51.e eVar2 = (z51.e) ((z51.g) cVar.getView());
                    eVar2.getClass();
                    PinterestRecyclerView pinterestRecyclerView = eVar2.f139736j0;
                    if (pinterestRecyclerView != null) {
                        pinterestRecyclerView.i(u33, 0);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                int i15 = tab != null ? tab.f59128e : 0;
                qx1.d dVar2 = (qx1.d) qx1.d.getEntries().get(i15);
                qx1.c cVar2 = (qx1.c) obj;
                GestaltIconButton gestaltIconButton = cVar2.f105336n0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("btnFilter");
                    throw null;
                }
                gestaltIconButton.t(new n(dVar2, 10));
                cVar2.b8().w(i15, true);
                cVar2.i8(dVar2);
                return;
            case 4:
                if (tab != null) {
                    ((r) obj).Y7(tab.f59128e);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                Object obj2 = tab.f59124a;
                da2.i iVar = da2.i.TAB_SHOP;
                if (Intrinsics.d(obj2, Integer.valueOf(iVar.getValue()))) {
                    da2.h hVar2 = (da2.h) ((xd1.e) obj).f134632b;
                    if (hVar2 != null) {
                        p pVar = (p) hVar2;
                        if (pVar.isBound()) {
                            int value = a32.f.SHOPPING.getValue();
                            f0 f0Var = pVar.f111947y.f49121k;
                            if (f0Var != null) {
                                f0Var.c(value, "search_type");
                            }
                            if (pVar.f111923a0 != iVar) {
                                pVar.f111923a0 = iVar;
                                pVar.v3();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                da2.i iVar2 = da2.i.TAB_EXPLORE;
                if (!Intrinsics.d(obj2, Integer.valueOf(iVar2.getValue())) || (hVar = (da2.h) ((xd1.e) obj).f134632b) == null) {
                    return;
                }
                p pVar2 = (p) hVar;
                if (pVar2.isBound()) {
                    int value2 = a32.f.ORGANIC.getValue();
                    f0 f0Var2 = pVar2.f111947y.f49121k;
                    if (f0Var2 != null) {
                        f0Var2.c(value2, "search_type");
                    }
                    if (pVar2.f111923a0 != iVar2) {
                        pVar2.f111923a0 = iVar2;
                        pVar2.v3();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
