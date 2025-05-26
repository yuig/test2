package info.mqtt.android.service;

import android.os.Parcel;
import android.os.Parcelable;
import hf2.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mp2.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Linfo/mqtt/android/service/ParcelableMqttMessage;", "Lmp2/i;", "Landroid/os/Parcelable;", "CREATOR", "hf2/o", "serviceLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ParcelableMqttMessage extends i implements Parcelable {

    @NotNull
    public static final o CREATOR = new o();

    /* renamed from: e, reason: collision with root package name */
    public String f72901e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByteArray(this.f87941a);
        parcel.writeInt(this.f87942b);
        parcel.writeBooleanArray(new boolean[]{this.f87943c, this.f87944d});
        parcel.writeString(this.f72901e);
    }
}
