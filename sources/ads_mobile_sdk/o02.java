package ads_mobile_sdk;

import a.i2;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o02 extends jd2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jy1 f9088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q02 f9090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o02(q02 q02Var, TaskCompletionSource taskCompletionSource, jy1 jy1Var, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f9090d = q02Var;
        this.f9088b = jy1Var;
        this.f9089c = taskCompletionSource2;
    }

    @Override // ads_mobile_sdk.jd2
    public final void a() {
        try {
            q02 q02Var = this.f9090d;
            a.ra raVar = (a.ra) q02Var.f9893a.f6798n;
            String str = q02Var.f9894b;
            ArrayList a13 = q02.a(this.f9088b);
            Bundle bundle = new Bundle();
            p02 p02Var = new p02(this.f9090d);
            a.q9 q9Var = (a.q9) raVar;
            q9Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(q9Var.f4297b);
            obtain.writeString(str);
            obtain.writeTypedList(a13);
            int i13 = i2.f57a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(p02Var.asBinder());
            try {
                q9Var.f4296a.transact(1, obtain, null, 1);
                obtain.recycle();
            } catch (Throwable th3) {
                obtain.recycle();
                throw th3;
            }
        } catch (RemoteException e13) {
            u71 u71Var = q02.f9891c;
            Object[] objArr = {this.f9090d.f9894b};
            u71Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", u71.a(u71Var.f11872a, "prewarm(%s)", objArr), e13);
            }
            this.f9089c.trySetException(new RuntimeException(e13));
        }
    }
}
