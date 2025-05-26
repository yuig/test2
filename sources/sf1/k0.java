package sf1;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f112637a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f112638b;

    /* renamed from: c, reason: collision with root package name */
    public final ne0.b f112639c;

    /* renamed from: d, reason: collision with root package name */
    public int f112640d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f112641e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112642f;

    /* renamed from: g, reason: collision with root package name */
    public float f112643g;

    public k0(c0 progressRunnable) {
        Intrinsics.checkNotNullParameter(progressRunnable, "progressRunnable");
        this.f112637a = progressRunnable;
        this.f112638b = new Handler(Looper.getMainLooper());
        this.f112639c = new ne0.b(this, 7);
        this.f112642f = true;
    }
}
