package u81;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.mediagallery.view.MediaDirectoryView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121054i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f121055j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, int i13) {
        super(0);
        this.f121054i = i13;
        this.f121055j = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f121054i;
        Context context = this.f121055j;
        switch (i13) {
            case 0:
                return new t(context);
            case 1:
                return new MediaDirectoryView(6, context, (AttributeSet) null);
            default:
                return new u(context);
        }
    }
}
