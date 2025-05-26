package c5;

import android.app.Notification;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25769b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25770c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f25771d;

    public a0(String str, int i13, Notification notification) {
        this.f25768a = str;
        this.f25769b = i13;
        this.f25771d = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f25768a;
        int i13 = this.f25769b;
        String str2 = this.f25770c;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.Cn);
            obtain.writeString(str);
            obtain.writeInt(i13);
            obtain.writeString(str2);
            Notification notification = this.f25771d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f24191a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotifyTask[packageName:");
        sb3.append(this.f25768a);
        sb3.append(", id:");
        sb3.append(this.f25769b);
        sb3.append(", tag:");
        return a.a.p(sb3, this.f25770c, "]");
    }
}
