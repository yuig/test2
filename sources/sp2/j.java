package sp2;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f114930d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public Object f114931a;

    /* renamed from: b, reason: collision with root package name */
    public p f114932b;

    /* renamed from: c, reason: collision with root package name */
    public j f114933c;

    public static j a(Object obj, p pVar) {
        ArrayList arrayList = f114930d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    j jVar = new j();
                    jVar.f114931a = obj;
                    jVar.f114932b = pVar;
                    return jVar;
                }
                j jVar2 = (j) arrayList.remove(size - 1);
                jVar2.f114931a = obj;
                jVar2.f114932b = pVar;
                jVar2.f114933c = null;
                return jVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
