package kg;

import android.view.View;
import eo2.p0;
import ho2.y;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import t3.s1;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a */
    public static Constructor f79375a;

    public static void a(View view) {
        ViewSwazzledHooks.logOnClickEvent(view, th2.n.TAP);
    }

    public static final void b(o3.f fVar, n3.q qVar) {
        if (c0.d.s(qVar)) {
            o3.e eVar = fVar.f92860a;
            z.o(0, r7.length, null, eVar.f92855d);
            eVar.f92856e = 0;
            o3.e eVar2 = fVar.f92861b;
            z.o(0, r7.length, null, eVar2.f92855d);
            eVar2.f92856e = 0;
            fVar.f92862c = 0L;
        }
        boolean u13 = c0.d.u(qVar);
        long j13 = qVar.f89108b;
        if (!u13) {
            List c13 = qVar.c();
            int size = c13.size();
            for (int i13 = 0; i13 < size; i13++) {
                n3.c cVar = (n3.c) c13.get(i13);
                long j14 = cVar.f89037a;
                long j15 = cVar.f89039c;
                fVar.f92860a.a(j14, a3.c.d(j15));
                fVar.f92861b.a(j14, a3.c.e(j15));
            }
            long j16 = qVar.f89118l;
            fVar.f92860a.a(j13, a3.c.d(j16));
            fVar.f92861b.a(j13, a3.c.e(j16));
        }
        if (c0.d.u(qVar) && j13 - fVar.f92862c > 40) {
            o3.e eVar3 = fVar.f92860a;
            z.o(0, r2.length, null, eVar3.f92855d);
            eVar3.f92856e = 0;
            o3.e eVar4 = fVar.f92861b;
            z.o(0, r2.length, null, eVar4.f92855d);
            eVar4.f92856e = 0;
            fVar.f92862c = 0L;
        }
        fVar.f92862c = j13;
    }

    public static final float c(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            f13 += fArr[i13] * fArr2[i13];
        }
        return f13;
    }

    public static final int d(oo2.g gVar, oo2.g[] typeParams) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (gVar.i().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        oo2.i iVar = new oo2.i(gVar, 0);
        int i13 = 1;
        int i14 = 1;
        while (iVar.hasNext()) {
            int i15 = i14 * 31;
            String i16 = ((oo2.g) iVar.next()).i();
            i14 = i15 + (i16 != null ? i16.hashCode() : 0);
        }
        oo2.i iVar2 = new oo2.i(gVar, 0);
        while (iVar2.hasNext()) {
            int i17 = i13 * 31;
            oo2.n c13 = ((oo2.g) iVar2.next()).c();
            i13 = i17 + (c13 != null ? c13.hashCode() : 0);
        }
        return (((hashCode * 31) + i14) * 31) + i13;
    }

    public static Object e(Class cls, Object obj, Method method, Object[] objArr) {
        Constructor constructor = f79375a;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f79375a = constructor;
        }
        return ((MethodHandles.Lookup) constructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean f(int i13) {
        int type = Character.getType(i13);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final Object g(ConcurrentHashMap concurrentHashMap, String key, Function0 code) {
        AtomicInteger atomicInteger;
        Object invoke;
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(code, "code");
        synchronized (concurrentHashMap) {
            try {
                atomicInteger = (AtomicInteger) concurrentHashMap.get(key);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger(0);
                }
                if (concurrentHashMap.get(key) == null) {
                    concurrentHashMap.put(key, atomicInteger);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        atomicInteger.incrementAndGet();
        synchronized (atomicInteger) {
            try {
                invoke = code.invoke();
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    concurrentHashMap.remove(key);
                }
            }
        }
        return invoke;
    }

    public static final void h(float[] fArr, float[] fArr2, int i13, float[] fArr3) {
        if (i13 == 0) {
            jk.r.x("At least one point must be provided");
            throw null;
        }
        int i14 = 2 >= i13 ? i13 - 1 : 2;
        int i15 = i14 + 1;
        float[][] fArr4 = new float[i15][];
        for (int i16 = 0; i16 < i15; i16++) {
            fArr4[i16] = new float[i13];
        }
        for (int i17 = 0; i17 < i13; i17++) {
            fArr4[0][i17] = 1.0f;
            for (int i18 = 1; i18 < i15; i18++) {
                fArr4[i18][i17] = fArr4[i18 - 1][i17] * fArr[i17];
            }
        }
        float[][] fArr5 = new float[i15][];
        for (int i19 = 0; i19 < i15; i19++) {
            fArr5[i19] = new float[i13];
        }
        float[][] fArr6 = new float[i15][];
        for (int i23 = 0; i23 < i15; i23++) {
            fArr6[i23] = new float[i15];
        }
        int i24 = 0;
        while (i24 < i15) {
            float[] destination = fArr5[i24];
            float[] fArr7 = fArr4[i24];
            Intrinsics.checkNotNullParameter(fArr7, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i13);
            for (int i25 = 0; i25 < i24; i25++) {
                float[] fArr8 = fArr5[i25];
                float c13 = c(destination, fArr8);
                for (int i26 = 0; i26 < i13; i26++) {
                    destination[i26] = destination[i26] - (fArr8[i26] * c13);
                }
            }
            float sqrt = (float) Math.sqrt(c(destination, destination));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f13 = 1.0f / sqrt;
            for (int i27 = 0; i27 < i13; i27++) {
                destination[i27] = destination[i27] * f13;
            }
            float[] fArr9 = fArr6[i24];
            int i28 = 0;
            while (i28 < i15) {
                fArr9[i28] = i28 < i24 ? 0.0f : c(destination, fArr4[i28]);
                i28++;
            }
            i24++;
        }
        for (int i29 = i14; -1 < i29; i29--) {
            float c14 = c(fArr5[i29], fArr2);
            float[] fArr10 = fArr6[i29];
            int i33 = i29 + 1;
            if (i33 <= i14) {
                int i34 = i14;
                while (true) {
                    c14 -= fArr10[i34] * fArr3[i34];
                    if (i34 != i33) {
                        i34--;
                    }
                }
            }
            fArr3[i29] = c14 / fArr10[i29];
        }
    }

    public static final List i(int i13, ConcurrentLinkedQueue concurrentLinkedQueue) {
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "<this>");
        if (i13 == 0) {
            return q0.f80391a;
        }
        ArrayList arrayList = new ArrayList(i13);
        Iterator it = concurrentLinkedQueue.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14++;
            arrayList.add(it.next());
            if (i14 == i13) {
                break;
            }
        }
        return arrayList.size() <= 1 ? CollectionsKt.y0(concurrentLinkedQueue, arrayList.size()) : arrayList;
    }

    public static final void j(String str, rl2.d baseClass) {
        String sb3;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.f() + '\'';
        if (str == null) {
            sb3 = s1.b("Class discriminator was missing and no default serializers were registered ", str2, '.');
        } else {
            StringBuilder w13 = a.a.w("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            a.a.B(w13, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            w13.append(baseClass.f());
            w13.append("' has to be sealed and '@Serializable'.");
            sb3 = w13.toString();
        }
        throw new SerializationException(sb3);
    }

    public static double k(long j13) {
        return j13 / vb0.m.MEGABYTE.getBytes$common_release();
    }

    public static final Object l(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, bl2.c frame) {
        Object invoke;
        Object c13 = y.c(coroutineContext, obj2);
        try {
            p0 p0Var = new p0(frame, coroutineContext);
            if (function2 instanceof dl2.a) {
                dl2.b.y(2, function2);
                invoke = function2.invoke(obj, p0Var);
            } else {
                invoke = cl2.h.c(function2, obj, p0Var);
            }
            y.a(coroutineContext, c13);
            if (invoke == cl2.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return invoke;
        } catch (Throwable th3) {
            y.a(coroutineContext, c13);
            throw th3;
        }
    }
}
