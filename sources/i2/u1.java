package i2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.media3.common.DrmInitData;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.google.android.gms.appset.zza;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinFeed;
import com.pinterest.feature.browser.model.BrowserFeatureLocation;
import com.pinterest.feature.homefeed.navigation.HomeFeedLocation;
import com.pinterest.feature.newshub.NewsHubFeatureLocation;
import com.pinterest.feature.profile.ProfileFeatureLocation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.identity.authentication.AuthenticationLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.d4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u1 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f71314a;

    public /* synthetic */ u1(int i13) {
        this.f71314a = i13;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        int i14 = getServiceRequest.f30944f;
        bs1.c.O2(parcel, 1, 4);
        parcel.writeInt(i14);
        bs1.c.O2(parcel, 2, 4);
        parcel.writeInt(getServiceRequest.f30945g);
        bs1.c.O2(parcel, 3, 4);
        parcel.writeInt(getServiceRequest.f30946h);
        bs1.c.I2(parcel, 4, getServiceRequest.f30947i, false);
        bs1.c.E2(parcel, 5, getServiceRequest.f30948j);
        bs1.c.K2(parcel, 6, getServiceRequest.f30949k, i13);
        bs1.c.A2(parcel, 7, getServiceRequest.f30950l);
        bs1.c.H2(parcel, 8, getServiceRequest.f30951m, i13, false);
        bs1.c.K2(parcel, 10, getServiceRequest.f30952n, i13);
        bs1.c.K2(parcel, 11, getServiceRequest.f30953o, i13);
        bs1.c.O2(parcel, 12, 4);
        parcel.writeInt(getServiceRequest.f30954p ? 1 : 0);
        bs1.c.O2(parcel, 13, 4);
        parcel.writeInt(getServiceRequest.f30955q);
        boolean z13 = getServiceRequest.f30956r;
        bs1.c.O2(parcel, 14, 4);
        parcel.writeInt(z13 ? 1 : 0);
        bs1.c.I2(parcel, 15, getServiceRequest.f30957s, false);
        bs1.c.N2(parcel, M2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in3) {
        String str = "";
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        String str5 = null;
        PendingIntent pendingIntent2 = null;
        String str6 = null;
        switch (this.f71314a) {
            case 0:
                return new ParcelableSnapshotMutableFloatState(in3.readFloat());
            case 1:
                return new ParcelableSnapshotMutableIntState(in3.readInt());
            case 2:
                return new ParcelableSnapshotMutableLongState(in3.readLong());
            case 3:
                return new DrmInitData(in3);
            case 4:
                Intrinsics.checkNotNullParameter(in3, "in");
                Intrinsics.checkNotNullParameter(in3, "in");
                PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = new PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem();
                pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a = in3.readInt();
                pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19201b = in3.readInt();
                pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19203d = in3.readInt() == 1;
                int readInt = in3.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19202c = iArr;
                    in3.readIntArray(iArr);
                }
                return pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem;
            case 5:
                Intrinsics.checkNotNullParameter(in3, "source");
                return new AccessToken(in3);
            case 6:
                Intrinsics.checkNotNullParameter(in3, "parcel");
                return new FacebookRequestError(in3.readInt(), in3.readInt(), in3.readInt(), in3.readString(), in3.readString(), in3.readString(), in3.readString(), null, null, false);
            case 7:
                int r03 = bf.b.r0(in3);
                String str7 = null;
                while (in3.dataPosition() < r03) {
                    int readInt2 = in3.readInt();
                    char c13 = (char) readInt2;
                    if (c13 == 1) {
                        str2 = bf.b.F(in3, readInt2);
                    } else if (c13 != 2) {
                        bf.b.p0(in3, readInt2);
                    } else {
                        str7 = bf.b.F(in3, readInt2);
                    }
                }
                bf.b.L(in3, r03);
                return new zza(str2, str7);
            case 8:
                int r04 = bf.b.r0(in3);
                while (in3.dataPosition() < r04) {
                    int readInt3 = in3.readInt();
                    char c14 = (char) readInt3;
                    if (c14 == 1) {
                        str6 = bf.b.F(in3, readInt3);
                    } else if (c14 != 2) {
                        bf.b.p0(in3, readInt3);
                    } else {
                        i18 = bf.b.h0(in3, readInt3);
                    }
                }
                bf.b.L(in3, r04);
                return new zzc(str6, i18);
            case 9:
                int r05 = bf.b.r0(in3);
                while (in3.dataPosition() < r05) {
                    int readInt4 = in3.readInt();
                    if (((char) readInt4) != 1) {
                        bf.b.p0(in3, readInt4);
                    } else {
                        pendingIntent2 = (PendingIntent) bf.b.E(in3, readInt4, PendingIntent.CREATOR);
                    }
                }
                bf.b.L(in3, r05);
                return new BeginSignInResult(pendingIntent2);
            case 10:
                int r06 = bf.b.r0(in3);
                PendingIntent pendingIntent3 = null;
                ConnectionResult connectionResult = null;
                while (in3.dataPosition() < r06) {
                    int readInt5 = in3.readInt();
                    char c15 = (char) readInt5;
                    if (c15 == 1) {
                        i17 = bf.b.h0(in3, readInt5);
                    } else if (c15 == 2) {
                        str5 = bf.b.F(in3, readInt5);
                    } else if (c15 == 3) {
                        pendingIntent3 = (PendingIntent) bf.b.E(in3, readInt5, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        bf.b.p0(in3, readInt5);
                    } else {
                        connectionResult = (ConnectionResult) bf.b.E(in3, readInt5, ConnectionResult.CREATOR);
                    }
                }
                bf.b.L(in3, r06);
                return new Status(i17, str5, pendingIntent3, connectionResult);
            case 11:
                int r07 = bf.b.r0(in3);
                int i19 = 0;
                int i23 = 0;
                int i24 = 0;
                boolean z13 = false;
                boolean z14 = false;
                while (in3.dataPosition() < r07) {
                    int readInt6 = in3.readInt();
                    char c16 = (char) readInt6;
                    if (c16 == 1) {
                        i19 = bf.b.h0(in3, readInt6);
                    } else if (c16 == 2) {
                        z13 = bf.b.a0(in3, readInt6);
                    } else if (c16 == 3) {
                        z14 = bf.b.a0(in3, readInt6);
                    } else if (c16 == 4) {
                        i23 = bf.b.h0(in3, readInt6);
                    } else if (c16 != 5) {
                        bf.b.p0(in3, readInt6);
                    } else {
                        i24 = bf.b.h0(in3, readInt6);
                    }
                }
                bf.b.L(in3, r07);
                return new RootTelemetryConfiguration(i19, i23, i24, z13, z14);
            case 12:
                int r08 = bf.b.r0(in3);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (in3.dataPosition() < r08) {
                    int readInt7 = in3.readInt();
                    char c17 = (char) readInt7;
                    if (c17 == 1) {
                        bundle = bf.b.B(in3, readInt7);
                    } else if (c17 == 2) {
                        featureArr = (Feature[]) bf.b.I(in3, readInt7, Feature.CREATOR);
                    } else if (c17 == 3) {
                        i16 = bf.b.h0(in3, readInt7);
                    } else if (c17 != 4) {
                        bf.b.p0(in3, readInt7);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) bf.b.E(in3, readInt7, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                bf.b.L(in3, r08);
                zzk zzkVar = new zzk();
                zzkVar.f30988f = bundle;
                zzkVar.f30989g = featureArr;
                zzkVar.f30990h = i16;
                zzkVar.f30991i = connectionTelemetryConfiguration;
                return zzkVar;
            case 13:
                int r09 = bf.b.r0(in3);
                Scope[] scopeArr = GetServiceRequest.f30942t;
                Bundle bundle2 = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.f30943u;
                Feature[] featureArr3 = featureArr2;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                boolean z15 = false;
                int i28 = 0;
                boolean z16 = false;
                String str8 = null;
                IBinder iBinder = null;
                Account account = null;
                String str9 = null;
                while (in3.dataPosition() < r09) {
                    int readInt8 = in3.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i25 = bf.b.h0(in3, readInt8);
                            break;
                        case 2:
                            i26 = bf.b.h0(in3, readInt8);
                            break;
                        case 3:
                            i27 = bf.b.h0(in3, readInt8);
                            break;
                        case 4:
                            str8 = bf.b.F(in3, readInt8);
                            break;
                        case 5:
                            iBinder = bf.b.g0(in3, readInt8);
                            break;
                        case 6:
                            scopeArr = (Scope[]) bf.b.I(in3, readInt8, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = bf.b.B(in3, readInt8);
                            break;
                        case '\b':
                            account = (Account) bf.b.E(in3, readInt8, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            bf.b.p0(in3, readInt8);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) bf.b.I(in3, readInt8, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) bf.b.I(in3, readInt8, Feature.CREATOR);
                            break;
                        case '\f':
                            z15 = bf.b.a0(in3, readInt8);
                            break;
                        case '\r':
                            i28 = bf.b.h0(in3, readInt8);
                            break;
                        case 14:
                            z16 = bf.b.a0(in3, readInt8);
                            break;
                        case 15:
                            str9 = bf.b.F(in3, readInt8);
                            break;
                    }
                }
                bf.b.L(in3, r09);
                return new GetServiceRequest(i25, i26, i27, str8, iBinder, scopeArr, bundle2, account, featureArr2, featureArr3, z15, i28, z16, str9);
            case 14:
                int r010 = bf.b.r0(in3);
                int i29 = 0;
                String str10 = null;
                while (in3.dataPosition() < r010) {
                    int readInt9 = in3.readInt();
                    char c18 = (char) readInt9;
                    if (c18 == 1) {
                        i15 = bf.b.h0(in3, readInt9);
                    } else if (c18 == 2) {
                        i29 = bf.b.h0(in3, readInt9);
                    } else if (c18 == 3) {
                        pendingIntent = (PendingIntent) bf.b.E(in3, readInt9, PendingIntent.CREATOR);
                    } else if (c18 != 4) {
                        bf.b.p0(in3, readInt9);
                    } else {
                        str10 = bf.b.F(in3, readInt9);
                    }
                }
                bf.b.L(in3, r010);
                return new ConnectionResult(i15, i29, pendingIntent, str10);
            case 15:
                int r011 = bf.b.r0(in3);
                long j13 = -1;
                while (in3.dataPosition() < r011) {
                    int readInt10 = in3.readInt();
                    char c19 = (char) readInt10;
                    if (c19 == 1) {
                        str4 = bf.b.F(in3, readInt10);
                    } else if (c19 == 2) {
                        i14 = bf.b.h0(in3, readInt10);
                    } else if (c19 != 3) {
                        bf.b.p0(in3, readInt10);
                    } else {
                        j13 = bf.b.j0(in3, readInt10);
                    }
                }
                bf.b.L(in3, r011);
                return new Feature(str4, i14, j13);
            case 16:
                int r012 = bf.b.r0(in3);
                while (in3.dataPosition() < r012) {
                    int readInt11 = in3.readInt();
                    if (((char) readInt11) != 1) {
                        bf.b.p0(in3, readInt11);
                    } else {
                        i13 = bf.b.h0(in3, readInt11);
                    }
                }
                bf.b.L(in3, r012);
                return new MediaPerformanceClassResult(i13);
            case 17:
                int r013 = bf.b.r0(in3);
                long j14 = 0;
                long j15 = 0;
                boolean z17 = false;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                Bundle bundle3 = null;
                String str14 = null;
                while (in3.dataPosition() < r013) {
                    int readInt12 = in3.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            j14 = bf.b.j0(in3, readInt12);
                            break;
                        case 2:
                            j15 = bf.b.j0(in3, readInt12);
                            break;
                        case 3:
                            z17 = bf.b.a0(in3, readInt12);
                            break;
                        case 4:
                            str11 = bf.b.F(in3, readInt12);
                            break;
                        case 5:
                            str12 = bf.b.F(in3, readInt12);
                            break;
                        case 6:
                            str13 = bf.b.F(in3, readInt12);
                            break;
                        case 7:
                            bundle3 = bf.b.B(in3, readInt12);
                            break;
                        case '\b':
                            str14 = bf.b.F(in3, readInt12);
                            break;
                        default:
                            bf.b.p0(in3, readInt12);
                            break;
                    }
                }
                bf.b.L(in3, r013);
                return new zzdd(j14, j15, z17, str11, str12, str13, bundle3, str14);
            case 18:
                int r014 = bf.b.r0(in3);
                RecaptchaActionType recaptchaActionType = new RecaptchaActionType("other");
                Bundle bundle4 = new Bundle();
                String str15 = "";
                while (in3.dataPosition() < r014) {
                    int readInt13 = in3.readInt();
                    char c23 = (char) readInt13;
                    if (c23 == 1) {
                        recaptchaActionType = (RecaptchaActionType) bf.b.E(in3, readInt13, RecaptchaActionType.CREATOR);
                    } else if (c23 == 2) {
                        str = bf.b.F(in3, readInt13);
                    } else if (c23 == 3) {
                        bundle4 = bf.b.B(in3, readInt13);
                    } else if (c23 != 4) {
                        bf.b.p0(in3, readInt13);
                    } else {
                        str15 = bf.b.F(in3, readInt13);
                    }
                }
                bf.b.L(in3, r014);
                return new RecaptchaAction(recaptchaActionType, str, bundle4, str15);
            case 19:
                int r015 = bf.b.r0(in3);
                while (in3.dataPosition() < r015) {
                    int readInt14 = in3.readInt();
                    if (((char) readInt14) != 1) {
                        bf.b.p0(in3, readInt14);
                    } else {
                        str3 = bf.b.F(in3, readInt14);
                    }
                }
                bf.b.L(in3, r015);
                return new RecaptchaActionType(str3);
            case 20:
                int r016 = bf.b.r0(in3);
                ArrayList arrayList = new ArrayList();
                String str16 = "";
                while (in3.dataPosition() < r016) {
                    int readInt15 = in3.readInt();
                    char c24 = (char) readInt15;
                    if (c24 == 1) {
                        str = bf.b.F(in3, readInt15);
                    } else if (c24 == 2) {
                        str16 = bf.b.F(in3, readInt15);
                    } else if (c24 != 3) {
                        bf.b.p0(in3, readInt15);
                    } else {
                        arrayList = bf.b.H(in3, readInt15);
                    }
                }
                bf.b.L(in3, r016);
                return new RecaptchaHandle(str, str16, arrayList);
            case 21:
                int r017 = bf.b.r0(in3);
                while (in3.dataPosition() < r017) {
                    int readInt16 = in3.readInt();
                    if (((char) readInt16) != 1) {
                        bf.b.p0(in3, readInt16);
                    } else {
                        str = bf.b.F(in3, readInt16);
                    }
                }
                bf.b.L(in3, r017);
                return new RecaptchaResultData(str);
            case 22:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString = in3.readString();
                    if (readString != null) {
                        return BrowserFeatureLocation.valueOf(readString);
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 23:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString2 = in3.readString();
                    if (readString2 != null) {
                        return HomeFeedLocation.valueOf(readString2);
                    }
                    return null;
                } catch (Throwable unused2) {
                    return null;
                }
            case 24:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString3 = in3.readString();
                    if (readString3 != null) {
                        return NewsHubFeatureLocation.valueOf(readString3);
                    }
                    return null;
                } catch (Throwable unused3) {
                    return null;
                }
            case 25:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString4 = in3.readString();
                    if (readString4 != null) {
                        return ProfileFeatureLocation.valueOf(readString4);
                    }
                    return null;
                } catch (Throwable unused4) {
                    return null;
                }
            case 26:
                Intrinsics.checkNotNullParameter(in3, "source");
                ClassLoader classLoader = ScreenModel.class.getClassLoader();
                ScreenLocation screenLocation = (ScreenLocation) in3.readParcelable(classLoader);
                int readInt17 = in3.readInt();
                Bundle readBundle = in3.readBundle(classLoader);
                if (readBundle == null) {
                    readBundle = new Bundle();
                }
                Bundle bundle5 = readBundle;
                Bundle readBundle2 = in3.readBundle(ScreenModel.class.getClassLoader());
                boolean z18 = in3.readInt() == 1;
                String readString5 = in3.readString();
                String str17 = readString5 == null ? "" : readString5;
                Intrinsics.f(screenLocation);
                ScreenModel screenModel = new ScreenModel(screenLocation, readInt17, bundle5, readBundle2, str17, 32);
                screenModel.f49211g = z18;
                return screenModel;
            case 27:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString6 = in3.readString();
                    if (readString6 != null) {
                        return AuthenticationLocation.valueOf(readString6);
                    }
                    return null;
                } catch (Throwable unused5) {
                    return null;
                }
            default:
                if (in3 == null) {
                    throw new IllegalArgumentException("source Parcel cannot be null");
                }
                ScreenLocation screenLocation2 = (ScreenLocation) in3.readParcelable(u1.class.getClassLoader());
                String readString7 = in3.readString();
                Bundle readBundle3 = in3.readBundle(Navigation.class.getClassLoader());
                d4 findByValue = d4.findByValue(in3.readInt());
                NavigationImpl navigation = (NavigationImpl) in3.readParcelable(NavigationImpl.class.getClassLoader());
                NavigationImpl navigationImpl = new NavigationImpl(screenLocation2, readString7, in3.readInt(), readBundle3);
                navigationImpl.f49944f = findByValue;
                if (navigation != null) {
                    Intrinsics.checkNotNullParameter(navigation, "navigation");
                    navigationImpl.f49945g = navigation;
                }
                Bundle readBundle4 = in3.readBundle(PinFeed.class.getClassLoader());
                if (readBundle4.containsKey("NAVGIATION_EXTRA_FEED_BUNDLE_KEY")) {
                    navigationImpl.y0((PinFeed) Feed.F("NAVGIATION_EXTRA_FEED_BUNDLE_KEY", readBundle4), "com.pinterest.EXTRA_FEED");
                }
                return navigationImpl;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f71314a) {
            case 0:
                return new ParcelableSnapshotMutableFloatState[i13];
            case 1:
                return new ParcelableSnapshotMutableIntState[i13];
            case 2:
                return new ParcelableSnapshotMutableLongState[i13];
            case 3:
                return new DrmInitData[i13];
            case 4:
                return new PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem[i13];
            case 5:
                return new AccessToken[i13];
            case 6:
                return new FacebookRequestError[i13];
            case 7:
                return new zza[i13];
            case 8:
                return new zzc[i13];
            case 9:
                return new BeginSignInResult[i13];
            case 10:
                return new Status[i13];
            case 11:
                return new RootTelemetryConfiguration[i13];
            case 12:
                return new zzk[i13];
            case 13:
                return new GetServiceRequest[i13];
            case 14:
                return new ConnectionResult[i13];
            case 15:
                return new Feature[i13];
            case 16:
                return new MediaPerformanceClassResult[i13];
            case 17:
                return new zzdd[i13];
            case 18:
                return new RecaptchaAction[i13];
            case 19:
                return new RecaptchaActionType[i13];
            case 20:
                return new RecaptchaHandle[i13];
            case 21:
                return new RecaptchaResultData[i13];
            case 22:
                return new BrowserFeatureLocation[i13];
            case 23:
                return new HomeFeedLocation[i13];
            case 24:
                return new NewsHubFeatureLocation[i13];
            case 25:
                return new ProfileFeatureLocation[i13];
            case 26:
                return new ScreenModel[i13];
            case 27:
                return new AuthenticationLocation[i13];
            default:
                return new Navigation[i13];
        }
    }
}
