package bw;

import android.content.Context;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;
import vn1.g;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f23961j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f23960i = i13;
        this.f23961j = dVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f23960i;
        d dVar = this.f23961j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                g gVar = dl2.b.T1(context) ? g.UI_100 : g.BODY_100;
                Context context2 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, null, null, null, e0.b(dl2.b.T1(context2) ? vn1.e.REGULAR : vn1.e.BOLD), gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097127);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = dVar.j().u3();
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, null, null, null, dVar.s(), null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097118);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = dVar.j().u3();
                Intrinsics.checkNotNullParameter(string2, "string");
                f0 f0Var = new f0(string2);
                int s13 = dVar.s();
                Context context3 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                g gVar2 = dl2.b.T1(context3) ? g.UI_100 : g.BODY_100;
                Context context4 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return rn1.a.y(it, f0Var, null, null, e0.b(dl2.b.T1(context4) ? vn1.e.REGULAR : vn1.e.BOLD), gVar2, s13, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097094);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string3 = dVar.j().t3();
                Intrinsics.checkNotNullParameter(string3, "string");
                f0 f0Var2 = new f0(string3);
                Context context5 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                g gVar3 = dl2.b.T1(context5) ? g.UI_100 : g.BODY_100;
                Context context6 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return rn1.a.y(it, f0Var2, null, null, e0.b(dl2.b.T1(context6) ? vn1.e.REGULAR : vn1.e.BOLD), gVar3, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23960i) {
        }
        return b((rn1.a) obj);
    }
}
