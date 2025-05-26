package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Map;
import lh.a;

/* loaded from: classes3.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new a(10);

    /* renamed from: f, reason: collision with root package name */
    public final int f31035f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31036g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f31037h;

    public zal(int i13, String str, ArrayList arrayList) {
        this.f31035f = i13;
        this.f31036g = str;
        this.f31037h = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31035f);
        c.I2(parcel, 2, this.f31036g, false);
        c.L2(parcel, 3, this.f31037h, false);
        c.N2(parcel, M2);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f31035f = 1;
        this.f31036g = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse$Field) map.get(str2)));
            }
        }
        this.f31037h = arrayList;
    }
}
