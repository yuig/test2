package com.modiface.mfecommon.utils;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a */
    int f34324a;

    /* renamed from: b */
    int f34325b;

    /* renamed from: c */
    private final int f34326c;

    /* renamed from: d */
    final LinkedList<a0> f34327d;

    /* renamed from: e */
    private final Object f34328e;

    /* renamed from: f */
    private final k0 f34329f;

    public i() {
        this(0);
    }

    @NonNull
    public MFEImage a(@NonNull k0 k0Var) {
        a0 a0Var;
        synchronized (this.f34328e) {
            try {
                if (this.f34327d.isEmpty()) {
                    a0Var = null;
                } else {
                    a0Var = this.f34327d.removeFirst();
                    if (a0Var != null) {
                        a0Var.c();
                        if (a0Var.isClosed()) {
                            throw new IllegalStateException("image from cache is closed: " + a0Var.getFrameID());
                        }
                    }
                }
                if (a0Var == null) {
                    a0Var = ((j0) k0Var).a();
                }
            } finally {
            }
        }
        return a0Var;
    }

    public i(int i13) {
        this.f34324a = 0;
        this.f34325b = 0;
        this.f34327d = new LinkedList<>();
        this.f34328e = new Object();
        this.f34329f = new j0(this);
        this.f34326c = i13;
    }

    @NonNull
    public MFEImage a() {
        return a(this.f34329f);
    }

    public void a(int i13, int i14) {
        synchronized (this.f34328e) {
            try {
                if (i13 == this.f34324a && i14 == this.f34325b) {
                    return;
                }
                Iterator<a0> it = this.f34327d.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                this.f34327d.clear();
                this.f34324a = i13;
                this.f34325b = i14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean a(@NonNull a0 a0Var) {
        synchronized (this.f34328e) {
            try {
                if (a0Var.getWidth() != this.f34324a || a0Var.getHeight() != this.f34325b || (this.f34326c > 0 && this.f34327d.size() >= this.f34326c)) {
                    return false;
                }
                if (a0Var.isClosed()) {
                    throw new IllegalStateException("image to put in cache is released: " + a0Var.getFrameID());
                }
                this.f34327d.add(a0Var);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
