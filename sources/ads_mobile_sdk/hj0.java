package ads_mobile_sdk;

import a.o7;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import jh.f;

/* loaded from: classes2.dex */
public final class hj0 extends f {

    /* renamed from: a, reason: collision with root package name */
    public final int f5991a;

    public hj0(Context context, Looper looper, jh.b bVar, jh.c cVar, int i13) {
        super(context, looper, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, bVar, cVar);
        this.f5991a = i13;
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i13 = a.g8.f46i;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof a.z8 ? (a.z8) queryLocalInterface : new o7(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return this.f5991a;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
