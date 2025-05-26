package ub;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Set;
import kb.b0;
import kotlin.jvm.internal.Intrinsics;
import lb.a1;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121669a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f121670b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f121671c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f121672d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f121673e;

    public k(lb.o processor, lb.t token, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f121672d = processor;
        this.f121673e = token;
        this.f121671c = z13;
        this.f121670b = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d2;
        a1 b13;
        switch (this.f121669a) {
            case 0:
                if (this.f121671c) {
                    lb.o oVar = (lb.o) this.f121672d;
                    lb.t tVar = (lb.t) this.f121673e;
                    int i13 = this.f121670b;
                    oVar.getClass();
                    String str = tVar.f82669a.f116981a;
                    synchronized (oVar.f82647k) {
                        b13 = oVar.b(str);
                    }
                    d2 = lb.o.d(str, b13, i13);
                } else {
                    lb.o oVar2 = (lb.o) this.f121672d;
                    lb.t tVar2 = (lb.t) this.f121673e;
                    int i14 = this.f121670b;
                    oVar2.getClass();
                    String str2 = tVar2.f82669a.f116981a;
                    synchronized (oVar2.f82647k) {
                        try {
                            if (oVar2.f82642f.get(str2) != null) {
                                b0.e().a(lb.o.f82636l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                            } else {
                                Set set = (Set) oVar2.f82644h.get(str2);
                                if (set != null && set.contains(tVar2)) {
                                    d2 = lb.o.d(str2, oVar2.b(str2), i14);
                                }
                            }
                            d2 = false;
                        } finally {
                        }
                    }
                }
                b0.e().a(b0.h("StopWorkRunnable"), "StopWorkRunnable for " + ((lb.t) this.f121673e).f82669a.f116981a + "; Processor.stopWork = " + d2);
                return;
            default:
                ((ActionMenuView) this.f121672d).setTranslationX(((BottomAppBar) this.f121673e).I(r0, this.f121670b, this.f121671c));
                return;
        }
    }

    public k(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i13, boolean z13) {
        this.f121673e = bottomAppBar;
        this.f121672d = actionMenuView;
        this.f121670b = i13;
        this.f121671c = z13;
    }
}
