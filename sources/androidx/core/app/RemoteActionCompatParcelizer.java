package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import wa.a;
import wa.b;
import wa.c;

/* loaded from: classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f17917a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f17917a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f17918b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f128611e);
        }
        remoteActionCompat.f17918b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f17919c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f128611e);
        }
        remoteActionCompat.f17919c = charSequence2;
        remoteActionCompat.f17920d = (PendingIntent) aVar.g(remoteActionCompat.f17920d, 4);
        boolean z13 = remoteActionCompat.f17921e;
        if (aVar.e(5)) {
            z13 = ((b) aVar).f128611e.readInt() != 0;
        }
        remoteActionCompat.f17921e = z13;
        boolean z14 = remoteActionCompat.f17922f;
        if (aVar.e(6)) {
            z14 = ((b) aVar).f128611e.readInt() != 0;
        }
        remoteActionCompat.f17922f = z14;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f17917a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f17918b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f128611e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f17919c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f17920d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z13 = remoteActionCompat.f17921e;
        aVar.i(5);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = remoteActionCompat.f17922f;
        aVar.i(6);
        parcel.writeInt(z14 ? 1 : 0);
    }
}
