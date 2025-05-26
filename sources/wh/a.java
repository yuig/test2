package wh;

import android.app.PendingIntent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import bf.b;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.internal.location.zzm;
import com.google.android.gms.internal.location.zzo;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.zzae;
import com.google.android.gms.location.zzaj;
import com.google.android.gms.location.zzal;
import com.google.android.gms.location.zzj;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129896a;

    public /* synthetic */ a(int i13) {
        this.f129896a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        float f13 = 0.0f;
        String str = "";
        KeyHandle keyHandle = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        Status status = null;
        ArrayList arrayList5 = null;
        zzaj[] zzajVarArr = null;
        String str2 = null;
        zzm zzmVar = null;
        String str3 = null;
        Status status2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        byte[] bArr = null;
        switch (this.f129896a) {
            case 0:
                int r03 = b.r0(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    char c13 = (char) readInt;
                    if (c13 == 2) {
                        keyHandle = (KeyHandle) b.E(parcel, readInt, KeyHandle.CREATOR);
                    } else if (c13 == 3) {
                        str10 = b.F(parcel, readInt);
                    } else if (c13 != 4) {
                        b.p0(parcel, readInt);
                    } else {
                        str11 = b.F(parcel, readInt);
                    }
                }
                b.L(parcel, r03);
                return new RegisteredKey(keyHandle, str10, str11);
            case 1:
                int r04 = b.r0(parcel);
                Integer num = null;
                Double d2 = null;
                Uri uri = null;
                byte[] bArr2 = null;
                ArrayList arrayList6 = null;
                ChannelIdValue channelIdValue = null;
                String str12 = null;
                while (parcel.dataPosition() < r04) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            num = b.i0(parcel, readInt2);
                            break;
                        case 3:
                            d2 = b.d0(parcel, readInt2);
                            break;
                        case 4:
                            uri = (Uri) b.E(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 5:
                            bArr2 = b.C(parcel, readInt2);
                            break;
                        case 6:
                            arrayList6 = b.J(parcel, readInt2, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) b.E(parcel, readInt2, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            str12 = b.F(parcel, readInt2);
                            break;
                        default:
                            b.p0(parcel, readInt2);
                            break;
                    }
                }
                b.L(parcel, r04);
                return new SignRequestParams(num, d2, uri, bArr2, arrayList6, channelIdValue, str12);
            case 2:
                int r05 = b.r0(parcel);
                String str13 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < r05) {
                    int readInt3 = parcel.readInt();
                    char c14 = (char) readInt3;
                    if (c14 == 2) {
                        bArr = b.C(parcel, readInt3);
                    } else if (c14 == 3) {
                        str13 = b.F(parcel, readInt3);
                    } else if (c14 == 4) {
                        bArr3 = b.C(parcel, readInt3);
                    } else if (c14 != 5) {
                        b.p0(parcel, readInt3);
                    } else {
                        bArr4 = b.C(parcel, readInt3);
                    }
                }
                b.L(parcel, r05);
                return new SignResponseData(str13, bArr, bArr3, bArr4);
            case 3:
                int r06 = b.r0(parcel);
                while (parcel.dataPosition() < r06) {
                    int readInt4 = parcel.readInt();
                    char c15 = (char) readInt4;
                    if (c15 == 1) {
                        b.h0(parcel, readInt4);
                    } else if (c15 != 2) {
                        b.p0(parcel, readInt4);
                    } else {
                        str9 = b.F(parcel, readInt4);
                    }
                }
                b.L(parcel, r06);
                return new zzaq(str9);
            case 4:
                int r07 = b.r0(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < r07) {
                    int readInt5 = parcel.readInt();
                    char c16 = (char) readInt5;
                    if (c16 == 1) {
                        b.h0(parcel, readInt5);
                    } else if (c16 == 2) {
                        str8 = b.F(parcel, readInt5);
                    } else if (c16 != 3) {
                        b.p0(parcel, readInt5);
                    } else {
                        i13 = b.h0(parcel, readInt5);
                    }
                }
                b.L(parcel, r07);
                return new zzav(i13, str8);
            case 5:
                int r08 = b.r0(parcel);
                while (parcel.dataPosition() < r08) {
                    int readInt6 = parcel.readInt();
                    char c17 = (char) readInt6;
                    if (c17 == 1) {
                        b.h0(parcel, readInt6);
                    } else if (c17 != 2) {
                        b.p0(parcel, readInt6);
                    } else {
                        str7 = b.F(parcel, readInt6);
                    }
                }
                b.L(parcel, r08);
                return new zzax(str7);
            case 6:
                int r09 = b.r0(parcel);
                byte[] bArr5 = null;
                while (parcel.dataPosition() < r09) {
                    int readInt7 = parcel.readInt();
                    char c18 = (char) readInt7;
                    if (c18 == 1) {
                        b.h0(parcel, readInt7);
                    } else if (c18 == 2) {
                        str6 = b.F(parcel, readInt7);
                    } else if (c18 != 3) {
                        b.p0(parcel, readInt7);
                    } else {
                        bArr5 = b.C(parcel, readInt7);
                    }
                }
                b.L(parcel, r09);
                return new zzaz(str6, bArr5);
            case 7:
                int r010 = b.r0(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < r010) {
                    int readInt8 = parcel.readInt();
                    char c19 = (char) readInt8;
                    if (c19 == 1) {
                        b.h0(parcel, readInt8);
                    } else if (c19 == 2) {
                        str5 = b.F(parcel, readInt8);
                    } else if (c19 != 3) {
                        b.p0(parcel, readInt8);
                    } else {
                        pendingIntent = (PendingIntent) b.E(parcel, readInt8, PendingIntent.CREATOR);
                    }
                }
                b.L(parcel, r010);
                return new zzbb(pendingIntent, str5);
            case 8:
                int r011 = b.r0(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < r011) {
                    int readInt9 = parcel.readInt();
                    char c23 = (char) readInt9;
                    if (c23 == 1) {
                        i14 = b.h0(parcel, readInt9);
                    } else if (c23 != 2) {
                        b.p0(parcel, readInt9);
                    } else {
                        str4 = b.F(parcel, readInt9);
                    }
                }
                b.L(parcel, r011);
                return new zzbw(i14, str4);
            case 9:
                int r012 = b.r0(parcel);
                while (parcel.dataPosition() < r012) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        b.p0(parcel, readInt10);
                    } else {
                        status2 = (Status) b.E(parcel, readInt10, Status.CREATOR);
                    }
                }
                b.L(parcel, r012);
                return new zzad(status2);
            case 10:
                int r013 = b.r0(parcel);
                List list = zzbd.f31247m;
                LocationRequest locationRequest = null;
                String str14 = null;
                String str15 = null;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < r013) {
                    int readInt11 = parcel.readInt();
                    char c24 = (char) readInt11;
                    if (c24 != 1) {
                        switch (c24) {
                            case 5:
                                list = b.J(parcel, readInt11, ClientIdentity.CREATOR);
                                break;
                            case 6:
                                str14 = b.F(parcel, readInt11);
                                break;
                            case 7:
                                z13 = b.a0(parcel, readInt11);
                                break;
                            case '\b':
                                z14 = b.a0(parcel, readInt11);
                                break;
                            case '\t':
                                z15 = b.a0(parcel, readInt11);
                                break;
                            case '\n':
                                str15 = b.F(parcel, readInt11);
                                break;
                            default:
                                b.p0(parcel, readInt11);
                                break;
                        }
                    } else {
                        locationRequest = (LocationRequest) b.E(parcel, readInt11, LocationRequest.CREATOR);
                    }
                }
                b.L(parcel, r013);
                return new zzbd(locationRequest, list, str14, z13, z14, z15, str15);
            case 11:
                int r014 = b.r0(parcel);
                zzbd zzbdVar = null;
                IBinder iBinder = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                int i15 = 1;
                while (parcel.dataPosition() < r014) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i15 = b.h0(parcel, readInt12);
                            break;
                        case 2:
                            zzbdVar = (zzbd) b.E(parcel, readInt12, zzbd.CREATOR);
                            break;
                        case 3:
                            iBinder = b.g0(parcel, readInt12);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) b.E(parcel, readInt12, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder2 = b.g0(parcel, readInt12);
                            break;
                        case 6:
                            iBinder3 = b.g0(parcel, readInt12);
                            break;
                        default:
                            b.p0(parcel, readInt12);
                            break;
                    }
                }
                b.L(parcel, r014);
                return new zzbf(i15, zzbdVar, iBinder, pendingIntent2, iBinder2, iBinder3);
            case 12:
                int r015 = b.r0(parcel);
                int i16 = -1;
                float f14 = 0.0f;
                double d13 = 0.0d;
                double d14 = 0.0d;
                long j13 = 0;
                String str16 = null;
                int i17 = 0;
                short s13 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < r015) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            str16 = b.F(parcel, readInt13);
                            break;
                        case 2:
                            j13 = b.j0(parcel, readInt13);
                            break;
                        case 3:
                            b.v0(parcel, readInt13, 4);
                            s13 = (short) parcel.readInt();
                            break;
                        case 4:
                            d13 = b.c0(parcel, readInt13);
                            break;
                        case 5:
                            d14 = b.c0(parcel, readInt13);
                            break;
                        case 6:
                            f14 = b.e0(parcel, readInt13);
                            break;
                        case 7:
                            i17 = b.h0(parcel, readInt13);
                            break;
                        case '\b':
                            i18 = b.h0(parcel, readInt13);
                            break;
                        case '\t':
                            i16 = b.h0(parcel, readInt13);
                            break;
                        default:
                            b.p0(parcel, readInt13);
                            break;
                    }
                }
                b.L(parcel, r015);
                return new zzbh(str16, i17, s13, d13, d14, f14, j13, i18, i16);
            case 13:
                int r016 = b.r0(parcel);
                zzj zzjVar = zzm.f31271j;
                List list2 = zzm.f31270i;
                while (parcel.dataPosition() < r016) {
                    int readInt14 = parcel.readInt();
                    char c25 = (char) readInt14;
                    if (c25 == 1) {
                        zzjVar = (zzj) b.E(parcel, readInt14, zzj.CREATOR);
                    } else if (c25 == 2) {
                        list2 = b.J(parcel, readInt14, ClientIdentity.CREATOR);
                    } else if (c25 != 3) {
                        b.p0(parcel, readInt14);
                    } else {
                        str3 = b.F(parcel, readInt14);
                    }
                }
                b.L(parcel, r016);
                zzm zzmVar2 = new zzm();
                zzmVar2.f31272f = zzjVar;
                zzmVar2.f31273g = list2;
                zzmVar2.f31274h = str3;
                return zzmVar2;
            case 14:
                int r017 = b.r0(parcel);
                IBinder iBinder4 = null;
                IBinder iBinder5 = null;
                int i19 = 1;
                while (parcel.dataPosition() < r017) {
                    int readInt15 = parcel.readInt();
                    char c26 = (char) readInt15;
                    if (c26 == 1) {
                        i19 = b.h0(parcel, readInt15);
                    } else if (c26 == 2) {
                        zzmVar = (zzm) b.E(parcel, readInt15, zzm.CREATOR);
                    } else if (c26 == 3) {
                        iBinder4 = b.g0(parcel, readInt15);
                    } else if (c26 != 4) {
                        b.p0(parcel, readInt15);
                    } else {
                        iBinder5 = b.g0(parcel, readInt15);
                    }
                }
                b.L(parcel, r017);
                return new zzo(i19, zzmVar, iBinder4, iBinder5);
            case 15:
                int r018 = b.r0(parcel);
                String str17 = null;
                String str18 = null;
                int i23 = 0;
                while (parcel.dataPosition() < r018) {
                    int readInt16 = parcel.readInt();
                    char c27 = (char) readInt16;
                    if (c27 == 1) {
                        i23 = b.h0(parcel, readInt16);
                    } else if (c27 == 2) {
                        str2 = b.F(parcel, readInt16);
                    } else if (c27 == 3) {
                        str17 = b.F(parcel, readInt16);
                    } else if (c27 != 4) {
                        b.p0(parcel, readInt16);
                    } else {
                        str18 = b.F(parcel, readInt16);
                    }
                }
                b.L(parcel, r018);
                return new PlaceReport(str2, i23, str17, str18);
            case 16:
                long j14 = 0;
                int r019 = b.r0(parcel);
                int i24 = 1000;
                int i25 = 1;
                int i26 = 1;
                while (parcel.dataPosition() < r019) {
                    int readInt17 = parcel.readInt();
                    char c28 = (char) readInt17;
                    if (c28 == 1) {
                        i25 = b.h0(parcel, readInt17);
                    } else if (c28 == 2) {
                        i26 = b.h0(parcel, readInt17);
                    } else if (c28 == 3) {
                        j14 = b.j0(parcel, readInt17);
                    } else if (c28 == 4) {
                        i24 = b.h0(parcel, readInt17);
                    } else if (c28 != 5) {
                        b.p0(parcel, readInt17);
                    } else {
                        zzajVarArr = (zzaj[]) b.I(parcel, readInt17, zzaj.CREATOR);
                    }
                }
                b.L(parcel, r019);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f31841i = i24;
                locationAvailability.f31838f = i25;
                locationAvailability.f31839g = i26;
                locationAvailability.f31840h = j14;
                locationAvailability.f31842j = zzajVarArr;
                return locationAvailability;
            case 17:
                long j15 = 0;
                int r020 = b.r0(parcel);
                int i27 = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
                long j16 = 3600000;
                int i28 = Integer.MAX_VALUE;
                long j17 = Long.MAX_VALUE;
                long j18 = 600000;
                boolean z16 = false;
                while (parcel.dataPosition() < r020) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            i27 = b.h0(parcel, readInt18);
                            break;
                        case 2:
                            j16 = b.j0(parcel, readInt18);
                            break;
                        case 3:
                            j18 = b.j0(parcel, readInt18);
                            break;
                        case 4:
                            z16 = b.a0(parcel, readInt18);
                            break;
                        case 5:
                            j17 = b.j0(parcel, readInt18);
                            break;
                        case 6:
                            i28 = b.h0(parcel, readInt18);
                            break;
                        case 7:
                            f13 = b.e0(parcel, readInt18);
                            break;
                        case '\b':
                            j15 = b.j0(parcel, readInt18);
                            break;
                        default:
                            b.p0(parcel, readInt18);
                            break;
                    }
                }
                b.L(parcel, r020);
                LocationRequest locationRequest2 = new LocationRequest();
                locationRequest2.f31843f = i27;
                locationRequest2.f31844g = j16;
                locationRequest2.f31845h = j18;
                locationRequest2.f31846i = z16;
                locationRequest2.f31847j = j17;
                locationRequest2.f31848k = i28;
                locationRequest2.f31849l = f13;
                locationRequest2.f31850m = j15;
                return locationRequest2;
            case 18:
                int r021 = b.r0(parcel);
                List list3 = LocationResult.f31851g;
                while (parcel.dataPosition() < r021) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        b.p0(parcel, readInt19);
                    } else {
                        list3 = b.J(parcel, readInt19, Location.CREATOR);
                    }
                }
                b.L(parcel, r021);
                return new LocationResult(list3);
            case 19:
                int r022 = b.r0(parcel);
                String str19 = "";
                String str20 = str19;
                while (parcel.dataPosition() < r022) {
                    int readInt20 = parcel.readInt();
                    char c29 = (char) readInt20;
                    if (c29 == 1) {
                        str19 = b.F(parcel, readInt20);
                    } else if (c29 == 2) {
                        str20 = b.F(parcel, readInt20);
                    } else if (c29 != 5) {
                        b.p0(parcel, readInt20);
                    } else {
                        str = b.F(parcel, readInt20);
                    }
                }
                b.L(parcel, r022);
                return new zzae(str, str19, str20);
            case 20:
                int r023 = b.r0(parcel);
                zzae zzaeVar = null;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < r023) {
                    int readInt21 = parcel.readInt();
                    char c33 = (char) readInt21;
                    if (c33 == 1) {
                        arrayList5 = b.J(parcel, readInt21, LocationRequest.CREATOR);
                    } else if (c33 == 2) {
                        z18 = b.a0(parcel, readInt21);
                    } else if (c33 == 3) {
                        z17 = b.a0(parcel, readInt21);
                    } else if (c33 != 5) {
                        b.p0(parcel, readInt21);
                    } else {
                        zzaeVar = (zzae) b.E(parcel, readInt21, zzae.CREATOR);
                    }
                }
                b.L(parcel, r023);
                return new LocationSettingsRequest(arrayList5, z18, z17, zzaeVar);
            case 21:
                int r024 = b.r0(parcel);
                LocationSettingsStates locationSettingsStates = null;
                while (parcel.dataPosition() < r024) {
                    int readInt22 = parcel.readInt();
                    char c34 = (char) readInt22;
                    if (c34 == 1) {
                        status = (Status) b.E(parcel, readInt22, Status.CREATOR);
                    } else if (c34 != 2) {
                        b.p0(parcel, readInt22);
                    } else {
                        locationSettingsStates = (LocationSettingsStates) b.E(parcel, readInt22, LocationSettingsStates.CREATOR);
                    }
                }
                b.L(parcel, r024);
                return new LocationSettingsResult(status, locationSettingsStates);
            case 22:
                int r025 = b.r0(parcel);
                boolean z19 = false;
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                while (parcel.dataPosition() < r025) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            z19 = b.a0(parcel, readInt23);
                            break;
                        case 2:
                            z23 = b.a0(parcel, readInt23);
                            break;
                        case 3:
                            z24 = b.a0(parcel, readInt23);
                            break;
                        case 4:
                            z25 = b.a0(parcel, readInt23);
                            break;
                        case 5:
                            z26 = b.a0(parcel, readInt23);
                            break;
                        case 6:
                            z27 = b.a0(parcel, readInt23);
                            break;
                        default:
                            b.p0(parcel, readInt23);
                            break;
                    }
                }
                b.L(parcel, r025);
                return new LocationSettingsStates(z19, z23, z24, z25, z26, z27);
            case 23:
                int r026 = b.r0(parcel);
                long j19 = -1;
                long j23 = -1;
                int i29 = 1;
                int i33 = 1;
                while (parcel.dataPosition() < r026) {
                    int readInt24 = parcel.readInt();
                    char c35 = (char) readInt24;
                    if (c35 == 1) {
                        i29 = b.h0(parcel, readInt24);
                    } else if (c35 == 2) {
                        i33 = b.h0(parcel, readInt24);
                    } else if (c35 == 3) {
                        j19 = b.j0(parcel, readInt24);
                    } else if (c35 != 4) {
                        b.p0(parcel, readInt24);
                    } else {
                        j23 = b.j0(parcel, readInt24);
                    }
                }
                b.L(parcel, r026);
                return new zzaj(i29, i33, j19, j23);
            case 24:
                int r027 = b.r0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < r027) {
                    int readInt25 = parcel.readInt();
                    char c36 = (char) readInt25;
                    if (c36 == 1) {
                        arrayList4 = b.H(parcel, readInt25);
                    } else if (c36 == 2) {
                        pendingIntent3 = (PendingIntent) b.E(parcel, readInt25, PendingIntent.CREATOR);
                    } else if (c36 != 3) {
                        b.p0(parcel, readInt25);
                    } else {
                        str = b.F(parcel, readInt25);
                    }
                }
                b.L(parcel, r027);
                return new zzal(arrayList4, pendingIntent3, str);
            case 25:
                int r028 = b.r0(parcel);
                Bundle bundle = null;
                int i34 = 0;
                long j24 = 0;
                long j25 = 0;
                while (parcel.dataPosition() < r028) {
                    int readInt26 = parcel.readInt();
                    char c37 = (char) readInt26;
                    if (c37 == 1) {
                        arrayList3 = b.J(parcel, readInt26, DetectedActivity.CREATOR);
                    } else if (c37 == 2) {
                        j24 = b.j0(parcel, readInt26);
                    } else if (c37 == 3) {
                        j25 = b.j0(parcel, readInt26);
                    } else if (c37 == 4) {
                        i34 = b.h0(parcel, readInt26);
                    } else if (c37 != 5) {
                        b.p0(parcel, readInt26);
                    } else {
                        bundle = b.B(parcel, readInt26);
                    }
                }
                b.L(parcel, r028);
                ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
                d.i("Must have at least 1 detected activity", arrayList3 != null && arrayList3.size() > 0);
                long j26 = j25;
                d.i("Must set times", j24 > 0 && j26 > 0);
                activityRecognitionResult.f31817f = arrayList3;
                activityRecognitionResult.f31818g = j24;
                activityRecognitionResult.f31819h = j26;
                activityRecognitionResult.f31820i = i34;
                activityRecognitionResult.f31821j = bundle;
                return activityRecognitionResult;
            case 26:
                int r029 = b.r0(parcel);
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < r029) {
                    int readInt27 = parcel.readInt();
                    char c38 = (char) readInt27;
                    if (c38 == 1) {
                        i36 = b.h0(parcel, readInt27);
                    } else if (c38 != 2) {
                        b.p0(parcel, readInt27);
                    } else {
                        i35 = b.h0(parcel, readInt27);
                    }
                }
                b.L(parcel, r029);
                return new ActivityTransition(i36, i35);
            case 27:
                int r030 = b.r0(parcel);
                int i37 = 0;
                long j27 = 0;
                int i38 = 0;
                while (parcel.dataPosition() < r030) {
                    int readInt28 = parcel.readInt();
                    char c39 = (char) readInt28;
                    if (c39 == 1) {
                        i38 = b.h0(parcel, readInt28);
                    } else if (c39 == 2) {
                        i37 = b.h0(parcel, readInt28);
                    } else if (c39 != 3) {
                        b.p0(parcel, readInt28);
                    } else {
                        j27 = b.j0(parcel, readInt28);
                    }
                }
                b.L(parcel, r030);
                return new ActivityTransitionEvent(i38, i37, j27);
            case 28:
                int r031 = b.r0(parcel);
                String str21 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < r031) {
                    int readInt29 = parcel.readInt();
                    char c43 = (char) readInt29;
                    if (c43 == 1) {
                        arrayList2 = b.J(parcel, readInt29, ActivityTransition.CREATOR);
                    } else if (c43 == 2) {
                        str21 = b.F(parcel, readInt29);
                    } else if (c43 != 3) {
                        b.p0(parcel, readInt29);
                    } else {
                        arrayList7 = b.J(parcel, readInt29, ClientIdentity.CREATOR);
                    }
                }
                b.L(parcel, r031);
                return new ActivityTransitionRequest(str21, arrayList2, arrayList7);
            default:
                int r032 = b.r0(parcel);
                while (parcel.dataPosition() < r032) {
                    int readInt30 = parcel.readInt();
                    if (((char) readInt30) != 1) {
                        b.p0(parcel, readInt30);
                    } else {
                        arrayList = b.J(parcel, readInt30, ActivityTransitionEvent.CREATOR);
                    }
                }
                b.L(parcel, r032);
                return new ActivityTransitionResult(arrayList);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f129896a) {
            case 0:
                return new RegisteredKey[i13];
            case 1:
                return new SignRequestParams[i13];
            case 2:
                return new SignResponseData[i13];
            case 3:
                return new zzaq[i13];
            case 4:
                return new zzav[i13];
            case 5:
                return new zzax[i13];
            case 6:
                return new zzaz[i13];
            case 7:
                return new zzbb[i13];
            case 8:
                return new zzbw[i13];
            case 9:
                return new zzad[i13];
            case 10:
                return new zzbd[i13];
            case 11:
                return new zzbf[i13];
            case 12:
                return new zzbh[i13];
            case 13:
                return new zzm[i13];
            case 14:
                return new zzo[i13];
            case 15:
                return new PlaceReport[i13];
            case 16:
                return new LocationAvailability[i13];
            case 17:
                return new LocationRequest[i13];
            case 18:
                return new LocationResult[i13];
            case 19:
                return new zzae[i13];
            case 20:
                return new LocationSettingsRequest[i13];
            case 21:
                return new LocationSettingsResult[i13];
            case 22:
                return new LocationSettingsStates[i13];
            case 23:
                return new zzaj[i13];
            case 24:
                return new zzal[i13];
            case 25:
                return new ActivityRecognitionResult[i13];
            case 26:
                return new ActivityTransition[i13];
            case 27:
                return new ActivityTransitionEvent[i13];
            case 28:
                return new ActivityTransitionRequest[i13];
            default:
                return new ActivityTransitionResult[i13];
        }
    }
}
