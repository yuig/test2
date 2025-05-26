package df;

import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public TreeSet f54880a;

    public final synchronized void a(boolean z13) {
        TreeSet treeSet;
        if (!z13) {
            try {
                TreeSet treeSet2 = this.f54880a;
                if (treeSet2 != null) {
                    if (!Intrinsics.d(Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                    }
                    treeSet = this.f54880a;
                    if (treeSet != null || treeSet.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        y0 y0Var = y0.f54883a;
        TreeSet treeSet3 = null;
        if (!p001if.a.b(y0.class)) {
            try {
                treeSet3 = y0Var.f(this);
            } catch (Throwable th4) {
                p001if.a.a(y0.class, th4);
            }
        }
        this.f54880a = treeSet3;
        treeSet = this.f54880a;
        if (treeSet != null) {
        }
        e();
    }

    public abstract String b();

    public abstract String c();

    public String d() {
        return "id_token,token,signed_request,graph_domain";
    }

    public void e() {
    }
}
