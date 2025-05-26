package ja;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f75231b;

    public /* synthetic */ g0(h0 h0Var, int i13) {
        this.f75230a = i13;
        this.f75231b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        int i13 = this.f75230a;
        h0 this$0 = this.f75231b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f75239s.compareAndSet(false, true)) {
                    s sVar = this$0.f75232l.f75182e;
                    sVar.getClass();
                    t observer = this$0.f75236p;
                    Intrinsics.checkNotNullParameter(observer, "observer");
                    sVar.a(new r(sVar, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.f75238r;
                    if (!atomicBoolean2.compareAndSet(false, true)) {
                        return;
                    }
                    Object obj = null;
                    boolean z13 = false;
                    while (true) {
                        atomicBoolean = this$0.f75237q;
                        try {
                            if (atomicBoolean.compareAndSet(true, false)) {
                                try {
                                    obj = this$0.f75235o.call();
                                    z13 = true;
                                } catch (Exception e13) {
                                    throw new RuntimeException("Exception while computing database live data.", e13);
                                }
                            } else {
                                if (z13) {
                                    this$0.i(obj);
                                }
                                if (!z13) {
                                    return;
                                }
                            }
                        } finally {
                            atomicBoolean2.set(false);
                        }
                    }
                } while (atomicBoolean.get());
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean z14 = this$0.f18633c > 0;
                if (this$0.f75237q.compareAndSet(false, true) && z14) {
                    boolean z15 = this$0.f75234n;
                    d0 d0Var = this$0.f75232l;
                    (z15 ? d0Var.k() : d0Var.h()).execute(this$0.f75240t);
                    return;
                }
                return;
        }
    }
}
