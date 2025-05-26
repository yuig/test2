package lh;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import bf.b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzz;
import gi.j1;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83284a;

    public /* synthetic */ a(int i13) {
        this.f83284a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j13 = 0;
        boolean z13 = false;
        int i13 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z19 = false;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ArrayList arrayList2 = null;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        StringToIntConverter stringToIntConverter = null;
        PendingIntent pendingIntent = null;
        switch (this.f83284a) {
            case 0:
                int r03 = b.r0(parcel);
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    char c13 = (char) readInt;
                    if (c13 == 1) {
                        arrayList = b.J(parcel, readInt, Feature.CREATOR);
                    } else if (c13 == 2) {
                        z13 = b.a0(parcel, readInt);
                    } else if (c13 == 3) {
                        str11 = b.F(parcel, readInt);
                    } else if (c13 != 4) {
                        b.p0(parcel, readInt);
                    } else {
                        str12 = b.F(parcel, readInt);
                    }
                }
                b.L(parcel, r03);
                return new ApiFeatureRequest(arrayList, z13, str11, str12);
            case 1:
                int r04 = b.r0(parcel);
                int i26 = 0;
                while (parcel.dataPosition() < r04) {
                    int readInt2 = parcel.readInt();
                    char c14 = (char) readInt2;
                    if (c14 == 1) {
                        z19 = b.a0(parcel, readInt2);
                    } else if (c14 != 2) {
                        b.p0(parcel, readInt2);
                    } else {
                        i26 = b.h0(parcel, readInt2);
                    }
                }
                b.L(parcel, r04);
                return new ModuleAvailabilityResponse(z19, i26);
            case 2:
                int r05 = b.r0(parcel);
                while (parcel.dataPosition() < r05) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        b.p0(parcel, readInt3);
                    } else {
                        pendingIntent = (PendingIntent) b.E(parcel, readInt3, PendingIntent.CREATOR);
                    }
                }
                b.L(parcel, r05);
                return new ModuleInstallIntentResponse(pendingIntent);
            case 3:
                int r06 = b.r0(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < r06) {
                    int readInt4 = parcel.readInt();
                    char c15 = (char) readInt4;
                    if (c15 == 1) {
                        i25 = b.h0(parcel, readInt4);
                    } else if (c15 != 2) {
                        b.p0(parcel, readInt4);
                    } else {
                        z23 = b.a0(parcel, readInt4);
                    }
                }
                b.L(parcel, r06);
                return new ModuleInstallResponse(i25, z23);
            case 4:
                int r07 = b.r0(parcel);
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                Long l13 = null;
                Long l14 = null;
                while (parcel.dataPosition() < r07) {
                    int readInt5 = parcel.readInt();
                    char c16 = (char) readInt5;
                    if (c16 == 1) {
                        i27 = b.h0(parcel, readInt5);
                    } else if (c16 == 2) {
                        i28 = b.h0(parcel, readInt5);
                    } else if (c16 == 3) {
                        l13 = b.k0(parcel, readInt5);
                    } else if (c16 == 4) {
                        l14 = b.k0(parcel, readInt5);
                    } else if (c16 != 5) {
                        b.p0(parcel, readInt5);
                    } else {
                        i29 = b.h0(parcel, readInt5);
                    }
                }
                b.L(parcel, r07);
                return new ModuleInstallStatusUpdate(i27, i28, l13, l14, i29);
            case 5:
                int r08 = b.r0(parcel);
                while (parcel.dataPosition() < r08) {
                    int readInt6 = parcel.readInt();
                    char c17 = (char) readInt6;
                    if (c17 == 1) {
                        i24 = b.h0(parcel, readInt6);
                    } else if (c17 != 2) {
                        b.p0(parcel, readInt6);
                    } else {
                        stringToIntConverter = (StringToIntConverter) b.E(parcel, readInt6, StringToIntConverter.CREATOR);
                    }
                }
                b.L(parcel, r08);
                return new zaa(i24, stringToIntConverter);
            case 6:
                int r09 = b.r0(parcel);
                while (parcel.dataPosition() < r09) {
                    int readInt7 = parcel.readInt();
                    char c18 = (char) readInt7;
                    if (c18 == 1) {
                        i23 = b.h0(parcel, readInt7);
                    } else if (c18 != 2) {
                        b.p0(parcel, readInt7);
                    } else {
                        arrayList3 = b.J(parcel, readInt7, zac.CREATOR);
                    }
                }
                b.L(parcel, r09);
                return new StringToIntConverter(i23, arrayList3);
            case 7:
                int r010 = b.r0(parcel);
                int i33 = 0;
                while (parcel.dataPosition() < r010) {
                    int readInt8 = parcel.readInt();
                    char c19 = (char) readInt8;
                    if (c19 == 1) {
                        i19 = b.h0(parcel, readInt8);
                    } else if (c19 == 2) {
                        str10 = b.F(parcel, readInt8);
                    } else if (c19 != 3) {
                        b.p0(parcel, readInt8);
                    } else {
                        i33 = b.h0(parcel, readInt8);
                    }
                }
                b.L(parcel, r010);
                return new zac(i19, i33, str10);
            case 8:
                int r011 = b.r0(parcel);
                FastJsonResponse$Field fastJsonResponse$Field = null;
                while (parcel.dataPosition() < r011) {
                    int readInt9 = parcel.readInt();
                    char c23 = (char) readInt9;
                    if (c23 == 1) {
                        i18 = b.h0(parcel, readInt9);
                    } else if (c23 == 2) {
                        str9 = b.F(parcel, readInt9);
                    } else if (c23 != 3) {
                        b.p0(parcel, readInt9);
                    } else {
                        fastJsonResponse$Field = (FastJsonResponse$Field) b.E(parcel, readInt9, FastJsonResponse$Field.CREATOR);
                    }
                }
                b.L(parcel, r011);
                return new zam(i18, str9, fastJsonResponse$Field);
            case 9:
                int r012 = b.r0(parcel);
                String str13 = null;
                while (parcel.dataPosition() < r012) {
                    int readInt10 = parcel.readInt();
                    char c24 = (char) readInt10;
                    if (c24 == 1) {
                        i17 = b.h0(parcel, readInt10);
                    } else if (c24 == 2) {
                        arrayList2 = b.J(parcel, readInt10, zal.CREATOR);
                    } else if (c24 != 3) {
                        b.p0(parcel, readInt10);
                    } else {
                        str13 = b.F(parcel, readInt10);
                    }
                }
                b.L(parcel, r012);
                return new zan(i17, str13, arrayList2);
            case 10:
                int r013 = b.r0(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < r013) {
                    int readInt11 = parcel.readInt();
                    char c25 = (char) readInt11;
                    if (c25 == 1) {
                        i16 = b.h0(parcel, readInt11);
                    } else if (c25 == 2) {
                        str8 = b.F(parcel, readInt11);
                    } else if (c25 != 3) {
                        b.p0(parcel, readInt11);
                    } else {
                        arrayList4 = b.J(parcel, readInt11, zam.CREATOR);
                    }
                }
                b.L(parcel, r013);
                return new zal(i16, str8, arrayList4);
            case 11:
                int r014 = b.r0(parcel);
                Parcel parcel2 = null;
                zan zanVar = null;
                while (parcel.dataPosition() < r014) {
                    int readInt12 = parcel.readInt();
                    char c26 = (char) readInt12;
                    if (c26 == 1) {
                        i15 = b.h0(parcel, readInt12);
                    } else if (c26 == 2) {
                        int l03 = b.l0(parcel, readInt12);
                        int dataPosition = parcel.dataPosition();
                        if (l03 == 0) {
                            parcel2 = null;
                        } else {
                            Parcel obtain = Parcel.obtain();
                            obtain.appendFrom(parcel, dataPosition, l03);
                            parcel.setDataPosition(dataPosition + l03);
                            parcel2 = obtain;
                        }
                    } else if (c26 != 3) {
                        b.p0(parcel, readInt12);
                    } else {
                        zanVar = (zan) b.E(parcel, readInt12, zan.CREATOR);
                    }
                }
                b.L(parcel, r014);
                return new SafeParcelResponse(i15, parcel2, zanVar);
            case 12:
                int r015 = b.r0(parcel);
                int i34 = 0;
                while (parcel.dataPosition() < r015) {
                    int readInt13 = parcel.readInt();
                    char c27 = (char) readInt13;
                    if (c27 == 1) {
                        i14 = b.h0(parcel, readInt13);
                    } else if (c27 == 2) {
                        str7 = b.F(parcel, readInt13);
                    } else if (c27 != 3) {
                        b.p0(parcel, readInt13);
                    } else {
                        i34 = b.h0(parcel, readInt13);
                    }
                }
                b.L(parcel, r015);
                return new FavaDiagnosticsEntity(i14, i34, str7);
            case 13:
                int r016 = b.r0(parcel);
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                float f13 = 0.0f;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                boolean z24 = false;
                String str14 = null;
                ArrayList arrayList5 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < r016) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i35 = b.h0(parcel, readInt14);
                            break;
                        case 2:
                            j14 = b.j0(parcel, readInt14);
                            break;
                        case 3:
                        case 7:
                        case '\t':
                        default:
                            b.p0(parcel, readInt14);
                            break;
                        case 4:
                            str14 = b.F(parcel, readInt14);
                            break;
                        case 5:
                            i37 = b.h0(parcel, readInt14);
                            break;
                        case 6:
                            arrayList5 = b.H(parcel, readInt14);
                            break;
                        case '\b':
                            j15 = b.j0(parcel, readInt14);
                            break;
                        case '\n':
                            str16 = b.F(parcel, readInt14);
                            break;
                        case 11:
                            i36 = b.h0(parcel, readInt14);
                            break;
                        case '\f':
                            str15 = b.F(parcel, readInt14);
                            break;
                        case '\r':
                            str17 = b.F(parcel, readInt14);
                            break;
                        case 14:
                            i38 = b.h0(parcel, readInt14);
                            break;
                        case 15:
                            f13 = b.e0(parcel, readInt14);
                            break;
                        case 16:
                            j16 = b.j0(parcel, readInt14);
                            break;
                        case 17:
                            str18 = b.F(parcel, readInt14);
                            break;
                        case 18:
                            z24 = b.a0(parcel, readInt14);
                            break;
                    }
                }
                b.L(parcel, r016);
                return new WakeLockEvent(i35, j14, i36, str14, i37, arrayList5, str15, j15, i38, str16, str17, f13, j16, str18, z24);
            case 14:
                int r017 = b.r0(parcel);
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                String str19 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < r017) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            str19 = b.F(parcel, readInt15);
                            break;
                        case 2:
                            z25 = b.a0(parcel, readInt15);
                            break;
                        case 3:
                            z26 = b.a0(parcel, readInt15);
                            break;
                        case 4:
                            iBinder = b.g0(parcel, readInt15);
                            break;
                        case 5:
                            z27 = b.a0(parcel, readInt15);
                            break;
                        case 6:
                            z28 = b.a0(parcel, readInt15);
                            break;
                        default:
                            b.p0(parcel, readInt15);
                            break;
                    }
                }
                b.L(parcel, r017);
                return new zzo(str19, z25, z26, iBinder, z27, z28);
            case 15:
                int r018 = b.r0(parcel);
                int i39 = 0;
                int i43 = 0;
                while (parcel.dataPosition() < r018) {
                    int readInt16 = parcel.readInt();
                    char c28 = (char) readInt16;
                    if (c28 == 1) {
                        z18 = b.a0(parcel, readInt16);
                    } else if (c28 == 2) {
                        str6 = b.F(parcel, readInt16);
                    } else if (c28 == 3) {
                        i39 = b.h0(parcel, readInt16);
                    } else if (c28 != 4) {
                        b.p0(parcel, readInt16);
                    } else {
                        i43 = b.h0(parcel, readInt16);
                    }
                }
                b.L(parcel, r018);
                return new zzq(str6, i39, i43, z18);
            case 16:
                int r019 = b.r0(parcel);
                boolean z29 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < r019) {
                    int readInt17 = parcel.readInt();
                    char c29 = (char) readInt17;
                    if (c29 == 1) {
                        str5 = b.F(parcel, readInt17);
                    } else if (c29 == 2) {
                        iBinder2 = b.g0(parcel, readInt17);
                    } else if (c29 == 3) {
                        z17 = b.a0(parcel, readInt17);
                    } else if (c29 != 4) {
                        b.p0(parcel, readInt17);
                    } else {
                        z29 = b.a0(parcel, readInt17);
                    }
                }
                b.L(parcel, r019);
                return new zzs(str5, iBinder2, z17, z29);
            case 17:
                int r020 = b.r0(parcel);
                while (parcel.dataPosition() < r020) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        b.p0(parcel, readInt18);
                    } else {
                        z16 = b.a0(parcel, readInt18);
                    }
                }
                b.L(parcel, r020);
                return new zzz(z16);
            case 18:
                int r021 = b.r0(parcel);
                while (parcel.dataPosition() < r021) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        b.p0(parcel, readInt19);
                    } else {
                        j13 = b.j0(parcel, readInt19);
                    }
                }
                b.L(parcel, r021);
                return new zzab(j13);
            case 19:
                int r022 = b.r0(parcel);
                while (parcel.dataPosition() < r022) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        b.p0(parcel, readInt20);
                    } else {
                        z15 = b.a0(parcel, readInt20);
                    }
                }
                b.L(parcel, r022);
                return new zzad(z15);
            case 20:
                int r023 = b.r0(parcel);
                while (parcel.dataPosition() < r023) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        b.p0(parcel, readInt21);
                    } else {
                        z14 = b.a0(parcel, readInt21);
                    }
                }
                b.L(parcel, r023);
                return new GoogleThirdPartyPaymentExtension(z14);
            case 21:
                int r024 = b.r0(parcel);
                while (parcel.dataPosition() < r024) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        b.p0(parcel, readInt22);
                    } else {
                        str4 = b.F(parcel, readInt22);
                    }
                }
                b.L(parcel, r024);
                return new zzag(str4);
            case 22:
                int r025 = b.r0(parcel);
                byte[] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < r025) {
                    int readInt23 = parcel.readInt();
                    char c33 = (char) readInt23;
                    if (c33 == 1) {
                        bArr = b.C(parcel, readInt23);
                    } else if (c33 == 2) {
                        bArr2 = b.C(parcel, readInt23);
                    } else if (c33 == 3) {
                        bArr3 = b.C(parcel, readInt23);
                    } else if (c33 != 4) {
                        b.p0(parcel, readInt23);
                    } else {
                        i13 = b.h0(parcel, readInt23);
                    }
                }
                b.L(parcel, r025);
                return new zzai(bArr == null ? null : j1.l(bArr, bArr.length), bArr2 == null ? null : j1.l(bArr2, bArr2.length), bArr3 != null ? j1.l(bArr3, bArr3.length) : null, i13);
            case 23:
                int r026 = b.r0(parcel);
                while (true) {
                    byte[][] bArr4 = null;
                    while (parcel.dataPosition() < r026) {
                        int readInt24 = parcel.readInt();
                        if (((char) readInt24) != 1) {
                            b.p0(parcel, readInt24);
                        } else {
                            int l04 = b.l0(parcel, readInt24);
                            int dataPosition2 = parcel.dataPosition();
                            if (l04 == 0) {
                                break;
                            }
                            int readInt25 = parcel.readInt();
                            byte[][] bArr5 = new byte[readInt25][];
                            for (int i44 = 0; i44 < readInt25; i44++) {
                                bArr5[i44] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(dataPosition2 + l04);
                            bArr4 = bArr5;
                        }
                    }
                    b.L(parcel, r026);
                    return new zzak(bArr4);
                    break;
                }
            case 24:
                int r027 = b.r0(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArr6 = null;
                ArrayList arrayList6 = null;
                Double d2 = null;
                ArrayList arrayList7 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer num = null;
                TokenBinding tokenBinding = null;
                String str20 = null;
                AuthenticationExtensions authenticationExtensions = null;
                String str21 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < r027) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) b.E(parcel, readInt26, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) b.E(parcel, readInt26, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArr6 = b.C(parcel, readInt26);
                            break;
                        case 5:
                            arrayList6 = b.J(parcel, readInt26, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            d2 = b.d0(parcel, readInt26);
                            break;
                        case 7:
                            arrayList7 = b.J(parcel, readInt26, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case '\b':
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) b.E(parcel, readInt26, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            num = b.i0(parcel, readInt26);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) b.E(parcel, readInt26, TokenBinding.CREATOR);
                            break;
                        case 11:
                            str20 = b.F(parcel, readInt26);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) b.E(parcel, readInt26, AuthenticationExtensions.CREATOR);
                            break;
                        case '\r':
                            str21 = b.F(parcel, readInt26);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) b.E(parcel, readInt26, ResultReceiver.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt26);
                            break;
                    }
                }
                b.L(parcel, r027);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr6, arrayList6, d2, arrayList7, authenticatorSelectionCriteria, num, tokenBinding, str20, authenticationExtensions, str21, resultReceiver);
            case 25:
                int r028 = b.r0(parcel);
                String str22 = null;
                String str23 = null;
                byte[] bArr7 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String str24 = null;
                while (parcel.dataPosition() < r028) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 1:
                            str22 = b.F(parcel, readInt27);
                            break;
                        case 2:
                            str23 = b.F(parcel, readInt27);
                            break;
                        case 3:
                            bArr7 = b.C(parcel, readInt27);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) b.E(parcel, readInt27, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) b.E(parcel, readInt27, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) b.E(parcel, readInt27, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) b.E(parcel, readInt27, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            str24 = b.F(parcel, readInt27);
                            break;
                        case '\t':
                            b.F(parcel, readInt27);
                            break;
                        default:
                            b.p0(parcel, readInt27);
                            break;
                    }
                }
                b.L(parcel, r028);
                return new PublicKeyCredential(str22, str23, bArr7, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str24);
            case 26:
                int r029 = b.r0(parcel);
                byte[] bArr8 = null;
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < r029) {
                    int readInt28 = parcel.readInt();
                    char c34 = (char) readInt28;
                    if (c34 == 2) {
                        str3 = b.F(parcel, readInt28);
                    } else if (c34 == 3) {
                        bArr8 = b.C(parcel, readInt28);
                    } else if (c34 != 4) {
                        b.p0(parcel, readInt28);
                    } else {
                        arrayList8 = b.J(parcel, readInt28, Transport.CREATOR);
                    }
                }
                b.L(parcel, r029);
                return new PublicKeyCredentialDescriptor(str3, bArr8, arrayList8);
            case 27:
                int r030 = b.r0(parcel);
                Integer num2 = null;
                while (parcel.dataPosition() < r030) {
                    int readInt29 = parcel.readInt();
                    char c35 = (char) readInt29;
                    if (c35 == 2) {
                        str2 = b.F(parcel, readInt29);
                    } else if (c35 != 3) {
                        b.p0(parcel, readInt29);
                    } else {
                        num2 = b.i0(parcel, readInt29);
                    }
                }
                b.L(parcel, r030);
                return new PublicKeyCredentialParameters(str2, num2.intValue());
            case 28:
                int r031 = b.r0(parcel);
                byte[] bArr9 = null;
                Double d13 = null;
                String str25 = null;
                ArrayList arrayList9 = null;
                Integer num3 = null;
                TokenBinding tokenBinding2 = null;
                String str26 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                Long l15 = null;
                String str27 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < r031) {
                    int readInt30 = parcel.readInt();
                    switch ((char) readInt30) {
                        case 2:
                            bArr9 = b.C(parcel, readInt30);
                            break;
                        case 3:
                            d13 = b.d0(parcel, readInt30);
                            break;
                        case 4:
                            str25 = b.F(parcel, readInt30);
                            break;
                        case 5:
                            arrayList9 = b.J(parcel, readInt30, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            num3 = b.i0(parcel, readInt30);
                            break;
                        case 7:
                            tokenBinding2 = (TokenBinding) b.E(parcel, readInt30, TokenBinding.CREATOR);
                            break;
                        case '\b':
                            str26 = b.F(parcel, readInt30);
                            break;
                        case '\t':
                            authenticationExtensions2 = (AuthenticationExtensions) b.E(parcel, readInt30, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            l15 = b.k0(parcel, readInt30);
                            break;
                        case 11:
                            str27 = b.F(parcel, readInt30);
                            break;
                        case '\f':
                            resultReceiver2 = (ResultReceiver) b.E(parcel, readInt30, ResultReceiver.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt30);
                            break;
                    }
                }
                b.L(parcel, r031);
                return new PublicKeyCredentialRequestOptions(bArr9, d13, str25, arrayList9, num3, tokenBinding2, str26, authenticationExtensions2, l15, str27, resultReceiver2);
            default:
                int r032 = b.r0(parcel);
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < r032) {
                    int readInt31 = parcel.readInt();
                    char c36 = (char) readInt31;
                    if (c36 == 2) {
                        str = b.F(parcel, readInt31);
                    } else if (c36 == 3) {
                        str28 = b.F(parcel, readInt31);
                    } else if (c36 != 4) {
                        b.p0(parcel, readInt31);
                    } else {
                        str29 = b.F(parcel, readInt31);
                    }
                }
                b.L(parcel, r032);
                return new PublicKeyCredentialRpEntity(str, str28, str29);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f83284a) {
            case 0:
                return new ApiFeatureRequest[i13];
            case 1:
                return new ModuleAvailabilityResponse[i13];
            case 2:
                return new ModuleInstallIntentResponse[i13];
            case 3:
                return new ModuleInstallResponse[i13];
            case 4:
                return new ModuleInstallStatusUpdate[i13];
            case 5:
                return new zaa[i13];
            case 6:
                return new StringToIntConverter[i13];
            case 7:
                return new zac[i13];
            case 8:
                return new zam[i13];
            case 9:
                return new zan[i13];
            case 10:
                return new zal[i13];
            case 11:
                return new SafeParcelResponse[i13];
            case 12:
                return new FavaDiagnosticsEntity[i13];
            case 13:
                return new WakeLockEvent[i13];
            case 14:
                return new zzo[i13];
            case 15:
                return new zzq[i13];
            case 16:
                return new zzs[i13];
            case 17:
                return new zzz[i13];
            case 18:
                return new zzab[i13];
            case 19:
                return new zzad[i13];
            case 20:
                return new GoogleThirdPartyPaymentExtension[i13];
            case 21:
                return new zzag[i13];
            case 22:
                return new zzai[i13];
            case 23:
                return new zzak[i13];
            case 24:
                return new PublicKeyCredentialCreationOptions[i13];
            case 25:
                return new PublicKeyCredential[i13];
            case 26:
                return new PublicKeyCredentialDescriptor[i13];
            case 27:
                return new PublicKeyCredentialParameters[i13];
            case 28:
                return new PublicKeyCredentialRequestOptions[i13];
            default:
                return new PublicKeyCredentialRpEntity[i13];
        }
    }
}
