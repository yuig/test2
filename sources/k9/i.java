package k9;

import com.google.android.gms.internal.measurement.q4;
import d7.d0;
import q8.k0;
import q8.u;
import x4.e0;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public k0 f78692b;

    /* renamed from: c, reason: collision with root package name */
    public u f78693c;

    /* renamed from: d, reason: collision with root package name */
    public g f78694d;

    /* renamed from: e, reason: collision with root package name */
    public long f78695e;

    /* renamed from: f, reason: collision with root package name */
    public long f78696f;

    /* renamed from: g, reason: collision with root package name */
    public long f78697g;

    /* renamed from: h, reason: collision with root package name */
    public int f78698h;

    /* renamed from: i, reason: collision with root package name */
    public int f78699i;

    /* renamed from: k, reason: collision with root package name */
    public long f78701k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f78702l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78703m;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f78691a = new e0();

    /* renamed from: j, reason: collision with root package name */
    public q4 f78700j = new q4(18);

    public void a(long j13) {
        this.f78697g = j13;
    }

    public abstract long b(d0 d0Var);

    public abstract boolean c(d0 d0Var, long j13, q4 q4Var);

    public void d(boolean z13) {
        if (z13) {
            this.f78700j = new q4(18);
            this.f78696f = 0L;
            this.f78698h = 0;
        } else {
            this.f78698h = 1;
        }
        this.f78695e = -1L;
        this.f78697g = 0L;
    }
}
