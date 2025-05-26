package on2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public class q implements u {

    /* renamed from: d */
    public static final String f96784d = StringsKt.f0(q.class.getCanonicalName(), ".", "");

    /* renamed from: e */
    public static final c f96785e = new c("NO_LOCKS", b.f96769a);

    /* renamed from: a */
    public final t f96786a;

    /* renamed from: b */
    public final h f96787b;

    /* renamed from: c */
    public final String f96788c;

    public q(String str, t tVar) {
        ln2.k kVar = h.Oo;
        this.f96786a = tVar;
        this.f96787b = kVar;
        this.f96788c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.q.a(int):void");
    }

    public static void h(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i13 = -1;
                break;
            } else if (!stackTrace[i13].getClassName().startsWith(f96784d)) {
                break;
            } else {
                i13++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i13, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    public final l c(Function0 function0) {
        return new l(this, function0);
    }

    public final n d(Function1 function1) {
        return new n(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final m e(Function1 function1) {
        return new m(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final j f(Function0 function0) {
        return new j(this, function0);
    }

    public p g(Object obj, String str) {
        StringBuilder sb3 = new StringBuilder("Recursion detected ");
        sb3.append(str);
        sb3.append(obj == null ? "" : a.a.i("on input: ", obj));
        sb3.append(" under ");
        sb3.append(this);
        AssertionError assertionError = new AssertionError(sb3.toString());
        h(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("@");
        sb3.append(Integer.toHexString(hashCode()));
        sb3.append(" (");
        return a.a.p(sb3, this.f96788c, ")");
    }

    public q(String str) {
        this(str, new a(new ReentrantLock()));
    }
}
