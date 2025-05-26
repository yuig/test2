package s3;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f110804a;

    /* renamed from: b, reason: collision with root package name */
    public final x f110805b;

    /* renamed from: c, reason: collision with root package name */
    public q1 f110806c;

    /* renamed from: d, reason: collision with root package name */
    public final h2 f110807d;

    /* renamed from: e, reason: collision with root package name */
    public u2.p f110808e;

    /* renamed from: f, reason: collision with root package name */
    public k2.e f110809f;

    /* renamed from: g, reason: collision with root package name */
    public k2.e f110810g;

    /* renamed from: h, reason: collision with root package name */
    public i1 f110811h;

    public j1(k0 k0Var) {
        this.f110804a = k0Var;
        x xVar = new x(k0Var);
        this.f110805b = xVar;
        this.f110806c = xVar;
        h2 h2Var = xVar.L;
        this.f110807d = h2Var;
        this.f110808e = h2Var;
    }

    public static final void a(j1 j1Var, u2.p pVar, q1 q1Var) {
        j1Var.getClass();
        for (u2.p pVar2 = pVar.f120046e; pVar2 != null; pVar2 = pVar2.f120046e) {
            if (pVar2 == l1.f110839a) {
                k0 v13 = j1Var.f110804a.v();
                q1Var.f110901o = v13 != null ? v13.f110837y.f110805b : null;
                j1Var.f110806c = q1Var;
                return;
            } else {
                if ((pVar2.f120044c & 2) != 0) {
                    return;
                }
                pVar2.L0(q1Var);
            }
        }
    }

    public static u2.p b(u2.o oVar, u2.p pVar) {
        u2.p pVar2;
        if (oVar instanceof e1) {
            pVar2 = ((e1) oVar).l();
            pVar2.f120044c = r1.g(pVar2);
        } else {
            d dVar = new d();
            dVar.f120044c = r1.e(oVar);
            dVar.f110754n = oVar;
            dVar.f110756p = new HashSet();
            pVar2 = dVar;
        }
        if (!(!pVar2.f120054m)) {
            jk.r.y("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        pVar2.f120050i = true;
        u2.p pVar3 = pVar.f120047f;
        if (pVar3 != null) {
            pVar3.f120046e = pVar2;
            pVar2.f120047f = pVar3;
        }
        pVar.f120047f = pVar2;
        pVar2.f120046e = pVar;
        return pVar2;
    }

    public static u2.p c(u2.p pVar) {
        boolean z13 = pVar.f120054m;
        if (z13) {
            g1.z zVar = r1.f110915a;
            if (!z13) {
                jk.r.y("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            r1.b(pVar, -1, 2);
            pVar.I0();
            pVar.C0();
        }
        u2.p pVar2 = pVar.f120047f;
        u2.p pVar3 = pVar.f120046e;
        if (pVar2 != null) {
            pVar2.f120046e = pVar3;
            pVar.f120047f = null;
        }
        if (pVar3 != null) {
            pVar3.f120047f = pVar2;
            pVar.f120046e = null;
        }
        Intrinsics.f(pVar3);
        return pVar3;
    }

    public static void h(u2.o oVar, u2.o oVar2, u2.p pVar) {
        if ((oVar instanceof e1) && (oVar2 instanceof e1)) {
            k1 k1Var = l1.f110839a;
            Intrinsics.g(pVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((e1) oVar2).m(pVar);
            if (pVar.f120054m) {
                r1.d(pVar);
                return;
            } else {
                pVar.f120051j = true;
                return;
            }
        }
        if (!(pVar instanceof d)) {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
        ((d) pVar).N0(oVar2);
        if (pVar.f120054m) {
            r1.d(pVar);
        } else {
            pVar.f120051j = true;
        }
    }

    public final boolean d(int i13) {
        return (i13 & this.f110808e.f120045d) != 0;
    }

    public final void e() {
        for (u2.p pVar = this.f110808e; pVar != null; pVar = pVar.f120047f) {
            pVar.H0();
            if (pVar.f120050i) {
                r1.a(pVar);
            }
            if (pVar.f120051j) {
                r1.d(pVar);
            }
            pVar.f120050i = false;
            pVar.f120051j = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:s3.i1) from 0x001e: IPUT (r11v13 ?? I:s3.i1), (r29v0 'this' ?? I:s3.j1 A[IMMUTABLE_TYPE, THIS]) s3.j1.h s3.i1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:s3.i1) from 0x001e: IPUT (r11v13 ?? I:s3.i1), (r29v0 'this' ?? I:s3.j1 A[IMMUTABLE_TYPE, THIS]) s3.j1.h s3.i1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    public final void g() {
        k0 k0Var;
        d0 d0Var;
        u2.p pVar = this.f110807d.f120046e;
        q1 q1Var = this.f110805b;
        u2.p pVar2 = pVar;
        while (true) {
            k0Var = this.f110804a;
            if (pVar2 == null) {
                break;
            }
            c0 k13 = com.bumptech.glide.c.k(pVar2);
            if (k13 != null) {
                q1 q1Var2 = pVar2.f120049h;
                if (q1Var2 != null) {
                    d0 d0Var2 = (d0) q1Var2;
                    c0 c0Var = d0Var2.L;
                    d0Var2.w1(k13);
                    d0Var = d0Var2;
                    if (c0Var != pVar2) {
                        d0Var2.g1();
                        d0Var = d0Var2;
                    }
                } else {
                    d0 d0Var3 = new d0(k0Var, k13);
                    pVar2.L0(d0Var3);
                    d0Var = d0Var3;
                }
                q1Var.f110901o = d0Var;
                d0Var.f110900n = q1Var;
                q1Var = d0Var;
            } else {
                pVar2.L0(q1Var);
            }
            pVar2 = pVar2.f120046e;
        }
        k0 v13 = k0Var.v();
        q1Var.f110901o = v13 != null ? v13.f110837y.f110805b : null;
        this.f110806c = q1Var;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        u2.p pVar = this.f110808e;
        h2 h2Var = this.f110807d;
        if (pVar != h2Var) {
            while (true) {
                if (pVar == null || pVar == h2Var) {
                    break;
                }
                sb3.append(String.valueOf(pVar));
                if (pVar.f120047f == h2Var) {
                    sb3.append("]");
                    break;
                }
                sb3.append(",");
                pVar = pVar.f120047f;
            }
        } else {
            sb3.append("]");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
