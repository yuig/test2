package mc;

import com.google.firebase.messaging.a0;
import fk2.f0;
import k1.s2;
import kk2.k;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import lb.u0;
import uk2.o;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public o f86902a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86903b;

    public final void a() {
        if (this.f86903b) {
            return;
        }
        int i13 = 1;
        this.f86903b = true;
        String a13 = n00.b.a(n00.c.RELATED_PIN_FIELDS);
        int i14 = 0;
        t r13 = new f0(new k(new u0(i13, this, a13), 1), new a0(a13, i14), null, 2).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        r13.o(new h(i14, new s2(this, 23)), new h(i13, new i2.i(11, this, a13)));
    }
}
