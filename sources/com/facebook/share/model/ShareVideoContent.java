package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.h;
import pf.i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/ShareVideoContent;", "Lcom/facebook/share/model/ShareContent;", "", "Lcom/facebook/share/model/ShareModel;", "kp/n", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> implements ShareModel {

    @NotNull
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new a(29);

    /* renamed from: g, reason: collision with root package name */
    public final String f30142g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30143h;

    /* renamed from: i, reason: collision with root package name */
    public final SharePhoto f30144i;

    /* renamed from: j, reason: collision with root package name */
    public final ShareVideo f30145j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30142g = parcel.readString();
        this.f30143h = parcel.readString();
        h hVar = new h();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        SharePhoto sharePhoto = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        if (sharePhoto != null) {
            Bundle parameters = sharePhoto.f30125a;
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            hVar.f100004a.putAll(parameters);
            hVar.f100006b = sharePhoto.f30132b;
            hVar.f100007c = sharePhoto.f30133c;
            hVar.f100008d = sharePhoto.f30134d;
            hVar.f100009e = sharePhoto.f30135e;
        }
        this.f30144i = (hVar.f100007c == null && hVar.f100006b == null) ? null : new SharePhoto(hVar);
        i iVar = new i();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            iVar.f100010b = shareVideo.f30141b;
        }
        this.f30145j = new ShareVideo(iVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        out.writeString(this.f30142g);
        out.writeString(this.f30143h);
        out.writeParcelable(this.f30144i, 0);
        out.writeParcelable(this.f30145j, 0);
    }
}
