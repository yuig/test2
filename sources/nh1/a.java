package nh1;

import a.c;
import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f90533a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90534b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90535c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90536d;

    /* renamed from: e, reason: collision with root package name */
    public final String f90537e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90538f;

    /* renamed from: g, reason: collision with root package name */
    public final String f90539g;

    /* renamed from: h, reason: collision with root package name */
    public final String f90540h;

    /* renamed from: i, reason: collision with root package name */
    public final String f90541i;

    /* renamed from: j, reason: collision with root package name */
    public final String f90542j;

    /* renamed from: k, reason: collision with root package name */
    public final String f90543k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f90544l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f90545m;

    /* renamed from: n, reason: collision with root package name */
    public final String f90546n;

    /* renamed from: o, reason: collision with root package name */
    public final int f90547o;

    /* renamed from: p, reason: collision with root package name */
    public final String f90548p;

    /* renamed from: q, reason: collision with root package name */
    public final String f90549q;

    /* renamed from: r, reason: collision with root package name */
    public final String f90550r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f90551s;

    /* renamed from: t, reason: collision with root package name */
    public final String f90552t;

    /* renamed from: u, reason: collision with root package name */
    public final String f90553u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f90554v;

    public a(String pinUid, String aggregatedPinDataUid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z13, boolean z14, String str10, String str11, String str12, String str13, String str14, Integer num, int i13) {
        boolean z15;
        String badgedCommentId;
        boolean z16;
        String engagementId;
        String pinCreatorUid = (i13 & 4) != 0 ? "" : str;
        String featuredCommentUid = (i13 & 8) != 0 ? "" : str2;
        String pinCreatorUsername = (i13 & 16) != 0 ? "" : str3;
        String featuredCommentType = (i13 & 32) != 0 ? "" : str4;
        String featuredReplyUid = (i13 & 64) != 0 ? "" : str5;
        String replyToCommentUid = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? "" : str6;
        String replyToCommentType = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? "" : str7;
        String replyToUserUid = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? "" : str8;
        String replyToUserName = (i13 & 1024) != 0 ? "" : str9;
        boolean z17 = (i13 & 2048) != 0 ? false : z13;
        boolean z18 = (i13 & 4096) != 0 ? true : z14;
        if ((i13 & 32768) != 0) {
            z15 = z18;
            badgedCommentId = "";
        } else {
            z15 = z18;
            badgedCommentId = str10;
        }
        if ((i13 & 65536) != 0) {
            z16 = z17;
            engagementId = "";
        } else {
            z16 = z17;
            engagementId = str11;
        }
        String engagementType = (i13 & 131072) != 0 ? "" : str12;
        boolean z19 = (i13 & 262144) != 0;
        String str15 = (i13 & 524288) != 0 ? "" : str13;
        String str16 = (i13 & 1048576) != 0 ? null : str14;
        Integer num2 = (i13 & 2097152) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(aggregatedPinDataUid, "aggregatedPinDataUid");
        Intrinsics.checkNotNullParameter(pinCreatorUid, "pinCreatorUid");
        Intrinsics.checkNotNullParameter(featuredCommentUid, "featuredCommentUid");
        Intrinsics.checkNotNullParameter(pinCreatorUsername, "pinCreatorUsername");
        Intrinsics.checkNotNullParameter(featuredCommentType, "featuredCommentType");
        Intrinsics.checkNotNullParameter(featuredReplyUid, "featuredReplyUid");
        Intrinsics.checkNotNullParameter(replyToCommentUid, "replyToCommentUid");
        Intrinsics.checkNotNullParameter(replyToCommentType, "replyToCommentType");
        Intrinsics.checkNotNullParameter(replyToUserUid, "replyToUserUid");
        Intrinsics.checkNotNullParameter(replyToUserName, "replyToUserName");
        Intrinsics.checkNotNullParameter("", "responseUid");
        Intrinsics.checkNotNullParameter(badgedCommentId, "badgedCommentId");
        Intrinsics.checkNotNullParameter(engagementId, "engagementId");
        Intrinsics.checkNotNullParameter(engagementType, "engagementType");
        String str17 = engagementType;
        String engagementParentUid = str15;
        Intrinsics.checkNotNullParameter(engagementParentUid, "engagementParentUid");
        this.f90533a = pinUid;
        this.f90534b = aggregatedPinDataUid;
        this.f90535c = pinCreatorUid;
        this.f90536d = featuredCommentUid;
        this.f90537e = pinCreatorUsername;
        this.f90538f = featuredCommentType;
        this.f90539g = featuredReplyUid;
        this.f90540h = replyToCommentUid;
        this.f90541i = replyToCommentType;
        this.f90542j = replyToUserUid;
        this.f90543k = replyToUserName;
        this.f90544l = z16;
        this.f90545m = z15;
        this.f90546n = "";
        this.f90547o = 0;
        this.f90548p = badgedCommentId;
        this.f90549q = engagementId;
        this.f90550r = str17;
        this.f90551s = z19;
        this.f90552t = engagementParentUid;
        this.f90553u = str16;
        this.f90554v = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f90533a, aVar.f90533a) && Intrinsics.d(this.f90534b, aVar.f90534b) && Intrinsics.d(this.f90535c, aVar.f90535c) && Intrinsics.d(this.f90536d, aVar.f90536d) && Intrinsics.d(this.f90537e, aVar.f90537e) && Intrinsics.d(this.f90538f, aVar.f90538f) && Intrinsics.d(this.f90539g, aVar.f90539g) && Intrinsics.d(this.f90540h, aVar.f90540h) && Intrinsics.d(this.f90541i, aVar.f90541i) && Intrinsics.d(this.f90542j, aVar.f90542j) && Intrinsics.d(this.f90543k, aVar.f90543k) && this.f90544l == aVar.f90544l && this.f90545m == aVar.f90545m && Intrinsics.d(this.f90546n, aVar.f90546n) && this.f90547o == aVar.f90547o && Intrinsics.d(this.f90548p, aVar.f90548p) && Intrinsics.d(this.f90549q, aVar.f90549q) && Intrinsics.d(this.f90550r, aVar.f90550r) && this.f90551s == aVar.f90551s && Intrinsics.d(this.f90552t, aVar.f90552t) && Intrinsics.d(this.f90553u, aVar.f90553u) && Intrinsics.d(this.f90554v, aVar.f90554v);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f90552t, b.e(this.f90551s, cb.d(this.f90550r, cb.d(this.f90549q, cb.d(this.f90548p, b.b(this.f90547o, cb.d(this.f90546n, b.e(this.f90545m, b.e(this.f90544l, cb.d(this.f90543k, cb.d(this.f90542j, cb.d(this.f90541i, cb.d(this.f90540h, cb.d(this.f90539g, cb.d(this.f90538f, cb.d(this.f90537e, cb.d(this.f90536d, cb.d(this.f90535c, cb.d(this.f90534b, this.f90533a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f90553u;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f90554v;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommentFeedMetadata(pinUid=");
        sb3.append(this.f90533a);
        sb3.append(", aggregatedPinDataUid=");
        sb3.append(this.f90534b);
        sb3.append(", pinCreatorUid=");
        sb3.append(this.f90535c);
        sb3.append(", featuredCommentUid=");
        sb3.append(this.f90536d);
        sb3.append(", pinCreatorUsername=");
        sb3.append(this.f90537e);
        sb3.append(", featuredCommentType=");
        sb3.append(this.f90538f);
        sb3.append(", featuredReplyUid=");
        sb3.append(this.f90539g);
        sb3.append(", replyToCommentUid=");
        sb3.append(this.f90540h);
        sb3.append(", replyToCommentType=");
        sb3.append(this.f90541i);
        sb3.append(", replyToUserUid=");
        sb3.append(this.f90542j);
        sb3.append(", replyToUserName=");
        sb3.append(this.f90543k);
        sb3.append(", pinDoneByMe=");
        sb3.append(this.f90544l);
        sb3.append(", pinEligibleForTriedIt=");
        sb3.append(this.f90545m);
        sb3.append(", responseUid=");
        sb3.append(this.f90546n);
        sb3.append(", commentCount=");
        sb3.append(this.f90547o);
        sb3.append(", badgedCommentId=");
        sb3.append(this.f90548p);
        sb3.append(", engagementId=");
        sb3.append(this.f90549q);
        sb3.append(", engagementType=");
        sb3.append(this.f90550r);
        sb3.append(", showHighlightBanner=");
        sb3.append(this.f90551s);
        sb3.append(", engagementParentUid=");
        sb3.append(this.f90552t);
        sb3.append(", parentPairId=");
        sb3.append(this.f90553u);
        sb3.append(", sortBy=");
        return c.i(sb3, this.f90554v, ")");
    }
}
