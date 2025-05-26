package dk1;

import bi1.a0;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import ni1.e0;
import rm1.i;
import rm1.q;
import u50.b0;
import u50.f0;
import u50.o;
import u50.s;
import wa2.m;

/* loaded from: classes2.dex */
public final class g extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final fs.c f55164b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f55165c;

    public g(fs.c adsSalesDealsDisplay, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f55164b = adsSalesDealsDisplay;
        this.f55165c = adFormats;
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        h vmState = (h) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new b(), vmState);
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(a.f55160a);
        return d2.e();
    }

    @Override // l82.d
    public final c0 f(s sVar, o oVar, i0 i0Var, l82.e resultBuilder) {
        c event = (c) sVar;
        b priorDisplayState = (b) oVar;
        h priorVMState = (h) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof c) {
            resultBuilder.f(f.f55163i);
            h hVar = (h) resultBuilder.f82219b;
            m mVar = hVar.f55168c;
            boolean z13 = hVar.f55170e.E;
            boolean z14 = mVar.N;
            defpackage.d activateExperiment = new defpackage.d(11, resultBuilder);
            fs.c cVar = this.f55164b;
            cVar.getClass();
            f30 pin = hVar.f55166a;
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
            if (cVar.g(pin, z14, mVar.O, fs.a.HEADER, z13, activateExperiment)) {
                String i13 = ((es.c) this.f55165c).i(pin);
                if (i13 == null) {
                    i13 = "";
                }
                int i14 = e0.f90644c;
                vi1.a[] piece = {new fj1.c(new ej1.d(i14, new f0(i13), vn1.c.SUBTLE, null, 2, null, null, null, null, null, 1000), null, eo1.c.sema_space_100, q.ANGLED_PIN, rm1.c.SUBTLE, i.SM, fj1.a.START, g92.d.VR, 2), new ak1.b(new b0(i14), "possiblyAddPromotionPieces - lego_grid_cell_inner_padding")};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(piece, "piece");
                resultBuilder.f(new a0(piece, 8));
            }
        }
        return resultBuilder.e();
    }
}
