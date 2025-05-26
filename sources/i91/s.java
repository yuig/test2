package i91;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.sendapin.model.SendableObject;
import h32.d4;
import h32.f1;

/* loaded from: classes5.dex */
public final class s implements g91.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f71895a;

    /* renamed from: b, reason: collision with root package name */
    public final SendableObject f71896b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f71897c;

    /* renamed from: d, reason: collision with root package name */
    public final p32.c f71898d;

    /* renamed from: e, reason: collision with root package name */
    public final so.v f71899e;

    /* renamed from: f, reason: collision with root package name */
    public final ll.j f71900f;

    /* renamed from: g, reason: collision with root package name */
    public final z f71901g;

    /* renamed from: h, reason: collision with root package name */
    public final e82.h0 f71902h;

    public s(Context context, SendableObject sendableObject, nx.d0 d0Var, p32.c cVar, so.v vVar, ll.j jVar, z zVar, e82.h0 h0Var) {
        this.f71895a = context;
        this.f71896b = sendableObject;
        this.f71897c = d0Var;
        this.f71898d = cVar;
        this.f71899e = vVar;
        this.f71900f = jVar;
        this.f71901g = zVar;
        this.f71902h = h0Var;
    }

    @Override // g91.d
    public final void a(View view, String str) {
        ig1.b.N0(view);
        e0.t.f56752j = true;
        boolean N = pk.a0.N(str, "pincode");
        SendableObject sendableObject = this.f71896b;
        if (N) {
            this.f71900f.z(sendableObject);
            return;
        }
        boolean N2 = pk.a0.N(str, "copy_link");
        p32.c cVar = this.f71898d;
        Context context = this.f71895a;
        if (!N2) {
            this.f71902h.m(context, sendableObject, str, cVar);
            b(str);
            this.f71901g.a(str);
        } else {
            ig1.b.w(context, sendableObject, cVar, this.f71899e);
            if (sendableObject.g()) {
                b(str);
            }
        }
    }

    public final void b(String str) {
        d4 d4Var = d4.SEND_SHARE;
        h32.g0 g0Var = h32.g0.SEND_SHARE;
        this.f71902h.getClass();
        SendableObject sendableObject = this.f71896b;
        this.f71897c.t(new h32.i0(d4Var, null, null, g0Var, null, e82.h0.c(sendableObject, str)), null, null, f1.TAP, sendableObject.d(), null, false);
    }
}
