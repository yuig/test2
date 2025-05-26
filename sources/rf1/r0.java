package rf1;

import android.content.Context;
import android.media.AudioManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f107892a = new t0(sf1.u0.SAVE, tf1.b.AutoAdvance, false, true, true, false);

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f107893b = new u0("", null, false, null);

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f107894c = new s0(null, false, false, new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f107895d = new v0();

    public static q0 a(Context context, Function0 presenterPinalyticsProvider, mf1.a ideaPinHostView) {
        LinkedHashMap pinFeedbackStateUpdates = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalyticsProvider, "presenterPinalyticsProvider");
        Intrinsics.checkNotNullParameter(pinFeedbackStateUpdates, "pinFeedbackStateUpdates");
        Intrinsics.checkNotNullParameter(ideaPinHostView, "ideaPinHostView");
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return new q0(presenterPinalyticsProvider, new a((AudioManager) systemService), f107892a, f107893b, a0.f107732k, a0.f107733l, pinFeedbackStateUpdates, false, false, ideaPinHostView);
    }
}
