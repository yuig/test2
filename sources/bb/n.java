package bb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* loaded from: classes3.dex */
public final class n implements ab.g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewStartUpResultBoundaryInterface f22461b;

    public n(WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        this.f22461b = webViewStartUpResultBoundaryInterface;
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList = new ArrayList();
        Iterator<Throwable> it = blockingStartUpLocations.iterator();
        while (it.hasNext()) {
            arrayList.add(new o(it.next()));
        }
        this.f22460a = arrayList;
    }

    @Override // ab.g
    public final List getBlockingStartUpLocations() {
        return this.f22460a;
    }

    @Override // ab.g
    public final Long getMaxTimePerTaskInUiThreadMillis() {
        return this.f22461b.getMaxTimePerTaskInUiThreadMillis();
    }

    @Override // ab.g
    public final Long getTotalTimeInUiThreadMillis() {
        return this.f22461b.getTotalTimeInUiThreadMillis();
    }
}
