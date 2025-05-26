package mh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int r03 = bf.b.r0(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        boolean z14 = false;
        int i16 = 0;
        while (parcel.dataPosition() < r03) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i13 = bf.b.h0(parcel, readInt);
                    break;
                case 2:
                    i14 = bf.b.h0(parcel, readInt);
                    break;
                case 3:
                    z13 = bf.b.a0(parcel, readInt);
                    break;
                case 4:
                    i15 = bf.b.h0(parcel, readInt);
                    break;
                case 5:
                    z14 = bf.b.a0(parcel, readInt);
                    break;
                case 6:
                    str = bf.b.F(parcel, readInt);
                    break;
                case 7:
                    i16 = bf.b.h0(parcel, readInt);
                    break;
                case '\b':
                    str2 = bf.b.F(parcel, readInt);
                    break;
                case '\t':
                    zaaVar = (zaa) bf.b.E(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    bf.b.p0(parcel, readInt);
                    break;
            }
        }
        bf.b.L(parcel, r03);
        return new FastJsonResponse$Field(i13, i14, z13, i15, z14, str, i16, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new FastJsonResponse$Field[i13];
    }
}
