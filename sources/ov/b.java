package ov;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j;
import lh0.z3;
import nm.u;
import nv.c;
import nv.d;
import nv.e;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j f97722a;

    /* renamed from: b, reason: collision with root package name */
    public final es.a f97723b;

    public b(j experiments, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f97722a = experiments;
        this.f97723b = adFormats;
    }

    @Override // nv.e
    public final boolean a(f30 pin, c pinValidationContext) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinValidationContext, "pinValidationContext");
        if (((es.c) this.f97723b).L(pin)) {
            j jVar = this.f97722a;
            jVar.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) jVar.f83394a;
            if (g1Var.o("android_ads_pharma_pin_validator", "enabled", z3Var) || g1Var.l("android_ads_pharma_pin_validator")) {
                return true;
            }
        }
        return false;
    }

    @Override // nv.e
    public final d b(f30 pin, c pinValidationContext) {
        String Z;
        String Y;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinValidationContext, "pinValidationContext");
        ArrayList arrayList = new ArrayList();
        g t33 = pin.t3();
        if (t33 != null && (Y = t33.Y()) != null && Y.length() == 0) {
            arrayList.add("Empty disclosure label");
        }
        g t34 = pin.t3();
        if (t34 != null && (Z = t34.Z()) != null && Z.length() == 0) {
            arrayList.add("Empty disclosure URL");
        }
        if (!pin.V5().booleanValue()) {
            arrayList.add("Side swipe enabled");
        }
        if (!pin.T5().booleanValue()) {
            arrayList.add("Savable");
        }
        if (pinValidationContext.f92345a || pinValidationContext.f92346b) {
            arrayList.add("In module");
        }
        ArrayList arrayList2 = arrayList.isEmpty() ^ true ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        u uVar = new u();
        uVar.u("failure_reasons", CollectionsKt.Z(arrayList2, ", ", null, null, 0, null, null, 62));
        return new d("Pharma", uVar);
    }
}
