package hf2;

import android.os.Parcel;
import android.os.Parcelable;
import info.mqtt.android.service.ParcelableMqttMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ParcelableMqttMessage parcelableMqttMessage = new ParcelableMqttMessage(parcel.createByteArray());
        int readInt = parcel.readInt();
        if (readInt < 0 || readInt > 2) {
            throw new IllegalArgumentException();
        }
        parcelableMqttMessage.f87942b = readInt;
        boolean[] createBooleanArray = parcel.createBooleanArray();
        Intrinsics.f(createBooleanArray);
        parcelableMqttMessage.f87943c = createBooleanArray[0];
        parcelableMqttMessage.f87944d = createBooleanArray[1];
        parcelableMqttMessage.f72901e = parcel.readString();
        return parcelableMqttMessage;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ParcelableMqttMessage[i13];
    }
}
