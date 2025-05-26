package jq;

import android.view.View;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kl0.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f77451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f77452c;

    public /* synthetic */ m(View.OnClickListener onClickListener, GestaltIconButton gestaltIconButton, int i13) {
        this.f77450a = i13;
        this.f77451b = onClickListener;
        this.f77452c = gestaltIconButton;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f77450a;
        GestaltIconButton this_apply = this.f77452c;
        View.OnClickListener onClickListener = this.f77451b;
        switch (i13) {
            case 0:
                if (it instanceof om1.l) {
                    onClickListener.onClick(this_apply);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(onClickListener, "$onClickListener");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    onClickListener.onClick(this_apply);
                    break;
                }
                break;
            case 2:
                int i14 = z.f80128e2;
                Intrinsics.checkNotNullParameter(onClickListener, "$onClickListener");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    onClickListener.onClick(this_apply);
                    break;
                }
                break;
            default:
                int i15 = wn0.j.H1;
                Intrinsics.checkNotNullParameter(onClickListener, "$onClickListener");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    onClickListener.onClick(this_apply);
                    break;
                }
                break;
        }
    }
}
