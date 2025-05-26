package rm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tm2.s0;

/* loaded from: classes2.dex */
public final class t implements ln2.v, k0, m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f108788b = new t();

    /* renamed from: c, reason: collision with root package name */
    public static final t f108789c = new t();

    /* renamed from: d, reason: collision with root package name */
    public static final t f108790d = new t();

    /* renamed from: e, reason: collision with root package name */
    public static final t f108791e = new t();

    /* renamed from: f, reason: collision with root package name */
    public static final t f108792f = new t();

    public static String[] a(String... signatures) {
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static y c(String representation) {
        gn2.c cVar;
        y wVar;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.getClass();
        char charAt = representation.charAt(0);
        gn2.c[] values = gn2.c.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                cVar = null;
                break;
            }
            cVar = values[i13];
            if (cVar.getDesc().charAt(0) == charAt) {
                break;
            }
            i13++;
        }
        if (cVar != null) {
            return new x(cVar);
        }
        if (charAt == 'V') {
            return new x(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            wVar = new v(c(substring));
        } else {
            if (charAt == 'L') {
                StringsKt.G(representation, ';');
            }
            String substring2 = representation.substring(1, representation.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            wVar = new w(substring2);
        }
        return wVar;
    }

    public static w d(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new w(internalName);
    }

    public static LinkedHashSet e(String internalName, String... signatures) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return e(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet g(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return e(j(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static String h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/function/".concat(name);
    }

    public static String i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/lang/" + name;
    }

    public static String j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/".concat(name);
    }

    public static String k(y type) {
        String desc;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof v) {
            return "[" + k(((v) type).f108796i);
        }
        if (type instanceof x) {
            gn2.c cVar = ((x) type).f108798i;
            return (cVar == null || (desc = cVar.getDesc()) == null) ? "V" : desc;
        }
        if (type instanceof w) {
            return ep.b.k(new StringBuilder("L"), ((w) type).f108797i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ln2.v
    public pn2.b0 b(s0 proto, String flexibleId, pn2.h0 lowerBound, pn2.h0 upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return !Intrinsics.d(flexibleId, "kotlin.jvm.PlatformType") ? rn2.m.d(rn2.l.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.k(wm2.l.f130420g) ? new nm2.g(lowerBound, upperBound) : pn2.g.i(lowerBound, upperBound);
    }
}
