package i2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class v1 implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        j3 j3Var;
        if (classLoader == null) {
            classLoader = v1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            j3Var = r1.f71258a;
        } else if (readInt == 1) {
            j3Var = y3.f71400a;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(a.a.e("Unsupported MutableState policy ", readInt, " was restored"));
            }
            j3Var = p2.f71234a;
        }
        return new ParcelableSnapshotMutableState(readValue, j3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ParcelableSnapshotMutableState[i13];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
