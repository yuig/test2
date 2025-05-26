package b8;

import a.cb;
import a7.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import java.util.Locale;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22173a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f22174b;

    /* renamed from: c, reason: collision with root package name */
    public long f22175c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f22176d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f22177e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f22178f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f22179g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22180h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22181i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22182j;

    public k(a8.k kVar) {
        this.f22173a = kVar;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22175c = j13;
        this.f22177e = -1;
        this.f22179g = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        bf.b.t(this.f22175c == -9223372036854775807L);
        this.f22175c = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 2);
        this.f22174b = D;
        D.b(this.f22173a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        bf.b.w(this.f22174b);
        int y13 = d0Var.y();
        if ((y13 & 16) == 16 && (y13 & 7) == 0) {
            if (this.f22180h && this.f22177e > 0) {
                k0 k0Var = this.f22174b;
                k0Var.getClass();
                k0Var.a(this.f22178f, this.f22181i ? 1 : 0, this.f22177e, 0, null);
                this.f22177e = -1;
                this.f22178f = -9223372036854775807L;
                this.f22180h = false;
            }
            this.f22180h = true;
        } else {
            if (!this.f22180h) {
                d7.u.g("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int a13 = a8.i.a(this.f22176d);
            if (i13 < a13) {
                int i14 = n0.f53866a;
                Locale locale = Locale.US;
                d7.u.g("RtpVP8Reader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a13, "; received: ", i13, ". Dropping packet."));
                return;
            }
        }
        if ((y13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            int y14 = d0Var.y();
            if ((y14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 && (d0Var.y() & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                d0Var.L(1);
            }
            if ((y14 & 64) != 0) {
                d0Var.L(1);
            }
            if ((y14 & 32) != 0 || (y14 & 16) != 0) {
                d0Var.L(1);
            }
        }
        if (this.f22177e == -1 && this.f22180h) {
            this.f22181i = (d0Var.h() & 1) == 0;
        }
        if (!this.f22182j) {
            int i15 = d0Var.f53807b;
            d0Var.K(i15 + 6);
            int r13 = d0Var.r() & 16383;
            int r14 = d0Var.r() & 16383;
            d0Var.K(i15);
            androidx.media3.common.b bVar = this.f22173a.f1381c;
            if (r13 != bVar.f18772v || r14 != bVar.f18773w) {
                k0 k0Var2 = this.f22174b;
                q a14 = bVar.a();
                a14.f1188u = r13;
                a14.f1189v = r14;
                k0Var2.b(new androidx.media3.common.b(a14));
            }
            this.f22182j = true;
        }
        int a15 = d0Var.a();
        this.f22174b.d(a15, 0, d0Var);
        int i16 = this.f22177e;
        if (i16 == -1) {
            this.f22177e = a15;
        } else {
            this.f22177e = i16 + a15;
        }
        this.f22178f = kh2.j.I2(this.f22179g, j13, this.f22175c, 90000);
        if (z13) {
            k0 k0Var3 = this.f22174b;
            k0Var3.getClass();
            k0Var3.a(this.f22178f, this.f22181i ? 1 : 0, this.f22177e, 0, null);
            this.f22177e = -1;
            this.f22178f = -9223372036854775807L;
            this.f22180h = false;
        }
        this.f22176d = i13;
    }
}
