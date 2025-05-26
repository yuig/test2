package pm;

import com.google.gson.reflect.TypeToken;
import nm.i0;

/* loaded from: classes3.dex */
public final class g extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile i0 f100585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f100586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f100587c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.o f100588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TypeToken f100589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f100590f;

    public g(h hVar, boolean z13, boolean z14, nm.o oVar, TypeToken typeToken) {
        this.f100590f = hVar;
        this.f100586b = z13;
        this.f100587c = z14;
        this.f100588d = oVar;
        this.f100589e = typeToken;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (this.f100586b) {
            aVar.E();
            return null;
        }
        i0 i0Var = this.f100585a;
        if (i0Var == null) {
            i0Var = this.f100588d.i(this.f100590f, this.f100589e);
            this.f100585a = i0Var;
        }
        return i0Var.c(aVar);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (this.f100587c) {
            cVar.m();
            return;
        }
        i0 i0Var = this.f100585a;
        if (i0Var == null) {
            i0Var = this.f100588d.i(this.f100590f, this.f100589e);
            this.f100585a = i0Var;
        }
        i0Var.e(cVar, obj);
    }
}
