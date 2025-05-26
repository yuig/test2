package yq1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s1 f139961j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(s1 s1Var, int i13) {
        super(1);
        this.f139960i = i13;
        this.f139961j = s1Var;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f139960i;
        s1 s1Var = this.f139961j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = s1.I0;
                return rn1.a.y(it, bs1.c.h2(s1Var.o8(false)), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = s1.I0;
                return rn1.a.y(it, bs1.c.h2(s1Var.o8(false)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f139960i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                vl1.d it = (vl1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string = this.f139961j.getText(vq1.d.signup_google_not_linked_banner);
                Intrinsics.checkNotNullExpressionValue(string, "getText(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                u50.f0 bodyText = new u50.f0(string);
                fm1.c visibility = fm1.c.VISIBLE;
                u50.i0 i0Var = it.f126110a;
                Intrinsics.checkNotNullParameter(bodyText, "bodyText");
                vl1.l variant = it.f126114e;
                Intrinsics.checkNotNullParameter(variant, "variant");
                vl1.b style = it.f126115f;
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new vl1.d(i0Var, bodyText, it.f126112c, it.f126113d, variant, style, it.f126116g, visibility);
            default:
                return b((rn1.a) obj);
        }
    }
}
