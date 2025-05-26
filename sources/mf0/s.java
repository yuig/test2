package mf0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmf0/s;", "Lmf0/f;", "<init>", "()V", "g4/u", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class s extends f {

    /* renamed from: c0, reason: collision with root package name */
    public GestaltText f87128c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f87129d0;

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c7(LayoutInflater.from(E4()).inflate(o.dialog_simple_text, (ViewGroup) null), this.f87104w);
        FrameLayout frameLayout = this.C;
        GestaltText gestaltText = frameLayout != null ? (GestaltText) frameLayout.findViewById(n.dialog_body_tv) : null;
        this.f87128c0 = gestaltText;
        if (gestaltText != null) {
            String str = this.f87129d0;
            if (str == null) {
                str = "";
            }
            a0.p(gestaltText, str);
        }
        if (bundle == null || !bundle.getBoolean("simple_text_dialog_destroyed")) {
            return;
        }
        N6(false, false);
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("simple_text_dialog_destroyed", true);
        super.onSaveInstanceState(outState);
    }

    public final void p7(String str) {
        this.f87129d0 = str;
        GestaltText gestaltText = this.f87128c0;
        if (gestaltText != null) {
            if (str == null) {
                str = "";
            }
            a0.p(gestaltText, str);
        }
    }
}
