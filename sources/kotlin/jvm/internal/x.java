package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class x extends w {
    public x(rl2.d dVar, String str, String str2) {
        super(e.NO_RECEIVER, ((g) dVar).c(), str, str2, !(dVar instanceof rl2.d) ? 1 : 0);
    }

    @Override // rl2.t
    public final Object get(Object obj) {
        return ((ul2.t) getGetter()).call(obj);
    }

    public x(Class cls, String str, String str2, int i13) {
        super(e.NO_RECEIVER, cls, str, str2, i13);
    }
}
