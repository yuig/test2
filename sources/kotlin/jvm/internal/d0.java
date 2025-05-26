package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class d0 extends c0 {
    public d0(rl2.f fVar, String str, String str2) {
        super(e.NO_RECEIVER, ((g) fVar).c(), str, str2, !(fVar instanceof rl2.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return ((ul2.t) getGetter()).call(obj);
    }

    public d0(Class cls, String str, String str2, int i13) {
        super(e.NO_RECEIVER, cls, str, str2, i13);
    }
}
