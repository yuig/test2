package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import ao2.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e00 extends s.q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4532a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f4533b;

    /* renamed from: c, reason: collision with root package name */
    public final sb2 f4534c;

    /* renamed from: d, reason: collision with root package name */
    public s.r f4535d;

    /* renamed from: e, reason: collision with root package name */
    public s.k f4536e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4537f;

    public e00(Context applicationContext, j0 backgroundScope, sb2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f4532a = applicationContext;
        this.f4533b = backgroundScope;
        this.f4534c = rootTraceCreator;
        this.f4537f = new AtomicBoolean(false);
    }

    @Override // s.q
    public final void onCustomTabsServiceConnected(ComponentName name, s.k client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f4536e = client;
        client.e();
        this.f4535d = client.d(new d00(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4535d = null;
        this.f4536e = null;
    }
}
