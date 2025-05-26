package wd;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f0 implements nd.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129167a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f129168b;

    public f0(int i13) {
        this.f129167a = i13;
        if (i13 != 1) {
            this.f129168b = ByteBuffer.allocate(8);
        } else {
            this.f129168b = ByteBuffer.allocate(4);
        }
    }

    @Override // nd.j
    public final void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f129167a) {
            case 0:
                Long l13 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f129168b) {
                    this.f129168b.position(0);
                    messageDigest.update(this.f129168b.putLong(l13.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f129168b) {
                    this.f129168b.position(0);
                    messageDigest.update(this.f129168b.putInt(num.intValue()).array());
                }
                return;
        }
    }
}
