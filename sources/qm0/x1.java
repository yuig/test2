package qm0;

import com.pinterest.api.model.v7;
import com.pinterest.feature.board.detail.BoardDetailFeatureLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final tm0.e f104355b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f104356c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f104357d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.h0 f104358e;

    public x1(o82.i0 sectionStateTransformer, lt.j pinalyticsStateTransformer, lt.j boardToolsStateTransformer, tm0.i displayStateMapper) {
        Intrinsics.checkNotNullParameter(sectionStateTransformer, "sectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        Intrinsics.checkNotNullParameter(boardToolsStateTransformer, "boardToolsStateTransformer");
        Intrinsics.checkNotNullParameter(displayStateMapper, "displayStateMapper");
        this.f104355b = displayStateMapper;
        this.f104356c = b(sectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: qm0.v1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f104242b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: qm0.w1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((y1) obj).f104365e;
            }
        }, r1.f104338l);
        this.f104357d = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: qm0.t1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f104245e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: qm0.u1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((y1) obj).f104370j;
            }
        }, r1.f104337k);
        this.f104358e = b(boardToolsStateTransformer, new kotlin.jvm.internal.d0() { // from class: qm0.p1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f104244d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: qm0.q1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((y1) obj).f104366f;
            }
        }, r1.f104336j);
    }

    public static void g(l82.e eVar) {
        String boardId = ((y1) eVar.f82219b).f104361a;
        if (!(!kotlin.text.z.j(boardId))) {
            boardId = null;
        }
        if (boardId == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        NavigationImpl z03 = Navigation.z0(BoardDetailFeatureLocation.BOARD_ALL_SAVES, boardId);
        z03.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        eVar.a(new k1(new al1.a(z03)));
    }

    public static void h(l82.e eVar) {
        v7 v7Var = ((y1) eVar.f82219b).f104362b;
        if (v7Var == null) {
            return;
        }
        h32.u0 u0Var = h32.u0.SHARE_BUTTON;
        h32.g0 g0Var = h32.g0.NAVIGATION;
        String uid = v7Var.getUid();
        y1 y1Var = (y1) eVar.f82219b;
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        HashMap hashMap = new HashMap();
        bs1.c.G1("board_id", y1Var.f104361a, hashMap);
        hashMap.put("board_pin_count", String.valueOf(v7Var.l1().intValue()));
        Unit unit = Unit.f80348a;
        eVar.d(el.a.J2(eVar, u0Var, g0Var, uid, hashMap, 7), new f1(v7Var, ((y1) eVar.f82219b).f104367g));
    }

    public static void i(l82.e eVar, boolean z13) {
        y1 y1Var = (y1) eVar.f82219b;
        v7 v7Var = y1Var.f104362b;
        if (v7Var == null) {
            return;
        }
        eVar.a(new z0(new pm0.b0(v7Var, z13 ? pm0.a.f100632a : new pm0.x(y1Var.f104368h))));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        y1 vmState = (y1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new b(t0.f104343a, new o82.a0(), wm0.a.NoTools, lm0.d0.f83856a, new zy.a0()), vmState);
        bk.f.T(d2, this.f104358e);
        bk.f.T(d2, this.f104356c);
        bk.f.T(d2, this.f104357d);
        d2.d(new a1(new pm0.d0(vmState.f104361a, false)), new z0(new pm0.f0(vmState.f104361a)));
        return d2.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01de, code lost:
    
        if (r4 != null) goto L70;
     */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r18, u50.o r19, l82.i0 r20, l82.e r21) {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qm0.x1.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
