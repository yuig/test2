package t31;

import android.widget.FrameLayout;
import bb2.j;
import bs1.c;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.sr;
import com.pinterest.feature.profile.createdtab.scheduledpins.view.ScheduledPinsPreviewView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import vq0.h;
import yk1.n;
import zx0.d;

/* loaded from: classes5.dex */
public final class a extends h {
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        sr srVar;
        ScheduledPinsPreviewView view = (ScheduledPinsPreviewView) nVar;
        s31.a model = (s31.a) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        int i14 = model.f111055a;
        view.f47506a.i(new d(i14, 11));
        List list = model.f111056b;
        int i15 = 10;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map D = ((kg0) it.next()).D();
            String j13 = (D == null || (srVar = (sr) D.get("345x")) == null) ? null : srVar.j();
            if (j13 == null) {
                j13 = "";
            }
            arrayList.add(j13);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        List list2 = view.f47507b;
        int size = list2.size();
        int min = Math.min(size, arrayList2.size());
        for (int i16 = 0; i16 < min; i16++) {
            ((j) list2.get(i16)).V1((String) arrayList2.get(i16), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
        while (min < size) {
            ((WebImageView) list2.get(min)).clear();
            min++;
        }
        int size2 = i14 - list2.size();
        FrameLayout frameLayout = view.f47509d;
        GestaltText gestaltText = view.f47508c;
        if (size2 > 0) {
            gestaltText.i(new d(size2, i15));
            c.U1(frameLayout);
        } else {
            a0.k0(gestaltText);
            c.X0(frameLayout);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        s31.a model = (s31.a) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
