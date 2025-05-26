package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import wa.a;
import wa.b;

/* loaded from: classes3.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f17931a = aVar.f(iconCompat.f17931a, 1);
        byte[] bArr = iconCompat.f17933c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f128611e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f17933c = bArr;
        iconCompat.f17934d = aVar.g(iconCompat.f17934d, 3);
        iconCompat.f17935e = aVar.f(iconCompat.f17935e, 4);
        iconCompat.f17936f = aVar.f(iconCompat.f17936f, 5);
        iconCompat.f17937g = (ColorStateList) aVar.g(iconCompat.f17937g, 6);
        String str = iconCompat.f17939i;
        if (aVar.e(7)) {
            str = ((b) aVar).f128611e.readString();
        }
        iconCompat.f17939i = str;
        String str2 = iconCompat.f17940j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f128611e.readString();
        }
        iconCompat.f17940j = str2;
        iconCompat.f17938h = PorterDuff.Mode.valueOf(iconCompat.f17939i);
        switch (iconCompat.f17931a) {
            case -1:
                Parcelable parcelable = iconCompat.f17934d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f17932b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f17934d;
                if (parcelable2 != null) {
                    iconCompat.f17932b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f17933c;
                    iconCompat.f17932b = bArr3;
                    iconCompat.f17931a = 3;
                    iconCompat.f17935e = 0;
                    iconCompat.f17936f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f17933c, Charset.forName("UTF-16"));
                iconCompat.f17932b = str3;
                if (iconCompat.f17931a == 2 && iconCompat.f17940j == null) {
                    iconCompat.f17940j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f17932b = iconCompat.f17933c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f17939i = iconCompat.f17938h.name();
        switch (iconCompat.f17931a) {
            case -1:
                iconCompat.f17934d = (Parcelable) iconCompat.f17932b;
                break;
            case 1:
            case 5:
                iconCompat.f17934d = (Parcelable) iconCompat.f17932b;
                break;
            case 2:
                iconCompat.f17933c = ((String) iconCompat.f17932b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f17933c = (byte[]) iconCompat.f17932b;
                break;
            case 4:
            case 6:
                iconCompat.f17933c = iconCompat.f17932b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i13 = iconCompat.f17931a;
        if (-1 != i13) {
            aVar.j(i13, 1);
        }
        byte[] bArr = iconCompat.f17933c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f128611e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f17934d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f128611e.writeParcelable(parcelable, 0);
        }
        int i14 = iconCompat.f17935e;
        if (i14 != 0) {
            aVar.j(i14, 4);
        }
        int i15 = iconCompat.f17936f;
        if (i15 != 0) {
            aVar.j(i15, 5);
        }
        ColorStateList colorStateList = iconCompat.f17937g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f128611e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f17939i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f128611e.writeString(str);
        }
        String str2 = iconCompat.f17940j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f128611e.writeString(str2);
        }
    }
}
