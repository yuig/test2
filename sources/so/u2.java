package so;

import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import com.pinterest.repository.pin.PinService;

/* loaded from: classes3.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f114645a;

    public u2(r8 r8Var) {
        this.f114645a = r8Var;
    }

    public final n02.o a(ReportData reportData, ReportReasonData reportReasonData) {
        r8 r8Var = this.f114645a;
        k22.m mVar = (k22.m) r8Var.f114090a.Y4.get();
        oa oaVar = r8Var.f114090a;
        PinService pinService = (PinService) oaVar.f113713h3.get();
        i02.a aVar = (i02.a) oaVar.f113725hf.get();
        e12.d dVar = (e12.d) oaVar.V3.get();
        q12.b bVar = (q12.b) oaVar.f113750j5.get();
        lh0.n1 n1Var = (lh0.n1) oaVar.E0.get();
        s8 s8Var = r8Var.f114091b;
        s8Var.getClass();
        return new n02.o(reportData, reportReasonData, mVar, pinService, aVar, dVar, bVar, n1Var, new lh0.c3((lh0.z0) s8Var.f114255d.D0.get()), (m60.w) oaVar.f113885r0.get(), (uk1.e) oaVar.f113702ga.get(), (uj2.q) oaVar.f113947u9.get(), (i92.k) oaVar.f113921t1.get());
    }
}
