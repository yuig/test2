package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"androidx/recyclerview/widget/PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem", "Landroid/os/Parcelable;", "bk/f", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem> CREATOR = new i2.u1(4);

    /* renamed from: a, reason: collision with root package name */
    public int f19200a;

    /* renamed from: b, reason: collision with root package name */
    public int f19201b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f19202c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19203d;

    public final int a(int i13) {
        int[] iArr = this.f19202c;
        if (iArr == null) {
            return 0;
        }
        Intrinsics.f(iArr);
        return iArr[i13];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i13 = this.f19200a;
        int i14 = this.f19201b;
        boolean z13 = this.f19203d;
        String arrays = Arrays.toString(this.f19202c);
        StringBuilder t13 = a.a.t("FullSpanItem{mPosition=", i13, ", mGapDir=", i14, ", mHasUnwantedGapAfter=");
        t13.append(z13);
        t13.append(", mGapPerSpan=");
        t13.append(arrays);
        t13.append("}");
        return t13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f19200a);
        dest.writeInt(this.f19201b);
        dest.writeInt(this.f19203d ? 1 : 0);
        int[] iArr = this.f19202c;
        if (iArr != null) {
            Intrinsics.f(iArr);
            if (iArr.length > 0) {
                int[] iArr2 = this.f19202c;
                Intrinsics.f(iArr2);
                dest.writeInt(iArr2.length);
                dest.writeIntArray(this.f19202c);
                return;
            }
        }
        dest.writeInt(0);
    }
}
