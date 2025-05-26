package gb1;

import android.content.Context;
import com.pinterest.feature.settings.notifications.view.NotificationSettingsItemToggleGroupView;
import com.pinterest.feature.settings.notifications.view.NotificationSettingsItemTwoLevelView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f64680j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f64681k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, c cVar, int i13) {
        super(0);
        this.f64679i = i13;
        this.f64680j = context;
        this.f64681k = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f64679i;
        c cVar = this.f64681k;
        switch (i13) {
            case 0:
                return new NotificationSettingsItemToggleGroupView(this.f64680j, null, 0, cVar.f64686x0, 6);
            default:
                return new NotificationSettingsItemTwoLevelView(this.f64680j, null, 0, cVar.f64686x0, 6);
        }
    }
}
