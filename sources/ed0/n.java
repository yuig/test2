package ed0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import jc0.a0;
import jc0.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Led0/n;", "Lkj/i;", "<init>", "()V", "brandedContent_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ScreenFactoryRegistration"})
/* loaded from: classes5.dex */
public final class n extends kj.i {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f58523t = 0;

    /* renamed from: r, reason: collision with root package name */
    public wk2.a f58524r;

    /* renamed from: s, reason: collision with root package name */
    public w f58525s;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(pd0.b.branded_content_enrolled_settings, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            Context requireContext = requireContext();
            int i13 = eo1.b.sema_color_background_transparent;
            Object obj = d5.a.f53679a;
            view2.setBackground(requireContext.getDrawable(i13));
        }
        View findViewById = view.findViewById(pd0.a.settings_close);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        if (gestaltButton == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        final int i14 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: ed0.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f58522b;

            {
                this.f58522b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                n this$0 = this.f58522b;
                switch (i15) {
                    case 0:
                        int i16 = n.f58523t;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.dismiss();
                        return;
                    default:
                        int i17 = n.f58523t;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.dismiss();
                        w wVar = this$0.f58525s;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wk2.a aVar = this$0.f58524r;
                        if (aVar != null) {
                            wVar.d(new v((a0) aVar.get(), false, 0L, 30));
                            return;
                        } else {
                            Intrinsics.r("brandedContentConfirmUnenrollmentModalProvider");
                            throw null;
                        }
                }
            }
        });
        final int i15 = 1;
        ((GestaltText) view.findViewById(pd0.a.leave)).j(new gm1.a(this) { // from class: ed0.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f58522b;

            {
                this.f58522b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                n this$0 = this.f58522b;
                switch (i152) {
                    case 0:
                        int i16 = n.f58523t;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.dismiss();
                        return;
                    default:
                        int i17 = n.f58523t;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.dismiss();
                        w wVar = this$0.f58525s;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wk2.a aVar = this$0.f58524r;
                        if (aVar != null) {
                            wVar.d(new v((a0) aVar.get(), false, 0L, 30));
                            return;
                        } else {
                            Intrinsics.r("brandedContentConfirmUnenrollmentModalProvider");
                            throw null;
                        }
                }
            }
        });
    }
}
