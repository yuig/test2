package jh;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class d0 extends bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f76139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f fVar, Looper looper) {
        super(looper, 1);
        this.f76139a = fVar;
    }

    public static final void a(Message message) {
        w wVar = (w) message.obj;
        wVar.getClass();
        wVar.d();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        b bVar;
        b bVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z13;
        if (this.f76139a.zzd.get() != message.arg1) {
            int i13 = message.what;
            if (i13 == 2 || i13 == 1 || i13 == 7) {
                a(message);
                return;
            }
            return;
        }
        int i14 = message.what;
        if ((i14 == 1 || i14 == 7 || ((i14 == 4 && !this.f76139a.enableLocalFallback()) || message.what == 5)) && !this.f76139a.isConnecting()) {
            a(message);
            return;
        }
        int i15 = message.what;
        if (i15 == 4) {
            this.f76139a.zzB = new ConnectionResult(message.arg2);
            if (f.zzo(this.f76139a)) {
                f fVar = this.f76139a;
                z13 = fVar.zzC;
                if (!z13) {
                    fVar.d(3, null);
                    return;
                }
            }
            f fVar2 = this.f76139a;
            connectionResult2 = fVar2.zzB;
            ConnectionResult connectionResult3 = connectionResult2 != null ? fVar2.zzB : new ConnectionResult(8);
            this.f76139a.zzc.b(connectionResult3);
            this.f76139a.onConnectionFailed(connectionResult3);
            return;
        }
        if (i15 == 5) {
            f fVar3 = this.f76139a;
            connectionResult = fVar3.zzB;
            ConnectionResult connectionResult4 = connectionResult != null ? fVar3.zzB : new ConnectionResult(8);
            this.f76139a.zzc.b(connectionResult4);
            this.f76139a.onConnectionFailed(connectionResult4);
            return;
        }
        if (i15 == 3) {
            Object obj2 = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null);
            this.f76139a.zzc.b(connectionResult5);
            this.f76139a.onConnectionFailed(connectionResult5);
            return;
        }
        if (i15 == 6) {
            this.f76139a.d(5, null);
            f fVar4 = this.f76139a;
            bVar = fVar4.zzw;
            if (bVar != null) {
                bVar2 = fVar4.zzw;
                bVar2.onConnectionSuspended(message.arg2);
            }
            this.f76139a.onConnectionSuspended(message.arg2);
            f.zzn(this.f76139a, 5, 1, null);
            return;
        }
        if (i15 == 2 && !this.f76139a.isConnected()) {
            a(message);
            return;
        }
        int i16 = message.what;
        if (i16 != 2 && i16 != 1 && i16 != 7) {
            Log.wtf("GmsClient", a.a.d("Don't know how to handle message: ", i16), new Exception());
            return;
        }
        w wVar = (w) message.obj;
        synchronized (wVar) {
            try {
                obj = wVar.f76199a;
                if (wVar.f76200b) {
                    Log.w("GmsClient", "Callback proxy " + wVar.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (obj != null) {
            wVar.a();
        }
        synchronized (wVar) {
            wVar.f76200b = true;
        }
        wVar.d();
    }
}
