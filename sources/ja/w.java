package ja;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w extends Binder implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f75281b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f75282a;

    public w(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f75282a = multiInstanceInvalidationService;
        attachInterface(this, m.Co);
    }

    public final int B(k callback, String str) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i13 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f75282a;
        synchronized (multiInstanceInvalidationService.f19758c) {
            try {
                int i14 = multiInstanceInvalidationService.f19756a + 1;
                multiInstanceInvalidationService.f19756a = i14;
                if (multiInstanceInvalidationService.f19758c.register(callback, Integer.valueOf(i14))) {
                    multiInstanceInvalidationService.f19757b.put(Integer.valueOf(i14), str);
                    i13 = i14;
                } else {
                    multiInstanceInvalidationService.f19756a--;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i13;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        String str = m.Co;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        k kVar = null;
        k callback = null;
        if (i13 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(k.Bo);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                    j jVar = new j();
                    jVar.f75245a = readStrongBinder;
                    kVar = jVar;
                } else {
                    kVar = (k) queryLocalInterface;
                }
            }
            int B = B(kVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(B);
        } else if (i13 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(k.Bo);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof k)) {
                    j jVar2 = new j();
                    jVar2.f75245a = readStrongBinder2;
                    callback = jVar2;
                } else {
                    callback = (k) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            Intrinsics.checkNotNullParameter(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f75282a;
            synchronized (multiInstanceInvalidationService.f19758c) {
                multiInstanceInvalidationService.f19758c.unregister(callback);
            }
            parcel2.writeNoException();
        } else {
            if (i13 != 3) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            x(parcel.createStringArray(), parcel.readInt());
        }
        return true;
    }

    @Override // ja.m
    public final void x(String[] tables, int i13) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f75282a;
        synchronized (multiInstanceInvalidationService.f19758c) {
            String str = (String) multiInstanceInvalidationService.f19757b.get(Integer.valueOf(i13));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f19758c.beginBroadcast();
            for (int i14 = 0; i14 < beginBroadcast; i14++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f19758c.getBroadcastCookie(i14);
                    Intrinsics.g(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f19757b.get(num);
                    if (i13 != intValue && Intrinsics.d(str, str2)) {
                        try {
                            ((k) multiInstanceInvalidationService.f19758c.getBroadcastItem(i14)).e(tables);
                        } catch (RemoteException e13) {
                            Log.w("ROOM", "Error invoking a remote callback", e13);
                        }
                    }
                } catch (Throwable th3) {
                    multiInstanceInvalidationService.f19758c.finishBroadcast();
                    throw th3;
                }
            }
            multiInstanceInvalidationService.f19758c.finishBroadcast();
            Unit unit = Unit.f80348a;
        }
    }
}
