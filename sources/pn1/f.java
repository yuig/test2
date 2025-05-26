package pn1;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.gestalt.tabs.GestaltTab;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100754i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTab f100755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GestaltTab gestaltTab, int i13) {
        super(1);
        this.f100754i = i13;
        this.f100755j = gestaltTab;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppCompatImageView appCompatImageView;
        int i13 = this.f100754i;
        GestaltTab gestaltTab = this.f100755j;
        switch (i13) {
            case 0:
                ((Boolean) obj).getClass();
                TextView textView = gestaltTab.f49627c;
                if (textView != null) {
                    textView.setTextColor(gestaltTab.T().f100741g ? dl2.b.y0(gestaltTab, eo1.a.base_color_grayscale_0) : dl2.b.y0(gestaltTab, eo1.a.comp_tabs_text_color));
                    return Unit.f80348a;
                }
                Intrinsics.r("text");
                throw null;
            default:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (j1.c1((g92.d) gestaltTab.f49626b.getValue())) {
                    TextView textView2 = gestaltTab.f49627c;
                    if (textView2 == null) {
                        Intrinsics.r("text");
                        throw null;
                    }
                    textView2.setTextSize(0, dl2.b.E0(gestaltTab, it.getTextSize()));
                    if (it == c.LARGE && (appCompatImageView = gestaltTab.f49629e) != null) {
                        appCompatImageView.setVisibility(8);
                    }
                }
                return Unit.f80348a;
        }
    }
}
