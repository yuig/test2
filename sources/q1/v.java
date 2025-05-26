package q1;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import m1.f1;
import q3.q0;

/* loaded from: classes2.dex */
public final class v implements t, q0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f102000a;

    /* renamed from: b, reason: collision with root package name */
    public int f102001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f102002c;

    /* renamed from: d, reason: collision with root package name */
    public float f102003d;

    /* renamed from: e, reason: collision with root package name */
    public final float f102004e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f102005f;

    /* renamed from: g, reason: collision with root package name */
    public final ao2.j0 f102006g;

    /* renamed from: h, reason: collision with root package name */
    public final n4.b f102007h;

    /* renamed from: i, reason: collision with root package name */
    public final long f102008i;

    /* renamed from: j, reason: collision with root package name */
    public final List f102009j;

    /* renamed from: k, reason: collision with root package name */
    public final int f102010k;

    /* renamed from: l, reason: collision with root package name */
    public final int f102011l;

    /* renamed from: m, reason: collision with root package name */
    public final int f102012m;

    /* renamed from: n, reason: collision with root package name */
    public final f1 f102013n;

    /* renamed from: o, reason: collision with root package name */
    public final int f102014o;

    /* renamed from: p, reason: collision with root package name */
    public final int f102015p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q0 f102016q;

    public v(w wVar, int i13, boolean z13, float f13, q0 q0Var, float f14, boolean z14, ao2.j0 j0Var, n4.b bVar, long j13, List list, int i14, int i15, int i16, f1 f1Var, int i17, int i18) {
        this.f102000a = wVar;
        this.f102001b = i13;
        this.f102002c = z13;
        this.f102003d = f13;
        this.f102004e = f14;
        this.f102005f = z14;
        this.f102006g = j0Var;
        this.f102007h = bVar;
        this.f102008i = j13;
        this.f102009j = list;
        this.f102010k = i14;
        this.f102011l = i15;
        this.f102012m = i16;
        this.f102013n = f1Var;
        this.f102014o = i17;
        this.f102015p = i18;
        this.f102016q = q0Var;
    }

    public final boolean a(int i13, boolean z13) {
        w wVar;
        int i14;
        if (this.f102005f) {
            return false;
        }
        List list = this.f102009j;
        if (list.isEmpty() || (wVar = this.f102000a) == null || (i14 = this.f102001b - i13) < 0 || i14 >= wVar.f102031o) {
            return false;
        }
        w wVar2 = (w) CollectionsKt.S(list);
        w wVar3 = (w) CollectionsKt.b0(list);
        wVar2.getClass();
        wVar3.getClass();
        int i15 = this.f102011l;
        int i16 = this.f102010k;
        if (i13 < 0) {
            if (Math.min((wVar2.f102029m + wVar2.f102031o) - i16, (wVar3.f102029m + wVar3.f102031o) - i15) <= (-i13)) {
                return false;
            }
        } else if (Math.min(i16 - wVar2.f102029m, i15 - wVar3.f102029m) <= i13) {
            return false;
        }
        this.f102001b -= i13;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            w wVar4 = (w) list.get(i17);
            wVar4.getClass();
            wVar4.f102029m += i13;
            int[] iArr = wVar4.f102034r;
            int length = iArr.length;
            for (int i18 = 0; i18 < length; i18++) {
                boolean z14 = wVar4.f102019c;
                if ((z14 && i18 % 2 == 1) || (!z14 && i18 % 2 == 0)) {
                    iArr[i18] = iArr[i18] + i13;
                }
            }
            if (z13) {
                int size2 = wVar4.f102018b.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    wVar4.f102028l.a(i19, wVar4.f102026j);
                }
            }
        }
        this.f102003d = i13;
        if (!this.f102002c && i13 > 0) {
            this.f102002c = true;
        }
        return true;
    }

    @Override // q3.q0
    public final Map c() {
        return this.f102016q.c();
    }

    @Override // q3.q0
    public final void d() {
        this.f102016q.d();
    }

    @Override // q3.q0
    public final Function1 e() {
        return this.f102016q.e();
    }

    @Override // q3.q0
    public final int i() {
        return this.f102016q.i();
    }

    @Override // q3.q0
    public final int j() {
        return this.f102016q.j();
    }
}
