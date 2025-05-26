package dh;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.common.internal.zzak;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f54970a;

    public /* synthetic */ b(int i13) {
        this.f54970a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i13 = 0;
        SignInPassword signInPassword = null;
        Scope[] scopeArr = null;
        Account account = null;
        ArrayList arrayList = null;
        String str = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str2 = null;
        Intent intent = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        PendingIntent pendingIntent = null;
        switch (this.f54970a) {
            case 0:
                int r03 = bf.b.r0(parcel);
                String str6 = null;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    char c13 = (char) readInt;
                    if (c13 == 1) {
                        signInPassword = (SignInPassword) bf.b.E(parcel, readInt, SignInPassword.CREATOR);
                    } else if (c13 == 2) {
                        str6 = bf.b.F(parcel, readInt);
                    } else if (c13 != 3) {
                        bf.b.p0(parcel, readInt);
                    } else {
                        i13 = bf.b.h0(parcel, readInt);
                    }
                }
                bf.b.L(parcel, r03);
                return new SavePasswordRequest(signInPassword, str6, i13);
            case 1:
                int r04 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r04) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        bf.b.p0(parcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) bf.b.E(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                bf.b.L(parcel, r04);
                return new SavePasswordResult(pendingIntent);
            case 2:
                int r05 = bf.b.r0(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri2 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < r05) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            str7 = bf.b.F(parcel, readInt3);
                            break;
                        case 2:
                            str8 = bf.b.F(parcel, readInt3);
                            break;
                        case 3:
                            str9 = bf.b.F(parcel, readInt3);
                            break;
                        case 4:
                            str10 = bf.b.F(parcel, readInt3);
                            break;
                        case 5:
                            uri2 = (Uri) bf.b.E(parcel, readInt3, Uri.CREATOR);
                            break;
                        case 6:
                            str11 = bf.b.F(parcel, readInt3);
                            break;
                        case 7:
                            str12 = bf.b.F(parcel, readInt3);
                            break;
                        case '\b':
                            str13 = bf.b.F(parcel, readInt3);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) bf.b.E(parcel, readInt3, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt3);
                            break;
                    }
                }
                bf.b.L(parcel, r05);
                return new SignInCredential(str7, str8, str9, str10, uri2, str11, str12, str13, publicKeyCredential);
            case 3:
                int r06 = bf.b.r0(parcel);
                String str14 = null;
                while (parcel.dataPosition() < r06) {
                    int readInt4 = parcel.readInt();
                    char c14 = (char) readInt4;
                    if (c14 == 1) {
                        str5 = bf.b.F(parcel, readInt4);
                    } else if (c14 != 2) {
                        bf.b.p0(parcel, readInt4);
                    } else {
                        str14 = bf.b.F(parcel, readInt4);
                    }
                }
                bf.b.L(parcel, r06);
                return new SignInPassword(str5, str14);
            case 4:
                int r07 = bf.b.r0(parcel);
                long j13 = 0;
                int i14 = 0;
                int i15 = 0;
                String str15 = null;
                byte[] bArr = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < r07) {
                    int readInt5 = parcel.readInt();
                    char c15 = (char) readInt5;
                    if (c15 == 1) {
                        str15 = bf.b.F(parcel, readInt5);
                    } else if (c15 == 2) {
                        i15 = bf.b.h0(parcel, readInt5);
                    } else if (c15 == 3) {
                        j13 = bf.b.j0(parcel, readInt5);
                    } else if (c15 == 4) {
                        bArr = bf.b.C(parcel, readInt5);
                    } else if (c15 == 5) {
                        bundle2 = bf.b.B(parcel, readInt5);
                    } else if (c15 != 1000) {
                        bf.b.p0(parcel, readInt5);
                    } else {
                        i14 = bf.b.h0(parcel, readInt5);
                    }
                }
                bf.b.L(parcel, r07);
                return new ProxyRequest(i14, str15, i15, j13, bArr, bundle2);
            case 5:
                int r08 = bf.b.r0(parcel);
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                PendingIntent pendingIntent2 = null;
                Bundle bundle3 = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < r08) {
                    int readInt6 = parcel.readInt();
                    char c16 = (char) readInt6;
                    if (c16 == 1) {
                        i17 = bf.b.h0(parcel, readInt6);
                    } else if (c16 == 2) {
                        pendingIntent2 = (PendingIntent) bf.b.E(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c16 == 3) {
                        i18 = bf.b.h0(parcel, readInt6);
                    } else if (c16 == 4) {
                        bundle3 = bf.b.B(parcel, readInt6);
                    } else if (c16 == 5) {
                        bArr2 = bf.b.C(parcel, readInt6);
                    } else if (c16 != 1000) {
                        bf.b.p0(parcel, readInt6);
                    } else {
                        i16 = bf.b.h0(parcel, readInt6);
                    }
                }
                bf.b.L(parcel, r08);
                return new ProxyResponse(i16, i17, pendingIntent2, i18, bundle3, bArr2);
            case 6:
                int r09 = bf.b.r0(parcel);
                int i19 = 0;
                while (parcel.dataPosition() < r09) {
                    int readInt7 = parcel.readInt();
                    char c17 = (char) readInt7;
                    if (c17 == 1) {
                        i13 = bf.b.h0(parcel, readInt7);
                    } else if (c17 == 2) {
                        i19 = bf.b.h0(parcel, readInt7);
                    } else if (c17 != 3) {
                        bf.b.p0(parcel, readInt7);
                    } else {
                        bundle = bf.b.B(parcel, readInt7);
                    }
                }
                bf.b.L(parcel, r09);
                return new GoogleSignInOptionsExtensionParcelable(i13, i19, bundle);
            case 7:
                int r010 = bf.b.r0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < r010) {
                    int readInt8 = parcel.readInt();
                    char c18 = (char) readInt8;
                    if (c18 == 2) {
                        str4 = bf.b.F(parcel, readInt8);
                    } else if (c18 != 5) {
                        bf.b.p0(parcel, readInt8);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) bf.b.E(parcel, readInt8, GoogleSignInOptions.CREATOR);
                    }
                }
                bf.b.L(parcel, r010);
                return new SignInConfiguration(str4, googleSignInOptions);
            case 8:
                int r011 = bf.b.r0(parcel);
                long j14 = 0;
                int i23 = 0;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                Uri uri3 = null;
                String str20 = null;
                String str21 = null;
                ArrayList arrayList4 = null;
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < r011) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i23 = bf.b.h0(parcel, readInt9);
                            break;
                        case 2:
                            str16 = bf.b.F(parcel, readInt9);
                            break;
                        case 3:
                            str17 = bf.b.F(parcel, readInt9);
                            break;
                        case 4:
                            str18 = bf.b.F(parcel, readInt9);
                            break;
                        case 5:
                            str19 = bf.b.F(parcel, readInt9);
                            break;
                        case 6:
                            uri3 = (Uri) bf.b.E(parcel, readInt9, Uri.CREATOR);
                            break;
                        case 7:
                            str20 = bf.b.F(parcel, readInt9);
                            break;
                        case '\b':
                            j14 = bf.b.j0(parcel, readInt9);
                            break;
                        case '\t':
                            str21 = bf.b.F(parcel, readInt9);
                            break;
                        case '\n':
                            arrayList4 = bf.b.J(parcel, readInt9, Scope.CREATOR);
                            break;
                        case 11:
                            str22 = bf.b.F(parcel, readInt9);
                            break;
                        case '\f':
                            str23 = bf.b.F(parcel, readInt9);
                            break;
                        default:
                            bf.b.p0(parcel, readInt9);
                            break;
                    }
                }
                bf.b.L(parcel, r011);
                return new GoogleSignInAccount(i23, str16, str17, str18, str19, uri3, str20, j14, str21, arrayList4, str22, str23);
            case 9:
                int r012 = bf.b.r0(parcel);
                int i24 = 0;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                ArrayList arrayList5 = null;
                Account account2 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < r012) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i24 = bf.b.h0(parcel, readInt10);
                            break;
                        case 2:
                            arrayList5 = bf.b.J(parcel, readInt10, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) bf.b.E(parcel, readInt10, Account.CREATOR);
                            break;
                        case 4:
                            z13 = bf.b.a0(parcel, readInt10);
                            break;
                        case 5:
                            z14 = bf.b.a0(parcel, readInt10);
                            break;
                        case 6:
                            z15 = bf.b.a0(parcel, readInt10);
                            break;
                        case 7:
                            str24 = bf.b.F(parcel, readInt10);
                            break;
                        case '\b':
                            str25 = bf.b.F(parcel, readInt10);
                            break;
                        case '\t':
                            arrayList3 = bf.b.J(parcel, readInt10, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            str26 = bf.b.F(parcel, readInt10);
                            break;
                        default:
                            bf.b.p0(parcel, readInt10);
                            break;
                    }
                }
                bf.b.L(parcel, r012);
                return new GoogleSignInOptions(i24, arrayList5, account2, z13, z14, z15, str24, str25, GoogleSignInOptions.f(arrayList3), str26);
            case 10:
                int r013 = bf.b.r0(parcel);
                String str27 = "";
                String str28 = "";
                while (parcel.dataPosition() < r013) {
                    int readInt11 = parcel.readInt();
                    char c19 = (char) readInt11;
                    if (c19 == 4) {
                        str27 = bf.b.F(parcel, readInt11);
                    } else if (c19 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) bf.b.E(parcel, readInt11, GoogleSignInAccount.CREATOR);
                    } else if (c19 != '\b') {
                        bf.b.p0(parcel, readInt11);
                    } else {
                        str28 = bf.b.F(parcel, readInt11);
                    }
                }
                bf.b.L(parcel, r013);
                return new SignInAccount(str27, googleSignInAccount, str28);
            case 11:
                int r014 = bf.b.r0(parcel);
                long j15 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                String str29 = null;
                String str30 = null;
                while (parcel.dataPosition() < r014) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i25 = bf.b.h0(parcel, readInt12);
                            break;
                        case 2:
                            j15 = bf.b.j0(parcel, readInt12);
                            break;
                        case 3:
                            str29 = bf.b.F(parcel, readInt12);
                            break;
                        case 4:
                            i26 = bf.b.h0(parcel, readInt12);
                            break;
                        case 5:
                            i27 = bf.b.h0(parcel, readInt12);
                            break;
                        case 6:
                            str30 = bf.b.F(parcel, readInt12);
                            break;
                        default:
                            bf.b.p0(parcel, readInt12);
                            break;
                    }
                }
                bf.b.L(parcel, r014);
                return new AccountChangeEvent(i25, j15, str29, i26, i27, str30);
            case 12:
                int r015 = bf.b.r0(parcel);
                int i28 = 0;
                Account account3 = null;
                while (parcel.dataPosition() < r015) {
                    int readInt13 = parcel.readInt();
                    char c23 = (char) readInt13;
                    if (c23 == 1) {
                        i13 = bf.b.h0(parcel, readInt13);
                    } else if (c23 == 2) {
                        i28 = bf.b.h0(parcel, readInt13);
                    } else if (c23 == 3) {
                        str3 = bf.b.F(parcel, readInt13);
                    } else if (c23 != 4) {
                        bf.b.p0(parcel, readInt13);
                    } else {
                        account3 = (Account) bf.b.E(parcel, readInt13, Account.CREATOR);
                    }
                }
                bf.b.L(parcel, r015);
                return new AccountChangeEventsRequest(i13, i28, str3, account3);
            case 13:
                int r016 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r016) {
                    int readInt14 = parcel.readInt();
                    char c24 = (char) readInt14;
                    if (c24 == 1) {
                        i13 = bf.b.h0(parcel, readInt14);
                    } else if (c24 != 2) {
                        bf.b.p0(parcel, readInt14);
                    } else {
                        arrayList2 = bf.b.J(parcel, readInt14, AccountChangeEvent.CREATOR);
                    }
                }
                bf.b.L(parcel, r016);
                return new AccountChangeEventsResponse(i13, arrayList2);
            case 14:
                int r017 = bf.b.r0(parcel);
                int i29 = 0;
                boolean z16 = false;
                boolean z17 = false;
                String str31 = null;
                Long l13 = null;
                ArrayList arrayList6 = null;
                String str32 = null;
                while (parcel.dataPosition() < r017) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            i29 = bf.b.h0(parcel, readInt15);
                            break;
                        case 2:
                            str31 = bf.b.F(parcel, readInt15);
                            break;
                        case 3:
                            l13 = bf.b.k0(parcel, readInt15);
                            break;
                        case 4:
                            z16 = bf.b.a0(parcel, readInt15);
                            break;
                        case 5:
                            z17 = bf.b.a0(parcel, readInt15);
                            break;
                        case 6:
                            arrayList6 = bf.b.H(parcel, readInt15);
                            break;
                        case 7:
                            str32 = bf.b.F(parcel, readInt15);
                            break;
                        default:
                            bf.b.p0(parcel, readInt15);
                            break;
                    }
                }
                bf.b.L(parcel, r017);
                return new TokenData(i29, str31, l13, z16, z17, arrayList6, str32);
            case 15:
                int r018 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r018) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        bf.b.p0(parcel, readInt16);
                    } else {
                        intent = (Intent) bf.b.E(parcel, readInt16, Intent.CREATOR);
                    }
                }
                bf.b.L(parcel, r018);
                return new CloudMessage(intent);
            case 16:
                return new zzd(parcel.readStrongBinder());
            case 17:
                int r019 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r019) {
                    int readInt17 = parcel.readInt();
                    char c25 = (char) readInt17;
                    if (c25 == 1) {
                        i13 = bf.b.h0(parcel, readInt17);
                    } else if (c25 != 2) {
                        bf.b.p0(parcel, readInt17);
                    } else {
                        str2 = bf.b.F(parcel, readInt17);
                    }
                }
                bf.b.L(parcel, r019);
                return new Scope(i13, str2);
            case 18:
                int r020 = bf.b.r0(parcel);
                int i33 = 0;
                while (parcel.dataPosition() < r020) {
                    int readInt18 = parcel.readInt();
                    char c26 = (char) readInt18;
                    if (c26 == 1) {
                        i13 = bf.b.h0(parcel, readInt18);
                    } else if (c26 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) bf.b.E(parcel, readInt18, ParcelFileDescriptor.CREATOR);
                    } else if (c26 != 3) {
                        bf.b.p0(parcel, readInt18);
                    } else {
                        i33 = bf.b.h0(parcel, readInt18);
                    }
                }
                bf.b.L(parcel, r020);
                return new BitmapTeleporter(i13, parcelFileDescriptor, i33);
            case 19:
                int r021 = bf.b.r0(parcel);
                int i34 = 0;
                int i35 = 0;
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < r021) {
                    int readInt19 = parcel.readInt();
                    char c27 = (char) readInt19;
                    if (c27 == 1) {
                        strArr = bf.b.G(parcel, readInt19);
                    } else if (c27 == 2) {
                        cursorWindowArr = (CursorWindow[]) bf.b.I(parcel, readInt19, CursorWindow.CREATOR);
                    } else if (c27 == 3) {
                        i35 = bf.b.h0(parcel, readInt19);
                    } else if (c27 == 4) {
                        bundle4 = bf.b.B(parcel, readInt19);
                    } else if (c27 != 1000) {
                        bf.b.p0(parcel, readInt19);
                    } else {
                        i34 = bf.b.h0(parcel, readInt19);
                    }
                }
                bf.b.L(parcel, r021);
                DataHolder dataHolder = new DataHolder(i34, strArr, cursorWindowArr, i35, bundle4);
                dataHolder.f30921h = new Bundle();
                int i36 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.f30920g;
                    if (i36 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.f30922i;
                        dataHolder.f30925l = new int[cursorWindowArr2.length];
                        int i37 = 0;
                        while (i13 < cursorWindowArr2.length) {
                            dataHolder.f30925l[i13] = i37;
                            i37 += cursorWindowArr2[i13].getNumRows() - (i37 - cursorWindowArr2[i13].getStartPosition());
                            i13++;
                        }
                        return dataHolder;
                    }
                    dataHolder.f30921h.putInt(strArr2[i36], i36);
                    i36++;
                }
            case 20:
                int r022 = bf.b.r0(parcel);
                int i38 = 0;
                int i39 = 0;
                while (parcel.dataPosition() < r022) {
                    int readInt20 = parcel.readInt();
                    char c28 = (char) readInt20;
                    if (c28 == 1) {
                        i13 = bf.b.h0(parcel, readInt20);
                    } else if (c28 == 2) {
                        uri = (Uri) bf.b.E(parcel, readInt20, Uri.CREATOR);
                    } else if (c28 == 3) {
                        i38 = bf.b.h0(parcel, readInt20);
                    } else if (c28 != 4) {
                        bf.b.p0(parcel, readInt20);
                    } else {
                        i39 = bf.b.h0(parcel, readInt20);
                    }
                }
                bf.b.L(parcel, r022);
                return new WebImage(i13, uri, i38, i39);
            case 21:
                int r023 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r023) {
                    int readInt21 = parcel.readInt();
                    char c29 = (char) readInt21;
                    if (c29 == 1) {
                        i13 = bf.b.h0(parcel, readInt21);
                    } else if (c29 != 2) {
                        bf.b.p0(parcel, readInt21);
                    } else {
                        str = bf.b.F(parcel, readInt21);
                    }
                }
                bf.b.L(parcel, r023);
                return new ClientIdentity(i13, str);
            case 22:
                int r024 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r024) {
                    int readInt22 = parcel.readInt();
                    char c33 = (char) readInt22;
                    if (c33 == 1) {
                        i13 = bf.b.h0(parcel, readInt22);
                    } else if (c33 != 2) {
                        bf.b.p0(parcel, readInt22);
                    } else {
                        arrayList = bf.b.J(parcel, readInt22, MethodInvocation.CREATOR);
                    }
                }
                bf.b.L(parcel, r024);
                return new TelemetryData(i13, arrayList);
            case 23:
                int r025 = bf.b.r0(parcel);
                int i43 = -1;
                long j16 = 0;
                long j17 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < r025) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            i44 = bf.b.h0(parcel, readInt23);
                            break;
                        case 2:
                            i45 = bf.b.h0(parcel, readInt23);
                            break;
                        case 3:
                            i46 = bf.b.h0(parcel, readInt23);
                            break;
                        case 4:
                            j16 = bf.b.j0(parcel, readInt23);
                            break;
                        case 5:
                            j17 = bf.b.j0(parcel, readInt23);
                            break;
                        case 6:
                            str33 = bf.b.F(parcel, readInt23);
                            break;
                        case 7:
                            str34 = bf.b.F(parcel, readInt23);
                            break;
                        case '\b':
                            i47 = bf.b.h0(parcel, readInt23);
                            break;
                        case '\t':
                            i43 = bf.b.h0(parcel, readInt23);
                            break;
                        default:
                            bf.b.p0(parcel, readInt23);
                            break;
                    }
                }
                bf.b.L(parcel, r025);
                return new MethodInvocation(i44, i45, i46, j16, j17, str33, str34, i47, i43);
            case 24:
                int r026 = bf.b.r0(parcel);
                int i48 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < r026) {
                    int readInt24 = parcel.readInt();
                    char c34 = (char) readInt24;
                    if (c34 == 1) {
                        i13 = bf.b.h0(parcel, readInt24);
                    } else if (c34 == 2) {
                        account = (Account) bf.b.E(parcel, readInt24, Account.CREATOR);
                    } else if (c34 == 3) {
                        i48 = bf.b.h0(parcel, readInt24);
                    } else if (c34 != 4) {
                        bf.b.p0(parcel, readInt24);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) bf.b.E(parcel, readInt24, GoogleSignInAccount.CREATOR);
                    }
                }
                bf.b.L(parcel, r026);
                return new zat(i13, account, i48, googleSignInAccount2);
            case 25:
                int r027 = bf.b.r0(parcel);
                int i49 = 0;
                boolean z18 = false;
                boolean z19 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < r027) {
                    int readInt25 = parcel.readInt();
                    char c35 = (char) readInt25;
                    if (c35 == 1) {
                        i49 = bf.b.h0(parcel, readInt25);
                    } else if (c35 == 2) {
                        iBinder = bf.b.g0(parcel, readInt25);
                    } else if (c35 == 3) {
                        connectionResult = (ConnectionResult) bf.b.E(parcel, readInt25, ConnectionResult.CREATOR);
                    } else if (c35 == 4) {
                        z18 = bf.b.a0(parcel, readInt25);
                    } else if (c35 != 5) {
                        bf.b.p0(parcel, readInt25);
                    } else {
                        z19 = bf.b.a0(parcel, readInt25);
                    }
                }
                bf.b.L(parcel, r027);
                return new zav(i49, iBinder, connectionResult, z18, z19);
            case 26:
                int r028 = bf.b.r0(parcel);
                int i53 = 0;
                int i54 = 0;
                while (parcel.dataPosition() < r028) {
                    int readInt26 = parcel.readInt();
                    char c36 = (char) readInt26;
                    if (c36 == 1) {
                        i13 = bf.b.h0(parcel, readInt26);
                    } else if (c36 == 2) {
                        i53 = bf.b.h0(parcel, readInt26);
                    } else if (c36 == 3) {
                        i54 = bf.b.h0(parcel, readInt26);
                    } else if (c36 != 4) {
                        bf.b.p0(parcel, readInt26);
                    } else {
                        scopeArr = (Scope[]) bf.b.I(parcel, readInt26, Scope.CREATOR);
                    }
                }
                bf.b.L(parcel, r028);
                return new zax(i13, i53, i54, scopeArr);
            case 27:
                int r029 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r029) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        bf.b.p0(parcel, readInt27);
                    } else {
                        i13 = bf.b.h0(parcel, readInt27);
                    }
                }
                bf.b.L(parcel, r029);
                return new zzak(i13);
            case 28:
                return new BinderWrapper(parcel);
            default:
                int r030 = bf.b.r0(parcel);
                boolean z23 = false;
                boolean z24 = false;
                int i55 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < r030) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) bf.b.E(parcel, readInt28, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            z23 = bf.b.a0(parcel, readInt28);
                            break;
                        case 3:
                            z24 = bf.b.a0(parcel, readInt28);
                            break;
                        case 4:
                            iArr = bf.b.D(parcel, readInt28);
                            break;
                        case 5:
                            i55 = bf.b.h0(parcel, readInt28);
                            break;
                        case 6:
                            iArr2 = bf.b.D(parcel, readInt28);
                            break;
                        default:
                            bf.b.p0(parcel, readInt28);
                            break;
                    }
                }
                bf.b.L(parcel, r030);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z23, z24, iArr, i55, iArr2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f54970a) {
            case 0:
                return new SavePasswordRequest[i13];
            case 1:
                return new SavePasswordResult[i13];
            case 2:
                return new SignInCredential[i13];
            case 3:
                return new SignInPassword[i13];
            case 4:
                return new ProxyRequest[i13];
            case 5:
                return new ProxyResponse[i13];
            case 6:
                return new GoogleSignInOptionsExtensionParcelable[i13];
            case 7:
                return new SignInConfiguration[i13];
            case 8:
                return new GoogleSignInAccount[i13];
            case 9:
                return new GoogleSignInOptions[i13];
            case 10:
                return new SignInAccount[i13];
            case 11:
                return new AccountChangeEvent[i13];
            case 12:
                return new AccountChangeEventsRequest[i13];
            case 13:
                return new AccountChangeEventsResponse[i13];
            case 14:
                return new TokenData[i13];
            case 15:
                return new CloudMessage[i13];
            case 16:
                return new zzd[i13];
            case 17:
                return new Scope[i13];
            case 18:
                return new BitmapTeleporter[i13];
            case 19:
                return new DataHolder[i13];
            case 20:
                return new WebImage[i13];
            case 21:
                return new ClientIdentity[i13];
            case 22:
                return new TelemetryData[i13];
            case 23:
                return new MethodInvocation[i13];
            case 24:
                return new zat[i13];
            case 25:
                return new zav[i13];
            case 26:
                return new zax[i13];
            case 27:
                return new zzak[i13];
            case 28:
                return new BinderWrapper[i13];
            default:
                return new ConnectionTelemetryConfiguration[i13];
        }
    }
}
