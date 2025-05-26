package qv1;

import androidx.recyclerview.widget.RecyclerView;
import ar0.o;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneBarContainer f105249c;

    public d(OneBarContainer oneBarContainer) {
        this.f105249c = oneBarContainer;
    }

    @Override // ar0.o
    public final void k(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ArrayList arrayList = this.f105249c.f49981e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ov1.b) it.next()).z1();
            }
        }
    }

    @Override // ar0.o
    public final void l(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.l(recyclerView, i13, i14);
        ArrayList arrayList = this.f105249c.f49981e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ov1.b) it.next()).onScrollStarted();
            }
        }
    }
}
