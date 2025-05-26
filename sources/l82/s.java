package l82;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class s implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f82253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f82254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f82255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f82256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f82257e;

    public s(Function1 function1, g gVar, y yVar, String str, Function1 function12) {
        this.f82253a = function1;
        this.f82254b = gVar;
        this.f82255c = yVar;
        this.f82256d = str;
        this.f82257e = function12;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        h hVar = (h) this.f82253a.invoke((h) obj);
        if (hVar != null) {
            g gVar = this.f82254b;
            Object M = kotlin.jvm.internal.j.M(cVar, gVar.f(hVar), new r(gVar, this.f82255c, hVar, this.f82256d, this.f82257e, null));
            if (M == cl2.a.COROUTINE_SUSPENDED) {
                return M;
            }
        }
        return Unit.f80348a;
    }
}
