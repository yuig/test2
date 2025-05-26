package androidx.compose.foundation.lazy.layout;

import a.cb;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "androidx/compose/foundation/lazy/layout/a0", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final /* data */ class DefaultLazyKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f17191a;

    public DefaultLazyKey(int i13) {
        this.f17191a = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f17191a == ((DefaultLazyKey) obj).f17191a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17191a);
    }

    public final String toString() {
        return cb.l(new StringBuilder("DefaultLazyKey(index="), this.f17191a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f17191a);
    }
}
