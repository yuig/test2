package pm0;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f100638r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f100639s;

    /* renamed from: t, reason: collision with root package name */
    public int f100640t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, bl2.c cVar) {
        super(cVar);
        this.f100639s = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f100638r = obj;
        this.f100640t |= Integer.MIN_VALUE;
        return this.f100639s.m(null, null, this);
    }
}
