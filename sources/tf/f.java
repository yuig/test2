package tf;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.data.Entry;
import com.google.android.engage.audio.datamodel.LiveRadioStationEntity;
import com.google.android.engage.audio.datamodel.MusicAlbumEntity;
import com.google.android.engage.audio.datamodel.MusicArtistEntity;
import com.google.android.engage.audio.datamodel.MusicTrackEntity;
import com.google.android.engage.audio.datamodel.MusicVideoEntity;
import com.google.android.engage.audio.datamodel.PlaylistEntity;
import com.google.android.engage.audio.datamodel.PodcastEpisodeEntity;
import com.google.android.engage.audio.datamodel.PodcastSeriesEntity;
import com.google.android.engage.books.datamodel.AudiobookEntity;
import com.google.android.engage.books.datamodel.BookSeriesEntity;
import com.google.android.engage.books.datamodel.EbookEntity;
import com.google.android.engage.common.datamodel.BaseCluster;
import com.google.android.engage.common.datamodel.ContinuationCluster;
import com.google.android.engage.common.datamodel.DisplayTimeWindow;
import com.google.android.engage.common.datamodel.EngagementCluster;
import com.google.android.engage.common.datamodel.Entity;
import com.google.android.engage.common.datamodel.FeaturedCluster;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.engage.common.datamodel.LinkPreview;
import com.google.android.engage.common.datamodel.Price;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.engage.common.datamodel.RecommendationCluster;
import com.google.android.engage.common.datamodel.SignInCardEntity;
import com.google.android.engage.food.datamodel.FoodReorderCluster;
import com.google.android.engage.food.datamodel.FoodShoppingCart;
import com.google.android.engage.food.datamodel.FoodShoppingList;
import com.google.android.engage.food.datamodel.ProductEntity;
import com.google.android.engage.food.datamodel.RecipeEntity;
import java.util.ArrayList;
import pk.h1;

/* loaded from: classes3.dex */
public final class f implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f117531a;

    public /* synthetic */ f(int i13) {
        this.f117531a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i13 = 0;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        Long l13 = null;
        switch (this.f117531a) {
            case 0:
                Entry entry = new Entry();
                entry.f117501a = 0.0f;
                entry.f117502b = null;
                entry.f30176c = 0.0f;
                entry.f30176c = parcel.readFloat();
                entry.f117501a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    entry.f117502b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return entry;
            case 1:
            default:
                int r03 = bf.b.r0(parcel);
                int i14 = 0;
                ArrayList arrayList4 = null;
                Uri uri2 = null;
                String str3 = null;
                Rating rating = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i14 = bf.b.h0(parcel, readInt);
                            break;
                        case 2:
                            arrayList4 = bf.b.J(parcel, readInt, Image.CREATOR);
                            break;
                        case 3:
                            uri2 = (Uri) bf.b.E(parcel, readInt, Uri.CREATOR);
                            break;
                        case 4:
                            str3 = bf.b.F(parcel, readInt);
                            break;
                        case 5:
                            rating = (Rating) bf.b.E(parcel, readInt, Rating.CREATOR);
                            break;
                        case 6:
                            str4 = bf.b.F(parcel, readInt);
                            break;
                        case 7:
                            str5 = bf.b.F(parcel, readInt);
                            break;
                        case '\b':
                            str6 = bf.b.F(parcel, readInt);
                            break;
                        case '\t':
                            str7 = bf.b.F(parcel, readInt);
                            break;
                        case '\n':
                            str8 = bf.b.F(parcel, readInt);
                            break;
                        default:
                            bf.b.p0(parcel, readInt);
                            break;
                    }
                }
                bf.b.L(parcel, r03);
                return new RecipeEntity(i14, arrayList4, uri2, str3, rating, str4, str5, str6, str7, str8);
            case 2:
                int r04 = bf.b.r0(parcel);
                int i15 = 0;
                ArrayList arrayList5 = null;
                String str9 = null;
                Long l14 = null;
                String str10 = null;
                Uri uri3 = null;
                Uri uri4 = null;
                ArrayList arrayList6 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < r04) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i15 = bf.b.h0(parcel, readInt2);
                            break;
                        case 2:
                            arrayList5 = bf.b.J(parcel, readInt2, Image.CREATOR);
                            break;
                        case 3:
                            str9 = bf.b.F(parcel, readInt2);
                            break;
                        case 4:
                            l14 = bf.b.k0(parcel, readInt2);
                            break;
                        case 5:
                            str10 = bf.b.F(parcel, readInt2);
                            break;
                        case 6:
                            uri3 = (Uri) bf.b.E(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 7:
                            uri4 = (Uri) bf.b.E(parcel, readInt2, Uri.CREATOR);
                            break;
                        case '\b':
                            arrayList6 = bf.b.H(parcel, readInt2);
                            break;
                        case '\t':
                            str11 = bf.b.F(parcel, readInt2);
                            break;
                        case '\n':
                            str12 = bf.b.F(parcel, readInt2);
                            break;
                        default:
                            bf.b.p0(parcel, readInt2);
                            break;
                    }
                }
                bf.b.L(parcel, r04);
                return new LiveRadioStationEntity(i15, arrayList5, str9, l14, str10, uri3, uri4, arrayList6, str11, str12);
            case 3:
                int r05 = bf.b.r0(parcel);
                int i16 = 0;
                int i17 = 0;
                boolean z13 = false;
                int i18 = 0;
                ArrayList arrayList7 = null;
                String str13 = null;
                Long l15 = null;
                String str14 = null;
                Integer num = null;
                Uri uri5 = null;
                Uri uri6 = null;
                ArrayList arrayList8 = null;
                Integer num2 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                Long l16 = null;
                Long l17 = null;
                while (parcel.dataPosition() < r05) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i16 = bf.b.h0(parcel, readInt3);
                            break;
                        case 2:
                            arrayList7 = bf.b.J(parcel, readInt3, Image.CREATOR);
                            break;
                        case 3:
                            str13 = bf.b.F(parcel, readInt3);
                            break;
                        case 4:
                            l15 = bf.b.k0(parcel, readInt3);
                            break;
                        case 5:
                            str14 = bf.b.F(parcel, readInt3);
                            break;
                        case 6:
                            num = bf.b.i0(parcel, readInt3);
                            break;
                        case 7:
                            i17 = bf.b.h0(parcel, readInt3);
                            break;
                        case '\b':
                            uri5 = (Uri) bf.b.E(parcel, readInt3, Uri.CREATOR);
                            break;
                        case '\t':
                            uri6 = (Uri) bf.b.E(parcel, readInt3, Uri.CREATOR);
                            break;
                        case '\n':
                            arrayList8 = bf.b.H(parcel, readInt3);
                            break;
                        case 11:
                            num2 = bf.b.i0(parcel, readInt3);
                            break;
                        case '\f':
                            arrayList9 = bf.b.H(parcel, readInt3);
                            break;
                        case '\r':
                            arrayList10 = bf.b.H(parcel, readInt3);
                            break;
                        case 14:
                            arrayList11 = bf.b.H(parcel, readInt3);
                            break;
                        case 15:
                            l16 = bf.b.k0(parcel, readInt3);
                            break;
                        case 16:
                            l17 = bf.b.k0(parcel, readInt3);
                            break;
                        case 17:
                            z13 = bf.b.a0(parcel, readInt3);
                            break;
                        case 18:
                            i18 = bf.b.h0(parcel, readInt3);
                            break;
                        default:
                            bf.b.p0(parcel, readInt3);
                            break;
                    }
                }
                bf.b.L(parcel, r05);
                return new MusicAlbumEntity(i16, arrayList7, str13, l15, str14, num, i17, uri5, uri6, arrayList8, num2, arrayList9, arrayList10, arrayList11, l16, l17, z13, i18);
            case 4:
                int r06 = bf.b.r0(parcel);
                int i19 = 0;
                ArrayList arrayList12 = null;
                String str15 = null;
                Long l18 = null;
                String str16 = null;
                Uri uri7 = null;
                Uri uri8 = null;
                while (parcel.dataPosition() < r06) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i19 = bf.b.h0(parcel, readInt4);
                            break;
                        case 2:
                            arrayList12 = bf.b.J(parcel, readInt4, Image.CREATOR);
                            break;
                        case 3:
                            str15 = bf.b.F(parcel, readInt4);
                            break;
                        case 4:
                            l18 = bf.b.k0(parcel, readInt4);
                            break;
                        case 5:
                            str16 = bf.b.F(parcel, readInt4);
                            break;
                        case 6:
                            uri7 = (Uri) bf.b.E(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            uri8 = (Uri) bf.b.E(parcel, readInt4, Uri.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt4);
                            break;
                    }
                }
                bf.b.L(parcel, r06);
                return new MusicArtistEntity(i19, arrayList12, str15, l18, str16, uri7, uri8);
            case 5:
                int r07 = bf.b.r0(parcel);
                int i23 = 0;
                int i24 = 0;
                boolean z14 = false;
                ArrayList arrayList13 = null;
                String str17 = null;
                Long l19 = null;
                String str18 = null;
                Integer num3 = null;
                Uri uri9 = null;
                Long l23 = null;
                Uri uri10 = null;
                String str19 = null;
                ArrayList arrayList14 = null;
                ArrayList arrayList15 = null;
                while (parcel.dataPosition() < r07) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i23 = bf.b.h0(parcel, readInt5);
                            break;
                        case 2:
                            arrayList13 = bf.b.J(parcel, readInt5, Image.CREATOR);
                            break;
                        case 3:
                            str17 = bf.b.F(parcel, readInt5);
                            break;
                        case 4:
                            l19 = bf.b.k0(parcel, readInt5);
                            break;
                        case 5:
                            str18 = bf.b.F(parcel, readInt5);
                            break;
                        case 6:
                            num3 = bf.b.i0(parcel, readInt5);
                            break;
                        case 7:
                            i24 = bf.b.h0(parcel, readInt5);
                            break;
                        case '\b':
                            uri9 = (Uri) bf.b.E(parcel, readInt5, Uri.CREATOR);
                            break;
                        case '\t':
                            l23 = bf.b.k0(parcel, readInt5);
                            break;
                        case '\n':
                            uri10 = (Uri) bf.b.E(parcel, readInt5, Uri.CREATOR);
                            break;
                        case 11:
                            str19 = bf.b.F(parcel, readInt5);
                            break;
                        case '\f':
                            arrayList14 = bf.b.H(parcel, readInt5);
                            break;
                        case '\r':
                            arrayList15 = bf.b.H(parcel, readInt5);
                            break;
                        case 14:
                            z14 = bf.b.a0(parcel, readInt5);
                            break;
                        default:
                            bf.b.p0(parcel, readInt5);
                            break;
                    }
                }
                bf.b.L(parcel, r07);
                return new MusicTrackEntity(i23, arrayList13, str17, l19, str18, num3, i24, uri9, l23, uri10, str19, arrayList14, arrayList15, z14);
            case 6:
                int r08 = bf.b.r0(parcel);
                long j13 = 0;
                int i25 = 0;
                int i26 = 0;
                boolean z15 = false;
                ArrayList arrayList16 = null;
                String str20 = null;
                Long l24 = null;
                String str21 = null;
                Integer num4 = null;
                Uri uri11 = null;
                Uri uri12 = null;
                String str22 = null;
                ArrayList arrayList17 = null;
                ArrayList arrayList18 = null;
                while (parcel.dataPosition() < r08) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i25 = bf.b.h0(parcel, readInt6);
                            break;
                        case 2:
                            arrayList16 = bf.b.J(parcel, readInt6, Image.CREATOR);
                            break;
                        case 3:
                            str20 = bf.b.F(parcel, readInt6);
                            break;
                        case 4:
                            l24 = bf.b.k0(parcel, readInt6);
                            break;
                        case 5:
                            str21 = bf.b.F(parcel, readInt6);
                            break;
                        case 6:
                            num4 = bf.b.i0(parcel, readInt6);
                            break;
                        case 7:
                            i26 = bf.b.h0(parcel, readInt6);
                            break;
                        case '\b':
                            uri11 = (Uri) bf.b.E(parcel, readInt6, Uri.CREATOR);
                            break;
                        case '\t':
                            j13 = bf.b.j0(parcel, readInt6);
                            break;
                        case '\n':
                            uri12 = (Uri) bf.b.E(parcel, readInt6, Uri.CREATOR);
                            break;
                        case 11:
                            str22 = bf.b.F(parcel, readInt6);
                            break;
                        case '\f':
                            arrayList17 = bf.b.H(parcel, readInt6);
                            break;
                        case '\r':
                            arrayList18 = bf.b.H(parcel, readInt6);
                            break;
                        case 14:
                            z15 = bf.b.a0(parcel, readInt6);
                            break;
                        default:
                            bf.b.p0(parcel, readInt6);
                            break;
                    }
                }
                bf.b.L(parcel, r08);
                return new MusicVideoEntity(i25, arrayList16, str20, l24, str21, num4, i26, uri11, j13, uri12, str22, arrayList17, arrayList18, z15);
            case 7:
                int r09 = bf.b.r0(parcel);
                int i27 = 0;
                int i28 = 0;
                boolean z16 = false;
                ArrayList arrayList19 = null;
                String str23 = null;
                Long l25 = null;
                String str24 = null;
                Integer num5 = null;
                Uri uri13 = null;
                Integer num6 = null;
                Long l26 = null;
                Uri uri14 = null;
                ArrayList arrayList20 = null;
                while (parcel.dataPosition() < r09) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i27 = bf.b.h0(parcel, readInt7);
                            break;
                        case 2:
                            arrayList19 = bf.b.J(parcel, readInt7, Image.CREATOR);
                            break;
                        case 3:
                            str23 = bf.b.F(parcel, readInt7);
                            break;
                        case 4:
                            l25 = bf.b.k0(parcel, readInt7);
                            break;
                        case 5:
                            str24 = bf.b.F(parcel, readInt7);
                            break;
                        case 6:
                            num5 = bf.b.i0(parcel, readInt7);
                            break;
                        case 7:
                            i28 = bf.b.h0(parcel, readInt7);
                            break;
                        case '\b':
                            uri13 = (Uri) bf.b.E(parcel, readInt7, Uri.CREATOR);
                            break;
                        case '\t':
                            num6 = bf.b.i0(parcel, readInt7);
                            break;
                        case '\n':
                            l26 = bf.b.k0(parcel, readInt7);
                            break;
                        case 11:
                            uri14 = (Uri) bf.b.E(parcel, readInt7, Uri.CREATOR);
                            break;
                        case '\f':
                            arrayList20 = bf.b.H(parcel, readInt7);
                            break;
                        case '\r':
                            z16 = bf.b.a0(parcel, readInt7);
                            break;
                        default:
                            bf.b.p0(parcel, readInt7);
                            break;
                    }
                }
                bf.b.L(parcel, r09);
                return new PlaylistEntity(i27, arrayList19, str23, l25, str24, num5, i28, uri13, num6, l26, uri14, arrayList20, z16);
            case 8:
                int r010 = bf.b.r0(parcel);
                long j14 = 0;
                long j15 = 0;
                int i29 = 0;
                int i33 = 0;
                boolean z17 = false;
                ArrayList arrayList21 = null;
                String str25 = null;
                Long l27 = null;
                String str26 = null;
                Integer num7 = null;
                Uri uri15 = null;
                Uri uri16 = null;
                String str27 = null;
                String str28 = null;
                Integer num8 = null;
                ArrayList arrayList22 = null;
                ArrayList arrayList23 = null;
                ArrayList arrayList24 = null;
                while (parcel.dataPosition() < r010) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i29 = bf.b.h0(parcel, readInt8);
                            break;
                        case 2:
                            arrayList21 = bf.b.J(parcel, readInt8, Image.CREATOR);
                            break;
                        case 3:
                            str25 = bf.b.F(parcel, readInt8);
                            break;
                        case 4:
                            l27 = bf.b.k0(parcel, readInt8);
                            break;
                        case 5:
                            str26 = bf.b.F(parcel, readInt8);
                            break;
                        case 6:
                            num7 = bf.b.i0(parcel, readInt8);
                            break;
                        case 7:
                            i33 = bf.b.h0(parcel, readInt8);
                            break;
                        case '\b':
                            uri15 = (Uri) bf.b.E(parcel, readInt8, Uri.CREATOR);
                            break;
                        case '\t':
                            uri16 = (Uri) bf.b.E(parcel, readInt8, Uri.CREATOR);
                            break;
                        case '\n':
                            str27 = bf.b.F(parcel, readInt8);
                            break;
                        case 11:
                            str28 = bf.b.F(parcel, readInt8);
                            break;
                        case '\f':
                            j14 = bf.b.j0(parcel, readInt8);
                            break;
                        case '\r':
                            num8 = bf.b.i0(parcel, readInt8);
                            break;
                        case 14:
                            arrayList22 = bf.b.H(parcel, readInt8);
                            break;
                        case 15:
                            arrayList23 = bf.b.H(parcel, readInt8);
                            break;
                        case 16:
                            z17 = bf.b.a0(parcel, readInt8);
                            break;
                        case 17:
                            arrayList24 = bf.b.H(parcel, readInt8);
                            break;
                        case 18:
                            j15 = bf.b.j0(parcel, readInt8);
                            break;
                        default:
                            bf.b.p0(parcel, readInt8);
                            break;
                    }
                }
                bf.b.L(parcel, r010);
                return new PodcastEpisodeEntity(i29, arrayList21, str25, l27, str26, num7, i33, uri15, uri16, str27, str28, j14, num8, arrayList22, arrayList23, z17, arrayList24, j15);
            case 9:
                int r011 = bf.b.r0(parcel);
                int i34 = 0;
                boolean z18 = false;
                ArrayList arrayList25 = null;
                String str29 = null;
                Long l28 = null;
                String str30 = null;
                Uri uri17 = null;
                Uri uri18 = null;
                Integer num9 = null;
                String str31 = null;
                ArrayList arrayList26 = null;
                ArrayList arrayList27 = null;
                ArrayList arrayList28 = null;
                while (parcel.dataPosition() < r011) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i34 = bf.b.h0(parcel, readInt9);
                            break;
                        case 2:
                            arrayList25 = bf.b.J(parcel, readInt9, Image.CREATOR);
                            break;
                        case 3:
                            str29 = bf.b.F(parcel, readInt9);
                            break;
                        case 4:
                            l28 = bf.b.k0(parcel, readInt9);
                            break;
                        case 5:
                            str30 = bf.b.F(parcel, readInt9);
                            break;
                        case 6:
                            uri17 = (Uri) bf.b.E(parcel, readInt9, Uri.CREATOR);
                            break;
                        case 7:
                            uri18 = (Uri) bf.b.E(parcel, readInt9, Uri.CREATOR);
                            break;
                        case '\b':
                            num9 = bf.b.i0(parcel, readInt9);
                            break;
                        case '\t':
                            str31 = bf.b.F(parcel, readInt9);
                            break;
                        case '\n':
                            arrayList26 = bf.b.H(parcel, readInt9);
                            break;
                        case 11:
                            arrayList27 = bf.b.H(parcel, readInt9);
                            break;
                        case '\f':
                            z18 = bf.b.a0(parcel, readInt9);
                            break;
                        case '\r':
                            arrayList28 = bf.b.H(parcel, readInt9);
                            break;
                        default:
                            bf.b.p0(parcel, readInt9);
                            break;
                    }
                }
                bf.b.L(parcel, r011);
                return new PodcastSeriesEntity(i34, arrayList25, str29, l28, str30, uri17, uri18, num9, str31, arrayList26, arrayList27, z18, arrayList28);
            case 10:
                int r012 = bf.b.r0(parcel);
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                boolean z19 = false;
                ArrayList arrayList29 = null;
                String str32 = null;
                Long l29 = null;
                Uri uri19 = null;
                ArrayList arrayList30 = null;
                ArrayList arrayList31 = null;
                Long l33 = null;
                String str33 = null;
                Long l34 = null;
                Price price = null;
                ArrayList arrayList32 = null;
                String str34 = null;
                Integer num10 = null;
                Rating rating2 = null;
                ArrayList arrayList33 = null;
                while (parcel.dataPosition() < r012) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i35 = bf.b.h0(parcel, readInt10);
                            break;
                        case 2:
                            arrayList29 = bf.b.J(parcel, readInt10, Image.CREATOR);
                            break;
                        case 3:
                            str32 = bf.b.F(parcel, readInt10);
                            break;
                        case 4:
                            l29 = bf.b.k0(parcel, readInt10);
                            break;
                        case 5:
                            uri19 = (Uri) bf.b.E(parcel, readInt10, Uri.CREATOR);
                            break;
                        case 6:
                            i36 = bf.b.h0(parcel, readInt10);
                            break;
                        case 7:
                            arrayList30 = bf.b.H(parcel, readInt10);
                            break;
                        case '\b':
                            arrayList31 = bf.b.H(parcel, readInt10);
                            break;
                        case '\t':
                            l33 = bf.b.k0(parcel, readInt10);
                            break;
                        case '\n':
                            str33 = bf.b.F(parcel, readInt10);
                            break;
                        case 11:
                            l34 = bf.b.k0(parcel, readInt10);
                            break;
                        case '\f':
                            price = (Price) bf.b.E(parcel, readInt10, Price.CREATOR);
                            break;
                        case '\r':
                            arrayList32 = bf.b.H(parcel, readInt10);
                            break;
                        case 14:
                            str34 = bf.b.F(parcel, readInt10);
                            break;
                        case 15:
                            num10 = bf.b.i0(parcel, readInt10);
                            break;
                        case 16:
                            rating2 = (Rating) bf.b.E(parcel, readInt10, Rating.CREATOR);
                            break;
                        case 17:
                            i37 = bf.b.h0(parcel, readInt10);
                            break;
                        case 18:
                            z19 = bf.b.a0(parcel, readInt10);
                            break;
                        case 19:
                            arrayList33 = bf.b.J(parcel, readInt10, DisplayTimeWindow.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt10);
                            break;
                    }
                }
                bf.b.L(parcel, r012);
                return new AudiobookEntity(i35, arrayList29, str32, l29, uri19, i36, arrayList30, arrayList31, l33, str33, l34, price, arrayList32, str34, num10, rating2, i37, z19, arrayList33);
            case 11:
                int r013 = bf.b.r0(parcel);
                int i38 = 0;
                int i39 = 0;
                int i43 = 0;
                int i44 = 0;
                boolean z23 = false;
                ArrayList arrayList34 = null;
                String str35 = null;
                Long l35 = null;
                Uri uri20 = null;
                ArrayList arrayList35 = null;
                String str36 = null;
                ArrayList arrayList36 = null;
                Rating rating3 = null;
                ArrayList arrayList37 = null;
                while (parcel.dataPosition() < r013) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    switch (c13) {
                        case 1:
                            i38 = bf.b.h0(parcel, readInt11);
                            break;
                        case 2:
                            arrayList34 = bf.b.J(parcel, readInt11, Image.CREATOR);
                            break;
                        case 3:
                            str35 = bf.b.F(parcel, readInt11);
                            break;
                        case 4:
                            l35 = bf.b.k0(parcel, readInt11);
                            break;
                        case 5:
                            uri20 = (Uri) bf.b.E(parcel, readInt11, Uri.CREATOR);
                            break;
                        case 6:
                            i39 = bf.b.h0(parcel, readInt11);
                            break;
                        case 7:
                            arrayList35 = bf.b.H(parcel, readInt11);
                            break;
                        case '\b':
                            str36 = bf.b.F(parcel, readInt11);
                            break;
                        case '\t':
                            arrayList36 = bf.b.H(parcel, readInt11);
                            break;
                        case '\n':
                            i43 = bf.b.h0(parcel, readInt11);
                            break;
                        default:
                            switch (c13) {
                                case 16:
                                    rating3 = (Rating) bf.b.E(parcel, readInt11, Rating.CREATOR);
                                    break;
                                case 17:
                                    i44 = bf.b.h0(parcel, readInt11);
                                    break;
                                case 18:
                                    z23 = bf.b.a0(parcel, readInt11);
                                    break;
                                case 19:
                                    arrayList37 = bf.b.J(parcel, readInt11, DisplayTimeWindow.CREATOR);
                                    break;
                                default:
                                    bf.b.p0(parcel, readInt11);
                                    break;
                            }
                    }
                }
                bf.b.L(parcel, r013);
                return new BookSeriesEntity(i38, arrayList34, str35, l35, uri20, i39, arrayList35, str36, arrayList36, i43, rating3, i44, z23, arrayList37);
            case 12:
                int r014 = bf.b.r0(parcel);
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                boolean z24 = false;
                ArrayList arrayList38 = null;
                String str37 = null;
                Long l36 = null;
                Uri uri21 = null;
                ArrayList arrayList39 = null;
                Long l37 = null;
                String str38 = null;
                Integer num11 = null;
                Price price2 = null;
                ArrayList arrayList40 = null;
                String str39 = null;
                Integer num12 = null;
                Rating rating4 = null;
                ArrayList arrayList41 = null;
                while (parcel.dataPosition() < r014) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i45 = bf.b.h0(parcel, readInt12);
                            break;
                        case 2:
                            arrayList38 = bf.b.J(parcel, readInt12, Image.CREATOR);
                            break;
                        case 3:
                            str37 = bf.b.F(parcel, readInt12);
                            break;
                        case 4:
                            l36 = bf.b.k0(parcel, readInt12);
                            break;
                        case 5:
                            uri21 = (Uri) bf.b.E(parcel, readInt12, Uri.CREATOR);
                            break;
                        case 6:
                            i46 = bf.b.h0(parcel, readInt12);
                            break;
                        case 7:
                            arrayList39 = bf.b.H(parcel, readInt12);
                            break;
                        case '\b':
                            l37 = bf.b.k0(parcel, readInt12);
                            break;
                        case '\t':
                            str38 = bf.b.F(parcel, readInt12);
                            break;
                        case '\n':
                            num11 = bf.b.i0(parcel, readInt12);
                            break;
                        case 11:
                            price2 = (Price) bf.b.E(parcel, readInt12, Price.CREATOR);
                            break;
                        case '\f':
                            arrayList40 = bf.b.H(parcel, readInt12);
                            break;
                        case '\r':
                            str39 = bf.b.F(parcel, readInt12);
                            break;
                        case 14:
                            num12 = bf.b.i0(parcel, readInt12);
                            break;
                        case 15:
                        default:
                            bf.b.p0(parcel, readInt12);
                            break;
                        case 16:
                            rating4 = (Rating) bf.b.E(parcel, readInt12, Rating.CREATOR);
                            break;
                        case 17:
                            i47 = bf.b.h0(parcel, readInt12);
                            break;
                        case 18:
                            z24 = bf.b.a0(parcel, readInt12);
                            break;
                        case 19:
                            arrayList41 = bf.b.J(parcel, readInt12, DisplayTimeWindow.CREATOR);
                            break;
                    }
                }
                bf.b.L(parcel, r014);
                return new EbookEntity(i45, arrayList38, str37, l36, uri21, i46, arrayList39, l37, str38, num11, price2, arrayList40, str39, num12, rating4, i47, z24, arrayList41);
            case 13:
                return com.google.android.engage.common.datamodel.c.a(parcel);
            case 14:
                int r015 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r015) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 1) {
                        i13 = bf.b.h0(parcel, readInt13);
                    } else if (c14 != 2) {
                        bf.b.p0(parcel, readInt13);
                    } else {
                        arrayList = bf.b.J(parcel, readInt13, Entity.CREATOR);
                    }
                }
                bf.b.L(parcel, r015);
                return new ContinuationCluster(i13, arrayList);
            case 15:
                int r016 = bf.b.r0(parcel);
                Long l38 = null;
                while (parcel.dataPosition() < r016) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 1) {
                        l13 = bf.b.k0(parcel, readInt14);
                    } else if (c15 != 2) {
                        bf.b.p0(parcel, readInt14);
                    } else {
                        l38 = bf.b.k0(parcel, readInt14);
                    }
                }
                bf.b.L(parcel, r016);
                return new DisplayTimeWindow(l13, l38);
            case 16:
                int r017 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r017) {
                    int readInt15 = parcel.readInt();
                    char c16 = (char) readInt15;
                    if (c16 == 1) {
                        i13 = bf.b.h0(parcel, readInt15);
                    } else if (c16 != 2) {
                        bf.b.p0(parcel, readInt15);
                    } else {
                        arrayList3 = bf.b.J(parcel, readInt15, Entity.CREATOR);
                    }
                }
                bf.b.L(parcel, r017);
                return new EngagementCluster(i13, arrayList3);
            case 17:
                h1 h1Var = com.google.android.engage.common.datamodel.e.f30278a;
                int dataPosition = parcel.dataPosition();
                while (parcel.dataPosition() < parcel.dataSize()) {
                    try {
                        int readInt16 = parcel.readInt();
                        char c17 = (char) readInt16;
                        if (c17 == 1) {
                            int h03 = bf.b.h0(parcel, readInt16);
                            parcel.setDataPosition(dataPosition);
                            Parcelable.Creator creator = (Parcelable.Creator) com.google.android.engage.common.datamodel.e.f30278a.get(Integer.valueOf(h03));
                            if (creator != null) {
                                return (Entity) creator.createFromParcel(parcel);
                            }
                            throw new IllegalArgumentException("Invalid input Parcel");
                        }
                        bf.b.p0(parcel, c17);
                    } catch (RuntimeException e13) {
                        throw new IllegalArgumentException("Invalid input Parcel", e13);
                    }
                }
                throw new IllegalArgumentException("Invalid input Parcel");
            case 18:
                int r018 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r018) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 1) {
                        i13 = bf.b.h0(parcel, readInt17);
                    } else if (c18 != 2) {
                        bf.b.p0(parcel, readInt17);
                    } else {
                        arrayList2 = bf.b.J(parcel, readInt17, Entity.CREATOR);
                    }
                }
                bf.b.L(parcel, r018);
                return new FeaturedCluster(i13, arrayList2);
            case 19:
                int r019 = bf.b.r0(parcel);
                int i48 = 0;
                while (parcel.dataPosition() < r019) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        uri = (Uri) bf.b.E(parcel, readInt18, Uri.CREATOR);
                    } else if (c19 == 2) {
                        i13 = bf.b.h0(parcel, readInt18);
                    } else if (c19 != 3) {
                        bf.b.p0(parcel, readInt18);
                    } else {
                        i48 = bf.b.h0(parcel, readInt18);
                    }
                }
                bf.b.L(parcel, r019);
                return new Image(uri, i13, i48);
            case 20:
                int r020 = bf.b.r0(parcel);
                String str40 = null;
                Image image = null;
                while (parcel.dataPosition() < r020) {
                    int readInt19 = parcel.readInt();
                    char c23 = (char) readInt19;
                    if (c23 == 1) {
                        str2 = bf.b.F(parcel, readInt19);
                    } else if (c23 == 2) {
                        str40 = bf.b.F(parcel, readInt19);
                    } else if (c23 != 3) {
                        bf.b.p0(parcel, readInt19);
                    } else {
                        image = (Image) bf.b.E(parcel, readInt19, Image.CREATOR);
                    }
                }
                bf.b.L(parcel, r020);
                return new LinkPreview(str2, str40, image);
            case 21:
                int r021 = bf.b.r0(parcel);
                String str41 = null;
                while (parcel.dataPosition() < r021) {
                    int readInt20 = parcel.readInt();
                    char c24 = (char) readInt20;
                    if (c24 == 1) {
                        str = bf.b.F(parcel, readInt20);
                    } else if (c24 != 2) {
                        bf.b.p0(parcel, readInt20);
                    } else {
                        str41 = bf.b.F(parcel, readInt20);
                    }
                }
                bf.b.L(parcel, r021);
                return new Price(str, str41);
            case 22:
                int r022 = bf.b.r0(parcel);
                double d2 = 0.0d;
                double d13 = 0.0d;
                String str42 = null;
                while (parcel.dataPosition() < r022) {
                    int readInt21 = parcel.readInt();
                    char c25 = (char) readInt21;
                    if (c25 == 1) {
                        d2 = bf.b.c0(parcel, readInt21);
                    } else if (c25 == 2) {
                        d13 = bf.b.c0(parcel, readInt21);
                    } else if (c25 != 3) {
                        bf.b.p0(parcel, readInt21);
                    } else {
                        str42 = bf.b.F(parcel, readInt21);
                    }
                }
                bf.b.L(parcel, r022);
                return new Rating(d2, d13, str42);
            case 23:
                int r023 = bf.b.r0(parcel);
                int i49 = 0;
                Uri uri22 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                ArrayList arrayList42 = null;
                while (parcel.dataPosition() < r023) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            i49 = bf.b.h0(parcel, readInt22);
                            break;
                        case 2:
                            arrayList42 = bf.b.J(parcel, readInt22, Entity.CREATOR);
                            break;
                        case 3:
                            str43 = bf.b.F(parcel, readInt22);
                            break;
                        case 4:
                            str44 = bf.b.F(parcel, readInt22);
                            break;
                        case 5:
                            str45 = bf.b.F(parcel, readInt22);
                            break;
                        case 6:
                            uri22 = (Uri) bf.b.E(parcel, readInt22, Uri.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt22);
                            break;
                    }
                }
                bf.b.L(parcel, r023);
                return new RecommendationCluster(i49, uri22, str43, str44, str45, arrayList42);
            case 24:
                int r024 = bf.b.r0(parcel);
                int i53 = 0;
                Uri uri23 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                ArrayList arrayList43 = null;
                while (parcel.dataPosition() < r024) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            i53 = bf.b.h0(parcel, readInt23);
                            break;
                        case 2:
                            arrayList43 = bf.b.J(parcel, readInt23, Image.CREATOR);
                            break;
                        case 3:
                            str46 = bf.b.F(parcel, readInt23);
                            break;
                        case 4:
                            uri23 = (Uri) bf.b.E(parcel, readInt23, Uri.CREATOR);
                            break;
                        case 5:
                            str47 = bf.b.F(parcel, readInt23);
                            break;
                        case 6:
                            str48 = bf.b.F(parcel, readInt23);
                            break;
                        default:
                            bf.b.p0(parcel, readInt23);
                            break;
                    }
                }
                bf.b.L(parcel, r024);
                return new SignInCardEntity(i53, uri23, str46, str47, str48, arrayList43);
            case 25:
                int r025 = bf.b.r0(parcel);
                int i54 = 0;
                int i55 = 0;
                String str49 = null;
                ArrayList arrayList44 = null;
                Uri uri24 = null;
                ArrayList arrayList45 = null;
                String str50 = null;
                while (parcel.dataPosition() < r025) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            i54 = bf.b.h0(parcel, readInt24);
                            break;
                        case 2:
                            str49 = bf.b.F(parcel, readInt24);
                            break;
                        case 3:
                            arrayList44 = bf.b.J(parcel, readInt24, Image.CREATOR);
                            break;
                        case 4:
                            i55 = bf.b.h0(parcel, readInt24);
                            break;
                        case 5:
                            uri24 = (Uri) bf.b.E(parcel, readInt24, Uri.CREATOR);
                            break;
                        case 6:
                            arrayList45 = bf.b.H(parcel, readInt24);
                            break;
                        case 7:
                            str50 = bf.b.F(parcel, readInt24);
                            break;
                        default:
                            bf.b.p0(parcel, readInt24);
                            break;
                    }
                }
                bf.b.L(parcel, r025);
                return new FoodReorderCluster(i54, str49, arrayList44, i55, uri24, arrayList45, str50);
            case 26:
                int r026 = bf.b.r0(parcel);
                int i56 = 0;
                int i57 = 0;
                String str51 = null;
                ArrayList arrayList46 = null;
                Uri uri25 = null;
                ArrayList arrayList47 = null;
                String str52 = null;
                while (parcel.dataPosition() < r026) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            i56 = bf.b.h0(parcel, readInt25);
                            break;
                        case 2:
                            str51 = bf.b.F(parcel, readInt25);
                            break;
                        case 3:
                            arrayList46 = bf.b.J(parcel, readInt25, Image.CREATOR);
                            break;
                        case 4:
                            i57 = bf.b.h0(parcel, readInt25);
                            break;
                        case 5:
                            uri25 = (Uri) bf.b.E(parcel, readInt25, Uri.CREATOR);
                            break;
                        case 6:
                            arrayList47 = bf.b.H(parcel, readInt25);
                            break;
                        case 7:
                            str52 = bf.b.F(parcel, readInt25);
                            break;
                        default:
                            bf.b.p0(parcel, readInt25);
                            break;
                    }
                }
                bf.b.L(parcel, r026);
                return new FoodShoppingCart(i56, str51, arrayList46, i57, uri25, arrayList47, str52);
            case 27:
                int r027 = bf.b.r0(parcel);
                int i58 = 0;
                int i59 = 0;
                String str53 = null;
                ArrayList arrayList48 = null;
                Uri uri26 = null;
                while (parcel.dataPosition() < r027) {
                    int readInt26 = parcel.readInt();
                    char c26 = (char) readInt26;
                    if (c26 == 1) {
                        i58 = bf.b.h0(parcel, readInt26);
                    } else if (c26 == 2) {
                        str53 = bf.b.F(parcel, readInt26);
                    } else if (c26 == 3) {
                        arrayList48 = bf.b.H(parcel, readInt26);
                    } else if (c26 == 4) {
                        i59 = bf.b.h0(parcel, readInt26);
                    } else if (c26 != 5) {
                        bf.b.p0(parcel, readInt26);
                    } else {
                        uri26 = (Uri) bf.b.E(parcel, readInt26, Uri.CREATOR);
                    }
                }
                bf.b.L(parcel, r027);
                return new FoodShoppingList(i58, str53, arrayList48, i59, uri26);
            case 28:
                int r028 = bf.b.r0(parcel);
                int i63 = 0;
                Uri uri27 = null;
                Price price3 = null;
                Rating rating5 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                ArrayList arrayList49 = null;
                ArrayList arrayList50 = null;
                while (parcel.dataPosition() < r028) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 1:
                            i63 = bf.b.h0(parcel, readInt27);
                            break;
                        case 2:
                            arrayList49 = bf.b.J(parcel, readInt27, Image.CREATOR);
                            break;
                        case 3:
                            uri27 = (Uri) bf.b.E(parcel, readInt27, Uri.CREATOR);
                            break;
                        case 4:
                            str54 = bf.b.F(parcel, readInt27);
                            break;
                        case 5:
                            rating5 = (Rating) bf.b.E(parcel, readInt27, Rating.CREATOR);
                            break;
                        case 6:
                            str55 = bf.b.F(parcel, readInt27);
                            break;
                        case 7:
                            str56 = bf.b.F(parcel, readInt27);
                            break;
                        case '\b':
                            price3 = (Price) bf.b.E(parcel, readInt27, Price.CREATOR);
                            break;
                        case '\t':
                            arrayList50 = bf.b.J(parcel, readInt27, DisplayTimeWindow.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt27);
                            break;
                    }
                }
                bf.b.L(parcel, r028);
                return new ProductEntity(i63, uri27, price3, rating5, str54, str55, str56, arrayList49, arrayList50);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f117531a) {
            case 0:
                return new Entry[i13];
            case 1:
            default:
                return new RecipeEntity[i13];
            case 2:
                return new LiveRadioStationEntity[i13];
            case 3:
                return new MusicAlbumEntity[i13];
            case 4:
                return new MusicArtistEntity[i13];
            case 5:
                return new MusicTrackEntity[i13];
            case 6:
                return new MusicVideoEntity[i13];
            case 7:
                return new PlaylistEntity[i13];
            case 8:
                return new PodcastEpisodeEntity[i13];
            case 9:
                return new PodcastSeriesEntity[i13];
            case 10:
                return new AudiobookEntity[i13];
            case 11:
                return new BookSeriesEntity[i13];
            case 12:
                return new EbookEntity[i13];
            case 13:
                return new BaseCluster[i13];
            case 14:
                return new ContinuationCluster[i13];
            case 15:
                return new DisplayTimeWindow[i13];
            case 16:
                return new EngagementCluster[i13];
            case 17:
                return new Entity[i13];
            case 18:
                return new FeaturedCluster[i13];
            case 19:
                return new Image[i13];
            case 20:
                return new LinkPreview[i13];
            case 21:
                return new Price[i13];
            case 22:
                return new Rating[i13];
            case 23:
                return new RecommendationCluster[i13];
            case 24:
                return new SignInCardEntity[i13];
            case 25:
                return new FoodReorderCluster[i13];
            case 26:
                return new FoodShoppingCart[i13];
            case 27:
                return new FoodShoppingList[i13];
            case 28:
                return new ProductEntity[i13];
        }
    }
}
