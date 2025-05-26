package st0;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import fp0.d;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import lg1.e;
import lg1.h;
import m60.x0;
import nx.d0;
import tt0.b0;
import tt0.l0;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f115165a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f115166b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f115167c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownTimer f115168d;

    /* renamed from: e, reason: collision with root package name */
    public d30 f115169e;

    /* renamed from: f, reason: collision with root package name */
    public final h f115170f;

    public c(l0 view, d0 pinalytics, tb0.h crashReporting, boolean z13) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f115165a = view;
        this.f115166b = pinalytics;
        this.f115167c = z13;
        this.f115170f = new h(pinalytics, crashReporting, new Handler(Looper.getMainLooper()), this);
    }

    @Override // lg1.e
    public final void D0(boolean z13) {
        k01 videoItem;
        d30 photoItem = this.f115169e;
        if (photoItem == null || (videoItem = (k01) this.f115170f.f83267e.get(photoItem.e())) == null) {
            return;
        }
        l0 l0Var = this.f115165a;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        l0Var.f119182r0.post(new b0(l0Var, 0));
        d dVar = l0Var.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        l0Var.f119180p0.b(photoItem, videoItem, dVar.k());
        l0Var.p8(new tt0.d0(l0Var, 12));
    }

    public final void a() {
        CountDownTimer countDownTimer = this.f115168d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void b() {
        a();
        this.f115168d = null;
    }

    public final void c(rt0.e eVar) {
        int i13 = eVar == null ? -1 : a.f115162a[eVar.ordinal()];
        this.f115168d = new b(this, i13 != 1 ? i13 != 2 ? 0 : 3 : 10, (r5 + 1) * 1000).start();
    }

    public final void d(u0 buttonElement) {
        Intrinsics.checkNotNullParameter(buttonElement, "buttonElement");
        this.f115166b.X(buttonElement);
    }

    @Override // lg1.e
    public final boolean m1() {
        return !hf0.b.q();
    }

    @Override // lg1.e
    public final void w(boolean z13, String error, d30 mediaItem) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        l0 l0Var = this.f115165a;
        l0Var.f119182r0.post(new b0(l0Var, 1));
        ImageView imageView = l0Var.f119187w0;
        if (imageView == null) {
            Intrinsics.r("photoPreview");
            throw null;
        }
        imageView.setVisibility(8);
        l0Var.h8().k(x0.oops_something_went_wrong);
    }
}
