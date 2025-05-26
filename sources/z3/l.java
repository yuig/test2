package z3;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f140703a = new AtomicInteger(0);

    public static final u2.q a(u2.q qVar, boolean z13, Function1 function1) {
        return qVar.j(new AppendedSemanticsElement(function1, z13));
    }
}
