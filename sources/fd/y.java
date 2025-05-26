package fd;

import ao2.o1;
import do2.f0;
import do2.f2;
import do2.g2;
import do2.z1;
import do2.z2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lb.l0;

/* loaded from: classes3.dex */
public final class y implements dd.a {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f61828a;

    /* renamed from: b, reason: collision with root package name */
    public final List f61829b;

    /* renamed from: c, reason: collision with root package name */
    public final j f61830c;

    /* renamed from: d, reason: collision with root package name */
    public final long f61831d;

    /* renamed from: e, reason: collision with root package name */
    public final f f61832e;

    /* renamed from: f, reason: collision with root package name */
    public final kl2.l f61833f;

    /* renamed from: g, reason: collision with root package name */
    public final co2.m f61834g = l0.b(Integer.MAX_VALUE, null, 6);

    /* renamed from: h, reason: collision with root package name */
    public final f2 f61835h;

    /* renamed from: i, reason: collision with root package name */
    public final z1 f61836i;

    /* renamed from: j, reason: collision with root package name */
    public final bd.c f61837j;

    /* renamed from: k, reason: collision with root package name */
    public final u f61838k;

    public y(Function1 function1, ArrayList arrayList, j jVar, long j13, f fVar, kl2.l lVar) {
        this.f61828a = function1;
        this.f61829b = arrayList;
        this.f61830c = jVar;
        this.f61831d = j13;
        this.f61832e = fVar;
        this.f61833f = lVar;
        f2 a13 = g2.a(0, Integer.MAX_VALUE, co2.a.SUSPEND);
        this.f61835h = a13;
        this.f61836i = new z1(a13);
        a13.g();
        bd.c cVar = new bd.c();
        this.f61837j = cVar;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.f22685b), null, null, new k(this, null), 3);
        this.f61838k = new u(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:180|(3:181|182|183)|(1:83)|84|85|86|87|88|89|90|(1:123)(11:92|93|94|(0)(0)|108|12|(0)(0)|15|16|17|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:180|181|182|183|83|84|85|86|87|88|89|90|(1:123)(11:92|93|94|(0)(0)|108|12|(0)(0)|15|16|17|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:74|(2:76|(1:78)(1:149))|150|151) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03c3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c4, code lost:
    
        r2 = r4;
        r10 = r7;
        r4 = r12;
        r12 = r13;
        r13 = r14;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03cc, code lost:
    
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02eb, code lost:
    
        if (r7.isEmpty() != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0322, code lost:
    
        r1.f61812r = r15;
        r1.f61813s = r14;
        r1.f61814t = r5;
        r1.f61815u = r13;
        r1.f61816v = r12;
        r1.f61817w = r11;
        r1.f61818x = r4;
        r1.f61819y = null;
        r1.f61820z = r9;
        r1.C = 5;
        r0 = ((fd.d) r2).a(r0, r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0344, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0346, code lost:
    
        if (r0 != r3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x034a, code lost:
    
        r2 = r4;
        r4 = r11;
        r10 = r9;
        r9 = r15;
        r15 = r14;
        r14 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0301 A[Catch: Exception -> 0x02ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ee, blocks: (B:153:0x02e4, B:76:0x0301), top: B:152:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0475  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0501 -> B:12:0x0581). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x057d -> B:12:0x0581). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0403 -> B:17:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x05bc -> B:16:0x05b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(fd.y r28, ao2.j0 r29, bl2.c r30) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.y.b(fd.y, ao2.j0, bl2.c):java.lang.Object");
    }

    public static final void c(j0 j0Var, j0 j0Var2, j0 j0Var3) {
        d0 d0Var = (d0) j0Var.f80434a;
        if (d0Var != null) {
            d0Var.f61761a.f61747b.f(1000, null);
        }
        j0Var.f80434a = null;
        o1 o1Var = (o1) j0Var2.f80434a;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
        j0Var2.f80434a = null;
        o1 o1Var2 = (o1) j0Var3.f80434a;
        if (o1Var2 != null) {
            o1Var2.cancel((CancellationException) null);
        }
        j0Var3.f80434a = null;
    }

    @Override // dd.a
    public final do2.i a(pc.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        bd.d dVar = new bd.d();
        bl2.c cVar = null;
        int i13 = 1;
        androidx.slidingpanelayout.widget.c cVar2 = new androidx.slidingpanelayout.widget.c(new z2(this.f61836i, new s(this, request, null)), request, i13);
        int i14 = 0;
        t transform = new t(request, cVar, i14);
        Intrinsics.checkNotNullParameter(cVar2, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new f0(new androidx.slidingpanelayout.widget.c(new r(new pb.k(new bd.h(cVar2, transform, null)), request, dVar, i14), dVar, 2), new c2.r(this, request, cVar, i13));
    }

    @Override // dd.a
    public final void dispose() {
        this.f61834g.g(gd.c.f64785a);
    }
}
