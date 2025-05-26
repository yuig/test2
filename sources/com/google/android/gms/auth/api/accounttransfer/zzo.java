package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import vg.a;

/* loaded from: classes3.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new a(19);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f30572f;

    /* renamed from: a, reason: collision with root package name */
    public final Set f30573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30574b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30575c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30576d;

    /* renamed from: e, reason: collision with root package name */
    public final zzs f30577e;

    static {
        HashMap hashMap = new HashMap();
        f30572f = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        hashMap.put("progress", new FastJsonResponse$Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo(HashSet hashSet, int i13, ArrayList arrayList, int i14, zzs zzsVar) {
        this.f30573a = hashSet;
        this.f30574b = i13;
        this.f30575c = arrayList;
        this.f30576d = i14;
        this.f30577e = zzsVar;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f30572f;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i13 = fastJsonResponse$Field.f31023l;
        if (i13 == 1) {
            return Integer.valueOf(this.f30574b);
        }
        if (i13 == 2) {
            return this.f30575c;
        }
        if (i13 == 4) {
            return this.f30577e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f31023l);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30573a.contains(Integer.valueOf(fastJsonResponse$Field.f31023l));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        Set set = this.f30573a;
        if (set.contains(1)) {
            c.O2(parcel, 1, 4);
            parcel.writeInt(this.f30574b);
        }
        if (set.contains(2)) {
            c.L2(parcel, 2, this.f30575c, true);
        }
        if (set.contains(3)) {
            c.O2(parcel, 3, 4);
            parcel.writeInt(this.f30576d);
        }
        if (set.contains(4)) {
            c.H2(parcel, 4, this.f30577e, i13, true);
        }
        c.N2(parcel, M2);
    }
}
