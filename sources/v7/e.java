package v7;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f124264a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f124265b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f124266c;

    /* renamed from: d, reason: collision with root package name */
    public final long f124267d;

    /* renamed from: e, reason: collision with root package name */
    public final long f124268e;

    /* renamed from: f, reason: collision with root package name */
    public final long f124269f;

    /* renamed from: g, reason: collision with root package name */
    public final long f124270g;

    /* renamed from: h, reason: collision with root package name */
    public final List f124271h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f124272i;

    /* renamed from: j, reason: collision with root package name */
    public final long f124273j;

    /* renamed from: k, reason: collision with root package name */
    public final long f124274k;

    /* renamed from: l, reason: collision with root package name */
    public final c1 f124275l;

    /* renamed from: m, reason: collision with root package name */
    public final c1 f124276m;

    /* renamed from: n, reason: collision with root package name */
    public final c1 f124277n;

    public e(String str, Uri uri, Uri uri2, long j13, long j14, long j15, long j16, ArrayList arrayList, boolean z13, long j17, long j18, ArrayList arrayList2, ArrayList arrayList3, v2 v2Var) {
        bf.b.i((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f124264a = str;
        this.f124265b = uri;
        this.f124266c = uri2;
        this.f124267d = j13;
        this.f124268e = j14;
        this.f124269f = j15;
        this.f124270g = j16;
        this.f124271h = arrayList;
        this.f124272i = z13;
        this.f124273j = j17;
        this.f124274k = j18;
        this.f124275l = c1.r(arrayList2);
        this.f124276m = c1.r(arrayList3);
        this.f124277n = c1.r(v2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f124267d == eVar.f124267d && this.f124268e == eVar.f124268e && this.f124269f == eVar.f124269f && this.f124270g == eVar.f124270g && this.f124272i == eVar.f124272i && this.f124273j == eVar.f124273j && this.f124274k == eVar.f124274k && Objects.equals(this.f124264a, eVar.f124264a) && Objects.equals(this.f124265b, eVar.f124265b) && Objects.equals(this.f124266c, eVar.f124266c) && Objects.equals(this.f124271h, eVar.f124271h) && Objects.equals(this.f124275l, eVar.f124275l) && Objects.equals(this.f124276m, eVar.f124276m) && Objects.equals(this.f124277n, eVar.f124277n);
    }

    public final int hashCode() {
        return Objects.hash(this.f124264a, this.f124265b, this.f124266c, Long.valueOf(this.f124267d), Long.valueOf(this.f124268e), Long.valueOf(this.f124269f), Long.valueOf(this.f124270g), this.f124271h, Boolean.valueOf(this.f124272i), Long.valueOf(this.f124273j), Long.valueOf(this.f124274k), this.f124275l, this.f124276m, this.f124277n);
    }
}
