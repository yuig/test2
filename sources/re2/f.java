package re2;

import am2.i1;
import am2.w0;
import am2.x;
import an2.y;
import gm2.b0;
import gm2.d0;
import gm2.g0;
import gm2.s;
import in2.m;
import in2.n;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ln2.c0;
import ln2.e0;
import rm2.f0;
import rm2.h0;
import rm2.u;
import tm2.c1;
import tm2.g1;
import tm2.p0;
import zm2.v;

/* loaded from: classes2.dex */
public final class f implements jm2.j, v {

    /* renamed from: a */
    public final /* synthetic */ int f107697a;

    public /* synthetic */ f(int i13) {
        this.f107697a = i13;
    }

    public static /* synthetic */ void a(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i13) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static d0 c(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z13 = type instanceof Class;
        if (z13) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new b0(cls);
            }
        }
        return ((type instanceof GenericArrayType) || (z13 && ((Class) type).isArray())) ? new gm2.i(type) : type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
    }

    public static n d(Iterable scopes, String debugName) {
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        wn2.f fVar = new wn2.f();
        Iterator it = scopes.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar != m.f72874b) {
                if (nVar instanceof in2.b) {
                    k0.v(fVar, ((in2.b) nVar).f72843c);
                } else {
                    fVar.add(nVar);
                }
            }
        }
        return e(debugName, fVar);
    }

    public static n e(String debugName, wn2.f scopes) {
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        int i13 = scopes.f130600a;
        return i13 != 0 ? i13 != 1 ? new in2.b(debugName, (n[]) scopes.toArray(new n[0])) : (n) scopes.get(0) : m.f72874b;
    }

    public static boolean f(am2.b superDescriptor, am2.b subDescriptor) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof km2.g) && (superDescriptor instanceof x)) {
            km2.g gVar = (km2.g) subDescriptor;
            gVar.x().size();
            x xVar = (x) superDescriptor;
            xVar.x().size();
            List x13 = gVar.o0().x();
            Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
            List x14 = xVar.o0().x();
            Intrinsics.checkNotNullExpressionValue(x14, "getValueParameters(...)");
            Iterator it = CollectionsKt.N0(x13, x14).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                i1 i1Var = (i1) pair.f80346a;
                i1 i1Var2 = (i1) pair.f80347b;
                Intrinsics.f(i1Var);
                boolean z13 = h((x) subDescriptor, i1Var) instanceof rm2.x;
                Intrinsics.f(i1Var2);
                if (z13 != (h(xVar, i1Var2) instanceof rm2.x)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static f0 g(e0 container, boolean z13, boolean z14, Boolean bool, boolean z15, rm2.b0 kotlinClassFinder, xm2.g jvmMetadataVersion) {
        c0 c0Var;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        if (z13) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof c0) {
                c0 c0Var2 = (c0) container;
                if (c0Var2.f84068g == tm2.j.INTERFACE) {
                    ym2.b d2 = c0Var2.f84067f.d(ym2.g.e("DefaultImpls"));
                    Intrinsics.checkNotNullExpressionValue(d2, "createNestedClassId(...)");
                    return dl2.b.n0(kotlinClassFinder, d2, jvmMetadataVersion);
                }
            }
            if (bool.booleanValue() && (container instanceof ln2.d0)) {
                w0 w0Var = container.f84076c;
                u uVar = w0Var instanceof u ? (u) w0Var : null;
                gn2.b bVar = uVar != null ? uVar.f108794c : null;
                if (bVar != null) {
                    String f13 = bVar.f();
                    Intrinsics.checkNotNullExpressionValue(f13, "getInternalName(...)");
                    ym2.b j13 = ym2.b.j(new ym2.c(z.m(f13, '/', '.')));
                    Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
                    return dl2.b.n0(kotlinClassFinder, j13, jvmMetadataVersion);
                }
            }
        }
        if (z14 && (container instanceof c0)) {
            c0 c0Var3 = (c0) container;
            if (c0Var3.f84068g == tm2.j.COMPANION_OBJECT && (c0Var = c0Var3.f84066e) != null) {
                tm2.j jVar = tm2.j.CLASS;
                tm2.j jVar2 = c0Var.f84068g;
                if (jVar2 == jVar || jVar2 == tm2.j.ENUM_CLASS || (z15 && (jVar2 == tm2.j.INTERFACE || jVar2 == tm2.j.ANNOTATION_CLASS))) {
                    w0 w0Var2 = c0Var.f84076c;
                    h0 h0Var = w0Var2 instanceof h0 ? (h0) w0Var2 : null;
                    if (h0Var != null) {
                        return h0Var.f108734b;
                    }
                    return null;
                }
            }
        }
        if (container instanceof ln2.d0) {
            w0 w0Var3 = container.f84076c;
            if (w0Var3 instanceof u) {
                Intrinsics.g(w0Var3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                u uVar2 = (u) w0Var3;
                f0 f0Var = uVar2.f108795d;
                return f0Var == null ? dl2.b.n0(kotlinClassFinder, uVar2.c(), jvmMetadataVersion) : f0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((rm2.w) r5).f108797i, "java/lang/Object") != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011d, code lost:
    
        r7 = ((dm2.c1) r8).getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "getType(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return com.bumptech.glide.c.J0(kotlin.jvm.internal.j.A(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(fn2.d.g(r0), fn2.d.g(r1)) == false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static rm2.y h(am2.x r7, am2.i1 r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re2.f.h(am2.x, am2.i1):rm2.y");
    }

    public static y i(Function1 changeOptions) {
        Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
        an2.f0 f0Var = new an2.f0();
        changeOptions.invoke(f0Var);
        f0Var.f15771a = true;
        return new y(f0Var);
    }

    @Override // zm2.v
    public final zm2.u b(int i13) {
        switch (this.f107697a) {
            case 20:
                return tm2.j.valueOf(i13);
            case 21:
                return tm2.c0.valueOf(i13);
            case 22:
                return p0.valueOf(i13);
            case 23:
                return c1.valueOf(i13);
            case 24:
                return g1.valueOf(i13);
            default:
                return wm2.i.valueOf(i13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13, int i14) {
        this(0);
        this.f107697a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
            case 5:
            case 15:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            default:
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
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
            case 19:
                this(19);
                break;
            case 25:
                this(25);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
