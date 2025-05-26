package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.f;
import pf.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/ShareVideo;", "Lcom/facebook/share/model/ShareMedia;", "Lpf/i;", "kp/n", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, i> {

    @NotNull
    public static final Parcelable.Creator<ShareVideo> CREATOR = new a(28);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f30141b;

    public ShareVideo(i iVar) {
        super(iVar);
        f fVar = f.PHOTO;
        this.f30141b = iVar.f100010b;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        out.writeParcelable(this.f30141b, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        f fVar = f.PHOTO;
        this.f30141b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
