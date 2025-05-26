package wc2;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f129113r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f129114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f129115t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f129115t = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f129115t, cVar);
        cVar2.f129114s = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        f fVar;
        Unit unit;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f129113r;
        if (i13 == 0) {
            ue.c.H(obj);
            f fVar2 = (f) this.f129114s;
            this.f129114s = fVar2;
            this.f129113r = 1;
            if (l0.S(100L, this) == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) this.f129114s;
            ue.c.H(obj);
        }
        e eVar = this.f129115t;
        eVar.f129130o.bindDisplayState(fVar.f129135c);
        WebView webView = eVar.f129131p;
        webView.setInitialScale((int) ((webView.getWidth() / fVar.f129134b) * 100));
        String str = fVar.f129133a;
        if (str != null) {
            webView.loadData(str, "text/html", "UTF-8");
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eVar.f129132q.setVisibility(8);
        }
        return Unit.f80348a;
    }
}
