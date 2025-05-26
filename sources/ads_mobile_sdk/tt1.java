package ads_mobile_sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tt1 extends s.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f11687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f11688c;

    public tt1(String str, Activity activity, Uri uri) {
        this.f11686a = str;
        this.f11687b = activity;
        this.f11688c = uri;
    }

    @Override // s.q
    public final void onCustomTabsServiceConnected(ComponentName name, s.k client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        client.e();
        com.google.android.gms.internal.measurement.q4 a13 = new s.o(client.d(null)).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        ((Intent) a13.f31594b).setPackage(this.f11686a);
        a13.u(this.f11687b, this.f11688c);
        this.f11687b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
