package up;

import android.content.Context;
import android.os.Bundle;
import android.widget.BaseAdapter;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.z2;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalListViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.i0;
import jc0.l;
import kotlin.jvm.internal.Intrinsics;
import lh0.v0;
import m60.x0;
import nx.d0;
import nx.f0;
import nx.j0;
import oh1.r;
import qh1.e;
import tp.m;
import wp0.g;
import x02.p1;
import x02.u;

/* loaded from: classes3.dex */
public final class a extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122929a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.b f122930b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f122931c;

    /* renamed from: d, reason: collision with root package name */
    public final BaseAdapter f122932d;

    public a(e eVar, z2 z2Var, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, g gVar, r rVar, f30 f30Var, u uVar, b60.b bVar, d0 d0Var, v0 v0Var) {
        this.f122931c = z14;
        xj2.b bVar2 = new xj2.b();
        this.f122930b = bVar2;
        this.f122932d = new tp.g(eVar, z2Var, uVar, bVar, d0Var, z13, z14, bVar2, z15, gVar, rVar, f30Var.getUid(), f30Var.z3().getUid(), z16, z17, v0Var);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        BaseAdapter baseAdapter = this.f122932d;
        int i13 = 3;
        int i14 = this.f122929a;
        boolean z13 = this.f122931c;
        switch (i14) {
            case 0:
                ModalListViewWrapper modalListViewWrapper = new ModalListViewWrapper(context);
                modalListViewWrapper.t((tp.g) baseAdapter);
                modalListViewWrapper.setBackgroundResource(ga2.c.modal_wrapper_rounded_corner_background);
                if (!z13) {
                    String title = context.getString(x0.comment_non_original_educational_content);
                    Intrinsics.checkNotNullParameter(title, "title");
                    GestaltText gestaltText = modalListViewWrapper.f44767k;
                    if (gestaltText == null) {
                        Intrinsics.r("educationalContentView");
                        throw null;
                    }
                    gestaltText.i(new l(title, i13));
                }
                return modalListViewWrapper;
            default:
                ModalListViewWrapper modalListViewWrapper2 = new ModalListViewWrapper(context);
                modalListViewWrapper2.t((m) baseAdapter);
                if (!z13) {
                    String title2 = context.getString(x0.comment_non_original_educational_content);
                    Intrinsics.checkNotNullParameter(title2, "title");
                    GestaltText gestaltText2 = modalListViewWrapper2.f44767k;
                    if (gestaltText2 == null) {
                        Intrinsics.r("educationalContentView");
                        throw null;
                    }
                    gestaltText2.i(new l(title2, i13));
                }
                return modalListViewWrapper2;
        }
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        switch (this.f122929a) {
        }
        return new i0(d4.ACTION_SHEET, null, null, null, null, null);
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return null;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        int i13 = this.f122929a;
        xj2.b bVar = this.f122930b;
        switch (i13) {
            case 0:
                bVar.d();
                break;
            default:
                bVar.d();
                break;
        }
    }

    public a(e eVar, az0 az0Var, oh1.b bVar, r rVar, boolean z13, boolean z14, boolean z15, boolean z16, f0 f0Var, p1 p1Var, b60.b bVar2, v0 v0Var) {
        j0 a13 = ((nx.m) f0Var).a(this);
        this.f122931c = z14;
        xj2.b bVar3 = new xj2.b();
        this.f122930b = bVar3;
        this.f122932d = new m(eVar, az0Var, a13, bVar, bVar3, p1Var, bVar2, rVar, z13, z14, z15, z16, v0Var);
    }
}
