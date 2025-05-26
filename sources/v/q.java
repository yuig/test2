package v;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f123602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f123603c;

    public /* synthetic */ q(d0 d0Var, ArrayList arrayList, int i13) {
        this.f123601a = i13;
        this.f123602b = d0Var;
        this.f123603c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.d dVar;
        switch (this.f123601a) {
            case 0:
                List list = this.f123603c;
                d0 d0Var = this.f123602b;
                n nVar = d0Var.f123403h;
                try {
                    d0Var.H(list);
                    return;
                } finally {
                    nVar.o();
                }
            default:
                d0 d0Var2 = this.f123602b;
                List<b> list2 = this.f123603c;
                d0Var2.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z13 = false;
                for (b bVar : list2) {
                    if (d0Var2.f123396a.e(bVar.f123351a)) {
                        d0Var2.f123396a.f16995b.remove(bVar.f123351a);
                        arrayList.add(bVar.f123351a);
                        if (bVar.f123352b == c0.w0.class) {
                            z13 = true;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                d0Var2.t("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera", null);
                if (z13) {
                    d0Var2.f123403h.f123552h.getClass();
                }
                d0Var2.p();
                if (d0Var2.f123396a.d().isEmpty()) {
                    d0Var2.f123403h.f123556l.f123480c = false;
                } else {
                    d0Var2.L();
                }
                if (!d0Var2.f123396a.c().isEmpty()) {
                    d0Var2.K();
                    d0Var2.D();
                    if (d0Var2.f123400e == z.OPENED) {
                        d0Var2.B();
                        return;
                    }
                    return;
                }
                d0Var2.f123403h.o();
                d0Var2.D();
                d0Var2.f123403h.w(false);
                d0Var2.f123408m = d0Var2.z();
                d0Var2.t("Closing camera.", null);
                switch (d0Var2.f123400e.ordinal()) {
                    case 3:
                        com.bumptech.glide.d.v(null, d0Var2.f123406k == null);
                        d0Var2.E(z.INITIALIZED);
                        return;
                    case 4:
                    default:
                        d0Var2.t("close() ignored due to being in state: " + d0Var2.f123400e, null);
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (d0Var2.f123404i.a() || ((dVar = (androidx.appcompat.app.d) d0Var2.H.f31594b) != null && !((AtomicBoolean) dVar.f15967c).get())) {
                            r3 = true;
                        }
                        d0Var2.H.o();
                        d0Var2.E(z.CLOSING);
                        if (r3) {
                            com.bumptech.glide.d.v(null, d0Var2.f123409n.isEmpty());
                            d0Var2.r();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        d0Var2.E(z.CLOSING);
                        d0Var2.q();
                        return;
                }
        }
    }
}
