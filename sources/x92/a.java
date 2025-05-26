package x92;

import ja.i;

/* loaded from: classes4.dex */
public final class a extends i {
    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        return "INSERT OR ABORT INTO `SearchTypeaheadSuggestionRoom` (`id`,`suggestion`,`score`) VALUES (nullif(?, 0),?,?)";
    }

    @Override // ja.i
    public final void l(oa.i iVar, Object obj) {
        d dVar = (d) obj;
        iVar.u1(1, dVar.a());
        iVar.c1(2, dVar.g());
        iVar.N(3, dVar.e());
    }
}
