package nn2;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;
import ln2.a0;
import ln2.l0;
import pn2.h0;
import tm2.g1;
import tm2.s0;
import tm2.u0;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91617i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f91618j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i13) {
        super(1);
        this.f91617i = i13;
        this.f91618j = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[LOOP:0: B:9:0x0058->B:11:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection b(ym2.g r7) {
        /*
            r6 = this;
            java.lang.String r0 = "nextFunction"
            int r1 = r6.f91617i
            r2 = 5
            java.lang.String r3 = "PARSER"
            nn2.p r4 = r6.f91618j
            java.lang.String r5 = "it"
            switch(r1) {
                case 0: goto L7f;
                default: goto Le;
            }
        Le:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            java.util.LinkedHashMap r1 = r4.f91621b
            tm2.a r5 = tm2.i0.f118323v
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            java.lang.Object r1 = r1.get(r7)
            byte[] r1 = (byte[]) r1
            nn2.q r3 = r4.f91628i
            if (r1 == 0) goto L46
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r1)
            s3.n1 r1 = new s3.n1
            r1.<init>(r5, r4, r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            yn2.m r0 = new yn2.m
            yn2.v r2 = new yn2.v
            r2.<init>(r1)
            r0.<init>(r1, r2)
            kotlin.sequences.Sequence r0 = yn2.x.d(r0)
            java.util.List r0 = yn2.c0.t(r0)
            if (r0 == 0) goto L46
            java.util.Collection r0 = (java.util.Collection) r0
            goto L48
        L46:
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
        L48:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r0.size()
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            tm2.i0 r1 = (tm2.i0) r1
            lb.p0 r4 = r3.f91630b
            java.lang.Object r4 = r4.f82660i
            ln2.a0 r4 = (ln2.a0) r4
            kotlin.jvm.internal.Intrinsics.f(r1)
            nn2.s r1 = r4.f(r1)
            r2.add(r1)
            goto L58
        L75:
            r3.k(r7, r2)
            java.util.List r7 = wn2.k.e(r2)
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L7f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            java.util.LinkedHashMap r1 = r4.f91620a
            tm2.a r5 = tm2.a0.f118143v
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            java.lang.Object r1 = r1.get(r7)
            byte[] r1 = (byte[]) r1
            nn2.q r3 = r4.f91628i
            if (r1 == 0) goto Lb7
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r1)
            s3.n1 r1 = new s3.n1
            r1.<init>(r5, r4, r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            yn2.m r0 = new yn2.m
            yn2.v r2 = new yn2.v
            r2.<init>(r1)
            r0.<init>(r1, r2)
            kotlin.sequences.Sequence r0 = yn2.x.d(r0)
            java.util.List r0 = yn2.c0.t(r0)
            if (r0 == 0) goto Lb7
            java.util.Collection r0 = (java.util.Collection) r0
            goto Lb9
        Lb7:
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
        Lb9:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r0.size()
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        Lc9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf0
            java.lang.Object r1 = r0.next()
            tm2.a0 r1 = (tm2.a0) r1
            lb.p0 r4 = r3.f91630b
            java.lang.Object r4 = r4.f82660i
            ln2.a0 r4 = (ln2.a0) r4
            kotlin.jvm.internal.Intrinsics.f(r1)
            nn2.t r1 = r4.e(r1)
            boolean r4 = r3.r(r1)
            if (r4 == 0) goto Le9
            goto Lea
        Le9:
            r1 = 0
        Lea:
            if (r1 == 0) goto Lc9
            r2.add(r1)
            goto Lc9
        Lf0:
            r3.j(r7, r2)
            java.util.List r7 = wn2.k.e(r2)
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nn2.o.b(ym2.g):java.util.Collection");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p0 a13;
        s0 a14;
        s0 a15;
        switch (this.f91617i) {
            case 0:
                return b((ym2.g) obj);
            case 1:
                return b((ym2.g) obj);
            default:
                ym2.g it = (ym2.g) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                p pVar = this.f91618j;
                byte[] bArr = (byte[]) pVar.f91622c.get(it);
                if (bArr == null) {
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                q qVar = pVar.f91628i;
                u0 proto = u0.v(byteArrayInputStream, ((ln2.o) qVar.f91630b.f82653b).f84122o);
                if (proto == null) {
                    return null;
                }
                a0 a0Var = (a0) qVar.f91630b.f82660i;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(proto, "proto");
                List list = proto.f118503k;
                Intrinsics.checkNotNullExpressionValue(list, "getAnnotationList(...)");
                List list2 = list;
                ArrayList annotations = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    p0 p0Var = a0Var.f84059a;
                    if (!hasNext) {
                        Intrinsics.checkNotNullParameter(annotations, "annotations");
                        bm2.i jVar = annotations.isEmpty() ? bm2.h.f23540a : new bm2.j(annotations, 0);
                        am2.r f03 = dl2.b.f0((g1) vm2.e.f126222d.d(proto.f118496d));
                        on2.u d2 = p0Var.d();
                        am2.m mVar = (am2.m) p0Var.f82655d;
                        vm2.f fVar = (vm2.f) p0Var.f82654c;
                        ym2.g L0 = bs1.c.L0(fVar, proto.f118497e);
                        vm2.i typeTable = (vm2.i) p0Var.f82656e;
                        u uVar = new u(d2, mVar, jVar, L0, f03, proto, fVar, typeTable, (vm2.j) p0Var.f82657f, (l) p0Var.f82658g);
                        List list3 = proto.f118498f;
                        Intrinsics.checkNotNullExpressionValue(list3, "getTypeParameterList(...)");
                        a13 = p0Var.a(uVar, list3, (vm2.f) p0Var.f82654c, (vm2.i) p0Var.f82656e, (vm2.j) p0Var.f82657f, (vm2.a) p0Var.f82652a);
                        l0 l0Var = (l0) a13.f82659h;
                        List b13 = l0Var.b();
                        Intrinsics.checkNotNullParameter(proto, "<this>");
                        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                        if (proto.s()) {
                            a14 = proto.f118499g;
                            Intrinsics.checkNotNullExpressionValue(a14, "getUnderlyingType(...)");
                        } else {
                            if (!proto.t()) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
                            }
                            a14 = typeTable.a(proto.f118500h);
                        }
                        h0 d13 = l0Var.d(a14, false);
                        Intrinsics.checkNotNullParameter(proto, "<this>");
                        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                        if (proto.q()) {
                            a15 = proto.f118501i;
                            Intrinsics.checkNotNullExpressionValue(a15, "getExpandedType(...)");
                        } else {
                            if (!proto.r()) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
                            }
                            a15 = typeTable.a(proto.f118502j);
                        }
                        uVar.w0(b13, d13, l0Var.d(a15, false));
                        return uVar;
                    }
                    tm2.h hVar = (tm2.h) it2.next();
                    Intrinsics.f(hVar);
                    annotations.add(a0Var.f84060b.e(hVar, (vm2.f) p0Var.f82654c));
                }
        }
    }
}
