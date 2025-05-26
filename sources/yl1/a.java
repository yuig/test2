package yl1;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ps0.y;
import u50.i0;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButton f139299j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltButton gestaltButton, int i13) {
        super(1);
        this.f139298i = i13;
        this.f139299j = gestaltButton;
    }

    public final void b(int i13) {
        int i14 = this.f139298i;
        GestaltButton gestaltButton = this.f139299j;
        switch (i14) {
            case 2:
                gestaltButton.setTextColor(d5.a.b(gestaltButton.getContext(), i13));
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                Context context = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltButton.setLineSpacing(0.0f, dl2.b.K0(context, i13));
                break;
            case 7:
                gestaltButton.setVisibility(i13);
                break;
            case 9:
                gestaltButton.setId(i13);
                break;
            case 10:
                gestaltButton.setBackground(gestaltButton.getResources().getDrawable(i13, gestaltButton.getContext().getTheme()));
                break;
            case 11:
                gestaltButton.setBackgroundTintList(d5.a.b(gestaltButton.getContext(), i13));
                break;
            case 12:
                Context context2 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gestaltButton.setTextSize(0, dl2.b.D0(context2, i13));
                break;
        }
    }

    public final void e(i0 text) {
        int i13 = this.f139298i;
        GestaltButton gestaltButton = this.f139299j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(text, "text");
                Context context = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltButton.setText(text.a(context));
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "contentDescription");
                Context context2 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gestaltButton.setContentDescription(text.a(context2));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f139298i;
        GestaltButton gestaltButton = this.f139299j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return GestaltButton.c(gestaltButton, $receiver);
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                y yVar = GestaltButton.f49319h;
                gestaltButton.j();
                return Unit.f80348a;
            case 2:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 3:
                c size = (c) obj;
                Intrinsics.checkNotNullParameter(size, "size");
                Context context = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltButton.setMinimumHeight(dl2.b.F0(context, size.getMinHeight()));
                Context context2 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int F0 = dl2.b.F0(context2, size.getPaddingStart());
                Context context3 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int F02 = dl2.b.F0(context3, size.getPaddingTop());
                Context context4 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int F03 = dl2.b.F0(context4, size.getPaddingEnd());
                Context context5 = gestaltButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                gestaltButton.setPaddingRelative(F0, F02, F03, dl2.b.F0(context5, size.getPaddingBottom()));
                return Unit.f80348a;
            case 4:
                gestaltButton.setEnabled(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 5:
                e((i0) obj);
                return Unit.f80348a;
            case 6:
                e((i0) obj);
                return Unit.f80348a;
            case 7:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 8:
                e buttonWidth = (e) obj;
                Intrinsics.checkNotNullParameter(buttonWidth, "buttonWidth");
                if (gestaltButton.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = buttonWidth == e.INLINE ? -2 : -1;
                    gestaltButton.setLayoutParams(layoutParams);
                }
                return Unit.f80348a;
            case 9:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 10:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 11:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 12:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 13:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 14:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                View.OnClickListener onClickListener = gestaltButton.f49325g;
                if (onClickListener != null) {
                    onClickListener.onClick(gestaltButton);
                }
                return Unit.f80348a;
            default:
                Unit it3 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new xl1.a(gestaltButton.getId());
        }
    }
}
