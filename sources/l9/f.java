package l9;

/* loaded from: classes3.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f82302a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f82303b;

    public f(long j13, byte[] bArr) {
        this.f82302a = j13;
        this.f82303b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f82302a, ((f) obj).f82302a);
    }
}
