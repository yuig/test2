package qz;

import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105443i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f105444j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(String str, int i13) {
        super(1);
        this.f105443i = i13;
        this.f105444j = str;
    }

    public final void b(qm2.o function) {
        int i13 = this.f105443i;
        String str = this.f105444j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar = qm2.i.f104425b;
                function.a(str, cVar, cVar);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(str, qm2.i.f104425b);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar2 = qm2.i.f104425b;
                function.a(str, cVar2);
                function.a(str, cVar2);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar3 = qm2.i.f104425b;
                function.a(str, cVar3);
                function.c(str, cVar3);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar4 = qm2.i.f104425b;
                function.a(str, cVar4);
                function.a(str, cVar4);
                function.c(str, cVar4);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(str, qm2.i.f104425b);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar5 = qm2.i.f104425b;
                function.a(str, cVar5, cVar5);
                function.b(gn2.c.BOOLEAN);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar6 = qm2.i.f104425b;
                function.c(str, cVar6, cVar6);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar7 = qm2.i.f104425b;
                function.c(str, cVar7, cVar7);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar8 = qm2.i.f104425b;
                function.a(str, cVar8, cVar8);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar9 = qm2.i.f104425b;
                function.a(str, cVar9, cVar9, cVar9);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar10 = qm2.i.f104425b;
                function.a(str, cVar10);
                function.a(str, cVar10);
                function.c(str, qm2.i.f104424a);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar11 = qm2.i.f104425b;
                function.a(str, cVar11);
                function.a(str, cVar11);
                function.c(str, qm2.i.f104424a);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar12 = qm2.i.f104425b;
                function.a(str, cVar12);
                function.a(str, cVar12);
                function.a(str, cVar12);
                function.b(gn2.c.BOOLEAN);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar13 = qm2.i.f104425b;
                function.a(str, cVar13, cVar13, cVar13, cVar13);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(str, qm2.i.f104425b, qm2.i.f104426c);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(str, qm2.i.f104426c);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(str, qm2.i.f104425b, qm2.i.f104426c);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c(str, qm2.i.f104424a);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a(str, qm2.i.f104425b);
                function.b(gn2.c.BOOLEAN);
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "$this$function");
                qm2.c cVar14 = qm2.i.f104425b;
                function.a(str, cVar14);
                function.a(str, cVar14);
                function.b(gn2.c.BOOLEAN);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f105443i;
        String str = this.f105444j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                WebImageView view = (WebImageView) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                if (!Intrinsics.d(view.f52563o, str)) {
                    view.w1();
                    view.V1(this.f105444j, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                }
                break;
            case 2:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 3:
                RecaptchaResultData it3 = (RecaptchaResultData) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                nm.u uVar = new nm.u();
                uVar.u("token", it3.f32073f);
                uVar.u("site_key", str);
                break;
            case 4:
                b((qm2.o) obj);
                break;
            case 5:
                b((qm2.o) obj);
                break;
            case 6:
                b((qm2.o) obj);
                break;
            case 7:
                b((qm2.o) obj);
                break;
            case 8:
                b((qm2.o) obj);
                break;
            case 9:
                b((qm2.o) obj);
                break;
            case 10:
                b((qm2.o) obj);
                break;
            case 11:
                b((qm2.o) obj);
                break;
            case 12:
                b((qm2.o) obj);
                break;
            case 13:
                b((qm2.o) obj);
                break;
            case 14:
                b((qm2.o) obj);
                break;
            case 15:
                b((qm2.o) obj);
                break;
            case 16:
                b((qm2.o) obj);
                break;
            case 17:
                b((qm2.o) obj);
                break;
            case 18:
                b((qm2.o) obj);
                break;
            case 19:
                b((qm2.o) obj);
                break;
            case 20:
                b((qm2.o) obj);
                break;
            case 21:
                b((qm2.o) obj);
                break;
            case 22:
                b((qm2.o) obj);
                break;
            case 23:
                b((qm2.o) obj);
                break;
            default:
                b((qm2.o) obj);
                break;
        }
        return Unit.f80348a;
    }
}
