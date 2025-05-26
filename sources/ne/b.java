package ne;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import qe.h;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f90434a = new b();

    public static final ArrayList a(View view) {
        if (p001if.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup h10 = h.h(view);
            if (h10 != null) {
                Iterator it = h.a(h10).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f90434a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
            return null;
        }
    }

    public static final ArrayList b(View view) {
        if (p001if.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            arrayList.add(h.g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    Object[] array = new Regex("/").f(0, resourceName).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
            return null;
        }
    }

    public static final boolean d(ArrayList indicators, ArrayList keys) {
        if (p001if.a.b(b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                b bVar = f90434a;
                if (!p001if.a.b(bVar)) {
                    try {
                        Iterator it2 = keys.iterator();
                        while (it2.hasNext()) {
                            if (StringsKt.E(str, (String) it2.next(), false)) {
                                return true;
                            }
                        }
                    } catch (Throwable th3) {
                        p001if.a.a(bVar, th3);
                    }
                }
            }
            return false;
        } catch (Throwable th4) {
            p001if.a.a(b.class, th4);
            return false;
        }
    }

    public final ArrayList c(View view) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator it = h.a(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if (obj.length() > 0 && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
