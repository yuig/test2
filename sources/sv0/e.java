package sv0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f115331a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115332b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115333c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115334d;

    /* renamed from: e, reason: collision with root package name */
    public final String f115335e;

    /* renamed from: f, reason: collision with root package name */
    public final String f115336f;

    /* renamed from: g, reason: collision with root package name */
    public final String f115337g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f115338h;

    /* renamed from: i, reason: collision with root package name */
    public final String f115339i;

    public e(String bucketName, String uploadKey, String uploadKeySignature, String region, String accessKey, String secret, String sessionToken, Long l13, String mediaId) {
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(uploadKeySignature, "uploadKeySignature");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        this.f115331a = bucketName;
        this.f115332b = uploadKey;
        this.f115333c = uploadKeySignature;
        this.f115334d = region;
        this.f115335e = accessKey;
        this.f115336f = secret;
        this.f115337g = sessionToken;
        this.f115338h = l13;
        this.f115339i = mediaId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f115331a, eVar.f115331a) && Intrinsics.d(this.f115332b, eVar.f115332b) && Intrinsics.d(this.f115333c, eVar.f115333c) && Intrinsics.d(this.f115334d, eVar.f115334d) && Intrinsics.d(this.f115335e, eVar.f115335e) && Intrinsics.d(this.f115336f, eVar.f115336f) && Intrinsics.d(this.f115337g, eVar.f115337g) && Intrinsics.d(this.f115338h, eVar.f115338h) && Intrinsics.d(this.f115339i, eVar.f115339i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f115337g, cb.d(this.f115336f, cb.d(this.f115335e, cb.d(this.f115334d, cb.d(this.f115333c, cb.d(this.f115332b, this.f115331a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Long l13 = this.f115338h;
        return this.f115339i.hashCode() + ((d2 + (l13 == null ? 0 : l13.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("S3Params(bucketName=");
        sb3.append(this.f115331a);
        sb3.append(", uploadKey=");
        sb3.append(this.f115332b);
        sb3.append(", uploadKeySignature=");
        sb3.append(this.f115333c);
        sb3.append(", region=");
        sb3.append(this.f115334d);
        sb3.append(", accessKey=");
        sb3.append(this.f115335e);
        sb3.append(", secret=");
        sb3.append(this.f115336f);
        sb3.append(", sessionToken=");
        sb3.append(this.f115337g);
        sb3.append(", expirationTime=");
        sb3.append(this.f115338h);
        sb3.append(", mediaId=");
        return a.a.p(sb3, this.f115339i, ")");
    }
}
