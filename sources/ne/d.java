package ne;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.media3.ui.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.f;
import me.r;

/* loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final f f90439e = new f(3, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f90440f = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f90443c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f90441a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f90442b = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f90444d = new AtomicBoolean(false);

    public d(Activity activity) {
        this.f90443c = new WeakReference(activity);
    }

    public final void a(View view) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            z zVar = new z(11, view, this);
            if (p001if.a.b(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    zVar.run();
                } else {
                    this.f90442b.post(zVar);
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final void b(View view) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = StringsKt.i0(obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() == 0) {
                return;
            }
            LinkedHashSet linkedHashSet = this.f90441a;
            if (!linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap hashMap = new HashMap();
                ArrayList b13 = b.b(view);
                CopyOnWriteArraySet copyOnWriteArraySet = c.f90435d;
                Iterator it = new HashSet(c.a()).iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    String text = Intrinsics.d("r2", cVar.c()) ? new Regex("[^\\d.]").replace(lowerCase, "") : lowerCase;
                    boolean b14 = p001if.a.b(cVar);
                    String rule = cVar.f90437b;
                    if ((b14 ? null : rule).length() > 0) {
                        if (p001if.a.b(cVar)) {
                            rule = null;
                        }
                        if (!p001if.a.b(b.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(rule, "rule");
                                if (!new Regex(rule).e(text)) {
                                }
                            } catch (Throwable th3) {
                                p001if.a.a(b.class, th3);
                            }
                        }
                    }
                    if (b.d(b13, cVar.b())) {
                        f.b(hashMap, cVar.c(), text);
                    } else {
                        if (arrayList == null) {
                            arrayList = b.a(view);
                        }
                        if (b.d(arrayList, cVar.b())) {
                            f.b(hashMap, cVar.c(), text);
                        }
                    }
                }
                wc.b bVar = r.f87019b;
                wc.b.J(hashMap);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (p001if.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
