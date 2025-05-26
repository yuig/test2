package oi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.firebase.messaging.RemoteMessage;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineGroup;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.activity.interest.model.InterestFeatureLocation;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.adPreview.screen.AdPreviewLocation;
import com.pinterest.ads.screen.AdsLocation;
import com.pinterest.adsCollageHeroCutout.screen.CollageHeroCutoutLocation;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e7 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94742a;

    public /* synthetic */ e7(int i13) {
        this.f94742a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in3) {
        int i13 = 0;
        Intent intent = null;
        Bundle bundle = null;
        ConnectionResult connectionResult = null;
        zat zatVar = null;
        ArrayList arrayList = null;
        switch (this.f94742a) {
            case 0:
                int r03 = bf.b.r0(in3);
                long j13 = 0;
                int i14 = 0;
                String str = null;
                Long l13 = null;
                Float f13 = null;
                String str2 = null;
                String str3 = null;
                Double d2 = null;
                while (in3.dataPosition() < r03) {
                    int readInt = in3.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i14 = bf.b.h0(in3, readInt);
                            break;
                        case 2:
                            str = bf.b.F(in3, readInt);
                            break;
                        case 3:
                            j13 = bf.b.j0(in3, readInt);
                            break;
                        case 4:
                            l13 = bf.b.k0(in3, readInt);
                            break;
                        case 5:
                            f13 = bf.b.f0(in3, readInt);
                            break;
                        case 6:
                            str2 = bf.b.F(in3, readInt);
                            break;
                        case 7:
                            str3 = bf.b.F(in3, readInt);
                            break;
                        case '\b':
                            d2 = bf.b.d0(in3, readInt);
                            break;
                        default:
                            bf.b.p0(in3, readInt);
                            break;
                    }
                }
                bf.b.L(in3, r03);
                return new zznc(i14, str, j13, l13, f13, str2, str3, d2);
            case 1:
                int r04 = bf.b.r0(in3);
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                long j19 = 0;
                long j23 = 0;
                long j24 = -2147483648L;
                boolean z13 = true;
                boolean z14 = true;
                boolean z15 = false;
                int i15 = 0;
                boolean z16 = false;
                boolean z17 = false;
                int i16 = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Boolean bool = null;
                ArrayList arrayList2 = null;
                String str11 = null;
                String str12 = null;
                String str13 = "";
                String str14 = str13;
                String str15 = str14;
                int i17 = 100;
                while (in3.dataPosition() < r04) {
                    int readInt2 = in3.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str4 = bf.b.F(in3, readInt2);
                            break;
                        case 3:
                            str5 = bf.b.F(in3, readInt2);
                            break;
                        case 4:
                            str6 = bf.b.F(in3, readInt2);
                            break;
                        case 5:
                            str7 = bf.b.F(in3, readInt2);
                            break;
                        case 6:
                            j14 = bf.b.j0(in3, readInt2);
                            break;
                        case 7:
                            j15 = bf.b.j0(in3, readInt2);
                            break;
                        case '\b':
                            str8 = bf.b.F(in3, readInt2);
                            break;
                        case '\t':
                            z13 = bf.b.a0(in3, readInt2);
                            break;
                        case '\n':
                            z15 = bf.b.a0(in3, readInt2);
                            break;
                        case 11:
                            j24 = bf.b.j0(in3, readInt2);
                            break;
                        case '\f':
                            str9 = bf.b.F(in3, readInt2);
                            break;
                        case '\r':
                            j16 = bf.b.j0(in3, readInt2);
                            break;
                        case 14:
                            j17 = bf.b.j0(in3, readInt2);
                            break;
                        case 15:
                            i15 = bf.b.h0(in3, readInt2);
                            break;
                        case 16:
                            z14 = bf.b.a0(in3, readInt2);
                            break;
                        case 17:
                        case 20:
                        case '!':
                        default:
                            bf.b.p0(in3, readInt2);
                            break;
                        case 18:
                            z16 = bf.b.a0(in3, readInt2);
                            break;
                        case 19:
                            str10 = bf.b.F(in3, readInt2);
                            break;
                        case 21:
                            int l03 = bf.b.l0(in3, readInt2);
                            if (l03 != 0) {
                                bf.b.u0(in3, l03, 4);
                                bool = Boolean.valueOf(in3.readInt() != 0);
                                break;
                            } else {
                                bool = null;
                                break;
                            }
                        case 22:
                            j18 = bf.b.j0(in3, readInt2);
                            break;
                        case 23:
                            arrayList2 = bf.b.H(in3, readInt2);
                            break;
                        case 24:
                            str11 = bf.b.F(in3, readInt2);
                            break;
                        case 25:
                            str13 = bf.b.F(in3, readInt2);
                            break;
                        case 26:
                            str14 = bf.b.F(in3, readInt2);
                            break;
                        case 27:
                            str12 = bf.b.F(in3, readInt2);
                            break;
                        case 28:
                            z17 = bf.b.a0(in3, readInt2);
                            break;
                        case 29:
                            j19 = bf.b.j0(in3, readInt2);
                            break;
                        case 30:
                            i17 = bf.b.h0(in3, readInt2);
                            break;
                        case 31:
                            str15 = bf.b.F(in3, readInt2);
                            break;
                        case ' ':
                            i16 = bf.b.h0(in3, readInt2);
                            break;
                        case '\"':
                            j23 = bf.b.j0(in3, readInt2);
                            break;
                    }
                }
                bf.b.L(in3, r04);
                return new zzo(str4, str5, str6, str7, j14, j15, str8, z13, z15, j24, str9, j16, j17, i15, z14, z16, str10, bool, j18, arrayList2, str11, str13, str14, str12, z17, j19, i17, str15, i16, j23);
            case 2:
                int r05 = bf.b.r0(in3);
                int i18 = 0;
                while (in3.dataPosition() < r05) {
                    int readInt3 = in3.readInt();
                    char c13 = (char) readInt3;
                    if (c13 == 1) {
                        i13 = bf.b.h0(in3, readInt3);
                    } else if (c13 == 2) {
                        i18 = bf.b.h0(in3, readInt3);
                    } else if (c13 != 3) {
                        bf.b.p0(in3, readInt3);
                    } else {
                        intent = (Intent) bf.b.E(in3, readInt3, Intent.CREATOR);
                    }
                }
                bf.b.L(in3, r05);
                return new zaa(i13, i18, intent);
            case 3:
                int r06 = bf.b.r0(in3);
                String str16 = null;
                while (in3.dataPosition() < r06) {
                    int readInt4 = in3.readInt();
                    char c14 = (char) readInt4;
                    if (c14 == 1) {
                        arrayList = bf.b.H(in3, readInt4);
                    } else if (c14 != 2) {
                        bf.b.p0(in3, readInt4);
                    } else {
                        str16 = bf.b.F(in3, readInt4);
                    }
                }
                bf.b.L(in3, r06);
                return new zag(arrayList, str16);
            case 4:
                int r07 = bf.b.r0(in3);
                while (in3.dataPosition() < r07) {
                    int readInt5 = in3.readInt();
                    char c15 = (char) readInt5;
                    if (c15 == 1) {
                        i13 = bf.b.h0(in3, readInt5);
                    } else if (c15 != 2) {
                        bf.b.p0(in3, readInt5);
                    } else {
                        zatVar = (zat) bf.b.E(in3, readInt5, zat.CREATOR);
                    }
                }
                bf.b.L(in3, r07);
                return new zai(i13, zatVar);
            case 5:
                int r08 = bf.b.r0(in3);
                zav zavVar = null;
                while (in3.dataPosition() < r08) {
                    int readInt6 = in3.readInt();
                    char c16 = (char) readInt6;
                    if (c16 == 1) {
                        i13 = bf.b.h0(in3, readInt6);
                    } else if (c16 == 2) {
                        connectionResult = (ConnectionResult) bf.b.E(in3, readInt6, ConnectionResult.CREATOR);
                    } else if (c16 != 3) {
                        bf.b.p0(in3, readInt6);
                    } else {
                        zavVar = (zav) bf.b.E(in3, readInt6, zav.CREATOR);
                    }
                }
                bf.b.L(in3, r08);
                return new zak(i13, connectionResult, zavVar);
            case 6:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.f32210i = 255;
                badgeState$State.f32212k = -2;
                badgeState$State.f32213l = -2;
                badgeState$State.f32214m = -2;
                badgeState$State.f32221t = Boolean.TRUE;
                badgeState$State.f32202a = in3.readInt();
                badgeState$State.f32203b = (Integer) in3.readSerializable();
                badgeState$State.f32204c = (Integer) in3.readSerializable();
                badgeState$State.f32205d = (Integer) in3.readSerializable();
                badgeState$State.f32206e = (Integer) in3.readSerializable();
                badgeState$State.f32207f = (Integer) in3.readSerializable();
                badgeState$State.f32208g = (Integer) in3.readSerializable();
                badgeState$State.f32209h = (Integer) in3.readSerializable();
                badgeState$State.f32210i = in3.readInt();
                badgeState$State.f32211j = in3.readString();
                badgeState$State.f32212k = in3.readInt();
                badgeState$State.f32213l = in3.readInt();
                badgeState$State.f32214m = in3.readInt();
                badgeState$State.f32216o = in3.readString();
                badgeState$State.f32217p = in3.readString();
                badgeState$State.f32218q = in3.readInt();
                badgeState$State.f32220s = (Integer) in3.readSerializable();
                badgeState$State.f32222u = (Integer) in3.readSerializable();
                badgeState$State.f32223v = (Integer) in3.readSerializable();
                badgeState$State.f32224w = (Integer) in3.readSerializable();
                badgeState$State.f32225x = (Integer) in3.readSerializable();
                badgeState$State.f32226y = (Integer) in3.readSerializable();
                badgeState$State.f32227z = (Integer) in3.readSerializable();
                badgeState$State.C = (Integer) in3.readSerializable();
                badgeState$State.A = (Integer) in3.readSerializable();
                badgeState$State.B = (Integer) in3.readSerializable();
                badgeState$State.f32221t = (Boolean) in3.readSerializable();
                badgeState$State.f32215n = (Locale) in3.readSerializable();
                badgeState$State.D = (Boolean) in3.readSerializable();
                return badgeState$State;
            case 7:
                int readInt7 = in3.readInt();
                ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt7);
                int[] iArr = new int[readInt7];
                boolean[] zArr = new boolean[readInt7];
                in3.readIntArray(iArr);
                in3.readBooleanArray(zArr);
                while (i13 < readInt7) {
                    parcelableSparseBooleanArray.put(iArr[i13], zArr[i13]);
                    i13++;
                }
                return parcelableSparseBooleanArray;
            case 8:
                int readInt8 = in3.readInt();
                ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt8);
                int[] iArr2 = new int[readInt8];
                int[] iArr3 = new int[readInt8];
                in3.readIntArray(iArr2);
                in3.readIntArray(iArr3);
                while (i13 < readInt8) {
                    parcelableSparseIntArray.put(iArr2[i13], iArr3[i13]);
                    i13++;
                }
                return parcelableSparseIntArray;
            case 9:
                int r09 = bf.b.r0(in3);
                while (in3.dataPosition() < r09) {
                    int readInt9 = in3.readInt();
                    if (((char) readInt9) != 2) {
                        bf.b.p0(in3, readInt9);
                    } else {
                        bundle = bf.b.B(in3, readInt9);
                    }
                }
                bf.b.L(in3, r09);
                return new RemoteMessage(bundle);
            case 10:
                return new LineAccessToken(in3);
            case 11:
                return new LineApiError(in3);
            case 12:
                return new LineCredential(in3);
            case 13:
                return new LineFriendProfile(in3);
            case 14:
                return new LineGroup(in3);
            case 15:
                return new LineIdToken(in3);
            case 16:
                return new LineProfile(in3);
            case 17:
                return new LineAuthenticationConfig(in3);
            case 18:
                return new LineAuthenticationParams(in3);
            case 19:
                return new LineLoginResult(in3);
            case 20:
                return new PKCECode(in3);
            case 21:
                Intrinsics.h(in3, "in");
                return new OpenChatRoomInfo(in3.readString(), in3.readString());
            case 22:
                return new CollaboratorInviteFeed(in3);
            case 23:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString = in3.readString();
                    if (readString != null) {
                        return InterestFeatureLocation.valueOf(readString);
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 24:
                RelatedQueryItem relatedQueryItem = new RelatedQueryItem();
                relatedQueryItem.f35122a = in3.readString();
                relatedQueryItem.f35123b = in3.readString();
                relatedQueryItem.f35124c = in3.readString();
                relatedQueryItem.f35125d = br.b.valueOf(in3.readString());
                relatedQueryItem.f35126e = in3.readString();
                return relatedQueryItem;
            case 25:
                SendableObject sendableObject = new SendableObject();
                sendableObject.f35135i = false;
                sendableObject.f35136j = false;
                sendableObject.f35137k = null;
                sendableObject.f35127a = in3.readString();
                sendableObject.f35128b = in3.createStringArrayList();
                sendableObject.f35129c = in3.readInt();
                sendableObject.f35130d = in3.readString();
                sendableObject.f35131e = in3.readString();
                sendableObject.f35132f = in3.readString();
                sendableObject.f35133g = in3.readString();
                sendableObject.f35134h = in3.readString();
                sendableObject.f35135i = in3.readByte() != 0;
                sendableObject.f35136j = in3.readByte() != 0;
                sendableObject.f35137k = in3.readString();
                return sendableObject;
            case 26:
                return new TypeAheadItem(in3);
            case 27:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString2 = in3.readString();
                    if (readString2 != null) {
                        return AdPreviewLocation.valueOf(readString2);
                    }
                    return null;
                } catch (Throwable unused2) {
                    return null;
                }
            case 28:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString3 = in3.readString();
                    if (readString3 != null) {
                        return AdsLocation.valueOf(readString3);
                    }
                    return null;
                } catch (Throwable unused3) {
                    return null;
                }
            default:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString4 = in3.readString();
                    if (readString4 != null) {
                        return CollageHeroCutoutLocation.valueOf(readString4);
                    }
                    return null;
                } catch (Throwable unused4) {
                    return null;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f94742a) {
            case 0:
                return new zznc[i13];
            case 1:
                return new zzo[i13];
            case 2:
                return new zaa[i13];
            case 3:
                return new zag[i13];
            case 4:
                return new zai[i13];
            case 5:
                return new zak[i13];
            case 6:
                return new BadgeState$State[i13];
            case 7:
                return new ParcelableSparseBooleanArray[i13];
            case 8:
                return new ParcelableSparseIntArray[i13];
            case 9:
                return new RemoteMessage[i13];
            case 10:
                return new LineAccessToken[i13];
            case 11:
                return new LineApiError[i13];
            case 12:
                return new LineCredential[i13];
            case 13:
                return new LineFriendProfile[i13];
            case 14:
                return new LineGroup[i13];
            case 15:
                return new LineIdToken[i13];
            case 16:
                return new LineProfile[i13];
            case 17:
                return new LineAuthenticationConfig[i13];
            case 18:
                return new LineAuthenticationParams[i13];
            case 19:
                return new LineLoginResult[i13];
            case 20:
                return new PKCECode[i13];
            case 21:
                return new OpenChatRoomInfo[i13];
            case 22:
                return new CollaboratorInviteFeed[i13];
            case 23:
                return new InterestFeatureLocation[i13];
            case 24:
                return new RelatedQueryItem[i13];
            case 25:
                return new SendableObject[i13];
            case 26:
                return new TypeAheadItem[i13];
            case 27:
                return new AdPreviewLocation[i13];
            case 28:
                return new AdsLocation[i13];
            default:
                return new CollageHeroCutoutLocation[i13];
        }
    }
}
