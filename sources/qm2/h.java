package qm2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f104422j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f104423k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, String str2, int i13) {
        super(1);
        this.f104421i = i13;
        this.f104422j = str;
        this.f104423k = str2;
    }

    public final void b(o function) {
        int i13 = this.f104421i;
        String str = this.f104423k;
        String str2 = this.f104422j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                c cVar = i.f104425b;
                function.a(str2, cVar);
                c cVar2 = i.f104424a;
                function.a(str, cVar, cVar, cVar2, cVar2);
                function.c(str2, cVar2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                c cVar3 = i.f104425b;
                function.a(str2, cVar3);
                function.a(str, cVar3, cVar3, cVar3);
                function.c(str2, cVar3);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                c cVar4 = i.f104425b;
                function.a(str2, cVar4);
                c cVar5 = i.f104426c;
                c cVar6 = i.f104424a;
                function.a(str, cVar4, cVar4, cVar5, cVar6);
                function.c(str2, cVar6);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                c cVar7 = i.f104425b;
                function.a(str2, cVar7);
                c cVar8 = i.f104426c;
                function.a(str2, cVar8);
                c cVar9 = i.f104424a;
                function.a(str, cVar7, cVar8, cVar8, cVar9);
                function.c(str2, cVar9);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                c cVar10 = i.f104426c;
                function.a(str2, cVar10);
                function.c(str, i.f104425b, cVar10);
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(str2, i.f104424a);
                function.c(str, i.f104425b, i.f104426c);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f104421i) {
            case 0:
                b((o) obj);
                break;
            case 1:
                b((o) obj);
                break;
            case 2:
                b((o) obj);
                break;
            case 3:
                b((o) obj);
                break;
            case 4:
                b((o) obj);
                break;
            default:
                b((o) obj);
                break;
        }
        return Unit.f80348a;
    }
}
