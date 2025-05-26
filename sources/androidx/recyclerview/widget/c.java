package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19336c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ExecutorService f19337d;

    /* renamed from: a, reason: collision with root package name */
    public Executor f19338a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f19339b;

    public c(a0 a0Var) {
        this.f19339b = a0Var;
    }

    public final androidx.appcompat.app.d a() {
        if (this.f19338a == null) {
            synchronized (f19336c) {
                try {
                    if (f19337d == null) {
                        f19337d = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f19338a = f19337d;
        }
        return new androidx.appcompat.app.d(null, this.f19338a, this.f19339b, 21);
    }
}
