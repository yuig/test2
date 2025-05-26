package wn1;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextComposer f130557j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f130558k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GestaltTextComposer gestaltTextComposer, d dVar, int i13) {
        super(1);
        this.f130556i = i13;
        this.f130557j = gestaltTextComposer;
        this.f130558k = dVar;
    }

    public final void b(int i13) {
        int i14 = this.f130556i;
        GestaltTextComposer gestaltTextComposer = this.f130557j;
        d dVar = this.f130558k;
        switch (i14) {
            case 1:
                int i15 = dVar.f130519f;
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                if (i15 <= 0) {
                    gestaltTextComposer.getClass();
                    break;
                } else {
                    gestaltTextComposer.o0().setMaxLines(i15);
                    break;
                }
            case 2:
                ImageView.ScaleType scaleType2 = GestaltTextComposer.f49648u;
                gestaltTextComposer.getClass();
                if (dVar.f130521h) {
                    TextInputEditText o03 = gestaltTextComposer.o0();
                    int i16 = dVar.f130520g;
                    o03.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i16)});
                    if (gestaltTextComposer.z0() > i16) {
                        TextInputEditText o04 = gestaltTextComposer.o0();
                        String substring = g3.m0(gestaltTextComposer).substring(0, i16);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        o04.setText(substring);
                        gestaltTextComposer.o0().setSelection(i16);
                        break;
                    }
                }
                break;
            case 3:
            case 4:
            default:
                int i17 = dVar.f130518e;
                ImageView.ScaleType scaleType3 = GestaltTextComposer.f49648u;
                gestaltTextComposer.o0().setMinLines(i17);
                break;
            case 5:
                gestaltTextComposer.setId(dVar.f130536w);
                break;
        }
    }

    public final void e(List list) {
        int i13 = this.f130556i;
        int i14 = 0;
        GestaltTextComposer gestaltTextComposer = this.f130557j;
        d dVar = this.f130558k;
        switch (i13) {
            case 9:
                List list2 = dVar.f130530q;
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                gestaltTextComposer.getClass();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        i14 |= ((Number) it.next()).intValue();
                    }
                    gestaltTextComposer.o0().setImeOptions(i14);
                    break;
                }
                break;
            default:
                List list3 = dVar.f130531r;
                ImageView.ScaleType scaleType2 = GestaltTextComposer.f49648u;
                gestaltTextComposer.getClass();
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        i14 |= ((Number) it2.next()).intValue();
                    }
                    gestaltTextComposer.o0().setInputType(i14);
                    Integer num = gestaltTextComposer.f49667s;
                    if (num != null) {
                        gestaltTextComposer.o0().setTextAppearance(num.intValue());
                        break;
                    }
                }
                break;
        }
    }

    public final void f(i0 i0Var) {
        CharSequence charSequence;
        int i13 = this.f130556i;
        d dVar = this.f130558k;
        GestaltTextComposer gestaltTextComposer = this.f130557j;
        switch (i13) {
            case 10:
                i0 i0Var2 = dVar.f130514a;
                if (i0Var2 != null) {
                    Context context = gestaltTextComposer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (!Intrinsics.d(i0Var2.a(context), bs1.c.h2(String.valueOf(gestaltTextComposer.o0().getText())).f120559a)) {
                        TextInputEditText o03 = gestaltTextComposer.o0();
                        Context context2 = gestaltTextComposer.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        o03.setText(i0Var2.a(context2));
                        break;
                    }
                }
                break;
            default:
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                TextInputEditText o04 = gestaltTextComposer.o0();
                i0 i0Var3 = dVar.f130515b;
                if (i0Var3 != null) {
                    Context context3 = gestaltTextComposer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    charSequence = i0Var3.a(context3);
                } else {
                    charSequence = null;
                }
                o04.setHint(charSequence);
                break;
        }
    }

    public final void h(boolean z13) {
        int i13 = this.f130556i;
        d dVar = this.f130558k;
        GestaltTextComposer gestaltTextComposer = this.f130557j;
        switch (i13) {
            case 3:
                boolean z14 = dVar.f130527n;
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                boolean isEnabled = gestaltTextComposer.o0().isEnabled();
                gestaltTextComposer.o0().setEnabled(z14);
                if (!z14) {
                    GestaltTextComposer.I0(gestaltTextComposer, Integer.valueOf(eo1.b.comp_textfield_disabled_border_color), Integer.valueOf(eo1.a.comp_textfield_disabled_field_text_color), null, 4);
                    gestaltTextComposer.H0(rm1.c.DEFAULT, null, vn1.c.SUBTLE);
                    break;
                } else if (!isEnabled) {
                    gestaltTextComposer.G0();
                    break;
                }
                break;
            default:
                ImageView.ScaleType scaleType2 = GestaltTextComposer.f49648u;
                gestaltTextComposer.getClass();
                if (!dVar.f130517d) {
                    TextInputEditText o03 = gestaltTextComposer.o0();
                    o03.setSingleLine(false);
                    o03.setMinLines(dVar.f130518e);
                    o03.setImeOptions(1073741824);
                    o03.setInputType(131073);
                    o03.setGravity(8388659);
                    gestaltTextComposer.K0();
                    break;
                } else {
                    gestaltTextComposer.o0().setSingleLine(true);
                    gestaltTextComposer.o0().setMaxLines(1);
                    Object value = gestaltTextComposer.f49656h.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    pk.a0.k0((GestaltText) value);
                    break;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130556i;
        d dVar = this.f130558k;
        GestaltTextComposer gestaltTextComposer = this.f130557j;
        switch (i13) {
            case 0:
                d newState = (d) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                gestaltTextComposer.F0(dVar, newState);
                return Unit.f80348a;
            case 1:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 2:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 3:
                h(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 4:
                f it = (f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltTextComposer.T(gestaltTextComposer, dVar.f130516c);
                return Unit.f80348a;
            case 5:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 6:
                switch (i13) {
                    case 6:
                        GestaltTextComposer.a0(gestaltTextComposer, dVar.f130522i, null, 2);
                        break;
                    default:
                        GestaltTextComposer.a0(gestaltTextComposer, null, dVar.f130523j, 1);
                        break;
                }
                return Unit.f80348a;
            case 7:
                switch (i13) {
                    case 6:
                        GestaltTextComposer.a0(gestaltTextComposer, dVar.f130522i, null, 2);
                        break;
                    default:
                        GestaltTextComposer.a0(gestaltTextComposer, null, dVar.f130523j, 1);
                        break;
                }
                return Unit.f80348a;
            case 8:
                fm1.c it2 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltTextComposer.setVisibility(dVar.f130528o.getVisibility());
                return Unit.f80348a;
            case 9:
                e((List) obj);
                return Unit.f80348a;
            case 10:
                f((i0) obj);
                return Unit.f80348a;
            case 11:
                e((List) obj);
                return Unit.f80348a;
            case 12:
                om1.c cVar = (om1.c) obj;
                if (cVar != null) {
                    ImageView.ScaleType scaleType2 = GestaltTextComposer.f49648u;
                    Object value = gestaltTextComposer.f49660l.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((GestaltIconButton) value).t(new dm1.h(cVar, 9));
                    om1.c cVar2 = dVar != null ? dVar.f130533t : null;
                    fm1.c cVar3 = cVar2 != null ? cVar2.f96642d : null;
                    fm1.c cVar4 = cVar.f96642d;
                    if (cVar3 != cVar4) {
                        int W = bs1.c.W(gestaltTextComposer, eo1.c.space_300) * (cVar4 != fm1.c.GONE ? -1 : 1);
                        Object value2 = gestaltTextComposer.f49661m.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        FrameLayout frameLayout = (FrameLayout) value2;
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width += W;
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd() + W, frameLayout.getPaddingBottom());
                    }
                }
                return Unit.f80348a;
            case 13:
                f((i0) obj);
                return Unit.f80348a;
            case 14:
                h(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            default:
                b(((Number) obj).intValue());
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, GestaltTextComposer gestaltTextComposer) {
        super(1);
        this.f130556i = 10;
        this.f130558k = dVar;
        this.f130557j = gestaltTextComposer;
    }
}
