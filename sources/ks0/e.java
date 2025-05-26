package ks0;

import android.view.View;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import is0.h;
import kg.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinGridHideView f80786b;

    public e(PinGridHideView pinGridHideView, int i13) {
        this.f80785a = i13;
        this.f80786b = pinGridHideView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i13 = this.f80785a;
        PinGridHideView pinGridHideView = this.f80786b;
        switch (i13) {
            case 0:
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                if (!pinGridHideView.f45744w) {
                    hs0.a aVar = pinGridHideView.f45740s;
                    if (aVar != null) {
                        ((h) aVar).x3();
                        break;
                    }
                } else {
                    hs0.a aVar2 = pinGridHideView.f45740s;
                    if (aVar2 != null) {
                        ((h) aVar2).z3();
                        break;
                    }
                }
                break;
            case 1:
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                if (!pinGridHideView.f45744w) {
                    hs0.a aVar3 = pinGridHideView.f45740s;
                    if (aVar3 != null) {
                        ((h) aVar3).x3();
                        break;
                    }
                } else {
                    hs0.a aVar4 = pinGridHideView.f45740s;
                    if (aVar4 != null) {
                        ((h) aVar4).z3();
                        break;
                    }
                }
                break;
            default:
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                if (!pinGridHideView.f45744w) {
                    hs0.a aVar5 = pinGridHideView.f45740s;
                    if (aVar5 != null) {
                        ((h) aVar5).x3();
                        break;
                    }
                } else {
                    hs0.a aVar6 = pinGridHideView.f45740s;
                    if (aVar6 != null) {
                        ((h) aVar6).z3();
                        break;
                    }
                }
                break;
        }
    }
}
