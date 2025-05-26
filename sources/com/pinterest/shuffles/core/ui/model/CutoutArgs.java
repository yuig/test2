package com.pinterest.shuffles.core.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/shuffles/core/ui/model/CutoutArgs;", "Landroid/os/Parcelable;", "RawImage", "SearchedPin", "Lcom/pinterest/shuffles/core/ui/model/CutoutArgs$RawImage;", "Lcom/pinterest/shuffles/core/ui/model/CutoutArgs$SearchedPin;", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class CutoutArgs implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/shuffles/core/ui/model/CutoutArgs$RawImage;", "Lcom/pinterest/shuffles/core/ui/model/CutoutArgs;", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class RawImage extends CutoutArgs {

        @NotNull
        public static final Parcelable.Creator<RawImage> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f51927a;

        public RawImage(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.f51927a = imageUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RawImage) && Intrinsics.d(this.f51927a, ((RawImage) obj).f51927a);
        }

        public final int hashCode() {
            return this.f51927a.hashCode();
        }

        public final String toString() {
            return a.a.p(new StringBuilder("RawImage(imageUrl="), this.f51927a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i13) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f51927a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/shuffles/core/ui/model/CutoutArgs$SearchedPin;", "Lcom/pinterest/shuffles/core/ui/model/CutoutArgs;", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class SearchedPin extends CutoutArgs {

        @NotNull
        public static final Parcelable.Creator<SearchedPin> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final String f51928a;

        /* renamed from: b, reason: collision with root package name */
        public final String f51929b;

        public SearchedPin(String imageUrl, String pinId) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            this.f51928a = imageUrl;
            this.f51929b = pinId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchedPin)) {
                return false;
            }
            SearchedPin searchedPin = (SearchedPin) obj;
            return Intrinsics.d(this.f51928a, searchedPin.f51928a) && Intrinsics.d(this.f51929b, searchedPin.f51929b);
        }

        public final int hashCode() {
            return this.f51929b.hashCode() + (this.f51928a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SearchedPin(imageUrl=");
            sb3.append(this.f51928a);
            sb3.append(", pinId=");
            return a.a.p(sb3, this.f51929b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i13) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f51928a);
            out.writeString(this.f51929b);
        }
    }
}
