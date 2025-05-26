package com.pinterest.feature.board;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nx.f1;

/* loaded from: classes5.dex */
public class BoardCreateOrPickerNavigation implements Parcelable {
    public static final Parcelable.Creator<BoardCreateOrPickerNavigation> CREATOR = new f1(22);

    /* renamed from: a, reason: collision with root package name */
    public List f45087a;

    /* renamed from: b, reason: collision with root package name */
    public List f45088b;

    /* renamed from: c, reason: collision with root package name */
    public String f45089c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f45090d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45091e;

    /* renamed from: f, reason: collision with root package name */
    public String f45092f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45093g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45094h;

    /* renamed from: i, reason: collision with root package name */
    public List f45095i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45096j;

    /* renamed from: k, reason: collision with root package name */
    public gp1.b f45097k = gp1.b.CREATE;

    public BoardCreateOrPickerNavigation(ArrayList arrayList) {
        this.f45087a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeTypedList(this.f45087a);
        parcel.writeStringList(this.f45088b);
        parcel.writeString(this.f45089c);
        parcel.writeByte(this.f45091e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f45092f);
        parcel.writeByte(this.f45093g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f45094h ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f45095i);
        parcel.writeByte(this.f45096j ? (byte) 1 : (byte) 0);
    }
}
