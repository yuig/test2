package vi2;

import java.util.logging.Logger;

/* loaded from: classes4.dex */
public enum m implements c {
    INSTANCE;

    private static final Logger logger = Logger.getLogger(m.class.getName());
    private static final ThreadLocal<b> THREAD_LOCAL_STORAGE = new ThreadLocal<>();

    public h attach(b bVar) {
        b current;
        if (bVar != null && bVar != (current = current())) {
            THREAD_LOCAL_STORAGE.set(bVar);
            return new l(this, current, bVar);
        }
        return k.INSTANCE;
    }

    @Override // vi2.c
    public b current() {
        return THREAD_LOCAL_STORAGE.get();
    }

    @Override // vi2.c
    public /* bridge */ /* synthetic */ b root() {
        return a.f125874b;
    }
}
