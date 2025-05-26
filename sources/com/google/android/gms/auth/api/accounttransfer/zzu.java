package com.google.android.gms.auth.api.accounttransfer;

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
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new a(21);

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f30585g;

    /* renamed from: a, reason: collision with root package name */
    public final Set f30586a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30587b;

    /* renamed from: c, reason: collision with root package name */
    public final zzw f30588c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30589d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30590e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30591f;

    static {
        HashMap hashMap = new HashMap();
        f30585g = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", new FastJsonResponse$Field(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new FastJsonResponse$Field(7, false, 7, false, "package", 4, null));
    }

    public zzu(HashSet hashSet, int i13, zzw zzwVar, String str, String str2, String str3) {
        this.f30586a = hashSet;
        this.f30587b = i13;
        this.f30588c = zzwVar;
        this.f30589d = str;
        this.f30590e = str2;
        this.f30591f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f30585g;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i13 = fastJsonResponse$Field.f31023l;
        if (i13 == 1) {
            return Integer.valueOf(this.f30587b);
        }
        if (i13 == 2) {
            return this.f30588c;
        }
        if (i13 == 3) {
            return this.f30589d;
        }
        if (i13 == 4) {
            return this.f30590e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f31023l);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30586a.contains(Integer.valueOf(fastJsonResponse$Field.f31023l));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        Set set = this.f30586a;
        if (set.contains(1)) {
            c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30587b);
        }
        if (set.contains(2)) {
            c.H2(parcel, 2, this.f30588c, i13, true);
        }
        if (set.contains(3)) {
            c.I2(parcel, 3, this.f30589d, true);
        }
        if (set.contains(4)) {
            c.I2(parcel, 4, this.f30590e, true);
        }
        if (set.contains(5)) {
            c.I2(parcel, 5, this.f30591f, true);
        }
        c.N2(parcel, M2);
    }
}
