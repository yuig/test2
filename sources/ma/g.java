package ma;

import android.os.Bundle;
import androidx.lifecycle.l;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b */
    public boolean f86754b;

    /* renamed from: c */
    public Bundle f86755c;

    /* renamed from: d */
    public boolean f86756d;

    /* renamed from: e */
    public b f86757e;

    /* renamed from: a */
    public final p.g f86753a = new p.g();

    /* renamed from: f */
    public boolean f86758f = true;

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f86756d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f86755c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f86755c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f86755c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f86755c = null;
        }
        return bundle2;
    }

    public final f b() {
        String str;
        f fVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.f86753a.iterator();
        do {
            p.e eVar = (p.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) eVar.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            str = (String) components.getKey();
            fVar = (f) components.getValue();
        } while (!Intrinsics.d(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return fVar;
    }

    public final void c(String key, f provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((f) this.f86753a.c(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(l.class, "clazz");
        if (!this.f86758f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        b bVar = this.f86757e;
        if (bVar == null) {
            bVar = new b(this);
        }
        this.f86757e = bVar;
        try {
            l.class.getDeclaredConstructor(new Class[0]);
            b bVar2 = this.f86757e;
            if (bVar2 != null) {
                String name = l.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e13) {
            throw new IllegalArgumentException("Class " + l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e13);
        }
    }
}
