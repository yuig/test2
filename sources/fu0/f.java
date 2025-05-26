package fu0;

import android.view.View;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62986i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationBaseDragger f62987j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(IdeaPinCreationBaseDragger ideaPinCreationBaseDragger, int i13) {
        super(0);
        this.f62986i = i13;
        this.f62987j = ideaPinCreationBaseDragger;
    }

    public final View b() {
        int i13 = this.f62986i;
        IdeaPinCreationBaseDragger ideaPinCreationBaseDragger = this.f62987j;
        switch (i13) {
            case 0:
                return ideaPinCreationBaseDragger.a().findViewById(aq1.d.bottom_border);
            case 1:
                View findViewById = ideaPinCreationBaseDragger.a().findViewById(aq1.d.left_dragger);
                findViewById.setOnTouchListener(ideaPinCreationBaseDragger.f46437o);
                return findViewById;
            case 2:
                View findViewById2 = ideaPinCreationBaseDragger.a().findViewById(aq1.d.right_dragger);
                findViewById2.setOnTouchListener(ideaPinCreationBaseDragger.f46438p);
                return findViewById2;
            default:
                return ideaPinCreationBaseDragger.a().findViewById(aq1.d.top_border);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f62986i) {
        }
        return b();
    }
}
