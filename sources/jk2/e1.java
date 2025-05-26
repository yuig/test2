package jk2;

/* loaded from: classes4.dex */
public final class e1 implements ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76445a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.c f76446b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76447c;

    public /* synthetic */ e1(ak2.c cVar, Object obj, int i13) {
        this.f76445a = i13;
        this.f76446b = cVar;
        this.f76447c = obj;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        int i13 = this.f76445a;
        ak2.c cVar = this.f76446b;
        Object obj2 = this.f76447c;
        switch (i13) {
            case 0:
                return cVar.apply(obj2, obj);
            default:
                Object apply = ((ak2.f) obj2).apply(obj);
                ck2.i.b(apply, "The mapper returned a null ObservableSource");
                return new j1((uj2.t) apply, new e1(cVar, obj, 0), 0);
        }
    }
}
