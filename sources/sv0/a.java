package sv0;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.HttpClient;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import kotlin.jvm.internal.Intrinsics;
import oy.h1;
import oy.k1;

/* loaded from: classes5.dex */
public final class a extends AmazonS3Client {

    /* renamed from: p, reason: collision with root package name */
    public final qg1.i f115323p;

    /* renamed from: q, reason: collision with root package name */
    public final String f115324q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qg1.i uploadLogger, String pageId, b awsCredentialsProvider, Region region, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(awsCredentialsProvider, region, clientConfiguration, httpClient);
        Intrinsics.checkNotNullParameter(uploadLogger, "uploadLogger");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(awsCredentialsProvider, "awsCredentialsProvider");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(clientConfiguration, "clientConfiguration");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f115323p = uploadLogger;
        this.f115324q = pageId;
    }

    @Override // com.amazonaws.services.s3.AmazonS3Client, com.amazonaws.services.s3.AmazonS3
    public final UploadPartResult a(UploadPartRequest uploadPartRequest) {
        Intrinsics.checkNotNullParameter(uploadPartRequest, "uploadPartRequest");
        int i13 = uploadPartRequest.f28921h;
        String partNumber = String.valueOf(i13);
        this.f115323p.getClass();
        Intrinsics.checkNotNullParameter(partNumber, "partNumber");
        String pageId = this.f115324q;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        new oy.e(new k1(partNumber, pageId)).i();
        try {
            UploadPartResult a13 = super.a(uploadPartRequest);
            t(i13, null, s92.o.COMPLETE);
            return a13;
        } catch (Exception e13) {
            t(i13, e13.getMessage(), s92.o.ERROR);
            throw e13;
        }
    }

    public final void t(int i13, String str, s92.o pwtResult) {
        String partNumber = String.valueOf(i13);
        this.f115323p.getClass();
        Intrinsics.checkNotNullParameter(partNumber, "partNumber");
        String pageId = this.f115324q;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        new oy.d(new h1(partNumber, pageId, str, pwtResult)).i();
    }
}
