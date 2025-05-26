package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.c;
import pf.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/GameRequestContent;", "Lcom/facebook/share/model/ShareModel;", "pf/c", "gi2/b", "pf/d", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class GameRequestContent implements ShareModel {

    @NotNull
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new a(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f30105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30106b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30107c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30108d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30109e;

    /* renamed from: f, reason: collision with root package name */
    public final c f30110f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30111g;

    /* renamed from: h, reason: collision with root package name */
    public final d f30112h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f30113i;

    public GameRequestContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f30105a = parcel.readString();
        this.f30106b = parcel.readString();
        this.f30107c = parcel.createStringArrayList();
        this.f30108d = parcel.readString();
        this.f30109e = parcel.readString();
        this.f30110f = (c) parcel.readSerializable();
        this.f30111g = parcel.readString();
        this.f30112h = (d) parcel.readSerializable();
        this.f30113i = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f30105a);
        out.writeString(this.f30106b);
        out.writeStringList(this.f30107c);
        out.writeString(this.f30108d);
        out.writeString(this.f30109e);
        out.writeSerializable(this.f30110f);
        out.writeString(this.f30111g);
        out.writeSerializable(this.f30112h);
        out.writeStringList(this.f30113i);
    }
}
