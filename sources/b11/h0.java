package b11;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import m60.x0;
import x02.a2;
import x02.i2;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20995i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f20996j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f20997k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f20998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, f30 f30Var, boolean z13, int i13) {
        super(1);
        this.f20995i = i13;
        this.f20996j = j0Var;
        this.f20997k = f30Var;
        this.f20998l = z13;
    }

    public final void b(String count) {
        String string;
        int i13 = this.f20995i;
        boolean z13 = this.f20998l;
        j0 j0Var = this.f20996j;
        f30 f30Var = this.f20997k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(count, "formattedNumber");
                String contentDescription = j0Var.getResources().getQuantityString(w0.content_description_story_pin_comment_and_count, b40.f0(f30Var), Integer.valueOf(b40.f0(f30Var)));
                Intrinsics.checkNotNullExpressionValue(contentDescription, "getQuantityString(...)");
                Intrinsics.checkNotNullParameter(count, "count");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                j0Var.f21031i.setContentDescription(contentDescription);
                GestaltText gestaltText = j0Var.f21033k;
                gestaltText.setText(count);
                if (count.length() <= 0 || !z13) {
                    bs1.c.X0(gestaltText);
                    return;
                } else {
                    bs1.c.U1(gestaltText);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(count, "count");
                String pinId = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                String contentDescription2 = j0Var.getResources().getQuantityString(w0.content_description_story_pin_react_and_count, b40.e0(f30Var), Integer.valueOf(b40.e0(f30Var)));
                Intrinsics.checkNotNullExpressionValue(contentDescription2, "getQuantityString(...)");
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                Intrinsics.checkNotNullParameter(count, "count");
                Intrinsics.checkNotNullParameter(contentDescription2, "contentDescription");
                v32.c cVar = j0Var.f21047y;
                if (cVar == v32.c.NONE || cVar == null) {
                    string = j0Var.getResources().getString(x0.not_liked);
                    Intrinsics.f(string);
                } else {
                    string = j0Var.getResources().getString(x0.liked);
                    Intrinsics.f(string);
                }
                j0Var.f21027e.setContentDescription(a.a.D(contentDescription2, ", ", string));
                GestaltText gestaltText2 = j0Var.f21030h;
                gestaltText2.setText(count);
                if (count.length() <= 0 || !z13) {
                    bs1.c.X0(gestaltText2);
                } else {
                    bs1.c.U1(gestaltText2);
                }
                if (Intrinsics.d(j0Var.f21043u, pinId)) {
                    return;
                }
                j0Var.f21043u = pinId;
                j0.T(j0Var.f21048z);
                i2 i2Var = j0Var.N;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                uj2.q P = i2Var.P(pinId);
                a11.f fVar = new a11.f(17, new i0(j0Var, 0));
                a11.f fVar2 = new a11.f(18, i.f21016z);
                ck2.c cVar2 = ck2.i.f27923c;
                a2 a2Var = ck2.i.f27924d;
                j0Var.f21048z = (ek2.j) P.F(fVar, fVar2, cVar2, a2Var);
                j0.T(j0Var.A);
                i2 i2Var2 = j0Var.N;
                if (i2Var2 == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                j0Var.A = (ek2.j) new jk2.x(i2Var2.D(), new d51.a(3, new i0(j0Var, 1)), 2).F(new a11.f(19, new i0(j0Var, 2)), new a11.f(20, i.A), cVar2, a2Var);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f20995i) {
            case 0:
                b((String) obj);
                break;
            default:
                b((String) obj);
                break;
        }
        return Unit.f80348a;
    }
}
