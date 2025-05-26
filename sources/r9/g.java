package r9;

import android.text.Layout;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f106834a;

    /* renamed from: b, reason: collision with root package name */
    public int f106835b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f106836c;

    /* renamed from: d, reason: collision with root package name */
    public int f106837d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f106838e;

    /* renamed from: k, reason: collision with root package name */
    public float f106844k;

    /* renamed from: l, reason: collision with root package name */
    public String f106845l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f106848o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f106849p;

    /* renamed from: r, reason: collision with root package name */
    public b f106851r;

    /* renamed from: t, reason: collision with root package name */
    public String f106853t;

    /* renamed from: u, reason: collision with root package name */
    public String f106854u;

    /* renamed from: f, reason: collision with root package name */
    public int f106839f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f106840g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f106841h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f106842i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f106843j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f106846m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f106847n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f106850q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f106852s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i13;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f106836c && gVar.f106836c) {
                this.f106835b = gVar.f106835b;
                this.f106836c = true;
            }
            if (this.f106841h == -1) {
                this.f106841h = gVar.f106841h;
            }
            if (this.f106842i == -1) {
                this.f106842i = gVar.f106842i;
            }
            if (this.f106834a == null && (str = gVar.f106834a) != null) {
                this.f106834a = str;
            }
            if (this.f106839f == -1) {
                this.f106839f = gVar.f106839f;
            }
            if (this.f106840g == -1) {
                this.f106840g = gVar.f106840g;
            }
            if (this.f106847n == -1) {
                this.f106847n = gVar.f106847n;
            }
            if (this.f106848o == null && (alignment2 = gVar.f106848o) != null) {
                this.f106848o = alignment2;
            }
            if (this.f106849p == null && (alignment = gVar.f106849p) != null) {
                this.f106849p = alignment;
            }
            if (this.f106850q == -1) {
                this.f106850q = gVar.f106850q;
            }
            if (this.f106843j == -1) {
                this.f106843j = gVar.f106843j;
                this.f106844k = gVar.f106844k;
            }
            if (this.f106851r == null) {
                this.f106851r = gVar.f106851r;
            }
            if (this.f106852s == Float.MAX_VALUE) {
                this.f106852s = gVar.f106852s;
            }
            if (this.f106853t == null) {
                this.f106853t = gVar.f106853t;
            }
            if (this.f106854u == null) {
                this.f106854u = gVar.f106854u;
            }
            if (!this.f106838e && gVar.f106838e) {
                this.f106837d = gVar.f106837d;
                this.f106838e = true;
            }
            if (this.f106846m != -1 || (i13 = gVar.f106846m) == -1) {
                return;
            }
            this.f106846m = i13;
        }
    }
}
