package com.amazonaws.services.s3;

/* loaded from: classes3.dex */
public class S3ClientOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28784a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28785b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28786c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28787d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f28788a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28789b;

        public /* synthetic */ Builder(int i13) {
            this();
        }

        private Builder() {
            this.f28788a = false;
            this.f28789b = false;
        }
    }

    @Deprecated
    public S3ClientOptions() {
        this.f28784a = false;
        this.f28785b = false;
        this.f28786c = false;
        this.f28787d = false;
    }

    public S3ClientOptions(S3ClientOptions s3ClientOptions) {
        this.f28784a = s3ClientOptions.f28784a;
        this.f28785b = s3ClientOptions.f28785b;
        this.f28786c = s3ClientOptions.f28786c;
        this.f28787d = s3ClientOptions.f28787d;
    }

    public S3ClientOptions(boolean z13, boolean z14, boolean z15) {
        this.f28784a = z13;
        this.f28785b = z14;
        this.f28786c = z15;
        this.f28787d = false;
    }
}
