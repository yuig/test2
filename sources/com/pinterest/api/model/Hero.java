package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class Hero implements Parcelable {
    public static final Parcelable.Creator<Hero> CREATOR = new on();

    /* renamed from: a, reason: collision with root package name */
    @om.b("button_text")
    private String f35560a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("cover_image_url")
    private String f35561b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("title")
    private String f35562c;

    public Hero() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f35560a);
        parcel.writeString(this.f35561b);
        parcel.writeString(this.f35562c);
    }

    public Hero(Parcel parcel) {
        this.f35560a = parcel.readString();
        this.f35561b = parcel.readString();
        this.f35562c = parcel.readString();
    }
}
