package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.f;
import pf.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/ShareMedia;", "Lpf/h;", "kp/n", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, h> {

    @NotNull
    public static final Parcelable.Creator<SharePhoto> CREATOR = new a(25);

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f30132b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f30133c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30134d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30135e;

    public SharePhoto(h hVar) {
        super(hVar);
        f fVar = f.PHOTO;
        this.f30132b = hVar.f100006b;
        this.f30133c = hVar.f100007c;
        this.f30134d = hVar.f100008d;
        this.f30135e = hVar.f100009e;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        out.writeParcelable(this.f30132b, 0);
        out.writeParcelable(this.f30133c, 0);
        out.writeByte(this.f30134d ? (byte) 1 : (byte) 0);
        out.writeString(this.f30135e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        f fVar = f.PHOTO;
        this.f30132b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f30133c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f30134d = parcel.readByte() != 0;
        this.f30135e = parcel.readString();
    }
}
