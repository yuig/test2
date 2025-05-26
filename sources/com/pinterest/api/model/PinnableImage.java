package com.pinterest.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;

/* loaded from: classes3.dex */
public class PinnableImage extends wx implements Parcelable {
    public static final Parcelable.Creator<PinnableImage> CREATOR = new c60();

    /* renamed from: a, reason: collision with root package name */
    public String f35564a;

    /* renamed from: b, reason: collision with root package name */
    public int f35565b;

    /* renamed from: c, reason: collision with root package name */
    public int f35566c;

    /* renamed from: d, reason: collision with root package name */
    public String f35567d;

    /* renamed from: e, reason: collision with root package name */
    public String f35568e;

    /* renamed from: f, reason: collision with root package name */
    public String f35569f;

    /* renamed from: g, reason: collision with root package name */
    public String f35570g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f35571h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f35572i;

    /* renamed from: j, reason: collision with root package name */
    public String f35573j;

    /* renamed from: k, reason: collision with root package name */
    public String f35574k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35575l;

    /* renamed from: m, reason: collision with root package name */
    public String f35576m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35577n;

    public PinnableImage() {
        this.f35564a = null;
        this.f35565b = 0;
        this.f35566c = 0;
        this.f35567d = null;
        this.f35568e = null;
        this.f35569f = null;
        this.f35570g = null;
        this.f35574k = null;
        this.f35576m = null;
    }

    public static PinnableImage l(vd0.c cVar, String str) {
        try {
            PinnableImage pinnableImage = new PinnableImage();
            pinnableImage.f35564a = str;
            String d2 = cVar.d("src");
            if (d2 != null) {
                pinnableImage.f35569f = d2;
            } else {
                pinnableImage.f35569f = cVar.d("media");
            }
            pinnableImage.f35565b = cVar.j(0, "width");
            pinnableImage.f35566c = cVar.j(0, "height");
            pinnableImage.f35567d = cVar.d("title");
            pinnableImage.f35568e = cVar.d("description");
            pinnableImage.f35570g = cVar.d("url");
            pinnableImage.f35574k = cVar.d("color");
            return pinnableImage;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void B(String str) {
        this.f35564a = str;
    }

    public final String a() {
        return this.f35568e;
    }

    @Override // dl1.s
    public final String b() {
        return this.f35564a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Uri e() {
        return this.f35571h;
    }

    public final String g() {
        return this.f35569f;
    }

    public final CharSequence h() {
        return this.f35572i;
    }

    public final String j() {
        return this.f35573j;
    }

    public final boolean k() {
        return this.f35575l;
    }

    public final void n(String str) {
        this.f35568e = str;
    }

    public final void q(Uri uri) {
        this.f35571h = uri;
    }

    public final void s(String str) {
        this.f35569f = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinnableImage{imageUrl='");
        sb3.append(this.f35569f);
        sb3.append("', width=");
        sb3.append(this.f35565b);
        sb3.append(", height=");
        sb3.append(this.f35566c);
        sb3.append(", title=");
        sb3.append(this.f35567d);
        sb3.append(", description=");
        sb3.append(this.f35568e);
        sb3.append(", background color=");
        return ep.b.k(sb3, this.f35574k, '}');
    }

    public final void u() {
        this.f35577n = true;
    }

    public final void v(Spanned spanned) {
        this.f35572i = spanned;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f35564a);
        parcel.writeInt(this.f35565b);
        parcel.writeInt(this.f35566c);
        parcel.writeString(this.f35567d);
        parcel.writeString(this.f35568e);
        parcel.writeString(this.f35569f);
        parcel.writeString(this.f35570g);
        parcel.writeString(this.f35574k);
        parcel.writeParcelable(this.f35571h, i13);
        parcel.writeString(this.f35576m);
    }

    public final void x(String str) {
        this.f35573j = str;
    }

    public final void y(String str) {
        this.f35570g = str;
    }

    public PinnableImage(Parcel parcel) {
        this.f35564a = parcel.readString();
        this.f35565b = parcel.readInt();
        this.f35566c = parcel.readInt();
        this.f35567d = parcel.readString();
        this.f35568e = parcel.readString();
        this.f35569f = parcel.readString();
        this.f35570g = parcel.readString();
        this.f35574k = parcel.readString();
        this.f35571h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f35576m = parcel.readString();
    }
}
