package vi2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes4.dex */
public final class j implements c, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f125882c = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final c f125883a;

    /* renamed from: b, reason: collision with root package name */
    public final i f125884b = new i(new ConcurrentHashMap());

    public j(m mVar) {
        this.f125883a = mVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i iVar;
        while (true) {
            iVar = this.f125884b;
            Reference poll = iVar.poll();
            if (poll == null) {
                break;
            } else {
                iVar.f130016a.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = iVar.f125881c;
        List list = (List) concurrentHashMap.values().stream().filter(new dg.b(2)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            f125882c.log(Level.SEVERE, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(list.get(0));
        throw null;
    }

    @Override // vi2.c
    public final b current() {
        return this.f125883a.current();
    }
}
