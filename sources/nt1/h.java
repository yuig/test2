package nt1;

import java.util.LinkedList;
import java.util.Stack;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f92303a = new ThreadLocal();

    public static final void a(Function0 disposable) {
        Intrinsics.checkNotNullParameter(disposable, "task");
        ThreadLocal threadLocal = f92303a;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new Stack();
            threadLocal.set(obj);
        }
        Stack stack = (Stack) obj;
        if (!(!stack.isEmpty())) {
            throw new IllegalArgumentException("Use taskContext {} to wrap code that uses appendTask()".toString());
        }
        g gVar = (g) stack.peek();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        gVar.f92301b.add(disposable);
    }

    public static final void b(Function0 disposable, Function1 function1) {
        Intrinsics.checkNotNullParameter(disposable, "initialTask");
        ThreadLocal threadLocal = f92303a;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new Stack();
            threadLocal.set(obj);
        }
        Stack stack = (Stack) obj;
        g gVar = new g(function1);
        stack.push(gVar);
        try {
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            LinkedList linkedList = gVar.f92301b;
            linkedList.add(disposable);
            while (!linkedList.isEmpty()) {
                try {
                    ((Function0) linkedList.removeFirst()).invoke();
                } catch (Throwable th3) {
                    th = th3;
                    Function1 function12 = gVar.f92300a;
                    if (function12 == null) {
                        Throwable th4 = gVar.f92302c;
                        if (th4 != null) {
                            th = th4;
                        }
                        gVar.f92302c = th;
                    } else {
                        try {
                            function12.invoke(th);
                        } catch (Throwable th5) {
                            th = th5;
                            Throwable th6 = gVar.f92302c;
                            if (th6 != null) {
                                th = th6;
                            }
                            gVar.f92302c = th;
                        }
                    }
                }
            }
            Throwable th7 = gVar.f92302c;
            gVar.f92302c = null;
            if (th7 == null) {
            } else {
                throw th7;
            }
        } finally {
            stack.pop();
        }
    }
}
