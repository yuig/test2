package mf0;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmf0/l;", "Lmf0/f;", "<init>", "()V", "vb0/i", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: c0, reason: collision with root package name */
    public boolean f87125c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f87126d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f87127e0;

    public l() {
        Intrinsics.checkNotNullParameter("loading", "<set-?>");
        this.f87102u = "loading";
        this.f87127e0 = p.loading;
    }

    @Override // mf0.f
    public final void b7() {
        FragmentActivity E4 = E4();
        if (E4 instanceof nf0.e) {
            E4.finish();
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        try {
            super.onActivityCreated(bundle);
            View inflate = LayoutInflater.from(E4()).inflate(o.dialog_wait, (ViewGroup) null);
            String str = this.f87126d0;
            if (str == null || str.length() == 0) {
                q7(inflate.getContext().getString(this.f87127e0));
            }
            View findViewById = inflate.findViewById(n.waiting_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            GestaltText gestaltText = (GestaltText) findViewById;
            String str2 = this.f87126d0;
            if (str2 == null) {
                str2 = "";
            }
            a0.p(gestaltText, str2);
            c7(inflate, 0);
            Dialog dialog = this.f18416l;
            if (dialog != null) {
                dialog.setCanceledOnTouchOutside(this.f87125c0);
            }
            Dialog dialog2 = this.f18416l;
            if (dialog2 != null) {
                dialog2.setOnCancelListener(null);
            }
        } catch (Exception unused) {
            Dialog dialog3 = this.f18416l;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
    }

    /* renamed from: p7, reason: from getter */
    public final String getF87126d0() {
        return this.f87126d0;
    }

    public final void q7(String str) {
        GestaltText gestaltText;
        this.f87126d0 = str;
        View view = getView();
        if (view == null || (gestaltText = (GestaltText) view.findViewById(n.waiting_tv)) == null) {
            return;
        }
        String str2 = this.f87126d0;
        if (str2 == null) {
            str2 = "";
        }
        a0.p(gestaltText, str2);
    }
}
