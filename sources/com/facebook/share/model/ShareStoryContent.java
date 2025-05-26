package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/ShareStoryContent;", "Lcom/facebook/share/model/ShareContent;", "", "kp/n", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {

    @NotNull
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new a(27);

    /* renamed from: g, reason: collision with root package name */
    public final ShareMedia f30137g;

    /* renamed from: h, reason: collision with root package name */
    public final SharePhoto f30138h;

    /* renamed from: i, reason: collision with root package name */
    public final List f30139i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30140j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30137g = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f30138h = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f30139i = arrayList.isEmpty() ? null : CollectionsKt.F0(arrayList);
        this.f30140j = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        out.writeParcelable(this.f30137g, 0);
        out.writeParcelable(this.f30138h, 0);
        List list = this.f30139i;
        out.writeStringList(list == null ? null : CollectionsKt.F0(list));
        out.writeString(this.f30140j);
    }
}
