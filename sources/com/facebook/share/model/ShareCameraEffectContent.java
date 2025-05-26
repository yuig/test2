package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/share/model/ShareCameraEffectContent;", "Lcom/facebook/share/model/ShareContent;", "", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {

    @NotNull
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new a(20);

    /* renamed from: g, reason: collision with root package name */
    public String f30114g;

    /* renamed from: h, reason: collision with root package name */
    public CameraEffectArguments f30115h;

    /* renamed from: i, reason: collision with root package name */
    public CameraEffectTextures f30116i;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i13);
        out.writeString(this.f30114g);
        out.writeParcelable(this.f30115h, 0);
        out.writeParcelable(this.f30116i, 0);
    }
}
