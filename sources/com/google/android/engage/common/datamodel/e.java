package com.google.android.engage.common.datamodel;

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
import com.google.android.engage.food.datamodel.ProductEntity;
import com.google.android.engage.food.datamodel.RecipeEntity;
import com.google.android.engage.food.datamodel.StoreEntity;
import com.google.android.engage.shopping.datamodel.ShoppingEntity;
import com.google.android.engage.social.datamodel.PortraitMediaEntity;
import com.google.android.engage.social.datamodel.SocialPostEntity;
import com.google.android.engage.video.datamodel.LiveStreamingVideoEntity;
import com.google.android.engage.video.datamodel.MovieEntity;
import com.google.android.engage.video.datamodel.TvEpisodeEntity;
import com.google.android.engage.video.datamodel.TvSeasonEntity;
import com.google.android.engage.video.datamodel.TvShowEntity;
import com.google.android.engage.video.datamodel.VideoClipEntity;
import d7.b0;
import pk.h1;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f30278a;

    static {
        b0 a13 = h1.a();
        a13.e(8, EbookEntity.CREATOR);
        a13.e(9, AudiobookEntity.CREATOR);
        a13.e(10, BookSeriesEntity.CREATOR);
        a13.e(1, MovieEntity.CREATOR);
        a13.e(2, TvShowEntity.CREATOR);
        a13.e(3, TvSeasonEntity.CREATOR);
        a13.e(4, TvEpisodeEntity.CREATOR);
        a13.e(5, LiveStreamingVideoEntity.CREATOR);
        a13.e(6, VideoClipEntity.CREATOR);
        a13.e(11, LiveRadioStationEntity.CREATOR);
        a13.e(12, MusicAlbumEntity.CREATOR);
        a13.e(13, MusicArtistEntity.CREATOR);
        a13.e(14, PodcastSeriesEntity.CREATOR);
        a13.e(15, PodcastEpisodeEntity.CREATOR);
        a13.e(18, MusicTrackEntity.CREATOR);
        a13.e(17, MusicVideoEntity.CREATOR);
        a13.e(16, PlaylistEntity.CREATOR);
        a13.e(19, ShoppingEntity.CREATOR);
        a13.e(20, RecipeEntity.CREATOR);
        a13.e(21, StoreEntity.CREATOR);
        a13.e(22, ProductEntity.CREATOR);
        a13.e(23, SignInCardEntity.CREATOR);
        a13.e(24, PortraitMediaEntity.CREATOR);
        a13.e(25, SocialPostEntity.CREATOR);
        f30278a = a13.a();
    }
}
