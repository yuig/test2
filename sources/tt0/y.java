package tt0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarButtonView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f119231j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i13) {
        super(0);
        this.f119230i = i13;
        this.f119231j = zVar;
    }

    public final ImageView b() {
        int i13 = this.f119230i;
        z zVar = this.f119231j;
        switch (i13) {
            case 2:
                Object value = zVar.f119236a.f45915a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return (ImageView) value;
            case 3:
            default:
                Object value2 = zVar.f119236a.f45919e.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                return (ImageView) value2;
            case 4:
                Object value3 = zVar.f119236a.f45916b.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                return (ImageView) value3;
        }
    }

    public final CameraSidebarButtonView e() {
        int i13 = this.f119230i;
        z zVar = this.f119231j;
        switch (i13) {
            case 1:
                return zVar.f119237b.b();
            case 2:
            case 4:
            default:
                return zVar.f119237b.e();
            case 3:
                return zVar.f119237b.c();
            case 5:
                return zVar.f119237b.d();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119230i;
        z zVar = this.f119231j;
        switch (i13) {
            case 0:
                Object value = zVar.f119236a.f45920f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return (GestaltText) value;
            case 1:
                return e();
            case 2:
                return b();
            case 3:
                return e();
            case 4:
                return b();
            case 5:
                return e();
            case 6:
                Object value2 = zVar.f119236a.f45917c.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                return (FrameLayout) value2;
            case 7:
                return b();
            case 8:
                Object value3 = zVar.f119236a.f45918d.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                return (View) value3;
            default:
                return e();
        }
    }
}
