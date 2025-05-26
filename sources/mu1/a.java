package mu1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.m;
import com.pinterest.navigation.factory.UnregisteredFragmentException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import pk.h1;
import tb0.h;

/* loaded from: classes2.dex */
public final class a extends il1.a {

    /* renamed from: b, reason: collision with root package name */
    public final Map f88317b;

    /* renamed from: c, reason: collision with root package name */
    public final h f88318c;

    public a(h crashReporting, h1 fragmentsMap) {
        Intrinsics.checkNotNullParameter(fragmentsMap, "fragmentsMap");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f88317b = fragmentsMap;
        this.f88318c = crashReporting;
    }

    @Override // androidx.fragment.app.f0
    public final Fragment a(ClassLoader classLoader, String className) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        String p13 = a.a.p(new StringBuilder("Instantiating "), className, " via androidx FragmentFactory");
        h hVar = this.f88318c;
        hVar.h(p13);
        Class d2 = f0.d(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(d2, "loadFragmentClass(...)");
        if (m.class.isAssignableFrom(d2)) {
            return (Fragment) f(d2);
        }
        Object newInstance = d2.newInstance();
        hVar.h("Instantiating non-Pinterest fragment " + ((Fragment) newInstance));
        Intrinsics.f(newInstance);
        return (Fragment) newInstance;
    }

    @Override // il1.a
    public final m e(ScreenLocation screenLocation) {
        Intrinsics.checkNotNullParameter(screenLocation, "screenLocation");
        return f(screenLocation.getF35454a());
    }

    public final m f(Class cls) {
        Map map = this.f88317b;
        if (map.containsKey(cls)) {
            k0.f80436a.b(a.class).f();
            cls.getClass();
        } else {
            String k13 = a.a.k("Fragment ", cls.getSimpleName(), " is missing from the FragmentMap");
            k0.f80436a.b(a.class).f();
            this.f88318c.h(k13);
        }
        wk2.a aVar = (wk2.a) map.get(cls);
        m mVar = aVar != null ? (m) aVar.get() : null;
        if (mVar != null) {
            return mVar;
        }
        throw new UnregisteredFragmentException(cls.getSimpleName().concat(" not registered with FragmentFactory, makes sure its is added in [FragmentMultiBindModule]"));
    }
}
