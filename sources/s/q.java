package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class q implements ServiceConnection {
    private Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, k kVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        b.e eVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i13 = b.d.f20706a;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.e.An);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b.e)) {
                b.c cVar = new b.c();
                cVar.f20705a = iBinder;
                eVar = cVar;
            } else {
                eVar = (b.e) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new p(eVar, componentName));
    }

    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
