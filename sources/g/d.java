package g;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f63164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f63165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f63166d;

    public d(Object obj, Serializable serializable, h.a aVar, int i13) {
        this.f63163a = i13;
        this.f63166d = obj;
        this.f63164b = serializable;
        this.f63165c = aVar;
    }

    @Override // g.b
    public final void a(Object obj) {
        int i13 = this.f63163a;
        h.a aVar = this.f63165c;
        Object obj2 = this.f63166d;
        Serializable serializable = this.f63164b;
        switch (i13) {
            case 0:
                g gVar = (g) obj2;
                String str = (String) serializable;
                Integer num = (Integer) gVar.f63172b.get(str);
                if (num != null) {
                    gVar.f63174d.add(str);
                    try {
                        ((g) obj2).c(num.intValue(), aVar, obj);
                        return;
                    } catch (Exception e13) {
                        gVar.f63174d.remove(str);
                        throw e13;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                g gVar2 = (g) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) gVar2.f63172b.get(str2);
                if (num2 != null) {
                    gVar2.f63174d.add(str2);
                    try {
                        ((g) obj2).c(num2.intValue(), aVar, obj);
                        return;
                    } catch (Exception e14) {
                        gVar2.f63174d.remove(str2);
                        throw e14;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                b bVar = (b) ((AtomicReference) serializable).get();
                if (bVar == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                bVar.a(obj);
                return;
        }
    }

    @Override // g.b
    public final void b() {
        int i13 = this.f63163a;
        Object obj = this.f63166d;
        Serializable serializable = this.f63164b;
        switch (i13) {
            case 0:
                ((g) obj).g((String) serializable);
                break;
            case 1:
                ((g) obj).g((String) serializable);
                break;
            default:
                b bVar = (b) ((AtomicReference) serializable).getAndSet(null);
                if (bVar != null) {
                    bVar.b();
                    break;
                }
                break;
        }
    }
}
