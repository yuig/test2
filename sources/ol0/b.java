package ol0;

import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.text.DescriptionEditView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f96351b;

    public /* synthetic */ b(f fVar, int i13) {
        this.f96350a = i13;
        this.f96351b = fVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        ll0.f fVar;
        ll0.f fVar2;
        int i13 = this.f96350a;
        f this$0 = this.f96351b;
        switch (i13) {
            case 0:
                int i14 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof om1.l) || (fVar = this$0.Q0) == null) {
                    return;
                }
                fVar.r3();
                return;
            case 1:
                int i15 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltTextField gestaltTextField = this$0.f96386z0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
                String name = String.valueOf(gestaltTextField.z0());
                DescriptionEditView descriptionEditView = this$0.D0;
                if (descriptionEditView == null) {
                    Intrinsics.r("descriptionEt");
                    throw null;
                }
                String obj = descriptionEditView.f52650d.z0().toString();
                GestaltSwitch gestaltSwitch = this$0.F0;
                if (gestaltSwitch == null) {
                    Intrinsics.r("secretToggleSwitch");
                    throw null;
                }
                boolean z13 = gestaltSwitch.l().f96708a;
                GestaltSwitch gestaltSwitch2 = this$0.H0;
                if (gestaltSwitch2 == null) {
                    Intrinsics.r("allowHomefeedRecommendationsSwitch");
                    throw null;
                }
                boolean z14 = gestaltSwitch2.l().f96708a;
                int length = obj.length();
                DescriptionEditView descriptionEditView2 = this$0.D0;
                if (descriptionEditView2 == null) {
                    Intrinsics.r("descriptionEt");
                    throw null;
                }
                Integer i16 = descriptionEditView2.i();
                Intrinsics.checkNotNullExpressionValue(i16, "getMaxLength(...)");
                if (length > i16.intValue()) {
                    DescriptionEditView descriptionEditView3 = this$0.D0;
                    if (descriptionEditView3 == null) {
                        Intrinsics.r("descriptionEt");
                        throw null;
                    }
                    Integer i17 = descriptionEditView3.i();
                    Intrinsics.checkNotNullExpressionValue(i17, "getMaxLength(...)");
                    obj = e0.C(i17.intValue(), obj);
                }
                ll0.f fVar3 = this$0.Q0;
                if (fVar3 != null) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    v7 v7Var = fVar3.f83814m;
                    if (v7Var != null) {
                        u7 G1 = v7Var.G1();
                        G1.C(name);
                        G1.m(obj);
                        G1.W = z13 ? "secret" : "public";
                        boolean[] zArr = G1.f42452n0;
                        if (zArr.length > 48) {
                            zArr[48] = true;
                        }
                        G1.b(Boolean.valueOf(z14));
                        v7 a13 = G1.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        fVar3.x3(a13, new ll0.a(fVar3, 3), new ll0.c(fVar3, 4));
                    }
                }
                GestaltTextField gestaltTextField2 = this$0.f96386z0;
                if (gestaltTextField2 != null) {
                    hf0.b.k(gestaltTextField2);
                    return;
                } else {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
            default:
                int i18 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.i) {
                    ll0.f fVar4 = this$0.Q0;
                    if (fVar4 != null) {
                        GestaltTextField gestaltTextField3 = this$0.f96386z0;
                        if (gestaltTextField3 == null) {
                            Intrinsics.r("boardNameEditText");
                            throw null;
                        }
                        CharSequence z03 = gestaltTextField3.z0();
                        if (z03 == null) {
                            z03 = "";
                        }
                        fVar4.s3(z03);
                        return;
                    }
                    return;
                }
                if (!(it instanceof xn1.f)) {
                    if (!(it instanceof xn1.c) || (fVar2 = this$0.Q0) == null) {
                        return;
                    }
                    fVar2.f83815n = true;
                    return;
                }
                if (((xn1.f) it).f135448c) {
                    GestaltTextField gestaltTextField4 = this$0.f96386z0;
                    if (gestaltTextField4 != null) {
                        hf0.b.s(gestaltTextField4);
                        return;
                    } else {
                        Intrinsics.r("boardNameEditText");
                        throw null;
                    }
                }
                GestaltTextField gestaltTextField5 = this$0.f96386z0;
                if (gestaltTextField5 != null) {
                    hf0.b.k(gestaltTextField5);
                    return;
                } else {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
        }
    }
}
