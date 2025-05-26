package wo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f130752a;

    /* renamed from: b, reason: collision with root package name */
    public int f130753b;

    /* renamed from: c, reason: collision with root package name */
    public int f130754c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f130755d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f130756e;

    /* renamed from: f, reason: collision with root package name */
    public z f130757f;

    /* renamed from: g, reason: collision with root package name */
    public z f130758g;

    public z(byte[] data, int i13, int i14, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f130752a = data;
        this.f130753b = i13;
        this.f130754c = i14;
        this.f130755d = z13;
        this.f130756e = z14;
    }

    public final z a() {
        z zVar = this.f130757f;
        if (zVar == this) {
            zVar = null;
        }
        z zVar2 = this.f130758g;
        Intrinsics.f(zVar2);
        zVar2.f130757f = this.f130757f;
        z zVar3 = this.f130757f;
        Intrinsics.f(zVar3);
        zVar3.f130758g = this.f130758g;
        this.f130757f = null;
        this.f130758g = null;
        return zVar;
    }

    public final void b(z segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f130758g = this;
        segment.f130757f = this.f130757f;
        z zVar = this.f130757f;
        Intrinsics.f(zVar);
        zVar.f130758g = segment;
        this.f130757f = segment;
    }

    public final z c() {
        this.f130755d = true;
        return new z(this.f130752a, this.f130753b, this.f130754c, true, false);
    }

    public final void d(z sink, int i13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f130756e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i14 = sink.f130754c;
        int i15 = i14 + i13;
        byte[] bArr = sink.f130752a;
        if (i15 > 8192) {
            if (sink.f130755d) {
                throw new IllegalArgumentException();
            }
            int i16 = sink.f130753b;
            if (i15 - i16 > 8192) {
                throw new IllegalArgumentException();
            }
            kotlin.collections.z.j(bArr, bArr, i16, i14, 2);
            sink.f130754c -= sink.f130753b;
            sink.f130753b = 0;
        }
        int i17 = sink.f130754c;
        int i18 = this.f130753b;
        kotlin.collections.z.f(i17, i18, i18 + i13, this.f130752a, bArr);
        sink.f130754c += i13;
        this.f130753b += i13;
    }

    public z() {
        this.f130752a = new byte[8192];
        this.f130756e = true;
        this.f130755d = false;
    }
}
