package eh0;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk.a0;
import u50.f0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58923i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f58924j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f58925k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, i iVar) {
        super(1);
        this.f58925k = view;
        this.f58924j = iVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f58923i;
        View view = this.f58925k;
        i iVar = this.f58924j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                vn1.g o03 = a0.o0(context);
                jf2.c cVar = iVar.f58931f0;
                if (cVar != null) {
                    return rn1.a.y(it, bs1.c.h2((String) cVar.f75872a), null, null, null, o03, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
                }
                Intrinsics.r("rendering");
                throw null;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                jf2.c cVar2 = iVar.f58931f0;
                if (cVar2 == null) {
                    Intrinsics.r("rendering");
                    throw null;
                }
                f0 h23 = bs1.c.h2((String) cVar2.f75873b);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, h23, null, null, null, a0.u(context2), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58923i) {
        }
        return b((rn1.a) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, View view) {
        super(1);
        this.f58924j = iVar;
        this.f58925k = view;
    }
}
