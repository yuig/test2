package android.support.v4.media;

import a.d;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new d(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f15825a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f15826b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f15827c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f15828d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f15829e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f15830f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f15831g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f15832h;

    /* renamed from: i, reason: collision with root package name */
    public Object f15833i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f15825a = str;
        this.f15826b = charSequence;
        this.f15827c = charSequence2;
        this.f15828d = charSequence3;
        this.f15829e = bitmap;
        this.f15830f = uri;
        this.f15831g = bundle;
        this.f15832h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f15826b) + ", " + ((Object) this.f15827c) + ", " + ((Object) this.f15828d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Object obj = this.f15833i;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f15825a);
            builder.setTitle(this.f15826b);
            builder.setSubtitle(this.f15827c);
            builder.setDescription(this.f15828d);
            builder.setIconBitmap(this.f15829e);
            builder.setIconUri(this.f15830f);
            builder.setExtras(this.f15831g);
            builder.setMediaUri(this.f15832h);
            obj = builder.build();
            this.f15833i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i13);
    }
}
