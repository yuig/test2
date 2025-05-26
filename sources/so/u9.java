package so;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.experiment.ExperimentsRefreshWorker;
import com.pinterest.feature.ideaPinCreation.worker.CreateStoryPinWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinBulkStatusMediaWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3CredentialsWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3MediaUploadWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import com.pinterest.feature.ideaPinCreation.worker.LogRawIPDWorker;
import com.pinterest.feature.ideaPinCreation.worker.PinInterestTagsWorker;
import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import com.pinterest.feature.video.worker.VideoPinCreateMediaWorker;
import com.pinterest.hairball.account.AccountTransferWorker;
import com.pinterest.hairball.receiver.LogDeviceScreenStateWorker;
import com.pinterest.security.PlayIntegrityVerificationWorker;
import com.pinterest.widget.WidgetRefreshWorker;

/* loaded from: classes3.dex */
public final class u9 implements p6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na f114659b;

    public /* synthetic */ u9(na naVar, int i13) {
        this.f114658a = i13;
        this.f114659b = naVar;
    }

    @Override // p6.b
    public final kb.a0 a(Context context, WorkerParameters workerParameters) {
        int i13 = this.f114658a;
        na naVar = this.f114659b;
        switch (i13) {
            case 0:
                return new AccountTransferWorker(context, workerParameters, bf2.b.a(naVar.f113568a.J7));
            case 1:
                h22.f fVar = (h22.f) naVar.f113568a.P7.get();
                oa oaVar = naVar.f113568a;
                return new CreateStoryPinWorker(context, workerParameters, fVar, oa.E1(oaVar), (ag1.b) oaVar.Z7.get(), (ag1.f) oaVar.f113594a8.get(), (bw0.f) oaVar.f113736i8.get(), (dl1.t) oaVar.Y7.get(), (tb0.h) oaVar.f113797m0.get(), (lh0.s1) oaVar.f113718h8.get());
            case 2:
                return new ExperimentsRefreshWorker(context, workerParameters, (lh0.g1) naVar.f113568a.D0.get(), (tb0.h) naVar.f113568a.f113797m0.get());
            case 3:
                ag1.b bVar = (ag1.b) naVar.f113568a.Z7.get();
                oa oaVar2 = naVar.f113568a;
                return new IdeaPinBulkStatusMediaWorker(context, workerParameters, bVar, (bw0.f) oaVar2.f113736i8.get(), (tb0.h) oaVar2.f113797m0.get());
            case 4:
                sv0.l lVar = (sv0.l) naVar.f113568a.f113928t8.get();
                oa oaVar3 = naVar.f113568a;
                return new IdeaPinS3CredentialsWorker(context, workerParameters, lVar, (ag1.b) oaVar3.Z7.get(), (bw0.f) oaVar3.f113736i8.get());
            case 5:
                sv0.l lVar2 = (sv0.l) naVar.f113568a.f113928t8.get();
                oa oaVar4 = naVar.f113568a;
                return new IdeaPinS3MediaUploadWorker(context, workerParameters, lVar2, (ag1.b) oaVar4.Z7.get(), (bw0.f) oaVar4.f113736i8.get(), (fe0.b) oaVar4.f113893r8.get());
            case 6:
                ag1.b bVar2 = (ag1.b) naVar.f113568a.Z7.get();
                oa oaVar5 = naVar.f113568a;
                return new IdeaPinVideoExportWorker(context, workerParameters, bVar2, (bw0.f) oaVar5.f113736i8.get(), (bw0.o) oaVar5.f113700g8.get(), (tb0.h) oaVar5.f113797m0.get(), (lh0.s1) oaVar5.f113718h8.get(), (x02.i2) oaVar5.F3.get(), (x02.x2) oaVar5.f113800m3.get(), (sv0.l) oaVar5.f113928t8.get(), (x02.x0) oaVar5.f113765k3.get(), (nt0.d) oaVar5.f113982w8.get(), (zf1.e) oaVar5.f114036z8.get());
            case 7:
                return new LogDeviceScreenStateWorker(context, workerParameters, (oc.c) naVar.f113568a.f113907s5.get(), naVar.f113568a.k2());
            case 8:
                h22.f fVar2 = (h22.f) naVar.f113568a.P7.get();
                oa oaVar6 = naVar.f113568a;
                return new LogRawIPDWorker(context, workerParameters, fVar2, (ag1.b) oaVar6.Z7.get(), (dl1.t) oaVar6.M2.get(), (bw0.f) oaVar6.f113736i8.get(), (b60.b) oaVar6.f113850p0.get());
            case 9:
                return new PinInterestTagsWorker(context, workerParameters, (m20.b) naVar.f113568a.F8.get(), (bw0.f) naVar.f113568a.f113736i8.get());
            case 10:
                oa oaVar7 = naVar.f113568a;
                return new PlayIntegrityVerificationWorker(context, workerParameters, new r42.g(oaVar7.Z2(), (Context) oaVar7.f113902s0.get()));
            case 11:
                sv0.l lVar3 = (sv0.l) naVar.f113568a.f113928t8.get();
                oa oaVar8 = naVar.f113568a;
                return new UploadIdeaPinImageMediaWorker(context, workerParameters, lVar3, (v20.a) oaVar8.J8.get(), (bw0.f) oaVar8.f113736i8.get(), (bw0.o) oaVar8.f113700g8.get(), (fe0.b) oaVar8.f113893r8.get(), (ag1.h) oaVar8.K8.get(), (lh0.s1) oaVar8.f113718h8.get(), (uj2.q) oaVar8.f113910s8.get(), (tb0.h) oaVar8.f113797m0.get());
            case 12:
                t20.a aVar = (t20.a) naVar.f113568a.O8.get();
                oa oaVar9 = naVar.f113568a;
                return new VideoPinCreateMediaWorker(context, workerParameters, aVar, (y42.f) oaVar9.P8.get(), (pb0.a) oaVar9.f113834o1.get(), oaVar9.M2, (nx.b0) oaVar9.R8.get());
            default:
                return new WidgetRefreshWorker(context, workerParameters, naVar.f113568a.j3());
        }
    }
}
