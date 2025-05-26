package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/ShareContent;", "", "kp/n", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Object> {

    @NotNull
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new a(26);

    /* renamed from: g, reason: collision with root package name */
    public final List f30136g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        Iterable iterable;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            iterable = q0.f80391a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                if (parcelable instanceof ShareMedia) {
                    arrayList.add(parcelable);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof SharePhoto) {
                arrayList2.add(obj);
            }
        }
        this.f30136g = CollectionsKt.F0(arrayList2);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        Intrinsics.checkNotNullParameter(out, "out");
        List photos = this.f30136g;
        Intrinsics.checkNotNullParameter(photos, "photos");
        Object[] array = photos.toArray(new SharePhoto[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        out.writeParcelableArray((SharePhoto[]) array, i13);
    }
}
