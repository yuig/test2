package rd;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class l implements ie.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f107511a;

    /* renamed from: b, reason: collision with root package name */
    public final ie.e f107512b = new ie.e();

    public l(MessageDigest messageDigest) {
        this.f107511a = messageDigest;
    }

    @Override // ie.b
    public final ie.e b() {
        return this.f107512b;
    }
}
