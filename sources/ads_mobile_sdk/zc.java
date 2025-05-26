package ads_mobile_sdk;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class zc implements a.cg {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f14710a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14711b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14712c;

    public zc(FileChannel fileChannel, long j13, long j14) {
        this.f14710a = fileChannel;
        this.f14711b = j13;
        this.f14712c = j14;
    }

    @Override // a.cg
    public final void a(MessageDigest[] messageDigestArr, long j13, int i13) {
        MappedByteBuffer map = this.f14710a.map(FileChannel.MapMode.READ_ONLY, this.f14711b + j13, i13);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // a.cg
    public final long size() {
        return this.f14712c;
    }
}
