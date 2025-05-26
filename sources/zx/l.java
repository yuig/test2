package zx;

import java.text.DateFormat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final g f142973a;

    /* renamed from: b, reason: collision with root package name */
    public final d f142974b;

    /* renamed from: c, reason: collision with root package name */
    public final e f142975c;

    /* renamed from: d, reason: collision with root package name */
    public final c f142976d;

    /* renamed from: e, reason: collision with root package name */
    public final b f142977e;

    /* renamed from: f, reason: collision with root package name */
    public final List f142978f;

    /* renamed from: g, reason: collision with root package name */
    public final h f142979g;

    /* renamed from: h, reason: collision with root package name */
    public final k f142980h;

    /* renamed from: i, reason: collision with root package name */
    public final i f142981i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f142982j;

    public l(b claimedAccountFilter, c contentTypeAdFormat, d contentTypeFilter, e contentTypePinFormat, g dateRange, h deviceFilter, i formatFilter, k sourceFilter, List claimedAccountOptions, boolean z13) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(contentTypeFilter, "contentTypeFilter");
        Intrinsics.checkNotNullParameter(contentTypePinFormat, "contentTypePinFormat");
        Intrinsics.checkNotNullParameter(contentTypeAdFormat, "contentTypeAdFormat");
        Intrinsics.checkNotNullParameter(claimedAccountFilter, "claimedAccountFilter");
        Intrinsics.checkNotNullParameter(claimedAccountOptions, "claimedAccountOptions");
        Intrinsics.checkNotNullParameter(deviceFilter, "deviceFilter");
        Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
        Intrinsics.checkNotNullParameter(formatFilter, "formatFilter");
        this.f142973a = dateRange;
        this.f142974b = contentTypeFilter;
        this.f142975c = contentTypePinFormat;
        this.f142976d = contentTypeAdFormat;
        this.f142977e = claimedAccountFilter;
        this.f142978f = claimedAccountOptions;
        this.f142979g = deviceFilter;
        this.f142980h = sourceFilter;
        this.f142981i = formatFilter;
        this.f142982j = z13;
    }

    public static l a(b claimedAccountFilter, c contentTypeAdFormat, d contentTypeFilter, e contentTypePinFormat, g dateRange, h deviceFilter, i formatFilter, k sourceFilter, List claimedAccountOptions, boolean z13) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(contentTypeFilter, "contentTypeFilter");
        Intrinsics.checkNotNullParameter(contentTypePinFormat, "contentTypePinFormat");
        Intrinsics.checkNotNullParameter(contentTypeAdFormat, "contentTypeAdFormat");
        Intrinsics.checkNotNullParameter(claimedAccountFilter, "claimedAccountFilter");
        Intrinsics.checkNotNullParameter(claimedAccountOptions, "claimedAccountOptions");
        Intrinsics.checkNotNullParameter(deviceFilter, "deviceFilter");
        Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
        Intrinsics.checkNotNullParameter(formatFilter, "formatFilter");
        return new l(claimedAccountFilter, contentTypeAdFormat, contentTypeFilter, contentTypePinFormat, dateRange, deviceFilter, formatFilter, sourceFilter, claimedAccountOptions, z13);
    }

    public static /* synthetic */ l b(l lVar, d dVar, List list, int i13) {
        g gVar = lVar.f142973a;
        if ((i13 & 2) != 0) {
            dVar = lVar.f142974b;
        }
        d dVar2 = dVar;
        e eVar = lVar.f142975c;
        c cVar = lVar.f142976d;
        b bVar = lVar.f142977e;
        if ((i13 & 32) != 0) {
            list = lVar.f142978f;
        }
        h hVar = lVar.f142979g;
        k kVar = lVar.f142980h;
        i iVar = lVar.f142981i;
        boolean z13 = lVar.f142982j;
        lVar.getClass();
        return a(bVar, cVar, dVar2, eVar, gVar, hVar, iVar, kVar, list, z13);
    }

    public final int c() {
        int i13 = this.f142973a.f142969a != f.DAYS_30 ? 1 : 0;
        if (this.f142974b.ordinal() != 0) {
            i13++;
        }
        if (this.f142977e.f142968b != 0) {
            i13++;
        }
        if (this.f142979g.ordinal() != 0) {
            i13++;
        }
        if (this.f142980h.ordinal() != 0) {
            i13++;
        }
        if (this.f142981i.ordinal() != 0) {
            i13++;
        }
        return this.f142982j ? i13 + 1 : i13;
    }

    public final c d() {
        return this.f142976d;
    }

    public final d e() {
        return this.f142974b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f142973a, lVar.f142973a) && this.f142974b == lVar.f142974b && this.f142975c == lVar.f142975c && this.f142976d == lVar.f142976d && Intrinsics.d(this.f142977e, lVar.f142977e) && Intrinsics.d(this.f142978f, lVar.f142978f) && this.f142979g == lVar.f142979g && this.f142980h == lVar.f142980h && this.f142981i == lVar.f142981i && this.f142982j == lVar.f142982j;
    }

    public final e f() {
        return this.f142975c;
    }

    public final String g() {
        g gVar = this.f142973a;
        long j13 = gVar.f142971c;
        wx.a dateFormatType = wx.a.DATE;
        DateFormat dateFormat = wx.b.f131196a;
        Intrinsics.checkNotNullParameter(dateFormatType, "dateFormatType");
        String format = wx.b.f131196a.format(Long.valueOf(j13));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Intrinsics.checkNotNullParameter(dateFormatType, "dateFormatType");
        String format2 = wx.b.f131196a.format(Long.valueOf(gVar.f142972d));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return a.a.D(format, " - ", format2);
    }

    public final g h() {
        return this.f142973a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142982j) + ((this.f142981i.hashCode() + ((this.f142980h.hashCode() + ((this.f142979g.hashCode() + ep.b.c(this.f142978f, (this.f142977e.hashCode() + ((this.f142976d.hashCode() + ((this.f142975c.hashCode() + ((this.f142974b.hashCode() + (this.f142973a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final h i() {
        return this.f142979g;
    }

    public final i j() {
        return this.f142981i;
    }

    public final k k() {
        return this.f142980h;
    }

    public final String toString() {
        return "FilterParams(dateRange=" + this.f142973a + ", contentTypeFilter=" + this.f142974b + ", contentTypePinFormat=" + this.f142975c + ", contentTypeAdFormat=" + this.f142976d + ", claimedAccountFilter=" + this.f142977e + ", claimedAccountOptions=" + this.f142978f + ", deviceFilter=" + this.f142979g + ", sourceFilter=" + this.f142980h + ", formatFilter=" + this.f142981i + ", includeSavedPins=" + this.f142982j + ")";
    }
}
