package fg0;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextField f62122j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f62123k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GestaltTextField gestaltTextField, String str) {
        super(1);
        this.f62121i = 2;
        this.f62123k = str;
        this.f62122j = gestaltTextField;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f62121i;
        String str = this.f62123k;
        GestaltTextField gestaltTextField = this.f62122j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = gestaltTextField.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                SpannableStringBuilder string = gp1.e.b(resources, str);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), vn1.c.DARK, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            default:
                Intrinsics.checkNotNullParameter(it, "displayState");
                Resources resources2 = gestaltTextField.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                SpannableStringBuilder string2 = gp1.e.b(resources2, str);
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new f0(string2), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62121i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            default:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.h2(this.f62123k), null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(this.f62122j.F0()), null, null, null, null, 0, 4161499);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GestaltTextField gestaltTextField, String str, int i13) {
        super(1);
        this.f62121i = i13;
        this.f62122j = gestaltTextField;
        this.f62123k = str;
    }
}
