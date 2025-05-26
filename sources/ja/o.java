package ja;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f75249a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f75250b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f75251c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75252d;

    public o(int i13) {
        this.f75249a = new long[i13];
        this.f75250b = new boolean[i13];
        this.f75251c = new int[i13];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.f75252d) {
                    return null;
                }
                long[] jArr = this.f75249a;
                int length = jArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    int i15 = i14 + 1;
                    int i16 = 1;
                    boolean z13 = jArr[i13] > 0;
                    boolean[] zArr = this.f75250b;
                    if (z13 != zArr[i14]) {
                        int[] iArr = this.f75251c;
                        if (!z13) {
                            i16 = 2;
                        }
                        iArr[i14] = i16;
                    } else {
                        this.f75251c[i14] = 0;
                    }
                    zArr[i14] = z13;
                    i13++;
                    i14 = i15;
                }
                this.f75252d = false;
                return (int[]) this.f75251c.clone();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
