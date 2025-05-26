package pg;

import android.content.Context;
import java.util.concurrent.Executor;
import qg.h;
import qg.i;

/* loaded from: classes.dex */
public final class d implements ng.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100043a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f100044b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f100045c;

    /* renamed from: d, reason: collision with root package name */
    public final wk2.a f100046d;

    /* renamed from: e, reason: collision with root package name */
    public final wk2.a f100047e;

    public /* synthetic */ d(wk2.a aVar, wk2.a aVar2, ng.b bVar, wk2.a aVar3, int i13) {
        this.f100043a = i13;
        this.f100044b = aVar;
        this.f100045c = aVar2;
        this.f100046d = bVar;
        this.f100047e = aVar3;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f100043a;
        wk2.a aVar = this.f100047e;
        wk2.a aVar2 = this.f100046d;
        wk2.a aVar3 = this.f100045c;
        wk2.a aVar4 = this.f100044b;
        switch (i13) {
            case 0:
                Context context = (Context) aVar4.get();
                rg.d dVar = (rg.d) aVar3.get();
                qg.a aVar5 = (qg.a) aVar2.get();
                return new qg.c(context, dVar, aVar5);
            default:
                return new h((Executor) aVar4.get(), (rg.d) aVar3.get(), (i) aVar2.get(), (sg.b) aVar.get());
        }
    }
}
