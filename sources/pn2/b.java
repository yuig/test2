package pn2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(on2.u uVar) {
        super(uVar);
        if (uVar != null) {
        } else {
            p(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void p(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r1) goto L30
            if (r9 == r0) goto L30
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            if (r9 == r2) goto L40
            if (r9 == r1) goto L3b
            if (r9 == r0) goto L3b
            r5[r2] = r6
            goto L44
        L3b:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L44
        L40:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L44:
            if (r9 == r2) goto L55
            if (r9 == r4) goto L51
            if (r9 == r1) goto L55
            if (r9 == r0) goto L55
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L55
        L51:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L55:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L65
            if (r9 == r1) goto L65
            if (r9 == r0) goto L65
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L6a
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L6a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.b.p(int):void");
    }

    @Override // pn2.b1
    public final xl2.l f() {
        xl2.l e13 = fn2.d.e(b());
        if (e13 != null) {
            return e13;
        }
        p(1);
        throw null;
    }

    @Override // pn2.l
    public final b0 g() {
        am2.g b13 = b();
        if (b13 == null) {
            xl2.l.a(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
            throw null;
        }
        ym2.g gVar = xl2.l.f135279e;
        if (xl2.l.b(b13, xl2.q.f135292a) || xl2.l.b(b13, xl2.q.f135294b)) {
            return null;
        }
        return f().e();
    }

    @Override // pn2.l
    public final Collection i() {
        am2.m g13 = b().g();
        if (g13 instanceof am2.g) {
            wn2.f fVar = new wn2.f();
            am2.g gVar = (am2.g) g13;
            fVar.add(gVar.j());
            gVar.c0();
            return fVar;
        }
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p(3);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        return true;
     */
    @Override // pn2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(am2.j r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof am2.g
            if (r0 == 0) goto L76
            am2.g r0 = r3.b()
            java.lang.String r1 = "first"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "second"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            ym2.g r1 = r0.getName()
            ym2.g r2 = r4.getName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 != 0) goto L22
            goto L76
        L22:
            am2.m r0 = r0.g()
            am2.m r4 = r4.g()
        L2a:
            if (r0 == 0) goto L74
            if (r4 == 0) goto L74
            boolean r1 = r0 instanceof am2.d0
            if (r1 == 0) goto L37
            boolean r4 = r4 instanceof am2.d0
            if (r4 == 0) goto L76
            goto L74
        L37:
            boolean r1 = r4 instanceof am2.d0
            if (r1 == 0) goto L3c
            goto L76
        L3c:
            boolean r1 = r0 instanceof am2.i0
            if (r1 == 0) goto L57
            boolean r1 = r4 instanceof am2.i0
            if (r1 == 0) goto L76
            am2.i0 r0 = (am2.i0) r0
            dm2.k0 r0 = (dm2.k0) r0
            am2.i0 r4 = (am2.i0) r4
            dm2.k0 r4 = (dm2.k0) r4
            ym2.c r0 = r0.f55454e
            ym2.c r4 = r4.f55454e
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r0, r4)
            if (r4 == 0) goto L76
            goto L74
        L57:
            boolean r1 = r4 instanceof am2.i0
            if (r1 == 0) goto L5c
            goto L76
        L5c:
            ym2.g r1 = r0.getName()
            ym2.g r2 = r4.getName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 != 0) goto L6b
            goto L76
        L6b:
            am2.m r0 = r0.g()
            am2.m r4 = r4.g()
            goto L2a
        L74:
            r4 = 1
            goto L77
        L76:
            r4 = 0
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.b.m(am2.j):boolean");
    }

    @Override // pn2.b1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract am2.g b();
}
