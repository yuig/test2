package ov;

import com.pinterest.api.model.f30;
import es.g;
import es.h;
import es.v;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.j;
import lh0.z3;
import nm.u;
import nv.c;
import nv.d;
import nv.e;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j f97719a;

    /* renamed from: b, reason: collision with root package name */
    public final h f97720b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f97721c;

    public a(j experiments, h adsCommonDisplay, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f97719a = experiments;
        this.f97720b = adsCommonDisplay;
        this.f97721c = adFormats;
    }

    @Override // nv.e
    public final boolean a(f30 pin, c pinValidationContext) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinValidationContext, "pinValidationContext");
        Boolean N5 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N5, "getPromotedIsAutoAssembled(...)");
        if (N5.booleanValue() || pin.k4().intValue() != 0) {
            j jVar = this.f97719a;
            jVar.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) jVar.f83394a;
            if (g1Var.o("android_ads_dpa_pin_validator", "enabled", z3Var) || g1Var.l("android_ads_dpa_pin_validator")) {
                return true;
            }
        }
        return false;
    }

    @Override // nv.e
    public final d b(f30 pin, c pinValidationContext) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinValidationContext, "pinValidationContext");
        ArrayList arrayList = new ArrayList();
        j jVar = this.f97719a;
        boolean c13 = jVar.c();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) jVar.f83394a;
        boolean O = ((v) this.f97720b).O(pin, c13, g1Var.o("android_pintag_decan_v2", "enabled", z3Var) || g1Var.l("android_pintag_decan_v2"), g.f59981j);
        String h10 = ((es.c) this.f97721c).h(pin);
        boolean z13 = !(h10 == null || z.j(h10));
        boolean z14 = pin.k4().intValue() == 113;
        boolean z15 = pin.k4().intValue() == 7;
        boolean z16 = pin.k4().intValue() != 0;
        Boolean N5 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N5, "getPromotedIsAutoAssembled(...)");
        if (N5.booleanValue() && z14 && !O) {
            arrayList.add("No pin chip for collection");
        }
        Boolean N52 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N52, "getPromotedIsAutoAssembled(...)");
        if ((N52.booleanValue() && !z16) || (!pin.N5().booleanValue() && z16)) {
            arrayList.add("Wrong combination of fields");
        }
        Boolean N53 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N53, "getPromotedIsAutoAssembled(...)");
        if (N53.booleanValue() && z14 && z13) {
            arrayList.add("Chin available for collection");
        }
        Boolean N54 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N54, "getPromotedIsAutoAssembled(...)");
        if (N54.booleanValue() && z15 && !z13) {
            arrayList.add("Chin not available for shopping");
        }
        Boolean N55 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N55, "getPromotedIsAutoAssembled(...)");
        if (N55.booleanValue() && z14 && (pinValidationContext.f92346b || pinValidationContext.f92345a)) {
            arrayList.add("Collection in module");
        }
        ArrayList arrayList2 = arrayList.isEmpty() ^ true ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        u uVar = new u();
        uVar.u("failure_reasons", CollectionsKt.Z(arrayList2, ", ", null, null, 0, null, null, 62));
        uVar.t("promoted_is_auto_assembled", pin.N5());
        uVar.s(pin.k4(), "dpa_creative_type");
        return new d("DPA", uVar);
    }
}
