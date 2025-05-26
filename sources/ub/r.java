package ub;

import androidx.work.impl.WorkDatabase;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import ja.d0;
import java.util.UUID;
import kb.b0;
import kb.s0;
import kotlin.jvm.functions.Function0;
import lr.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121693d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i13) {
        this.f121690a = i13;
        this.f121691b = obj;
        this.f121692c = obj2;
        this.f121693d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f121690a;
        Object obj = this.f121693d;
        Object obj2 = this.f121692c;
        Object obj3 = this.f121691b;
        switch (i13) {
            case 0:
                s sVar = (s) obj3;
                UUID uuid = (UUID) obj2;
                kb.l lVar = (kb.l) obj;
                sVar.getClass();
                String uuid2 = uuid.toString();
                String str = s.f121694c;
                b0.e().a(str, "Updating progress for " + uuid + " (" + lVar + ")");
                WorkDatabase workDatabase = sVar.f121695a;
                workDatabase.c();
                try {
                    tb.s j13 = workDatabase.y().j(uuid2);
                    if (j13 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (j13.f117017b == s0.RUNNING) {
                        tb.m mVar = new tb.m(lVar, uuid2);
                        tb.o x13 = workDatabase.x();
                        d0 d0Var = x13.f116991a;
                        d0Var.b();
                        d0Var.c();
                        try {
                            x13.f116992b.n(mVar);
                            d0Var.r();
                            d0Var.m();
                        } catch (Throwable th3) {
                            d0Var.m();
                            throw th3;
                        }
                    } else {
                        b0.e().i(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                    }
                    workDatabase.r();
                    workDatabase.m();
                    return null;
                } finally {
                }
            case 1:
                return y.d((y) obj3, (PinterestToastContainer) obj2, (GestaltToast) obj);
            default:
                return lr.l.d((lr.l) obj3, (PinterestToastContainer) obj2, (GestaltToast) obj);
        }
    }
}
