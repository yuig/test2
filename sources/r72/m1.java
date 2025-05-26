package r72;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 {
    public final boolean A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final String f106551a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f106552b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f106553c;

    /* renamed from: d, reason: collision with root package name */
    public final int f106554d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f106555e;

    /* renamed from: f, reason: collision with root package name */
    public final String f106556f;

    /* renamed from: g, reason: collision with root package name */
    public final String f106557g;

    /* renamed from: h, reason: collision with root package name */
    public final int f106558h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f106559i;

    /* renamed from: j, reason: collision with root package name */
    public final String f106560j;

    /* renamed from: k, reason: collision with root package name */
    public final String f106561k;

    /* renamed from: l, reason: collision with root package name */
    public final int f106562l;

    /* renamed from: m, reason: collision with root package name */
    public final List f106563m;

    /* renamed from: n, reason: collision with root package name */
    public final String f106564n;

    /* renamed from: o, reason: collision with root package name */
    public final String f106565o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f106566p;

    /* renamed from: q, reason: collision with root package name */
    public final int f106567q;

    /* renamed from: r, reason: collision with root package name */
    public final int f106568r;

    /* renamed from: s, reason: collision with root package name */
    public final p72.a f106569s;

    /* renamed from: t, reason: collision with root package name */
    public final q1 f106570t;

    /* renamed from: u, reason: collision with root package name */
    public final m1 f106571u;

    /* renamed from: v, reason: collision with root package name */
    public final m1 f106572v;

    /* renamed from: w, reason: collision with root package name */
    public final String f106573w;

    /* renamed from: x, reason: collision with root package name */
    public final long f106574x;

    /* renamed from: y, reason: collision with root package name */
    public final String f106575y;

    /* renamed from: z, reason: collision with root package name */
    public final List f106576z;

    public m1(String id3, Boolean bool, x0 image, int i13, boolean z13, String str, String str2, int i14, Boolean bool2, String str3, String type, int i15, List list, String str4, String postedAt, Boolean bool3, int i16, int i17, p72.a user, q1 shuffleEffectData, m1 m1Var, m1 m1Var2, String str5, long j13, String str6) {
        List list2 = list;
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(postedAt, "postedAt");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
        this.f106551a = id3;
        this.f106552b = bool;
        this.f106553c = image;
        this.f106554d = i13;
        this.f106555e = z13;
        this.f106556f = str;
        this.f106557g = str2;
        this.f106558h = i14;
        this.f106559i = bool2;
        this.f106560j = str3;
        this.f106561k = type;
        this.f106562l = i15;
        this.f106563m = list2;
        this.f106564n = str4;
        this.f106565o = postedAt;
        this.f106566p = bool3;
        this.f106567q = i16;
        this.f106568r = i17;
        this.f106569s = user;
        this.f106570t = shuffleEffectData;
        this.f106571u = m1Var;
        this.f106572v = m1Var2;
        this.f106573w = str5;
        this.f106574x = j13;
        this.f106575y = str6;
        this.f106576z = list2 == null ? kotlin.collections.q0.f80391a : list2;
        this.A = bool != null ? bool.booleanValue() : false;
        this.B = bool2 != null ? bool2.booleanValue() : false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        String str = m1Var.f106551a;
        int i13 = t1.f106663a;
        if (!Intrinsics.d(this.f106551a, str) || !Intrinsics.d(this.f106552b, m1Var.f106552b) || !Intrinsics.d(this.f106553c, m1Var.f106553c) || this.f106554d != m1Var.f106554d || this.f106555e != m1Var.f106555e || !Intrinsics.d(this.f106556f, m1Var.f106556f) || !Intrinsics.d(this.f106557g, m1Var.f106557g) || this.f106558h != m1Var.f106558h || !Intrinsics.d(this.f106559i, m1Var.f106559i) || !Intrinsics.d(this.f106560j, m1Var.f106560j) || !Intrinsics.d(this.f106561k, m1Var.f106561k) || this.f106562l != m1Var.f106562l || !Intrinsics.d(this.f106563m, m1Var.f106563m) || !Intrinsics.d(this.f106564n, m1Var.f106564n) || !Intrinsics.d(this.f106565o, m1Var.f106565o) || !Intrinsics.d(this.f106566p, m1Var.f106566p) || this.f106567q != m1Var.f106567q || this.f106568r != m1Var.f106568r || !Intrinsics.d(this.f106569s, m1Var.f106569s) || !Intrinsics.d(this.f106570t, m1Var.f106570t) || !Intrinsics.d(this.f106571u, m1Var.f106571u) || !Intrinsics.d(this.f106572v, m1Var.f106572v)) {
            return false;
        }
        String str2 = this.f106573w;
        String str3 = m1Var.f106573w;
        if (str2 != null ? str3 != null && Intrinsics.d(str2, str3) : str3 == null) {
            return this.f106574x == m1Var.f106574x && Intrinsics.d(this.f106575y, m1Var.f106575y);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = t1.f106663a;
        int hashCode = this.f106551a.hashCode() * 31;
        Boolean bool = this.f106552b;
        int e13 = ep.b.e(this.f106555e, ep.b.b(this.f106554d, (this.f106553c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f106556f;
        int hashCode2 = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106557g;
        int b13 = ep.b.b(this.f106558h, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool2 = this.f106559i;
        int hashCode3 = (b13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f106560j;
        int b14 = ep.b.b(this.f106562l, cb.d(this.f106561k, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        List list = this.f106563m;
        int hashCode4 = (b14 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f106564n;
        int d2 = cb.d(this.f106565o, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Boolean bool3 = this.f106566p;
        int hashCode5 = (this.f106570t.hashCode() + ((this.f106569s.hashCode() + ep.b.b(this.f106568r, ep.b.b(this.f106567q, (d2 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31), 31)) * 31)) * 31;
        m1 m1Var = this.f106571u;
        int hashCode6 = (hashCode5 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        m1 m1Var2 = this.f106572v;
        int hashCode7 = (hashCode6 + (m1Var2 == null ? 0 : m1Var2.hashCode())) * 31;
        String str5 = this.f106573w;
        int c13 = a.a.c(this.f106574x, (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.f106575y;
        return c13 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        List list = this.f106576z;
        boolean z13 = !list.isEmpty();
        String l13 = kh2.r.l1(this.f106556f);
        if (list == null) {
            list = kotlin.collections.q0.f80391a;
        }
        int size = list.size();
        String str = this.f106573w;
        String k13 = str == null ? "null" : a.a.k("CanonicalPinId(value=", str, ")");
        StringBuilder sb3 = new StringBuilder("Shuffle(id=");
        sb3.append(this.f106551a);
        sb3.append(", isFullShuffle=");
        sb3.append(z13);
        sb3.append(", isDraft=");
        sb3.append(this.A);
        sb3.append(", images=");
        sb3.append(this.f106553c);
        sb3.append(", postedCommentsCount=");
        sb3.append(this.f106554d);
        sb3.append(", isCompatible=");
        sb3.append(this.f106555e);
        sb3.append(", details=");
        sb3.append(l13);
        sb3.append(", updatedAt='");
        sb3.append(this.f106557g);
        sb3.append("', commentsCount=");
        sb3.append(this.f106558h);
        sb3.append(", isPrivate=");
        sb3.append(this.B);
        sb3.append(", createdAt='");
        sb3.append(this.f106560j);
        sb3.append("', type='");
        sb3.append(this.f106561k);
        sb3.append("', likeCount=");
        a.a.z(sb3, this.f106562l, ", items.size=", size, ", link='");
        sb3.append(this.f106564n);
        sb3.append("', postedAt='");
        sb3.append(this.f106565o);
        sb3.append("', isFinished=");
        sb3.append(this.f106566p);
        sb3.append(", reactionByMe=");
        sb3.append(this.f106567q);
        sb3.append(", reshuffleCount=");
        sb3.append(this.f106568r);
        sb3.append(", user=");
        sb3.append(this.f106569s);
        sb3.append(", shuffleEffectData=");
        sb3.append(this.f106570t);
        sb3.append(", parent=");
        sb3.append(this.f106571u);
        sb3.append(", canonicalPinId=");
        sb3.append(k13);
        sb3.append(")");
        return sb3.toString();
    }
}
