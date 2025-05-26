package androidx.lifecycle;

import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18659a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18660b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18661c;

    public m(Object obj) {
        this.f18660b = obj;
        this.f18661c = d.f18606c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        int i13 = this.f18659a;
        Object obj = this.f18660b;
        Object obj2 = this.f18661c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == q.ON_START) {
                    ((s) obj).b(this);
                    ((ma.g) obj2).d();
                    break;
                }
                break;
            case 1:
                HashMap hashMap = ((b) obj2).f18584a;
                b.a((List) hashMap.get(event), source, event, obj);
                b.a((List) hashMap.get(q.ON_ANY), source, event, obj);
                break;
            default:
                za.j jVar = (za.j) obj2;
                if (!jVar.f141467e.Q()) {
                    source.getLifecycle().b(this);
                    za.k kVar = (za.k) obj;
                    if (((FrameLayout) kVar.f19717a).isAttachedToWindow()) {
                        jVar.H(kVar);
                        break;
                    }
                }
                break;
        }
    }

    public m(s sVar, ma.g gVar) {
        this.f18660b = sVar;
        this.f18661c = gVar;
    }

    public m(za.j jVar, za.k kVar) {
        this.f18661c = jVar;
        this.f18660b = kVar;
    }
}
