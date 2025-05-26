package com.google.common.util.concurrent;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class b<V> extends tk.a implements c0 {

    /* renamed from: a */
    static final boolean f33528a;

    /* renamed from: b */
    static final b0 f33529b;

    /* renamed from: c */
    private static final a f33530c;

    /* renamed from: d */
    private static final Object f33531d;
    private volatile e listeners;
    private volatile Object value;
    private volatile k waiters;

    public static abstract class a {
        public abstract boolean a(b bVar, e eVar, e eVar2);

        public abstract boolean b(b bVar, Object obj, Object obj2);

        public abstract boolean c(b bVar, k kVar, k kVar2);

        public abstract e d(b bVar, e eVar);

        public abstract k e(b bVar, k kVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.b$b */
    /* loaded from: classes3.dex */
    public static final class C0000b extends a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<k, Thread> f33532a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<k, k> f33533b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<? super b<?>, k> f33534c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<? super b<?>, e> f33535d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<? super b<?>, Object> f33536e;

        public C0000b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f33532a = atomicReferenceFieldUpdater;
            this.f33533b = atomicReferenceFieldUpdater2;
            this.f33534c = atomicReferenceFieldUpdater3;
            this.f33535d = atomicReferenceFieldUpdater4;
            this.f33536e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean a(b bVar, e eVar, e eVar2) {
            AtomicReferenceFieldUpdater<? super b<?>, e> atomicReferenceFieldUpdater = this.f33535d;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, eVar, eVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != eVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean b(b bVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super b<?>, Object> atomicReferenceFieldUpdater = this.f33536e;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean c(b bVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super b<?>, k> atomicReferenceFieldUpdater = this.f33534c;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, kVar, kVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != kVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final e d(b bVar, e eVar) {
            return this.f33535d.getAndSet(bVar, eVar);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final k e(b bVar, k kVar) {
            return this.f33534c.getAndSet(bVar, kVar);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final void f(k kVar, k kVar2) {
            this.f33533b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final void g(k kVar, Thread thread) {
            this.f33532a.lazySet(kVar, thread);
        }
    }

    public static final class c {

        /* renamed from: c */
        static final c f33537c;

        /* renamed from: d */
        static final c f33538d;

        /* renamed from: a */
        final boolean f33539a;

        /* renamed from: b */
        final Throwable f33540b;

        static {
            if (b.f33528a) {
                f33538d = null;
                f33537c = null;
            } else {
                f33538d = new c(false, null);
                f33537c = new c(true, null);
            }
        }

        public c(boolean z13, Throwable th3) {
            this.f33539a = z13;
            this.f33540b = th3;
        }
    }

    public static final class d {

        /* renamed from: b */
        static final d f33541b = new d(new a());

        /* renamed from: a */
        final Throwable f33542a;

        /* loaded from: classes3.dex */
        public class a extends Throwable {
            public a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th3) {
            th3.getClass();
            this.f33542a = th3;
        }
    }

    public static final class f<V> implements Runnable {

        /* renamed from: a */
        final b<V> f33546a;

        /* renamed from: b */
        final c0 f33547b;

        public f(b bVar, c0 c0Var) {
            this.f33546a = bVar;
            this.f33547b = c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((b) this.f33546a).value != this) {
                return;
            }
            if (b.f33530c.b(this.f33546a, this, b.q(this.f33547b))) {
                b.n(this.f33546a, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends a {
        @Override // com.google.common.util.concurrent.b.a
        public final boolean a(b bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.listeners != eVar) {
                        return false;
                    }
                    bVar.listeners = eVar2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean b(b bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                try {
                    if (bVar.value != obj) {
                        return false;
                    }
                    bVar.value = obj2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean c(b bVar, k kVar, k kVar2) {
            synchronized (bVar) {
                try {
                    if (bVar.waiters != kVar) {
                        return false;
                    }
                    bVar.waiters = kVar2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.google.common.util.concurrent.b.a
        public final e d(b bVar, e eVar) {
            e eVar2;
            synchronized (bVar) {
                try {
                    eVar2 = bVar.listeners;
                    if (eVar2 != eVar) {
                        bVar.listeners = eVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final k e(b bVar, k kVar) {
            k kVar2;
            synchronized (bVar) {
                try {
                    kVar2 = bVar.waiters;
                    if (kVar2 != kVar) {
                        bVar.waiters = kVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final void f(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final void g(k kVar, Thread thread) {
            kVar.thread = thread;
        }
    }

    public interface h<V> extends c0 {
    }

    public static abstract class i<V> extends b<V> implements h<V> {
        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean cancel(boolean z13) {
            return super.cancel(z13);
        }

        @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.c0
        public void d(Runnable runnable, Executor executor) {
            super.d(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public Object get(long j13, TimeUnit timeUnit) {
            return super.get(j13, timeUnit);
        }
    }

    public static final class j extends a {

        /* renamed from: a */
        static final Unsafe f33548a;

        /* renamed from: b */
        static final long f33549b;

        /* renamed from: c */
        static final long f33550c;

        /* renamed from: d */
        static final long f33551d;

        /* renamed from: e */
        static final long f33552e;

        /* renamed from: f */
        static final long f33553f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f33550c = unsafe.objectFieldOffset(b.class.getDeclaredField("waiters"));
                    f33549b = unsafe.objectFieldOffset(b.class.getDeclaredField("listeners"));
                    f33551d = unsafe.objectFieldOffset(b.class.getDeclaredField("value"));
                    f33552e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                    f33553f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                    f33548a = unsafe;
                } catch (NoSuchFieldException e13) {
                    throw new RuntimeException(e13);
                }
            } catch (PrivilegedActionException e14) {
                throw new RuntimeException("Could not initialize intrinsics", e14.getCause());
            }
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean a(b bVar, e eVar, e eVar2) {
            return com.google.common.util.concurrent.c.a(f33548a, bVar, f33549b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean b(b bVar, Object obj, Object obj2) {
            return com.google.common.util.concurrent.c.a(f33548a, bVar, f33551d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final boolean c(b bVar, k kVar, k kVar2) {
            return com.google.common.util.concurrent.c.a(f33548a, bVar, f33550c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final e d(b bVar, e eVar) {
            e eVar2;
            do {
                eVar2 = bVar.listeners;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(bVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final k e(b bVar, k kVar) {
            k kVar2;
            do {
                kVar2 = bVar.waiters;
                if (kVar == kVar2) {
                    return kVar2;
                }
            } while (!c(bVar, kVar2, kVar));
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.b.a
        public final void f(k kVar, k kVar2) {
            f33548a.putObject(kVar, f33553f, kVar2);
        }

        @Override // com.google.common.util.concurrent.b.a
        public final void g(k kVar, Thread thread) {
            f33548a.putObject(kVar, f33552e, thread);
        }
    }

    public static final class k {

        /* renamed from: a */
        static final k f33554a = new k();
        volatile k next;
        volatile Thread thread;

        public k() {
            b.f33530c.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z13;
        a gVar;
        try {
            z13 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z13 = false;
        }
        f33528a = z13;
        f33529b = new b0(b.class);
        Throwable th3 = null;
        try {
            gVar = new j();
            e = null;
        } catch (Error | Exception e13) {
            e = e13;
            try {
                gVar = new C0000b(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(b.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "value"));
            } catch (Error | Exception e14) {
                th3 = e14;
                gVar = new g();
            }
        }
        f33530c = gVar;
        if (th3 != null) {
            b0 b0Var = f33529b;
            Logger a13 = b0Var.a();
            Level level = Level.SEVERE;
            a13.log(level, "UnsafeAtomicHelper is broken!", e);
            b0Var.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th3);
        }
        f33531d = new Object();
    }

    public static CancellationException m(Throwable th3) {
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th3);
        return cancellationException;
    }

    public static void n(b bVar, boolean z13) {
        e eVar = null;
        while (true) {
            bVar.getClass();
            for (k e13 = f33530c.e(bVar, k.f33554a); e13 != null; e13 = e13.next) {
                Thread thread = e13.thread;
                if (thread != null) {
                    e13.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z13) {
                bVar.s();
                z13 = false;
            }
            bVar.k();
            e eVar2 = eVar;
            e d2 = f33530c.d(bVar, e.f33543c);
            e eVar3 = eVar2;
            while (d2 != null) {
                e eVar4 = d2.next;
                d2.next = eVar3;
                eVar3 = d2;
                d2 = eVar4;
            }
            while (eVar3 != null) {
                eVar = eVar3.next;
                Runnable runnable = eVar3.f33544a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof f) {
                    f fVar = (f) runnable2;
                    bVar = fVar.f33546a;
                    if (bVar.value == fVar) {
                        if (f33530c.b(bVar, fVar, q(fVar.f33547b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVar3.f33545b;
                    Objects.requireNonNull(executor);
                    o(runnable2, executor);
                }
                eVar3 = eVar;
            }
            return;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e13) {
            f33529b.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e13);
        }
    }

    public static Object p(Object obj) {
        if (obj instanceof c) {
            throw m(((c) obj).f33540b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f33542a);
        }
        if (obj == f33531d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object q(c0 c0Var) {
        Throwable a13;
        if (c0Var instanceof h) {
            Object obj = ((b) c0Var).value;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f33539a) {
                    obj = cVar.f33540b != null ? new c(false, cVar.f33540b) : c.f33538d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((c0Var instanceof tk.a) && (a13 = ((tk.a) c0Var).a()) != null) {
            return new d(a13);
        }
        boolean isCancelled = c0Var.isCancelled();
        if ((!f33528a) && isCancelled) {
            c cVar2 = c.f33538d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object r13 = r(c0Var);
            if (!isCancelled) {
                return r13 == null ? f33531d : r13;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + c0Var));
        } catch (Error e13) {
            e = e13;
            return new d(e);
        } catch (CancellationException e14) {
            if (isCancelled) {
                return new c(false, e14);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + c0Var, e14));
        } catch (ExecutionException e15) {
            if (!isCancelled) {
                return new d(e15.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + c0Var, e15));
        } catch (Exception e16) {
            e = e16;
            return new d(e);
        }
    }

    public static Object r(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th3) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // tk.a
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof d) {
            return ((d) obj).f33542a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        c cVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f33528a) {
            cVar = new c(z13, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z13 ? c.f33537c : c.f33538d;
            Objects.requireNonNull(cVar);
        }
        b<V> bVar = this;
        boolean z14 = false;
        while (true) {
            if (f33530c.b(bVar, obj, cVar)) {
                n(bVar, z13);
                if (!(obj instanceof f)) {
                    return true;
                }
                c0 c0Var = ((f) obj).f33547b;
                if (!(c0Var instanceof h)) {
                    c0Var.cancel(z13);
                    return true;
                }
                bVar = (b) c0Var;
                obj = bVar.value;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z14 = true;
            } else {
                obj = bVar.value;
                if (!(obj instanceof f)) {
                    return z14;
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.c0
    public void d(Runnable runnable, Executor executor) {
        e eVar;
        bf.b.p(executor, "Executor was null.");
        if (!isDone() && (eVar = this.listeners) != e.f33543c) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.next = eVar;
                if (f33530c.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f33543c);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j13, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j13);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof f))) {
            return p(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.waiters;
            if (kVar != k.f33554a) {
                k kVar2 = new k();
                do {
                    f33530c.f(kVar2, kVar);
                    if (f33530c.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                u(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return p(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        u(kVar2);
                    } else {
                        kVar = this.waiters;
                    }
                } while (kVar != k.f33554a);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return p(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return p(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String bVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder u13 = a.a.u("Waited ", j13, " ");
        u13.append(timeUnit.toString().toLowerCase(locale));
        String sb3 = u13.toString();
        if (nanos + 1000 < 0) {
            String C = a.a.C(sb3, " (plus ");
            long j14 = -nanos;
            long convert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(convert);
            boolean z13 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = C + convert + " " + lowerCase;
                if (z13) {
                    str = a.a.C(str, ",");
                }
                C = a.a.C(str, " ");
            }
            if (z13) {
                C = C + nanos2 + " nanoseconds ";
            }
            sb3 = a.a.C(C, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.a.C(sb3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(a.a.D(sb3, " for ", bVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.value != null);
    }

    public final void j(StringBuilder sb3) {
        try {
            Object r13 = r(this);
            sb3.append("SUCCESS, result=[");
            l(sb3, r13);
            sb3.append("]");
        } catch (CancellationException unused) {
            sb3.append("CANCELLED");
        } catch (ExecutionException e13) {
            sb3.append("FAILURE, cause=[");
            sb3.append(e13.getCause());
            sb3.append("]");
        } catch (Exception e14) {
            sb3.append("UNKNOWN, cause=[");
            sb3.append(e14.getClass());
            sb3.append(" thrown from get()]");
        }
    }

    public void k() {
    }

    public final void l(StringBuilder sb3, Object obj) {
        if (obj == null) {
            sb3.append("null");
        } else {
            if (obj == this) {
                sb3.append("this future");
                return;
            }
            sb3.append(obj.getClass().getName());
            sb3.append("@");
            sb3.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public void s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String t() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lcf
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.j(r0)
            goto Lcf
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.value
            boolean r4 = r3 instanceof com.google.common.util.concurrent.b.f
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.common.util.concurrent.b$f r3 = (com.google.common.util.concurrent.b.f) r3
            com.google.common.util.concurrent.c0 r3 = r3.f33547b
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbf
        L93:
            java.lang.String r3 = r6.t()     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            boolean r4 = tb.f.i0(r3)     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            if (r4 == 0) goto Lb2
            r3 = 0
            goto Lb2
        L9f:
            r3 = move-exception
            goto La2
        La1:
            r3 = move-exception
        La2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb2:
            if (r3 == 0) goto Lbf
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbf:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcf
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.j(r0)
        Lcf:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b.toString():java.lang.String");
    }

    public final void u(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 == k.f33554a) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.next;
                if (kVar2.thread != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.next = kVar4;
                    if (kVar3.thread == null) {
                        break;
                    }
                } else if (!f33530c.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public boolean v(Object obj) {
        if (obj == null) {
            obj = f33531d;
        }
        if (!f33530c.b(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    public boolean w(Throwable th3) {
        th3.getClass();
        if (!f33530c.b(this, null, new d(th3))) {
            return false;
        }
        n(this, false);
        return true;
    }

    public final void x(c0 c0Var) {
        d dVar;
        c0Var.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (c0Var.isDone()) {
                if (f33530c.b(this, null, q(c0Var))) {
                    n(this, false);
                    return;
                }
                return;
            }
            f fVar = new f(this, c0Var);
            if (f33530c.b(this, null, fVar)) {
                try {
                    c0Var.d(fVar, r.INSTANCE);
                    return;
                } catch (Throwable th3) {
                    try {
                        dVar = new d(th3);
                    } catch (Error | Exception unused) {
                        dVar = d.f33541b;
                    }
                    f33530c.b(this, fVar, dVar);
                    return;
                }
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            c0Var.cancel(((c) obj).f33539a);
        }
    }

    public final boolean y() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f33539a;
    }

    public static final class e {

        /* renamed from: c */
        static final e f33543c = new e();

        /* renamed from: a */
        final Runnable f33544a;

        /* renamed from: b */
        final Executor f33545b;
        e next;

        public e(Runnable runnable, Executor executor) {
            this.f33544a = runnable;
            this.f33545b = executor;
        }

        public e() {
            this.f33544a = null;
            this.f33545b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return p(obj2);
            }
            k kVar = this.waiters;
            if (kVar != k.f33554a) {
                k kVar2 = new k();
                do {
                    f33530c.f(kVar2, kVar);
                    if (f33530c.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                u(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return p(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != k.f33554a);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return p(obj3);
        }
        throw new InterruptedException();
    }
}
