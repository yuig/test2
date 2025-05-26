package cj0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.d4;
import h32.f1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f27787b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.d0 f27788c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f27789d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.h0 f27790e;

    public c0(dj0.k boardDisplayStateMapper, m60.d0 gridColumnCountProvider, o82.i0 sectionStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(boardDisplayStateMapper, "boardDisplayStateMapper");
        Intrinsics.checkNotNullParameter(gridColumnCountProvider, "gridColumnCountProvider");
        Intrinsics.checkNotNullParameter(sectionStateTransformer, "sectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f27787b = boardDisplayStateMapper;
        this.f27788c = gridColumnCountProvider;
        this.f27789d = b(sectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: cj0.z
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f27826d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: cj0.a0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d0) obj).f27800g;
            }
        }, y.f27879k);
        this.f27790e = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: cj0.w
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f27827e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: cj0.x
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d0) obj).f27801h;
            }
        }, y.f27878j);
    }

    public static r0 g(c0 c0Var, zy.l0 l0Var, h32.g0 g0Var, h32.u0 u0Var, f1 f1Var, d4 d4Var, String str, HashMap hashMap, int i13) {
        d4 d4Var2 = (i13 & 16) != 0 ? null : d4Var;
        String str2 = (i13 & 32) != 0 ? null : str;
        HashMap hashMap2 = (i13 & 64) != 0 ? null : hashMap;
        c0Var.getClass();
        h32.i0 source = l0Var.f143086a;
        Intrinsics.checkNotNullParameter(source, "source");
        return new r0(new zy.f0(new zy.a(new h32.i0(d4Var2 != null ? d4Var2 : source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, u0Var), f1Var, str2, hashMap2, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM)));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        d0 vmState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new g(this.f27788c.a(vmState.f27797d.toGridRepStyle()), new gj0.c(null, null, null, null, null, 255), new ej0.a(null, null, null, null, null, 63), new o82.a0(), new zy.a0(), null, false), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f27789d;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens2 = this.f27790e;
        Intrinsics.checkNotNullParameter(lens2, "lens");
        Intrinsics.checkNotNullParameter(lens2, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens2.b(resultBuilder);
        resultBuilder.a(p0.f27855a);
        return resultBuilder.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030b  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r63, u50.o r64, l82.i0 r65, l82.e r66) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cj0.c0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
