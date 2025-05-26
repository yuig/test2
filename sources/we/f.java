package we;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import df.q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import le.v;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f129239a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f129240b;

    static {
        Intrinsics.checkNotNullExpressionValue(f.class.getSimpleName(), "RemoteServiceWrapper::class.java.simpleName");
    }

    public final Intent a(Context context) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && q.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (q.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final e b(c cVar, String str, List list) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            e eVar = e.SERVICE_NOT_AVAILABLE;
            Context a13 = v.a();
            Intent a14 = a(a13);
            if (a14 == null) {
                return eVar;
            }
            d dVar = new d();
            try {
                if (!a13.bindService(a14, dVar, 1)) {
                    return e.SERVICE_ERROR;
                }
                try {
                    try {
                        dVar.f129237a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = dVar.f129238b;
                        if (iBinder != null) {
                            nf.c j13 = nf.b.j(iBinder);
                            Bundle a15 = b.a(cVar, str, list);
                            if (a15 != null) {
                                nf.a aVar = (nf.a) j13;
                                Parcel obtain = Parcel.obtain();
                                Parcel obtain2 = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                                    obtain.writeInt(1);
                                    a15.writeToParcel(obtain, 0);
                                    aVar.f90481a.transact(1, obtain, obtain2, 0);
                                    obtain2.readException();
                                    obtain2.readInt();
                                    obtain2.recycle();
                                    obtain.recycle();
                                    Intrinsics.n(a15, "Successfully sent events to the remote service: ");
                                } catch (Throwable th3) {
                                    obtain2.recycle();
                                    obtain.recycle();
                                    throw th3;
                                }
                            }
                            eVar = e.OPERATION_SUCCESS;
                        }
                    } catch (RemoteException unused) {
                        eVar = e.SERVICE_ERROR;
                        v vVar = v.f83104a;
                    }
                } catch (InterruptedException unused2) {
                    eVar = e.SERVICE_ERROR;
                    v vVar2 = v.f83104a;
                }
                a13.unbindService(dVar);
                return eVar;
            } catch (Throwable th4) {
                a13.unbindService(dVar);
                v vVar3 = v.f83104a;
                throw th4;
            }
        } catch (Throwable th5) {
            p001if.a.a(this, th5);
            return null;
        }
    }
}
