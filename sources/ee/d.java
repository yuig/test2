package ee;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import de.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58760a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f58761b;

    public d(e eVar) {
        this.f58761b = new WeakReference(eVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        WeakReference weakReference = this.f58761b;
        switch (this.f58760a) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                e eVar = (e) weakReference.get();
                if (eVar != null) {
                    ArrayList arrayList = eVar.f58764b;
                    if (!arrayList.isEmpty()) {
                        View view = eVar.f58763a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int a13 = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int a14 = eVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((a13 > 0 || a13 == Integer.MIN_VALUE) && (a14 > 0 || a14 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((k) ((h) it.next())).p(a13, a14);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(eVar.f58765c);
                            }
                            eVar.f58765c = null;
                            arrayList.clear();
                            break;
                        }
                    }
                }
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                j jVar = (j) weakReference.get();
                if (jVar != null) {
                    ArrayList arrayList2 = jVar.f58775b;
                    if (!arrayList2.isEmpty()) {
                        View view2 = jVar.f58774a;
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int a15 = jVar.a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int a16 = jVar.a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((a15 > 0 || a15 == Integer.MIN_VALUE) && (a16 > 0 || a16 == Integer.MIN_VALUE)) {
                            Iterator it2 = new ArrayList(arrayList2).iterator();
                            while (it2.hasNext()) {
                                ((k) ((h) it2.next())).p(a15, a16);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(jVar.f58776c);
                            }
                            jVar.f58776c = null;
                            arrayList2.clear();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    public d(j jVar) {
        this.f58761b = new WeakReference(jVar);
    }
}
