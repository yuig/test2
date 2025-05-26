package com.modiface.mfecommon.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class p extends HandlerThread implements Handler.Callback {

    /* renamed from: c, reason: collision with root package name */
    private static final String f34358c = "MFEThread";

    /* renamed from: a, reason: collision with root package name */
    protected WeakReference<c> f34359a;

    /* renamed from: b, reason: collision with root package name */
    protected Handler f34360b;

    public interface c {
        boolean handleMessage(Message message);
    }

    public p(String str) {
        super(str);
        this.f34359a = new WeakReference<>(null);
        this.f34360b = null;
        start();
        this.f34360b = new Handler(getLooper(), this);
    }

    public void a(c cVar) {
        this.f34359a = new WeakReference<>(cVar);
    }

    public boolean b(Runnable runnable) {
        return b(runnable, false);
    }

    public void finalize() {
        a();
        super.finalize();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        c cVar = this.f34359a.get();
        if (cVar != null) {
            return cVar.handleMessage(message);
        }
        return false;
    }

    public void a() {
        b(new n0(this));
        quitSafely();
        this.f34360b = null;
    }

    public boolean b(Runnable runnable, boolean z13) {
        if (runnable == null) {
            throw new IllegalArgumentException("cannot run null runnable in runSynchronously in MFEThread");
        }
        boolean z14 = false;
        if (this.f34360b == null) {
            return false;
        }
        Object obj = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean a13 = a(new o0(this, obj, runnable, atomicBoolean), z13);
        if (!a13) {
            atomicBoolean.set(true);
        }
        synchronized (obj) {
            try {
                if (!atomicBoolean.get()) {
                    obj.wait();
                }
                z14 = a13;
            } catch (InterruptedException e13) {
                e13.printStackTrace();
            }
        }
        return z14;
    }

    public boolean a(Runnable runnable) {
        return a(runnable, false);
    }

    public boolean a(Runnable runnable, boolean z13) {
        if (runnable != null) {
            Handler handler = this.f34360b;
            if (handler == null) {
                return false;
            }
            return z13 ? handler.postAtFrontOfQueue(runnable) : handler.post(runnable);
        }
        throw new IllegalArgumentException("cannot run null runnable in runAsync in MFEThread");
    }

    public Handler b() {
        return this.f34360b;
    }
}
