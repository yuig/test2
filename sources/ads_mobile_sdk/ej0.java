package ads_mobile_sdk;

import a.g0;
import a.pd;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ej0 implements a.n6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.c0 f4867a;

    public ej0(Context context, i4 i4Var, bt2 bt2Var, com.google.common.util.concurrent.d0 d0Var) {
        if (i4Var.w()) {
            this.f4867a = bt2Var.a(xb0.EVENT_ID_INIT_GASS_TRACKER, d0Var.submit((Callable) new g0(1, this, context)));
        } else {
            this.f4867a = com.google.common.util.concurrent.y.f33586b;
        }
    }

    @Override // a.n6
    public final void a(HashMap hashMap) {
        hashMap.put("gs", this.f4867a);
    }

    @Override // a.n6
    public final void b(HashMap hashMap) {
        hashMap.put("gs", this.f4867a);
    }

    @Override // a.n6
    public final void a(HashMap hashMap, Context context, View view) {
        hashMap.put("gs", this.f4867a);
    }

    public final wb a(Context context) {
        wb wbVar;
        try {
            try {
                wbVar = (wb) new dj0(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).f4301d.poll(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                wbVar = null;
            }
            if (wbVar == null) {
                pd u13 = wb.u();
                u13.h(32768L);
                wbVar = (wb) u13.a();
            }
            return wbVar;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
