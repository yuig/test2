package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import vg.a;

/* loaded from: classes3.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new a(22);

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f30592h;

    /* renamed from: a, reason: collision with root package name */
    public final Set f30593a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30594b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30595c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30596d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f30597e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f30598f;

    /* renamed from: g, reason: collision with root package name */
    public final DeviceMetaData f30599g;

    static {
        HashMap hashMap = new HashMap();
        f30592h = hashMap;
        hashMap.put("accountType", new FastJsonResponse$Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw(HashSet hashSet, int i13, String str, int i14, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f30593a = hashSet;
        this.f30594b = i13;
        this.f30595c = str;
        this.f30596d = i14;
        this.f30597e = bArr;
        this.f30598f = pendingIntent;
        this.f30599g = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f30592h;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i13 = fastJsonResponse$Field.f31023l;
        if (i13 == 1) {
            return Integer.valueOf(this.f30594b);
        }
        if (i13 == 2) {
            return this.f30595c;
        }
        if (i13 == 3) {
            return Integer.valueOf(this.f30596d);
        }
        if (i13 == 4) {
            return this.f30597e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f31023l);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30593a.contains(Integer.valueOf(fastJsonResponse$Field.f31023l));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        Set set = this.f30593a;
        if (set.contains(1)) {
            c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30594b);
        }
        if (set.contains(2)) {
            c.I2(parcel, 2, this.f30595c, true);
        }
        if (set.contains(3)) {
            c.O2(parcel, 3, 4);
            parcel.writeInt(this.f30596d);
        }
        if (set.contains(4)) {
            c.B2(parcel, 4, this.f30597e, true);
        }
        if (set.contains(5)) {
            c.H2(parcel, 5, this.f30598f, i13, true);
        }
        if (set.contains(6)) {
            c.H2(parcel, 6, this.f30599g, i13, true);
        }
        c.N2(parcel, M2);
    }
}
