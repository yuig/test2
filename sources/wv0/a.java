package wv0;

import ak2.f;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import gb2.i;
import kotlin.jvm.functions.Function1;
import uj2.f0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f131152b;

    public /* synthetic */ a(int i13, Function1 function1) {
        this.f131151a = i13;
        this.f131152b = function1;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        i registerUiUpdates$lambda$46;
        int i13 = this.f131151a;
        Function1 function1 = this.f131152b;
        switch (i13) {
            case 20:
                registerUiUpdates$lambda$46 = PinCloseupPresenter.registerUiUpdates$lambda$46(function1, obj);
                break;
        }
        return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
    }
}
