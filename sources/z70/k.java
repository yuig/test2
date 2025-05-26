package z70;

import android.content.Context;
import android.content.Intent;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class k implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final lu1.d f140998a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f140999b;

    public k(lu1.d activityIntentFactory, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f140998a = activityIntentFactory;
        this.f140999b = pinalytics;
    }

    public static void a(k kVar, Context context, String str) {
        Intent b13 = kVar.f140998a.b(context, lu1.a.SEND_SHARE_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_PIN_ID", str);
        b13.setFlags(268435456);
        context.startActivity(b13);
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.BROWSER, null, null, null, null, null);
    }
}
