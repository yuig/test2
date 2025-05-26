package com.google.android.gms.common.server.response;

import android.os.Parcel;
import bs1.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.internal.measurement.q4;
import mh.a;
import mh.b;

/* loaded from: classes3.dex */
public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
    public static final b CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    public final int f31017f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31018g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31019h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31020i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31021j;

    /* renamed from: k, reason: collision with root package name */
    public final String f31022k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31023l;

    /* renamed from: m, reason: collision with root package name */
    public final Class f31024m;

    /* renamed from: n, reason: collision with root package name */
    public final String f31025n;

    /* renamed from: o, reason: collision with root package name */
    public zan f31026o;

    /* renamed from: p, reason: collision with root package name */
    public final a f31027p;

    public FastJsonResponse$Field(int i13, int i14, boolean z13, int i15, boolean z14, String str, int i16, String str2, zaa zaaVar) {
        this.f31017f = i13;
        this.f31018g = i14;
        this.f31019h = z13;
        this.f31020i = i15;
        this.f31021j = z14;
        this.f31022k = str;
        this.f31023l = i16;
        if (str2 == null) {
            this.f31024m = null;
            this.f31025n = null;
        } else {
            this.f31024m = SafeParcelResponse.class;
            this.f31025n = str2;
        }
        if (zaaVar == null) {
            this.f31027p = null;
            return;
        }
        StringToIntConverter stringToIntConverter = zaaVar.f31013g;
        if (stringToIntConverter == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.f31027p = stringToIntConverter;
    }

    public static FastJsonResponse$Field e(int i13, String str) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i13, null);
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(Integer.valueOf(this.f31017f), "versionCode");
        q4Var.m(Integer.valueOf(this.f31018g), "typeIn");
        q4Var.m(Boolean.valueOf(this.f31019h), "typeInArray");
        q4Var.m(Integer.valueOf(this.f31020i), "typeOut");
        q4Var.m(Boolean.valueOf(this.f31021j), "typeOutArray");
        q4Var.m(this.f31022k, "outputFieldName");
        q4Var.m(Integer.valueOf(this.f31023l), "safeParcelFieldId");
        String str = this.f31025n;
        if (str == null) {
            str = null;
        }
        q4Var.m(str, "concreteTypeName");
        Class cls = this.f31024m;
        if (cls != null) {
            q4Var.m(cls.getCanonicalName(), "concreteType.class");
        }
        a aVar = this.f31027p;
        if (aVar != null) {
            q4Var.m(aVar.getClass().getCanonicalName(), "converterName");
        }
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31017f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(this.f31018g);
        c.O2(parcel, 3, 4);
        parcel.writeInt(this.f31019h ? 1 : 0);
        c.O2(parcel, 4, 4);
        parcel.writeInt(this.f31020i);
        c.O2(parcel, 5, 4);
        parcel.writeInt(this.f31021j ? 1 : 0);
        c.I2(parcel, 6, this.f31022k, false);
        c.O2(parcel, 7, 4);
        parcel.writeInt(this.f31023l);
        zaa zaaVar = null;
        String str = this.f31025n;
        if (str == null) {
            str = null;
        }
        c.I2(parcel, 8, str, false);
        a aVar = this.f31027p;
        if (aVar != null) {
            if (!(aVar instanceof StringToIntConverter)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            zaaVar = new zaa((StringToIntConverter) aVar);
        }
        c.H2(parcel, 9, zaaVar, i13, false);
        c.N2(parcel, M2);
    }

    public FastJsonResponse$Field(int i13, boolean z13, int i14, boolean z14, String str, int i15, Class cls) {
        this.f31017f = 1;
        this.f31018g = i13;
        this.f31019h = z13;
        this.f31020i = i14;
        this.f31021j = z14;
        this.f31022k = str;
        this.f31023l = i15;
        this.f31024m = cls;
        if (cls == null) {
            this.f31025n = null;
        } else {
            this.f31025n = cls.getCanonicalName();
        }
        this.f31027p = null;
    }
}
