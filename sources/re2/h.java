package re2;

import gm2.r;
import gm2.x;
import im2.n0;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jm2.m;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import pn2.b1;
import tm2.b0;
import tm2.d1;
import tm2.f1;
import tm2.k0;
import tm2.w0;
import zm2.u;
import zm2.v;

/* loaded from: classes2.dex */
public final class h implements m, v, qn2.c {

    /* renamed from: a */
    public final /* synthetic */ int f107702a;

    public /* synthetic */ h(int i13) {
        this.f107702a = i13;
    }

    public static /* synthetic */ void c(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        if (i13 == 5 || i13 == 6) {
            objArr[2] = "reportSignatureErrors";
        } else {
            objArr[2] = "resolvePropagatedSignature";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void d(int i13) {
        Object[] objArr = new Object[3];
        if (i13 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final n0 e(h hVar, String str, String str2, String str3, String str4) {
        hVar.getClass();
        ym2.g e13 = ym2.g.e(str2);
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        return new n0(str, e13, str3, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r3 != sm2.b.MULTIFILE_CLASS_PART) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r1.f113294d != null) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static fm2.c f(java.lang.Class r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re2.h.f(java.lang.Class):fm2.c");
    }

    public static gm2.f g(Object value, ym2.g gVar) {
        Intrinsics.checkNotNullParameter(value, "value");
        Class<?> cls = value.getClass();
        List list = gm2.d.f65761a;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls) ? new gm2.v(gVar, (Enum) value) : value instanceof Annotation ? new gm2.g(gVar, (Annotation) value) : value instanceof Object[] ? new gm2.h(gVar, (Object[]) value) : value instanceof Class ? new r(gVar, (Class) value) : new x(value, gVar);
    }

    public static vm2.j h(f1 table) {
        Intrinsics.checkNotNullParameter(table, "table");
        if (table.f118260b.size() == 0) {
            return vm2.j.f126249b;
        }
        List list = table.f118260b;
        Intrinsics.checkNotNullExpressionValue(list, "getRequirementList(...)");
        return new vm2.j(list);
    }

    public static um2.a i(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        DataInputStream dataInputStream = new DataInputStream(stream);
        IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(g0.q(intRange, 10));
        ql2.k it = intRange.iterator();
        while (it.f104109c) {
            it.b();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] E0 = CollectionsKt.E0(arrayList);
        return new um2.a(Arrays.copyOf(E0, E0.length));
    }

    @Override // qn2.c
    public final boolean a(b1 b1Var, b1 b1Var2) {
        if (b1Var == null) {
            d(0);
            throw null;
        }
        if (b1Var2 != null) {
            return b1Var.equals(b1Var2);
        }
        d(1);
        throw null;
    }

    @Override // zm2.v
    public final u b(int i13) {
        switch (this.f107702a) {
            case 19:
                return tm2.d.valueOf(i13);
            case 20:
                return b0.valueOf(i13);
            case 21:
                return k0.valueOf(i13);
            case 22:
                return w0.valueOf(i13);
            default:
                return d1.valueOf(i13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13, int i14) {
        this(0);
        this.f107702a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
            case 15:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 28:
            default:
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
