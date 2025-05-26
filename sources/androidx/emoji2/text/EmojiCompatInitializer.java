package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.s;
import androidx.lifecycle.z;
import h6.a0;
import h6.m;
import h6.n;
import h6.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ra.a;
import ra.b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // ra.b
    public final /* bridge */ /* synthetic */ Object a(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    @Override // ra.b
    public final List b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final void c(Context context) {
        Object obj;
        q qVar = new q();
        qVar.f67746a = context.getApplicationContext();
        a0 a0Var = new a0(qVar);
        a0Var.f67720b = 1;
        if (m.f67728k == null) {
            synchronized (m.f67727j) {
                try {
                    if (m.f67728k == null) {
                        m.f67728k = new m(a0Var);
                    }
                } finally {
                }
            }
        }
        a c13 = a.c(context);
        c13.getClass();
        synchronized (a.f106886e) {
            try {
                obj = c13.f106887a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c13.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        s lifecycle = ((z) obj).getLifecycle();
        lifecycle.a(new n(this, lifecycle));
    }
}
