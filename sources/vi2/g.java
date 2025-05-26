package vi2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f125878a = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final c f125879b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [vi2.c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [vi2.j] */
    static {
        m mVar;
        ArrayList arrayList;
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if ("default".equals(property)) {
            mVar = m.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(d.class).iterator();
            if (it.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
            if (arrayList2.isEmpty()) {
                mVar = m.INSTANCE;
            } else if (!property.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                    throw null;
                }
                atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                mVar = m.INSTANCE;
            } else {
                if (arrayList2.size() == 1) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList2.get(0));
                    throw null;
                }
                atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                mVar = m.INSTANCE;
            }
        }
        m mVar2 = mVar;
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            mVar2 = new j(mVar);
        }
        synchronized (e.f125877b) {
            arrayList = e.f125876a;
        }
        Iterator it3 = arrayList.iterator();
        m mVar3 = mVar2;
        while (it3.hasNext()) {
            mVar3 = (c) ((Function) it3.next()).apply(mVar3);
        }
        f125879b = mVar3;
        synchronized (e.f125877b) {
        }
        Throwable th3 = (Throwable) atomicReference.get();
        if (th3 != null) {
            f125878a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th3);
        }
    }
}
