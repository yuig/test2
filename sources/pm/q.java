package pm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class q extends s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f100624b;

    public q(Method method) {
        this.f100624b = method;
    }

    @Override // pm.s
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f100624b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e13) {
            throw new RuntimeException("Failed invoking canAccess", e13);
        }
    }
}
