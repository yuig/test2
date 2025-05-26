package vg;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bf.b;
import com.google.android.engage.common.datamodel.DisplayTimeWindow;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.engage.common.datamodel.LinkPreview;
import com.google.android.engage.common.datamodel.Price;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.engage.common.datamodel.c;
import com.google.android.engage.food.datamodel.StoreEntity;
import com.google.android.engage.service.ClusterList;
import com.google.android.engage.service.ClusterMetadata;
import com.google.android.engage.shopping.datamodel.ShoppingCart;
import com.google.android.engage.shopping.datamodel.ShoppingEntity;
import com.google.android.engage.shopping.datamodel.ShoppingList;
import com.google.android.engage.shopping.datamodel.ShoppingReorderCluster;
import com.google.android.engage.social.datamodel.GenericPost;
import com.google.android.engage.social.datamodel.Interaction;
import com.google.android.engage.social.datamodel.PortraitMediaEntity;
import com.google.android.engage.social.datamodel.PortraitMediaPost;
import com.google.android.engage.social.datamodel.Profile;
import com.google.android.engage.social.datamodel.SocialPostEntity;
import com.google.android.engage.video.datamodel.LiveStreamingVideoEntity;
import com.google.android.engage.video.datamodel.MovieEntity;
import com.google.android.engage.video.datamodel.TvEpisodeEntity;
import com.google.android.engage.video.datamodel.TvSeasonEntity;
import com.google.android.engage.video.datamodel.TvShowEntity;
import com.google.android.engage.video.datamodel.VideoClipEntity;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import xg.f;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125782a;

    public /* synthetic */ a(int i13) {
        this.f125782a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        char c13 = 4;
        switch (this.f125782a) {
            case 0:
                int r03 = b.r0(parcel);
                int i13 = 0;
                ArrayList arrayList = null;
                Uri uri = null;
                String str = null;
                Rating rating = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i13 = b.h0(parcel, readInt);
                            break;
                        case 2:
                            arrayList = b.J(parcel, readInt, Image.CREATOR);
                            break;
                        case 3:
                            uri = (Uri) b.E(parcel, readInt, Uri.CREATOR);
                            break;
                        case 4:
                            str = b.F(parcel, readInt);
                            break;
                        case 5:
                            rating = (Rating) b.E(parcel, readInt, Rating.CREATOR);
                            break;
                        case 6:
                            str2 = b.F(parcel, readInt);
                            break;
                        case 7:
                            str3 = b.F(parcel, readInt);
                            break;
                        case '\b':
                            str4 = b.F(parcel, readInt);
                            break;
                        case '\t':
                            str5 = b.F(parcel, readInt);
                            break;
                        case '\n':
                            str6 = b.F(parcel, readInt);
                            break;
                        default:
                            b.p0(parcel, readInt);
                            break;
                    }
                }
                b.L(parcel, r03);
                return new StoreEntity(i13, arrayList, uri, str, rating, str2, str3, str4, str5, str6);
            case 1:
                f fVar = new f();
                int readInt2 = parcel.readInt();
                if (readInt2 > 0) {
                    for (int i14 = 0; i14 < readInt2; i14++) {
                        fVar.f134918a.e(c.a(parcel));
                    }
                }
                return new ClusterList(fVar);
            case 2:
                xg.a aVar = new xg.a(2);
                int readInt3 = parcel.readInt();
                if (readInt3 > 0) {
                    for (int i15 = 0; i15 < readInt3; i15++) {
                        aVar.f134906a.e(Integer.valueOf(parcel.readInt()));
                    }
                }
                return new ClusterMetadata(aVar);
            case 3:
                int r04 = b.r0(parcel);
                int i16 = 0;
                int i17 = 0;
                String str7 = null;
                ArrayList arrayList2 = null;
                Uri uri2 = null;
                ArrayList arrayList3 = null;
                String str8 = null;
                while (parcel.dataPosition() < r04) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i16 = b.h0(parcel, readInt4);
                            break;
                        case 2:
                            str7 = b.F(parcel, readInt4);
                            break;
                        case 3:
                            arrayList2 = b.J(parcel, readInt4, Image.CREATOR);
                            break;
                        case 4:
                            i17 = b.h0(parcel, readInt4);
                            break;
                        case 5:
                            uri2 = (Uri) b.E(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 6:
                            arrayList3 = b.H(parcel, readInt4);
                            break;
                        case 7:
                            str8 = b.F(parcel, readInt4);
                            break;
                        default:
                            b.p0(parcel, readInt4);
                            break;
                    }
                }
                b.L(parcel, r04);
                return new ShoppingCart(i16, str7, arrayList2, i17, uri2, arrayList3, str8);
            case 4:
                int r05 = b.r0(parcel);
                int i18 = 0;
                Uri uri3 = null;
                Price price = null;
                Rating rating2 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < r05) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i18 = b.h0(parcel, readInt5);
                            break;
                        case 2:
                            arrayList4 = b.J(parcel, readInt5, Image.CREATOR);
                            break;
                        case 3:
                            uri3 = (Uri) b.E(parcel, readInt5, Uri.CREATOR);
                            break;
                        case 4:
                            str9 = b.F(parcel, readInt5);
                            break;
                        case 5:
                            str10 = b.F(parcel, readInt5);
                            break;
                        case 6:
                            str11 = b.F(parcel, readInt5);
                            break;
                        case 7:
                            price = (Price) b.E(parcel, readInt5, Price.CREATOR);
                            break;
                        case '\b':
                            rating2 = (Rating) b.E(parcel, readInt5, Rating.CREATOR);
                            break;
                        case '\t':
                            arrayList5 = b.J(parcel, readInt5, DisplayTimeWindow.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt5);
                            break;
                    }
                }
                b.L(parcel, r05);
                return new ShoppingEntity(i18, uri3, price, rating2, str9, str10, str11, arrayList4, arrayList5);
            case 5:
                int r06 = b.r0(parcel);
                int i19 = 0;
                int i23 = 0;
                String str12 = null;
                ArrayList arrayList6 = null;
                Uri uri4 = null;
                while (parcel.dataPosition() < r06) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 1) {
                        i19 = b.h0(parcel, readInt6);
                    } else if (c14 == 2) {
                        str12 = b.F(parcel, readInt6);
                    } else if (c14 == 3) {
                        arrayList6 = b.H(parcel, readInt6);
                    } else if (c14 == 4) {
                        i23 = b.h0(parcel, readInt6);
                    } else if (c14 != 5) {
                        b.p0(parcel, readInt6);
                    } else {
                        uri4 = (Uri) b.E(parcel, readInt6, Uri.CREATOR);
                    }
                }
                b.L(parcel, r06);
                return new ShoppingList(i19, str12, arrayList6, i23, uri4);
            case 6:
                int r07 = b.r0(parcel);
                int i24 = 0;
                int i25 = 0;
                String str13 = null;
                ArrayList arrayList7 = null;
                Uri uri5 = null;
                ArrayList arrayList8 = null;
                String str14 = null;
                while (parcel.dataPosition() < r07) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i24 = b.h0(parcel, readInt7);
                            break;
                        case 2:
                            str13 = b.F(parcel, readInt7);
                            break;
                        case 3:
                            arrayList7 = b.J(parcel, readInt7, Image.CREATOR);
                            break;
                        case 4:
                            i25 = b.h0(parcel, readInt7);
                            break;
                        case 5:
                            uri5 = (Uri) b.E(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 6:
                            arrayList8 = b.H(parcel, readInt7);
                            break;
                        case 7:
                            str14 = b.F(parcel, readInt7);
                            break;
                        default:
                            b.p0(parcel, readInt7);
                            break;
                    }
                }
                b.L(parcel, r07);
                return new ShoppingReorderCluster(i24, str13, arrayList7, i25, uri5, arrayList8, str14);
            case 7:
                int r08 = b.r0(parcel);
                Long l13 = null;
                String str15 = null;
                LinkPreview linkPreview = null;
                ArrayList arrayList9 = null;
                while (parcel.dataPosition() < r08) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 1) {
                        l13 = b.k0(parcel, readInt8);
                    } else if (c15 == 2) {
                        str15 = b.F(parcel, readInt8);
                    } else if (c15 == 3) {
                        linkPreview = (LinkPreview) b.E(parcel, readInt8, LinkPreview.CREATOR);
                    } else if (c15 != 4) {
                        b.p0(parcel, readInt8);
                    } else {
                        arrayList9 = b.J(parcel, readInt8, Image.CREATOR);
                    }
                }
                b.L(parcel, r08);
                return new GenericPost(l13, str15, linkPreview, arrayList9);
            case 8:
                int r09 = b.r0(parcel);
                String str16 = null;
                String str17 = null;
                ArrayList arrayList10 = null;
                while (parcel.dataPosition() < r09) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        str16 = b.F(parcel, readInt9);
                    } else if (c16 == 2) {
                        str17 = b.F(parcel, readInt9);
                    } else if (c16 != 3) {
                        b.p0(parcel, readInt9);
                    } else {
                        arrayList10 = b.J(parcel, readInt9, Image.CREATOR);
                    }
                }
                b.L(parcel, r09);
                return new Interaction(str16, str17, arrayList10);
            case 9:
                int r010 = b.r0(parcel);
                int i26 = 0;
                ArrayList arrayList11 = null;
                Uri uri6 = null;
                ArrayList arrayList12 = null;
                PortraitMediaPost portraitMediaPost = null;
                Profile profile = null;
                Interaction interaction = null;
                while (parcel.dataPosition() < r010) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i26 = b.h0(parcel, readInt10);
                            break;
                        case 2:
                            arrayList11 = b.J(parcel, readInt10, Image.CREATOR);
                            break;
                        case 3:
                            uri6 = (Uri) b.E(parcel, readInt10, Uri.CREATOR);
                            break;
                        case 4:
                            arrayList12 = b.J(parcel, readInt10, DisplayTimeWindow.CREATOR);
                            break;
                        case 5:
                            portraitMediaPost = (PortraitMediaPost) b.E(parcel, readInt10, PortraitMediaPost.CREATOR);
                            break;
                        case 6:
                            profile = (Profile) b.E(parcel, readInt10, Profile.CREATOR);
                            break;
                        case 7:
                            interaction = (Interaction) b.E(parcel, readInt10, Interaction.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt10);
                            break;
                    }
                }
                b.L(parcel, r010);
                return new PortraitMediaEntity(i26, arrayList11, uri6, arrayList12, portraitMediaPost, profile, interaction);
            case 10:
                int r011 = b.r0(parcel);
                Long l14 = null;
                String str18 = null;
                ArrayList arrayList13 = null;
                while (parcel.dataPosition() < r011) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        l14 = b.k0(parcel, readInt11);
                    } else if (c17 == 2) {
                        str18 = b.F(parcel, readInt11);
                    } else if (c17 != 3) {
                        b.p0(parcel, readInt11);
                    } else {
                        arrayList13 = b.J(parcel, readInt11, Image.CREATOR);
                    }
                }
                b.L(parcel, r011);
                return new PortraitMediaPost(str18, l14, arrayList13);
            case 11:
                int r012 = b.r0(parcel);
                String str19 = null;
                String str20 = null;
                Image image = null;
                Image image2 = null;
                while (parcel.dataPosition() < r012) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 1) {
                        str19 = b.F(parcel, readInt12);
                    } else if (c18 == 2) {
                        str20 = b.F(parcel, readInt12);
                    } else if (c18 == 3) {
                        image = (Image) b.E(parcel, readInt12, Image.CREATOR);
                    } else if (c18 != 4) {
                        b.p0(parcel, readInt12);
                    } else {
                        image2 = (Image) b.E(parcel, readInt12, Image.CREATOR);
                    }
                }
                b.L(parcel, r012);
                return new Profile(str19, str20, image, image2);
            case 12:
                int r013 = b.r0(parcel);
                int i27 = 0;
                ArrayList arrayList14 = null;
                Uri uri7 = null;
                ArrayList arrayList15 = null;
                GenericPost genericPost = null;
                Profile profile2 = null;
                ArrayList arrayList16 = null;
                while (parcel.dataPosition() < r013) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i27 = b.h0(parcel, readInt13);
                            break;
                        case 2:
                            arrayList14 = b.J(parcel, readInt13, Image.CREATOR);
                            break;
                        case 3:
                            uri7 = (Uri) b.E(parcel, readInt13, Uri.CREATOR);
                            break;
                        case 4:
                            arrayList15 = b.J(parcel, readInt13, DisplayTimeWindow.CREATOR);
                            break;
                        case 5:
                            genericPost = (GenericPost) b.E(parcel, readInt13, GenericPost.CREATOR);
                            break;
                        case 6:
                            profile2 = (Profile) b.E(parcel, readInt13, Profile.CREATOR);
                            break;
                        case 7:
                            arrayList16 = b.J(parcel, readInt13, Interaction.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt13);
                            break;
                    }
                }
                b.L(parcel, r013);
                return new SocialPostEntity(i27, arrayList14, uri7, arrayList15, genericPost, profile2, arrayList16);
            case 13:
                int r014 = b.r0(parcel);
                long j13 = 0;
                int i28 = 0;
                int i29 = 0;
                ArrayList arrayList17 = null;
                String str21 = null;
                Long l15 = null;
                Uri uri8 = null;
                Long l16 = null;
                Long l17 = null;
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < r014) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i28 = b.h0(parcel, readInt14);
                            break;
                        case 2:
                            arrayList17 = b.J(parcel, readInt14, Image.CREATOR);
                            break;
                        case 3:
                            str21 = b.F(parcel, readInt14);
                            break;
                        case 4:
                            l15 = b.k0(parcel, readInt14);
                            break;
                        case 5:
                            i29 = b.h0(parcel, readInt14);
                            break;
                        case 6:
                            j13 = b.j0(parcel, readInt14);
                            break;
                        case 7:
                            uri8 = (Uri) b.E(parcel, readInt14, Uri.CREATOR);
                            break;
                        case '\b':
                            l16 = b.k0(parcel, readInt14);
                            break;
                        case '\t':
                            l17 = b.k0(parcel, readInt14);
                            break;
                        case '\n':
                            str22 = b.F(parcel, readInt14);
                            break;
                        case 11:
                            str23 = b.F(parcel, readInt14);
                            break;
                        default:
                            b.p0(parcel, readInt14);
                            break;
                    }
                }
                b.L(parcel, r014);
                return new LiveStreamingVideoEntity(i28, arrayList17, str21, l15, i29, j13, uri8, l16, l17, str22, str23);
            case 14:
                int r015 = b.r0(parcel);
                long j14 = 0;
                long j15 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                boolean z13 = false;
                ArrayList arrayList18 = null;
                String str24 = null;
                Long l18 = null;
                Uri uri9 = null;
                Uri uri10 = null;
                Long l19 = null;
                String str25 = null;
                ArrayList arrayList19 = null;
                ArrayList arrayList20 = null;
                while (parcel.dataPosition() < r015) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            i33 = b.h0(parcel, readInt15);
                            break;
                        case 2:
                            arrayList18 = b.J(parcel, readInt15, Image.CREATOR);
                            break;
                        case 3:
                            str24 = b.F(parcel, readInt15);
                            break;
                        case 4:
                            l18 = b.k0(parcel, readInt15);
                            break;
                        case 5:
                            i34 = b.h0(parcel, readInt15);
                            break;
                        case 6:
                            j14 = b.j0(parcel, readInt15);
                            break;
                        case 7:
                            uri9 = (Uri) b.E(parcel, readInt15, Uri.CREATOR);
                            break;
                        case '\b':
                            uri10 = (Uri) b.E(parcel, readInt15, Uri.CREATOR);
                            break;
                        case '\t':
                            l19 = b.k0(parcel, readInt15);
                            break;
                        case '\n':
                            i35 = b.h0(parcel, readInt15);
                            break;
                        case 11:
                            str25 = b.F(parcel, readInt15);
                            break;
                        case '\f':
                            j15 = b.j0(parcel, readInt15);
                            break;
                        case '\r':
                            arrayList19 = b.H(parcel, readInt15);
                            break;
                        case 14:
                            arrayList20 = b.H(parcel, readInt15);
                            break;
                        case 15:
                            z13 = b.a0(parcel, readInt15);
                            break;
                        default:
                            b.p0(parcel, readInt15);
                            break;
                    }
                }
                b.L(parcel, r015);
                return new MovieEntity(i33, arrayList18, str24, l18, i34, j14, uri9, uri10, l19, i35, str25, j15, arrayList19, arrayList20, z13);
            case 15:
                int r016 = b.r0(parcel);
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                boolean z14 = false;
                ArrayList arrayList21 = null;
                String str26 = null;
                Long l23 = null;
                Uri uri11 = null;
                Uri uri12 = null;
                String str27 = null;
                ArrayList arrayList22 = null;
                ArrayList arrayList23 = null;
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < r016) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i36 = b.h0(parcel, readInt16);
                            break;
                        case 2:
                            arrayList21 = b.J(parcel, readInt16, Image.CREATOR);
                            break;
                        case 3:
                            str26 = b.F(parcel, readInt16);
                            break;
                        case 4:
                            l23 = b.k0(parcel, readInt16);
                            break;
                        case 5:
                            i37 = b.h0(parcel, readInt16);
                            break;
                        case 6:
                            j16 = b.j0(parcel, readInt16);
                            break;
                        case 7:
                            uri11 = (Uri) b.E(parcel, readInt16, Uri.CREATOR);
                            break;
                        case '\b':
                            uri12 = (Uri) b.E(parcel, readInt16, Uri.CREATOR);
                            break;
                        case '\t':
                            i38 = b.h0(parcel, readInt16);
                            break;
                        case '\n':
                            j17 = b.j0(parcel, readInt16);
                            break;
                        case 11:
                            i39 = b.h0(parcel, readInt16);
                            break;
                        case '\f':
                            str27 = b.F(parcel, readInt16);
                            break;
                        case '\r':
                            arrayList22 = b.H(parcel, readInt16);
                            break;
                        case 14:
                            arrayList23 = b.H(parcel, readInt16);
                            break;
                        case 15:
                            j18 = b.j0(parcel, readInt16);
                            break;
                        case 16:
                            str28 = b.F(parcel, readInt16);
                            break;
                        case 17:
                            str29 = b.F(parcel, readInt16);
                            break;
                        case 18:
                            z14 = b.a0(parcel, readInt16);
                            break;
                        default:
                            b.p0(parcel, readInt16);
                            break;
                    }
                }
                b.L(parcel, r016);
                return new TvEpisodeEntity(i36, arrayList21, str26, l23, i37, j16, uri11, uri12, i38, j17, i39, str27, arrayList22, arrayList23, j18, str28, str29, z14);
            case 16:
                int r017 = b.r0(parcel);
                long j19 = 0;
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                ArrayList arrayList24 = null;
                String str30 = null;
                Long l24 = null;
                Uri uri13 = null;
                Uri uri14 = null;
                Long l25 = null;
                Long l26 = null;
                String str31 = null;
                ArrayList arrayList25 = null;
                ArrayList arrayList26 = null;
                while (parcel.dataPosition() < r017) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i43 = b.h0(parcel, readInt17);
                            break;
                        case 2:
                            arrayList24 = b.J(parcel, readInt17, Image.CREATOR);
                            break;
                        case 3:
                            str30 = b.F(parcel, readInt17);
                            break;
                        case 4:
                            l24 = b.k0(parcel, readInt17);
                            break;
                        case 5:
                            i44 = b.h0(parcel, readInt17);
                            break;
                        case 6:
                            j19 = b.j0(parcel, readInt17);
                            break;
                        case 7:
                            uri13 = (Uri) b.E(parcel, readInt17, Uri.CREATOR);
                            break;
                        case '\b':
                            uri14 = (Uri) b.E(parcel, readInt17, Uri.CREATOR);
                            break;
                        case '\t':
                            i45 = b.h0(parcel, readInt17);
                            break;
                        case '\n':
                            l25 = b.k0(parcel, readInt17);
                            break;
                        case 11:
                            l26 = b.k0(parcel, readInt17);
                            break;
                        case '\f':
                            i46 = b.h0(parcel, readInt17);
                            break;
                        case '\r':
                            str31 = b.F(parcel, readInt17);
                            break;
                        case 14:
                            i47 = b.h0(parcel, readInt17);
                            break;
                        case 15:
                            arrayList25 = b.H(parcel, readInt17);
                            break;
                        case 16:
                            arrayList26 = b.H(parcel, readInt17);
                            break;
                        default:
                            b.p0(parcel, readInt17);
                            break;
                    }
                }
                b.L(parcel, r017);
                return new TvSeasonEntity(i43, arrayList24, str30, l24, i44, j19, uri13, uri14, i45, l25, l26, i46, str31, i47, arrayList25, arrayList26);
            case 17:
                int r018 = b.r0(parcel);
                long j23 = 0;
                int i48 = 0;
                int i49 = 0;
                int i53 = 0;
                int i54 = 0;
                ArrayList arrayList27 = null;
                String str32 = null;
                Long l27 = null;
                Uri uri15 = null;
                Uri uri16 = null;
                Long l28 = null;
                Long l29 = null;
                String str33 = null;
                ArrayList arrayList28 = null;
                ArrayList arrayList29 = null;
                while (parcel.dataPosition() < r018) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            i48 = b.h0(parcel, readInt18);
                            break;
                        case 2:
                            arrayList27 = b.J(parcel, readInt18, Image.CREATOR);
                            break;
                        case 3:
                            str32 = b.F(parcel, readInt18);
                            break;
                        case 4:
                            l27 = b.k0(parcel, readInt18);
                            break;
                        case 5:
                            i49 = b.h0(parcel, readInt18);
                            break;
                        case 6:
                            j23 = b.j0(parcel, readInt18);
                            break;
                        case 7:
                            uri15 = (Uri) b.E(parcel, readInt18, Uri.CREATOR);
                            break;
                        case '\b':
                            uri16 = (Uri) b.E(parcel, readInt18, Uri.CREATOR);
                            break;
                        case '\t':
                            l28 = b.k0(parcel, readInt18);
                            break;
                        case '\n':
                            l29 = b.k0(parcel, readInt18);
                            break;
                        case 11:
                            i53 = b.h0(parcel, readInt18);
                            break;
                        case '\f':
                            str33 = b.F(parcel, readInt18);
                            break;
                        case '\r':
                            i54 = b.h0(parcel, readInt18);
                            break;
                        case 14:
                            arrayList28 = b.H(parcel, readInt18);
                            break;
                        case 15:
                            arrayList29 = b.H(parcel, readInt18);
                            break;
                        default:
                            b.p0(parcel, readInt18);
                            break;
                    }
                }
                b.L(parcel, r018);
                return new TvShowEntity(i48, arrayList27, str32, l27, i49, j23, uri15, uri16, l28, l29, i53, str33, i54, arrayList28, arrayList29);
            case 18:
                int r019 = b.r0(parcel);
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                int i55 = 0;
                int i56 = 0;
                boolean z15 = false;
                ArrayList arrayList30 = null;
                String str34 = null;
                Long l33 = null;
                Uri uri17 = null;
                String str35 = null;
                String str36 = null;
                Image image3 = null;
                while (parcel.dataPosition() < r019) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i55 = b.h0(parcel, readInt19);
                            break;
                        case 2:
                            arrayList30 = b.J(parcel, readInt19, Image.CREATOR);
                            break;
                        case 3:
                            str34 = b.F(parcel, readInt19);
                            break;
                        case 4:
                            l33 = b.k0(parcel, readInt19);
                            break;
                        case 5:
                            i56 = b.h0(parcel, readInt19);
                            break;
                        case 6:
                            j24 = b.j0(parcel, readInt19);
                            break;
                        case 7:
                            uri17 = (Uri) b.E(parcel, readInt19, Uri.CREATOR);
                            break;
                        case '\b':
                            j25 = b.j0(parcel, readInt19);
                            break;
                        case '\t':
                            j26 = b.j0(parcel, readInt19);
                            break;
                        case '\n':
                            str35 = b.F(parcel, readInt19);
                            break;
                        case 11:
                            str36 = b.F(parcel, readInt19);
                            break;
                        case '\f':
                            z15 = b.a0(parcel, readInt19);
                            break;
                        case '\r':
                            image3 = (Image) b.E(parcel, readInt19, Image.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt19);
                            break;
                    }
                }
                b.L(parcel, r019);
                return new VideoClipEntity(i55, arrayList30, str34, l33, i56, j24, uri17, j25, j26, str35, str36, z15, image3);
            case 19:
                int r020 = b.r0(parcel);
                HashSet hashSet = new HashSet();
                int i57 = 0;
                int i58 = 0;
                ArrayList arrayList31 = null;
                zzs zzsVar = null;
                while (parcel.dataPosition() < r020) {
                    int readInt20 = parcel.readInt();
                    char c19 = (char) readInt20;
                    if (c19 == 1) {
                        i57 = b.h0(parcel, readInt20);
                        hashSet.add(1);
                    } else if (c19 == 2) {
                        arrayList31 = b.J(parcel, readInt20, zzu.CREATOR);
                        hashSet.add(2);
                    } else if (c19 == 3) {
                        i58 = b.h0(parcel, readInt20);
                        hashSet.add(3);
                    } else if (c19 != 4) {
                        b.p0(parcel, readInt20);
                    } else {
                        zzsVar = (zzs) b.E(parcel, readInt20, zzs.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == r020) {
                    return new zzo(hashSet, i57, arrayList31, i58, zzsVar);
                }
                throw new SafeParcelReader$ParseException(a.a.d("Overread allowed size end=", r020), parcel);
            case 20:
                int r021 = b.r0(parcel);
                int i59 = 0;
                ArrayList arrayList32 = null;
                ArrayList arrayList33 = null;
                ArrayList arrayList34 = null;
                ArrayList arrayList35 = null;
                ArrayList arrayList36 = null;
                while (parcel.dataPosition() < r021) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i59 = b.h0(parcel, readInt21);
                            break;
                        case 2:
                            arrayList32 = b.H(parcel, readInt21);
                            break;
                        case 3:
                            arrayList33 = b.H(parcel, readInt21);
                            break;
                        case 4:
                            arrayList34 = b.H(parcel, readInt21);
                            break;
                        case 5:
                            arrayList35 = b.H(parcel, readInt21);
                            break;
                        case 6:
                            arrayList36 = b.H(parcel, readInt21);
                            break;
                        default:
                            b.p0(parcel, readInt21);
                            break;
                    }
                }
                b.L(parcel, r021);
                return new zzs(i59, arrayList32, arrayList33, arrayList34, arrayList35, arrayList36);
            case 21:
                int r022 = b.r0(parcel);
                HashSet hashSet2 = new HashSet();
                int i63 = 0;
                zzw zzwVar = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                while (parcel.dataPosition() < r022) {
                    int readInt22 = parcel.readInt();
                    char c23 = (char) readInt22;
                    if (c23 == 1) {
                        i63 = b.h0(parcel, readInt22);
                        hashSet2.add(1);
                    } else if (c23 == 2) {
                        zzwVar = (zzw) b.E(parcel, readInt22, zzw.CREATOR);
                        hashSet2.add(2);
                    } else if (c23 == 3) {
                        str37 = b.F(parcel, readInt22);
                        hashSet2.add(3);
                    } else if (c23 == c13) {
                        str38 = b.F(parcel, readInt22);
                        hashSet2.add(4);
                    } else if (c23 != 5) {
                        b.p0(parcel, readInt22);
                    } else {
                        str39 = b.F(parcel, readInt22);
                        hashSet2.add(5);
                    }
                    c13 = 4;
                }
                if (parcel.dataPosition() == r022) {
                    return new zzu(hashSet2, i63, zzwVar, str37, str38, str39);
                }
                throw new SafeParcelReader$ParseException(a.a.d("Overread allowed size end=", r022), parcel);
            case 22:
                int r023 = b.r0(parcel);
                HashSet hashSet3 = new HashSet();
                int i64 = 0;
                int i65 = 0;
                String str40 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                while (parcel.dataPosition() < r023) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            i64 = b.h0(parcel, readInt23);
                            hashSet3.add(1);
                            break;
                        case 2:
                            str40 = b.F(parcel, readInt23);
                            hashSet3.add(2);
                            break;
                        case 3:
                            i65 = b.h0(parcel, readInt23);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArr = b.C(parcel, readInt23);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) b.E(parcel, readInt23, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) b.E(parcel, readInt23, DeviceMetaData.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            b.p0(parcel, readInt23);
                            break;
                    }
                }
                if (parcel.dataPosition() == r023) {
                    return new zzw(hashSet3, i64, str40, i65, bArr, pendingIntent, deviceMetaData);
                }
                throw new SafeParcelReader$ParseException(a.a.d("Overread allowed size end=", r023), parcel);
            case 23:
                int r024 = b.r0(parcel);
                long j27 = 0;
                int i66 = 0;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < r024) {
                    int readInt24 = parcel.readInt();
                    char c24 = (char) readInt24;
                    if (c24 == 1) {
                        i66 = b.h0(parcel, readInt24);
                    } else if (c24 == 2) {
                        z16 = b.a0(parcel, readInt24);
                    } else if (c24 == 3) {
                        j27 = b.j0(parcel, readInt24);
                    } else if (c24 != 4) {
                        b.p0(parcel, readInt24);
                    } else {
                        z17 = b.a0(parcel, readInt24);
                    }
                }
                b.L(parcel, r024);
                return new DeviceMetaData(i66, z16, j27, z17);
            case 24:
                int r025 = b.r0(parcel);
                boolean z18 = false;
                boolean z19 = false;
                boolean z23 = false;
                ArrayList arrayList37 = null;
                String str41 = null;
                Account account = null;
                String str42 = null;
                String str43 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < r025) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            arrayList37 = b.J(parcel, readInt25, Scope.CREATOR);
                            break;
                        case 2:
                            str41 = b.F(parcel, readInt25);
                            break;
                        case 3:
                            z18 = b.a0(parcel, readInt25);
                            break;
                        case 4:
                            z19 = b.a0(parcel, readInt25);
                            break;
                        case 5:
                            account = (Account) b.E(parcel, readInt25, Account.CREATOR);
                            break;
                        case 6:
                            str42 = b.F(parcel, readInt25);
                            break;
                        case 7:
                            str43 = b.F(parcel, readInt25);
                            break;
                        case '\b':
                            z23 = b.a0(parcel, readInt25);
                            break;
                        case '\t':
                            bundle = b.B(parcel, readInt25);
                            break;
                        default:
                            b.p0(parcel, readInt25);
                            break;
                    }
                }
                b.L(parcel, r025);
                return new AuthorizationRequest(arrayList37, str41, z18, z19, account, str42, str43, z23, bundle);
            case 25:
                int r026 = b.r0(parcel);
                String str44 = null;
                String str45 = null;
                String str46 = null;
                ArrayList arrayList38 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < r026) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            str44 = b.F(parcel, readInt26);
                            break;
                        case 2:
                            str45 = b.F(parcel, readInt26);
                            break;
                        case 3:
                            str46 = b.F(parcel, readInt26);
                            break;
                        case 4:
                            arrayList38 = b.H(parcel, readInt26);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) b.E(parcel, readInt26, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) b.E(parcel, readInt26, PendingIntent.CREATOR);
                            break;
                        default:
                            b.p0(parcel, readInt26);
                            break;
                    }
                }
                b.L(parcel, r026);
                return new AuthorizationResult(str44, str45, str46, arrayList38, googleSignInAccount, pendingIntent2);
            case 26:
                int r027 = b.r0(parcel);
                int i67 = 0;
                while (parcel.dataPosition() < r027) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        b.p0(parcel, readInt27);
                    } else {
                        i67 = b.h0(parcel, readInt27);
                    }
                }
                b.L(parcel, r027);
                return new GetPhoneNumberHintIntentRequest(i67);
            case 27:
                int r028 = b.r0(parcel);
                boolean z24 = false;
                int i68 = 0;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                while (parcel.dataPosition() < r028) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            str47 = b.F(parcel, readInt28);
                            break;
                        case 2:
                            str48 = b.F(parcel, readInt28);
                            break;
                        case 3:
                            str49 = b.F(parcel, readInt28);
                            break;
                        case 4:
                            str50 = b.F(parcel, readInt28);
                            break;
                        case 5:
                            z24 = b.a0(parcel, readInt28);
                            break;
                        case 6:
                            i68 = b.h0(parcel, readInt28);
                            break;
                        default:
                            b.p0(parcel, readInt28);
                            break;
                    }
                }
                b.L(parcel, r028);
                return new GetSignInIntentRequest(str47, str48, str49, str50, z24, i68);
            case 28:
                int r029 = b.r0(parcel);
                int i69 = 0;
                PendingIntent pendingIntent3 = null;
                String str51 = null;
                String str52 = null;
                ArrayList arrayList39 = null;
                String str53 = null;
                while (parcel.dataPosition() < r029) {
                    int readInt29 = parcel.readInt();
                    switch ((char) readInt29) {
                        case 1:
                            pendingIntent3 = (PendingIntent) b.E(parcel, readInt29, PendingIntent.CREATOR);
                            break;
                        case 2:
                            str51 = b.F(parcel, readInt29);
                            break;
                        case 3:
                            str52 = b.F(parcel, readInt29);
                            break;
                        case 4:
                            arrayList39 = b.H(parcel, readInt29);
                            break;
                        case 5:
                            str53 = b.F(parcel, readInt29);
                            break;
                        case 6:
                            i69 = b.h0(parcel, readInt29);
                            break;
                        default:
                            b.p0(parcel, readInt29);
                            break;
                    }
                }
                b.L(parcel, r029);
                return new SaveAccountLinkingTokenRequest(pendingIntent3, str51, str52, arrayList39, str53, i69);
            default:
                int r030 = b.r0(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < r030) {
                    int readInt30 = parcel.readInt();
                    if (((char) readInt30) != 1) {
                        b.p0(parcel, readInt30);
                    } else {
                        pendingIntent4 = (PendingIntent) b.E(parcel, readInt30, PendingIntent.CREATOR);
                    }
                }
                b.L(parcel, r030);
                return new SaveAccountLinkingTokenResult(pendingIntent4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f125782a) {
            case 0:
                return new StoreEntity[i13];
            case 1:
                return new ClusterList[i13];
            case 2:
                return new ClusterMetadata[i13];
            case 3:
                return new ShoppingCart[i13];
            case 4:
                return new ShoppingEntity[i13];
            case 5:
                return new ShoppingList[i13];
            case 6:
                return new ShoppingReorderCluster[i13];
            case 7:
                return new GenericPost[i13];
            case 8:
                return new Interaction[i13];
            case 9:
                return new PortraitMediaEntity[i13];
            case 10:
                return new PortraitMediaPost[i13];
            case 11:
                return new Profile[i13];
            case 12:
                return new SocialPostEntity[i13];
            case 13:
                return new LiveStreamingVideoEntity[i13];
            case 14:
                return new MovieEntity[i13];
            case 15:
                return new TvEpisodeEntity[i13];
            case 16:
                return new TvSeasonEntity[i13];
            case 17:
                return new TvShowEntity[i13];
            case 18:
                return new VideoClipEntity[i13];
            case 19:
                return new zzo[i13];
            case 20:
                return new zzs[i13];
            case 21:
                return new zzu[i13];
            case 22:
                return new zzw[i13];
            case 23:
                return new DeviceMetaData[i13];
            case 24:
                return new AuthorizationRequest[i13];
            case 25:
                return new AuthorizationResult[i13];
            case 26:
                return new GetPhoneNumberHintIntentRequest[i13];
            case 27:
                return new GetSignInIntentRequest[i13];
            case 28:
                return new SaveAccountLinkingTokenRequest[i13];
            default:
                return new SaveAccountLinkingTokenResult[i13];
        }
    }
}
