package cn1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28239i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltStaticSearchBar f28240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(GestaltStaticSearchBar gestaltStaticSearchBar, int i13) {
        super(1);
        this.f28239i = i13;
        this.f28240j = gestaltStaticSearchBar;
    }

    public final void b(om1.q bind) {
        int i13 = this.f28239i;
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f28240j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Context context = gestaltStaticSearchBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bind.d(dn1.c.values()[dl2.b.O0(context, eo1.a.comp_searchfield_inner_trailing_iconbutton_style)].getValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Context context2 = gestaltStaticSearchBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                bind.d(dn1.c.values()[dl2.b.O0(context2, eo1.a.comp_searchfield_inner_trailing_iconbutton_style)].getValue());
                break;
        }
    }

    public final void e(rn1.k bind) {
        int i13 = this.f28239i;
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f28240j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(!Intrinsics.d(gestaltStaticSearchBar.t0().f28241a, u50.h0.f120562a) ? GestaltStaticSearchBar.f49525q : GestaltStaticSearchBar.f49526r);
                bind.f108895j = gestaltStaticSearchBar.G0(gestaltStaticSearchBar.t0().f28243c, false);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(GestaltStaticSearchBar.f49525q);
                bind.f108895j = gestaltStaticSearchBar.G0(gestaltStaticSearchBar.t0().f28243c, true);
                break;
        }
    }

    public final void f(u50.i0 it) {
        int i13 = this.f28239i;
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f28240j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = gestaltStaticSearchBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltStaticSearchBar.o0(it.a(context).toString(), vn1.c.SUBTLE, null);
                if (gestaltStaticSearchBar.f49541o != null && gestaltStaticSearchBar.t0().f28249i == dn1.e.DEFAULT) {
                    gestaltStaticSearchBar.X();
                    ConstraintLayout constraintLayout = gestaltStaticSearchBar.f49540n;
                    if (constraintLayout != null) {
                        androidx.constraintlayout.widget.p pVar = gestaltStaticSearchBar.f49531e;
                        pVar.j(gestaltStaticSearchBar);
                        gestaltStaticSearchBar.L(constraintLayout.getId());
                        pVar.b(gestaltStaticSearchBar);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context2 = gestaltStaticSearchBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                String obj = it.a(context2).toString();
                if (gestaltStaticSearchBar.f49542p == null && obj.length() > 0) {
                    Context context3 = gestaltStaticSearchBar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                    pp2.a.k(gestaltText, a.H);
                    gestaltText.setLayoutParams(new ConstraintLayout.LayoutParams(0, -2));
                    gestaltStaticSearchBar.addView(gestaltText);
                    gestaltStaticSearchBar.f49542p = gestaltText;
                }
                GestaltText gestaltText2 = gestaltStaticSearchBar.f49542p;
                if (gestaltText2 != null) {
                    gestaltStaticSearchBar.Z(gestaltText2.i(new xm1.k(5, obj, gestaltStaticSearchBar)));
                }
                if (gestaltStaticSearchBar.f49542p != null && gestaltStaticSearchBar.t0().f28249i == dn1.e.DEFAULT) {
                    gestaltStaticSearchBar.X();
                    ConstraintLayout constraintLayout2 = gestaltStaticSearchBar.f49540n;
                    if (constraintLayout2 != null) {
                        androidx.constraintlayout.widget.p pVar2 = gestaltStaticSearchBar.f49531e;
                        pVar2.j(gestaltStaticSearchBar);
                        gestaltStaticSearchBar.T(constraintLayout2.getId());
                        pVar2.b(gestaltStaticSearchBar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar;
        String string;
        int i13 = this.f28239i;
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f28240j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                vn1.c cVar = GestaltStaticSearchBar.f49525q;
                gestaltStaticSearchBar.getClass();
                u50.i0 c13 = u50.g0.c($receiver, j0.GestaltSearchField_android_text);
                u50.i0 c14 = u50.g0.c($receiver, j0.GestaltSearchField_android_hint);
                rm1.q b13 = rm1.r.b($receiver, j0.GestaltSearchField_gestalt_searchfieldLeadingIcon);
                if (b13 == null) {
                    b13 = GestaltSearchField.f49500u;
                }
                rm1.q qVar = b13;
                rm1.q b14 = rm1.r.b($receiver, j0.GestaltSearchField_gestalt_searchfieldTrailingIcon);
                f fVar2 = null;
                if (b14 != null) {
                    String string2 = $receiver.getString(j0.GestaltSearchField_gestalt_searchfieldTrailingIconContDesc);
                    fVar = string2 != null ? new f(u50.g0.a(string2), b14) : null;
                } else {
                    fVar = null;
                }
                rm1.q b15 = rm1.r.b($receiver, j0.GestaltSearchField_gestalt_searchfieldLeftTrailingIcon);
                if (b15 != null && (string = $receiver.getString(j0.GestaltSearchField_gestalt_searchfieldLeftTrailingIconContDesc)) != null) {
                    fVar2 = new f(u50.g0.a(string), b15);
                }
                f fVar3 = fVar2;
                int i14 = j0.GestaltSearchField_gestalt_searchfieldStyle;
                dn1.d dVar = GestaltSearchField.B;
                int i15 = $receiver.getInt(i14, -1);
                dn1.d dVar2 = i15 >= 0 ? dn1.d.values()[i15] : dVar;
                int id3 = gestaltStaticSearchBar.getId();
                fm1.c Y = d7.b.Y($receiver, j0.GestaltSearchField_android_visibility, fm1.c.VISIBLE);
                int i16 = j0.GestaltSearchField_gestalt_searchfieldVariant;
                dn1.e eVar = GestaltSearchField.f49502w;
                int i17 = $receiver.getInt(i16, -1);
                break;
            case 1:
                e((rn1.k) obj);
                break;
            case 2:
                b((om1.q) obj);
                break;
            case 3:
                b((om1.q) obj);
                break;
            case 4:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar2 = GestaltStaticSearchBar.f49525q;
                gestaltStaticSearchBar.z0().j(new gh1.e(gestaltStaticSearchBar, 7));
                GestaltIconButton gestaltIconButton = gestaltStaticSearchBar.f49536j;
                if (gestaltIconButton != null) {
                    gestaltIconButton.u(it);
                }
                GestaltButton gestaltButton = gestaltStaticSearchBar.f49537k;
                if (gestaltButton != null) {
                    gestaltButton.e(it);
                }
                GestaltIconButton gestaltIconButton2 = gestaltStaticSearchBar.f49538l;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.u(it);
                }
                GestaltIconButton gestaltIconButton3 = gestaltStaticSearchBar.f49539m;
                if (gestaltIconButton3 != null) {
                    gestaltIconButton3.u(it);
                }
                break;
            case 5:
                e((rn1.k) obj);
                break;
            case 6:
                f((u50.i0) obj);
                break;
            default:
                f((u50.i0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
