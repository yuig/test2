package q5;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f102516d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f102517a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f102518b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f102519c;

    public static u0 a(View view) {
        u0 u0Var = (u0) view.getTag(b5.c.tag_unhandled_key_event_manager);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0();
        u0Var2.f102517a = null;
        u0Var2.f102518b = null;
        u0Var2.f102519c = null;
        view.setTag(b5.c.tag_unhandled_key_event_manager, u0Var2);
        return u0Var2;
    }

    public final boolean b(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.f102517a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f102516d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f102517a == null) {
                            this.f102517a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = f102516d;
                            View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f102517a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f102517a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View c13 = c(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (c13 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.f102518b == null) {
                    this.f102518b = new SparseArray();
                }
                this.f102518b.put(keyCode, new WeakReference(c13));
            }
        }
        return c13 != null;
    }

    public final View c(View view) {
        int size;
        WeakHashMap weakHashMap = this.f102517a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View c13 = c(viewGroup.getChildAt(childCount));
                    if (c13 != null) {
                        return c13;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(b5.c.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }

    public final boolean d(KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakReference weakReference2 = this.f102519c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        this.f102519c = new WeakReference(keyEvent);
        if (this.f102518b == null) {
            this.f102518b = new SparseArray();
        }
        SparseArray sparseArray = this.f102518b;
        if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view = (View) weakReference.get();
        if (view == null || !view.isAttachedToWindow() || (arrayList = (ArrayList) view.getTag(b5.c.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(size));
        throw null;
    }
}
