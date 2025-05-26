package in1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.sheet.container.GestaltSheetContainer;
import df.j1;
import hn1.f;
import hn1.g;
import hn1.h;
import hn1.n;
import hn1.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk.a0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSheetContainer f72838j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f72839k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GestaltSheetContainer gestaltSheetContainer, b bVar, int i13) {
        super(1);
        this.f72837i = i13;
        this.f72838j = gestaltSheetContainer;
        this.f72839k = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f72837i;
        int i14 = 2;
        int i15 = 1;
        b bVar = this.f72839k;
        GestaltSheetContainer gestaltSheetContainer = this.f72838j;
        switch (i13) {
            case 0:
                h footerType = (h) obj;
                Intrinsics.checkNotNullParameter(footerType, "footerType");
                yl1.d dVar = GestaltSheetContainer.f49571w;
                gestaltSheetContainer.getClass();
                boolean z13 = footerType instanceof hn1.d;
                cm1.b bVar2 = cm1.b.f28006j;
                q qVar = gestaltSheetContainer.f49572p;
                if (z13) {
                    if (gestaltSheetContainer.f49573q == null) {
                        Context context = gestaltSheetContainer.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GestaltButton gestaltButton = new GestaltButton(0, 14, context, (AttributeSet) null);
                        bs1.c.s(gestaltButton, c.f72835m);
                        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
                        layoutParams.setMargins(0, bs1.c.W(gestaltButton, eo1.c.space_200), 0, 0);
                        gestaltButton.setLayoutParams(layoutParams);
                        gm1.a aVar = (gm1.a) qVar.f33804b;
                        if (aVar != null) {
                            gestaltButton.e(aVar);
                        }
                        View.OnClickListener onClickListener = gestaltSheetContainer.f49578v;
                        if (onClickListener != null) {
                            gestaltButton.g(onClickListener);
                        }
                        gestaltSheetContainer.f49573q = gestaltButton;
                        gestaltSheetContainer.addView(gestaltButton);
                    }
                    GestaltButton gestaltButton2 = gestaltSheetContainer.f49573q;
                    if (gestaltButton2 != null) {
                        gestaltButton2.d(new e(footerType, 0));
                    }
                    GestaltButtonGroup gestaltButtonGroup = gestaltSheetContainer.f49574r;
                    if (gestaltButtonGroup != null) {
                        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
                        gestaltButtonGroup.a(bVar2);
                    }
                    FrameLayout frameLayout = gestaltSheetContainer.f49575s;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                } else if (footerType instanceof hn1.e) {
                    if (gestaltSheetContainer.f49574r == null) {
                        Context context2 = gestaltSheetContainer.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        GestaltButtonGroup gestaltButtonGroup2 = new GestaltButtonGroup(6, context2, (AttributeSet) null);
                        kh2.d.k(gestaltButtonGroup2, new cm1.c(gestaltButtonGroup2, 2));
                        LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-1, -2);
                        layoutParams2.setMargins(0, dl2.b.G0(gestaltButtonGroup2, eo1.a.comp_sheet_button_group_top_padding), 0, 0);
                        gestaltButtonGroup2.setLayoutParams(layoutParams2);
                        gm1.a aVar2 = (gm1.a) qVar.f33804b;
                        if (aVar2 != null) {
                            gestaltButtonGroup2.b(aVar2);
                        }
                        gestaltSheetContainer.f49574r = gestaltButtonGroup2;
                        gestaltSheetContainer.addView(gestaltButtonGroup2);
                    }
                    GestaltButtonGroup gestaltButtonGroup3 = gestaltSheetContainer.f49574r;
                    if (gestaltButtonGroup3 != null) {
                        gestaltButtonGroup3.a(new e(footerType, 1));
                    }
                    GestaltButton gestaltButton3 = gestaltSheetContainer.f49573q;
                    if (gestaltButton3 != null) {
                        a0.l0(gestaltButton3);
                    }
                    FrameLayout frameLayout2 = gestaltSheetContainer.f49575s;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                } else if (footerType instanceof f) {
                    if (((Boolean) gestaltSheetContainer.f49577u.getValue()).booleanValue()) {
                        if (gestaltSheetContainer.f49575s == null) {
                            FrameLayout frameLayout3 = new FrameLayout(gestaltSheetContainer.getContext());
                            frameLayout3.setId(t.footer_content);
                            LinearLayoutCompat.LayoutParams layoutParams3 = new LinearLayoutCompat.LayoutParams(-1, -2);
                            layoutParams3.setMargins(0, bs1.c.W(frameLayout3, eo1.c.space_200), 0, 0);
                            frameLayout3.setLayoutParams(layoutParams3);
                            gestaltSheetContainer.f49575s = frameLayout3;
                            gestaltSheetContainer.addView(frameLayout3);
                        }
                        LayoutInflater.from(gestaltSheetContainer.getContext()).inflate(((f) footerType).f69651a, (ViewGroup) gestaltSheetContainer.f49575s, true);
                        FrameLayout frameLayout4 = gestaltSheetContainer.f49575s;
                        if (frameLayout4 != null) {
                            frameLayout4.setVisibility(0);
                        }
                    }
                    GestaltButton gestaltButton4 = gestaltSheetContainer.f49573q;
                    if (gestaltButton4 != null) {
                        a0.l0(gestaltButton4);
                    }
                    GestaltButtonGroup gestaltButtonGroup4 = gestaltSheetContainer.f49574r;
                    if (gestaltButtonGroup4 != null) {
                        Intrinsics.checkNotNullParameter(gestaltButtonGroup4, "<this>");
                        gestaltButtonGroup4.a(bVar2);
                    }
                } else if (footerType instanceof g) {
                    GestaltButton gestaltButton5 = gestaltSheetContainer.f49573q;
                    if (gestaltButton5 != null) {
                        a0.l0(gestaltButton5);
                    }
                    GestaltButtonGroup gestaltButtonGroup5 = gestaltSheetContainer.f49574r;
                    if (gestaltButtonGroup5 != null) {
                        Intrinsics.checkNotNullParameter(gestaltButtonGroup5, "<this>");
                        gestaltButtonGroup5.a(bVar2);
                    }
                    FrameLayout frameLayout5 = gestaltSheetContainer.f49575s;
                    if (frameLayout5 != null) {
                        frameLayout5.setVisibility(8);
                    }
                }
                FrameLayout frameLayout6 = gestaltSheetContainer.f49576t;
                ViewGroup.LayoutParams layoutParams4 = frameLayout6.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams.bottomMargin = bVar.f72828a instanceof g ? 0 : bs1.c.W(gestaltSheetContainer, eo1.c.space_600);
                frameLayout6.setLayoutParams(marginLayoutParams);
                return Unit.f80348a;
            case 1:
                ((Boolean) obj).getClass();
                ViewGroup.LayoutParams layoutParams5 = gestaltSheetContainer.f49576t.getLayoutParams();
                if (bVar.f72829b) {
                    layoutParams5.height = -1;
                } else {
                    layoutParams5.height = -2;
                }
                gestaltSheetContainer.f49576t.setLayoutParams(layoutParams5);
                return Unit.f80348a;
            case 2:
                n it = (n) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                n nVar = bVar.f72831d;
                yl1.d dVar2 = GestaltSheetContainer.f49571w;
                gestaltSheetContainer.setPaddingRelative(gestaltSheetContainer.getResources().getDimensionPixelSize(nVar.f69659b), gestaltSheetContainer.getResources().getDimensionPixelSize(nVar.f69658a), gestaltSheetContainer.getResources().getDimensionPixelSize(nVar.f69660c), gestaltSheetContainer.getResources().getDimensionPixelSize(nVar.f69661d));
                return Unit.f80348a;
            default:
                b sheetContainerDisplayState = (b) obj;
                Intrinsics.checkNotNullParameter(sheetContainerDisplayState, "sheetContainerDisplayState");
                j1.v(bVar, sheetContainerDisplayState, c.f72832j, new d(gestaltSheetContainer, sheetContainerDisplayState, r5));
                j1.v(bVar, sheetContainerDisplayState, c.f72833k, new d(gestaltSheetContainer, sheetContainerDisplayState, i15));
                j1.v(bVar, sheetContainerDisplayState, c.f72834l, new d(gestaltSheetContainer, sheetContainerDisplayState, i14));
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, GestaltSheetContainer gestaltSheetContainer) {
        super(1);
        this.f72837i = 3;
        this.f72839k = bVar;
        this.f72838j = gestaltSheetContainer;
    }
}
