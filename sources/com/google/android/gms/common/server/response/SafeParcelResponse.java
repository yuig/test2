package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import bf.b;
import bs1.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kh2.c3;
import lh.a;

/* loaded from: classes3.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new a(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f31028a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f31029b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31030c;

    /* renamed from: d, reason: collision with root package name */
    public final zan f31031d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31032e;

    /* renamed from: f, reason: collision with root package name */
    public int f31033f;

    /* renamed from: g, reason: collision with root package name */
    public int f31034g;

    public SafeParcelResponse(int i13, Parcel parcel, zan zanVar) {
        this.f31028a = i13;
        d.t(parcel);
        this.f31029b = parcel;
        this.f31030c = 2;
        this.f31031d = zanVar;
        this.f31032e = zanVar == null ? null : zanVar.f31043h;
        this.f31033f = 2;
    }

    public static void k(StringBuilder sb3, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).f31023l, entry);
        }
        sb3.append('{');
        int r03 = b.r0(parcel);
        boolean z13 = false;
        while (parcel.dataPosition() < r03) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z13) {
                    sb3.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb3.append("\"");
                sb3.append(str);
                sb3.append("\":");
                mh.a aVar = fastJsonResponse$Field.f31027p;
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                float[] fArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel obtain = null;
                int i13 = fastJsonResponse$Field.f31020i;
                if (aVar != null) {
                    switch (i13) {
                        case 0:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, Integer.valueOf(b.h0(parcel, readInt))));
                            break;
                        case 1:
                            int l03 = b.l0(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (l03 != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + l03);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, bigInteger2));
                            break;
                        case 2:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, Long.valueOf(b.j0(parcel, readInt))));
                            break;
                        case 3:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, Float.valueOf(b.e0(parcel, readInt))));
                            break;
                        case 4:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, Double.valueOf(b.c0(parcel, readInt))));
                            break;
                        case 5:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, b.A(parcel, readInt)));
                            break;
                        case 6:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, Boolean.valueOf(b.a0(parcel, readInt))));
                            break;
                        case 7:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, b.F(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, b.C(parcel, readInt)));
                            break;
                        case 10:
                            Bundle B = b.B(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : B.keySet()) {
                                String string = B.getString(str2);
                                d.t(string);
                                hashMap.put(str2, string);
                            }
                            m(sb3, fastJsonResponse$Field, FastSafeParcelableJsonResponse.h(fastJsonResponse$Field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.a.d("Unknown field out type = ", i13));
                    }
                } else {
                    boolean z14 = fastJsonResponse$Field.f31021j;
                    String str3 = fastJsonResponse$Field.f31025n;
                    if (z14) {
                        sb3.append("[");
                        switch (i13) {
                            case 0:
                                int[] D = b.D(parcel, readInt);
                                int length = D.length;
                                for (int i14 = 0; i14 < length; i14++) {
                                    if (i14 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(D[i14]);
                                }
                                break;
                            case 1:
                                int l04 = b.l0(parcel, readInt);
                                int dataPosition2 = parcel.dataPosition();
                                if (l04 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i15 = 0; i15 < readInt2; i15++) {
                                        bigIntegerArr[i15] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + l04);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i16 = 0; i16 < length2; i16++) {
                                    if (i16 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(bigIntegerArr[i16]);
                                }
                                break;
                            case 2:
                                int l05 = b.l0(parcel, readInt);
                                int dataPosition3 = parcel.dataPosition();
                                if (l05 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + l05);
                                }
                                int length3 = jArr.length;
                                for (int i17 = 0; i17 < length3; i17++) {
                                    if (i17 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(jArr[i17]);
                                }
                                break;
                            case 3:
                                int l06 = b.l0(parcel, readInt);
                                int dataPosition4 = parcel.dataPosition();
                                if (l06 != 0) {
                                    fArr = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition4 + l06);
                                }
                                int length4 = fArr.length;
                                for (int i18 = 0; i18 < length4; i18++) {
                                    if (i18 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(fArr[i18]);
                                }
                                break;
                            case 4:
                                int l07 = b.l0(parcel, readInt);
                                int dataPosition5 = parcel.dataPosition();
                                if (l07 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition5 + l07);
                                }
                                int length5 = dArr.length;
                                for (int i19 = 0; i19 < length5; i19++) {
                                    if (i19 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(dArr[i19]);
                                }
                                break;
                            case 5:
                                int l08 = b.l0(parcel, readInt);
                                int dataPosition6 = parcel.dataPosition();
                                if (l08 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i23 = 0; i23 < readInt3; i23++) {
                                        bigDecimalArr[i23] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition6 + l08);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i24 = 0; i24 < length6; i24++) {
                                    if (i24 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(bigDecimalArr[i24]);
                                }
                                break;
                            case 6:
                                int l09 = b.l0(parcel, readInt);
                                int dataPosition7 = parcel.dataPosition();
                                if (l09 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition7 + l09);
                                }
                                int length7 = zArr.length;
                                for (int i25 = 0; i25 < length7; i25++) {
                                    if (i25 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append(zArr[i25]);
                                }
                                break;
                            case 7:
                                String[] G = b.G(parcel, readInt);
                                int length8 = G.length;
                                for (int i26 = 0; i26 < length8; i26++) {
                                    if (i26 != 0) {
                                        sb3.append(",");
                                    }
                                    sb3.append("\"");
                                    sb3.append(G[i26]);
                                    sb3.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int l010 = b.l0(parcel, readInt);
                                int dataPosition8 = parcel.dataPosition();
                                if (l010 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i27 = 0; i27 < readInt4; i27++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition9 = parcel.dataPosition();
                                            Parcel obtain2 = Parcel.obtain();
                                            obtain2.appendFrom(parcel, dataPosition9, readInt5);
                                            parcelArr2[i27] = obtain2;
                                            parcel.setDataPosition(dataPosition9 + readInt5);
                                        } else {
                                            parcelArr2[i27] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition8 + l010);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i28 = 0; i28 < length9; i28++) {
                                    if (i28 > 0) {
                                        sb3.append(",");
                                    }
                                    parcelArr[i28].setDataPosition(0);
                                    d.t(str3);
                                    d.t(fastJsonResponse$Field.f31026o);
                                    Map map2 = (Map) fastJsonResponse$Field.f31026o.f31042g.get(str3);
                                    d.t(map2);
                                    k(sb3, map2, parcelArr[i28]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb3.append("]");
                    } else {
                        switch (i13) {
                            case 0:
                                sb3.append(b.h0(parcel, readInt));
                                break;
                            case 1:
                                int l011 = b.l0(parcel, readInt);
                                int dataPosition10 = parcel.dataPosition();
                                if (l011 != 0) {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition10 + l011);
                                    bigInteger = new BigInteger(createByteArray2);
                                }
                                sb3.append(bigInteger);
                                break;
                            case 2:
                                sb3.append(b.j0(parcel, readInt));
                                break;
                            case 3:
                                sb3.append(b.e0(parcel, readInt));
                                break;
                            case 4:
                                sb3.append(b.c0(parcel, readInt));
                                break;
                            case 5:
                                sb3.append(b.A(parcel, readInt));
                                break;
                            case 6:
                                sb3.append(b.a0(parcel, readInt));
                                break;
                            case 7:
                                String F = b.F(parcel, readInt);
                                sb3.append("\"");
                                sb3.append(oh.d.a(F));
                                sb3.append("\"");
                                break;
                            case 8:
                                byte[] C = b.C(parcel, readInt);
                                sb3.append("\"");
                                sb3.append(C != null ? Base64.encodeToString(C, 0) : null);
                                sb3.append("\"");
                                break;
                            case 9:
                                byte[] C2 = b.C(parcel, readInt);
                                sb3.append("\"");
                                sb3.append(C2 != null ? Base64.encodeToString(C2, 10) : null);
                                sb3.append("\"");
                                break;
                            case 10:
                                Bundle B2 = b.B(parcel, readInt);
                                Set<String> keySet = B2.keySet();
                                sb3.append("{");
                                boolean z15 = true;
                                for (String str4 : keySet) {
                                    if (!z15) {
                                        sb3.append(",");
                                    }
                                    sb3.append("\"");
                                    sb3.append(str4);
                                    sb3.append("\":\"");
                                    sb3.append(oh.d.a(B2.getString(str4)));
                                    sb3.append("\"");
                                    z15 = false;
                                }
                                sb3.append("}");
                                break;
                            case 11:
                                int l012 = b.l0(parcel, readInt);
                                int dataPosition11 = parcel.dataPosition();
                                if (l012 != 0) {
                                    obtain = Parcel.obtain();
                                    obtain.appendFrom(parcel, dataPosition11, l012);
                                    parcel.setDataPosition(dataPosition11 + l012);
                                }
                                obtain.setDataPosition(0);
                                d.t(str3);
                                d.t(fastJsonResponse$Field.f31026o);
                                Map map3 = (Map) fastJsonResponse$Field.f31026o.f31042g.get(str3);
                                d.t(map3);
                                k(sb3, map3, obtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z13 = true;
            }
        }
        if (parcel.dataPosition() != r03) {
            throw new SafeParcelReader$ParseException(a.a.d("Overread allowed size end=", r03), parcel);
        }
        sb3.append('}');
    }

    public static final void l(StringBuilder sb3, int i13, Object obj) {
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb3.append(obj);
                return;
            case 7:
                sb3.append("\"");
                d.t(obj);
                sb3.append(oh.d.a(obj.toString()));
                sb3.append("\"");
                return;
            case 8:
                sb3.append("\"");
                byte[] bArr = (byte[]) obj;
                sb3.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb3.append("\"");
                return;
            case 9:
                sb3.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb3.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb3.append("\"");
                return;
            case 10:
                d.t(obj);
                c3.x0(sb3, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.a.d("Unknown type = ", i13));
        }
    }

    public static final void m(StringBuilder sb3, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        boolean z13 = fastJsonResponse$Field.f31019h;
        int i13 = fastJsonResponse$Field.f31018g;
        if (!z13) {
            l(sb3, i13, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb3.append("[");
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            l(sb3, i13, arrayList.get(i14));
        }
        sb3.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map a() {
        zan zanVar = this.f31031d;
        if (zanVar == null) {
            return null;
        }
        String str = this.f31032e;
        d.t(str);
        return (Map) zanVar.f31042g.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object d() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean f() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel j() {
        int i13 = this.f31033f;
        Parcel parcel = this.f31029b;
        if (i13 == 0) {
            int M2 = c.M2(parcel, 20293);
            this.f31034g = M2;
            c.N2(parcel, M2);
            this.f31033f = 2;
        } else if (i13 == 1) {
            c.N2(parcel, this.f31034g);
            this.f31033f = 2;
        }
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final String toString() {
        zan zanVar = this.f31031d;
        d.u(zanVar, "Cannot convert to JSON on client side.");
        Parcel j13 = j();
        j13.setDataPosition(0);
        StringBuilder sb3 = new StringBuilder(100);
        String str = this.f31032e;
        d.t(str);
        Map map = (Map) zanVar.f31042g.get(str);
        d.t(map);
        k(sb3, map, j13);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        c.O2(parcel, 1, 4);
        parcel.writeInt(this.f31028a);
        Parcel j13 = j();
        if (j13 != null) {
            int M22 = c.M2(parcel, 2);
            parcel.appendFrom(j13, 0, j13.dataSize());
            c.N2(parcel, M22);
        }
        c.H2(parcel, 3, this.f31030c != 0 ? this.f31031d : null, i13, false);
        c.N2(parcel, M2);
    }
}
