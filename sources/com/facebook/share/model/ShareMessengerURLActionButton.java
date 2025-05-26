package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/ShareMessengerURLActionButton;", "Lcom/facebook/share/model/ShareMessengerActionButton;", "gi2/b", "pf/g", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {

    @NotNull
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new a(24);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f30128b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f30129c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30130d;

    /* renamed from: e, reason: collision with root package name */
    public final g f30131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30128b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f30130d = parcel.readByte() != 0;
        this.f30129c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f30131e = (g) parcel.readSerializable();
        parcel.readByte();
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i13);
        dest.writeParcelable(this.f30128b, 0);
        byte b13 = this.f30130d ? (byte) 1 : (byte) 0;
        dest.writeByte(b13);
        dest.writeParcelable(this.f30129c, 0);
        dest.writeSerializable(this.f30131e);
        dest.writeByte(b13);
    }
}
