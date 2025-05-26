package m60;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import pk.h1;
import so.oa;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85901i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f85902j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(m mVar, int i13) {
        super(0);
        this.f85901i = i13;
        this.f85902j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f85901i;
        m mVar = this.f85902j;
        switch (i13) {
            case 0:
                return (OkHttpClient) ((oa) mVar.h()).f113974w0.get();
            case 1:
                return (vu1.a0) ((oa) mVar.h()).U0.get();
            case 2:
                return ((oa) mVar.h()).r2();
            case 3:
                return new n60.s(mVar);
            case 4:
                oa oaVar = (oa) mVar.h();
                d7.b0 b13 = h1.b(17);
                b13.e("com.pinterest.hairball.account.AccountTransferWorker", oaVar.K7);
                b13.e("com.pinterest.typeahead.ClientCacheWorker", oaVar.M7);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.CreateStoryPinWorker", oaVar.f113753j8);
                b13.e("com.pinterest.experiment.ExperimentsRefreshWorker", oaVar.f113770k8);
                b13.e("com.pinterest.engage.GoogleEngageWorker", oaVar.f113805m8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.IdeaPinBulkStatusMediaWorker", oaVar.f113823n8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3CredentialsWorker", oaVar.f113946u8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3MediaUploadWorker", oaVar.f113964v8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker", oaVar.A8);
                b13.e("com.pinterest.hairball.receiver.LogDeviceScreenStateWorker", oaVar.B8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.LogRawIPDWorker", oaVar.C8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.PinInterestTagsWorker", oaVar.G8);
                b13.e("com.pinterest.security.PlayIntegrityVerificationWorker", oaVar.H8);
                b13.e("com.pinterest.pushnotification.PushTokenRegistrationRxWorker", oaVar.I8);
                b13.e("com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker", oaVar.L8);
                b13.e("com.pinterest.feature.video.worker.VideoPinCreateMediaWorker", oaVar.S8);
                b13.e("com.pinterest.widget.WidgetRefreshWorker", oaVar.U8);
                return new p6.a(b13.a());
            case 5:
                mVar.d().f117094r = new com.google.firebase.messaging.a0(mVar, 15);
                return Unit.f80348a;
            case 6:
                mVar.h();
                return l10.b.a();
            case 7:
                return (su1.i) ((oa) mVar.h()).f113781l1.get();
            case 8:
                return (cy.k) ((oa) mVar.h()).S0.get();
            case 9:
                return (su1.o) ((oa) mVar.h()).f113804m7.get();
            case 10:
                return (nx.f0) ((oa) mVar.h()).f113747j2.get();
            case 11:
                return ((oa) mVar.h()).d3();
            default:
                return (nx.d0) ((oa) mVar.h()).f113817n2.get();
        }
    }
}
