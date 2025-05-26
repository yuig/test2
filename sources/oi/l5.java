package oi;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f94937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k5 f94938c;

    public /* synthetic */ l5(k5 k5Var, AtomicReference atomicReference, int i13) {
        this.f94936a = i13;
        this.f94938c = k5Var;
        this.f94937b = atomicReference;
    }

    private final void a() {
        synchronized (this.f94937b) {
            try {
                try {
                    AtomicReference atomicReference = this.f94937b;
                    e l13 = this.f94938c.l();
                    String z13 = this.f94938c.q().z();
                    l13.getClass();
                    atomicReference.set(Boolean.valueOf(l13.x(z13, s.K)));
                } finally {
                    this.f94937b.notify();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f94936a) {
            case 0:
                k5 k5Var = this.f94938c;
                Bundle N = k5Var.n().f94778m.N();
                d6 u13 = k5Var.u();
                if (N == null) {
                    N = new Bundle();
                }
                u13.p();
                u13.w();
                zzo L = u13.L(false);
                u13.A(new n.g(u13, this.f94937b, L, N, 4));
                return;
            case 1:
                a();
                return;
            case 2:
                synchronized (this.f94937b) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f94937b;
                            e l13 = this.f94938c.l();
                            String z13 = this.f94938c.q().z();
                            l13.getClass();
                            atomicReference.set(l13.w(z13, s.L));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                synchronized (this.f94937b) {
                    try {
                        try {
                            this.f94937b.set(Integer.valueOf(this.f94938c.l().u(this.f94938c.q().z(), s.N)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                synchronized (this.f94937b) {
                    try {
                        try {
                            this.f94937b.set(Long.valueOf(this.f94938c.l().v(this.f94938c.q().z(), s.M)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f94937b) {
                    try {
                        try {
                            this.f94937b.set(Double.valueOf(this.f94938c.l().q(this.f94938c.q().z(), s.O)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
