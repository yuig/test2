package com.amazonaws.internal.config;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class InternalConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SignerConfig f28617a = new SignerConfig("AWS4SignerType");

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f28618b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f28619c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f28620d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f28621e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f28622f;

    public static class Factory {

        /* renamed from: a, reason: collision with root package name */
        public static final InternalConfig f28623a;

        static {
            try {
                f28623a = new InternalConfig();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception e14) {
                throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", e14);
            }
        }
    }

    static {
        LogFactory.a(InternalConfig.class);
    }

    public InternalConfig() {
        HashMap hashMap = new HashMap();
        hashMap.put("eu-central-1", new SignerConfig("AWS4SignerType"));
        hashMap.put("cn-north-1", new SignerConfig("AWS4SignerType"));
        this.f28619c = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ec2", new SignerConfig("QueryStringSignerType"));
        hashMap2.put("email", new SignerConfig("AWS4SignerType"));
        hashMap2.put("s3", new SignerConfig("AWSS3V4SignerType"));
        hashMap2.put("sdb", new SignerConfig("QueryStringSignerType"));
        hashMap2.put("lex", new SignerConfig("AmazonLexV4Signer"));
        hashMap2.put("polly", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f28620d = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("s3/eu-central-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/cn-north-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/us-east-2", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/ca-central-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/ap-south-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/ap-northeast-2", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/eu-west-2", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("lex/eu-central-1", new SignerConfig("AmazonLexV4Signer"));
        hashMap3.put("lex/cn-north-1", new SignerConfig("AmazonLexV4Signer"));
        hashMap3.put("polly/eu-central-1", new SignerConfig("AmazonPollyCustomPresigner"));
        hashMap3.put("polly/cn-north-1", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f28618b = hashMap3;
        HashMap hashMap4 = new HashMap();
        hashMap4.put("AmazonCloudWatchClient", new HttpClientConfig("monitoring"));
        hashMap4.put("AmazonCloudWatchLogsClient", new HttpClientConfig("logs"));
        hashMap4.put("AmazonCognitoIdentityClient", new HttpClientConfig("cognito-identity"));
        hashMap4.put("AmazonCognitoIdentityProviderClient", new HttpClientConfig("cognito-idp"));
        hashMap4.put("AmazonCognitoSyncClient", new HttpClientConfig("cognito-sync"));
        hashMap4.put("AmazonComprehendClient", new HttpClientConfig("comprehend"));
        hashMap4.put("AmazonConnectClient", new HttpClientConfig("connect"));
        hashMap4.put("AmazonKinesisFirehoseClient", new HttpClientConfig("firehose"));
        hashMap4.put("AWSKinesisVideoArchivedMediaClient", new HttpClientConfig("kinesisvideo"));
        hashMap4.put("AWSKinesisVideoSignalingClient", new HttpClientConfig("kinesisvideo"));
        hashMap4.put("AWSIotClient", new HttpClientConfig("execute-api"));
        hashMap4.put("AmazonLexRuntimeClient", new HttpClientConfig("lex"));
        hashMap4.put("AmazonPinpointClient", new HttpClientConfig("mobiletargeting"));
        hashMap4.put("AmazonPinpointAnalyticsClient", new HttpClientConfig("mobileanalytics"));
        hashMap4.put("AmazonSageMakerRuntimeClient", new HttpClientConfig("sagemaker"));
        hashMap4.put("AmazonSimpleDBClient", new HttpClientConfig("sdb"));
        hashMap4.put("AmazonSimpleEmailServiceClient", new HttpClientConfig("email"));
        hashMap4.put("AWSSecurityTokenServiceClient", new HttpClientConfig("sts"));
        hashMap4.put("AmazonTextractClient", new HttpClientConfig("textract"));
        hashMap4.put("AmazonTranscribeClient", new HttpClientConfig("transcribe"));
        hashMap4.put("AmazonTranslateClient", new HttpClientConfig("translate"));
        this.f28621e = hashMap4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com", "us-gov-west-1"));
        this.f28622f = arrayList;
    }
}
