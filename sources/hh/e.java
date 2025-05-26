package hh;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import jh.i0;
import jh.j0;
import jh.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69108a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69109b;

    public /* synthetic */ e(g gVar) {
        this.f69109b = gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.f69108a) {
            case 0:
                g gVar = (g) this.f69109b;
                int i13 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("Received response to request: ");
                    sb3.append(i13);
                    Log.d("MessengerIpcClient", sb3.toString());
                }
                synchronized (gVar) {
                    try {
                        i iVar = (i) gVar.f69116e.get(i13);
                        if (iVar == null) {
                            StringBuilder sb4 = new StringBuilder(50);
                            sb4.append("Received response for unknown request: ");
                            sb4.append(i13);
                            Log.w("MessengerIpcClient", sb4.toString());
                        } else {
                            gVar.f69116e.remove(i13);
                            gVar.c();
                            Bundle data = message.getData();
                            if (data.getBoolean("unsupported", false)) {
                                iVar.c(new zzq("Not supported by GmsCore", null));
                            } else {
                                iVar.a(data);
                            }
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i14 = message.what;
                if (i14 == 0) {
                    synchronized (((k0) this.f69109b).f76172d) {
                        try {
                            i0 i0Var = (i0) message.obj;
                            j0 j0Var = (j0) ((k0) this.f69109b).f76172d.get(i0Var);
                            if (j0Var != null && j0Var.f76165a.isEmpty()) {
                                if (j0Var.f76167c) {
                                    j0Var.f76171g.f76174f.removeMessages(1, j0Var.f76169e);
                                    k0 k0Var = j0Var.f76171g;
                                    k0Var.f76175g.c(k0Var.f76173e, j0Var);
                                    j0Var.f76167c = false;
                                    j0Var.f76166b = 2;
                                }
                                ((k0) this.f69109b).f76172d.remove(i0Var);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i14 != 1) {
                    return false;
                }
                synchronized (((k0) this.f69109b).f76172d) {
                    try {
                        i0 i0Var2 = (i0) message.obj;
                        j0 j0Var2 = (j0) ((k0) this.f69109b).f76172d.get(i0Var2);
                        if (j0Var2 != null && j0Var2.f76166b == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(i0Var2)), new Exception());
                            ComponentName componentName2 = j0Var2.f76170f;
                            if (componentName2 == null) {
                                i0Var2.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = i0Var2.f76163b;
                                com.bumptech.glide.d.t(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            j0Var2.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }

    public /* synthetic */ e(k0 k0Var) {
        this.f69109b = k0Var;
    }
}
