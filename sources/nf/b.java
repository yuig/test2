package nf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class b extends Binder implements c {
    public static c j(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        a aVar = new a();
        aVar.f90481a = iBinder;
        return aVar;
    }
}
