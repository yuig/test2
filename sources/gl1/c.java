package gl1;

import android.os.Handler;
import android.os.Looper;
import fk2.l;
import hk2.h;
import java.util.concurrent.TimeUnit;
import jk2.l1;
import jk2.u2;
import jk2.x;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import mk2.k;
import net.quikkly.android.ui.CameraPreview;
import uj2.a0;
import uj2.b0;
import uj2.q;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final Handler f65740f = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public static final k f65741g;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f65742a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f65743b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f65744c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65745d;

    /* renamed from: e, reason: collision with root package name */
    public final long f65746e;

    static {
        k kVar = new k(new o.a(11));
        Intrinsics.checkNotNullExpressionValue(kVar, "from(...)");
        f65741g = kVar;
    }

    public c(a0 dbScheduler, int i13) {
        if ((i13 & 1) != 0) {
            dbScheduler = tk2.e.f118018d;
            Intrinsics.checkNotNullExpressionValue(dbScheduler, "trampoline(...)");
        }
        a0 ioScheduler = tk2.e.f118017c;
        Intrinsics.checkNotNullExpressionValue(ioScheduler, "io(...)");
        Intrinsics.checkNotNullParameter(dbScheduler, "dbScheduler");
        Intrinsics.checkNotNullParameter(ioScheduler, "ioScheduler");
        k observeOnScheduler = f65741g;
        Intrinsics.checkNotNullParameter(observeOnScheduler, "observeOnScheduler");
        this.f65742a = dbScheduler;
        this.f65743b = ioScheduler;
        this.f65744c = observeOnScheduler;
        this.f65745d = 1000L;
        this.f65746e = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
    }

    @Override // gl1.d
    public final uj2.b a(uj2.b completable) {
        Intrinsics.checkNotNullParameter(completable, "completable");
        l h10 = completable.h(this.f65744c);
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        return h10;
    }

    @Override // gl1.d
    public final q b(q observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        l1 A = observable.A(this.f65744c);
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        return A;
    }

    @Override // gl1.d
    public final q c(q observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        x H = observable.H(this.f65743b);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    @Override // gl1.d
    public final b0 d(b0 single) {
        Intrinsics.checkNotNullParameter(single, "single");
        t l13 = single.l(this.f65744c);
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return l13;
    }

    @Override // gl1.d
    public final uj2.b e(uj2.b completable) {
        Intrinsics.checkNotNullParameter(completable, "completable");
        fk2.c l13 = completable.l(this.f65743b);
        Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
        return l13;
    }

    @Override // gl1.d
    public final uj2.l f(uj2.l maybe) {
        Intrinsics.checkNotNullParameter(maybe, "maybe");
        h h10 = maybe.h(this.f65743b);
        Intrinsics.checkNotNullExpressionValue(h10, "subscribeOn(...)");
        return h10;
    }

    @Override // gl1.d
    public final uj2.l g(uj2.l maybe) {
        Intrinsics.checkNotNullParameter(maybe, "maybe");
        hk2.k e13 = maybe.e(this.f65744c);
        Intrinsics.checkNotNullExpressionValue(e13, "observeOn(...)");
        return e13;
    }

    @Override // gl1.d
    public final q h(q observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        u2 L = observable.L(Intrinsics.d(Looper.getMainLooper(), Looper.myLooper()) ? this.f65745d : this.f65746e, TimeUnit.MILLISECONDS, this.f65743b);
        Intrinsics.checkNotNullExpressionValue(L, "timeout(...)");
        return L;
    }

    @Override // gl1.d
    public final q i(q observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        x H = observable.H(this.f65742a);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    @Override // gl1.d
    public final b0 j(b0 single) {
        Intrinsics.checkNotNullParameter(single, "single");
        t r13 = single.r(this.f65742a);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }

    @Override // gl1.d
    public final xj2.c k(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        xj2.c b13 = this.f65742a.b(runnable);
        Intrinsics.checkNotNullExpressionValue(b13, "scheduleDirect(...)");
        return b13;
    }

    @Override // gl1.d
    public final b0 l(b0 single) {
        Intrinsics.checkNotNullParameter(single, "single");
        t r13 = single.r(this.f65743b);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }
}
