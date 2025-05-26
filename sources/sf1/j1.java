package sf1;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import com.pinterest.api.model.st;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes5.dex */
public interface j1 {
    static void L0(j1 j1Var, h32.f1 eventType, h32.u0 u0Var, HashMap hashMap, int i13) {
        h32.v0 v0Var = null;
        h32.u0 u0Var2 = (i13 & 2) != 0 ? null : u0Var;
        HashMap hashMap2 = (i13 & 4) != 0 ? null : hashMap;
        rf1.p0 p0Var = (rf1.p0) j1Var;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        h32.g0 z33 = p0Var.z3();
        String u43 = p0Var.u4();
        HashMap hashMap3 = ((rf1.s0) p0Var.f107826J.invoke()).f107899d;
        bs1.c.G1("pin_id", u43, hashMap3);
        p0Var.q3(p0Var.f107842h0, hashMap3);
        if (hashMap2 != null) {
            hashMap3.putAll(hashMap2);
        }
        nx.d0 pinalytics = p0Var.getPinalytics();
        String F3 = p0Var.F3(p0Var.Z);
        if (F3 != null) {
            v0Var = new h32.v0();
            v0Var.G = F3;
        }
        pinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : eventType, (r18 & 2) != 0 ? null : u0Var2, (r18 & 4) != 0 ? null : z33, (r18 & 8) != 0 ? null : u43, (r18 & 32) != 0 ? null : hashMap3, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    static void Z1(j1 j1Var, View overflowIcon) {
        f30 f30Var;
        h32.v0 v0Var;
        List m13;
        rf1.p0 p0Var = (rf1.p0) j1Var;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(overflowIcon, "overflowIcon");
        if (p0Var.isBound() && (f30Var = p0Var.Z) != null) {
            p0Var.f107870v0 = rf1.s.DO_NOT_RESTART;
            nx.d0 pinalytics = p0Var.getPinalytics();
            h32.u0 u0Var = h32.u0.PIN_STORY_PIN_MORE_ACTIONS_BUTTON;
            h32.g0 g0Var = h32.g0.PIN_STORY_PIN_CHROME;
            String uid = f30Var.getUid();
            HashMap H4 = p0Var.H4();
            String F3 = p0Var.F3(p0Var.Z);
            if (F3 != null) {
                v0Var = new h32.v0();
                v0Var.G = F3;
            } else {
                v0Var = null;
            }
            pinalytics.J(u0Var, g0Var, uid, H4, v0Var, false);
            wy0 u33 = p0Var.u3(f30Var);
            if (u33 == null) {
                u33 = f30Var.I5();
            }
            wy0 wy0Var = u33;
            wy0 c13 = qf1.p.c(f30Var);
            b60.d dVar = (b60.d) p0Var.f107871w;
            wy0 f13 = dVar.f();
            u0 u0Var2 = p0Var.O;
            if (f13 != null) {
                String uid2 = c13 != null ? c13.getUid() : null;
                if (uid2 == null) {
                    uid2 = "";
                }
                if (dl2.b.S1(f13, uid2) && p2.Z0(f30Var, c13, er0.a.DEFAULT) && u0Var2 == u0.SAVE) {
                    u0Var2 = u0.STATS;
                }
            }
            boolean z13 = u0Var2 != u0.SAVE;
            boolean z14 = p0Var.H.f107907e && !g02.a.a(f30Var);
            Boolean U4 = f30Var.U4();
            Intrinsics.checkNotNullExpressionValue(U4, "getIsGoLinkless(...)");
            qf1.j0 j0Var = new qf1.j0(f30Var, wy0Var, z13, z14, U4.booleanValue(), rf1.p0.s3(p0Var), p0Var.H4(), p0Var.I.f107912a, p0Var.N);
            lh0.u1 u1Var = p0Var.f107851m;
            u1Var.getClass();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) u1Var.f83486a;
            boolean o13 = g1Var.o("android_product_tag_api_migration", "enabled", z3Var);
            xk2.k kVar = p0Var.R;
            if (!o13 && !g1Var.l("android_product_tag_api_migration")) {
                qf1.i0 i0Var = (qf1.i0) kVar.getValue();
                Context context = overflowIcon.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i0Var.e(context, j0Var, null);
                return;
            }
            int i13 = 1;
            ((e1) ((k1) p0Var.getView())).showLoadingSpinner(true);
            wy0 f14 = dVar.f();
            String uid3 = f14 != null ? f14.getUid() : null;
            if (uid3 == null) {
                uid3 = "";
            }
            ArrayList arrayList = new ArrayList();
            md O3 = f30Var.O3();
            if (O3 != null && (m13 = O3.m()) != null) {
                Iterator it = m13.iterator();
                while (it.hasNext()) {
                    String s13 = ((st) it.next()).s();
                    if (s13 != null) {
                        arrayList.add(p0Var.f107833d.P(s13));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                xj2.c o14 = uj2.q.g(arrayList, new ic1.a(13, new qf1.z(uid3, 2))).s().r(tk2.e.f118017c).l(wj2.c.a()).o(new rf1.j(14, new rf1.k0(p0Var, j0Var, overflowIcon, 0)), new rf1.j(15, new rf1.k0(p0Var, j0Var, overflowIcon, i13)));
                Intrinsics.checkNotNullExpressionValue(o14, "subscribe(...)");
                p0Var.addDisposable(o14);
            } else {
                ((e1) ((k1) p0Var.getView())).showLoadingSpinner(false);
                qf1.i0 i0Var2 = (qf1.i0) kVar.getValue();
                Context context2 = overflowIcon.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                i0Var2.e(context2, j0Var, Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r10.f108060b == i32.l.IDEA_PIN_SWIPE_TO_RELATED_EDUCATION.getValue()) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e1(sf1.j1 r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.j1.e1(sf1.j1):void");
    }
}
