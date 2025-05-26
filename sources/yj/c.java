package yj;

import android.graphics.Typeface;
import me.o;

/* loaded from: classes.dex */
public final class c extends ue.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f139185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f139186b;

    public c(e eVar, o oVar) {
        this.f139186b = eVar;
        this.f139185a = oVar;
    }

    @Override // ue.c
    public final void C(int i13) {
        this.f139186b.f139203m = true;
        this.f139185a.d(i13);
    }

    @Override // ue.c
    public final void D(Typeface typeface) {
        e eVar = this.f139186b;
        eVar.f139204n = Typeface.create(typeface, eVar.f139193c);
        eVar.f139203m = true;
        this.f139185a.e(eVar.f139204n, false);
    }
}
