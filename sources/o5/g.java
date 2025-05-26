package o5;

import he.n;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.g1;
import lh0.y0;
import lh0.z0;
import lh0.z3;
import qd.l;

/* loaded from: classes.dex */
public abstract class g implements dc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92901a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f92902b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f92901a = i13;
        this.f92902b = obj;
    }

    @Override // dc.f
    public final List b() {
        return (List) this.f92902b;
    }

    @Override // dc.f
    public final boolean c() {
        Object obj = this.f92902b;
        if (((List) obj).isEmpty()) {
            return true;
        }
        return ((List) obj).size() == 1 && ((kc.a) ((List) obj).get(0)).c();
    }

    public abstract boolean d();

    public final String e(String experimentName, z3 activate) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) ((z0) this.f92902b)).g(experimentName, activate);
    }

    public final boolean f(int i13, CharSequence charSequence) {
        if (charSequence == null || i13 < 0 || charSequence.length() - i13 < 0) {
            throw new IllegalArgumentException();
        }
        f fVar = (f) this.f92902b;
        if (fVar == null) {
            return d();
        }
        int a13 = fVar.a(i13, charSequence);
        if (a13 == 0) {
            return true;
        }
        if (a13 != 1) {
            return d();
        }
        return false;
    }

    public final void g(l lVar) {
        Object obj = this.f92902b;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(lVar);
        }
    }

    public final int h(int i13, String experimentName) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        z0.f83518a.getClass();
        return i(experimentName, i13, y0.f83512b);
    }

    public final int i(String experimentName, int i13, z3 activate) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(activate, "activate");
        String groupName = ((g1) ((z0) this.f92902b)).g(experimentName, activate);
        if (groupName == null) {
            return i13;
        }
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        int M = StringsKt.M(groupName, '_', 0, 6);
        Integer num = null;
        if (M != -1 && M != groupName.length() - 1) {
            try {
                String substring = groupName.substring(M + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = Integer.parseInt(substring);
                if (parseInt >= 0) {
                    num = Integer.valueOf(parseInt);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return num != null ? num.intValue() : i13;
    }

    public final int j(String experimentName, String internalKeyword, int i13, z3 activate) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(internalKeyword, "internalKeyword");
        Intrinsics.checkNotNullParameter(activate, "activate");
        String groupName = ((g1) ((z0) this.f92902b)).g(experimentName, activate);
        if (groupName == null) {
            return i13;
        }
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(internalKeyword, "internalKeyword");
        Integer num = null;
        try {
            int L = StringsKt.L(groupName, internalKeyword.concat("_"), 0, false, 6);
            if (L != -1) {
                int length = L + internalKeyword.length() + 1;
                String substring = groupName.substring(length);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int L2 = StringsKt.L(substring, "_", 0, false, 6);
                num = Integer.valueOf(Integer.parseInt(groupName.subSequence(length, L2 == -1 ? groupName.length() : L2 + length).toString()));
            }
        } catch (Exception unused) {
        }
        return num != null ? num.intValue() : i13;
    }

    public final String toString() {
        switch (this.f92901a) {
            case 1:
                StringBuilder sb3 = new StringBuilder();
                List list = (List) this.f92902b;
                if (!list.isEmpty()) {
                    sb3.append("values=");
                    sb3.append(Arrays.toString(list.toArray()));
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public g(int i13) {
        this.f92901a = 5;
        this.f92902b = new sq0.g();
    }

    public g() {
        this.f92901a = 2;
        char[] cArr = n.f68959a;
        this.f92902b = new ArrayDeque(20);
    }

    public g(z0 experimentsActivator) {
        this.f92901a = 4;
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f92902b = experimentsActivator;
    }

    public g(u70.a tabType) {
        this.f92901a = 3;
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        this.f92902b = tabType;
    }
}
