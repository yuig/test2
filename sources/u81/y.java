package u81;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu81/y;", "Lmf0/f;", "<init>", "()V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class y extends mf0.f {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f121115c0 = 0;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float width = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels).width() * 0.8f;
        Dialog dialog = this.f18416l;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) width, -2);
        }
        View view2 = null;
        c7(View.inflate(getContext(), uc2.f.view_room_repaint_education_dialog, null), 0);
        int i13 = uc2.d.room_repaint_education_button;
        if (this.A != null && (frameLayout = this.C) != null) {
            view2 = frameLayout.findViewById(i13);
        }
        if (view2 != null) {
            view2.setOnClickListener(new x61.e(this, 18));
        }
    }
}
