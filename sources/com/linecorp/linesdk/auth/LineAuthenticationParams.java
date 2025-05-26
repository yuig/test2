package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import m.h;
import oi.e7;
import rn.j;
import un.b;

/* loaded from: classes3.dex */
public class LineAuthenticationParams implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationParams> CREATOR = new e7(18);

    /* renamed from: a, reason: collision with root package name */
    public final List f34071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34072b;

    /* renamed from: c, reason: collision with root package name */
    public final b f34073c;

    /* renamed from: d, reason: collision with root package name */
    public final Locale f34074d;

    public LineAuthenticationParams(h hVar) {
        this.f34071a = (List) hVar.f85197b;
        this.f34072b = (String) hVar.f85198c;
        this.f34073c = (b) hVar.f85199d;
        this.f34074d = (Locale) hVar.f85200e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(j.a(this.f34071a));
        parcel.writeString(this.f34072b);
        b bVar = this.f34073c;
        parcel.writeString(bVar != null ? bVar.name() : null);
        parcel.writeSerializable(this.f34074d);
    }

    public LineAuthenticationParams(Parcel parcel) {
        this.f34071a = j.b(parcel.createStringArrayList());
        this.f34072b = parcel.readString();
        String readString = parcel.readString();
        this.f34073c = (b) (readString != null ? Enum.valueOf(b.class, readString) : null);
        this.f34074d = (Locale) parcel.readSerializable();
    }
}
