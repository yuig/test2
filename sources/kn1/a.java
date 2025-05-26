package kn1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import hn1.i;
import hn1.j;
import hn1.l;
import hn1.m;
import hn1.p;
import hn1.q;
import hn1.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import pk.a0;
import rl2.g0;
import rm1.r;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.u;
import u50.w;
import xm1.k;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80231i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSheetHeader f80232j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltSheetHeader gestaltSheetHeader, int i13) {
        super(1);
        this.f80231i = i13;
        this.f80232j = gestaltSheetHeader;
    }

    public final void b(i0 it) {
        int i13 = this.f80231i;
        GestaltSheetHeader gestaltSheetHeader = this.f80232j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText = gestaltSheetHeader.f49586c;
                if (gestaltText != null) {
                    pp2.a.k(gestaltText, new fx.e(14, it));
                    return;
                } else {
                    Intrinsics.r("sheetTitle");
                    throw null;
                }
            default:
                q qVar = GestaltSheetHeader.f49579n;
                if (gestaltSheetHeader.a0()) {
                    GestaltText gestaltText2 = gestaltSheetHeader.f49588e;
                    if (gestaltText2 != null) {
                        a0.k0(gestaltText2);
                        return;
                    }
                    return;
                }
                GestaltText gestaltText3 = gestaltSheetHeader.f49588e;
                if (gestaltText3 != null) {
                    gestaltText3.i(new k(7, it, gestaltSheetHeader));
                    return;
                }
                return;
        }
    }

    public final void e(boolean z13) {
        int i13 = this.f80231i;
        GestaltSheetHeader gestaltSheetHeader = this.f80232j;
        switch (i13) {
            case 1:
                TransitionDrawable transitionDrawable = gestaltSheetHeader.f49592i;
                if (z13) {
                    transitionDrawable.startTransition(gestaltSheetHeader.Z());
                    return;
                } else {
                    transitionDrawable.reverseTransition(gestaltSheetHeader.Z());
                    return;
                }
            case 2:
                gestaltSheetHeader.setElevation(z13 ? bs1.c.b0(gestaltSheetHeader, eo1.c.space_200) : 0.0f);
                return;
            default:
                fm1.c cVar = z13 ? fm1.c.VISIBLE : fm1.c.INVISIBLE;
                q qVar = GestaltSheetHeader.f49579n;
                gestaltSheetHeader.getClass();
                if (cVar.getVisibility() != 0) {
                    View view = gestaltSheetHeader.f49587d;
                    if (view != null) {
                        view.animate().alpha(0.0f).setDuration(gestaltSheetHeader.Z()).setListener(new androidx.appcompat.widget.d(gestaltSheetHeader, 23));
                        return;
                    } else {
                        Intrinsics.r("dragHandle");
                        throw null;
                    }
                }
                View view2 = gestaltSheetHeader.f49587d;
                if (view2 == null) {
                    Intrinsics.r("dragHandle");
                    throw null;
                }
                view2.setAlpha(0.0f);
                view2.setVisibility(0);
                view2.animate().alpha(1.0f).setDuration(gestaltSheetHeader.Z()).setListener(null);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l lVar;
        hn1.b bVar;
        hn1.b bVar2;
        hn1.b bVar3;
        i iVar;
        String str;
        l kVar;
        CharSequence charSequence;
        i0 i0Var;
        int i13 = 6;
        int i14 = this.f80231i;
        CharSequence charSequence2 = null;
        GestaltSheetHeader gestaltSheetHeader = this.f80232j;
        switch (i14) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                q qVar = GestaltSheetHeader.f49579n;
                gestaltSheetHeader.getClass();
                boolean z13 = $receiver.getBoolean(x.GestaltSheetHeader_gestalt_showDragHandle, false);
                int i15 = $receiver.getInt(x.GestaltSheetHeader_gestalt_titleAlignment, -1);
                q qVar2 = i15 >= 0 ? q.values()[i15] : GestaltSheetHeader.f49579n;
                String string = $receiver.getString(x.GestaltSheetHeader_android_text);
                if (string == null) {
                    string = "";
                }
                f0 h23 = bs1.c.h2(string);
                String string2 = $receiver.getString(x.GestaltSheetHeader_gestalt_subHeaderText);
                if (string2 == null) {
                    string2 = null;
                }
                f0 h24 = string2 != null ? bs1.c.h2(string2) : null;
                if ($receiver.getString(x.GestaltSheetHeader_gestalt_sheetImageURL) == null || z.i($receiver.getString(x.GestaltSheetHeader_gestalt_sheetImageURL), "-1", false)) {
                    lVar = null;
                } else {
                    String string3 = $receiver.getString(x.GestaltSheetHeader_gestalt_sheetImageURL);
                    if (string3 == null) {
                        string3 = "";
                    }
                    String string4 = $receiver.getString(x.GestaltSheetHeader_gestalt_sheetImageContentDesc);
                    f0 contentDescription = string4 != null ? bs1.c.h2(string4) : GestaltSheetHeader.f49580o;
                    int i16 = x.GestaltSheetHeader_gestalt_sheetImageSize;
                    m mVar = m.PARTIAL;
                    int i17 = $receiver.getInt(i16, -1);
                    if (i17 >= 0) {
                        mVar = m.values()[i17];
                    }
                    int i18 = c.f80244a[mVar.ordinal()];
                    if (i18 == 1) {
                        kVar = new hn1.k(new w(string3), contentDescription);
                    } else {
                        if (i18 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w image = new w(string3);
                        Intrinsics.checkNotNullParameter(image, "image");
                        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                        kVar = new j(image, contentDescription);
                    }
                    lVar = kVar;
                }
                if ($receiver.getString(x.GestaltSheetHeader_gestalt_sheetEndButtonText) == null || z.i($receiver.getString(x.GestaltSheetHeader_gestalt_sheetEndButtonText), "-1", false)) {
                    bVar = null;
                } else {
                    String string5 = $receiver.getString(x.GestaltSheetHeader_gestalt_sheetEndButtonText);
                    String str2 = string5 != null ? string5 : "";
                    f0 h25 = bs1.c.h2(str2);
                    int i19 = x.GestaltSheetHeader_gestalt_sheetEndButtonSize;
                    yl1.c cVar = yl1.c.LARGE;
                    int i23 = $receiver.getInt(i19, -1);
                    yl1.c cVar2 = i23 >= 0 ? yl1.c.values()[i23] : cVar;
                    int i24 = x.GestaltSheetHeader_gestalt_sheetEndButtonColorPalette;
                    yl1.d dVar = yl1.d.PRIMARY;
                    int i25 = $receiver.getInt(i24, -1);
                    if (i25 >= 0) {
                        dVar = yl1.d.values()[i25];
                    }
                    yl1.g colorPalette = dVar.getColorPalette();
                    boolean z14 = $receiver.getBoolean(x.GestaltSheetHeader_gestalt_sheetEndButtonEnabled, true);
                    String string6 = $receiver.getString(x.GestaltSheetHeader_gestalt_sheetEndButtonContentDesc);
                    bVar = new hn1.a(h25, z14, d7.b.Y($receiver, x.GestaltSheetHeader_gestalt_sheetEndButtonVisibility, fm1.c.VISIBLE), string6 != null ? bs1.c.h2(string6) : bs1.c.h2(str2), colorPalette, cVar2);
                }
                if (bVar != null) {
                    bVar3 = bVar;
                } else {
                    rm1.q b13 = r.b($receiver, x.GestaltSheetHeader_gestalt_sheetEndActionIcon);
                    if (b13 != null) {
                        int i26 = x.GestaltSheetHeader_gestalt_sheetEndActionContentDesc;
                        Intrinsics.checkNotNullParameter($receiver, "<this>");
                        String string7 = $receiver.getString(i26);
                        bVar2 = new hn1.c(b13, string7 != null ? new f0(string7) : h0.f120562a, d7.b.Y($receiver, x.GestaltSheetHeader_gestalt_sheetEndActionVisibility, fm1.c.VISIBLE), 8);
                    } else {
                        bVar2 = GestaltSheetHeader.f49583r;
                    }
                    bVar3 = bVar2;
                }
                int i27 = $receiver.getInt(x.GestaltSheetHeader_gestalt_startButton, -1);
                p pVar = i27 >= 0 ? p.values()[i27] : GestaltSheetHeader.f49582q;
                if ($receiver.getString(x.GestaltSheetHeader_gestalt_sheetIllustration) != null && !z.i($receiver.getString(x.GestaltSheetHeader_gestalt_sheetIllustration), "-1", false)) {
                    int i28 = x.GestaltSheetHeader_gestalt_sheetIllustration;
                    LinkedHashMap linkedHashMap = tm1.e.f118140a;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string8 = $receiver.getString(i28);
                    LinkedHashMap linkedHashMap2 = tm1.e.f118140a;
                    if (string8 != null) {
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        str = string8.toUpperCase(US);
                        Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                    } else {
                        str = null;
                    }
                    tm1.d dVar2 = (tm1.d) linkedHashMap2.get(str);
                    if (dVar2 != null) {
                        int i29 = x.GestaltSheetHeader_gestalt_sheetIllustrationRatio;
                        tm1.a aVar = tm1.a.RATIO_1_1;
                        int i33 = $receiver.getInt(i29, -1);
                        if (i33 >= 0) {
                            aVar = tm1.a.values()[i33];
                        }
                        String string9 = $receiver.getString(x.GestaltSheetHeader_gestalt_sheetIllustrationContentDesc);
                        iVar = new i(dVar2, aVar, string9 != null ? ep.b.x(string9, "string", string9) : GestaltSheetHeader.f49581p);
                        return new b(z13, false, qVar2, h23, h24, pVar, bVar3, lVar, false, iVar, Integer.MIN_VALUE);
                    }
                }
                iVar = null;
                return new b(z13, false, qVar2, h23, h24, pVar, bVar3, lVar, false, iVar, Integer.MIN_VALUE);
            case 1:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 2:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 3:
                hn1.b bVar4 = (hn1.b) obj;
                q qVar3 = GestaltSheetHeader.f49579n;
                if (gestaltSheetHeader.a0()) {
                    GestaltIconButton gestaltIconButton = gestaltSheetHeader.f49589f;
                    if (gestaltIconButton != null) {
                        com.bumptech.glide.c.d0(gestaltIconButton);
                    }
                    GestaltButton gestaltButton = gestaltSheetHeader.f49590g;
                    if (gestaltButton != null) {
                        a0.l0(gestaltButton);
                    }
                } else if (bVar4 instanceof hn1.c) {
                    GestaltIconButton gestaltIconButton2 = gestaltSheetHeader.f49589f;
                    if (gestaltIconButton2 != null) {
                        gestaltIconButton2.t(new e(bVar4, 0));
                    }
                    GestaltButton gestaltButton2 = gestaltSheetHeader.f49590g;
                    if (gestaltButton2 != null) {
                        a0.l0(gestaltButton2);
                    }
                    gestaltSheetHeader.L(false);
                } else if (bVar4 instanceof hn1.a) {
                    GestaltButton gestaltButton3 = gestaltSheetHeader.f49590g;
                    if (gestaltButton3 != null) {
                        gestaltButton3.d(new e(bVar4, 1));
                    }
                    GestaltIconButton gestaltIconButton3 = gestaltSheetHeader.f49589f;
                    if (gestaltIconButton3 != null) {
                        com.bumptech.glide.c.d0(gestaltIconButton3);
                    }
                    gestaltSheetHeader.L(true);
                } else {
                    GestaltIconButton gestaltIconButton4 = gestaltSheetHeader.f49589f;
                    if (gestaltIconButton4 != null) {
                        com.bumptech.glide.c.n0(gestaltIconButton4);
                    }
                    GestaltButton gestaltButton4 = gestaltSheetHeader.f49590g;
                    if (gestaltButton4 != null) {
                        a0.l0(gestaltButton4);
                    }
                }
                return Unit.f80348a;
            case 4:
                l lVar2 = (l) obj;
                q qVar4 = GestaltSheetHeader.f49579n;
                gestaltSheetHeader.d0();
                WebImageView webImageView = gestaltSheetHeader.f49591h;
                if (webImageView != null) {
                    g0 g0Var = lVar2 != null ? lVar2.f69656a : null;
                    if (g0Var instanceof w) {
                        Context context = webImageView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        webImageView.loadUrl(((w) g0Var).a(context));
                    } else if (g0Var instanceof u) {
                        u uVar = (u) g0Var;
                        Context context2 = webImageView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        webImageView.setImageDrawable(uVar.f120582a);
                    } else if (g0Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (lVar2 == null || (i0Var = lVar2.f69657b) == null) {
                        charSequence = null;
                    } else {
                        Context context3 = webImageView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        charSequence = i0Var.a(context3);
                    }
                    webImageView.setContentDescription(charSequence);
                }
                WebImageView webImageView2 = gestaltSheetHeader.f49591h;
                Object layoutParams = webImageView2 != null ? webImageView2.getLayoutParams() : null;
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (lVar2 != null) {
                    if (lVar2 instanceof j) {
                        if (layoutParams2 != null) {
                            layoutParams2.G = "4:5";
                        }
                    } else if ((lVar2 instanceof hn1.k) && layoutParams2 != null) {
                        layoutParams2.G = "3:2";
                    }
                }
                WebImageView webImageView3 = gestaltSheetHeader.f49591h;
                if (webImageView3 != null) {
                    webImageView3.setLayoutParams(layoutParams2);
                }
                return Unit.f80348a;
            case 5:
                i iVar2 = (i) obj;
                if (iVar2 != null) {
                    q qVar5 = GestaltSheetHeader.f49579n;
                    gestaltSheetHeader.d0();
                    WebImageView webImageView4 = gestaltSheetHeader.f49591h;
                    if (webImageView4 != null) {
                        Context context4 = webImageView4.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        tm1.b bVar5 = tm1.b.HERO;
                        tm1.d dVar3 = iVar2.f69653a;
                        tm1.a aVar2 = iVar2.f69654b;
                        Integer drawableRes = dVar3.drawableRes(context4, bVar5, aVar2);
                        if (drawableRes != null) {
                            webImageView4.setImageDrawable(bs1.c.f0(webImageView4, drawableRes.intValue(), null, null, 6));
                        }
                        ViewGroup.LayoutParams layoutParams3 = webImageView4.getLayoutParams();
                        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                        if (layoutParams4 != null) {
                            layoutParams4.G = aVar2.getRatioValue();
                        }
                        webImageView4.setLayoutParams(layoutParams4);
                        i0 i0Var2 = iVar2.f69655c;
                        if (i0Var2 != null) {
                            Context context5 = webImageView4.getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            charSequence2 = i0Var2.a(context5);
                        }
                        webImageView4.setContentDescription(charSequence2);
                    }
                }
                return Unit.f80348a;
            case 6:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar6 = GestaltSheetHeader.f49579n;
                gestaltSheetHeader.getClass();
                List b14 = e0.b(it == q.Center ? vn1.b.CENTER : vn1.b.START);
                GestaltText gestaltText = gestaltSheetHeader.f49586c;
                if (gestaltText == null) {
                    Intrinsics.r("sheetTitle");
                    throw null;
                }
                pp2.a.k(gestaltText, new fk1.u(b14, i13));
                GestaltText gestaltText2 = gestaltSheetHeader.f49588e;
                if (gestaltText2 != null) {
                    pp2.a.k(gestaltText2, new fk1.u(b14, 7));
                }
                return Unit.f80348a;
            case 7:
                b((i0) obj);
                return Unit.f80348a;
            case 8:
                b((i0) obj);
                return Unit.f80348a;
            default:
                e(((Boolean) obj).booleanValue());
                return Unit.f80348a;
        }
    }
}
