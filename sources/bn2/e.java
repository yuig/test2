package bn2;

import am2.d0;
import am2.i0;
import am2.o0;
import am2.t0;
import am2.x0;
import dm2.c0;
import dm2.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.y;
import pn2.b0;
import pn2.b1;
import pn2.v1;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23579a = 0;

    static {
        new ym2.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i13) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(am2.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.o0().h().iterator();
        while (it.hasNext()) {
            am2.b o03 = ((am2.b) it.next()).o0();
            b(o03, linkedHashSet);
            linkedHashSet.add(o03);
        }
    }

    public static am2.g c(b0 b0Var) {
        if (b0Var == null) {
            a(45);
            throw null;
        }
        b1 w03 = b0Var.w0();
        if (w03 == null) {
            a(46);
            throw null;
        }
        am2.g gVar = (am2.g) w03.b();
        if (gVar != null) {
            return gVar;
        }
        a(47);
        throw null;
    }

    public static d0 d(am2.m mVar) {
        if (mVar == null) {
            a(21);
            throw null;
        }
        d0 e13 = e(mVar);
        if (e13 != null) {
            return e13;
        }
        a(22);
        throw null;
    }

    public static d0 e(am2.m mVar) {
        if (mVar == null) {
            a(23);
            throw null;
        }
        while (mVar != null) {
            if (mVar instanceof d0) {
                return (d0) mVar;
            }
            if (mVar instanceof o0) {
                return ((c0) ((o0) mVar)).f55401c;
            }
            mVar = mVar.g();
        }
        return null;
    }

    public static d0 f(v1 v1Var) {
        if (v1Var == null) {
            a(20);
            throw null;
        }
        am2.j b13 = v1Var.w0().b();
        if (b13 == null) {
            return null;
        }
        return e(b13);
    }

    public static x0 g(am2.m mVar) {
        if (mVar == null) {
            a(82);
            throw null;
        }
        if (mVar instanceof t0) {
            mVar = ((dm2.o0) ((t0) mVar)).r0();
        }
        boolean z13 = mVar instanceof am2.n;
        y yVar = x0.Tm;
        if (z13) {
            ((am2.n) mVar).b().b();
        }
        return yVar;
    }

    public static ym2.e h(am2.m mVar) {
        if (mVar != null) {
            ym2.c i13 = i(mVar);
            return i13 != null ? i13.i() : j(mVar);
        }
        a(2);
        throw null;
    }

    public static ym2.c i(am2.m mVar) {
        if (mVar == null) {
            a(5);
            throw null;
        }
        if ((mVar instanceof d0) || rn2.m.g(mVar)) {
            return ym2.c.f139466c;
        }
        if (mVar instanceof o0) {
            return ((c0) ((o0) mVar)).f55402d;
        }
        if (mVar instanceof i0) {
            return ((k0) ((i0) mVar)).f55454e;
        }
        return null;
    }

    public static ym2.e j(am2.m mVar) {
        if (mVar != null) {
            return h(mVar.g()).b(mVar.getName());
        }
        a(6);
        throw null;
    }

    public static am2.m k(am2.m mVar, Class cls, boolean z13) {
        if (mVar == null) {
            return null;
        }
        if (z13) {
            mVar = mVar.g();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return mVar;
            }
            mVar = mVar.g();
        }
        return null;
    }

    public static am2.g l(am2.g gVar) {
        if (gVar == null) {
            a(44);
            throw null;
        }
        Iterator it = gVar.e().c().iterator();
        while (it.hasNext()) {
            am2.g c13 = c((b0) it.next());
            if (c13.c() != am2.h.INTERFACE) {
                return c13;
            }
        }
        return null;
    }

    public static boolean m(am2.m mVar) {
        return p(mVar, am2.h.CLASS) && mVar.getName().equals(ym2.i.f139482a);
    }

    public static boolean n(am2.m mVar) {
        return p(mVar, am2.h.OBJECT) && ((am2.g) mVar).P();
    }

    public static boolean o(am2.m mVar) {
        if (mVar != null) {
            return p(mVar, am2.h.ENUM_ENTRY);
        }
        a(36);
        throw null;
    }

    public static boolean p(am2.m mVar, am2.h hVar) {
        if (hVar != null) {
            return (mVar instanceof am2.g) && ((am2.g) mVar).c() == hVar;
        }
        a(37);
        throw null;
    }

    public static boolean q(am2.m mVar) {
        if (mVar == null) {
            a(1);
            throw null;
        }
        while (mVar != null) {
            if (m(mVar) || ((mVar instanceof am2.p) && ((am2.p) mVar).getVisibility() == am2.s.f15578f)) {
                return true;
            }
            mVar = mVar.g();
        }
        return false;
    }

    public static boolean r(b0 b0Var, am2.g gVar) {
        if (b0Var == null) {
            a(30);
            throw null;
        }
        if (gVar == null) {
            a(31);
            throw null;
        }
        am2.j b13 = b0Var.w0().b();
        if (b13 == null) {
            return false;
        }
        am2.m o03 = b13.o0();
        return (o03 instanceof am2.j) && gVar.e().equals(((am2.j) o03).e());
    }

    public static boolean s(am2.k kVar) {
        return (p(kVar, am2.h.CLASS) || p(kVar, am2.h.INTERFACE)) && ((am2.g) kVar).l() == am2.c0.SEALED;
    }

    public static boolean t(b0 b0Var, am2.g gVar) {
        if (b0Var == null) {
            a(32);
            throw null;
        }
        if (gVar == null) {
            a(33);
            throw null;
        }
        if (r(b0Var, gVar)) {
            return true;
        }
        Iterator it = b0Var.w0().c().iterator();
        while (it.hasNext()) {
            if (t((b0) it.next(), gVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(am2.m mVar) {
        return mVar != null && (mVar.g() instanceof i0);
    }

    public static am2.d v(am2.d dVar) {
        if (dVar == null) {
            a(59);
            throw null;
        }
        while (dVar.c() == am2.c.FAKE_OVERRIDE) {
            Collection h10 = dVar.h();
            if (h10.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + dVar);
            }
            dVar = (am2.d) h10.iterator().next();
        }
        return dVar;
    }
}
