package s3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final s2.w f110746a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f110747b = s0.f110927u;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f110748c = s0.f110928v;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f110749d = s0.f110929w;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f110750e = s0.f110923q;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f110751f = s0.f110924r;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f110752g = s0.f110925s;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f110753h = s0.f110926t;

    public c2(t3.o oVar) {
        this.f110746a = new s2.w(oVar);
    }

    public final void a() {
        s2.w wVar = this.f110746a;
        synchronized (wVar.f110702f) {
            try {
                k2.e eVar = wVar.f110702f;
                int i13 = eVar.f78184c;
                int i14 = 0;
                for (int i15 = 0; i15 < i13; i15++) {
                    s2.v vVar = (s2.v) eVar.f78182a[i15];
                    vVar.e();
                    if (!(vVar.f110690f.f63242e != 0)) {
                        i14++;
                    } else if (i14 > 0) {
                        Object[] objArr = eVar.f78182a;
                        objArr[i15 - i14] = objArr[i15];
                    }
                }
                int i16 = i13 - i14;
                kotlin.collections.z.o(i16, i13, null, eVar.f78182a);
                eVar.f78184c = i16;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b(b2 b2Var, Function1 function1, Function0 function0) {
        this.f110746a.c(b2Var, function1, function0);
    }
}
