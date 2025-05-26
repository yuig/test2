package com.pinterest.ads.feature.owc.view.base;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import cu.d;
import gm1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/base/AdsToolbarModule;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsToolbarModule extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35303d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIconButton f35304a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f35305b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f35306c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AdsToolbarModule(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1.<init>(r4, r5, r2, r0)
            int r2 = ps.q.ads_closeup_toolbar_module
            android.view.View.inflate(r4, r2, r1)
            int r2 = ps.p.opaque_one_tap_up_button
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r2 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r2
            r1.f35304a = r2
            int r2 = ps.p.opaque_one_tap_overflow_button
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r2 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r2
            r1.f35305b = r2
            int r2 = ps.p.music_attribution
            android.view.View r2 = r1.findViewById(r2)
            r3 = r2
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            boolean r4 = r1.isRtl()
            if (r4 == 0) goto L44
            cu.c r4 = cu.c.f53176j
            r3.i(r4)
            goto L49
        L44:
            cu.c r4 = cu.c.f53177k
            r3.i(r4)
        L49:
            java.lang.String r4 = "apply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r1.f35306c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ads.feature.owc.view.base.AdsToolbarModule.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final void L(final d dVar) {
        final int i13 = 0;
        this.f35304a.u(new a() { // from class: cu.b
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                d dVar2 = dVar;
                switch (i14) {
                    case 0:
                        int i15 = AdsToolbarModule.f35303d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && dVar2 != null) {
                            dVar2.Y0();
                            break;
                        }
                        break;
                    default:
                        int i16 = AdsToolbarModule.f35303d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && dVar2 != null) {
                            dVar2.T4();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        this.f35305b.u(new a() { // from class: cu.b
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                d dVar2 = dVar;
                switch (i142) {
                    case 0:
                        int i15 = AdsToolbarModule.f35303d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && dVar2 != null) {
                            dVar2.Y0();
                            break;
                        }
                        break;
                    default:
                        int i16 = AdsToolbarModule.f35303d;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && dVar2 != null) {
                            dVar2.T4();
                            break;
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsToolbarModule(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsToolbarModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
