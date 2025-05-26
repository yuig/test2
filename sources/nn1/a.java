package nn1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatButton;
import com.pinterest.gestalt.splitButton.view.ButtonWithEllipsize;
import com.pinterest.gestalt.splitButton.view.GestaltSplitButton;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;
import rm1.r;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91533i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSplitButton f91534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltSplitButton gestaltSplitButton, int i13) {
        super(1);
        this.f91533i = i13;
        this.f91534j = gestaltSplitButton;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f91533i;
        GestaltSplitButton gestaltSplitButton = this.f91534j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return new mn1.b(((b) ((o) gestaltSplitButton.f49610a.f33803a)).f91543i);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new mn1.a(((b) ((o) gestaltSplitButton.f49610a.f33803a)).f91543i);
        }
    }

    public final void e(int i13) {
        int i14 = this.f91533i;
        GestaltSplitButton gestaltSplitButton = this.f91534j;
        switch (i14) {
            case 8:
                gestaltSplitButton.setVisibility(i13);
                break;
            case 9:
                gestaltSplitButton.setId(i13);
                break;
            case 10:
                rn1.b bVar = GestaltSplitButton.f49606d;
                ButtonWithEllipsize X = gestaltSplitButton.X();
                Resources resources = gestaltSplitButton.getResources();
                Context context = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                X.setBackground(resources.getDrawable(!j1.Y0(context) ? mn1.c.split_button_background_left : mn1.c.split_button_background_right, gestaltSplitButton.getContext().getTheme()));
                gestaltSplitButton.X().setBackgroundTintList(d5.a.b(gestaltSplitButton.getContext(), i13));
                break;
            case 11:
                rn1.b bVar2 = GestaltSplitButton.f49606d;
                AppCompatButton T = gestaltSplitButton.T();
                Resources resources2 = gestaltSplitButton.getResources();
                Context context2 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                T.setBackground(resources2.getDrawable(!j1.Y0(context2) ? mn1.c.split_button_background_right : mn1.c.split_button_background_left, gestaltSplitButton.getContext().getTheme()));
                gestaltSplitButton.T().setBackgroundTintList(d5.a.b(gestaltSplitButton.getContext(), i13));
                break;
            default:
                rn1.b bVar3 = GestaltSplitButton.f49606d;
                gestaltSplitButton.X().setTextColor(d5.a.b(gestaltSplitButton.getContext(), i13));
                break;
        }
    }

    public final void f(i0 text) {
        int i13 = this.f91533i;
        GestaltSplitButton gestaltSplitButton = this.f91534j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(text, "text");
                rn1.b bVar = GestaltSplitButton.f49606d;
                ButtonWithEllipsize X = gestaltSplitButton.X();
                Context context = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                X.setText(text.a(context));
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "contentDescription");
                rn1.b bVar2 = GestaltSplitButton.f49606d;
                ButtonWithEllipsize X2 = gestaltSplitButton.X();
                Context context2 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                X2.setContentDescription(text.a(context2));
                AppCompatButton T = gestaltSplitButton.T();
                Context context3 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                T.setContentDescription(text.a(context3));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91533i;
        GestaltSplitButton gestaltSplitButton = this.f91534j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                rn1.b bVar = GestaltSplitButton.f49606d;
                gestaltSplitButton.getClass();
                int i14 = mn1.f.GestaltSplitButton_android_text;
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                String string = $receiver.getString(i14);
                i0 i0Var = h0.f120562a;
                i0 f0Var = string != null ? new f0(string) : i0Var;
                fm1.c Y = d7.b.Y($receiver, mn1.f.GestaltSplitButton_android_visibility, fm1.c.VISIBLE);
                int i15 = $receiver.getInt(mn1.f.GestaltSplitButton_gestalt_splitButtonColorPalette, -1);
                f colorPalette = (i15 >= 0 ? c.values()[i15] : GestaltSplitButton.f49609g).getColorPalette();
                int i16 = mn1.f.GestaltSplitButton_android_contentDescription;
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                String string2 = $receiver.getString(i16);
                if (string2 != null) {
                    i0Var = new f0(string2);
                }
                i0 i0Var2 = i0Var;
                int i17 = $receiver.getInt(mn1.f.GestaltSplitButton_android_ellipsize, -1);
                rn1.b bVar2 = i17 >= 0 ? rn1.b.values()[i17] : GestaltSplitButton.f49606d;
                boolean z13 = $receiver.getBoolean(mn1.f.GestaltSplitButton_android_enabled, true);
                q a13 = r.a($receiver, mn1.f.GestaltSplitButton_gestalt_splitButtonIcon, GestaltSplitButton.f49607e);
                int i18 = $receiver.getInt(mn1.f.GestaltSplitButton_gestalt_splitButtonSize, -1);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rn1.b bVar3 = GestaltSplitButton.f49606d;
                if (gestaltSplitButton.isAttachedToWindow()) {
                    gestaltSplitButton.L();
                }
                break;
            case 4:
                TextUtils.TruncateAt truncateAt = (TextUtils.TruncateAt) obj;
                rn1.b bVar4 = GestaltSplitButton.f49606d;
                ButtonWithEllipsize X = gestaltSplitButton.X();
                X.setEllipsize(truncateAt);
                if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
                    X.setFocusableInTouchMode(true);
                    X.setMarqueeRepeatLimit(-1);
                }
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gestaltSplitButton.setEnabled(booleanValue);
                gestaltSplitButton.X().setEnabled(booleanValue);
                gestaltSplitButton.T().setEnabled(booleanValue);
                break;
            case 6:
                yl1.c size = (yl1.c) obj;
                Intrinsics.checkNotNullParameter(size, "size");
                rn1.b bVar5 = GestaltSplitButton.f49606d;
                Context context = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float D0 = dl2.b.D0(context, size.getTextSize());
                Context context2 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                float K0 = dl2.b.K0(context2, size.getTextSpacingMultiplier());
                Context context3 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int F0 = dl2.b.F0(context3, size.getMinHeight());
                Context context4 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int F02 = dl2.b.F0(context4, size.getPaddingStart());
                Context context5 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                int F03 = dl2.b.F0(context5, size.getPaddingTop());
                Context context6 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                int F04 = dl2.b.F0(context6, size.getPaddingEnd());
                Context context7 = gestaltSplitButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                int F05 = dl2.b.F0(context7, size.getPaddingBottom());
                ButtonWithEllipsize X2 = gestaltSplitButton.X();
                X2.setTextSize(0, D0);
                X2.setLineSpacing(0.0f, K0);
                X2.setMinimumHeight(F0);
                X2.setPaddingRelative(F02, F03, F04, F05);
                AppCompatButton T = gestaltSplitButton.T();
                T.setTextSize(0, D0);
                T.setLineSpacing(0.0f, K0);
                T.setMinimumHeight(F0);
                T.setPaddingRelative(F02, F03, F04, F05);
                break;
            case 7:
                f((i0) obj);
                break;
            case 8:
                e(((Number) obj).intValue());
                break;
            case 9:
                e(((Number) obj).intValue());
                break;
            case 10:
                e(((Number) obj).intValue());
                break;
            case 11:
                e(((Number) obj).intValue());
                break;
            case 12:
                e(((Number) obj).intValue());
                break;
            default:
                f((i0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
