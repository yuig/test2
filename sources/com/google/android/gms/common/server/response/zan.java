package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lh.a;

/* loaded from: classes3.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new a(9);

    /* renamed from: f, reason: collision with root package name */
    public final int f31041f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f31042g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31043h;

    public zan(int i13, String str, ArrayList arrayList) {
        this.f31041f = i13;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            zal zalVar = (zal) arrayList.get(i14);
            String str2 = zalVar.f31036g;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = zalVar.f31037h;
            d.t(arrayList2);
            int size2 = arrayList2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                zam zamVar = (zam) arrayList2.get(i15);
                hashMap2.put(zamVar.f31039g, zamVar.f31040h);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f31042g = hashMap;
        d.t(str);
        this.f31043h = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map.get((String) it2.next())).f31026o = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        HashMap hashMap = this.f31042g;
        for (String str : hashMap.keySet()) {
            sb3.append(str);
            sb3.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb3.append("  ");
                sb3.append(str2);
                sb3.append(": ");
                sb3.append(map.get(str2));
            }
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31041f);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f31042g;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zal(str, (Map) hashMap.get(str)));
        }
        c.L2(parcel, 2, arrayList, false);
        c.I2(parcel, 3, this.f31043h, false);
        c.N2(parcel, M2);
    }
}
