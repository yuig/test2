package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import com.facebook.share.model.ShareContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/internal/ShareFeedContent;", "Lcom/facebook/share/model/ShareContent;", "", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {

    @NotNull
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new a(15);

    /* renamed from: g, reason: collision with root package name */
    public final String f30093g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30094h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30095i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30096j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30097k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30098l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30099m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30093g = parcel.readString();
        this.f30094h = parcel.readString();
        this.f30095i = parcel.readString();
        this.f30096j = parcel.readString();
        this.f30097k = parcel.readString();
        this.f30098l = parcel.readString();
        this.f30099m = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        out.writeString(this.f30093g);
        out.writeString(this.f30094h);
        out.writeString(this.f30095i);
        out.writeString(this.f30096j);
        out.writeString(this.f30097k);
        out.writeString(this.f30098l);
        out.writeString(this.f30099m);
    }
}
