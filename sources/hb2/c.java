package hb2;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68543i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerContainerView f68544j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BaseRecyclerContainerView baseRecyclerContainerView, int i13) {
        super(0);
        this.f68543i = i13;
        this.f68544j = baseRecyclerContainerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f68543i;
        BaseRecyclerContainerView baseRecyclerContainerView = this.f68544j;
        switch (i13) {
            case 0:
                return (LinearLayoutManager) BaseRecyclerContainerView.createLayoutManagerContract$default(baseRecyclerContainerView, 0, false, 3, null).f19650a;
            default:
                ar0.n nVar = new ar0.n(new bk.f());
                BaseRecyclerContainerView.access$addEventListeners(baseRecyclerContainerView, nVar);
                return nVar;
        }
    }
}
