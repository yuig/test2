package ho2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final fi.b f69743a = new fi.b("CLOSED", 4);

    public static final Object a(v vVar, long j13, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f69789c >= j13 && !vVar.e()) {
                return vVar;
            }
            Object obj = b.f69748a.get(vVar);
            fi.b bVar = f69743a;
            if (obj == bVar) {
                return bVar;
            }
            v vVar2 = (v) ((b) obj);
            if (vVar2 == null) {
                vVar2 = (v) function2.invoke(Long.valueOf(vVar.f69789c + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = b.f69748a;
                    if (atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                        if (vVar.e()) {
                            vVar.g();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(vVar) == null);
            }
            vVar = vVar2;
        }
    }
}
