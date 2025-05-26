package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class AWSS3V4Signer extends AWS4Signer {
    public AWSS3V4Signer() {
        super(false);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHash(Request request) {
        long j13;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.a("x-amz-content-sha256", "required");
        AmazonWebServiceRequest amazonWebServiceRequest = defaultRequest.f28537g;
        if (!(amazonWebServiceRequest instanceof PutObjectRequest) && !(amazonWebServiceRequest instanceof UploadPartRequest)) {
            return super.calculateContentHash(defaultRequest);
        }
        String str = (String) defaultRequest.f28534d.get("Content-Length");
        if (str != null) {
            j13 = Long.parseLong(str);
        } else {
            try {
                InputStream inputStream = defaultRequest.f28539i;
                if (!inputStream.markSupported()) {
                    throw new AmazonClientException("Failed to get content length");
                }
                byte[] bArr = new byte[4096];
                inputStream.mark(-1);
                long j14 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    j14 += read;
                }
                inputStream.reset();
                j13 = j14;
            } catch (IOException e13) {
                throw new AmazonClientException("Cannot get the content-lenght of the request content.", e13);
            }
        }
        defaultRequest.a("x-amz-decoded-content-length", Long.toString(j13));
        if (j13 < 0) {
            byte[] bArr2 = AwsChunkedEncodingInputStream.f28550m;
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j15 = j13 / 131072;
        long j16 = j13 % 131072;
        defaultRequest.a("Content-Length", Long.toString(AwsChunkedEncodingInputStream.e(0L) + (AwsChunkedEncodingInputStream.e(131072L) * j15) + (j16 > 0 ? AwsChunkedEncodingInputStream.e(j16) : 0L)));
        return "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final String calculateContentHashPresign(Request request) {
        return "UNSIGNED-PAYLOAD";
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final void processRequestPayload(Request request, AWS4Signer.HeaderSigningResult headerSigningResult) {
        AmazonWebServiceRequest amazonWebServiceRequest = ((DefaultRequest) request).f28537g;
        if ((amazonWebServiceRequest instanceof PutObjectRequest) || (amazonWebServiceRequest instanceof UploadPartRequest)) {
            DefaultRequest defaultRequest = (DefaultRequest) request;
            InputStream inputStream = defaultRequest.f28539i;
            String str = headerSigningResult.f28546a;
            byte[] bArr = headerSigningResult.f28548c;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = headerSigningResult.f28549d;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            defaultRequest.f28539i = new AwsChunkedEncodingInputStream(inputStream, bArr2, str, headerSigningResult.f28547b, BinaryUtils.a(bArr4), this);
        }
    }
}
