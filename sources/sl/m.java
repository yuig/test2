package sl;

/* loaded from: classes.dex */
public final class m implements cm.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f113156c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f113157a = f113156c;

    /* renamed from: b, reason: collision with root package name */
    public volatile cm.a f113158b;

    public m(cm.a aVar) {
        this.f113158b = aVar;
    }

    @Override // cm.a
    public final Object get() {
        Object obj = this.f113157a;
        Object obj2 = f113156c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f113157a;
                    if (obj == obj2) {
                        obj = this.f113158b.get();
                        this.f113157a = obj;
                        this.f113158b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
