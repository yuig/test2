package com.google.android.engage.social.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.engage.common.datamodel.LinkPreview;
import com.google.android.engage.social.datamodel.BasePost;
import com.google.android.gms.common.annotation.KeepName;
import java.util.List;
import pk.c1;
import pk.x0;

@KeepName
/* loaded from: classes3.dex */
public class GenericPost extends BasePost {

    @NonNull
    public static final Parcelable.Creator<GenericPost> CREATOR = new vg.a(7);

    /* renamed from: f, reason: collision with root package name */
    public final String f30304f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkPreview f30305g;

    /* renamed from: h, reason: collision with root package name */
    public final List f30306h;

    @Keep
    public static final class Builder extends BasePost.Builder<Builder> {
        private LinkPreview linkPreview;
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
        public Builder setLinkPreviewContent(@NonNull LinkPreview linkPreview) {
            this.linkPreview = linkPreview;
            return this;
        }

        @NonNull
        public Builder setTextContent(@NonNull String str) {
            this.textContent = str;
            return this;
        }

        @Override // com.google.android.engage.social.datamodel.BasePost.Builder
        @NonNull
        public GenericPost build() {
            return new GenericPost(this.timestamp, this.textContent, this.linkPreview, this.visualContentBuilder.i());
        }
    }

    public GenericPost(Long l13, String str, LinkPreview linkPreview, List list) {
        super(l13);
        this.f30304f = str;
        this.f30305g = linkPreview;
        this.f30306h = list;
        boolean z13 = true;
        if (str == null && linkPreview == null && list.isEmpty()) {
            z13 = false;
        }
        bf.b.j("Either text content or link preview content or visual content must be present.", z13);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.G2(parcel, 1, getTimestampInternal());
        c.I2(parcel, 2, this.f30304f, false);
        c.H2(parcel, 3, this.f30305g, i13, false);
        c.L2(parcel, 4, this.f30306h, false);
        c.N2(parcel, M2);
    }
}
