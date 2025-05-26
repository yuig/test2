package k8;

import a7.c1;
import java.util.Comparator;
import pk.d3;
import pk.j0;
import pk.s2;

/* loaded from: classes3.dex */
public final class m extends o implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f78533e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78534f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78535g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78536h;

    /* renamed from: i, reason: collision with root package name */
    public final int f78537i;

    /* renamed from: j, reason: collision with root package name */
    public final int f78538j;

    /* renamed from: k, reason: collision with root package name */
    public final int f78539k;

    /* renamed from: l, reason: collision with root package name */
    public final int f78540l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f78541m;

    public m(int i13, c1 c1Var, int i14, j jVar, int i15, String str, String str2) {
        super(i13, i14, c1Var);
        int i16;
        int i17 = 0;
        this.f78534f = m7.h.p(i15, false);
        int i18 = this.f78545d.f18755e & (~jVar.f1051y);
        this.f78535g = (i18 & 1) != 0;
        this.f78536h = (i18 & 2) != 0;
        pk.c1 c1Var2 = jVar.f1048v;
        pk.c1 v13 = str2 != null ? pk.c1.v(str2) : c1Var2.isEmpty() ? pk.c1.v("") : c1Var2;
        int i19 = 0;
        while (true) {
            if (i19 >= v13.size()) {
                i19 = Integer.MAX_VALUE;
                i16 = 0;
                break;
            } else {
                i16 = q.n(this.f78545d, (String) v13.get(i19), jVar.f1052z);
                if (i16 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.f78537i = i19;
        this.f78538j = i16;
        int j13 = q.j(this.f78545d.f18756f, str2 != null ? 1088 : jVar.f1049w);
        this.f78539k = j13;
        this.f78541m = (1088 & this.f78545d.f18756f) != 0;
        int n13 = q.n(this.f78545d, str, q.s(str) == null);
        this.f78540l = n13;
        boolean z13 = i16 > 0 || (c1Var2.isEmpty() && j13 > 0) || this.f78535g || (this.f78536h && n13 > 0);
        if (m7.h.p(i15, jVar.R) && z13) {
            i17 = 1;
        }
        this.f78533e = i17;
    }

    @Override // k8.o
    public final int a() {
        return this.f78533e;
    }

    @Override // k8.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        j0 c13 = j0.f100432a.c(this.f78534f, mVar.f78534f);
        Integer valueOf = Integer.valueOf(this.f78537i);
        Integer valueOf2 = Integer.valueOf(mVar.f78537i);
        Comparator comparator = s2.f100480a;
        comparator.getClass();
        d3 d3Var = d3.f100381a;
        j0 b13 = c13.b(valueOf, valueOf2, d3Var);
        int i13 = this.f78538j;
        j0 a13 = b13.a(i13, mVar.f78538j);
        int i14 = this.f78539k;
        j0 c14 = a13.a(i14, mVar.f78539k).c(this.f78535g, mVar.f78535g);
        Boolean valueOf3 = Boolean.valueOf(this.f78536h);
        Boolean valueOf4 = Boolean.valueOf(mVar.f78536h);
        if (i13 != 0) {
            comparator = d3Var;
        }
        j0 a14 = c14.b(valueOf3, valueOf4, comparator).a(this.f78540l, mVar.f78540l);
        if (i14 == 0) {
            a14 = a14.d(this.f78541m, mVar.f78541m);
        }
        return a14.e();
    }
}
