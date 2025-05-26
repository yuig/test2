package com.google.android.gms.ads;

import a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/android/gms/ads/AdSize;", "", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "c", "Z", "isAnchoredAdaptiveBanner", "()Z", "d", "isInlineAdaptiveBanner", "e", "getInlineMaxHeight", "inlineMaxHeight", "", "f", "Ljava/lang/String;", "getFormatString", "()Ljava/lang/String;", "formatString", "Companion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdSize {

    @NotNull
    public static final AdSize BANNER;
    public static final int BANNER_HEIGHT = 50;
    public static final int BANNER_WIDTH = 320;

    @NotNull
    public static final AdSize FLUID;

    @NotNull
    public static final AdSize FULL_BANNER;
    public static final int FULL_BANNER_HEIGHT = 60;
    public static final int FULL_BANNER_WIDTH = 468;

    @NotNull
    public static final AdSize INVALID;

    @NotNull
    public static final AdSize LARGE_BANNER;
    public static final int LARGE_BANNER_HEIGHT = 100;
    public static final int LARGE_BANNER_WIDTH = 320;

    @NotNull
    public static final AdSize LEADERBOARD;
    public static final int LEADERBOARD_HEIGHT = 90;
    public static final int LEADERBOARD_WIDTH = 728;

    @NotNull
    public static final AdSize MEDIUM_RECTANGLE;
    public static final int MEDIUM_RECTANGLE_HEIGHT = 250;
    public static final int MEDIUM_RECTANGLE_WIDTH = 300;

    @NotNull
    public static final AdSize SEARCH;
    public static final int WIDE_SKYSCRAPER_WIDTH = 160;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnchoredAdaptiveBanner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isInlineAdaptiveBanner;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int inlineMaxHeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String formatString;
    public static final int WIDE_SKYSCRAPER_HEIGHT = 600;

    @NotNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, WIDE_SKYSCRAPER_HEIGHT, "160x600_as");

    static {
        int i13 = 320;
        BANNER = new AdSize(i13, 50, "320x50_mb");
        String str = null;
        FULL_BANNER = new AdSize(FULL_BANNER_WIDTH, 60, str);
        LARGE_BANNER = new AdSize(i13, 100, str);
        LEADERBOARD = new AdSize(LEADERBOARD_WIDTH, 90, str);
        MEDIUM_RECTANGLE = new AdSize(MEDIUM_RECTANGLE_WIDTH, 250, str);
        int i14 = -3;
        FLUID = new AdSize(i14, -4, "fluid");
        int i15 = 0;
        SEARCH = new AdSize(i14, i15, "search_v2");
        INVALID = new AdSize(i15, i15, "invalid");
    }

    public AdSize(int i13, int i14, String str, boolean z13, boolean z14, int i15) {
        this.width = i13;
        this.height = i14;
        this.isAnchoredAdaptiveBanner = z13;
        this.isInlineAdaptiveBanner = z14;
        this.inlineMaxHeight = i15;
        if (str == null) {
            str = i13 + "x" + i14 + "_as";
        }
        this.formatString = str;
        if (i13 < 0 && i13 != -3) {
            throw new IllegalArgumentException(a.d("Invalid width for AdSize: ", i13).toString());
        }
        if (i14 < 0 && i14 != -4) {
            throw new IllegalArgumentException(a.d("Invalid height for AdSize: ", i14).toString());
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("AdSize cannot be both inline and anchored adaptive".toString());
        }
        if (z14 && i14 < 1) {
            throw new IllegalArgumentException("An inline AdSize must have a positive height".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            if (this.width == adSize.width && this.height == adSize.height && Intrinsics.d(this.formatString, adSize.formatString)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.formatString.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public final String getFormatString() {
        return this.formatString;
    }

    public /* synthetic */ AdSize(int i13, int i14, String str) {
        this(i13, i14, str, false, false, -1);
    }
}
