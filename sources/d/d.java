package d;

import a8.q;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import androidx.activity.h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.q0;
import androidx.recyclerview.widget.y2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.c0;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import g.e;
import g0.m;
import g0.r;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import jq1.n;
import kh2.a1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import r4.i;
import s.j;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53480b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f53481c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f53482d;

    public /* synthetic */ d(Object obj, int i13, Object obj2, int i14) {
        this.f53479a = i14;
        this.f53482d = obj;
        this.f53480b = i13;
        this.f53481c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.a aVar;
        i iVar;
        ArrayList arrayList;
        int decrementAndGet;
        l2 l2Var;
        View z13;
        int i13 = this.f53479a;
        int i14 = 1;
        Object obj = this.f53481c;
        Object obj2 = this.f53482d;
        int i15 = this.f53480b;
        switch (i13) {
            case 1:
                h hVar = (h) obj2;
                Object obj3 = ((q) obj).f1449a;
                String str = (String) hVar.f63171a.get(Integer.valueOf(i15));
                if (str == null) {
                    return;
                }
                e eVar = (e) hVar.f63175e.get(str);
                if (eVar == null || (aVar = eVar.f63167a) == null) {
                    hVar.f63177g.remove(str);
                    hVar.f63176f.put(str, obj3);
                    return;
                } else {
                    if (hVar.f63174d.remove(str)) {
                        aVar.c(obj3);
                        return;
                    }
                    return;
                }
            case 2:
                ((h) obj2).a(i15, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 3:
                ((j) obj2).f110276b.onNavigationEvent(i15, (Bundle) obj);
                return;
            case 4:
                r rVar = (r) obj2;
                c0 c0Var = (c0) obj;
                AtomicInteger atomicInteger = rVar.f63221d;
                ArrayList arrayList2 = rVar.f63219b;
                c0 c0Var2 = rVar.f63222e;
                boolean isDone = c0Var2.isDone();
                boolean z14 = rVar.f63220c;
                if (isDone || arrayList2 == null) {
                    com.bumptech.glide.d.v("Future was done before all dependencies completed", z14);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                com.bumptech.glide.d.v("Tried to set value from future which is not done", c0Var.isDone());
                                arrayList2.set(i15, m.d(c0Var));
                                decrementAndGet = atomicInteger.decrementAndGet();
                                com.bumptech.glide.d.v("Less than 0 remaining futures", decrementAndGet >= 0);
                            } catch (CancellationException unused) {
                                if (z14) {
                                    rVar.cancel(false);
                                }
                                int decrementAndGet2 = atomicInteger.decrementAndGet();
                                com.bumptech.glide.d.v("Less than 0 remaining futures", decrementAndGet2 >= 0);
                                if (decrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList3 = rVar.f63219b;
                                if (arrayList3 != null) {
                                    iVar = rVar.f63223f;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            } catch (RuntimeException e13) {
                                if (z14) {
                                    rVar.f63223f.d(e13);
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                com.bumptech.glide.d.v("Less than 0 remaining futures", decrementAndGet3 >= 0);
                                if (decrementAndGet3 != 0) {
                                    return;
                                }
                                ArrayList arrayList4 = rVar.f63219b;
                                if (arrayList4 != null) {
                                    iVar = rVar.f63223f;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                        } catch (Error e14) {
                            rVar.f63223f.d(e14);
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            com.bumptech.glide.d.v("Less than 0 remaining futures", decrementAndGet4 >= 0);
                            if (decrementAndGet4 != 0) {
                                return;
                            }
                            ArrayList arrayList5 = rVar.f63219b;
                            if (arrayList5 != null) {
                                iVar = rVar.f63223f;
                                arrayList = new ArrayList(arrayList5);
                            }
                        }
                    } catch (ExecutionException e15) {
                        if (z14) {
                            rVar.f63223f.d(e15.getCause());
                        }
                        int decrementAndGet5 = atomicInteger.decrementAndGet();
                        com.bumptech.glide.d.v("Less than 0 remaining futures", decrementAndGet5 >= 0);
                        if (decrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = rVar.f63219b;
                        if (arrayList6 != null) {
                            iVar = rVar.f63223f;
                            arrayList = new ArrayList(arrayList6);
                        }
                    }
                    if (decrementAndGet == 0) {
                        ArrayList arrayList7 = rVar.f63219b;
                        if (arrayList7 != null) {
                            iVar = rVar.f63223f;
                            arrayList = new ArrayList(arrayList7);
                            iVar.b(arrayList);
                            return;
                        }
                        com.bumptech.glide.d.v(null, c0Var2.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    int decrementAndGet6 = atomicInteger.decrementAndGet();
                    com.bumptech.glide.d.v("Less than 0 remaining futures", decrementAndGet6 >= 0);
                    if (decrementAndGet6 == 0) {
                        ArrayList arrayList8 = rVar.f63219b;
                        if (arrayList8 != null) {
                            rVar.f63223f.b(new ArrayList(arrayList8));
                        } else {
                            com.bumptech.glide.d.v(null, c0Var2.isDone());
                        }
                    }
                    throw th3;
                }
            case 5:
            default:
                VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = (VersionSafeCallbacks$UrlRequestStatusListener) obj;
                switch (i15) {
                    case 0:
                        i14 = 0;
                        break;
                    case 1:
                        break;
                    case 2:
                        i14 = 2;
                        break;
                    case 3:
                        i14 = 3;
                        break;
                    case 4:
                        i14 = 4;
                        break;
                    case 5:
                    default:
                        throw new IllegalArgumentException("No request status found.");
                    case 6:
                        i14 = 5;
                        break;
                    case 7:
                        i14 = 6;
                        break;
                    case 8:
                        i14 = 7;
                        break;
                    case 9:
                        i14 = 8;
                        break;
                    case 10:
                        i14 = 9;
                        break;
                    case 11:
                        i14 = 10;
                        break;
                    case 12:
                        i14 = 11;
                        break;
                    case 13:
                        i14 = 12;
                        break;
                    case 14:
                        i14 = 13;
                        break;
                    case 15:
                        i14 = 14;
                        break;
                }
                versionSafeCallbacks$UrlRequestStatusListener.onStatus(i14);
                return;
            case 6:
                ((a1) obj).l0(i15);
                return;
            case 7:
                q0 q0Var = (q0) obj2;
                RecyclerView recyclerView = q0Var.f19585q;
                if (recyclerView == null || !recyclerView.f19252s) {
                    return;
                }
                l0 l0Var = (l0) obj;
                if (l0Var.f19484k) {
                    return;
                }
                y2 viewHolder = l0Var.f19478e;
                if (viewHolder.j() != -1) {
                    g2 g2Var = q0Var.f19585q.M;
                    if (g2Var == null || !g2Var.l()) {
                        ArrayList arrayList9 = q0Var.f19584p;
                        int size = arrayList9.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            if (((l0) arrayList9.get(i16)).f19485l) {
                            }
                        }
                        ((ar0.c) q0Var.f19581m).getClass();
                        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                        return;
                    }
                    q0Var.f19585q.post(this);
                    return;
                }
                return;
            case 8:
                ((nb.i) obj).a((Intent) obj2, i15);
                return;
            case 9:
                int i17 = BottomSheetBehavior.f32289g0;
                ((BottomSheetBehavior) obj2).a0((View) obj, i15, false);
                return;
            case 10:
                PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) obj2;
                RecyclerView recyclerView2 = pdpCloseupCarouselView.getPinterestRecyclerView().f52531a;
                if (recyclerView2 == null || (l2Var = recyclerView2.f19242n) == null || (z13 = l2Var.z(i15)) == null) {
                    return;
                }
                int[] c13 = pdpCloseupCarouselView.f35068y.c(l2Var, z13);
                if (c13[0] == 0 && c13[1] == 0) {
                    return;
                }
                pdpCloseupCarouselView.getPinterestRecyclerView().f52531a.scrollBy(c13[0], c13[1]);
                return;
            case 11:
                ui0.e.U8((ui0.e) obj2, i15);
                return;
            case 12:
                n.C9((n) obj2, i15);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i13, int i14) {
        this.f53479a = i14;
        this.f53481c = obj;
        this.f53482d = obj2;
        this.f53480b = i13;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i13, int i14, int i15) {
        this.f53479a = i14;
        this.f53482d = obj;
        this.f53481c = obj2;
        this.f53480b = i13;
    }
}
