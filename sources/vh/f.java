package vh;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import gi.j1;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class f implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f125830a;

    public /* synthetic */ f(int i13) {
        this.f125830a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z13 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i18 = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str = null;
        byte[] bArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        String str5 = null;
        byte[] bArr4 = null;
        ArrayList arrayList2 = null;
        String str6 = null;
        String str7 = null;
        switch (this.f125830a) {
            case 0:
                int r03 = bf.b.r0(parcel);
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    char c13 = (char) readInt;
                    if (c13 == 2) {
                        bArr = bf.b.C(parcel, readInt);
                    } else if (c13 == 3) {
                        str8 = bf.b.F(parcel, readInt);
                    } else if (c13 == 4) {
                        str9 = bf.b.F(parcel, readInt);
                    } else if (c13 != 5) {
                        bf.b.p0(parcel, readInt);
                    } else {
                        str10 = bf.b.F(parcel, readInt);
                    }
                }
                bf.b.L(parcel, r03);
                return new PublicKeyCredentialUserEntity(str8, str9, str10, bArr);
            case 1:
                int r04 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r04) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        bf.b.p0(parcel, readInt2);
                    } else {
                        str7 = bf.b.F(parcel, readInt2);
                    }
                }
                bf.b.L(parcel, r04);
                return new zzaw(str7);
            case 2:
                int r05 = bf.b.r0(parcel);
                String str11 = null;
                while (parcel.dataPosition() < r05) {
                    int readInt3 = parcel.readInt();
                    char c14 = (char) readInt3;
                    if (c14 == 2) {
                        str6 = bf.b.F(parcel, readInt3);
                    } else if (c14 != 3) {
                        bf.b.p0(parcel, readInt3);
                    } else {
                        str11 = bf.b.F(parcel, readInt3);
                    }
                }
                bf.b.L(parcel, r05);
                return new TokenBinding(str6, str11);
            case 3:
                int r06 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r06) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        bf.b.p0(parcel, readInt4);
                    } else {
                        z13 = bf.b.a0(parcel, readInt4);
                    }
                }
                bf.b.L(parcel, r06);
                return new UserVerificationMethodExtension(z13);
            case 4:
                try {
                    return UserVerificationRequirement.fromString(parcel.readString());
                } catch (zzbc e13) {
                    throw new RuntimeException(e13);
                }
            case 5:
                int r07 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r07) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        bf.b.p0(parcel, readInt5);
                    } else {
                        arrayList2 = bf.b.J(parcel, readInt5, UvmEntry.CREATOR);
                    }
                }
                bf.b.L(parcel, r07);
                return new UvmEntries(arrayList2);
            case 6:
                int r08 = bf.b.r0(parcel);
                short s13 = 0;
                short s14 = 0;
                while (parcel.dataPosition() < r08) {
                    int readInt6 = parcel.readInt();
                    char c15 = (char) readInt6;
                    if (c15 == 1) {
                        i18 = bf.b.h0(parcel, readInt6);
                    } else if (c15 == 2) {
                        bf.b.v0(parcel, readInt6, 4);
                        s13 = (short) parcel.readInt();
                    } else if (c15 != 3) {
                        bf.b.p0(parcel, readInt6);
                    } else {
                        bf.b.v0(parcel, readInt6, 4);
                        s14 = (short) parcel.readInt();
                    }
                }
                bf.b.L(parcel, r08);
                return new UvmEntry(i18, s13, s14);
            case 7:
                int r09 = bf.b.r0(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                String str12 = null;
                while (parcel.dataPosition() < r09) {
                    int readInt7 = parcel.readInt();
                    char c16 = (char) readInt7;
                    if (c16 == 1) {
                        uvmEntries = (UvmEntries) bf.b.E(parcel, readInt7, UvmEntries.CREATOR);
                    } else if (c16 == 2) {
                        zzfVar = (zzf) bf.b.E(parcel, readInt7, zzf.CREATOR);
                    } else if (c16 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) bf.b.E(parcel, readInt7, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c16 == 4) {
                        zzhVar = (zzh) bf.b.E(parcel, readInt7, zzh.CREATOR);
                    } else if (c16 != 5) {
                        bf.b.p0(parcel, readInt7);
                    } else {
                        str12 = bf.b.F(parcel, readInt7);
                    }
                }
                bf.b.L(parcel, r09);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, str12);
            case 8:
                int r010 = bf.b.r0(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                zzs zzsVar = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                zzz zzzVar = null;
                zzab zzabVar = null;
                zzad zzadVar = null;
                zzu zzuVar = null;
                zzag zzagVar = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                zzak zzakVar = null;
                zzaw zzawVar = null;
                zzai zzaiVar = null;
                while (parcel.dataPosition() < r010) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) bf.b.E(parcel, readInt8, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            zzsVar = (zzs) bf.b.E(parcel, readInt8, zzs.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) bf.b.E(parcel, readInt8, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            zzzVar = (zzz) bf.b.E(parcel, readInt8, zzz.CREATOR);
                            break;
                        case 6:
                            zzabVar = (zzab) bf.b.E(parcel, readInt8, zzab.CREATOR);
                            break;
                        case 7:
                            zzadVar = (zzad) bf.b.E(parcel, readInt8, zzad.CREATOR);
                            break;
                        case '\b':
                            zzuVar = (zzu) bf.b.E(parcel, readInt8, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) bf.b.E(parcel, readInt8, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) bf.b.E(parcel, readInt8, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzakVar = (zzak) bf.b.E(parcel, readInt8, zzak.CREATOR);
                            break;
                        case '\f':
                            zzawVar = (zzaw) bf.b.E(parcel, readInt8, zzaw.CREATOR);
                            break;
                        case '\r':
                            zzaiVar = (zzai) bf.b.E(parcel, readInt8, zzai.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt8);
                            break;
                    }
                }
                bf.b.L(parcel, r010);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
            case 9:
                int r011 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r011) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        bf.b.p0(parcel, readInt9);
                    } else {
                        z15 = bf.b.a0(parcel, readInt9);
                    }
                }
                bf.b.L(parcel, r011);
                return new AuthenticationExtensionsCredPropsOutputs(z15);
            case 10:
                int r012 = bf.b.r0(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < r012) {
                    int readInt10 = parcel.readInt();
                    char c17 = (char) readInt10;
                    if (c17 == 1) {
                        bArr5 = bf.b.C(parcel, readInt10);
                    } else if (c17 != 2) {
                        bf.b.p0(parcel, readInt10);
                    } else {
                        bArr6 = bf.b.C(parcel, readInt10);
                    }
                }
                bf.b.L(parcel, r012);
                return new zzf(bArr5 == null ? null : j1.l(bArr5, bArr5.length), bArr6 != null ? j1.l(bArr6, bArr6.length) : null);
            case 11:
                int r013 = bf.b.r0(parcel);
                byte[] bArr7 = null;
                while (parcel.dataPosition() < r013) {
                    int readInt11 = parcel.readInt();
                    char c18 = (char) readInt11;
                    if (c18 == 1) {
                        z14 = bf.b.a0(parcel, readInt11);
                    } else if (c18 != 2) {
                        bf.b.p0(parcel, readInt11);
                    } else {
                        bArr7 = bf.b.C(parcel, readInt11);
                    }
                }
                bf.b.L(parcel, r013);
                return new zzh(z14, bArr7 != null ? j1.l(bArr7, bArr7.length) : null);
            case 12:
                int r014 = bf.b.r0(parcel);
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                while (parcel.dataPosition() < r014) {
                    int readInt12 = parcel.readInt();
                    char c19 = (char) readInt12;
                    if (c19 == 2) {
                        bArr8 = bf.b.C(parcel, readInt12);
                    } else if (c19 == 3) {
                        bArr9 = bf.b.C(parcel, readInt12);
                    } else if (c19 == 4) {
                        bArr10 = bf.b.C(parcel, readInt12);
                    } else if (c19 == 5) {
                        bArr11 = bf.b.C(parcel, readInt12);
                    } else if (c19 != 6) {
                        bf.b.p0(parcel, readInt12);
                    } else {
                        bArr12 = bf.b.C(parcel, readInt12);
                    }
                }
                bf.b.L(parcel, r014);
                return new AuthenticatorAssertionResponse(bArr8, bArr9, bArr10, bArr11, bArr12);
            case 13:
                int r015 = bf.b.r0(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < r015) {
                    int readInt13 = parcel.readInt();
                    char c23 = (char) readInt13;
                    if (c23 == 2) {
                        bArr4 = bf.b.C(parcel, readInt13);
                    } else if (c23 == 3) {
                        bArr13 = bf.b.C(parcel, readInt13);
                    } else if (c23 == 4) {
                        bArr14 = bf.b.C(parcel, readInt13);
                    } else if (c23 != 5) {
                        bf.b.p0(parcel, readInt13);
                    } else {
                        strArr = bf.b.G(parcel, readInt13);
                    }
                }
                bf.b.L(parcel, r015);
                return new AuthenticatorAttestationResponse(bArr4, bArr13, bArr14, strArr);
            case 14:
                int r016 = bf.b.r0(parcel);
                int i19 = 0;
                while (parcel.dataPosition() < r016) {
                    int readInt14 = parcel.readInt();
                    char c24 = (char) readInt14;
                    if (c24 == 2) {
                        i17 = bf.b.h0(parcel, readInt14);
                    } else if (c24 == 3) {
                        str5 = bf.b.F(parcel, readInt14);
                    } else if (c24 != 4) {
                        bf.b.p0(parcel, readInt14);
                    } else {
                        i19 = bf.b.h0(parcel, readInt14);
                    }
                }
                bf.b.L(parcel, r016);
                return new AuthenticatorErrorResponse(i17, i19, str5);
            case 15:
                int r017 = bf.b.r0(parcel);
                String str13 = null;
                Boolean bool = null;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < r017) {
                    int readInt15 = parcel.readInt();
                    char c25 = (char) readInt15;
                    if (c25 == 2) {
                        str13 = bf.b.F(parcel, readInt15);
                    } else if (c25 == 3) {
                        int l03 = bf.b.l0(parcel, readInt15);
                        if (l03 == 0) {
                            bool = null;
                        } else {
                            bf.b.u0(parcel, l03, 4);
                            bool = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c25 == 4) {
                        str14 = bf.b.F(parcel, readInt15);
                    } else if (c25 != 5) {
                        bf.b.p0(parcel, readInt15);
                    } else {
                        str15 = bf.b.F(parcel, readInt15);
                    }
                }
                bf.b.L(parcel, r017);
                return new AuthenticatorSelectionCriteria(str13, str14, str15, bool);
            case 16:
                int r018 = bf.b.r0(parcel);
                Uri uri = null;
                byte[] bArr15 = null;
                while (parcel.dataPosition() < r018) {
                    int readInt16 = parcel.readInt();
                    char c26 = (char) readInt16;
                    if (c26 == 2) {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) bf.b.E(parcel, readInt16, PublicKeyCredentialCreationOptions.CREATOR);
                    } else if (c26 == 3) {
                        uri = (Uri) bf.b.E(parcel, readInt16, Uri.CREATOR);
                    } else if (c26 != 4) {
                        bf.b.p0(parcel, readInt16);
                    } else {
                        bArr15 = bf.b.C(parcel, readInt16);
                    }
                }
                bf.b.L(parcel, r018);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr15);
            case 17:
                int r019 = bf.b.r0(parcel);
                Uri uri2 = null;
                byte[] bArr16 = null;
                while (parcel.dataPosition() < r019) {
                    int readInt17 = parcel.readInt();
                    char c27 = (char) readInt17;
                    if (c27 == 2) {
                        publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) bf.b.E(parcel, readInt17, PublicKeyCredentialRequestOptions.CREATOR);
                    } else if (c27 == 3) {
                        uri2 = (Uri) bf.b.E(parcel, readInt17, Uri.CREATOR);
                    } else if (c27 != 4) {
                        bf.b.p0(parcel, readInt17);
                    } else {
                        bArr16 = bf.b.C(parcel, readInt17);
                    }
                }
                bf.b.L(parcel, r019);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri2, bArr16);
            case 18:
                int r020 = bf.b.r0(parcel);
                long j13 = 0;
                byte[] bArr17 = null;
                byte[] bArr18 = null;
                byte[] bArr19 = null;
                while (parcel.dataPosition() < r020) {
                    int readInt18 = parcel.readInt();
                    char c28 = (char) readInt18;
                    if (c28 == 1) {
                        j13 = bf.b.j0(parcel, readInt18);
                    } else if (c28 == 2) {
                        bArr17 = bf.b.C(parcel, readInt18);
                    } else if (c28 == 3) {
                        bArr18 = bf.b.C(parcel, readInt18);
                    } else if (c28 != 4) {
                        bf.b.p0(parcel, readInt18);
                    } else {
                        bArr19 = bf.b.C(parcel, readInt18);
                    }
                }
                bf.b.L(parcel, r020);
                return new zzq(j13, bArr17, bArr18, bArr19);
            case 19:
                int r021 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r021) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        bf.b.p0(parcel, readInt19);
                    } else {
                        arrayList = bf.b.J(parcel, readInt19, zzq.CREATOR);
                    }
                }
                bf.b.L(parcel, r021);
                return new zzs(arrayList);
            case 20:
                int r022 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r022) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        bf.b.p0(parcel, readInt20);
                    } else {
                        bf.b.a0(parcel, readInt20);
                    }
                }
                bf.b.L(parcel, r022);
                return new zzu();
            case 21:
                int r023 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r023) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        bf.b.p0(parcel, readInt21);
                    } else {
                        str4 = bf.b.F(parcel, readInt21);
                    }
                }
                bf.b.L(parcel, r023);
                return new FidoAppIdExtension(str4);
            case 22:
                int r024 = bf.b.r0(parcel);
                long j14 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                String str16 = null;
                String str17 = null;
                byte[] bArr20 = null;
                byte[] bArr21 = null;
                Account account = null;
                while (parcel.dataPosition() < r024) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            str16 = bf.b.F(parcel, readInt22);
                            break;
                        case 2:
                            str17 = bf.b.F(parcel, readInt22);
                            break;
                        case 3:
                            bArr20 = bf.b.C(parcel, readInt22);
                            break;
                        case 4:
                            bArr21 = bf.b.C(parcel, readInt22);
                            break;
                        case 5:
                            z16 = bf.b.a0(parcel, readInt22);
                            break;
                        case 6:
                            z17 = bf.b.a0(parcel, readInt22);
                            break;
                        case 7:
                            j14 = bf.b.j0(parcel, readInt22);
                            break;
                        case '\b':
                            account = (Account) bf.b.E(parcel, readInt22, Account.CREATOR);
                            break;
                        case '\t':
                            z18 = bf.b.a0(parcel, readInt22);
                            break;
                        default:
                            bf.b.p0(parcel, readInt22);
                            break;
                    }
                }
                bf.b.L(parcel, r024);
                return new FidoCredentialDetails(str16, str17, bArr20, bArr21, z16, z17, j14, account, z18);
            case 23:
                int r025 = bf.b.r0(parcel);
                String str18 = null;
                while (parcel.dataPosition() < r025) {
                    int readInt23 = parcel.readInt();
                    char c29 = (char) readInt23;
                    if (c29 == 2) {
                        i16 = bf.b.h0(parcel, readInt23);
                    } else if (c29 == 3) {
                        str3 = bf.b.F(parcel, readInt23);
                    } else if (c29 != 4) {
                        bf.b.p0(parcel, readInt23);
                    } else {
                        str18 = bf.b.F(parcel, readInt23);
                    }
                }
                bf.b.L(parcel, r025);
                return new ChannelIdValue(i16, str3, str18);
            case 24:
                return ErrorCode.toErrorCode(parcel.readInt());
            case 25:
                int r026 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r026) {
                    int readInt24 = parcel.readInt();
                    char c33 = (char) readInt24;
                    if (c33 == 2) {
                        i15 = bf.b.h0(parcel, readInt24);
                    } else if (c33 != 3) {
                        bf.b.p0(parcel, readInt24);
                    } else {
                        str2 = bf.b.F(parcel, readInt24);
                    }
                }
                bf.b.L(parcel, r026);
                return new ErrorResponseData(i15, str2);
            case 26:
                int r027 = bf.b.r0(parcel);
                String str19 = null;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < r027) {
                    int readInt25 = parcel.readInt();
                    char c34 = (char) readInt25;
                    if (c34 == 1) {
                        i14 = bf.b.h0(parcel, readInt25);
                    } else if (c34 == 2) {
                        bArr3 = bf.b.C(parcel, readInt25);
                    } else if (c34 == 3) {
                        str19 = bf.b.F(parcel, readInt25);
                    } else if (c34 != 4) {
                        bf.b.p0(parcel, readInt25);
                    } else {
                        arrayList3 = bf.b.J(parcel, readInt25, Transport.CREATOR);
                    }
                }
                bf.b.L(parcel, r027);
                return new KeyHandle(i14, bArr3, str19, arrayList3);
            case 27:
                int r028 = bf.b.r0(parcel);
                byte[] bArr22 = null;
                String str20 = null;
                while (parcel.dataPosition() < r028) {
                    int readInt26 = parcel.readInt();
                    char c35 = (char) readInt26;
                    if (c35 == 1) {
                        i13 = bf.b.h0(parcel, readInt26);
                    } else if (c35 == 2) {
                        str = bf.b.F(parcel, readInt26);
                    } else if (c35 == 3) {
                        bArr22 = bf.b.C(parcel, readInt26);
                    } else if (c35 != 4) {
                        bf.b.p0(parcel, readInt26);
                    } else {
                        str20 = bf.b.F(parcel, readInt26);
                    }
                }
                bf.b.L(parcel, r028);
                return new RegisterRequest(i13, str, str20, bArr22);
            case 28:
                int r029 = bf.b.r0(parcel);
                Integer num = null;
                Double d2 = null;
                Uri uri3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ChannelIdValue channelIdValue = null;
                String str21 = null;
                while (parcel.dataPosition() < r029) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            num = bf.b.i0(parcel, readInt27);
                            break;
                        case 3:
                            d2 = bf.b.d0(parcel, readInt27);
                            break;
                        case 4:
                            uri3 = (Uri) bf.b.E(parcel, readInt27, Uri.CREATOR);
                            break;
                        case 5:
                            arrayList4 = bf.b.J(parcel, readInt27, RegisterRequest.CREATOR);
                            break;
                        case 6:
                            arrayList5 = bf.b.J(parcel, readInt27, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) bf.b.E(parcel, readInt27, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            str21 = bf.b.F(parcel, readInt27);
                            break;
                        default:
                            bf.b.p0(parcel, readInt27);
                            break;
                    }
                }
                bf.b.L(parcel, r029);
                return new RegisterRequestParams(num, d2, uri3, arrayList4, arrayList5, channelIdValue, str21);
            default:
                int r030 = bf.b.r0(parcel);
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < r030) {
                    int readInt28 = parcel.readInt();
                    char c36 = (char) readInt28;
                    if (c36 == 2) {
                        bArr2 = bf.b.C(parcel, readInt28);
                    } else if (c36 == 3) {
                        str22 = bf.b.F(parcel, readInt28);
                    } else if (c36 != 4) {
                        bf.b.p0(parcel, readInt28);
                    } else {
                        str23 = bf.b.F(parcel, readInt28);
                    }
                }
                bf.b.L(parcel, r030);
                return new RegisterResponseData(bArr2, str22, str23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f125830a) {
            case 0:
                return new PublicKeyCredentialUserEntity[i13];
            case 1:
                return new zzaw[i13];
            case 2:
                return new TokenBinding[i13];
            case 3:
                return new UserVerificationMethodExtension[i13];
            case 4:
                return new UserVerificationRequirement[i13];
            case 5:
                return new UvmEntries[i13];
            case 6:
                return new UvmEntry[i13];
            case 7:
                return new AuthenticationExtensionsClientOutputs[i13];
            case 8:
                return new AuthenticationExtensions[i13];
            case 9:
                return new AuthenticationExtensionsCredPropsOutputs[i13];
            case 10:
                return new zzf[i13];
            case 11:
                return new zzh[i13];
            case 12:
                return new AuthenticatorAssertionResponse[i13];
            case 13:
                return new AuthenticatorAttestationResponse[i13];
            case 14:
                return new AuthenticatorErrorResponse[i13];
            case 15:
                return new AuthenticatorSelectionCriteria[i13];
            case 16:
                return new BrowserPublicKeyCredentialCreationOptions[i13];
            case 17:
                return new BrowserPublicKeyCredentialRequestOptions[i13];
            case 18:
                return new zzq[i13];
            case 19:
                return new zzs[i13];
            case 20:
                return new zzu[i13];
            case 21:
                return new FidoAppIdExtension[i13];
            case 22:
                return new FidoCredentialDetails[i13];
            case 23:
                return new ChannelIdValue[i13];
            case 24:
                return new ErrorCode[i13];
            case 25:
                return new ErrorResponseData[i13];
            case 26:
                return new KeyHandle[i13];
            case 27:
                return new RegisterRequest[i13];
            case 28:
                return new RegisterRequestParams[i13];
            default:
                return new RegisterResponseData[i13];
        }
    }
}
