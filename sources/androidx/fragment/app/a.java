package androidx.fragment.app;

import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18266a;

    /* renamed from: b, reason: collision with root package name */
    public int f18267b;

    /* renamed from: c, reason: collision with root package name */
    public int f18268c;

    /* renamed from: d, reason: collision with root package name */
    public int f18269d;

    /* renamed from: e, reason: collision with root package name */
    public int f18270e;

    /* renamed from: f, reason: collision with root package name */
    public int f18271f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18272g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18273h;

    /* renamed from: i, reason: collision with root package name */
    public String f18274i;

    /* renamed from: j, reason: collision with root package name */
    public int f18275j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f18276k;

    /* renamed from: l, reason: collision with root package name */
    public int f18277l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f18278m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f18279n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f18280o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18281p;

    /* renamed from: q, reason: collision with root package name */
    public final w0 f18282q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18283r;

    /* renamed from: s, reason: collision with root package name */
    public int f18284s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18285t;

    public a(w0 w0Var) {
        w0Var.J();
        g0 g0Var = w0Var.f18470v;
        if (g0Var != null) {
            g0Var.f18325b.getClassLoader();
        }
        this.f18266a = new ArrayList();
        this.f18273h = true;
        this.f18281p = false;
        this.f18284s = -1;
        this.f18285t = false;
        this.f18282q = w0Var;
    }

    @Override // androidx.fragment.app.t0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f18272g) {
            return true;
        }
        this.f18282q.a(this);
        return true;
    }

    public final void b(g1 g1Var) {
        this.f18266a.add(g1Var);
        g1Var.f18331d = this.f18267b;
        g1Var.f18332e = this.f18268c;
        g1Var.f18333f = this.f18269d;
        g1Var.f18334g = this.f18270e;
    }

    public final void c(String str) {
        if (!this.f18273h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f18272g = true;
        this.f18274i = str;
    }

    public final void d(int i13) {
        if (this.f18272g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i13);
            }
            int size = this.f18266a.size();
            for (int i14 = 0; i14 < size; i14++) {
                g1 g1Var = (g1) this.f18266a.get(i14);
                Fragment fragment = g1Var.f18329b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i13;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + g1Var.f18329b + " to " + g1Var.f18329b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int e(boolean z13) {
        if (this.f18283r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new r1());
            h(printWriter);
            printWriter.close();
        }
        this.f18283r = true;
        boolean z14 = this.f18272g;
        w0 w0Var = this.f18282q;
        if (z14) {
            this.f18284s = w0Var.d();
        } else {
            this.f18284s = -1;
        }
        w0Var.y(this, z13);
        return this.f18284s;
    }

    public final void f() {
        if (this.f18272g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f18273h = false;
        this.f18282q.B(this, false);
    }

    public final void g(int i13, Fragment fragment, String str, int i14) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            m6.c.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i13 != 0) {
            if (i13 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i15 = fragment.mFragmentId;
            if (i15 != 0 && i15 != i13) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i13);
            }
            fragment.mFragmentId = i13;
            fragment.mContainerId = i13;
        }
        b(new g1(fragment, i14));
        fragment.mFragmentManager = this.f18282q;
    }

    public final void h(PrintWriter printWriter) {
        i("  ", printWriter, true);
    }

    public final void i(String str, PrintWriter printWriter, boolean z13) {
        String str2;
        if (z13) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18274i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f18284s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f18283r);
            if (this.f18271f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f18271f));
            }
            if (this.f18267b != 0 || this.f18268c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18267b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18268c));
            }
            if (this.f18269d != 0 || this.f18270e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18269d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18270e));
            }
            if (this.f18275j != 0 || this.f18276k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18275j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f18276k);
            }
            if (this.f18277l != 0 || this.f18278m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18277l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f18278m);
            }
        }
        if (this.f18266a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f18266a.size();
        for (int i13 = 0; i13 < size; i13++) {
            g1 g1Var = (g1) this.f18266a.get(i13);
            switch (g1Var.f18328a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + g1Var.f18328a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i13);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(g1Var.f18329b);
            if (z13) {
                if (g1Var.f18331d != 0 || g1Var.f18332e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(g1Var.f18331d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(g1Var.f18332e));
                }
                if (g1Var.f18333f != 0 || g1Var.f18334g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(g1Var.f18333f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(g1Var.f18334g));
                }
            }
        }
    }

    public final void j() {
        for (int size = this.f18266a.size() - 1; size >= 0; size--) {
            g1 g1Var = (g1) this.f18266a.get(size);
            Fragment fragment = g1Var.f18329b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f18285t;
                fragment.setPopDirection(true);
                int i13 = this.f18271f;
                int i14 = 8194;
                int i15 = 4097;
                if (i13 != 4097) {
                    if (i13 != 8194) {
                        i14 = 4100;
                        i15 = 8197;
                        if (i13 != 8197) {
                            if (i13 == 4099) {
                                i14 = 4099;
                            } else if (i13 != 4100) {
                                i14 = 0;
                            }
                        }
                    }
                    i14 = i15;
                }
                fragment.setNextTransition(i14);
                fragment.setSharedElementNames(this.f18280o, this.f18279n);
            }
            int i16 = g1Var.f18328a;
            w0 w0Var = this.f18282q;
            switch (i16) {
                case 1:
                    fragment.setAnimations(g1Var.f18331d, g1Var.f18332e, g1Var.f18333f, g1Var.f18334g);
                    w0Var.f0(fragment, true);
                    w0Var.Y(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + g1Var.f18328a);
                case 3:
                    fragment.setAnimations(g1Var.f18331d, g1Var.f18332e, g1Var.f18333f, g1Var.f18334g);
                    w0Var.b(fragment);
                    break;
                case 4:
                    fragment.setAnimations(g1Var.f18331d, g1Var.f18332e, g1Var.f18333f, g1Var.f18334g);
                    w0Var.getClass();
                    w0.j0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(g1Var.f18331d, g1Var.f18332e, g1Var.f18333f, g1Var.f18334g);
                    w0Var.f0(fragment, true);
                    w0Var.L(fragment);
                    break;
                case 6:
                    fragment.setAnimations(g1Var.f18331d, g1Var.f18332e, g1Var.f18333f, g1Var.f18334g);
                    w0Var.f(fragment);
                    break;
                case 7:
                    fragment.setAnimations(g1Var.f18331d, g1Var.f18332e, g1Var.f18333f, g1Var.f18334g);
                    w0Var.f0(fragment, true);
                    w0Var.j(fragment);
                    break;
                case 8:
                    w0Var.h0(null);
                    break;
                case 9:
                    w0Var.h0(fragment);
                    break;
                case 10:
                    w0Var.g0(fragment, g1Var.f18335h);
                    break;
            }
        }
    }

    public final void k(Fragment fragment) {
        w0 w0Var = fragment.mFragmentManager;
        if (w0Var == null || w0Var == this.f18282q) {
            b(new g1(fragment, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void l(int i13, Fragment fragment, String str) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i13, fragment, str, 2);
    }

    public final void m(int i13, int i14, int i15, int i16) {
        this.f18267b = i13;
        this.f18268c = i14;
        this.f18269d = i15;
        this.f18270e = i16;
    }

    public final void n(Fragment fragment, androidx.lifecycle.r rVar) {
        w0 w0Var = fragment.mFragmentManager;
        w0 w0Var2 = this.f18282q;
        if (w0Var != w0Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + w0Var2);
        }
        if (rVar == androidx.lifecycle.r.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + rVar + " after the Fragment has been created");
        }
        if (rVar == androidx.lifecycle.r.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + rVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        g1 g1Var = new g1();
        g1Var.f18328a = 10;
        g1Var.f18329b = fragment;
        g1Var.f18330c = false;
        g1Var.f18335h = fragment.mMaxState;
        g1Var.f18336i = rVar;
        b(g1Var);
    }

    public final void o(Fragment fragment) {
        w0 w0Var;
        if (fragment == null || (w0Var = fragment.mFragmentManager) == null || w0Var == this.f18282q) {
            b(new g1(fragment, 8));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final Fragment p(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f18266a.size() - 1; size >= 0; size--) {
            g1 g1Var = (g1) this.f18266a.get(size);
            int i13 = g1Var.f18328a;
            if (i13 != 1) {
                if (i13 != 3) {
                    switch (i13) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = g1Var.f18329b;
                            break;
                        case 10:
                            g1Var.f18336i = g1Var.f18335h;
                            break;
                    }
                }
                arrayList.add(g1Var.f18329b);
            }
            arrayList.remove(g1Var.f18329b);
        }
        return fragment;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append("BackStackEntry{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f18284s >= 0) {
            sb3.append(" #");
            sb3.append(this.f18284s);
        }
        if (this.f18274i != null) {
            sb3.append(" ");
            sb3.append(this.f18274i);
        }
        sb3.append("}");
        return sb3.toString();
    }

    public a(a aVar) {
        aVar.f18282q.J();
        g0 g0Var = aVar.f18282q.f18470v;
        if (g0Var != null) {
            g0Var.f18325b.getClassLoader();
        }
        this.f18266a = new ArrayList();
        this.f18273h = true;
        this.f18281p = false;
        Iterator it = aVar.f18266a.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            ArrayList arrayList = this.f18266a;
            g1 g1Var2 = new g1();
            g1Var2.f18328a = g1Var.f18328a;
            g1Var2.f18329b = g1Var.f18329b;
            g1Var2.f18330c = g1Var.f18330c;
            g1Var2.f18331d = g1Var.f18331d;
            g1Var2.f18332e = g1Var.f18332e;
            g1Var2.f18333f = g1Var.f18333f;
            g1Var2.f18334g = g1Var.f18334g;
            g1Var2.f18335h = g1Var.f18335h;
            g1Var2.f18336i = g1Var.f18336i;
            arrayList.add(g1Var2);
        }
        this.f18267b = aVar.f18267b;
        this.f18268c = aVar.f18268c;
        this.f18269d = aVar.f18269d;
        this.f18270e = aVar.f18270e;
        this.f18271f = aVar.f18271f;
        this.f18272g = aVar.f18272g;
        this.f18273h = aVar.f18273h;
        this.f18274i = aVar.f18274i;
        this.f18277l = aVar.f18277l;
        this.f18278m = aVar.f18278m;
        this.f18275j = aVar.f18275j;
        this.f18276k = aVar.f18276k;
        if (aVar.f18279n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f18279n = arrayList2;
            arrayList2.addAll(aVar.f18279n);
        }
        if (aVar.f18280o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f18280o = arrayList3;
            arrayList3.addAll(aVar.f18280o);
        }
        this.f18281p = aVar.f18281p;
        this.f18284s = -1;
        this.f18285t = false;
        this.f18282q = aVar.f18282q;
        this.f18283r = aVar.f18283r;
        this.f18284s = aVar.f18284s;
        this.f18285t = aVar.f18285t;
    }
}
