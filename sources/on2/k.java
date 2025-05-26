package on2;

/* loaded from: classes2.dex */
public abstract class k extends j {

    /* renamed from: d, reason: collision with root package name */
    public volatile qq2.c f96778d;

    @Override // on2.j
    public final void e(Object obj) {
        this.f96778d = new qq2.c(obj);
        try {
            e eVar = (e) this;
            if (obj != null) {
                eVar.f96772f.invoke(obj);
            } else {
                e.b(2);
                throw null;
            }
        } finally {
            this.f96778d = null;
        }
    }

    @Override // on2.j, kotlin.jvm.functions.Function0
    public Object invoke() {
        qq2.c cVar = this.f96778d;
        if (cVar == null || ((Thread) cVar.f104884c) != Thread.currentThread()) {
            return super.invoke();
        }
        if (((Thread) cVar.f104884c) == Thread.currentThread()) {
            return cVar.f104883b;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
