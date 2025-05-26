package uz1;

import a.cb;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f123281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123283c;

    /* renamed from: d, reason: collision with root package name */
    public final int f123284d;

    /* renamed from: e, reason: collision with root package name */
    public final int f123285e;

    /* renamed from: f, reason: collision with root package name */
    public final String f123286f;

    /* renamed from: g, reason: collision with root package name */
    public final String f123287g;

    /* renamed from: h, reason: collision with root package name */
    public final String f123288h;

    /* renamed from: i, reason: collision with root package name */
    public final c f123289i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f123290j;

    /* renamed from: k, reason: collision with root package name */
    public final c f123291k;

    /* renamed from: l, reason: collision with root package name */
    public final List f123292l;

    /* renamed from: m, reason: collision with root package name */
    public final i f123293m;

    /* renamed from: n, reason: collision with root package name */
    public final j f123294n;

    /* renamed from: o, reason: collision with root package name */
    public final j f123295o;

    public f(int i13, String groupId, String channelId, int i14, int i15, String str, String contentTitle, String contentText, b bVar, Integer num, c cVar, List vibratePattern, i style, j jVar, j jVar2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentText, "contentText");
        Intrinsics.checkNotNullParameter(vibratePattern, "vibratePattern");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f123281a = i13;
        this.f123282b = groupId;
        this.f123283c = channelId;
        this.f123284d = i14;
        this.f123285e = i15;
        this.f123286f = str;
        this.f123287g = contentTitle;
        this.f123288h = contentText;
        this.f123289i = bVar;
        this.f123290j = num;
        this.f123291k = cVar;
        this.f123292l = vibratePattern;
        this.f123293m = style;
        this.f123294n = jVar;
        this.f123295o = jVar2;
    }

    public static boolean a(j jVar, j jVar2) {
        boolean z13;
        if (jVar == null) {
            return jVar2 == null;
        }
        if (jVar2 == null) {
            return false;
        }
        if (Intrinsics.d(jVar.f123298a, jVar2.f123298a) && Intrinsics.d(jVar.f123299b, jVar2.f123299b) && b(jVar.f123300c, jVar2.f123300c)) {
            t tVar = jVar.f123301d;
            t tVar2 = jVar2.f123301d;
            if (tVar == null) {
                if (tVar2 == null) {
                    return true;
                }
            } else if (tVar2 != null) {
                if (tVar instanceof k) {
                    z13 = tVar2 instanceof k;
                } else if (tVar instanceof n) {
                    z13 = tVar2 instanceof n;
                } else if (tVar instanceof r) {
                    z13 = tVar2 instanceof r;
                } else if (tVar instanceof s) {
                    z13 = tVar2 instanceof s;
                } else if (tVar instanceof q) {
                    z13 = tVar2 instanceof q;
                } else if (tVar instanceof l) {
                    z13 = tVar2 instanceof l;
                } else if (tVar instanceof o) {
                    if ((tVar2 instanceof o) && Intrinsics.d(((o) tVar).f123308b, ((o) tVar2).f123308b)) {
                        return true;
                    }
                } else if (tVar instanceof p) {
                    if ((tVar2 instanceof p) && Intrinsics.d(((p) tVar).f123310b, ((p) tVar2).f123310b)) {
                        return true;
                    }
                } else {
                    if (!(tVar instanceof m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((tVar2 instanceof m) && Intrinsics.d(((m) tVar).f123305b, ((m) tVar2).f123305b)) {
                        return true;
                    }
                }
                if (z13) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(c cVar, c cVar2) {
        if (cVar == null) {
            return cVar2 == null;
        }
        if (cVar2 == null) {
            return false;
        }
        if (cVar instanceof b) {
            if (cVar2 instanceof b) {
                b bVar = (b) cVar;
                b bVar2 = (b) cVar2;
                if (Intrinsics.d(bVar.f123276a, bVar2.f123276a) && Intrinsics.d(bVar.f123277b, bVar2.f123277b) && bVar.f123278c == bVar2.f123278c && bVar.f123279d == bVar2.f123279d && Intrinsics.d(bVar.f123280e, bVar2.f123280e)) {
                    return true;
                }
            }
        } else {
            if (!(cVar instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar2 instanceof a) {
                a aVar = (a) cVar;
                a aVar2 = (a) cVar2;
                if (Intrinsics.d(aVar.f123274a, aVar2.f123274a) && Intrinsics.d(aVar.f123275b, aVar2.f123275b) && Intrinsics.d("ACTION_ACCEPT", "ACTION_ACCEPT")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.pushnotification.v2.PushBuilderData");
        f fVar = (f) obj;
        return this.f123281a == fVar.f123281a && Intrinsics.d(this.f123282b, fVar.f123282b) && Intrinsics.d(this.f123283c, fVar.f123283c) && this.f123284d == fVar.f123284d && this.f123285e == fVar.f123285e && Intrinsics.d(this.f123286f, fVar.f123286f) && Intrinsics.d(this.f123287g, fVar.f123287g) && Intrinsics.d(this.f123288h, fVar.f123288h) && Intrinsics.d(this.f123290j, fVar.f123290j) && Intrinsics.d(this.f123292l, fVar.f123292l) && Intrinsics.d(this.f123293m, fVar.f123293m) && b(this.f123289i, fVar.f123289i) && b(this.f123291k, fVar.f123291k) && a(this.f123294n, fVar.f123294n) && a(this.f123295o, fVar.f123295o);
    }

    public final int hashCode() {
        int d2 = (((cb.d(this.f123283c, cb.d(this.f123282b, this.f123281a * 31, 31), 31) + this.f123284d) * 31) + this.f123285e) * 31;
        String str = this.f123286f;
        int d13 = cb.d(this.f123288h, cb.d(this.f123287g, (((Boolean.hashCode(true) + ep.b.e(true, (d2 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31) + 1) * 31, 31), 31);
        c cVar = this.f123289i;
        int hashCode = (d13 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Integer num = this.f123290j;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        c cVar2 = this.f123291k;
        int hashCode2 = (this.f123293m.hashCode() + ep.b.c(this.f123292l, (intValue + (cVar2 != null ? cVar2.hashCode() : 0)) * 31, 31)) * 31;
        j jVar = this.f123294n;
        int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        j jVar2 = this.f123295o;
        return hashCode3 + (jVar2 != null ? jVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PushBuilderData(notificationId=" + this.f123281a + ", groupId=" + this.f123282b + ", channelId=" + this.f123283c + ", colorResId=" + this.f123284d + ", smallIconId=" + this.f123285e + ", largeIconUrl=" + this.f123286f + ", onlyAlertOnce=true, autoCancel=true, notifPriority=1, contentTitle=" + this.f123287g + ", contentText=" + this.f123288h + ", contentIntentData=" + this.f123289i + ", actionTextResId=" + this.f123290j + ", actionIntentData=" + this.f123291k + ", vibratePattern=" + this.f123292l + ", style=" + this.f123293m + ", customContentView=" + this.f123294n + ", customBigContentView=" + this.f123295o + ")";
    }
}
