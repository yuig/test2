package vl2;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lb.l0;

/* loaded from: classes4.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f126152a;

    /* renamed from: b, reason: collision with root package name */
    public final List f126153b;

    /* renamed from: c, reason: collision with root package name */
    public final a f126154c;

    /* renamed from: d, reason: collision with root package name */
    public final List f126155d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f126156e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f126157f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f126158g;

    public c(Class jClass, ArrayList parameterNames, a callMode, b origin, List methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f126152a = jClass;
        this.f126153b = parameterNames;
        this.f126154c = callMode;
        this.f126155d = methods;
        List list = methods;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f126156e = arrayList;
        List list2 = this.f126155d;
        ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.f(returnType);
            List list3 = gm2.d.f65761a;
            Intrinsics.checkNotNullParameter(returnType, "<this>");
            Class<?> cls = (Class) gm2.d.f65763c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList2.add(returnType);
        }
        this.f126157f = arrayList2;
        List list4 = this.f126155d;
        ArrayList arrayList3 = new ArrayList(g0.q(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f126158g = arrayList3;
        if (this.f126154c == a.POSITIONAL_CALL && origin == b.JAVA && (!CollectionsKt.h0(this.f126153b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // vl2.g
    public final List a() {
        return this.f126156e;
    }

    @Override // vl2.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Object obj;
        String e13;
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            List list = this.f126153b;
            if (i13 >= length) {
                return ui2.m.a(this.f126152a, z0.m(CollectionsKt.N0(list, arrayList)), this.f126155d);
            }
            Object obj2 = args[i13];
            int i15 = i14 + 1;
            ArrayList arrayList2 = this.f126157f;
            if (obj2 == null && this.f126154c == a.CALL_BY_NAME) {
                obj = this.f126158g.get(i14);
            } else {
                Class cls = (Class) arrayList2.get(i14);
                if (!(obj2 instanceof Class)) {
                    if (obj2 instanceof rl2.d) {
                        obj2 = l0.t0((rl2.d) obj2);
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        if (!(objArr instanceof Class[])) {
                            if (objArr instanceof rl2.d[]) {
                                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                rl2.d[] dVarArr = (rl2.d[]) obj2;
                                ArrayList arrayList3 = new ArrayList(dVarArr.length);
                                for (rl2.d dVar : dVarArr) {
                                    arrayList3.add(l0.t0(dVar));
                                }
                                obj2 = arrayList3.toArray(new Class[0]);
                            } else {
                                obj2 = objArr;
                            }
                        }
                    }
                    obj = cls.isInstance(obj2) ? obj2 : null;
                }
                obj = null;
            }
            if (obj == null) {
                String str = (String) list.get(i14);
                Class cls2 = (Class) arrayList2.get(i14);
                rl2.d b13 = Intrinsics.d(cls2, Class.class) ? k0.f80436a.b(rl2.d.class) : (cls2.isArray() && Intrinsics.d(cls2.getComponentType(), Class.class)) ? k0.f80436a.b(rl2.d[].class) : l0.w0(cls2);
                if (Intrinsics.d(b13.e(), k0.f80436a.b(Object[].class).e())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(b13.e());
                    sb3.append('<');
                    Class<?> componentType = l0.t0(b13).getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    sb3.append(l0.w0(componentType).e());
                    sb3.append('>');
                    e13 = sb3.toString();
                } else {
                    e13 = b13.e();
                }
                throw new IllegalArgumentException("Argument #" + i14 + ' ' + str + " is not of the required type " + e13);
            }
            arrayList.add(obj);
            i13++;
            i14 = i15;
        }
    }

    @Override // vl2.g
    public final Type getReturnType() {
        return this.f126152a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ c(java.lang.Class r7, java.util.ArrayList r8, vl2.a r9, vl2.b r10) {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.g0.q(r8, r0)
            r5.<init>(r0)
            java.util.Iterator r0 = r8.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r1, r2)
            r5.add(r1)
            goto Lf
        L26:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.c.<init>(java.lang.Class, java.util.ArrayList, vl2.a, vl2.b):void");
    }
}
