package sv0;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import go0.r;
import jk2.g0;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;
import uj2.c0;
import uj2.q;

/* loaded from: classes5.dex */
public final class n implements TransferListener {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f115367a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115368b;

    /* renamed from: c, reason: collision with root package name */
    public final fe0.b f115369c;

    /* renamed from: d, reason: collision with root package name */
    public final q f115370d;

    /* renamed from: e, reason: collision with root package name */
    public final String f115371e;

    /* renamed from: f, reason: collision with root package name */
    public final tb0.h f115372f;

    /* renamed from: g, reason: collision with root package name */
    public final int f115373g;

    /* renamed from: h, reason: collision with root package name */
    public final p f115374h;

    /* renamed from: i, reason: collision with root package name */
    public Long f115375i;

    /* renamed from: j, reason: collision with root package name */
    public Long f115376j;

    public n(kk2.a emitter, String pageId, fe0.b networkSpeedDataProvider, q networkType, String creationSessionId, tb0.h crashReporting, int i13, l uploadSpeedTracker) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(networkSpeedDataProvider, "networkSpeedDataProvider");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(uploadSpeedTracker, "uploadSpeedTracker");
        this.f115367a = emitter;
        this.f115368b = pageId;
        this.f115369c = networkSpeedDataProvider;
        this.f115370d = networkType;
        this.f115371e = creationSessionId;
        this.f115372f = crashReporting;
        this.f115373g = i13;
        this.f115374h = uploadSpeedTracker;
    }

    @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
    public final void a(TransferState transferState) {
        int i13 = transferState == null ? -1 : m.f115366a[transferState.ordinal()];
        if (i13 == 1) {
            this.f115375i = Long.valueOf(System.currentTimeMillis());
            return;
        }
        c0 c0Var = this.f115367a;
        if (i13 != 2) {
            if (i13 == 3) {
                ((kk2.a) c0Var).b(o.FAILED);
                return;
            } else if (i13 == 4) {
                ((kk2.a) c0Var).b(o.CANCELLED);
                return;
            } else {
                if (transferState == null) {
                    ((kk2.a) c0Var).b(o.UNKNOWN);
                    return;
                }
                return;
            }
        }
        Long l13 = this.f115375i;
        Long l14 = this.f115376j;
        if (l13 != null && l14 != null && this.f115373g == 0) {
            g0 s13 = this.f115370d.s();
            a0 a0Var = tk2.e.f118017c;
            s13.r(a0Var).l(a0Var).o(new pv0.e(6, new r(this, l13, l14, 27)), new pv0.e(7, new au0.f(this, 24)));
        }
        ((kk2.a) c0Var).b(o.UPLOADED);
    }

    @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
    public final void b(long j13, long j14) {
        this.f115376j = Long.valueOf(j13);
    }

    @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
    public final void c(Exception exc) {
        Intrinsics.f(exc);
        ((kk2.a) this.f115367a).a(exc);
    }
}
