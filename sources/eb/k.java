package eb;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f58200i = new k(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent component;
        try {
            ClassLoader loader = m.class.getClassLoader();
            j jVar = loader != null ? new j(loader, new cb.b(loader, 1)) : null;
            if (jVar == null || (component = jVar.a()) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(loader, "loader");
            cb.b adapter = new cb.b(loader, 1);
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            int a13 = db.f.a();
            return a13 >= 2 ? new gb.d(component) : a13 == 1 ? new gb.c(component, adapter) : new gb.a();
        } catch (Throwable unused) {
            l lVar = l.f58201a;
            return null;
        }
    }
}
