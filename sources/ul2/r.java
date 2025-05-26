package ul2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122589i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f122590j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i13) {
        super(0);
        this.f122589i = i13;
        this.f122590j = tVar;
    }

    public final List b() {
        int i13 = this.f122589i;
        t tVar = this.f122590j;
        switch (i13) {
            case 1:
                return c2.d(tVar.n());
            default:
                List typeParameters = tVar.n().getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                List<am2.c1> list = typeParameters;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (am2.c1 c1Var : list) {
                    Intrinsics.f(c1Var);
                    arrayList.add(new s1(tVar, c1Var));
                }
                return arrayList;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        int i14;
        Type[] lowerBounds;
        int i15 = this.f122589i;
        Type type = null;
        int i16 = 0;
        r2 = false;
        boolean z13 = false;
        t tVar = this.f122590j;
        switch (i15) {
            case 0:
                List parameters = tVar.getParameters();
                int size = (tVar.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) tVar.f122607f.getValue()).booleanValue()) {
                    Iterator it = parameters.iterator();
                    i13 = 0;
                    while (it.hasNext()) {
                        y0 y0Var = (y0) ((rl2.o) it.next());
                        i13 += y0Var.f122645c == rl2.n.VALUE ? tVar.r(y0Var) : 0;
                    }
                } else {
                    List list = parameters;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i13 = 0;
                    } else {
                        Iterator it2 = list.iterator();
                        i13 = 0;
                        while (it2.hasNext()) {
                            if (((y0) ((rl2.o) it2.next())).f122645c == rl2.n.VALUE && (i13 = i13 + 1) < 0) {
                                kotlin.collections.f0.o();
                                throw null;
                            }
                        }
                    }
                }
                int i17 = (i13 + 31) / 32;
                Object[] objArr = new Object[size + i17 + 1];
                Iterator it3 = parameters.iterator();
                while (it3.hasNext()) {
                    y0 y0Var2 = (y0) ((rl2.o) it3.next());
                    boolean i18 = y0Var2.i();
                    int i19 = y0Var2.f122644b;
                    if (i18) {
                        q1 h10 = y0Var2.h();
                        ym2.c cVar = c2.f122505a;
                        Intrinsics.checkNotNullParameter(h10, "<this>");
                        pn2.b0 b0Var = h10.f122585a;
                        if (b0Var != null) {
                            int i23 = bn2.i.f23580a;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            am2.j b13 = b0Var.w0().b();
                            if (b13 != null && bn2.i.b(b13)) {
                            }
                        }
                        objArr[i19] = c2.e(he2.k.n(y0Var2.h()));
                    }
                    if (y0Var2.j()) {
                        objArr[i19] = t.h(y0Var2.h());
                    }
                }
                for (int i24 = 0; i24 < i17; i24++) {
                    objArr[size + i24] = 0;
                }
                return objArr;
            case 1:
                return b();
            case 2:
                am2.d n13 = tVar.n();
                ArrayList arrayList = new ArrayList();
                if (tVar.t()) {
                    i14 = 0;
                } else {
                    dm2.d g13 = c2.g(n13);
                    if (g13 != null) {
                        arrayList.add(new y0(tVar, 0, rl2.n.INSTANCE, new s(g13, 0)));
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    dm2.d D = n13.D();
                    if (D != null) {
                        arrayList.add(new y0(tVar, i14, rl2.n.EXTENSION_RECEIVER, new s(D, 1)));
                        i14++;
                    }
                }
                int size2 = n13.x().size();
                while (i16 < size2) {
                    arrayList.add(new y0(tVar, i14, rl2.n.VALUE, new b2.t(n13, i16, 11)));
                    i16++;
                    i14++;
                }
                if (tVar.s() && (n13 instanceof km2.a) && arrayList.size() > 1) {
                    kotlin.collections.j0.t(arrayList, new sw0.u(22));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (tVar.isSuspend()) {
                    Object d03 = CollectionsKt.d0(tVar.i().a());
                    ParameterizedType parameterizedType = d03 instanceof ParameterizedType ? (ParameterizedType) d03 : null;
                    if (Intrinsics.d(parameterizedType != null ? parameterizedType.getRawType() : null, bl2.c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                        Object R = kotlin.collections.c0.R(actualTypeArguments);
                        WildcardType wildcardType = R instanceof WildcardType ? (WildcardType) R : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) kotlin.collections.c0.B(lowerBounds);
                        }
                    }
                }
                return type == null ? tVar.i().getReturnType() : type;
            case 4:
                pn2.b0 returnType = tVar.n().getReturnType();
                Intrinsics.f(returnType);
                return new q1(returnType, new r(tVar, 3));
            case 5:
                return b();
            default:
                List parameters2 = tVar.getParameters();
                if (!(parameters2 instanceof Collection) || !parameters2.isEmpty()) {
                    Iterator it4 = parameters2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (c2.h(((y0) ((rl2.o) it4.next())).h())) {
                                z13 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z13);
        }
    }
}
