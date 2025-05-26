package q8;

import a.l9;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes.dex */
public final class q implements v {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f102985f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: g, reason: collision with root package name */
    public static final x92.b f102986g = new x92.b(new c3.e(13));

    /* renamed from: h, reason: collision with root package name */
    public static final x92.b f102987h = new x92.b(new c3.e(14));

    /* renamed from: a, reason: collision with root package name */
    public v2 f102988a;

    /* renamed from: d, reason: collision with root package name */
    public int f102991d;

    /* renamed from: e, reason: collision with root package name */
    public int f102992e;

    /* renamed from: c, reason: collision with root package name */
    public l9.j f102990c = new bk.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f102989b = true;

    @Override // q8.v
    public final void a(l9.j jVar) {
        synchronized (this) {
            this.f102990c = jVar;
        }
    }

    @Override // q8.v
    public final void b(int i13) {
        synchronized (this) {
            this.f102991d = i13;
        }
    }

    public final void c(int i13, ArrayList arrayList) {
        switch (i13) {
            case 0:
                arrayList.add(new v9.a());
                break;
            case 1:
                arrayList.add(new v9.c());
                break;
            case 2:
                arrayList.add(new v9.e());
                break;
            case 3:
                arrayList.add(new r8.a());
                break;
            case 4:
                s z13 = f102986g.z(0);
                if (z13 == null) {
                    arrayList.add(new v8.a());
                    break;
                } else {
                    arrayList.add(z13);
                    break;
                }
            case 5:
                arrayList.add(new w8.b());
                break;
            case 6:
                arrayList.add(new h9.d(this.f102989b ? 0 : 2, this.f102990c));
                break;
            case 7:
                arrayList.add(new i9.d());
                break;
            case 8:
                arrayList.add(new j9.i(j9.i.c(this.f102991d) | (this.f102989b ? 0 : 32), this.f102990c));
                arrayList.add(new j9.l(j9.l.m(this.f102991d) | (this.f102989b ? 0 : 16), this.f102990c));
                break;
            case 9:
                arrayList.add(new k9.e());
                break;
            case 10:
                arrayList.add(new v9.a0());
                break;
            case 11:
                if (this.f102988a == null) {
                    y0 y0Var = c1.f100372b;
                    this.f102988a = v2.f100502e;
                }
                arrayList.add(new v9.f0(1, !this.f102989b ? 1 : 0, this.f102990c, new d7.k0(0L), new ho.i(0, this.f102988a)));
                break;
            case 12:
                arrayList.add(new w9.d());
                break;
            case 14:
                arrayList.add(new g8.p(this.f102992e));
                break;
            case 15:
                s z14 = f102987h.z(new Object[0]);
                if (z14 != null) {
                    arrayList.add(z14);
                    break;
                }
                break;
            case 16:
                arrayList.add(new s8.b(!this.f102989b ? 1 : 0, this.f102990c));
                break;
            case 17:
                arrayList.add(new u8.a(1));
                break;
            case 18:
                arrayList.add(new t8.a(2));
                break;
            case 19:
                arrayList.add(new u8.a(0));
                break;
            case 20:
                arrayList.add(new t8.a(1));
                break;
            case 21:
                arrayList.add(new t8.a(0));
                break;
        }
    }

    @Override // q8.v
    public final void d(boolean z13) {
        synchronized (this) {
            this.f102989b = z13;
        }
    }

    @Override // q8.v
    public final synchronized s[] e(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f102985f;
            arrayList = new ArrayList(21);
            int k13 = l9.k(map);
            if (k13 != -1) {
                c(k13, arrayList);
            }
            int l13 = l9.l(uri);
            if (l13 != -1 && l13 != k13) {
                c(l13, arrayList);
            }
            for (int i13 = 0; i13 < 21; i13++) {
                int i14 = iArr[i13];
                if (i14 != k13 && i14 != l13) {
                    c(i14, arrayList);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (s[]) arrayList.toArray(new s[arrayList.size()]);
    }

    @Override // q8.v
    public final synchronized s[] f() {
        return e(Uri.EMPTY, new HashMap());
    }
}
