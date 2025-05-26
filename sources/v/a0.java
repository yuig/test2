package v;

import android.os.SystemClock;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class a0 implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final long f123341a;

    /* renamed from: b, reason: collision with root package name */
    public long f123342b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f123343c;

    public /* synthetic */ a0(long j13, Object obj, int i13, long j14) {
        this.f123343c = obj;
        this.f123341a = j13;
        this.f123342b = j14;
    }

    @Override // kk.h
    public final void a(MessageDigest[] messageDigestArr, long j13, int i13) {
        MappedByteBuffer map = ((FileChannel) this.f123343c).map(FileChannel.MapMode.READ_ONLY, this.f123341a + j13, i13);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public final int b() {
        if (!((c0) this.f123343c).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f123342b == -1) {
            this.f123342b = uptimeMillis;
        }
        long j13 = uptimeMillis - this.f123342b;
        if (j13 <= 120000) {
            return 1000;
        }
        return j13 <= 300000 ? 2000 : 4000;
    }

    public final int c() {
        boolean c13 = ((c0) this.f123343c).c();
        long j13 = this.f123341a;
        if (c13) {
            if (j13 > 0) {
                return Math.min((int) j13, 1800000);
            }
            return 1800000;
        }
        if (j13 > 0) {
            return Math.min((int) j13, 10000);
        }
        return 10000;
    }

    public final String toString() {
        return super.toString();
    }

    @Override // kk.h
    public final long zza() {
        return this.f123342b;
    }

    public a0(c0 c0Var, long j13) {
        this.f123343c = c0Var;
        this.f123342b = -1L;
        this.f123341a = j13;
    }
}
