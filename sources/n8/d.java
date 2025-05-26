package n8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f89770a;

    /* renamed from: b, reason: collision with root package name */
    public long f89771b;

    /* renamed from: c, reason: collision with root package name */
    public long f89772c;

    /* renamed from: d, reason: collision with root package name */
    public long f89773d;

    /* renamed from: e, reason: collision with root package name */
    public long f89774e;

    /* renamed from: f, reason: collision with root package name */
    public long f89775f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f89776g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f89777h;

    public final boolean a() {
        return this.f89773d > 15 && this.f89777h == 0;
    }

    public final void b(long j13) {
        long j14 = this.f89773d;
        if (j14 == 0) {
            this.f89770a = j13;
        } else if (j14 == 1) {
            long j15 = j13 - this.f89770a;
            this.f89771b = j15;
            this.f89775f = j15;
            this.f89774e = 1L;
        } else {
            long j16 = j13 - this.f89772c;
            int i13 = (int) (j14 % 15);
            long abs = Math.abs(j16 - this.f89771b);
            boolean[] zArr = this.f89776g;
            if (abs <= 1000000) {
                this.f89774e++;
                this.f89775f += j16;
                if (zArr[i13]) {
                    zArr[i13] = false;
                    this.f89777h--;
                }
            } else if (!zArr[i13]) {
                zArr[i13] = true;
                this.f89777h++;
            }
        }
        this.f89773d++;
        this.f89772c = j13;
    }

    public final void c() {
        this.f89773d = 0L;
        this.f89774e = 0L;
        this.f89775f = 0L;
        this.f89777h = 0;
        Arrays.fill(this.f89776g, false);
    }
}
