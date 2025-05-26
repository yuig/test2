package androidx.activity.result;

import a.d;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new d(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f15931a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f15932b;

    public ActivityResult(Intent intent, int i13) {
        this.f15931a = i13;
        this.f15932b = intent;
    }

    public final Intent a() {
        return this.f15932b;
    }

    public final int b() {
        return this.f15931a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityResult{resultCode=");
        int i13 = this.f15931a;
        sb3.append(i13 != -1 ? i13 != 0 ? String.valueOf(i13) : "RESULT_CANCELED" : "RESULT_OK");
        sb3.append(", data=");
        sb3.append(this.f15932b);
        sb3.append('}');
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f15931a);
        Intent intent = this.f15932b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i13);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f15931a = parcel.readInt();
        this.f15932b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
