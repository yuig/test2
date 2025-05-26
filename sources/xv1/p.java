package xv1;

import c71.b0;
import com.pinterest.api.model.g00;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class p extends l {

    /* renamed from: h, reason: collision with root package name */
    public final ov1.a f136097h;

    /* renamed from: i, reason: collision with root package name */
    public final z61.b f136098i;

    /* renamed from: j, reason: collision with root package name */
    public final uk1.d f136099j;

    /* renamed from: k, reason: collision with root package name */
    public final w f136100k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f136101l;

    /* renamed from: m, reason: collision with root package name */
    public final int f136102m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f136103n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ov1.a oneBarInternalModuleListener, z61.b bVar, uk1.d presenterPinalytics, w eventManager, boolean z13, int i13) {
        super(presenterPinalytics, z13);
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(oneBarInternalModuleListener, "oneBarInternalModuleListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f136097h = oneBarInternalModuleListener;
        this.f136098i = bVar;
        this.f136099j = presenterPinalytics;
        this.f136100k = eventManager;
        this.f136101l = z13;
        this.f136102m = i13;
    }

    @Override // xv1.l
    public final void p3(g00 model) {
        String str;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.w().intValue() == q42.f.GUIDE.getValue()) {
            d0 d0Var = this.f136099j.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            f1 f1Var = f1.ONEBAR_IMPRESSION_ONE_PIXEL;
            g0 g0Var = g0.ONEBAR_MODULE;
            HashMap n13 = bs1.c.n(this.f136081c);
            b0 b0Var = (b0) this.f136084f.invoke();
            if (b0Var != null && (str = b0Var.f26729a0) != null) {
                n13.put("descriptor", str);
            }
            Unit unit = Unit.f80348a;
            d0.B(d0Var, f1Var, g0Var, null, n13, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
    @Override // xv1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(boolean r48) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.p.r3(boolean):void");
    }
}
