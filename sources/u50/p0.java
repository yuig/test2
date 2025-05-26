package u50;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f120579a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f120580b;

    public p0() {
        Intrinsics.checkNotNullParameter("", "text");
        this.f120579a = new StringBuilder("");
        this.f120580b = new LinkedHashMap();
    }

    public static void a(p0 p0Var, int i13, es.k init) {
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(init, "init");
        p0Var.c(new j(i13), 17, init);
    }

    public static void b(p0 p0Var, int i13, es.k init) {
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(init, "init");
        p0Var.c(new j(new e(i13)), 17, init);
    }

    public static void d(p0 p0Var, po1.a init) {
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(init, "init");
        p0Var.c(new e0(), 17, init);
    }

    public final void c(d0 span, int i13, Function1 function1) {
        StringBuilder sb3 = this.f120579a;
        int length = sb3.length();
        function1.invoke(span);
        int length2 = sb3.length();
        Intrinsics.checkNotNullParameter(span, "span");
        if (length2 == -1) {
            length2 = sb3.length();
        }
        this.f120580b.put(span, new c0(length, length2, i13));
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        this.f120579a.append(str);
    }
}
