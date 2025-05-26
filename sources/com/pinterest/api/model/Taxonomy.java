package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class Taxonomy implements dl1.s, Parcelable {
    public static final Parcelable.Creator<Taxonomy> CREATOR = new hs0();

    /* renamed from: a, reason: collision with root package name */
    @om.b("id")
    private String f35578a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("title")
    private String f35579b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color")
    private String f35580c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image")
    private String f35581d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("vanity_name")
    private String f35582e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("deep_link")
    private String f35583f;

    public Taxonomy(Parcel parcel) {
        this.f35578a = parcel.readString();
        this.f35579b = parcel.readString();
        this.f35580c = parcel.readString();
        this.f35581d = parcel.readString();
        this.f35582e = parcel.readString();
        this.f35583f = parcel.readString();
    }

    @Override // dl1.s
    public final String b() {
        return this.f35578a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f35578a);
        parcel.writeString(this.f35579b);
        parcel.writeString(this.f35580c);
        parcel.writeString(this.f35581d);
        parcel.writeString(this.f35582e);
        parcel.writeString(this.f35583f);
    }
}
