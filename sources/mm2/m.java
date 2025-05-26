package mm2;

import am2.c1;
import ao2.m0;
import dm2.b1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.r1;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87706i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rg.a f87707j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f87708k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, rg.a aVar) {
        super(0);
        this.f87708k = oVar;
        this.f87707j = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [mm2.o] */
    /* JADX WARN: Type inference failed for: r2v28, types: [mm2.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [dm2.k, dm2.z, java.lang.Object, km2.b] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar;
        b20.c cVar;
        String str;
        String str2;
        ?? emptyList;
        Object obj;
        String str3;
        Pair pair;
        List d2;
        int i13 = this.f87706i;
        o oVar2 = this.f87708k;
        rg.a aVar = this.f87707j;
        switch (i13) {
            case 0:
                Constructor<?>[] declaredConstructors = ((gm2.q) oVar2.f87712o).f65786a.getDeclaredConstructors();
                Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
                List t13 = yn2.c0.t(yn2.c0.p(yn2.c0.k(kotlin.collections.c0.v(declaredConstructors), gm2.j.f65779a), gm2.k.f65780a));
                ArrayList arrayList = new ArrayList(t13.size());
                Iterator it = t13.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    rg.a aVar2 = oVar2.f87643b;
                    am2.g gVar = oVar2.f87711n;
                    if (!hasNext) {
                        pm2.g gVar2 = oVar2.f87712o;
                        gm2.q qVar = (gm2.q) gVar2;
                        boolean g13 = qVar.g();
                        bm2.g gVar3 = bm2.h.f23540a;
                        if (g13) {
                            km2.b K0 = km2.b.K0(gVar, gVar3, true, ((fm2.f) ((lm2.a) aVar2.f107929a).f83940j).b(gVar2));
                            Intrinsics.checkNotNullExpressionValue(K0, "createJavaConstructor(...)");
                            ArrayList f13 = ((gm2.q) gVar2).f();
                            ArrayList arrayList2 = new ArrayList(f13.size());
                            oVar = oVar2;
                            nm2.a m13 = com.bumptech.glide.c.m1(r1.COMMON, false, false, null, 6);
                            Iterator it2 = f13.iterator();
                            int i14 = 0;
                            while (it2.hasNext()) {
                                Iterator it3 = it2;
                                gm2.c0 c0Var = (gm2.c0) ((pm2.o) it2.next());
                                arrayList2.add(new b1(K0, null, i14, gVar3, c0Var.c(), ((com.google.firebase.messaging.q) aVar2.f107933e).O(c0Var.f(), m13), false, false, false, null, ((fm2.f) ((lm2.a) aVar2.f107929a).f83940j).b(c0Var)));
                                it2 = it3;
                                i14++;
                            }
                            K0.C0(false);
                            am2.q PROTECTED_AND_PACKAGE = gVar.getVisibility();
                            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                            if (Intrinsics.d(PROTECTED_AND_PACKAGE, im2.u.f72781b)) {
                                PROTECTED_AND_PACKAGE = im2.u.f72782c;
                                Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                            }
                            K0.H0(arrayList2, PROTECTED_AND_PACKAGE);
                            K0.B0(false);
                            K0.D0(gVar.j());
                            String s13 = com.bumptech.glide.c.s(K0, 2);
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.d(com.bumptech.glide.c.s((am2.f) it4.next(), 2), s13)) {
                                    }
                                }
                            }
                            arrayList.add(K0);
                            ((re2.f) ((lm2.a) aVar.f107929a).f83937g).getClass();
                        } else {
                            oVar = oVar2;
                        }
                        ((gn2.a) ((lm2.a) aVar.f107929a).f83954x).a(aVar, gVar, arrayList);
                        b20.c cVar2 = ((lm2.a) aVar.f107929a).f83948r;
                        boolean isEmpty = arrayList.isEmpty();
                        b20.c cVar3 = cVar2;
                        Collection collection = arrayList;
                        if (isEmpty) {
                            Class cls = qVar.f65786a;
                            boolean isAnnotation = cls.isAnnotation();
                            if (!cls.isInterface()) {
                                gVar2.getClass();
                            }
                            if (isAnnotation) {
                                ?? K02 = km2.b.K0(gVar, gVar3, true, ((fm2.f) ((lm2.a) aVar2.f107929a).f83940j).b(gVar2));
                                Intrinsics.checkNotNullExpressionValue(K02, "createJavaConstructor(...)");
                                if (isAnnotation) {
                                    Collection d13 = ((gm2.q) gVar2).d();
                                    emptyList = new ArrayList(d13.size());
                                    nm2.a m14 = com.bumptech.glide.c.m1(r1.COMMON, true, false, null, 6);
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj2 : d13) {
                                        if (Intrinsics.d(((gm2.z) obj2).c(), im2.d0.f72702b)) {
                                            arrayList3.add(obj2);
                                        } else {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    arrayList3.size();
                                    gm2.z zVar = (gm2.z) CollectionsKt.firstOrNull(arrayList3);
                                    if (zVar != null) {
                                        Type genericReturnType = zVar.f65794a.getGenericReturnType();
                                        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
                                        pm2.p c13 = re2.f.c(genericReturnType);
                                        if (c13 instanceof pm2.f) {
                                            pm2.f fVar = (pm2.f) c13;
                                            pair = new Pair(((com.google.firebase.messaging.q) aVar2.f107933e).N(fVar, m14, true), ((com.google.firebase.messaging.q) aVar2.f107933e).O(((gm2.i) fVar).f65777b, m14));
                                        } else {
                                            pair = new Pair(((com.google.firebase.messaging.q) aVar2.f107933e).O(c13, m14), null);
                                        }
                                        str3 = "getGenericReturnType(...)";
                                        str = "getVisibility(...)";
                                        cVar = cVar2;
                                        str2 = "PROTECTED_AND_PACKAGE";
                                        oVar.x(emptyList, K02, 0, zVar, (pn2.b0) pair.f80346a, (pn2.b0) pair.f80347b);
                                    } else {
                                        cVar = cVar2;
                                        str3 = "getGenericReturnType(...)";
                                        str = "getVisibility(...)";
                                        str2 = "PROTECTED_AND_PACKAGE";
                                    }
                                    int i15 = zVar != null ? 1 : 0;
                                    Iterator it5 = arrayList4.iterator();
                                    int i16 = 0;
                                    while (it5.hasNext()) {
                                        gm2.z zVar2 = (gm2.z) it5.next();
                                        com.google.firebase.messaging.q qVar2 = (com.google.firebase.messaging.q) aVar2.f107933e;
                                        Type genericReturnType2 = zVar2.f65794a.getGenericReturnType();
                                        String str4 = str3;
                                        Intrinsics.checkNotNullExpressionValue(genericReturnType2, str4);
                                        oVar.x(emptyList, K02, i16 + i15, zVar2, qVar2.O(re2.f.c(genericReturnType2), m14), null);
                                        i16++;
                                        str3 = str4;
                                    }
                                } else {
                                    cVar = cVar2;
                                    str = "getVisibility(...)";
                                    str2 = "PROTECTED_AND_PACKAGE";
                                    emptyList = Collections.emptyList();
                                }
                                K02.C0(false);
                                am2.q visibility = gVar.getVisibility();
                                Intrinsics.checkNotNullExpressionValue(visibility, str);
                                if (Intrinsics.d(visibility, im2.u.f72781b)) {
                                    visibility = im2.u.f72782c;
                                    Intrinsics.checkNotNullExpressionValue(visibility, str2);
                                }
                                K02.H0(emptyList, visibility);
                                K02.B0(true);
                                K02.D0(gVar.j());
                                ((re2.f) ((lm2.a) aVar2.f107929a).f83937g).getClass();
                                obj = K02;
                            } else {
                                cVar = cVar2;
                                obj = null;
                            }
                            cVar3 = cVar;
                            collection = kotlin.collections.f0.k(obj);
                        }
                        return CollectionsKt.F0(cVar3.h(aVar, collection));
                    }
                    gm2.t typeParameterOwner = (gm2.t) it.next();
                    km2.b containingDeclaration = km2.b.K0(gVar, dl2.b.v2(aVar2, typeParameterOwner), false, ((fm2.f) ((lm2.a) aVar2.f107929a).f83940j).b(typeParameterOwner));
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "createJavaConstructor(...)");
                    int size = gVar.k().size();
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
                    Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
                    rg.a aVar3 = new rg.a((lm2.a) aVar2.f107929a, new lm2.f(aVar2, containingDeclaration, typeParameterOwner, size), (xk2.k) aVar2.f107931c);
                    Constructor constructor = typeParameterOwner.f65790a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    Intrinsics.f(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        d2 = q0.f80391a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) kotlin.collections.z.n(1, genericParameterTypes.length, genericParameterTypes);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) kotlin.collections.z.n(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        Intrinsics.f(parameterAnnotations);
                        d2 = typeParameterOwner.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    a7.o u13 = c0.u(aVar3, containingDeclaration, d2);
                    List k13 = gVar.k();
                    Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
                    List list = k13;
                    ArrayList typeParameters = typeParameterOwner.getTypeParameters();
                    ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(typeParameters, 10));
                    Iterator it6 = typeParameters.iterator();
                    while (it6.hasNext()) {
                        c1 a13 = ((lm2.h) aVar3.f107930b).a((gm2.e0) it6.next());
                        Intrinsics.f(a13);
                        arrayList5.add(a13);
                    }
                    containingDeclaration.I0((List) u13.f1155b, m0.r0(typeParameterOwner.e()), CollectionsKt.l0(arrayList5, list));
                    containingDeclaration.B0(false);
                    containingDeclaration.C0(u13.f1154a);
                    containingDeclaration.D0(gVar.j());
                    ((re2.f) ((lm2.a) aVar3.f107929a).f83937g).getClass();
                    arrayList.add(containingDeclaration);
                }
                break;
            default:
                return CollectionsKt.J0(((gn2.a) ((lm2.a) aVar.f107929a).f83954x).f(aVar, oVar2.f87711n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rg.a aVar, o oVar) {
        super(0);
        this.f87707j = aVar;
        this.f87708k = oVar;
    }
}
