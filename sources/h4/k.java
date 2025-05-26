package h4;

import j1.x0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public f0 f67570a;

    /* renamed from: b, reason: collision with root package name */
    public l f67571b;

    public final f0 a(List list) {
        j jVar;
        Exception e13;
        try {
            int size = list.size();
            int i13 = 0;
            jVar = null;
            while (i13 < size) {
                try {
                    j jVar2 = (j) list.get(i13);
                    try {
                        jVar2.a(this.f67571b);
                        i13++;
                        jVar = jVar2;
                    } catch (Exception e14) {
                        e13 = e14;
                        jVar = jVar2;
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb4.append(this.f67571b.f67586a.a());
                        sb4.append(", composition=");
                        sb4.append(this.f67571b.c());
                        sb4.append(", selection=");
                        l lVar = this.f67571b;
                        sb4.append((Object) b4.p0.g(b7.c.h(lVar.f67587b, lVar.f67588c)));
                        sb4.append("):");
                        sb3.append(sb4.toString());
                        Intrinsics.checkNotNullExpressionValue(sb3, "append(value)");
                        sb3.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb3, "append('\\n')");
                        CollectionsKt___CollectionsKt.H(list, sb3, "\n", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : new x0(27, jVar, this));
                        String sb5 = sb3.toString();
                        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
                        throw new RuntimeException(sb5, e13);
                    }
                } catch (Exception e15) {
                    e13 = e15;
                }
            }
            l lVar2 = this.f67571b;
            lVar2.getClass();
            b4.g gVar = new b4.g(lVar2.f67586a.toString(), null, 6);
            l lVar3 = this.f67571b;
            long h10 = b7.c.h(lVar3.f67587b, lVar3.f67588c);
            b4.p0 p0Var = b4.p0.f(this.f67570a.f67560b) ? null : new b4.p0(h10);
            f0 f0Var = new f0(gVar, p0Var != null ? p0Var.f21641a : b7.c.h(b4.p0.d(h10), b4.p0.e(h10)), this.f67571b.c());
            this.f67570a = f0Var;
            return f0Var;
        } catch (Exception e16) {
            jVar = null;
            e13 = e16;
        }
    }

    public final void b(f0 f0Var, m0 m0Var) {
        boolean z13 = true;
        boolean z14 = !Intrinsics.d(f0Var.f67561c, this.f67571b.c());
        b4.g gVar = this.f67570a.f67559a;
        b4.g gVar2 = f0Var.f67559a;
        boolean d2 = Intrinsics.d(gVar, gVar2);
        boolean z15 = false;
        long j13 = f0Var.f67560b;
        if (!d2) {
            this.f67571b = new l(gVar2, j13);
        } else if (b4.p0.a(this.f67570a.f67560b, j13)) {
            z13 = false;
        } else {
            this.f67571b.f(b4.p0.e(j13), b4.p0.d(j13));
            z15 = true;
            z13 = false;
        }
        b4.p0 p0Var = f0Var.f67561c;
        if (p0Var == null) {
            l lVar = this.f67571b;
            lVar.f67589d = -1;
            lVar.f67590e = -1;
        } else {
            long j14 = p0Var.f21641a;
            if (!b4.p0.b(j14)) {
                this.f67571b.e(b4.p0.e(j14), b4.p0.d(j14));
            }
        }
        if (z13 || (!z15 && z14)) {
            l lVar2 = this.f67571b;
            lVar2.f67589d = -1;
            lVar2.f67590e = -1;
            f0Var = f0.a(f0Var, null, 0L, 3);
        }
        f0 f0Var2 = this.f67570a;
        this.f67570a = f0Var;
        if (m0Var != null) {
            m0Var.a(f0Var2, f0Var);
        }
    }
}
