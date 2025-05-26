package zh2;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import lh2.b;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f141975a;

    /* renamed from: b, reason: collision with root package name */
    public final b f141976b;

    /* renamed from: c, reason: collision with root package name */
    public final long f141977c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f141978d;

    public a(ki2.a worker, b logger) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f141975a = worker;
        this.f141976b = logger;
        this.f141977c = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
    }
}
