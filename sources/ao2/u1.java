package ao2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u1 implements l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20214b = AtomicIntegerFieldUpdater.newUpdater(u1.class, "_isCompleting$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20215c = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_rootCause$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20216d = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final f2 f20217a;

    public u1(f2 f2Var, Throwable th3) {
        this.f20217a = f2Var;
        this._rootCause$volatile = th3;
    }

    public final void a(Throwable th3) {
        Throwable c13 = c();
        if (c13 == null) {
            f20215c.set(this, th3);
            return;
        }
        if (th3 == c13) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20216d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th3);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th3);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th3 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th3);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // ao2.l1
    public final f2 b() {
        return this.f20217a;
    }

    public final Throwable c() {
        return (Throwable) f20215c.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final ArrayList e(Throwable th3) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20216d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c13 = c();
        if (c13 != null) {
            arrayList.add(0, c13);
        }
        if (th3 != null && !Intrinsics.d(th3, c13)) {
            arrayList.add(th3);
        }
        atomicReferenceFieldUpdater.set(this, b2.f20120e);
        return arrayList;
    }

    @Override // ao2.l1
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Finishing[cancelling=");
        sb3.append(d());
        sb3.append(", completing=");
        sb3.append(f20214b.get(this) != 0);
        sb3.append(", rootCause=");
        sb3.append(c());
        sb3.append(", exceptions=");
        sb3.append(f20216d.get(this));
        sb3.append(", list=");
        sb3.append(this.f20217a);
        sb3.append(']');
        return sb3.toString();
    }
}
