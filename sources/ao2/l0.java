package ao2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 DEFAULT = new l0("DEFAULT", 0);
    public static final l0 LAZY = new l0("LAZY", 1);
    public static final l0 ATOMIC = new l0("ATOMIC", 2);
    public static final l0 UNDISPATCHED = new l0("UNDISPATCHED", 3);

    private static final /* synthetic */ l0[] $values() {
        return new l0[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        l0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private l0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }

    public final <R, T> void invoke(@NotNull Function2<? super R, ? super bl2.c<? super T>, ? extends Object> function2, R r13, @NotNull bl2.c<? super T> completion) {
        Object invoke;
        int i13 = k0.f20169a[ordinal()];
        if (i13 == 1) {
            lb.l0.s1(function2, r13, completion);
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            bl2.c b13 = cl2.h.b(cl2.h.a(function2, r13, completion));
            xk2.q qVar = xk2.s.f135225b;
            b13.resumeWith(Unit.f80348a);
            return;
        }
        if (i13 != 3) {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        Intrinsics.checkNotNullParameter(completion, "completion");
        try {
            CoroutineContext context = completion.getContext();
            Object c13 = ho2.y.c(context, null);
            try {
                Intrinsics.checkNotNullParameter(completion, "frame");
                if (function2 instanceof dl2.a) {
                    dl2.b.y(2, function2);
                    invoke = function2.invoke(r13, completion);
                } else {
                    invoke = cl2.h.c(function2, r13, completion);
                }
                ho2.y.a(context, c13);
                if (invoke != cl2.a.COROUTINE_SUSPENDED) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    completion.resumeWith(invoke);
                }
            } catch (Throwable th3) {
                ho2.y.a(context, c13);
                throw th3;
            }
        } catch (Throwable th4) {
            xk2.q qVar3 = xk2.s.f135225b;
            completion.resumeWith(ue.c.m(th4));
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
