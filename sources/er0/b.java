package er0;

import android.os.Bundle;
import com.pinterest.api.model.d01;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.s30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.i0;
import cr0.e;
import cr0.f;
import cr0.g;
import cr0.i;
import cr0.j;
import cr0.k;
import cr0.l;
import cr0.m;
import cr0.n;
import cr0.o;
import cr0.p;
import dl1.s;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.List;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import m60.w;
import nx.d0;
import uj2.q;

/* loaded from: classes5.dex */
public abstract class b extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public List f59962a;

    /* renamed from: b, reason: collision with root package name */
    public final w f59963b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f59964c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f59965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b60.b activeUserManager, w eventManager, a0 experiments, uk1.d presenterPinalytics, q networkStateStream, List viewTypes) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f59962a = viewTypes;
        this.f59963b = eventManager;
        this.f59964c = activeUserManager;
    }

    public final void i2() {
        if (isBound()) {
            d dVar = (d) this;
            switch (dVar.f59967e) {
                case 0:
                    f30 pin = dVar.f59965d;
                    if (pin == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    k updatedViewTypes = new k(1);
                    Intrinsics.checkNotNullParameter(updatedViewTypes, "updatedViewTypes");
                    dVar.f59962a = updatedViewTypes;
                    s30 n03 = p2.n0(pin);
                    if (n03 != null) {
                        dVar.q3(n03);
                        dVar.r3(pin);
                        return;
                    }
                    dVar.q3(null);
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    ((rq.b) ((j) dVar.getView())).i(new g(pin, m.Unknown, l.Unknown, null));
                    return;
                default:
                    f30 pin2 = dVar.f59965d;
                    if (pin2 == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    d01 o03 = p2.o0(pin2);
                    if (o03 != null) {
                        dVar.q3(o03);
                        dVar.r3(pin2);
                        return;
                    }
                    dVar.q3(null);
                    Intrinsics.checkNotNullParameter(pin2, "pin");
                    ((rq.b) ((j) dVar.getView())).i(new g(pin2, m.Unknown, l.Unknown, null));
                    return;
            }
        }
    }

    public final void q3(s sVar) {
        Integer averageTime;
        for (cr0.a aVar : this.f59962a) {
            i itemView = ((j) getView()).M0(aVar);
            itemView.u3(aVar.f53093b.getDrawableRes());
            switch (((d) this).f59967e) {
                case 0:
                    f viewType = (f) aVar;
                    s30 s30Var = (s30) sVar;
                    Intrinsics.checkNotNullParameter(itemView, "itemView");
                    Intrinsics.checkNotNullParameter(viewType, "viewType");
                    boolean z13 = viewType instanceof e;
                    int i13 = viewType.f53092a;
                    if (z13) {
                        itemView.Y2(s30Var != null ? Integer.valueOf(s30Var.getImpressionCount()) : null, i13);
                        break;
                    } else if (viewType instanceof cr0.d) {
                        itemView.Y2(s30Var != null ? Integer.valueOf(s30Var.getSaveCount()) : null, i13);
                        break;
                    } else if (viewType instanceof cr0.b) {
                        itemView.Y2(s30Var != null ? s30Var.getClickthroughCount() : null, i13);
                        break;
                    } else if (viewType instanceof cr0.c) {
                        itemView.Y2(s30Var != null ? Integer.valueOf(s30Var.getCloseupCount()) : null, i13);
                        break;
                    }
                    break;
                default:
                    cr0.q viewType2 = (cr0.q) aVar;
                    d01 d01Var = (d01) sVar;
                    Intrinsics.checkNotNullParameter(itemView, "itemView");
                    Intrinsics.checkNotNullParameter(viewType2, "viewType");
                    boolean z14 = viewType2 instanceof p;
                    int i14 = viewType2.f53092a;
                    if (z14) {
                        itemView.Y2(d01Var != null ? Integer.valueOf(d01Var.getVideoViews()) : null, i14);
                        break;
                    } else if (viewType2 instanceof o) {
                        itemView.Y2(d01Var != null ? Integer.valueOf(d01Var.getSaveCount()) : null, i14);
                        break;
                    } else if (viewType2 instanceof n) {
                        itemView.s4(i14, (d01Var == null || (averageTime = d01Var.getAverageTime()) == null) ? null : kh2.d.C(averageTime.intValue()));
                        break;
                    }
                    break;
            }
            f30 f30Var = this.f59965d;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            Boolean T5 = f30Var.T5();
            Intrinsics.checkNotNullExpressionValue(T5, "getPromotedIsRemovable(...)");
            if (T5.booleanValue() && ((aVar instanceof o) || (aVar instanceof cr0.d))) {
                itemView.y();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(com.pinterest.api.model.f30 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Map r0 = r9.V3()
            if (r0 == 0) goto L88
            java.lang.String r1 = "30d_realtime"
            java.lang.Object r2 = r0.get(r1)
            com.pinterest.api.model.bg r2 = (com.pinterest.api.model.bg) r2
            r3 = 0
            if (r2 == 0) goto L1b
            java.lang.Boolean r2 = r2.w()
            goto L1c
        L1b:
            r2 = r3
        L1c:
            r4 = 0
            if (r2 != 0) goto L21
            r2 = r4
            goto L25
        L21:
            boolean r2 = r2.booleanValue()
        L25:
            r5 = 1
            if (r2 != 0) goto L53
            java.lang.Object r6 = r0.get(r1)
            com.pinterest.api.model.bg r6 = (com.pinterest.api.model.bg) r6
            if (r6 == 0) goto L35
            java.util.Date r6 = r6.C()
            goto L36
        L35:
            r6 = r3
        L36:
            java.lang.String r7 = "24h_realtime"
            java.lang.Object r7 = r0.get(r7)
            com.pinterest.api.model.bg r7 = (com.pinterest.api.model.bg) r7
            if (r7 == 0) goto L45
            java.util.Date r7 = r7.C()
            goto L46
        L45:
            r7 = r3
        L46:
            if (r6 == 0) goto L53
            if (r7 != 0) goto L4b
            goto L53
        L4b:
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r7, r6)
            if (r6 != 0) goto L53
            r6 = r5
            goto L54
        L53:
            r6 = r4
        L54:
            if (r2 != 0) goto L59
            if (r6 != 0) goto L59
            r4 = r5
        L59:
            if (r2 == 0) goto L5e
            cr0.m r2 = cr0.m.Realtime
            goto L6a
        L5e:
            if (r4 == 0) goto L63
            cr0.m r2 = cr0.m.Hourly
            goto L6a
        L63:
            if (r6 == 0) goto L68
            cr0.m r2 = cr0.m.Daily
            goto L6a
        L68:
            cr0.m r2 = cr0.m.Unknown
        L6a:
            cr0.l r4 = cr0.l.Last30Days
            cr0.g r5 = new cr0.g
            java.lang.Object r0 = r0.get(r1)
            com.pinterest.api.model.bg r0 = (com.pinterest.api.model.bg) r0
            if (r0 == 0) goto L7a
            java.util.Date r3 = r0.C()
        L7a:
            r5.<init>(r9, r2, r4, r3)
            yk1.n r9 = r8.getView()
            cr0.j r9 = (cr0.j) r9
            rq.b r9 = (rq.b) r9
            r9.i(r5)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er0.b.r3(com.pinterest.api.model.f30):void");
    }

    public final void s3(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        pinalytics.N(f1.TAP, u0.SEE_PIN_STATS_BUTTON, g0.PIN_CLOSEUP_PIN_ANALYTICS, null, false);
        wy0 f13 = ((b60.d) this.f59964c).f();
        boolean d2 = f13 != null ? Intrinsics.d(f13.G3(), Boolean.TRUE) : false;
        Bundle bundle = new Bundle();
        f30 f30Var = this.f59965d;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        bundle.putString("PIN_ID", f30Var.getUid());
        bundle.putBoolean("IS_A_PARTNER", d2);
        this.f59963b.d(Navigation.v1((ScreenLocation) i0.f50932j.getValue(), bundle));
    }
}
