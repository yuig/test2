package mf0;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import r1.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf0/i;", "Lmf0/f;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f87110i0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public Function0 f87111c0;

    /* renamed from: d0, reason: collision with root package name */
    public GestaltButton f87112d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f87113e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltText f87114f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f87115g0;

    /* renamed from: h0, reason: collision with root package name */
    public Integer f87116h0;

    @Override // mf0.f
    public final void Z6(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(o.call_out_dialog_pinterest, (ViewGroup) null);
        this.A = inflate;
        this.f87114f0 = inflate != null ? (GestaltText) inflate.findViewById(n.text_title) : null;
        View view = this.A;
        this.f87113e0 = view != null ? (GestaltText) view.findViewById(n.text_body) : null;
        View view2 = this.A;
        this.f87112d0 = view2 != null ? (GestaltButton) view2.findViewById(n.btn_ok_dialog) : null;
        View view3 = this.A;
        GestaltIconButton gestaltIconButton = view3 != null ? (GestaltIconButton) view3.findViewById(n.btn_close) : null;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new h(this, 1));
        }
        GestaltText gestaltText = this.f87114f0;
        if (gestaltText != null) {
            CharSequence charSequence = this.M;
            if (charSequence == null) {
                charSequence = "";
            }
            a0.q(gestaltText, bs1.c.h2(charSequence));
        }
        GestaltText gestaltText2 = this.f87113e0;
        if (gestaltText2 != null) {
            Spanned fromHtml = Html.fromHtml(this.f87115g0, 63);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
            a0.q(gestaltText2, bs1.c.h2(fromHtml));
        }
        p7();
    }

    @Override // mf0.f
    public final void d7(String str) {
        this.f87115g0 = str;
        GestaltText gestaltText = this.f87113e0;
        if (gestaltText != null) {
            Spanned fromHtml = Html.fromHtml(str, 63);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
            a0.q(gestaltText, bs1.c.h2(fromHtml));
        }
    }

    @Override // mf0.f
    public final void h7(CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.M = title;
        GestaltText gestaltText = this.f87114f0;
        if (gestaltText != null) {
            if (title == null) {
                title = "";
            }
            a0.q(gestaltText, bs1.c.h2(title));
        }
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q6(2, q.Theme_Pinterest_Callout_Dialog);
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Dialog dialog = this.f18416l;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
        }
        return onCreateView;
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f87111c0 = null;
        super.onDestroy();
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f87112d0 = null;
        this.f87113e0 = null;
        this.f87114f0 = null;
        this.f87115g0 = null;
        this.f87116h0 = null;
        super.onDestroyView();
    }

    public final void p7() {
        Integer num = this.f87116h0;
        if (num != null) {
            int intValue = num.intValue();
            GestaltButton gestaltButton = this.f87112d0;
            if (gestaltButton != null) {
                gestaltButton.d(new j0(intValue, 15));
            }
        }
        GestaltButton gestaltButton2 = this.f87112d0;
        if (gestaltButton2 != null) {
            gestaltButton2.e(new h(this, 0));
        }
    }
}
