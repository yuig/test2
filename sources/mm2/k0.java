package mm2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.r1;
import pn2.t1;

/* loaded from: classes2.dex */
public final class k0 extends dm2.c {

    /* renamed from: k, reason: collision with root package name */
    public final rg.a f87702k;

    /* renamed from: l, reason: collision with root package name */
    public final gm2.e0 f87703l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k0(rg.a r11, gm2.e0 r12, int r13, am2.m r14) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "javaTypeParameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            on2.u r2 = r11.c()
            lm2.d r4 = new lm2.d
            r0 = 0
            r4.<init>(r11, r12, r0)
            java.lang.reflect.TypeVariable r0 = r12.f65766a
            java.lang.String r0 = r0.getName()
            ym2.g r5 = ym2.g.e(r0)
            java.lang.String r0 = "identifier(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            pn2.w1 r6 = pn2.w1.INVARIANT
            java.lang.Object r0 = r11.f107929a
            lm2.a r0 = (lm2.a) r0
            am2.a1 r9 = r0.f83943m
            r7 = 0
            r1 = r10
            r3 = r14
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f87702k = r11
            r10.f87703l = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.k0.<init>(rg.a, gm2.e0, int, am2.m):void");
    }

    @Override // dm2.j
    public final List r0(List bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        rg.a context = this.f87702k;
        b20.c cVar = ((lm2.a) context.f107929a).f83948r;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<pn2.b0> list = bounds;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (pn2.b0 b0Var : list) {
            qm2.n predicate = qm2.n.f104433i;
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (!t1.d(b0Var, predicate, null) && (b0Var = cVar.e(new u5.x(this, false, context, im2.b.TYPE_PARAMETER_BOUNDS, false), b0Var, q0.f80391a, null, false)) == null) {
                b0Var = b0Var;
            }
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    @Override // dm2.j
    public final void u0(pn2.b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // dm2.j
    public final List v0() {
        Type[] bounds = this.f87703l.f65766a.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new gm2.s(type));
        }
        gm2.s sVar = (gm2.s) CollectionsKt.u0(arrayList);
        RandomAccess randomAccess = arrayList;
        if (Intrinsics.d(sVar != null ? sVar.f65788a : null, Object.class)) {
            randomAccess = q0.f80391a;
        }
        ArrayList arrayList2 = (Collection) randomAccess;
        boolean isEmpty = arrayList2.isEmpty();
        rg.a aVar = this.f87702k;
        if (isEmpty) {
            pn2.h0 e13 = aVar.b().f().e();
            Intrinsics.checkNotNullExpressionValue(e13, "getAnyType(...)");
            pn2.h0 p13 = aVar.b().f().p();
            Intrinsics.checkNotNullExpressionValue(p13, "getNullableAnyType(...)");
            return kotlin.collections.e0.b(pn2.g.i(e13, p13));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((com.google.firebase.messaging.q) aVar.f107933e).O((pm2.i) it.next(), com.bumptech.glide.c.m1(r1.COMMON, false, false, this, 3)));
        }
        return arrayList4;
    }
}
