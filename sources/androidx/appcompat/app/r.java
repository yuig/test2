package androidx.appcompat.app;

import a.jg;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16110a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16111b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f16112c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16113d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f16114e;

    public r(int i13, Executor executor) {
        this.f16110a = i13;
        if (i13 != 1) {
            this.f16113d = new Object();
            this.f16114e = new ArrayDeque();
            this.f16111b = executor;
        } else {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f16111b = executor;
            this.f16114e = new ArrayDeque();
            this.f16113d = new Object();
        }
    }

    public final void a() {
        switch (this.f16110a) {
            case 0:
                synchronized (this.f16113d) {
                    try {
                        Runnable runnable = (Runnable) this.f16114e.poll();
                        this.f16112c = runnable;
                        if (runnable != null) {
                            this.f16111b.execute(runnable);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f16113d) {
                    try {
                        Object poll = this.f16114e.poll();
                        Runnable runnable2 = (Runnable) poll;
                        this.f16112c = runnable2;
                        if (poll != null) {
                            this.f16111b.execute(runnable2);
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f16110a) {
            case 0:
                synchronized (this.f16113d) {
                    try {
                        this.f16114e.add(new jg(1, this, command));
                        if (this.f16112c == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                synchronized (this.f16113d) {
                    try {
                        this.f16114e.offer(new androidx.media3.ui.z(2, command, this));
                        if (this.f16112c == null) {
                            a();
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
