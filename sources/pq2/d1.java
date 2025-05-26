package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f101009a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Call.Factory f101010b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpUrl f101011c;

    /* renamed from: d, reason: collision with root package name */
    public final List f101012d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101013e;

    /* renamed from: f, reason: collision with root package name */
    public final List f101014f;

    /* renamed from: g, reason: collision with root package name */
    public final int f101015g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f101016h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f101017i;

    public d1(Call.Factory factory, HttpUrl httpUrl, List list, int i13, List list2, int i14, Executor executor, boolean z13) {
        this.f101010b = factory;
        this.f101011c = httpUrl;
        this.f101012d = list;
        this.f101013e = i13;
        this.f101014f = list2;
        this.f101015g = i14;
        this.f101016h = executor;
        this.f101017i = z13;
    }

    public final k a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f101014f;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i13 = indexOf; i13 < size; i13++) {
            k a13 = ((j) list.get(i13)).a(type, annotationArr, this);
            if (a13 != null) {
                return a13;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate call adapter for ");
        sb3.append(type);
        sb3.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(((j) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public final Object b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb3 = new StringBuilder("Type parameters are unsupported on ");
                sb3.append(cls2.getName());
                if (cls2 != cls) {
                    sb3.append(" which is an interface of ");
                    sb3.append(cls.getName());
                }
                throw new IllegalArgumentException(sb3.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f101017i) {
            m60.f0 f0Var = t0.f101085b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!f0Var.m0(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new b1(this, cls));
    }

    public final e1 c(Class cls, Method method) {
        while (true) {
            Object obj = this.f101009a.get(method);
            if (obj instanceof e1) {
                return (e1) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.f101009a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            try {
                                w a13 = e1.a(this, cls, method);
                                this.f101009a.put(method, a13);
                                return a13;
                            } catch (Throwable th3) {
                                this.f101009a.remove(method);
                                throw th3;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.f101009a.get(method);
                    if (obj3 != null) {
                        return (e1) obj3;
                    }
                } finally {
                }
            }
        }
    }

    public final p d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f101012d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i13 = indexOf; i13 < size; i13++) {
            p a13 = ((o) list.get(i13)).a(type, annotationArr, annotationArr2, this);
            if (a13 != null) {
                return a13;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate RequestBody converter for ");
        sb3.append(type);
        sb3.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(((o) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public final p e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f101012d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i13 = indexOf; i13 < size; i13++) {
            p b13 = ((o) list.get(i13)).b(type, annotationArr, this);
            if (b13 != null) {
                return b13;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb3.append(type);
        sb3.append(".\n");
        sb3.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(((o) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public final p f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f101012d;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            p c13 = ((o) list.get(i13)).c(type, annotationArr, this);
            if (c13 != null) {
                return c13;
            }
        }
        return d.f101007a;
    }
}
