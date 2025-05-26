package is1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.q f73642a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f73643b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.e f73644c;

    /* renamed from: d, reason: collision with root package name */
    public final es.h f73645d;

    /* renamed from: e, reason: collision with root package name */
    public final es.a f73646e;

    public t(lb0.q prefsManagerPersisted, b60.b activeUserManager, m60.e applicationInfoProvider, es.h adsCommonDisplayImpl, es.a adFormats) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(adsCommonDisplayImpl, "adsCommonDisplayImpl");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f73642a = prefsManagerPersisted;
        this.f73643b = activeUserManager;
        this.f73644c = applicationInfoProvider;
        this.f73645d = adsCommonDisplayImpl;
        this.f73646e = adFormats;
    }

    public final boolean a(f30 pin) {
        wy0 f13;
        g.b m13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        b60.d dVar = (b60.d) this.f73643b;
        wy0 f14 = dVar.f();
        boolean z13 = (f14 != null && dl2.b.O1(f14, false)) || ((f13 = dVar.f()) != null && dl2.b.R1(f13));
        this.f73642a.e("PREF_ENABLE_PIN_SWIPE");
        m13 = ((es.v) this.f73645d).m(pin, false);
        boolean z14 = m13 != null;
        ((m60.d) this.f73644c).g();
        return z13 || z14 || ((es.c) this.f73646e).U(pin);
    }
}
