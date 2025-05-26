package com.google.android.engage.social.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.engage.social.datamodel.BasePost;
import com.google.android.gms.common.annotation.KeepName;
import java.util.List;
import pk.c1;
import pk.x0;

@KeepName
/* loaded from: classes3.dex */
public class PortraitMediaPost extends BasePost {

    @NonNull
    public static final Parcelable.Creator<PortraitMediaPost> CREATOR = new vg.a(10);

    /* renamed from: f, reason: collision with root package name */
    public final String f30310f;

    /* renamed from: g, reason: collision with root package name */
    public final List f30311g;

    @Keep
    public static final class Builder extends BasePost.Builder<Builder> {
        private String textContent;
        private final x0 visualContentBuilder = c1.n();

        @NonNull
        public Builder addVisualContent(@NonNull Image image) {
            this.visualContentBuilder.e(image);
            return this;
        }

        @NonNull
        public Builder addVisualContents(@NonNull List<Image> list) {
            this.visualContentBuilder.b(list);
            return this;
        }

        @NonNull
        public Builder setTextContent(@NonNull String str) {
            this.textContent = str;
            return this;
        }

        @Override // com.google.android.engage.social.datamodel.BasePost.Builder
        @NonNull
        public PortraitMediaPost build() {
            return new PortraitMediaPost(this.textContent, this.timestamp, this.visualContentBuilder.i());
        }
    }

    public PortraitMediaPost(String str, Long l13, List list) {
        super(l13);
        this.f30310f = str;
        this.f30311g = list;
        bf.b.j("Visual content must be present.", !list.isEmpty());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.G2(parcel, 1, getTimestampInternal());
        c.I2(parcel, 2, this.f30310f, false);
        c.L2(parcel, 3, this.f30311g, false);
        c.N2(parcel, M2);
    }
}
