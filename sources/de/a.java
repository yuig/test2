package de;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import he.n;
import nd.p;
import net.quikkly.android.utils.BitmapUtils;
import pd.q;
import pd.r;
import wd.m;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f54475a;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f54479e;

    /* renamed from: f, reason: collision with root package name */
    public int f54480f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f54481g;

    /* renamed from: h, reason: collision with root package name */
    public int f54482h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f54487m;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f54489o;

    /* renamed from: p, reason: collision with root package name */
    public int f54490p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f54494t;

    /* renamed from: u, reason: collision with root package name */
    public Resources.Theme f54495u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f54496v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f54497w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f54498x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f54500z;

    /* renamed from: b, reason: collision with root package name */
    public float f54476b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public r f54477c = r.f99746c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f54478d = com.bumptech.glide.h.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54483i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f54484j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f54485k = -1;

    /* renamed from: l, reason: collision with root package name */
    public nd.h f54486l = ge.c.f64837b;

    /* renamed from: n, reason: collision with root package name */
    public boolean f54488n = true;

    /* renamed from: q, reason: collision with root package name */
    public nd.l f54491q = new nd.l();

    /* renamed from: r, reason: collision with root package name */
    public he.d f54492r = new he.d(0);

    /* renamed from: s, reason: collision with root package name */
    public Class f54493s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    public boolean f54499y = true;

    public static boolean k(int i13, int i14) {
        return (i13 & i14) != 0;
    }

    public final a A() {
        if (this.f54496v) {
            return clone().A();
        }
        this.f54500z = true;
        this.f54475a |= 1048576;
        r();
        return this;
    }

    public a a(a aVar) {
        if (this.f54496v) {
            return clone().a(aVar);
        }
        if (k(aVar.f54475a, 2)) {
            this.f54476b = aVar.f54476b;
        }
        if (k(aVar.f54475a, 262144)) {
            this.f54497w = aVar.f54497w;
        }
        if (k(aVar.f54475a, 1048576)) {
            this.f54500z = aVar.f54500z;
        }
        if (k(aVar.f54475a, 4)) {
            this.f54477c = aVar.f54477c;
        }
        if (k(aVar.f54475a, 8)) {
            this.f54478d = aVar.f54478d;
        }
        if (k(aVar.f54475a, 16)) {
            this.f54479e = aVar.f54479e;
            this.f54480f = 0;
            this.f54475a &= -33;
        }
        if (k(aVar.f54475a, 32)) {
            this.f54480f = aVar.f54480f;
            this.f54479e = null;
            this.f54475a &= -17;
        }
        if (k(aVar.f54475a, 64)) {
            this.f54481g = aVar.f54481g;
            this.f54482h = 0;
            this.f54475a &= -129;
        }
        if (k(aVar.f54475a, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)) {
            this.f54482h = aVar.f54482h;
            this.f54481g = null;
            this.f54475a &= -65;
        }
        if (k(aVar.f54475a, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER)) {
            this.f54483i = aVar.f54483i;
        }
        if (k(aVar.f54475a, BitmapUtils.BITMAP_TO_JPEG_SIZE)) {
            this.f54485k = aVar.f54485k;
            this.f54484j = aVar.f54484j;
        }
        if (k(aVar.f54475a, 1024)) {
            this.f54486l = aVar.f54486l;
        }
        if (k(aVar.f54475a, 4096)) {
            this.f54493s = aVar.f54493s;
        }
        if (k(aVar.f54475a, 8192)) {
            this.f54489o = aVar.f54489o;
            this.f54490p = 0;
            this.f54475a &= -16385;
        }
        if (k(aVar.f54475a, 16384)) {
            this.f54490p = aVar.f54490p;
            this.f54489o = null;
            this.f54475a &= -8193;
        }
        if (k(aVar.f54475a, 32768)) {
            this.f54495u = aVar.f54495u;
        }
        if (k(aVar.f54475a, 65536)) {
            this.f54488n = aVar.f54488n;
        }
        if (k(aVar.f54475a, 131072)) {
            this.f54487m = aVar.f54487m;
        }
        if (k(aVar.f54475a, 2048)) {
            this.f54492r.putAll(aVar.f54492r);
            this.f54499y = aVar.f54499y;
        }
        if (k(aVar.f54475a, 524288)) {
            this.f54498x = aVar.f54498x;
        }
        if (!this.f54488n) {
            this.f54492r.clear();
            int i13 = this.f54475a;
            this.f54487m = false;
            this.f54475a = i13 & (-133121);
            this.f54499y = true;
        }
        this.f54475a |= aVar.f54475a;
        this.f54491q.f90422b.g(aVar.f54491q.f90422b);
        r();
        return this;
    }

    public final a b() {
        return q(m.f129184b, new wd.h(), true);
    }

    @Override // 
    /* renamed from: c */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            nd.l lVar = new nd.l();
            aVar.f54491q = lVar;
            lVar.f90422b.g(this.f54491q.f90422b);
            he.d dVar = new he.d(0);
            aVar.f54492r = dVar;
            dVar.putAll(this.f54492r);
            aVar.f54494t = false;
            aVar.f54496v = false;
            return aVar;
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return j((a) obj);
        }
        return false;
    }

    public final a g(Class cls) {
        if (this.f54496v) {
            return clone().g(cls);
        }
        this.f54493s = cls;
        this.f54475a |= 4096;
        r();
        return this;
    }

    public final a h(q qVar) {
        if (this.f54496v) {
            return clone().h(qVar);
        }
        this.f54477c = qVar;
        this.f54475a |= 4;
        r();
        return this;
    }

    public int hashCode() {
        float f13 = this.f54476b;
        char[] cArr = n.f68959a;
        return n.h(n.h(n.h(n.h(n.h(n.h(n.h(n.i(n.i(n.i(n.i(n.g(this.f54485k, n.g(this.f54484j, n.i(n.h(n.g(this.f54490p, n.h(n.g(this.f54482h, n.h(n.g(this.f54480f, n.g(Float.floatToIntBits(f13), 17)), this.f54479e)), this.f54481g)), this.f54489o), this.f54483i))), this.f54487m), this.f54488n), this.f54497w), this.f54498x), this.f54477c), this.f54478d), this.f54491q), this.f54492r), this.f54493s), this.f54486l), this.f54495u);
    }

    public final a i(Drawable drawable) {
        if (this.f54496v) {
            return clone().i(drawable);
        }
        this.f54479e = drawable;
        int i13 = this.f54475a | 16;
        this.f54480f = 0;
        this.f54475a = i13 & (-33);
        r();
        return this;
    }

    public final boolean j(a aVar) {
        return Float.compare(aVar.f54476b, this.f54476b) == 0 && this.f54480f == aVar.f54480f && n.b(this.f54479e, aVar.f54479e) && this.f54482h == aVar.f54482h && n.b(this.f54481g, aVar.f54481g) && this.f54490p == aVar.f54490p && n.b(this.f54489o, aVar.f54489o) && this.f54483i == aVar.f54483i && this.f54484j == aVar.f54484j && this.f54485k == aVar.f54485k && this.f54487m == aVar.f54487m && this.f54488n == aVar.f54488n && this.f54497w == aVar.f54497w && this.f54498x == aVar.f54498x && this.f54477c.equals(aVar.f54477c) && this.f54478d == aVar.f54478d && this.f54491q.equals(aVar.f54491q) && this.f54492r.equals(aVar.f54492r) && this.f54493s.equals(aVar.f54493s) && n.b(this.f54486l, aVar.f54486l) && n.b(this.f54495u, aVar.f54495u);
    }

    public final a l(wd.k kVar, wd.d dVar) {
        if (this.f54496v) {
            return clone().l(kVar, dVar);
        }
        s(m.f129188f, kVar);
        return x(dVar, false);
    }

    public final a m(int i13, int i14) {
        if (this.f54496v) {
            return clone().m(i13, i14);
        }
        this.f54485k = i13;
        this.f54484j = i14;
        this.f54475a |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        r();
        return this;
    }

    public final a n(Drawable drawable) {
        if (this.f54496v) {
            return clone().n(drawable);
        }
        this.f54481g = drawable;
        int i13 = this.f54475a | 64;
        this.f54482h = 0;
        this.f54475a = i13 & (-129);
        r();
        return this;
    }

    public final a o(com.bumptech.glide.h hVar) {
        if (this.f54496v) {
            return clone().o(hVar);
        }
        d7.b.p(hVar, "Argument must not be null");
        this.f54478d = hVar;
        this.f54475a |= 8;
        r();
        return this;
    }

    public final a p(nd.k kVar) {
        if (this.f54496v) {
            return clone().p(kVar);
        }
        this.f54491q.f90422b.remove(kVar);
        r();
        return this;
    }

    public final a q(wd.k kVar, wd.d dVar, boolean z13) {
        a y13 = z13 ? y(kVar, dVar) : l(kVar, dVar);
        y13.f54499y = true;
        return y13;
    }

    public final void r() {
        if (this.f54494t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a s(nd.k kVar, Object obj) {
        if (this.f54496v) {
            return clone().s(kVar, obj);
        }
        d7.b.o(kVar);
        d7.b.o(obj);
        this.f54491q.f90422b.put(kVar, obj);
        r();
        return this;
    }

    public final a t(nd.h hVar) {
        if (this.f54496v) {
            return clone().t(hVar);
        }
        this.f54486l = hVar;
        this.f54475a |= 1024;
        r();
        return this;
    }

    public final a u() {
        if (this.f54496v) {
            return clone().u();
        }
        this.f54483i = false;
        this.f54475a |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        r();
        return this;
    }

    public final a v(Resources.Theme theme) {
        if (this.f54496v) {
            return clone().v(theme);
        }
        this.f54495u = theme;
        if (theme != null) {
            this.f54475a |= 32768;
            return s(xd.e.f134594b, theme);
        }
        this.f54475a &= -32769;
        return p(xd.e.f134594b);
    }

    public final a w(Class cls, p pVar, boolean z13) {
        if (this.f54496v) {
            return clone().w(cls, pVar, z13);
        }
        d7.b.o(pVar);
        this.f54492r.put(cls, pVar);
        int i13 = this.f54475a;
        this.f54488n = true;
        this.f54475a = 67584 | i13;
        this.f54499y = false;
        if (z13) {
            this.f54475a = i13 | 198656;
            this.f54487m = true;
        }
        r();
        return this;
    }

    public final a x(p pVar, boolean z13) {
        if (this.f54496v) {
            return clone().x(pVar, z13);
        }
        wd.r rVar = new wd.r(pVar, z13);
        w(Bitmap.class, pVar, z13);
        w(Drawable.class, rVar, z13);
        w(BitmapDrawable.class, rVar, z13);
        w(yd.c.class, new yd.d(pVar), z13);
        r();
        return this;
    }

    public final a y(wd.k kVar, wd.d dVar) {
        if (this.f54496v) {
            return clone().y(kVar, dVar);
        }
        s(m.f129188f, kVar);
        return x(dVar, true);
    }

    public final a z(p... pVarArr) {
        if (pVarArr.length > 1) {
            return x(new nd.i(pVarArr), true);
        }
        if (pVarArr.length == 1) {
            return x(pVarArr[0], true);
        }
        r();
        return this;
    }
}
