package ea1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;

/* loaded from: classes5.dex */
public final class o1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f58097b;

    /* renamed from: c, reason: collision with root package name */
    public final m3 f58098c;

    public o1(lt.j pinalyticsStateTransformer, m3 experiments) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f58097b = pinalyticsStateTransformer;
        this.f58098c = experiments;
    }

    public static l82.c0 g(b bVar, a aVar, p1 p1Var) {
        l82.c0 c0Var;
        Integer h10 = bVar.f58034a.h();
        zb0.f fVar = bVar.f58034a;
        if (h10 != null && h10.intValue() == 1) {
            if (fVar instanceof zb0.b) {
                c0Var = new l82.c0(a.e(aVar, false, null, null, false, null, null, null, false, false, false, false, false, true, false, false, null, null, false, null, false, 2093054), p1Var, kotlin.collections.q0.f80391a);
            } else {
                if (!(fVar instanceof zb0.c)) {
                    if ((fVar instanceof zb0.d) && ((zb0.d) fVar).f141557a == yb0.d.OUTSIDE_TOUCH) {
                        c0Var = new l82.c0(a.e(aVar, false, null, null, false, null, null, null, false, false, false, false, false, true, false, false, null, null, false, null, false, 2093055), p1Var, kotlin.collections.q0.f80391a);
                    }
                    return new l82.c0(aVar, p1Var);
                }
                a e13 = a.e(aVar, true, null, null, false, null, null, null, false, false, false, false, false, false, false, false, null, null, false, null, false, 2097150);
                yk2.b bVar2 = new yk2.b();
                bVar2.add(new g1(p1Var.f58104c));
                if (p1Var.f58108g) {
                    bVar2.add(new a1(p1Var.f58104c));
                }
                Unit unit = Unit.f80348a;
                c0Var = new l82.c0(e13, p1Var, kotlin.collections.e0.a(bVar2));
            }
        } else {
            if (h10 == null || h10.intValue() != 2) {
                return new l82.c0(aVar, p1Var);
            }
            if (fVar instanceof zb0.b) {
                c0Var = new l82.c0(a.e(aVar, false, null, null, false, null, null, null, false, false, false, false, false, false, true, false, null, null, false, null, false, 2080766), p1Var, kotlin.collections.q0.f80391a);
            } else {
                if (!(fVar instanceof zb0.c)) {
                    if ((fVar instanceof zb0.d) && ((zb0.d) fVar).f141557a == yb0.d.OUTSIDE_TOUCH) {
                        return new l82.c0(a.e(aVar, false, null, null, false, null, null, null, false, false, false, false, false, false, true, false, null, null, false, null, false, 2080767), p1Var, kotlin.collections.q0.f80391a);
                    }
                    return new l82.c0(aVar, p1Var);
                }
                c0Var = new l82.c0(a.e(aVar, true, null, null, false, null, null, null, false, false, false, false, false, false, false, false, null, null, false, null, false, 2097150), p1Var, kotlin.collections.e0.b(new a1(p1Var.f58104c)));
            }
        }
        return c0Var;
    }

    public static l82.c0 h(a aVar, p1 p1Var) {
        return new l82.c0(a.e(aVar, false, null, null, false, null, null, null, false, false, false, false, false, false, true, false, null, null, false, null, false, 2080766), p1.b(p1Var, null, false, null, null, false, true, false, false, false, false, 1983), kotlin.collections.q0.f80391a);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        p1 vmState = (p1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        m3 m3Var = this.f58098c;
        return new l82.c0(new a(true, null, new zy.a0(), false, null, null, null, false, false, false, false, false, false, m3Var.b(), false, false, null, null, false, null, false), p1.b(vmState, null, false, null, null, false, false, m3Var.b(), false, false, false, 1919), kotlin.collections.f0.j(d1.f58043a, x0.f58169a));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // l82.d
    public final l82.c0 f(
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
