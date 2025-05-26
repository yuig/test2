package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import mh.a;

/* loaded from: classes3.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements a {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new lh.a(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f31009f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f31010g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f31011h = new SparseArray();

    public StringToIntConverter(int i13, ArrayList arrayList) {
        this.f31009f = i13;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            zac zacVar = (zac) arrayList.get(i14);
            String str = zacVar.f31015g;
            int i15 = zacVar.f31016h;
            this.f31010g.put(str, Integer.valueOf(i15));
            this.f31011h.put(i15, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31009f);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f31010g;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zac(str, ((Integer) hashMap.get(str)).intValue()));
        }
        c.L2(parcel, 2, arrayList, false);
        c.N2(parcel, M2);
    }
}
