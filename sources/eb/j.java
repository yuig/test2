package eb;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f58197a;

    /* renamed from: b, reason: collision with root package name */
    public final cb.b f58198b;

    /* renamed from: c, reason: collision with root package name */
    public final cb.b f58199c;

    public j(ClassLoader loader, cb.b consumerAdapter) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f58197a = loader;
        this.f58198b = consumerAdapter;
        this.f58199c = new cb.b(loader, 0);
    }

    public final WindowLayoutComponent a() {
        cb.b bVar = this.f58199c;
        bVar.getClass();
        int i13 = 0;
        cb.a classLoader = new cb.a(bVar, 0);
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        try {
            classLoader.invoke();
            if (!m0.W0(new cb.a(bVar, 1), "WindowExtensionsProvider#getWindowExtensions is not valid") || !m0.W0(new i(this, 3), "WindowExtensions#getWindowLayoutComponent is not valid") || !m0.W0(new i(this, i13), "FoldingFeature class is not valid")) {
                return null;
            }
            int a13 = db.f.a();
            if (a13 != 1) {
                int i14 = 2;
                if (2 > a13 || a13 > Integer.MAX_VALUE || !b()) {
                    return null;
                }
                if (!m0.W0(new i(this, i14), "WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid")) {
                    return null;
                }
            } else if (!b()) {
                return null;
            }
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (ClassNotFoundException | NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean b() {
        return m0.W0(new i(this, 1), "WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid");
    }
}
