package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import oi.e7;

/* loaded from: classes3.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new e7(6);
    public Integer A;
    public Integer B;
    public Integer C;
    public Boolean D;

    /* renamed from: a, reason: collision with root package name */
    public int f32202a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f32203b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f32204c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f32205d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f32206e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f32207f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f32208g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f32209h;

    /* renamed from: j, reason: collision with root package name */
    public String f32211j;

    /* renamed from: n, reason: collision with root package name */
    public Locale f32215n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f32216o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f32217p;

    /* renamed from: q, reason: collision with root package name */
    public int f32218q;

    /* renamed from: r, reason: collision with root package name */
    public int f32219r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f32220s;

    /* renamed from: u, reason: collision with root package name */
    public Integer f32222u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f32223v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f32224w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f32225x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f32226y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f32227z;

    /* renamed from: i, reason: collision with root package name */
    public int f32210i = 255;

    /* renamed from: k, reason: collision with root package name */
    public int f32212k = -2;

    /* renamed from: l, reason: collision with root package name */
    public int f32213l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f32214m = -2;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f32221t = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f32202a);
        parcel.writeSerializable(this.f32203b);
        parcel.writeSerializable(this.f32204c);
        parcel.writeSerializable(this.f32205d);
        parcel.writeSerializable(this.f32206e);
        parcel.writeSerializable(this.f32207f);
        parcel.writeSerializable(this.f32208g);
        parcel.writeSerializable(this.f32209h);
        parcel.writeInt(this.f32210i);
        parcel.writeString(this.f32211j);
        parcel.writeInt(this.f32212k);
        parcel.writeInt(this.f32213l);
        parcel.writeInt(this.f32214m);
        CharSequence charSequence = this.f32216o;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f32217p;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f32218q);
        parcel.writeSerializable(this.f32220s);
        parcel.writeSerializable(this.f32222u);
        parcel.writeSerializable(this.f32223v);
        parcel.writeSerializable(this.f32224w);
        parcel.writeSerializable(this.f32225x);
        parcel.writeSerializable(this.f32226y);
        parcel.writeSerializable(this.f32227z);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.f32221t);
        parcel.writeSerializable(this.f32215n);
        parcel.writeSerializable(this.D);
    }
}
