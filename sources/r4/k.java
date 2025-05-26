package r4;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: h */
    public final /* synthetic */ l f106126h;

    public k(l lVar) {
        this.f106126h = lVar;
    }

    @Override // r4.h
    public final String h() {
        i iVar = (i) this.f106126h.f106127a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f106122a + "]";
    }
}
