package m92;

import android.view.View;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import kg.n;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import sp2.k;

/* loaded from: classes4.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f86745a;

    public a(d dVar) {
        this.f86745a = dVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(we0.b bVar) {
        d dVar = this.f86745a;
        int childCount = dVar.getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = dVar.getChildAt(i13);
            if (childAt.getTag().equals(bVar.f129244a)) {
                dVar.removeView(childAt);
                i13--;
                childCount--;
            }
            i13++;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(b bVar) {
        d dVar = this.f86745a;
        int childCount = dVar.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = dVar.getChildAt(i13);
            if (childAt == null) {
                return;
            }
            if (childAt.getTag() instanceof we0.a) {
                dVar.f(childAt);
                n.a(childAt);
                PinterestToastContainer.g(childAt);
            }
        }
        dVar.f86748e.clear();
    }
}
