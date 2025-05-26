package com.pinterest.pushnotification;

import android.os.Build;
import gk2.f0;
import i01.r0;
import kb.z;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final uo.a f50255a;

    /* renamed from: b, reason: collision with root package name */
    public final d f50256b;

    public c(uo.a userAccountDataSource, b20.c gcmRegistrationPreferences) {
        Intrinsics.checkNotNullParameter(userAccountDataSource, "userAccountDataSource");
        Intrinsics.checkNotNullParameter(gcmRegistrationPreferences, "gcmRegistrationPreferences");
        this.f50255a = userAccountDataSource;
        this.f50256b = gcmRegistrationPreferences;
    }

    public final void a(String token, k storeRegistrationListener) {
        Intrinsics.checkNotNullParameter(token, "regId");
        Intrinsics.checkNotNullParameter(storeRegistrationListener, "storeRegistrationListener");
        if (!c60.d.b()) {
            kk2.a aVar = (kk2.a) storeRegistrationListener.f50292a;
            if (aVar.isDisposed()) {
                return;
            }
            aVar.b(z.a());
            return;
        }
        b20.c cVar = (b20.c) this.f50256b;
        String n13 = cVar.n();
        boolean z13 = !Intrinsics.d(token, n13);
        int length = n13.length();
        uo.a aVar2 = this.f50255a;
        if (length > 0 && z13) {
            aVar2.a(cVar.n()).l(tk2.e.f118017c).i(new r0(18), new yx1.l(8, a.f50249j));
        }
        boolean areNotificationsEnabled = tz1.b.c().f25804b.areNotificationsEnabled();
        int i13 = Build.VERSION.SDK_INT;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        f0 u03 = com.bumptech.glide.d.u0(aVar2.f122922a.a(new g30.g(token, String.valueOf(i13), areNotificationsEnabled)));
        a0 a0Var = tk2.e.f118017c;
        fk2.g i14 = u03.r(a0Var).l(wj2.c.a()).i();
        Intrinsics.checkNotNullExpressionValue(i14, "ignoreElement(...)");
        i14.l(a0Var).j(new b(z13, storeRegistrationListener));
    }
}
