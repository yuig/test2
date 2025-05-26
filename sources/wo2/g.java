package wo2;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public j f130689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f130690b;

    /* renamed from: c, reason: collision with root package name */
    public z f130691c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f130693e;

    /* renamed from: d, reason: collision with root package name */
    public long f130692d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f130694f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f130695g = -1;

    public final void a(long j13) {
        j jVar = this.f130689a;
        if (jVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!this.f130690b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long j14 = jVar.f130711b;
        if (j13 <= j14) {
            if (j13 < 0) {
                throw new IllegalArgumentException(a.a.g("newSize < 0: ", j13).toString());
            }
            long j15 = j14 - j13;
            while (true) {
                if (j15 <= 0) {
                    break;
                }
                z zVar = jVar.f130710a;
                Intrinsics.f(zVar);
                z zVar2 = zVar.f130758g;
                Intrinsics.f(zVar2);
                int i13 = zVar2.f130754c;
                long j16 = i13 - zVar2.f130753b;
                if (j16 > j15) {
                    zVar2.f130754c = i13 - ((int) j15);
                    break;
                } else {
                    jVar.f130710a = zVar2.a();
                    a0.a(zVar2);
                    j15 -= j16;
                }
            }
            this.f130691c = null;
            this.f130692d = j13;
            this.f130693e = null;
            this.f130694f = -1;
            this.f130695g = -1;
        } else if (j13 > j14) {
            long j17 = j13 - j14;
            int i14 = 1;
            boolean z13 = true;
            for (long j18 = 0; j17 > j18; j18 = 0) {
                z Q = jVar.Q(i14);
                int min = (int) Math.min(j17, 8192 - Q.f130754c);
                int i15 = Q.f130754c + min;
                Q.f130754c = i15;
                j17 -= min;
                if (z13) {
                    this.f130691c = Q;
                    this.f130692d = j14;
                    this.f130693e = Q.f130752a;
                    this.f130694f = i15 - min;
                    this.f130695g = i15;
                    z13 = false;
                }
                i14 = 1;
            }
        }
        jVar.f130711b = j13;
    }

    public final int c(long j13) {
        j jVar = this.f130689a;
        if (jVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j13 >= -1) {
            long j14 = jVar.f130711b;
            if (j13 <= j14) {
                if (j13 == -1 || j13 == j14) {
                    this.f130691c = null;
                    this.f130692d = j13;
                    this.f130693e = null;
                    this.f130694f = -1;
                    this.f130695g = -1;
                    return -1;
                }
                z zVar = jVar.f130710a;
                z zVar2 = this.f130691c;
                long j15 = 0;
                if (zVar2 != null) {
                    long j16 = this.f130692d - (this.f130694f - zVar2.f130753b);
                    if (j16 > j13) {
                        j14 = j16;
                        zVar2 = zVar;
                        zVar = zVar2;
                    } else {
                        j15 = j16;
                    }
                } else {
                    zVar2 = zVar;
                }
                if (j14 - j13 > j13 - j15) {
                    while (true) {
                        Intrinsics.f(zVar2);
                        long j17 = (zVar2.f130754c - zVar2.f130753b) + j15;
                        if (j13 < j17) {
                            break;
                        }
                        zVar2 = zVar2.f130757f;
                        j15 = j17;
                    }
                } else {
                    while (j14 > j13) {
                        Intrinsics.f(zVar);
                        zVar = zVar.f130758g;
                        Intrinsics.f(zVar);
                        j14 -= zVar.f130754c - zVar.f130753b;
                    }
                    zVar2 = zVar;
                    j15 = j14;
                }
                if (this.f130690b) {
                    Intrinsics.f(zVar2);
                    if (zVar2.f130755d) {
                        byte[] bArr = zVar2.f130752a;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        z zVar3 = new z(copyOf, zVar2.f130753b, zVar2.f130754c, false, true);
                        if (jVar.f130710a == zVar2) {
                            jVar.f130710a = zVar3;
                        }
                        zVar2.b(zVar3);
                        z zVar4 = zVar3.f130758g;
                        Intrinsics.f(zVar4);
                        zVar4.a();
                        zVar2 = zVar3;
                    }
                }
                this.f130691c = zVar2;
                this.f130692d = j13;
                Intrinsics.f(zVar2);
                this.f130693e = zVar2.f130752a;
                int i13 = zVar2.f130753b + ((int) (j13 - j15));
                this.f130694f = i13;
                int i14 = zVar2.f130754c;
                this.f130695g = i14;
                return i14 - i13;
            }
        }
        StringBuilder u13 = a.a.u("offset=", j13, " > size=");
        u13.append(jVar.f130711b);
        throw new ArrayIndexOutOfBoundsException(u13.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f130689a == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        this.f130689a = null;
        this.f130691c = null;
        this.f130692d = -1L;
        this.f130693e = null;
        this.f130694f = -1;
        this.f130695g = -1;
    }
}
