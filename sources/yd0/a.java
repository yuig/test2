package yd0;

import a.cb;
import com.pinterest.api.model.m40;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wn0;
import dl1.s;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou1.c;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f138752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138753b;

    /* renamed from: c, reason: collision with root package name */
    public final wn0 f138754c;

    /* renamed from: d, reason: collision with root package name */
    public final tp f138755d;

    /* renamed from: e, reason: collision with root package name */
    public final List f138756e;

    /* renamed from: f, reason: collision with root package name */
    public final String f138757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f138758g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f138759h;

    /* renamed from: i, reason: collision with root package name */
    public final String f138760i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f138761j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f138762k;

    /* renamed from: l, reason: collision with root package name */
    public final String f138763l;

    /* renamed from: m, reason: collision with root package name */
    public final int f138764m;

    /* renamed from: n, reason: collision with root package name */
    public final long f138765n;

    /* renamed from: o, reason: collision with root package name */
    public final Date f138766o;

    /* renamed from: p, reason: collision with root package name */
    public final List f138767p;

    /* renamed from: q, reason: collision with root package name */
    public final String f138768q;

    /* renamed from: r, reason: collision with root package name */
    public final Date f138769r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f138770s;

    /* renamed from: t, reason: collision with root package name */
    public final Date f138771t;

    public a(@NotNull String id3, @NotNull String userId, @NotNull wn0 metadata, tp tpVar, @NotNull List<? extends m40> tags, String str, String str2, c cVar, boolean z13, String str3, byte[] bArr, boolean z14, String str4, int i13, long j13, @NotNull Date lastUpdatedAt, @NotNull List<String> exportedMedia, String str5, @NotNull Date createdAt, boolean z15, Date date) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        Intrinsics.checkNotNullParameter(exportedMedia, "exportedMedia");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f138752a = id3;
        this.f138753b = userId;
        this.f138754c = metadata;
        this.f138755d = tpVar;
        this.f138756e = tags;
        this.f138757f = str;
        this.f138758g = str2;
        this.f138759h = z13;
        this.f138760i = str3;
        this.f138761j = bArr;
        this.f138762k = z14;
        this.f138763l = str4;
        this.f138764m = i13;
        this.f138765n = j13;
        this.f138766o = lastUpdatedAt;
        this.f138767p = exportedMedia;
        this.f138768q = str5;
        this.f138769r = createdAt;
        this.f138770s = z15;
        this.f138771t = date;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f138752a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f138752a, aVar.f138752a) && Intrinsics.d(this.f138753b, aVar.f138753b) && Intrinsics.d(this.f138754c, aVar.f138754c) && Intrinsics.d(this.f138755d, aVar.f138755d) && Intrinsics.d(this.f138756e, aVar.f138756e) && Intrinsics.d(this.f138757f, aVar.f138757f) && Intrinsics.d(this.f138758g, aVar.f138758g) && Intrinsics.d(null, null) && this.f138759h == aVar.f138759h && Intrinsics.d(this.f138760i, aVar.f138760i) && Intrinsics.d(this.f138761j, aVar.f138761j) && this.f138762k == aVar.f138762k && Intrinsics.d(this.f138763l, aVar.f138763l) && this.f138764m == aVar.f138764m && this.f138765n == aVar.f138765n && Intrinsics.d(this.f138766o, aVar.f138766o) && Intrinsics.d(this.f138767p, aVar.f138767p) && Intrinsics.d(this.f138768q, aVar.f138768q) && Intrinsics.d(this.f138769r, aVar.f138769r) && this.f138770s == aVar.f138770s && Intrinsics.d(this.f138771t, aVar.f138771t);
    }

    public final int hashCode() {
        int hashCode = (this.f138754c.hashCode() + cb.d(this.f138753b, this.f138752a.hashCode() * 31, 31)) * 31;
        tp tpVar = this.f138755d;
        int c13 = ep.b.c(this.f138756e, (hashCode + (tpVar == null ? 0 : tpVar.hashCode())) * 31, 31);
        String str = this.f138757f;
        int hashCode2 = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138758g;
        int e13 = ep.b.e(this.f138759h, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961, 31);
        String str3 = this.f138760i;
        int hashCode3 = (e13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        byte[] bArr = this.f138761j;
        int e14 = ep.b.e(this.f138762k, (hashCode3 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31, 31);
        String str4 = this.f138763l;
        int c14 = ep.b.c(this.f138767p, (this.f138766o.hashCode() + a.a.c(this.f138765n, ep.b.b(this.f138764m, (e14 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31)) * 31, 31);
        String str5 = this.f138768q;
        int e15 = ep.b.e(this.f138770s, (this.f138769r.hashCode() + ((c14 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31);
        Date date = this.f138771t;
        return e15 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f138761j);
        StringBuilder sb3 = new StringBuilder("IdeaPinDraftEntity(id=");
        sb3.append(this.f138752a);
        sb3.append(", userId=");
        sb3.append(this.f138753b);
        sb3.append(", metadata=");
        sb3.append(this.f138754c);
        sb3.append(", pageData=");
        sb3.append(this.f138755d);
        sb3.append(", tags=");
        sb3.append(this.f138756e);
        sb3.append(", boardId=");
        sb3.append(this.f138757f);
        sb3.append(", boardSectionId=");
        sb3.append(this.f138758g);
        sb3.append(", commentReplyData=null, commentsEnabled=");
        sb3.append(this.f138759h);
        sb3.append(", mostRecentTextStyleBlockId=");
        a.a.B(sb3, this.f138760i, ", extractedImageMetadata=", arrays, ", isBroken=");
        sb3.append(this.f138762k);
        sb3.append(", coverImagePath=");
        sb3.append(this.f138763l);
        sb3.append(", pageCount=");
        sb3.append(this.f138764m);
        sb3.append(", duration=");
        sb3.append(this.f138765n);
        sb3.append(", lastUpdatedAt=");
        sb3.append(this.f138766o);
        sb3.append(", exportedMedia=");
        sb3.append(this.f138767p);
        sb3.append(", link=");
        sb3.append(this.f138768q);
        sb3.append(", createdAt=");
        sb3.append(this.f138769r);
        sb3.append(", isExpirationSupported=");
        sb3.append(this.f138770s);
        sb3.append(", scheduledDate=");
        sb3.append(this.f138771t);
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ a(String str, String str2, wn0 wn0Var, tp tpVar, List list, String str3, String str4, c cVar, boolean z13, String str5, byte[] bArr, boolean z14, String str6, int i13, long j13, Date date, List list2, String str7, Date date2, boolean z15, Date date3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, wn0Var, tpVar, list, str3, str4, cVar, z13, str5, bArr, z14, str6, i13, j13, date, list2, str7, date2, z15, (i14 & 1048576) != 0 ? null : date3);
    }
}
