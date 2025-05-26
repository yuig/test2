package as1;

import android.text.TextUtils;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g1.p0;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f20419i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static b f20420j;

    /* renamed from: a, reason: collision with root package name */
    public int f20421a;

    /* renamed from: b, reason: collision with root package name */
    public int f20422b;

    /* renamed from: c, reason: collision with root package name */
    public String f20423c;

    /* renamed from: d, reason: collision with root package name */
    public String f20424d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f20425e;

    /* renamed from: f, reason: collision with root package name */
    public final p5.b f20426f;

    /* renamed from: g, reason: collision with root package name */
    public final p5.b f20427g;

    /* renamed from: h, reason: collision with root package name */
    public final p5.b f20428h;

    public b() {
        p0 p0Var = new p0();
        this.f20425e = p0Var;
        Integer num = 200;
        this.f20426f = new p5.b(num, "200x");
        Integer valueOf = Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD);
        this.f20427g = new p5.b(valueOf, "236x");
        Integer num2 = 736;
        this.f20428h = new p5.b(num2, "736x");
        p0Var.j(num.intValue(), "200x");
        p0Var.j(valueOf.intValue(), "236x");
        p0Var.j(290, "290x");
        p0Var.j(345, "345x");
        p0Var.j(474, "474x");
        p0Var.j(564, "564x");
        p0Var.j(num2.intValue(), "736x");
        p0Var.j(1200, "1200x");
    }

    public static b a() {
        if (f20420j == null) {
            synchronized (f20419i) {
                try {
                    if (f20420j == null) {
                        f20420j = new b();
                    }
                } finally {
                }
            }
        }
        return f20420j;
    }

    public static String k(String str) {
        int indexOf = str.indexOf("pin.images[");
        int indexOf2 = str.indexOf("]", indexOf) + 1;
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return l(indexOf, indexOf2, str);
    }

    public static String l(int i13, int i14, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(0, i13));
        sb3.append("pin.images[" + TextUtils.join(",", a().d()) + "]");
        sb3.append(str.substring(i14));
        return sb3.toString();
    }

    public final String b() {
        int i13 = a.f20418a[bt1.a.UNKNOWN.ordinal()];
        return (i13 == 1 || i13 == 2) ? h() : (String) this.f20428h.f98856b;
    }

    public final String c() {
        int i13 = a.f20418a[bt1.a.UNKNOWN.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return i();
        }
        p5.b bVar = this.f20427g;
        if (i13 == 3) {
            return (String) bVar.f98856b;
        }
        if (i13 != 4) {
            return (String) this.f20426f.f98856b;
        }
        String i14 = i();
        return i14 == bVar.f98856b ? "564x" : i14;
    }

    public final HashSet d() {
        HashSet hashSet = new HashSet();
        p5.b bVar = this.f20427g;
        hashSet.add((String) bVar.f98856b);
        hashSet.add((String) this.f20428h.f98856b);
        String i13 = i();
        if (i13 == bVar.f98856b) {
            hashSet.add("564x");
        } else {
            hashSet.add(i13);
        }
        hashSet.add((String) this.f20426f.f98856b);
        hashSet.add(b());
        return hashSet;
    }

    public final String e() {
        return (String) this.f20428h.f98856b;
    }

    public final String f() {
        return (String) this.f20427g.f98856b;
    }

    public final String g(int i13, p5.b bVar) {
        if (i13 <= ((Integer) bVar.f98855a).intValue()) {
            return (String) bVar.f98856b;
        }
        p0 p0Var = this.f20425e;
        int i14 = 0;
        int i15 = i13 - p0Var.i(0);
        int k13 = p0Var.k();
        for (int i16 = 1; i16 < k13; i16++) {
            int abs = Math.abs(i13 - p0Var.i(i16));
            if (abs < i15) {
                i14 = i16;
                i15 = abs;
            }
        }
        return (String) p0Var.l(i14);
    }

    public final String h() {
        if (this.f20424d == null) {
            this.f20424d = g(j(), this.f20428h);
        }
        return this.f20424d;
    }

    public final String i() {
        if (this.f20423c == null) {
            if (this.f20421a == 0) {
                this.f20421a = d.a().f20431a;
            }
            this.f20423c = g(this.f20421a, this.f20427g);
        }
        return this.f20423c;
    }

    public final int j() {
        if (this.f20422b == 0) {
            this.f20422b = Math.round(hf0.b.f69002b - (d.a().f20432b * 2));
        }
        return this.f20422b;
    }
}
