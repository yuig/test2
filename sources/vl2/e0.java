package vl2;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ul2.c2;

/* loaded from: classes4.dex */
public final class e0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f126173a;

    /* renamed from: b, reason: collision with root package name */
    public final g f126174b;

    /* renamed from: c, reason: collision with root package name */
    public final Member f126175c;

    /* renamed from: d, reason: collision with root package name */
    public final kv0.p f126176d;

    /* renamed from: e, reason: collision with root package name */
    public final IntRange[] f126177e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f126178f;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (xl2.l.H(r2) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
    
        if ((r11 instanceof vl2.f) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed A[EDGE_INSN: B:65:0x02ed->B:49:0x02ed BREAK  A[LOOP:2: B:53:0x02d3->B:63:0x02d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e0(vl2.g r11, am2.x r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.e0.<init>(vl2.g, am2.x, boolean):void");
    }

    @Override // vl2.g
    public final List a() {
        return this.f126174b.a();
    }

    @Override // vl2.g
    public final Member b() {
        return this.f126175c;
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Object invoke;
        Object obj;
        Object e13;
        Intrinsics.checkNotNullParameter(args, "args");
        kv0.p pVar = this.f126176d;
        IntRange intRange = (IntRange) pVar.f80994a;
        List[] listArr = (List[]) pVar.f80995b;
        Method method = (Method) pVar.f80996c;
        if (!intRange.isEmpty()) {
            boolean z13 = this.f126178f;
            int i13 = intRange.f80454b;
            int i14 = intRange.f80453a;
            if (z13) {
                yk2.b bVar = new yk2.b(args.length);
                for (int i15 = 0; i15 < i14; i15++) {
                    bVar.add(args[i15]);
                }
                if (i14 <= i13) {
                    while (true) {
                        List<Method> list = listArr[i14];
                        Object obj2 = args[i14];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj2 != null) {
                                    e13 = method2.invoke(obj2, new Object[0]);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    e13 = c2.e(returnType);
                                }
                                bVar.add(e13);
                            }
                        } else {
                            bVar.add(obj2);
                        }
                        if (i14 == i13) {
                            break;
                        }
                        i14++;
                    }
                }
                int i16 = i13 + 1;
                Intrinsics.checkNotNullParameter(args, "<this>");
                int length = args.length - 1;
                if (i16 <= length) {
                    while (true) {
                        bVar.add(args[i16]);
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                    }
                }
                args = kotlin.collections.e0.a(bVar).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i17 = 0; i17 < length2; i17++) {
                    if (i17 > i13 || i14 > i17) {
                        obj = args[i17];
                    } else {
                        List list2 = listArr[i17];
                        Method method3 = list2 != null ? (Method) CollectionsKt.s0(list2) : null;
                        obj = args[i17];
                        if (method3 != null) {
                            if (obj != null) {
                                obj = method3.invoke(obj, new Object[0]);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                obj = c2.e(returnType2);
                            }
                        }
                    }
                    objArr[i17] = obj;
                }
                args = objArr;
            }
        }
        Object call = this.f126174b.call(args);
        return (call == cl2.a.COROUTINE_SUSPENDED || method == null || (invoke = method.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // vl2.g
    public final Type getReturnType() {
        return this.f126174b.getReturnType();
    }
}
