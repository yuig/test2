package t3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g1 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f116003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3.d f116004b;

    public g1(Configuration configuration, x3.d dVar) {
        this.f116003a = configuration;
        this.f116004b = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f116003a;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f116004b.f131603a.entrySet().iterator();
        while (it.hasNext()) {
            x3.b bVar = (x3.b) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (bVar == null || Configuration.needNewResources(updateFrom, bVar.f131600b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f116004b.f131603a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        this.f116004b.f131603a.clear();
    }
}
