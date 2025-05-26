package at1;

import android.content.ContextWrapper;
import android.os.Handler;
import android.util.SparseArray;
import androidx.appcompat.widget.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class i extends ContextWrapper implements j {

    /* renamed from: a, reason: collision with root package name */
    public ExecutorService f20459a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f20460b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f20461c;

    /* renamed from: d, reason: collision with root package name */
    public int f20462d;

    public final void a(int i13, h hVar, boolean z13) {
        ExecutorService executorService;
        if (this.f20460b == null) {
            this.f20460b = new Handler(getMainLooper());
        }
        if ((this.f20462d & i13) == i13) {
            hVar.onResourcesReady(i13);
            return;
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f20461c;
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            f fVar = (f) sparseArray.valueAt(i14);
            fVar.f20455a.getClass();
            if ((i13 & 1) == 1 && fVar.f20456b == null) {
                arrayList.add(fVar);
            }
        }
        int size2 = arrayList.size();
        CountDownLatch countDownLatch = new CountDownLatch(size2);
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            executorService = this.f20459a;
            if (!hasNext) {
                break;
            }
            f fVar2 = (f) it.next();
            Handler handler = this.f20460b;
            if (fVar2.f20457c != null) {
                if (fVar2.f20458d == null) {
                    fVar2.f20458d = new ArrayList();
                }
                fVar2.f20458d.add(countDownLatch);
            } else {
                fVar2.f20455a.getClass();
                fVar2.f20456b = null;
                fVar2.f20457c = executorService.submit(new e(fVar2, handler, countDownLatch, hVar, this));
            }
        }
        executorService.submit(new m0(this, countDownLatch, hVar, i13, 1));
        if (size2 == 0) {
            if (z13) {
                throw new RuntimeException("Internal Error! _resourcesReady does not match the actual state of resources");
            }
            if (hVar.onResourcesError("Internal Error! _resourcesReady does not match the actual state of resources")) {
                this.f20462d = i13 | this.f20462d;
            }
        }
    }
}
