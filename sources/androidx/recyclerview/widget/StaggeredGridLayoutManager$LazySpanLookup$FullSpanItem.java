package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new h3();

    /* renamed from: a, reason: collision with root package name */
    public int f19299a;

    /* renamed from: b, reason: collision with root package name */
    public int f19300b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f19301c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19302d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f19299a + ", mGapDir=" + this.f19300b + ", mHasUnwantedGapAfter=" + this.f19302d + ", mGapPerSpan=" + Arrays.toString(this.f19301c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f19299a);
        parcel.writeInt(this.f19300b);
        parcel.writeInt(this.f19302d ? 1 : 0);
        int[] iArr = this.f19301c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f19301c);
        }
    }
}
