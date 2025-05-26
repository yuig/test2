package dm2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pn2.w1;

/* loaded from: classes2.dex */
public abstract class j extends p implements am2.c1 {

    /* renamed from: e, reason: collision with root package name */
    public final w1 f55440e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f55441f;

    /* renamed from: g, reason: collision with root package name */
    public final int f55442g;

    /* renamed from: h, reason: collision with root package name */
    public final on2.l f55443h;

    /* renamed from: i, reason: collision with root package name */
    public final on2.l f55444i;

    /* renamed from: j, reason: collision with root package name */
    public final on2.q f55445j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(on2.u r4, am2.m r5, bm2.i r6, ym2.g r7, pn2.w1 r8, boolean r9, int r10, am2.a1 r11) {
        /*
            r3 = this;
            am2.v0 r0 = am2.w0.f15602a
            r1 = 0
            if (r4 == 0) goto L4e
            r2 = 1
            if (r5 == 0) goto L4a
            if (r6 == 0) goto L45
            if (r7 == 0) goto L40
            if (r8 == 0) goto L3b
            if (r11 == 0) goto L36
            r3.<init>(r5, r6, r7, r0)
            r3.f55440e = r8
            r3.f55441f = r9
            r3.f55442g = r10
            dm2.h r5 = new dm2.h
            r5.<init>(r3, r4, r11)
            on2.q r4 = (on2.q) r4
            on2.l r6 = new on2.l
            r6.<init>(r4, r5)
            r3.f55443h = r6
            xl2.j r5 = new xl2.j
            r5.<init>(r2, r3, r7)
            on2.l r6 = new on2.l
            r6.<init>(r4, r5)
            r3.f55444i = r6
            r3.f55445j = r4
            return
        L36:
            r4 = 6
            X(r4)
            throw r1
        L3b:
            r4 = 4
            X(r4)
            throw r1
        L40:
            r4 = 3
            X(r4)
            throw r1
        L45:
            r4 = 2
            X(r4)
            throw r1
        L4a:
            X(r2)
            throw r1
        L4e:
            r4 = 0
            X(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.j.<init>(on2.u, am2.m, bm2.i, ym2.g, pn2.w1, boolean, int, am2.a1):void");
    }

    public static /* synthetic */ void X(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i14 = 2;
                break;
            case 12:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i13) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // am2.c1
    public final on2.u B() {
        on2.q qVar = this.f55445j;
        if (qVar != null) {
            return qVar;
        }
        X(14);
        throw null;
    }

    @Override // am2.c1
    public final boolean F() {
        return false;
    }

    @Override // dm2.p, dm2.o, am2.m
    /* renamed from: a */
    public final am2.j o0() {
        return this;
    }

    @Override // am2.c1, am2.j
    public final pn2.b1 e() {
        pn2.b1 b1Var = (pn2.b1) this.f55443h.invoke();
        if (b1Var != null) {
            return b1Var;
        }
        X(9);
        throw null;
    }

    @Override // am2.c1
    public final int getIndex() {
        return this.f55442g;
    }

    @Override // am2.c1
    public final List getUpperBounds() {
        List c13 = ((i) e()).c();
        if (c13 != null) {
            return c13;
        }
        X(8);
        throw null;
    }

    @Override // am2.j
    public final pn2.h0 j() {
        pn2.h0 h0Var = (pn2.h0) this.f55444i.invoke();
        if (h0Var != null) {
            return h0Var;
        }
        X(10);
        throw null;
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        switch (eVar.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y yVar = (an2.y) eVar.f122513b;
                an2.y yVar2 = an2.y.f15818c;
                yVar.g0(this, builder, true);
                return Unit.f80348a;
        }
    }

    @Override // am2.c1
    public final boolean o() {
        return this.f55441f;
    }

    @Override // dm2.p
    public final am2.n o0() {
        return this;
    }

    @Override // am2.c1
    public final w1 r() {
        w1 w1Var = this.f55440e;
        if (w1Var != null) {
            return w1Var;
        }
        X(7);
        throw null;
    }

    public List r0(List list) {
        if (list == null) {
            X(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        X(13);
        throw null;
    }

    public abstract void u0(pn2.b0 b0Var);

    public abstract List v0();

    @Override // dm2.p, dm2.o, am2.m
    /* renamed from: a */
    public final am2.m o0() {
        return this;
    }

    @Override // dm2.p, dm2.o, am2.m
    /* renamed from: a */
    public final am2.c1 o0() {
        return this;
    }
}
