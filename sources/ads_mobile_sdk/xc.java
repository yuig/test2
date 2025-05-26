package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class xc implements a.cg {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f13600a;

    public xc(ByteBuffer byteBuffer) {
        this.f13600a = byteBuffer.slice();
    }

    @Override // a.cg
    public final void a(MessageDigest[] messageDigestArr, long j13, int i13) {
        ByteBuffer slice;
        synchronized (this.f13600a) {
            int i14 = (int) j13;
            this.f13600a.position(i14);
            this.f13600a.limit(i14 + i13);
            slice = this.f13600a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // a.cg
    public final long size() {
        return this.f13600a.capacity();
    }
}
