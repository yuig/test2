package nj2;

import java.util.List;

/* loaded from: classes4.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public final i f90983a;

    /* renamed from: b, reason: collision with root package name */
    public final List f90984b;

    /* renamed from: c, reason: collision with root package name */
    public final List f90985c;

    /* renamed from: d, reason: collision with root package name */
    public final qi2.d f90986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90987e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90988f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90989g;

    /* renamed from: h, reason: collision with root package name */
    public final oj2.e f90990h;

    /* renamed from: i, reason: collision with root package name */
    public final String f90991i;

    /* renamed from: j, reason: collision with root package name */
    public final long f90992j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f90993k;

    public b(i iVar, List list, List list2, qi2.d dVar, int i13, int i14, int i15, oj2.e eVar, String str, long j13, boolean z13) {
        if (iVar == null) {
            throw new NullPointerException("Null delegate");
        }
        this.f90983a = iVar;
        if (list == null) {
            throw new NullPointerException("Null resolvedLinks");
        }
        this.f90984b = list;
        if (list2 == null) {
            throw new NullPointerException("Null resolvedEvents");
        }
        this.f90985c = list2;
        if (dVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f90986d = dVar;
        this.f90987e = i13;
        this.f90988f = i14;
        this.f90989g = i15;
        if (eVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f90990h = eVar;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f90991i = str;
        this.f90992j = j13;
        this.f90993k = z13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f90983a.equals(((b) rVar).f90983a)) {
            b bVar = (b) rVar;
            if (this.f90984b.equals(bVar.f90984b) && this.f90985c.equals(bVar.f90985c) && this.f90986d.equals(bVar.f90986d) && this.f90987e == bVar.f90987e && this.f90988f == bVar.f90988f && this.f90989g == bVar.f90989g && this.f90990h.equals(bVar.f90990h) && this.f90991i.equals(bVar.f90991i) && this.f90992j == bVar.f90992j && this.f90993k == bVar.f90993k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((this.f90983a.hashCode() ^ 1000003) * 1000003) ^ this.f90984b.hashCode()) * 1000003) ^ this.f90985c.hashCode()) * 1000003) ^ this.f90986d.hashCode()) * 1000003) ^ this.f90987e) * 1000003) ^ this.f90988f) * 1000003) ^ this.f90989g) * 1000003) ^ this.f90990h.hashCode()) * 1000003) ^ this.f90991i.hashCode()) * 1000003;
        long j13 = this.f90992j;
        return ((hashCode ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ (this.f90993k ? 1231 : 1237);
    }
}
