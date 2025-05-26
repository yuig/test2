package gz1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import ih.c;
import java.io.IOException;
import m60.d;
import m60.e;
import m60.f0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f66365a;

    /* renamed from: b, reason: collision with root package name */
    public AdvertisingIdClient.Info f66366b = null;

    public b(e eVar) {
        this.f66365a = eVar;
    }

    public final AdvertisingIdClient.Info a() {
        AdvertisingIdClient.Info info2;
        try {
            info2 = this.f66366b;
        } catch (Exception unused) {
        }
        if (info2 != null) {
            return info2;
        }
        new a(this).b();
        return null;
    }

    public final AdvertisingIdClient.Info b(Context context) {
        if (!c(null, false, 0)) {
            return null;
        }
        try {
            this.f66366b = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException e13) {
            Log.getStackTraceString(e13);
        }
        return this.f66366b;
    }

    public final boolean c(Activity activity, boolean z13, int i13) {
        int i14;
        AlertDialog e13;
        ((d) this.f66365a).f85896f.getClass();
        try {
            if (i13 != 0) {
                c cVar = c.f72257d;
                Context context = kb0.a.f79058b;
                i14 = cVar.c(f0.X(), i13);
            } else {
                c cVar2 = c.f72257d;
                Context context2 = kb0.a.f79058b;
                i14 = cVar2.c(f0.X(), ih.d.f72258a);
            }
        } catch (IllegalStateException | NullPointerException unused) {
            i14 = -1;
        }
        if (i14 == -2 || i14 == -1) {
            return false;
        }
        if (i14 == 0) {
            return true;
        }
        if (i14 == 1 || i14 == 9) {
            return false;
        }
        c cVar3 = c.f72257d;
        boolean h10 = cVar3.h(i14);
        if (activity != null && h10 && z13 && (e13 = cVar3.e(activity, i14)) != null) {
            e13.setCanceledOnTouchOutside(true);
            e13.show();
        }
        return z13 && h10;
    }
}
