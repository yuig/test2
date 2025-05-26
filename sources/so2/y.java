package so2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kh2.j1;
import kh2.m2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f114835a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f114836b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f114837c;

    /* renamed from: d, reason: collision with root package name */
    public int f114838d;

    public y(ro2.k configuration, g0 lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f114835a = lexer;
        this.f114836b = configuration.f109014c;
        this.f114837c = configuration.f109025n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0090 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(so2.y r13, xk2.b r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.y.a(so2.y, xk2.b, bl2.c):java.lang.Object");
    }

    public final ro2.n b() {
        ro2.n c0Var;
        Object obj;
        Object invoke;
        g0 g0Var = this.f114835a;
        byte r13 = g0Var.r();
        if (r13 == 1) {
            return d(true);
        }
        if (r13 == 0) {
            return d(false);
        }
        if (r13 != 6) {
            if (r13 == 8) {
                return c();
            }
            g0.n(g0Var, "Cannot read Json element because of unexpected ".concat(m2.U1(r13)), 0, null, 6);
            throw null;
        }
        int i13 = this.f114838d + 1;
        this.f114838d = i13;
        if (i13 == 200) {
            t72.j jVar = new t72.j(new w(this, null));
            Unit unit = Unit.f80348a;
            cl2.a aVar = xk2.a.f135199a;
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            kl2.l block = (kl2.l) jVar.f116663b;
            Intrinsics.checkNotNullParameter(block, "block");
            xk2.c cVar = new xk2.c(null);
            cVar.f135202a = block;
            cVar.f135203b = unit;
            cVar.f135204c = cVar;
            cl2.a aVar2 = xk2.a.f135199a;
            cVar.f135205d = aVar2;
            while (true) {
                obj = cVar.f135205d;
                bl2.c completion = cVar.f135204c;
                if (completion == null) {
                    break;
                }
                xk2.q qVar = xk2.s.f135225b;
                if (Intrinsics.d(aVar2, obj)) {
                    try {
                        kl2.l lVar = cVar.f135202a;
                        Object obj2 = cVar.f135203b;
                        if (lVar instanceof dl2.a) {
                            dl2.b.y(3, lVar);
                            invoke = lVar.invoke(cVar, obj2, completion);
                        } else {
                            Intrinsics.checkNotNullParameter(lVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            Object fVar = context == kotlin.coroutines.j.f80412a ? new cl2.f(completion) : new cl2.g(completion, context);
                            dl2.b.y(3, lVar);
                            invoke = lVar.invoke(cVar, obj2, fVar);
                        }
                        if (invoke != cl2.a.COROUTINE_SUSPENDED) {
                            completion.resumeWith(invoke);
                        }
                    } catch (Throwable th3) {
                        xk2.q qVar2 = xk2.s.f135225b;
                        completion.resumeWith(ue.c.m(th3));
                    }
                } else {
                    cVar.f135205d = aVar2;
                    completion.resumeWith(obj);
                }
            }
            ue.c.H(obj);
            c0Var = (ro2.n) obj;
        } else {
            byte f13 = g0Var.f((byte) 6);
            if (g0Var.r() == 4) {
                g0.n(g0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!g0Var.b()) {
                    break;
                }
                String j13 = this.f114836b ? g0Var.j() : g0Var.i();
                g0Var.f((byte) 5);
                linkedHashMap.put(j13, b());
                f13 = g0Var.e();
                if (f13 != 4) {
                    if (f13 != 7) {
                        g0.n(g0Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f13 == 6) {
                g0Var.f((byte) 7);
            } else if (f13 == 4) {
                if (!this.f114837c) {
                    j1.Z0(g0Var, "object");
                    throw null;
                }
                g0Var.f((byte) 7);
            }
            c0Var = new ro2.c0(linkedHashMap);
        }
        this.f114838d--;
        return c0Var;
    }

    public final ro2.e c() {
        g0 g0Var = this.f114835a;
        byte e13 = g0Var.e();
        if (g0Var.r() == 4) {
            g0.n(g0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (g0Var.b()) {
            arrayList.add(b());
            e13 = g0Var.e();
            if (e13 != 4) {
                boolean z13 = e13 == 9;
                int i13 = g0Var.f114789a;
                if (!z13) {
                    g0.n(g0Var, "Expected end of the array or comma", i13, null, 4);
                    throw null;
                }
            }
        }
        if (e13 == 8) {
            g0Var.f((byte) 9);
        } else if (e13 == 4) {
            if (!this.f114837c) {
                j1.Z0(g0Var, "array");
                throw null;
            }
            g0Var.f((byte) 9);
        }
        return new ro2.e(arrayList);
    }

    public final ro2.h0 d(boolean z13) {
        boolean z14 = this.f114836b;
        g0 g0Var = this.f114835a;
        String j13 = (z14 || !z13) ? g0Var.j() : g0Var.i();
        return (z13 || !Intrinsics.d(j13, "null")) ? new ro2.v(j13, z13, null) : ro2.z.INSTANCE;
    }
}
