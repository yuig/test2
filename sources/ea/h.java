package ea;

import android.net.Uri;
import android.view.InputEvent;
import ao2.v0;
import com.google.common.util.concurrent.c0;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final fa.b f57945a;

    public h(fa.b mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f57945a = mMeasurementManager;
    }

    @NotNull
    public c0 a(@NotNull fa.a deletionRequest) {
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new a(this, null), 3));
    }

    @NotNull
    public c0 b() {
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new b(this, null), 3));
    }

    @NotNull
    public c0 c(@NotNull Uri attributionSource, InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new c(this, attributionSource, inputEvent, null), 3));
    }

    @NotNull
    public c0 d(@NotNull fa.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new d(this, null), 3));
    }

    @NotNull
    public c0 e(@NotNull Uri trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new e(this, trigger, null), 3));
    }

    @NotNull
    public c0 f(@NotNull fa.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new f(this, null), 3));
    }

    @NotNull
    public c0 g(@NotNull fa.h request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return p2.P(j.d(dl2.b.b(v0.f20219a), null, new g(this, null), 3));
    }
}
