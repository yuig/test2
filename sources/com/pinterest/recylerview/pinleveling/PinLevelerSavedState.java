package com.pinterest.recylerview.pinleveling;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/recylerview/pinleveling/PinLevelerSavedState;", "Landroid/os/Parcelable;", "CREATOR", "com/pinterest/recylerview/pinleveling/a", "UidsToSizeParcelable", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PinLevelerSavedState implements Parcelable {

    @NotNull
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f50376a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f50377b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f50378c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f50379d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/recylerview/pinleveling/PinLevelerSavedState$UidsToSizeParcelable;", "Landroid/os/Parcelable;", "CREATOR", "com/pinterest/recylerview/pinleveling/b", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
    @SuppressLint({"BanParcelableUsage"})
    public static final class UidsToSizeParcelable implements Parcelable {

        @NotNull
        public static final b CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public HashMap f50380a;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HashMap hashMap = this.f50380a;
            if (hashMap == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec itemSizeSpec = (PinterestStaggeredGridLayoutManagerImpl.ItemSizeSpec) entry.getValue();
                parcel.writeString(str);
                parcel.writeParcelable(itemSizeSpec, i13);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSparseArray(this.f50376a);
        HashMap hashMap = this.f50377b;
        if (hashMap == null || hashMap.isEmpty()) {
            dest.writeInt(0);
        } else {
            dest.writeInt(hashMap.size());
            UidsToSizeParcelable uidsToSizeParcelable = new UidsToSizeParcelable();
            uidsToSizeParcelable.f50380a = hashMap;
            dest.writeParcelable(uidsToSizeParcelable, 1);
        }
        dest.writeMap(this.f50378c);
        HashSet hashSet = this.f50379d;
        if (hashSet == null || hashSet.isEmpty()) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(hashSet.size());
        HashSet hashSet2 = this.f50379d;
        dest.writeIntArray(hashSet2 != null ? CollectionsKt.E0(hashSet2) : null);
    }
}
