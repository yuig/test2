package b2;

/* loaded from: classes2.dex */
public final class o0 implements e0 {

    /* renamed from: a */
    public final boolean f21191a;

    /* renamed from: b */
    public final o f21192b;

    /* renamed from: c */
    public final m f21193c;

    public o0(boolean z13, o oVar, m mVar) {
        this.f21191a = z13;
        this.f21192b = oVar;
        this.f21193c = mVar;
    }

    public final i a() {
        m mVar = this.f21193c;
        int i13 = mVar.f21175a;
        int i14 = mVar.f21176b;
        return i13 < i14 ? i.NOT_CROSSED : i13 > i14 ? i.CROSSED : i.COLLAPSED;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f21191a + ", crossed=" + a() + ", info=\n\t" + this.f21193c + ')';
    }
}
