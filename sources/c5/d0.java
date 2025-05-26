package c5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d0 implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25786a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f25787b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f25788c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f25789d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public HashSet f25790e = new HashSet();

    public d0(Context context) {
        this.f25786a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f25788c = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r8.f25776b != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(c5.c0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "NotifManCompat"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            android.content.ComponentName r3 = r8.f25775a
            if (r2 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Processing component "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r4 = ", "
            r2.append(r4)
            java.util.ArrayDeque r4 = r8.f25778d
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r4 = " queued tasks"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L2f:
            java.util.ArrayDeque r2 = r8.f25778d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            return
        L38:
            boolean r2 = r8.f25776b
            if (r2 == 0) goto L3d
            goto L70
        L3d:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r2.<init>(r4)
            android.content.Intent r2 = r2.setComponent(r3)
            r4 = 33
            android.content.Context r5 = r7.f25786a
            boolean r2 = r5.bindService(r2, r7, r4)
            r8.f25776b = r2
            if (r2 == 0) goto L58
            r2 = 0
            r8.f25779e = r2
            goto L6c
        L58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to bind to listener "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
            r5.unbindService(r7)
        L6c:
            boolean r2 = r8.f25776b
            if (r2 == 0) goto Ld9
        L70:
            c.c r2 = r8.f25777c
            if (r2 != 0) goto L75
            goto Ld9
        L75:
            java.util.ArrayDeque r2 = r8.f25778d
            java.lang.Object r4 = r2.peek()
            c5.a0 r4 = (c5.a0) r4
            if (r4 != 0) goto L80
            goto Lcf
        L80:
            boolean r5 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            if (r5 == 0) goto L9d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            r5.<init>()     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            java.lang.String r6 = "Sending task "
            r5.append(r6)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            r5.append(r4)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            java.lang.String r5 = r5.toString()     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            android.util.Log.d(r0, r5)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            goto L9d
        L9b:
            r1 = move-exception
            goto La6
        L9d:
            c.c r5 = r8.f25777c     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            r4.a(r5)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            r2.remove()     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
            goto L75
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "RemoteException communicating with "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r0, r3, r1)
            goto Lcf
        Lb8:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Lcf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Remote service has died: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        Lcf:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Ld8
            r7.b(r8)
        Ld8:
            return
        Ld9:
            r7.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.d0.a(c5.c0):void");
    }

    public final void b(c0 c0Var) {
        Handler handler = this.f25788c;
        ComponentName componentName = c0Var.f25775a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i13 = c0Var.f25779e;
        int i14 = i13 + 1;
        c0Var.f25779e = i14;
        if (i14 <= 6) {
            int i15 = (1 << i13) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i15 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i15);
            return;
        }
        StringBuilder sb3 = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = c0Var.f25778d;
        sb3.append(arrayDeque.size());
        sb3.append(" tasks to ");
        sb3.append(componentName);
        sb3.append(" after ");
        sb3.append(c0Var.f25779e);
        sb3.append(" retries");
        Log.w("NotifManCompat", sb3.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i13 = message.what;
        c.c cVar = null;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        return false;
                    }
                    c0 c0Var = (c0) this.f25789d.get((ComponentName) message.obj);
                    if (c0Var != null) {
                        a(c0Var);
                    }
                    return true;
                }
                c0 c0Var2 = (c0) this.f25789d.get((ComponentName) message.obj);
                if (c0Var2 != null) {
                    if (c0Var2.f25776b) {
                        this.f25786a.unbindService(this);
                        c0Var2.f25776b = false;
                    }
                    c0Var2.f25777c = null;
                }
                return true;
            }
            b0 b0Var = (b0) message.obj;
            ComponentName componentName = b0Var.f25772a;
            IBinder iBinder = b0Var.f25773b;
            c0 c0Var3 = (c0) this.f25789d.get(componentName);
            if (c0Var3 != null) {
                int i14 = c.b.f24192a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.Cn);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f24191a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                c0Var3.f25777c = cVar;
                c0Var3.f25779e = 0;
                a(c0Var3);
            }
            return true;
        }
        a0 a0Var = (a0) message.obj;
        String string = Settings.Secure.getString(this.f25786a.getContentResolver(), "enabled_notification_listeners");
        synchronized (e0.f25798c) {
            if (string != null) {
                try {
                    if (!string.equals(e0.f25799d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        e0.f25800e = hashSet2;
                        e0.f25799d = string;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            hashSet = e0.f25800e;
        }
        if (!hashSet.equals(this.f25790e)) {
            this.f25790e = hashSet;
            List<ResolveInfo> queryIntentServices = this.f25786a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f25789d.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f25789d.put(componentName3, new c0(componentName3));
                }
            }
            Iterator it2 = this.f25789d.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    c0 c0Var4 = (c0) entry.getValue();
                    if (c0Var4.f25776b) {
                        this.f25786a.unbindService(this);
                        c0Var4.f25776b = false;
                    }
                    c0Var4.f25777c = null;
                    it2.remove();
                }
            }
        }
        for (c0 c0Var5 : this.f25789d.values()) {
            c0Var5.f25778d.add(a0Var);
            a(c0Var5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f25788c.obtainMessage(1, new b0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f25788c.obtainMessage(2, componentName).sendToTarget();
    }
}
