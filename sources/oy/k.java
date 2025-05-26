package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends ey.w1 implements ey.b2 {

    /* renamed from: e, reason: collision with root package name */
    public final d1 f98101e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98102f;

    /* renamed from: g, reason: collision with root package name */
    public final int f98103g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98104h;

    /* renamed from: i, reason: collision with root package name */
    public final int f98105i;

    /* renamed from: j, reason: collision with root package name */
    public final int f98106j;

    /* renamed from: k, reason: collision with root package name */
    public final int f98107k;

    /* renamed from: l, reason: collision with root package name */
    public final int f98108l;

    /* renamed from: m, reason: collision with root package name */
    public final int f98109m;

    /* renamed from: n, reason: collision with root package name */
    public final int f98110n;

    /* renamed from: o, reason: collision with root package name */
    public final int f98111o;

    /* renamed from: p, reason: collision with root package name */
    public final int f98112p;

    /* renamed from: q, reason: collision with root package name */
    public final int f98113q;

    /* renamed from: r, reason: collision with root package name */
    public final int f98114r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d1 initiatedBy, int i13, int i14, String pageIds, int i15, int i16, int i17, int i18, int i19, int i23, int i24, int i25, int i26, int i27) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(initiatedBy, "initiatedBy");
        Intrinsics.checkNotNullParameter(pageIds, "pageIds");
        this.f98101e = initiatedBy;
        this.f98102f = i13;
        this.f98103g = i14;
        this.f98104h = pageIds;
        this.f98105i = i15;
        this.f98106j = i16;
        this.f98107k = i17;
        this.f98108l = i18;
        this.f98109m = i19;
        this.f98110n = i23;
        this.f98111o = i24;
        this.f98112p = i25;
        this.f98113q = i26;
        this.f98114r = i27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f98101e == kVar.f98101e && this.f98102f == kVar.f98102f && this.f98103g == kVar.f98103g && Intrinsics.d(this.f98104h, kVar.f98104h) && this.f98105i == kVar.f98105i && this.f98106j == kVar.f98106j && this.f98107k == kVar.f98107k && this.f98108l == kVar.f98108l && this.f98109m == kVar.f98109m && this.f98110n == kVar.f98110n && this.f98111o == kVar.f98111o && this.f98112p == kVar.f98112p && this.f98113q == kVar.f98113q && this.f98114r == kVar.f98114r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98114r) + ep.b.b(this.f98113q, ep.b.b(this.f98112p, ep.b.b(this.f98111o, ep.b.b(this.f98110n, ep.b.b(this.f98109m, ep.b.b(this.f98108l, ep.b.b(this.f98107k, ep.b.b(this.f98106j, ep.b.b(this.f98105i, cb.d(this.f98104h, ep.b.b(this.f98103g, ep.b.b(this.f98102f, this.f98101e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinPublishStartEvent(initiatedBy=");
        sb3.append(this.f98101e);
        sb3.append(", imageCount=");
        sb3.append(this.f98102f);
        sb3.append(", videoCount=");
        sb3.append(this.f98103g);
        sb3.append(", pageIds=");
        sb3.append(this.f98104h);
        sb3.append(", prepublishVideoExportStarted=");
        sb3.append(this.f98105i);
        sb3.append(", prepublishVideoUploadStarted=");
        sb3.append(this.f98106j);
        sb3.append(", prepublishImageUploadStarted=");
        sb3.append(this.f98107k);
        sb3.append(", prepublishCoverImageUploadStarted=");
        sb3.append(this.f98108l);
        sb3.append(", prepublishVideoExportFinished=");
        sb3.append(this.f98109m);
        sb3.append(", prepublishVideoUploadFinished=");
        sb3.append(this.f98110n);
        sb3.append(", prepublishImageUploadFinished=");
        sb3.append(this.f98111o);
        sb3.append(", prepublishCoverImageUploadFinished=");
        sb3.append(this.f98112p);
        sb3.append(", preuploadedPageCountFromThisSession=");
        sb3.append(this.f98113q);
        sb3.append(", preuploadedPageCountFromLastSession=");
        return a.a.n(sb3, this.f98114r, ")");
    }
}
