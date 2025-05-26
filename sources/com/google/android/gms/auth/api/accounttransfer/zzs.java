package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.c;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import g1.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vg.a;

/* loaded from: classes3.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new a(20);

    /* renamed from: g, reason: collision with root package name */
    public static final g f30578g;

    /* renamed from: a, reason: collision with root package name */
    public final int f30579a;

    /* renamed from: b, reason: collision with root package name */
    public final List f30580b;

    /* renamed from: c, reason: collision with root package name */
    public final List f30581c;

    /* renamed from: d, reason: collision with root package name */
    public final List f30582d;

    /* renamed from: e, reason: collision with root package name */
    public final List f30583e;

    /* renamed from: f, reason: collision with root package name */
    public final List f30584f;

    static {
        g gVar = new g();
        f30578g = gVar;
        gVar.put("registered", FastJsonResponse$Field.e(2, "registered"));
        gVar.put("in_progress", FastJsonResponse$Field.e(3, "in_progress"));
        gVar.put("success", FastJsonResponse$Field.e(4, "success"));
        gVar.put("failed", FastJsonResponse$Field.e(5, "failed"));
        gVar.put("escrowed", FastJsonResponse$Field.e(6, "escrowed"));
    }

    public zzs(int i13, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f30579a = i13;
        this.f30580b = arrayList;
        this.f30581c = arrayList2;
        this.f30582d = arrayList3;
        this.f30583e = arrayList4;
        this.f30584f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map a() {
        return f30578g;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        switch (fastJsonResponse$Field.f31023l) {
            case 1:
                return Integer.valueOf(this.f30579a);
            case 2:
                return this.f30580b;
            case 3:
                return this.f30581c;
            case 4:
                return this.f30582d;
            case 5:
                return this.f30583e;
            case 6:
                return this.f30584f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f31023l);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f30579a);
        c.J2(parcel, 2, this.f30580b);
        c.J2(parcel, 3, this.f30581c);
        c.J2(parcel, 4, this.f30582d);
        c.J2(parcel, 5, this.f30583e);
        c.J2(parcel, 6, this.f30584f);
        c.N2(parcel, M2);
    }
}
