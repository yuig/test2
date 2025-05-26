package tt;

import com.pinterest.api.model.f30;
import cu.m;
import es.v;
import fu.l;
import h32.c1;
import h32.f;
import h32.f1;
import h32.h2;
import h32.k0;
import h32.y1;
import h32.z1;
import i32.y0;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ls1.g;
import ls1.h;
import m60.t;
import m60.w;
import nx.d0;
import nx.o0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import ps0.y;
import qs.d;
import qs.e;
import rg0.i0;
import ro1.c;
import sp2.k;

/* loaded from: classes3.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f119044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qs.a f119045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f119046c;

    public a(b bVar, qs.a aVar, w wVar) {
        this.f119044a = bVar;
        this.f119045b = aVar;
        this.f119046c = wVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw null;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84691i;
        b bVar = this.f119044a;
        if (Intrinsics.d(str, bVar.f119047x)) {
            this.f119046c.i(event);
            bVar.H3(event);
            ((m) ((dt.b) bVar.getView())).a8().b();
            b.I3(bVar, y0.ANDROID_AD_CLOSEUP_AFTER_CLICKTHROUGH);
        }
        bVar.f105129s = false;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f84693i;
        b bVar = this.f119044a;
        if (Intrinsics.d(str, bVar.f119047x)) {
            this.f119046c.i(event);
            bVar.A = event.f84694j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e event) {
        z1 z1Var;
        z1 a13;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof d;
        b bVar = this.f119044a;
        if (z13) {
            d dVar = (d) event;
            if (Intrinsics.d(dVar.f105069a, bVar.f119047x)) {
                bVar.D = Long.valueOf(dVar.f105070b);
                return;
            }
            return;
        }
        z1 z1Var2 = null;
        r4 = null;
        f fVar = null;
        z1Var2 = null;
        if (event instanceof qs.b) {
            qs.b bVar2 = (qs.b) event;
            if (Intrinsics.d(bVar2.f105065a, bVar.f119047x) && bVar.C == null) {
                y1 y1Var = bVar.s3().f105081k;
                if (y1Var != null) {
                    a13 = y1Var.a();
                } else {
                    Pair b83 = ((m) ((dt.b) bVar.getView())).b8();
                    bVar.z3(((Number) b83.f80346a).intValue(), ((Number) b83.f80347b).intValue());
                    y1 y1Var2 = bVar.s3().f105081k;
                    a13 = y1Var2 != null ? y1Var2.a() : null;
                }
                z1 pinImpression = a13;
                if (pinImpression != null) {
                    qs.a aVar = this.f119045b;
                    if (aVar != null) {
                        f30 pin = bVar.t3();
                        Long l13 = bVar.D;
                        long longValue = l13 != null ? l13.longValue() : bVar2.f105066b;
                        Intrinsics.checkNotNullParameter(pin, "pin");
                        Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
                        y yVar = c.f108967f;
                        ur.b bVar3 = (ur.b) aVar.f105064a;
                        if (yVar.i(pin, bVar3.f123060c, bVar3.f123058a)) {
                            Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
                            h2 h2Var = pinImpression.f67496j;
                            if (h2Var == null) {
                                h2Var = h2.GRID_CELL;
                            }
                            Boolean b53 = pin.b5();
                            es.h hVar = bVar3.f123060c;
                            k0 c13 = es.h.c(hVar, pin);
                            com.pinterest.api.model.g t33 = pin.t3();
                            if ((t33 != null ? t33.Y() : null) != null) {
                                com.pinterest.api.model.g t34 = pin.t3();
                                if ((t34 != null ? t34.Z() : null) != null) {
                                    fVar = new f();
                                }
                            }
                            z1Var2 = z1.a(pinImpression, Long.valueOf(longValue), null, h2Var, Boolean.TRUE, c13, b53, fVar, ((vr.b) bVar3.f123059b).g(pin), ((v) hVar).o(pin), -515, 1806696447, 30);
                        }
                    }
                    bVar.C = z1Var2;
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof qs.c) {
            qs.c cVar = (qs.c) event;
            if (Intrinsics.d(cVar.f105067a, bVar.f119047x) && (z1Var = bVar.C) != null) {
                z1 pinImpression2 = z1.a(z1Var, null, Long.valueOf(cVar.f105068b), null, null, null, null, null, null, null, -17, -1, 31);
                HashMap a14 = bVar.s3().a();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.d(pinImpression2.f67510u, bool)) {
                    a14.put("debug_code_path", "2");
                }
                d0 pinalytics = bVar.getPinalytics();
                f1 f1Var = f1.PIN_IMPRESSION_ONE_PIXEL;
                Boolean bool2 = Boolean.FALSE;
                pinalytics.u(f1Var, pinImpression2.f67482c, new c1(null, bool2, e0.b(pinImpression2), bool, bool2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), bVar.p3(), false);
                o0 o0Var = bVar.f119049z;
                if (o0Var != null) {
                    Intrinsics.checkNotNullParameter(pinImpression2, "pinImpression");
                    o0Var.h(pinImpression2);
                } else {
                    Intrinsics.r("pinalyticsManager");
                    throw null;
                }
            }
            bVar.C = null;
            bVar.D = null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b.I3(this.f119044a, y0.ANDROID_AD_CLOSEUP_AFTER_SAVE);
    }
}
