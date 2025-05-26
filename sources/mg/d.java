package mg;

import android.content.Context;
import rg.j;

/* loaded from: classes.dex */
public final class d implements ng.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87139a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f87140b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f87141c;

    /* renamed from: d, reason: collision with root package name */
    public final wk2.a f87142d;

    public /* synthetic */ d(wk2.a aVar, lg.g gVar, lg.g gVar2, int i13) {
        this.f87139a = i13;
        this.f87140b = aVar;
        this.f87141c = gVar;
        this.f87142d = gVar2;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f87139a;
        wk2.a aVar = this.f87142d;
        wk2.a aVar2 = this.f87141c;
        wk2.a aVar3 = this.f87140b;
        switch (i13) {
            case 0:
                return new c((Context) aVar3.get(), (tg.a) aVar2.get(), (tg.a) aVar.get());
            default:
                return new j(((Integer) aVar.get()).intValue(), (Context) aVar3.get(), (String) aVar2.get());
        }
    }
}
