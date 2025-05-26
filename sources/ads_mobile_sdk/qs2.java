package ads_mobile_sdk;

import a.i8;
import android.os.SystemClock;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class qs2 {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f10249a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final i8 f10250b = new i8();

    public static cs2 a(il0 cuiName, List tags, boolean z13) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        cs2 cs2Var = b().f9801a;
        cs2 a13 = cs2Var != null ? cs2Var.a(cuiName, tags, z13) : b(cuiName, tags, z13);
        a(b(), a13);
        return a13;
    }

    public static gb1 b(il0 cuiName, List tags, boolean z13) {
        ds2.a("Attempted to start a trace " + cuiName.name() + " without a parent. Did you forget to start a root trace or propagate an existing one?");
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        return new gb1(cuiName, tags, randomUUID, new ss2(new o52(), new v01(), new k72(), new g5()), 0, 0, null, z13);
    }

    public static cs2 c() {
        return b().f9801a;
    }

    public static void a(cs2 expectedTrace) {
        jw1 f13;
        il0 il0Var;
        Intrinsics.checkNotNullParameter(expectedTrace, "expectedTrace");
        ps2 b13 = b();
        cs2 a13 = b13.a();
        if (a13 == null) {
            ds2.a("Tried to end trace " + expectedTrace.f().f6981c.name() + " (" + expectedTrace.d() + "), but there was no active trace. If this is a test, did you forget to add a TraceThreadContextElement to your CoroutineScope?");
        }
        if (expectedTrace != a13) {
            String name = expectedTrace.f().f6981c.name();
            int d2 = expectedTrace.d();
            String name2 = (a13 == null || (f13 = a13.f()) == null || (il0Var = f13.f6981c) == null) ? null : il0Var.name();
            Integer valueOf = a13 != null ? Integer.valueOf(a13.d()) : null;
            StringBuilder v13 = a.a.v("Tried to end trace ", name, " (", d2, "), but that trace is not the current trace. The current trace is ");
            v13.append(name2);
            v13.append(" (");
            v13.append(valueOf);
            v13.append(").");
            ds2.a(v13.toString());
        }
        a(b13, a13 != null ? a13.e() : null);
        expectedTrace.a();
    }

    public static ps2 b() {
        i8 i8Var = f10250b;
        Object obj = i8Var.get();
        if (obj == null) {
            obj = new ps2(null, SystemClock.currentThreadTimeMillis(), null);
            Thread currentThread = Thread.currentThread();
            WeakHashMap weakHashMap = f10249a;
            synchronized (weakHashMap) {
            }
            i8Var.set(obj);
        }
        return (ps2) obj;
    }

    public static cs2 a(ps2 ps2Var, cs2 cs2Var) {
        cs2 cs2Var2 = ps2Var.f9801a;
        if (cs2Var2 == cs2Var) {
            return cs2Var;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (cs2Var2 != null) {
            zn2.a aVar = zn2.b.f142311b;
            cs2Var2.f4022e.addAndGet(zn2.b.e(dl2.b.Q2(currentThreadTimeMillis - ps2Var.f9802b, zn2.d.MILLISECONDS)));
        }
        ps2Var.f9802b = currentThreadTimeMillis;
        ps2Var.f9801a = cs2Var;
        os2 os2Var = ps2Var.f9803c;
        if (os2Var != null) {
            os2Var.f9426a = cs2Var;
        }
        return cs2Var2;
    }

    public static cs2 a() {
        cs2 cs2Var = b().f9801a;
        if (cs2Var != null) {
            return cs2Var;
        }
        gb1 b13 = b(il0.CUI_NAME_UNKNOWN, kotlin.collections.q0.f80391a, true);
        a(b(), b13);
        return b13;
    }
}
