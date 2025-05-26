package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class o1 {
    public static void d(List list, View view) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (list.get(i13) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        if (q5.m0.f(view) != null) {
            list.add(view);
        }
        for (int i14 = size; i14 < list.size(); i14++) {
            View view2 = (View) list.get(i14);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = viewGroup.getChildAt(i15);
                    int i16 = 0;
                    while (true) {
                        if (i16 < size) {
                            if (list.get(i16) == childAt) {
                                break;
                            } else {
                                i16++;
                            }
                        } else if (q5.m0.f(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(Rect rect, View view) {
        WeakHashMap weakHashMap = q5.v0.f102521a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public static ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            WeakHashMap weakHashMap = q5.v0.f102521a;
            arrayList2.add(q5.m0.f(view));
            q5.m0.o(view, null);
        }
        return arrayList2;
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2);

    public abstract void l(Object obj, View view, ArrayList arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void n(View view, Object obj);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, j5.d dVar, e5.k kVar);

    public final void q(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, g1.g gVar) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            WeakHashMap weakHashMap = q5.v0.f102521a;
            String f13 = q5.m0.f(view);
            arrayList4.add(f13);
            if (f13 != null) {
                q5.m0.o(view, null);
                String str = (String) gVar.get(f13);
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i14))) {
                        q5.m0.o((View) arrayList2.get(i14), f13);
                        break;
                    }
                    i14++;
                }
            }
        }
        q5.x.a(viewGroup, new n1(this, size, arrayList2, arrayList3, arrayList, arrayList4, 0));
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object t(Object obj);
}
