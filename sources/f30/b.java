package f30;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.d;
import m60.e;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final q f60981a;

    /* renamed from: b, reason: collision with root package name */
    public final e f60982b;

    /* renamed from: c, reason: collision with root package name */
    public final String f60983c;

    /* renamed from: d, reason: collision with root package name */
    public final String f60984d;

    /* renamed from: e, reason: collision with root package name */
    public final String f60985e;

    /* renamed from: f, reason: collision with root package name */
    public final v f60986f;

    /* renamed from: g, reason: collision with root package name */
    public final v f60987g;

    public b(q prefsManagerPersisted, e applicationInfo, String baseHost) {
        String T1;
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(baseHost, "prodBaseApiHost");
        this.f60981a = prefsManagerPersisted;
        this.f60982b = applicationInfo;
        this.f60983c = baseHost;
        Intrinsics.checkNotNullParameter(baseHost, "baseHost");
        Intrinsics.checkNotNullParameter("v3", "apiVersion");
        String p13 = a.a.p(new StringBuilder("https://"), baseHost, "/v3/%s");
        String DEVICE = Build.DEVICE;
        if (DEVICE == null) {
            T1 = "null";
        } else {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            T1 = j1.T1(DEVICE);
        }
        this.f60984d = T1;
        this.f60985e = p13;
        this.f60986f = m.b(new a(this, 0));
        Context context = kb0.a.f79058b;
        if ((context instanceof Application ? (Application) context : null) != null) {
            ((d) applicationInfo).g();
        }
        this.f60987g = m.b(new a(this, 1));
    }
}
