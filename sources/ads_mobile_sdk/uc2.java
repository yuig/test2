package ads_mobile_sdk;

import a.zb;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uc2 implements SignalCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final long f12020a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f12021b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.m f12022c;

    /* renamed from: d, reason: collision with root package name */
    public final ac2 f12023d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f12024e;

    public uc2(String adapterName, ic2 adapterProxy, long j13, zb clock, ao2.o continuation) {
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(adapterProxy, "adapterProxy");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f12020a = j13;
        this.f12021b = clock;
        this.f12022c = continuation;
        this.f12023d = new ac2(adapterName, adapterProxy.b().toString(), adapterProxy.a().toString(), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
        this.f12024e = new AtomicBoolean(false);
    }
}
