package qh1;

import android.text.Editable;
import kl2.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import oh1.k;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103889i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f103890j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f103891k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Editable f103892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f103893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Editable editable, e eVar, d0 d0Var, k kVar) {
        super(1);
        this.f103889i = 2;
        this.f103892l = editable;
        this.f103890j = eVar;
        this.f103891k = d0Var;
        this.f103893m = kVar;
    }

    public final void b(Throwable throwable) {
        e eVar = this.f103890j;
        d0 d0Var = this.f103891k;
        p pVar = this.f103893m;
        int i13 = this.f103889i;
        Editable editable = this.f103892l;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                e.m(editable, d0Var, eVar, throwable, pVar);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                e.m(editable, d0Var, eVar, throwable, pVar);
                break;
            case 2:
                if (editable != null) {
                    Intrinsics.f(throwable);
                    eVar.i(editable, d0Var, null, null, null, null, throwable, pVar);
                    break;
                }
                break;
            default:
                Intrinsics.f(throwable);
                Intrinsics.f(editable);
                eVar.i(editable, d0Var, null, null, null, null, throwable, pVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f103889i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, d0 d0Var, Editable editable, k kVar, int i13) {
        super(1);
        this.f103889i = i13;
        this.f103890j = eVar;
        this.f103891k = d0Var;
        this.f103892l = editable;
        this.f103893m = kVar;
    }
}
