package androidx.activity.result;

import a.d;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "g/i", "kp/n", "activity_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class IntentSenderRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new d(17);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f15933a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f15934b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15935c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15936d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i13, int i14) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f15933a = intentSender;
        this.f15934b = intent;
        this.f15935c = i13;
        this.f15936d = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f15933a, i13);
        dest.writeParcelable(this.f15934b, i13);
        dest.writeInt(this.f15935c);
        dest.writeInt(this.f15936d);
    }
}
