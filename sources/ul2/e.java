package ul2;

import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class e implements am2.o {

    /* renamed from: a */
    public final /* synthetic */ int f122512a = 1;

    /* renamed from: b */
    public final Object f122513b;

    public e(i0 container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f122513b = container;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    @Override // am2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(am2.l r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.e.a(am2.l, java.lang.Object):java.lang.Object");
    }

    public final Unit b(am2.g classifier, Object obj) {
        am2.b u13;
        String str;
        switch (this.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(classifier, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y yVar = (an2.y) this.f122513b;
                an2.y yVar2 = an2.y.f15818c;
                yVar.getClass();
                int i13 = 1;
                boolean z13 = classifier.c() == am2.h.ENUM_ENTRY;
                if (!yVar.t()) {
                    yVar.C(builder, classifier, null);
                    List N = classifier.N();
                    Intrinsics.checkNotNullExpressionValue(N, "getContextReceivers(...)");
                    yVar.F(builder, N);
                    if (!z13) {
                        am2.q visibility = classifier.getVisibility();
                        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                        yVar.m0(visibility, builder);
                    }
                    if ((classifier.c() != am2.h.INTERFACE || classifier.l() != am2.c0.ABSTRACT) && (!classifier.c().isSingleton() || classifier.l() != am2.c0.FINAL)) {
                        am2.c0 l13 = classifier.l();
                        Intrinsics.checkNotNullExpressionValue(l13, "getModality(...)");
                        yVar.Q(l13, builder, an2.y.y(classifier));
                    }
                    yVar.O(classifier, builder);
                    yVar.S(builder, yVar.s().contains(an2.a0.INNER) && classifier.q(), "inner");
                    yVar.S(builder, yVar.s().contains(an2.a0.DATA) && classifier.s0(), "data");
                    yVar.S(builder, yVar.s().contains(an2.a0.INLINE) && classifier.isInline(), "inline");
                    yVar.S(builder, yVar.s().contains(an2.a0.VALUE) && classifier.Y(), "value");
                    yVar.S(builder, yVar.s().contains(an2.a0.FUN) && classifier.S(), "fun");
                    Intrinsics.checkNotNullParameter(classifier, "classifier");
                    if (classifier instanceof am2.b1) {
                        str = "typealias";
                    } else if (classifier.P()) {
                        str = "companion object";
                    } else {
                        switch (an2.p.f15808a[classifier.c().ordinal()]) {
                            case 1:
                                str = "class";
                                break;
                            case 2:
                                str = "interface";
                                break;
                            case 3:
                                str = "enum class";
                                break;
                            case 4:
                                str = "object";
                                break;
                            case 5:
                                str = "annotation class";
                                break;
                            case 6:
                                str = "enum entry";
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    builder.append(yVar.M(str));
                }
                boolean n13 = bn2.e.n(classifier);
                an2.f0 f0Var = yVar.f15821a;
                if (n13) {
                    if (((Boolean) f0Var.G.c(f0Var, an2.f0.X[31])).booleanValue()) {
                        if (yVar.t()) {
                            builder.append("companion object");
                        }
                        an2.y.c0(builder);
                        am2.m g13 = classifier.g();
                        if (g13 != null) {
                            builder.append("of ");
                            ym2.g name = g13.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            builder.append(yVar.T(name, false));
                        }
                    }
                    if (yVar.w() || !Intrinsics.d(classifier.getName(), ym2.i.f139483b)) {
                        if (!yVar.t()) {
                            an2.y.c0(builder);
                        }
                        ym2.g name2 = classifier.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        builder.append(yVar.T(name2, true));
                    }
                } else {
                    if (!yVar.t()) {
                        an2.y.c0(builder);
                    }
                    yVar.U(classifier, builder, true);
                }
                if (!z13) {
                    List k13 = classifier.k();
                    Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
                    yVar.i0(k13, builder, false);
                    yVar.D(classifier, builder);
                    if (!classifier.c().isSingleton() && ((Boolean) f0Var.f15779i.c(f0Var, an2.f0.X[7])).booleanValue() && (u13 = classifier.u()) != null) {
                        builder.append(" ");
                        yVar.C(builder, u13, null);
                        dm2.z zVar = (dm2.z) u13;
                        am2.q visibility2 = zVar.getVisibility();
                        Intrinsics.checkNotNullExpressionValue(visibility2, "getVisibility(...)");
                        yVar.m0(visibility2, builder);
                        builder.append(yVar.M("constructor"));
                        Collection x13 = zVar.x();
                        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                        yVar.l0(x13, u13.V(), builder);
                    }
                    if (!((Boolean) f0Var.f15794x.c(f0Var, an2.f0.X[22])).booleanValue() && !xl2.l.G(classifier.j())) {
                        Collection c13 = classifier.e().c();
                        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
                        if (!c13.isEmpty() && (c13.size() != 1 || !xl2.l.y((pn2.b0) c13.iterator().next()))) {
                            an2.y.c0(builder);
                            builder.append(": ");
                            CollectionsKt___CollectionsKt.H(c13, builder, ", ", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : new an2.u(yVar, i13));
                        }
                    }
                    yVar.n0(builder, k13);
                }
                return Unit.f80348a;
        }
    }

    public final Object c(am2.x descriptor, Object obj) {
        switch (this.f122512a) {
            case 0:
                Unit data = (Unit) obj;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(data, "data");
                return new k0((i0) this.f122513b, descriptor);
            default:
                d(descriptor, (StringBuilder) obj);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (((java.lang.Boolean) r2.O.c(r2, an2.f0.X[39])).booleanValue() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (((java.lang.Boolean) r2.O.c(r2, an2.f0.X[39])).booleanValue() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b5, code lost:
    
        if (xl2.l.F(r1, xl2.q.f135298d) == false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(am2.x r11, java.lang.StringBuilder r12) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.e.d(am2.x, java.lang.StringBuilder):void");
    }

    public final void e(am2.q0 q0Var, StringBuilder sb3, String str) {
        an2.y yVar = (an2.y) this.f122513b;
        an2.f0 f0Var = yVar.f15821a;
        int i13 = an2.s.f15810a[((an2.k0) f0Var.H.c(f0Var, an2.f0.X[32])).ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            d(q0Var, sb3);
        } else {
            yVar.O(q0Var, sb3);
            sb3.append(str.concat(" for "));
            am2.r0 r03 = ((dm2.o0) q0Var).r0();
            Intrinsics.checkNotNullExpressionValue(r03, "getCorrespondingProperty(...)");
            an2.y.p(yVar, r03, sb3);
        }
    }

    public e(an2.y yVar) {
        this.f122513b = yVar;
    }
}
