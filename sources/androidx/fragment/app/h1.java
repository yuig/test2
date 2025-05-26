package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f18342a = new m1();

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f18343b;

    static {
        o1 o1Var;
        try {
            o1Var = (o1) ua.u.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o1Var = null;
        }
        f18343b = o1Var;
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean z13, g1.g sharedElements) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z13) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    public static final void b(g1.g gVar, g1.g namedViews) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int i13 = gVar.f63294c;
        while (true) {
            i13--;
            if (-1 >= i13) {
                return;
            }
            if (!namedViews.containsKey((String) gVar.j(i13))) {
                gVar.h(i13);
            }
        }
    }

    public static final void c(int i13, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i13);
        }
    }
}
